import ua.lviv.iot.algo.part1.lab1.BoardGame;

public class Main {
    public static void main(String[] args) {
        BoardGame[] games = {
                new BoardGame(),
                new BoardGame("UNO", 1, 2, 15),
                BoardGame.getInstance(),
                BoardGame.getInstance()};
        for(BoardGame game : games){
            System.out.println(game.toString());
        }
    }
}
