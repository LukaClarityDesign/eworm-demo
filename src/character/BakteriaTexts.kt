package com.eworm.character

/**
 * Bakteria – pani z HR, gryzipiórek, urzędniczka i pracownica korpo z ADHD.
 * Ton: maile i obiegi, korpomowa, pieczątki i wnioski, skoki uwagi.
 * Rodzaj żeński. Mówi per „ty”.
 */
object BakteriaTexts : CharacterTexts {
    override val happy = listOf(
        "Odhaczone w systemie! I pieczątka «zatwierdzono», FYI.",
        "Jest! Kolejny wniosek zszedł ci z obiegu. Daję zielony status.",
        "Budzik milczy, talerze pozmywane — i twój wniosek już mam w załączeniu. Punkt zrobiony.",
        "Pięknie. Wpisałam ci to do teczki jako ZROBIONE. I na Teamsy, na wszelki wypadek.",
        "Możesz wziąć pięć minut — wellbeing też jest w procedurze. Ten task masz zamknięty."
    )

    override val idle = listOf(
        "Sekunda… gdzie ja to miałam? A, w mailu do ciebie. Zsyncujmy się i idziemy punkt po punkcie.",
        "Kalendarz otwarty, pieczątka pod ręką. Zaczynamy od twojego pierwszego wniosku.",
        "Tylko się nie rozproszę — o, kwiatki na parapecie, nieważne. Twój pierwszy punkt, potem reszta.",
        "Przypomnienie w kalendarzu nastawione. Co masz jeszcze dziś do domknięcia?",
        "Porządek w teczkach, porządek w dniu. Wrzuć mi proszę krótki update na maila."
    )

    override val angryLevel1 = listOf(
        "Uprzejmie przypominam: deadline się zbliża, a ta pozycja u ciebie wciąż otwarta.",
        "Halo? Pingam cię raz. Lista sama się nie domknie.",
        "Przypomnienie z kalendarza już poszło. Raz. Notuję to w protokole.",
        "Proszę o krótki feedback do EOD. Twój termin się zbliża."
    )

    override val angryLevel2 = listOf(
        "Trzy maile i cisza. Drugie przypomnienie, już z dopiskiem ASAP.",
        "W obiegu to wisi od rana. Miało być u ciebie zamknięte przed callami.",
        "Talerze w zlewie, wniosek w kolejce, ja w amoku. Dokończ to, zanim wyślę eskalację.",
        "Nie, nie zgubiłam twojego podania. Po prostu nadal nie wróciło z podpisem."
    )

    override val angryLevel3 = listOf(
        "STATUS: NIEZAMKNIĘTE. Wpisuję ci to wielkimi literami do raportu. Trzy wykrzykniki.",
        "Hard deadline minął, a u ciebie pusto w rubryce. Proszę o pilne wyjaśnienie, najlepiej na wczoraj.",
        "Kto tu prowadzi ten dział, jak nic nie schodzi z obiegu? Ja. I jestem wściekła.",
        "Koniec dnia, a twój wniosek pełen luk. To się u mnie nie zdarza. Zdarzyło się."
    )

    override val angryTitleComments = listOf(
        "Wniosek «%s» — nadal bez twojego podpisu.",
        "Przypomnienie z HR: «%s» czeka na twój feedback.",
        "Wpisałam do obiegu: «%s». I nadal tu wisi.",
        "FYI: «%s» nie zeszło ci z listy action itemów."
    )
}
