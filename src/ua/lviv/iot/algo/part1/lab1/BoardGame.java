package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BoardGame {

    private String title;
    private int currentPlayers;
    private int minPlayers;
    private int maxPlayers;

    private static BoardGame defaultBoardGame = new BoardGame();

    public static BoardGame getInstance() {
        return defaultBoardGame;
    }

    public void addPlayer() {
        if (this.currentPlayers < this.maxPlayers) {
            this.currentPlayers += 1;
        }
    }

    public void removePlayer() {
        if (this.currentPlayers > 0) {
            this.currentPlayers -= 1;
        }
    }

    public boolean canPlay() {
        return this.currentPlayers >= this.minPlayers && this.currentPlayers <= this.maxPlayers;
    }

    public static void main(String[] args) {
        BoardGame[] games = {
                new BoardGame(),
                new BoardGame("UNO", 1, 2, 15),
                BoardGame.getInstance(),
                BoardGame.getInstance()};

        for (BoardGame game : games) {
            System.out.println(game.toString());
        }
    }
}


