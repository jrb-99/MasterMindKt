This is a simple text based game written in kotlin that mimics the original Master Mind board game, and it was developed as a first project in the scope of Programming unit course of ISEL Computer Science and Computer Engineering BSc.

The objective of this game is to guess the exact sequence of characters generated randomly by the computer. This sequence is composed by a set of four unique characters (no duplicated) ranging from 'A' to 'F' (by default).

The player has a limited number of attempts to guess correctly the "secret" word. In each turn, the player is informed of how many correct characters his guess have, and how many characters are in the correct position.

- example 1: Secret word: "AEBD", Player guess: "BEDF", Correct characters: 1, Swapped characters: 2

- example 2: Secret word: "AEBD", Player guess: "AAAA", Correct characters: 1, Swapped characters: 0

- example 3: Secret word: "AEBD", Player guess: "AABB", Correct characters: 2, Swapped characters: 0

- example 4: Secret word: "AEBD", Player guess: "BBAA", Correct characters: 0, Swapped characters: 2

The guess must be valid, meaning the game will only proceed when the player inputs a guess that meets the requirements (Only characters within the defined range and an exact number of characters, four by default)

All the constants that define how the game will work are set in the beggining of the program, and may be changed as the player wishes, maintaining the game logic.
