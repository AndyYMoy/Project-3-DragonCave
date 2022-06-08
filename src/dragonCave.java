import java.util.Scanner;

public class dragonCave {

    public static void main(String[] args) {
        int input = 0;
        boolean validInput = false;

        System.out.println("You are in a land full of dragons. In front of you, you see two caves. In one cave, the dragon is friendly and will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight. Which cave will you go into? (1 or 2");
        Scanner getInput = new Scanner(System.in);

        while(validInput == false) {
            try {
                input = getInput.nextInt();
                if(input == 1 || input == 2) {
                    validInput = true;
                } else {
                    System.out.println("Please put in a valid option (1 or 2)");
                }
            }
            catch (Exception e) {
                System.out.println("Please put in a valid option (1 or 2)");
                getInput.next();
            }
        }

        if(input == 1) {
            System.out.println("You approach the cave... It is dark and spooky... A large dragon jumps out in front of you! He opens his jaws and... Gobbles you down in one bite!");
        } else if(input == 2){
            System.out.println("A sleeping dragon lazily wakes up, offers you to take 1 item and allows you to leave safely!");
        }
    }
}
