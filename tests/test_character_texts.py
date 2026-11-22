# Quick test of character line banks (no Android / JVM required).
# Run from the repository root:
#   python3 tests/test_character_texts.py
from pathlib import Path
import re, sys

ROOT = Path(__file__).resolve().parents[1]
SRC = ROOT / "src" / "character"

def extract_list(src: str, name: str) -> list[str]:
    m = re.search(rf"(?:override\s+)?val\s+{name}\s*=\s*listOf\((.*?)\)", src, re.S)
    if not m:
        raise AssertionError(f"missing list {name}")
    return re.findall(r"\"((?:\\.|[^\"])*)\"", m.group(1))

def load(path: Path):
    src = path.read_text(encoding="utf-8")
    keys = ["happy", "idle", "angryLevel1", "angryLevel2", "angryLevel3", "angryTitleComments"]
    return {k: extract_list(src, k) for k in keys}

def main() -> int:
    banks = {
        "ROBAL": load(SRC / "PanRobalTexts.kt"),
        "BAKTERIA": load(SRC / "BakteriaTexts.kt"),
        "POGANIACZ": load(SRC / "PoganiaczTexts.kt"),
    }
    errors = []
    for theme, lists in banks.items():
        for key, items in lists.items():
            if len(items) < 3:
                errors.append(f"{theme}.{key}: too few lines ({len(items)})")
            for i, s in enumerate(items):
                if not s.strip():
                    errors.append(f"{theme}.{key}[{i}] empty")
        for s in lists["angryTitleComments"]:
            if "%s" not in s:
                errors.append(f"{theme}.angryTitleComments missing %s: {s}")
            try:
                out = s % "Test zadania"
                if "Test zadania" not in out:
                    errors.append(f"{theme} format does not insert the title: {s}")
            except Exception as e:
                errors.append(f"{theme} format error {s!r}: {e}")
        print(theme, {k: len(v) for k, v in lists.items()})

    # Approved, watermark-free sprites are not in this repository yet.
    # If they are added later under res/drawable/, check the basic set.
    drawable = ROOT / "res" / "drawable"
    if drawable.is_dir() and any(drawable.glob("*.png")):
        for prefix in ("robal", "bakteria", "poganiacz"):
            for state in ("idle", "happy", "angry"):
                p = drawable / f"{prefix}_{state}_01.png"
                if not p.exists() or p.stat().st_size < 200:
                    errors.append(f"missing/too small sprite {p}")
    else:
        print("SPRITES skipped (no approved artwork in this repository yet)")

    if errors:
        print("FAIL")
        for e in errors:
            print(" -", e)
        return 1
    print("OK")
    return 0

if __name__ == "__main__":
    sys.exit(main())
