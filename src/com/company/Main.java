package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = false;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        String playersName = "Mike";
        int playersScore = 1000;
        int playersPosition = calculateHighScorePosition(playersScore);
        displayHighScorePosition(playersName, playersPosition);

        playersName = "Bella";
        playersScore = 900;
        playersPosition = calculateHighScorePosition(playersScore);
        displayHighScorePosition(playersName, playersPosition);

        playersName = "Sophia";
        playersScore = 400;
        playersPosition = calculateHighScorePosition(playersScore);
        displayHighScorePosition(playersName, playersPosition);

        playersName = "Max";
        playersScore = 50;
        playersPosition = calculateHighScorePosition(playersScore);
        displayHighScorePosition(playersName, playersPosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playersName, int playersPosition) {
        System.out.println(playersName + " managed to get into position "
                + playersPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int playerPosition = 4;

        if (score >= 1000) {
            playerPosition = 1;
        } else if (score >= 500) {
            playerPosition = 2;
        } else if (score >= 100); {
            playerPosition = 3;
        }

        return playerPosition;
    }
}