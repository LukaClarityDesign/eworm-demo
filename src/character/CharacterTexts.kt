package com.eworm.character

/**
 * Bank kwestii postaci: happy / idle / trzy poziomy złości.
 * Komentarze z tytułem zadania używają %s jako miejsca na tytuł.
 */
interface CharacterTexts {
    val happy: List<String>
    val idle: List<String>
    val angryLevel1: List<String>
    val angryLevel2: List<String>
    val angryLevel3: List<String>
    val angryTitleComments: List<String>

    fun angryFor(level: Int): List<String> = when (level) {
        1 -> angryLevel1
        2 -> angryLevel2
        else -> angryLevel3
    }
}

object CharacterTextBank {
    fun of(theme: CharacterTheme): CharacterTexts = when (theme) {
        CharacterTheme.ROBAL -> PanRobalTexts
        CharacterTheme.BAKTERIA -> BakteriaTexts
        CharacterTheme.POGANIACZ -> PoganiaczTexts
    }
}
