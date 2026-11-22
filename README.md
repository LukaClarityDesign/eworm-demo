© 2026 Bartosz Łuka / Luka Clarity Design. All rights reserved. Showcase only — no permission to copy, modify or redistribute.

# E-worm

**Status: in development.** Not published on Google Play (or any other store) yet.

E-worm is an **offline Android reminder app** with three distinct characters who react to your tasks. It is a personal project of [Luka Clarity Design (L.C.D.)](https://github.com/LukaClarityDesign) — Bartosz Łuka’s own brand, not a registered company.

This repository is a **portfolio slice**, not the complete Android Studio project: it shows the character writing, the theme API, and the automated checks for the line banks. The full application (UI, database, notifications, widget) is still being assembled.

## Concept

Most reminder apps are silent lists. E-worm is a small companion that stays on the device and talks to you in character.

You pick one of three personalities. During the day the character comments on what is done, what is waiting, and what has slipped past its deadline — from a calm nudge to a sharper reminder. The tone is deliberately different for each character, so the app never sounds like a generic notification.

The product is meant to work **without an account and without a backend**. Reminders and tasks live on the phone.

## Characters

- **Pan Robal** — a site foreman. Direct, practical, a little sarcastic. Addresses you as “ty”, and sometimes as “młody” / “facecie”.
- **Bakteria** — an HR officer, paper-pusher and corporate employee with ADHD, in one person. Feminine voice. Mails, procedures, stamps and the occasional jump of attention, then back to the list.
- **Poganiacz** — a typical Polish “Janusz” small-business owner. Time is money, invoices, clients, ZUS, “we’re like family”. Not a fantasy goblin.

Each character has its own line banks for idle, happy, and three levels of overdue-task anger, plus comments that insert the task title.

## Architecture (overview)

This is an offline-first Android app.

- Tasks, character choice and day state are stored **locally** (Room / SQLite, plus preferences).
- The core flow does **not** require a server, an account, or analytics. The app is built so that nothing in that flow is published or sent away.
- Reminders are scheduled on the device (fixed hours during the day, plus warnings before a deadline).
- There is a home-screen widget and system notifications, both in the voice of the selected character.
- Optional, user-initiated imports (local calendar, Google Tasks) may be offered later or in settings; they are not required to use the app.

This repository does **not** include the full UI, the database layer, or importers — only the character/theme slice described below.

## Stack

- Kotlin
- Jetpack Compose (Material 3)
- Android Architecture Components (ViewModel)
- Room
- Notifications and a home-screen widget

This portfolio folder is a source slice plus a Python test. It is **not** a Gradle project and does not build an APK by itself.

## What’s in this repository

```
src/character/     Character theme, text interface, and the three line banks
tests/             Checks that each bank is complete and title placeholders work
docs/SPRITES.md    Naming convention for future artwork
screenshots/       Placeholders — approved screenshots to be added
LICENSE            All rights reserved (MIT for the code only can be chosen later)
```

Run the test from the repository root:

```bash
python3 tests/test_character_texts.py
```

## Roadmap

- Finish **watermark-free** character sprites (in progress; waiting for approval) and keep them visually consistent
- Merge this source slice into the Android Studio project and build a first debug APK
- Design Bakteria and Poganiacz in the same visual style as Pan Robal
- Polish onboarding, the widget and notifications
- Store release only when the product is ready — **not current**

## Status

**In development.** Character texts and the theme API are in a reviewable state. Graphics, the full app merge and a public build are still outstanding. Please treat anything you see here as work in progress, not as a shipped product.

## Licence

All rights reserved © 2026 Bartosz Łuka / Luka Clarity Design (L.C.D.). See [LICENSE](LICENSE).

This is a showcase only. There is no open-source licence and no permission to copy, modify or redistribute.

---

## Po polsku

**E-worm** to offline’owa aplikacja przypomnień na Androida z trzema postaciami, które reagują na Twoje zadania. Projekt [Luka Clarity Design](https://github.com/LukaClarityDesign), w rozwoju — jeszcze nie jest w sklepie.

- **Pan Robal** — brygadzista: rzeczowy, trochę złośliwy.
- **Bakteria** — pani z HR, gryzipiórek i pracownica korpo z ADHD (rodzaj żeński).
- **Poganiacz** — typowy „Janusz” prywaciarz; czas to pieniądz.

Aplikacja ma działać **bez konta i bez serwera**. Zadania zostają na telefonie; w podstawowym obiegu nic nie jest wysyłane ani śledzone. To publiczne repo to wycinek na portfolio (teksty postaci, motyw, test), a nie pełny projekt z Android Studio.

Grafiki bez znaku wodnego i zrzuty ekranu zostaną dodane po akceptacji. Licencja: wszystkie prawa zastrzeżone; to wersja prezentacyjna, bez zgody na kopiowanie, zmianę ani rozpowszechnianie. L.C.D. to marka osobista / projekt własny, nie zarejestrowana firma.
