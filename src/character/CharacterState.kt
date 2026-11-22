package com.eworm.character

/**
 * Visual state of a character: idle, happy or angry.
 *
 * In the full application this enum currently lives next to the state
 * manager. It is included here so the theme API in this portfolio slice
 * is self-contained.
 */
enum class CharacterState {
    IDLE,
    HAPPY,
    ANGRY
}
