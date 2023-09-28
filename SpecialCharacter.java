import java.util.Scanner;
public class SpecialCharacter {
    private String character;

    public String userInput()
    {
        System.out.println("Enter a special character: ");
        Scanner s = new Scanner(System.in);
        character = s.nextLine();
        return character;
    }
}
