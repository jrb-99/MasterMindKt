This is a simple text based game written in kotlin that mimics the original Master Mind board game.

The objective of this game is to guess the exact sequence of characters generated randomly by the computer. This sequence is composed by a set of four unique characters (no duplicated) ranging from 'A' to 'F' (by default).

The player has a limited number of attempts to guess correctly the "secret" word. In each turn, the player is informed of how many correct characters his guess have, and how many characters are in the correct position. i.e: Secret word: "AEBD", Player guess: "BEDF", Correct characters: 3, Swapped characters: 2

The guess must be valid, meaning the game will only proceed when the player inputs a guess that meets the requirements (No duplicated characters, only characters within the defined range and an exact number of characters, four by defautl)

All the constants that define how the game will work are set in the beggining of the program, and may be changed as the player wishes, maintaining the game logic.
