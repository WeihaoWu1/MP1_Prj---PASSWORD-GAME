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
            // Label
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
            Label requirements1 = new Label();
            Label requirements2 = new Label();
            Label requirements3 = new Label();
            Label requirements4 = new Label();
            Label requirements5 = new Label();
            Label requirements6 = new Label();
            Label requirements7 = new Label();
            Label requirements8 = new Label();
            Label requirements9 = new Label();
            Label requirements10 = new Label();
            Label requirementsMet = new Label();
            requirementsMet.setBounds(50, 200, 1000, 15);
            // Button
            Button enterButton = new Button("Enter");
            enterButton.setBounds(200, 400, 100, 100);
            initialPassword.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                    firstAttempt.updatePassword(firstPassword);
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    firstAttempt.updatePassword(firstPassword);
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    firstAttempt.updatePassword(firstPassword);
                }
            });
            enterButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    requirements1.setBounds(50, 200, 1000, 15);
                    requirements2.setBounds(50, 220, 1000, 15);
                    requirements3.setBounds(50, 240, 1000, 15);
                    requirements4.setBounds(50, 260, 1000, 15);
                    requirements5.setBounds(50, 280, 1000, 15);
                    requirements6.setBounds(50, 300, 1000, 15);
                    requirements7.setBounds(50, 320, 1000, 15);
                    requirements8.setBounds(50, 340, 1000, 15);
                    requirements9.setBounds(50, 360, 1000, 15);
                    requirements10.setBounds(50, 380, 1000, 15);
                    requirements1.setText(String.valueOf(firstAttempt.adzrequirement()));
                    requirements2.setText(String.valueOf(firstAttempt.specialCharacter()));
                    requirements3.setText(String.valueOf(firstAttempt.classmateName()));
                    requirements4.setText(String.valueOf(firstAttempt.capitalLetter()));
                    requirements5.setText(String.valueOf(firstAttempt.season()));
                    requirements6.setText(String.valueOf(firstAttempt.month()));
                    requirements7.setText(String.valueOf(firstAttempt.romanNumerals()));
                    requirements8.setText(String.valueOf(firstAttempt.randNumber()));
                    requirements9.setText(String.valueOf(firstAttempt.decimal()));
                    requirements10.setText(String.valueOf(firstAttempt.sumThirty()));

                }
            });
            // Update
            // Add + Action
//            mainFrame.setLayout(null);
            mainFrame.add(enterButton);
            mainFrame.add(initialPassword);
            mainFrame.add(requirements1);
            mainFrame.add(requirements2);
            mainFrame.add(requirements3);
            mainFrame.add(requirements4);
            mainFrame.add(requirements5);
            mainFrame.add(requirements6);
            mainFrame.add(requirements7);
            mainFrame.add(requirements8);
            mainFrame.add(requirements9);
            mainFrame.add(requirements10);
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







