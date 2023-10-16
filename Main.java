import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String error = "We have ran into an error here \n ....";
        try {
            boolean run = true;

            // Frame
            Frame mainFrame = new Frame("The Password Game");
            // TextField
            TextField initialPassword = new TextField();
            String firstPassword = initialPassword.getText();
            initialPassword.setBounds(50, 100, 200, 30);
            Game firstAttempt = new Game(firstPassword, 0);
            Label titleLabel = new Label(firstAttempt.getIntroduction());
            System.out.println(firstAttempt);
            titleLabel.setAlignment(Label.CENTER);
            String requirement1 = String.valueOf(firstAttempt.adzrequirement());
            String requirement2 = String.valueOf(firstAttempt.specialCharacter());
            String requirement3 = String.valueOf(firstAttempt.classmateName());
            String requirement4 = String.valueOf(firstAttempt.capitalLetter());
            String requirement5 = String.valueOf(firstAttempt.season());
            String requirement6 = String.valueOf(firstAttempt.month());
            String requirement7 = String.valueOf(firstAttempt.romanNumerals());
            String requirement8 = String.valueOf(firstAttempt.randNumber());
            String requirement9 = String.valueOf(firstAttempt.decimal());
            String requirement10 = String.valueOf(firstAttempt.sumThirty());
            Label requirementsMet = new Label();
            requirementsMet.setBounds(50, 200, 1000, 15);
            // Button
            Button enterButton = new Button("Enter");
            enterButton.setBounds(200, 400, 100, 100);
            enterButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    requirementsMet.setText(requirement1 + requirement2 + requirement3 + requirement4 +
                            requirement5 +  requirement6 + requirement7 + requirement8 + requirement9 + requirement10);
                }
            });
            // Update
            firstAttempt.updatePassword(firstPassword);
            // Add + Action
//            mainFrame.setLayout(null);
            mainFrame.add(enterButton);
            mainFrame.add(initialPassword);
            mainFrame.add(requirementsMet);
            mainFrame.add(titleLabel);
            mainFrame.setSize(1000, 1000);
            mainFrame.setVisible(true);

            // Window Closing DNC
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
//import java.awt.*;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowAdapter;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        String error = "We have ran into an error here \n ....";
//        try {
//            Game alpha = new Game("sir bighead",0);
//            Frame mainFrame = new Frame("The Password Game");
//            Label titleLabel = new Label(alpha.getIntroduction());
//            titleLabel.setAlignment(Label.CENTER);
//            mainFrame.add(titleLabel);
//            mainFrame.setSize(300, 300);
//            mainFrame.setVisible(true);
//            mainFrame.addWindowListener(new WindowAdapter() {
//                @Override
//                public void windowClosing(WindowEvent e) {
//                    System.exit(0);
//                }
//            });
//        }
//        catch (ArithmeticException e){
//            catchError(error);
//        }
//        catch (NullPointerException e){
//            catchError(error);
//        }
//        catch (IndexOutOfBoundsException e){
//            catchError(error);
//        }
//    }
//    public static void catchError(String word){
//        System.out.println(word);
//    }
//}







