public class RoShaBo extends Game {


    public static void main(String[] args) {
        int supercount = 0;
        Game game = new Game();
        game.intro();

        while (supercount != 1) {
            //game.checkScore();
            game.play();
            //game.restart();
            if (game.exit == 1) {
                System.out.println("Catch you later space cowboy");
                supercount++;
            }

        }
    }
}