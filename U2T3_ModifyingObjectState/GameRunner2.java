public class GameRunner2 {
    public static void main(String[] args) {
        Game game = new Game("Blackjack", 2);
        System.out.println("Game name: " + game.getGameName());
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Is game over? " + game.isGameOver());

        System.out.println("----- END OF ROUND 1 -----");
        game.addPlayer();
        game.addPlayer();
        game.increaseScore(2);
        game.increaseScore(3);
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Is game over? " + game.isGameOver());

        System.out.println("----- END OF ROUND 2 -----");
        game.increaseScore(1);
        game.increaseScore(2);
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Is game over? " + game.isGameOver());

        System.out.println("-------- GAME END --------");
        game.increaseScore(2);
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Is game over? " + game.isGameOver());

        System.out.println("Avg score per player: " + game.averageScorePerPlayer());
    }
}
