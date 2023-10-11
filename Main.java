import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
//        Frame frame = new Frame("Password Game");
//        Label label = new Label("Hello");
//        label.setAlignment(Label.CENTER);
//        frame.add(label);
//        frame.setSize(800, 800);
//        frame.setVisible(true);
//        Color black = Color.black;
        Scanner s = new Scanner(System.in);
        System.out.println("Please choose a password.");
        String password = s.nextLine();
        Thirty b = new Thirty(password);
        b.check();


//        game_end = false;
//        while (game_end != true){
//            System.out.println("Please choose a password.");
        }

    }






