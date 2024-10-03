
# Number Game

## Overview

The **Number Game** is an interactive command-line game written in Java where a random number is generated within a specified range, and the user must guess the number. The game provides feedback on whether the guess is too high, too low, or correct. It can be configured for multiple rounds and limits the number of attempts to add to the challenge. The user's score is based on the number of attempts or rounds won.

## Features

1. **Random Number Generation**: 
   - A number is randomly generated within a user-specified range (e.g., 1 to 100).
   
2. **User Interaction**:
   - The user is prompted to guess the randomly generated number.
   - After each guess, feedback is provided on whether the guess is too high, too low, or correct.
   
3. **Attempts Limitation**:
   - The user has a limited number of attempts to guess the number correctly.
   - If the attempts run out, the round ends, and the user is informed of the correct number.
   
4. **Multiple Rounds**:
   - After completing one round, the user can choose to play again.
   - The game can be played for multiple rounds with each round's result contributing to the overall score.
   
5. **Scoring System**:
   - Scores are calculated based on the number of attempts taken to guess correctly.
   - The fewer attempts used, the better the score.
   - Alternatively, the score can be based on the number of rounds won.

## Game Flow

1. **Random Number Generation**: The game begins by generating a random number within a given range (default is 1 to 100).
   
2. **User Guess**: The user is asked to guess the number.
   
3. **Feedback**: The game provides feedback to guide the user:
   - If the guess is **too high**, the user is told to guess lower.
   - If the guess is **too low**, the user is told to guess higher.
   - If the guess is **correct**, the user is informed, and the round ends.
   
4. **Attempt Limit**: The user must guess the number within the specified number of attempts. If they fail, the correct answer is revealed, and the round ends.

5. **Repeat Rounds**: The user can choose to play again, and the game continues until they decide to stop.

6. **Scoring**: The user’s performance is evaluated by how quickly they can guess the number or how many rounds they’ve won.

## Installation

To run this project locally:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/AnujYadav-Dev/number-guesser-cli.git
   ```

2. **Navigate to the project directory**:
   ```bash
   cd number-guesser-cli
   ```

3. **Compile and Run the game**:
   ```bash
   javac NumberGame.java
   java NumberGame
   ```

## Requirements

- Java 8 or later

## How to Play

1. Run the program, and a random number will be generated.
2. The game will prompt you to enter your guess.
3. You will receive feedback on whether your guess is too high or too low.
4. Keep guessing until you find the correct number or run out of attempts.
5. After a round ends, you can choose to play again.
6. Your score is based on the number of attempts you take or rounds you win.

## Future Improvements

Some potential improvements for future versions include:
- Adding difficulty levels (easy, medium, hard) with varying number ranges and attempt limits.
- Implementing a leaderboard to track high scores.
- Allowing customization of the number range and attempt limits.
- Adding a graphical interface.


