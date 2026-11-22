# Sprite naming for e-worm

Final, approved, watermark-free sprites are **not** included in this repository yet.
Recreations and source JPEGs that still carry a generator watermark are kept out on purpose.
This file only documents the naming convention so artwork can be dropped in later.

## File names

```
{prefix}_{state}_{frame}.png
```

- `prefix`: `robal` | `bakteria` | `poganiacz`
- `state`: `idle` | `happy` | `angry`
- `frame`: `01`, `02`, … (two digits)

The mapping lives in `CharacterTheme.spriteName()` (`src/character/CharacterTheme.kt`).

## Basic set (one frame per state, per character)

| Character  | Idle                 | Happy                 | Angry                 |
|------------|----------------------|-----------------------|-----------------------|
| Pan Robal  | `robal_idle_01`      | `robal_happy_01`      | `robal_angry_01`      |
| Bakteria   | `bakteria_idle_01`   | `bakteria_happy_01`   | `bakteria_angry_01`   |
| Poganiacz  | `poganiacz_idle_01`  | `poganiacz_happy_01`  | `poganiacz_angry_01`  |

## Technical target

- Transparent PNG
- Shared canvas and scale for every character
- Export without smoothing (nearest-neighbour), no watermark, no caption

Optional later: idle loops (`*_idle_02`, `*_idle_03`), extra happy frames, three anger levels (`*_angry_01`–`03`), a small notification icon, and a clearer widget crop.

When approved files exist, place them in `res/drawable/` using the names above. The test in `tests/test_character_texts.py` will then check that the basic set is present.
