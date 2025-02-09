import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AWT {
    // makes the application
    private final Frame mainFrame = new Frame("The Password Game");
    private final Frame victoriousFrame = new Frame("The Password Game");
    private final Label winningLabel = new Label("Congrats on beating this game! Scan the code for your Prize!");
    private int attempts = 0;
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
    private Label requirements13 = new Label();
    private Label requirements14 = new Label();
    private Label requirements15 = new Label();
    private Label requirements16 = new Label();
    private Label startingRequirement = new Label("Please Enter an animal");
    private ImageIcon chessPuzzle = null;
    private ImageIcon captchaPuzzle;
    private ImageIcon country;
    private ImageIcon qrCode = new ImageIcon("prizerr.png");
    private JLabel displayCaptcha = new JLabel();
    private JLabel daPrize = new JLabel(qrCode);;
    private JLabel puzzle = new JLabel();
    private JLabel displayCountry = new JLabel();
    private Label yourPassword = new Label();
    private Label characterCount = new Label();
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
    private boolean met13;
    private boolean met14;
    private boolean met15;
    private boolean met16;
    private String updatedText = "";
    private Game firstAttempt;
    private int randomNumber;
    private int randomSelection1;
    private int randomSelection2;
    private int randomSelection3;



    public AWT() {
        Font myFont1 = new Font("Roboto", Font.ITALIC | Font.BOLD, 12);
        Font myFont2 = new Font("Monospaced", Font.BOLD, 12);
        Font newFont = myFont1.deriveFont(50F);
        Font enterFont = myFont1.deriveFont(150F);
        Font requirementsfont = myFont2.deriveFont(20F);
        Button enterButton = new Button("ENTER");
        enterButton.setFont(enterFont);
        TextField initialPassword = new TextField();
        initialPassword.setBounds(650, 300, 500, 50);
        firstAttempt = new Game(updatedText, attempts);
        randomNumber = firstAttempt.getRandomNumber();
        randomSelection1 = (int) (Math.random() * (10)); // CHESS RANDOM SELECTION
        randomSelection2 = (int) (Math.random() * (10)); // CAPTCHA RANDOM SELECTION
        randomSelection3 = (int) (Math.random() * (10)); // COUNTRIES RANDOM SELECTION
        Label titleLabel = new Label(firstAttempt.getIntroduction());
        titleLabel.setFont(newFont);
        initialPassword.setFont(requirementsfont);
        requirements1.setFont(requirementsfont);
        requirements2.setFont(requirementsfont);
        requirements3.setFont(requirementsfont);
        requirements4.setFont(requirementsfont);
        requirements5.setFont(requirementsfont);
        requirements6.setFont(requirementsfont);
        requirements7.setFont(requirementsfont);
        requirements8.setFont(requirementsfont);
        requirements9.setFont(requirementsfont);
        requirements10.setFont(requirementsfont);
        requirements11.setFont(requirementsfont);
        requirements12.setFont(requirementsfont);
        requirements13.setFont(requirementsfont);
        requirements14.setFont(requirementsfont);
        requirements15.setFont(requirementsfont);
        requirements16.setFont(requirementsfont);
        startingRequirement.setFont(newFont);
        characterCount.setFont(requirementsfont);
        winningLabel.setFont(requirementsfont);
        System.out.println(firstAttempt);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == enterButton) {
                    updatedText = initialPassword.getText();
                    characterCount.setText(String.valueOf(updatedText.length()));
                    firstAttempt.updatePassword(updatedText);
                    attempts++;
                    System.out.println(firstAttempt.getPassword());
                    setValues();
                    requirements1.setText("Must Include the Letters a,d,z: " + met1);
                    if (met1) {
                        setValues();
                        requirements11.setText("Must include a number: " + met11);
                        if (met11) {
                            setValues();
                            requirements2.setText("Must Include a Special Character: " + met2);
                            if (met2) {
                                setValues();
                                requirements3.setText("Must Include a Classmate's First Name: " + met3);
                                if (met3) {
                                    setValues();
                                    requirements4.setText("Must Include a Capital Letter: " + met4);
                                    if (met4) {
                                        setValues();
                                        requirements5.setText("Must Include a Season: " + met5);
                                        if (met5) {
                                            setValues();
                                            requirements6.setText("Must Include a month:" + met6);
                                            if (met6) {
                                                setValues();
                                                requirements7.setText("Must include the Roman Numerals of 25 at the end: " + met7);
                                                if (met7) {
                                                    setValues();
                                                    requirements8.setText("Must include this random number " + "(" + randomNumber + "):" + met8);
                                                    if (met8) {
                                                        setValues();
                                                        requirements12.setText("Must have a product that is more 50 for all digits: " + met12);
                                                        if (met12) {
                                                            setValues();
                                                            requirements9.setText("Must include a decimal value: " + met9);
                                                            if (met9) {
                                                                setValues();
                                                                requirements10.setText("Must have a sum of 40 for all digits: " + met10);
                                                                if (met10) {
                                                                    chessPuzzle = new ImageIcon(firstAttempt.chess(randomSelection1));
                                                                    puzzle.setIcon(chessPuzzle);
                                                                    setValues();
                                                                    requirements13.setText("Must Include the best Chess move in " +
                                                                            "Algebraic Chess Notation: " + met13);
                                                                    if (met13) {
                                                                        captchaPuzzle = new ImageIcon(firstAttempt.captcha(randomSelection2));
                                                                        displayCaptcha.setIcon(captchaPuzzle);
                                                                        setValues();
                                                                        requirements14.setText("Must Include the words in the captcha: " + met14);
                                                                        if (met14) {
                                                                            setValues();
                                                                            requirements15.setText("Must include the length of your password: " + met15);
                                                                            if (met15) {
                                                                                country = new ImageIcon(firstAttempt.countries((randomSelection3)));
                                                                                displayCountry.setIcon(country);
                                                                                setValues();
                                                                                requirements16.setText("Must include the name of the country " +
                                                                                        "in the image provided(no spaces): " + met16);
                                                                                if (met16) {
                                                                                    firstAttempt.getScore(attempts, updatedText.length());
                                                                                    yourPassword.setText(updatedText);
                                                                                    yourPassword.setFont(requirementsfont);
                                                                                    mainFrame.setVisible(false);
                                                                                    victoriousFrame.setVisible(true);
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });


        // Setting Bounds
        characterCount.setBounds(1160, 300, 100, 50);
        enterButton.setBounds(580, 800, 800, 200);
        winningLabel.setBounds(10, 100, 1000, 20);
        startingRequirement.setBounds(650, 150, 700, 50);
        yourPassword.setBounds(0, 50, 500, 20);
        daPrize.setBounds(10, 200, 200, 200);
        displayCaptcha.setBounds(1500, 150, 250, 65);
        puzzle.setBounds(15, 280, 637, 669);
        displayCountry.setBounds(1460,715 , 450, 400);
        requirements1.setBounds(650, 400, 1000, 20);
        requirements11.setBounds(650, 420, 1000, 20);
        requirements2.setBounds(650, 440, 1000, 20);
        requirements3.setBounds(650, 460, 1000, 20);
        requirements4.setBounds(650, 480, 1000, 20);
        requirements5.setBounds(650, 500, 1000, 20);
        requirements6.setBounds(650, 520, 1000, 20);
        requirements7.setBounds(650, 540, 1000, 20);
        requirements8.setBounds(650, 560, 1000, 20);
        requirements12.setBounds(650, 580, 1000, 20);
        requirements13.setBounds(650, 640, 1500, 20);
        requirements9.setBounds(650, 600, 1000, 20);
        requirements10.setBounds(650, 620, 1000, 20);
        requirements14.setBounds(650, 660, 1000, 20);
        requirements15.setBounds(650, 680, 1000, 20);
        requirements16.setBounds(650, 700, 1000, 18);
        titleLabel.setBounds(540, 100, 779, 50);

        // Update
        // Add + Action
        mainFrame.setBackground(Color.CYAN);
        mainFrame.add(characterCount);
        mainFrame.add(startingRequirement);
        mainFrame.add(enterButton);
        mainFrame.add(initialPassword);
        mainFrame.add(titleLabel);
        mainFrame.add(requirements1);
        mainFrame.add(requirements11);
        mainFrame.add(requirements2);
        mainFrame.add(requirements3);
        mainFrame.add(requirements4);
        mainFrame.add(requirements5);
        mainFrame.add(requirements6);
        mainFrame.add(requirements7);
        mainFrame.add(requirements8);
        mainFrame.add(requirements12);
        mainFrame.add(requirements9);
        mainFrame.add(requirements10);
        mainFrame.add(puzzle);
        mainFrame.add(displayCaptcha);
        mainFrame.add(displayCountry);
        mainFrame.add(requirements13);
        mainFrame.add(requirements14);
        mainFrame.add(requirements15);
        mainFrame.add(requirements16);
        mainFrame.add(yourPassword);
        mainFrame.setSize(1920, 1080);
        mainFrame.setVisible(true);
        victoriousFrame.add(winningLabel);
        victoriousFrame.add(daPrize);
        victoriousFrame.setSize(800, 800);
        victoriousFrame.setVisible(false);
        victoriousFrame.add(yourPassword);
        closingWindow();
    }
    public void setValues(){
        met1 = firstAttempt.adzrequirement();
        met11 = firstAttempt.number();
        met2 = firstAttempt.specialCharacter();
        met3 = firstAttempt.classmateName();
        met4 = firstAttempt.capitalLetter();
        met5 = firstAttempt.season();
        met6 = firstAttempt.month();
        met7 = firstAttempt.romanNumerals();
        met8 = firstAttempt.displayNum(randomNumber);
        met12 = firstAttempt.productFifty();
        met9 = firstAttempt.decimal();
        met10 = firstAttempt.sumFourty();
        met13 = firstAttempt.checkChess(randomSelection1);
        met14 = firstAttempt.checkCaptcha(randomSelection2);
        met15 = firstAttempt.lengthPassword();
        met16 = firstAttempt.checkCountries(randomSelection3);
    }

    // Window Closing DNC
    public void closingWindow() {
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        victoriousFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
