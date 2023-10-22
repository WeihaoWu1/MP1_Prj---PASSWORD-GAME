import java.awt.*;
import java.awt.event.*;
public class AWT {
    private final Frame mainFrame = new Frame("The Password Game");
    private Button enterButton = new Button("Enter");
    private Label requirements1 = new Label();
    private Label requirements2 = new Label();
    private Label requirements3 = new Label();
    private Label requirements4 = new Label();
    private Label requirements5 = new Label();
    private Label requirements6 = new Label();
    private Label requirements7 = new Label();
    private Label requirements8 = new Label();
    private Label requirements9 = new Label();
    private Label requirements10 = new Label();
    private Label requirements11 = new Label();
    private Label requirements12 = new Label();
    private Label yourPassword = new Label();
    private boolean met1;
    private boolean met2;
    private boolean met3;
    private boolean met4;
    private boolean met5;
    private boolean met6;
    private boolean met7;
    private boolean met8;
    private boolean met9;
    private boolean met10;
    private boolean met11;
    private boolean met12;
    private String updatedText = "";


    public AWT() {
        Font myFont1 = new Font("Roboto", Font.ITALIC | Font.BOLD, 12);
        Font myFont2 = new Font("Monospaced", Font.BOLD, 12);
        Font myFont3 = null;
        Font newFont = myFont1.deriveFont(50F);
        TextField initialPassword = new TextField();
        initialPassword.setBounds(50, 100, 200, 50);
        Game firstAttempt = new Game(updatedText, 0);
        int randomNumber = firstAttempt.getRandomNumber();
        Label titleLabel = new Label(firstAttempt.getIntroduction());
        titleLabel.setFont(newFont);
        requirements1.setFont(myFont2);
        requirements2.setFont(myFont2);
        requirements3.setFont(myFont2);
        requirements4.setFont(myFont2);
        requirements5.setFont(myFont2);
        requirements6.setFont(myFont2);
        requirements7.setFont(myFont2);
        requirements8.setFont(myFont2);
        requirements9.setFont(myFont2);
        requirements10.setFont(myFont2);
        requirements11.setFont(myFont2);
        requirements12.setFont(myFont2);
        System.out.println(firstAttempt);
        enterButton.setBounds(500, 500, 100, 100);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == enterButton) {
                    updatedText = initialPassword.getText();
                    firstAttempt.updatePassword(updatedText);
                    System.out.println(firstAttempt.getPassword());
                    met1 = firstAttempt.adzrequirement();
                    requirements1.setText("Must Include the Letters a,d,z: " + met1);
                    if (met1) {
                        met2 = firstAttempt.specialCharacter();
                        requirements2.setText("Must Include a Special Character: " + met2);
                        if (met2) {
                            met11 = firstAttempt.number();
                            requirements11.setText("Must include a number: " + met11);
                            if (met11) {
                                met3 = firstAttempt.classmateName();
                                requirements3.setText("Must Include a Classmate's Name: " + met3);
                                if (met3) {
                                    met4 = firstAttempt.capitalLetter();
                                    requirements4.setText("Must Include a Capital Letter: " + met4);
                                    if (met4) {
                                        met5 = firstAttempt.season();
                                        requirements5.setText("Must Include a Season: " + met5);
                                        if (met5) {
                                            met6 = firstAttempt.month();
                                            requirements6.setText("Must Include a month:" + met6);
                                            if (met6) {
                                                met7 = firstAttempt.romanNumerals();
                                                requirements7.setText("Must include the Roman Numerals of 25 at the end: " + met7);
                                                if (met7) {
                                                    met12 = firstAttempt.productFifty();
                                                    requirements12.setText("Must have a product that is more 50 for all numbers: " + met12);
                                                    if (met12) {
                                                        met8 = firstAttempt.displayNum(randomNumber);
                                                        requirements8.setText("Must include this random number " + "(" + randomNumber + "):" + met8);
                                                      if (met12) {
                                                          met9 = firstAttempt.decimal();
                                                          requirements9.setText("Must include a decimal value (WIP): " + met9);
                                                          if (met9) {
                                                            met10 = firstAttempt.sumThirty();
                                                            requirements10.setText("Must have a sum of 30 for all numbers: " + met10);
                                                            if (met10) {
                                                                yourPassword.setText(firstAttempt.getPassword());
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        requirements1.setText("");
                        requirements2.setText("");
                        requirements3.setText("");
                        requirements4.setText("");
                        requirements5.setText("");
                        requirements6.setText("");
                        requirements7.setText("");
                        requirements8.setText("");
                        requirements9.setText("");
                        requirements10.setText("");
                        requirements11.setText("");
                        requirements12.setText("");
                    }
                }
                }
            }
        });
        // Button
        requirements1.setBounds(50, 200, 1000, 15);
        requirements11.setBounds(50, 220, 1000, 15);
        requirements2.setBounds(50, 240, 1000, 15);
        requirements3.setBounds(50, 260, 1000, 15);
        requirements4.setBounds(50, 280, 1000, 15);
        requirements5.setBounds(50, 300, 1000, 15);
        requirements6.setBounds(50, 320, 1000, 15);
        requirements7.setBounds(50, 340, 1000, 15);
        requirements8.setBounds(50, 360, 1000, 15);
        requirements9.setBounds(50, 380, 1000, 15);
        requirements10.setBounds(50, 420, 1000, 15);
        requirements12.setBounds(50, 400, 1000, 15);
        titleLabel.setBounds(750, 100, 700, 50);


        // Update
        // Add + Action
        mainFrame.add(enterButton);
        mainFrame.add(initialPassword);
        mainFrame.add(requirements1);
        mainFrame.add(requirements11);
        mainFrame.add(requirements2);
        mainFrame.add(requirements3);
        mainFrame.add(requirements4);
        mainFrame.add(requirements5);
        mainFrame.add(requirements6);
        mainFrame.add(requirements7);
        mainFrame.add(requirements8);
        mainFrame.add(requirements9);
        mainFrame.add(yourPassword);
//        mainFrame.add(requirements10);
        mainFrame.add(titleLabel);
        mainFrame.setSize(1920, 1080);
        mainFrame.setVisible(true);
        closingWindow();
    }

    // Window Closing DNC
    public void closingWindow() {
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}