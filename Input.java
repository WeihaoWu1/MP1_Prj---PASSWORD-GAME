import java.util.Scanner;
public class Input {

    public void userInput()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Guess a letter: ");
        String guess = s.nextLine();
    }
}