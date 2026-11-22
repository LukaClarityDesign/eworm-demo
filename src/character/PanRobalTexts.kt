package com.eworm.character

/**
 * Teksty Pana Robala – brygadzista, rzeczowy, trochę złośliwy.
 * Mówi per „ty”, z „młody / facecie”.
 */
object PanRobalTexts : CharacterTexts {
    override val happy = listOf(
        "Dobra robota, tak trzymaj",
        "Kolejna cegiełka dołożona do sukcesu",
        "Tak się robi, młody",
        "Robota zrobiona, kawa na mnie",
        "Szybko i sprawnie – tak trzymaj"
    )

    override val idle = listOf(
        "Ruszamy z robotą młody",
        "Robota stygnie jak kawa",
        "Szybciej ruszymy, szybciej skończymy",
        "Co tam na liście?",
        "Czekam na ruch"
    )

    override val angryLevel1 = listOf(
        "Hej, termin się zbliża",
        "Nie śpij, robota czeka",
        "Rusz się, młody"
    )

    override val angryLevel2 = listOf(
        "Termin minął, a zadanie stoi",
        "Olałeś to? Serio?",
        "Bo zaraz brygadzista naprawdę się wkurzy."
    )

    override val angryLevel3 = listOf(
        "Kto cię szkolił, małolat, że taki babol wypuściłeś? Bo jakby nie patrzeć — ja.",
        "Odpuszczam. A miałem cię za faceta.",
        "To się nazywa robota? Ha!",
        "Za chwilę koniec dnia, a tu pusto"
    )

    override val angryTitleComments = listOf(
        "Olałeś %s.",
        "Zapomniałeś o tym: %s.",
        "Termin minął. %s."
    )
}
