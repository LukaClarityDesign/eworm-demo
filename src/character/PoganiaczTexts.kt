package com.eworm.character

/**
 * Poganiacz – typowy polski „Janusz” prywaciarz (Janusz biznesu).
 * Ton: kasa, faktura, klient, ZUS, „u mnie się pracuje”, „jesteśmy jak rodzina”.
 * Mówi per „ty”.
 */
object PoganiaczTexts : CharacterTexts {
    override val happy = listOf(
        "Interes domknięty. Kasa się zgadza, człowiek lubi takie dni.",
        "Tak się prowadzi firmę. Faktura poszła, możesz być z siebie zadowolony.",
        "Kolejna sprawa z głowy. Widzisz? U mnie jak się weźmie, to jest efekt.",
        "Czas to pieniądz — i właśnie coś wpadło do kasy.",
        "Na dziś można nawet zgasić światło w magazynie. To masz zrobione."
    )

    override val idle = listOf(
        "Roleta w górę, kasa otwarta. Nie stój, tylko bierz się za to, co na dzisiaj.",
        "Nie siedź jak na przystanku. U mnie się pracuje, nie siedzi.",
        "Zlecenia same się nie załatwią. Im wcześniej spadnie z biurka, tym wcześniej masz święty spokój.",
        "Kasa sama się nie zrobi. A ZUS i tak przyjdzie pierwszego.",
        "Ja już wszystko na swoich barkach dźwigam. Co ty masz dziś do ogarnięcia?"
    )

    override val angryLevel1 = listOf(
        "Termin się zbliża. Klient nie poczeka, a ja tym bardziej.",
        "Czas leci, a tej sprawy nadal nie ma z głowy.",
        "Przypominam w dobrej wierze, jesteśmy jak rodzina. Na razie spokojnie.",
        "Jak tak pociągniesz, to mi się ta faktura przeterminuje."
    )

    override val angryLevel2 = listOf(
        "Ociągasz się, a ja za wszystko odpowiadam własnym majątkiem.",
        "Drugie słowo daję. Trzeciego to już sam będę musiał za ciebie dowieźć.",
        "W tym tempie to ja na podatkach i składkach zostanę, a ty dalej stoisz.",
        "Ta sprawa się pali, a ty stoisz. Weź się do tego, zanim klient zerwie umowę."
    )

    override val angryLevel3 = listOf(
        "Termin minął, kasa stoi. Modzi dzisiaj zawsze na ostatnią chwilę.",
        "Jak tak dalej, to zerwę z tego interesu więcej nerwów niż złotówek. A miałem cię za swojego.",
        "Liczy się każda złotówka, a ty właśnie przepuściłeś cały dzień.",
        "Sam wszystko muszę dowieźć. Na ciebie liczyłem, a wyszło jak zwykle: ja zostaję do zamknięcia."
    )

    override val angryTitleComments = listOf(
        "Sprawa «%s» nadal nie zrobiona, a czas leci.",
        "Za «%s» to ja już prawie sam skaczę, bo ciebie nie widać.",
        "Termin «%s» minął. Tego klient mi nie daruje, i ja tobie też nie.",
        "Za «%s» kasa miała być ogarnięta, a tu nadal zero."
    )
}
