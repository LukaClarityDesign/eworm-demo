package com.eworm.character

/**
 * Startowe postacie e-worm.
 * Motyw wizualny (kolory, karty, dymki) jest w [com.eworm.ui.CharacterVisuals].
 *
 * ROBAL – brygadzista, rzeczowy, trochę złośliwy.
 * BAKTERIA – pani z HR, gryzipiórek, urzędniczka i pracownica korpo z ADHD (rodzaj żeński).
 * POGANIACZ – typowy polski „Janusz” prywaciarz (Janusz biznesu).
 */
enum class CharacterTheme {
    ROBAL,
    BAKTERIA,
    POGANIACZ;

    val displayName: String
        get() = when (this) {
            ROBAL -> "Pan Robal"
            BAKTERIA -> "Bakteria"
            POGANIACZ -> "Poganiacz"
        }

    val displaySubtitle: String
        get() = when (this) {
            ROBAL -> "Brygadzista z placu budowy"
            BAKTERIA -> "Pani z HR · gryzipiórek"
            POGANIACZ -> "Czas to pieniądz"
        }

    /** Prefiks plików sprite'ów: robal_*, bakteria_*, poganiacz_* */
    val spritePrefix: String
        get() = when (this) {
            ROBAL -> "robal"
            BAKTERIA -> "bakteria"
            POGANIACZ -> "poganiacz"
        }

    fun spriteName(state: CharacterState, frame: Int = 1): String {
        val n = frame.toString().padStart(2, '0')
        return "${spritePrefix}_${state.name.lowercase()}_$n"
    }
}
