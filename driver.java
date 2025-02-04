import java.util.Scanner;

public class driver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Game mode selection:\n- 1. Random\n- 2. Manual");
        int mode = in.nextInt();
        switch (mode) {
            case 1:
                RandomGame randomGame = new RandomGame();
                randomGame.play();
                break;
            case 2:
                ManualGame manualGame = new ManualGame();
                manualGame.play();
                break;
            default:
                System.out.println("Invalid mode selection.");
                break;
        }
        
        in.close();
    }

    public card[] drawCards() {
        return null;
    }

    public void showCards() {
        System.out.println("Showing cards.");
    }

    public ball[] drawBalls() {
        return null;
    }

    public caller automatedCaller() {
        return null;
    }

    public void markCard() {
        System.out.println("Marking card.");
    }
}