import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String error = "We have ran into an error here \n ....";
        try {
            Game alpha = new Game("sir bighead",0);
            Frame mainFrame = new Frame("The Password Game");
            Label titleLabel = new Label(alpha.getIntroduction());
            titleLabel.setAlignment(Label.CENTER);
            mainFrame.add(titleLabel);
            mainFrame.setSize(300, 300);
            mainFrame.setVisible(true);
            mainFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }
        catch (ArithmeticException e){
            catchError(error);
        }
        catch (NullPointerException e){
            catchError(error);
        }
        catch (IndexOutOfBoundsException e){
            catchError(error);
        }
    }
    public static void catchError(String word){
        System.out.println(word);
    }
}







