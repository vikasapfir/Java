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
    public static BoardGame getInstance(){
        return defaultBoardGame;
    }
    public void addPlayer() {
        if(this.currentPlayers < this.maxPlayers){
            this.currentPlayers += 1;
        }
    }

    public void removePlayer() {
        if(this.currentPlayers > 0){
            this.currentPlayers -= 1;
        }
    }

    public boolean canPlay() {
        if (this.currentPlayers >= this.minPlayers && this.currentPlayers <= this.maxPlayers) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        BoardGame UNO = new BoardGame("UNO", 1, 2, 15);
        UNO.setCurrentPlayers(1);
        UNO.removePlayer();
        System.out.println(UNO.getCurrentPlayers());
        System.out.println(UNO);
        System.out.println(UNO.canPlay());
        UNO.setCurrentPlayers(3);
        System.out.println(UNO.canPlay());
        BoardGame chess = new BoardGame("chess", 1, 2, 2);
        BoardGame defaultGame1 = BoardGame.getInstance();
        BoardGame defaultGame2 = BoardGame.getInstance();
        ArrayList<BoardGame> games = new ArrayList<>();
        games.add(UNO);
        games.add(chess);
        games.add(defaultGame1);
        games.add(defaultGame2);
        defaultGame2.setCurrentPlayers(1);
        for(int i = 0; i <= 3; i++){
            System.out.println(games.get(i));
        }
    }
}


