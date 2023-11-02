//import java.security.KeyStore;
import java.util.*;
import java.util.List;
import java.awt.image.BufferedImage.*;

public class Game {
    private int chessNum;
    private String password;
    private Integer sums;
    private final String introduction = "Welcome to the Password Game!";
    private int attempts;
    private final String[] months = {"january", "february", "march", "april", "may", "june",
            "july", "august", "september", "october", "november", "december"};
    private final String[] specialCharacters = {",", "<", ".", ">", "/", "?", ";", ":", "'",
            "\"\"", "[", "{", "]", "}", "`", "~", "!", "@", "#", "$", "%",
            "^", "&", "*", "(", ")", "-", "_", "=", "+", "\\", "|"};
    private final String[] seasons = {"winter", "summer", "fall", "autumn", "spring"};
    private final String[] upperCaseLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    private final String[] ClassmateName = {"victor", "fatoumata", "reem", "shunyi", "hamzah",
            "samuel", "justin", "evan", "teo ", "yuxuan", "eric", "matthew", "zachary", "donovan",
            "daler", "isabella", "syon", "saajid", "yasmin", "nelson", "jonathan", "eaton", "terry",
            "preston", "toshinori", "raymond", "weihao", "linbin", "sumya"};

    private final String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private final String[] Chess = {"chess5.png", "chess6.png", "chess7.png", "chess8.png", "chess9.png", "chess10.png", "chess11.png", "chess12.png", "chess13.png"};
    private final String[] chessAnswers = {"Ne2#", "Qg7#", "Ne8#", "Nf1#", "axb5#", "Rh8#", "Bxb5#", "Rc1#", "dxe6#"};
    private int randomNumber;
    List<String> numList = Arrays.asList(numbers);


    // GAME METHOD




    public Game(String pass, int attemptNumber) {
        this.password = pass;
        this.attempts = attemptNumber;
        randNumber();
    }

    public Game() {
        System.out.println("Game is overloaded");
    }

    public String Chess(int chessN){

        return Chess[chessN];
    }

    public boolean checkChess(int chessN){
        if(password.contains(chessAnswers[chessN])) return true;
        return false;
    }

    public void updatePassword(String newPassword) {
        password = newPassword;
    }

    // ACCESSOR METHODS

    public String getPassword() {
        return password;
    }

    public String toString() {
        return "Welcome to the Password Game!";
    }

    public String getIntroduction() {
        return introduction;
    }

    public int getSums() {
        return sums;
    }

    public int getAttempts() {
        return attempts;
    }
    public int getRandomNumber() {return randomNumber;}

    //MISCELLANEOUS METHODS
    public static double calculateScore(int attempts) {
        double percentage = .000001;
        int formula = (int) (percentage * Integer.MAX_VALUE * attempts + .5);
        return Double.parseDouble((("Your Score is: " + (formula) + "and it took you " + attempts + "tries!")));
    }

    public void getScore(int numAttempts) {
        System.out.println(Game.calculateScore(numAttempts));
    }


    // REQUIREMENT METHODS

    public boolean adzrequirement() { // SPECIFIC LETTER REQUIREMENT
        if (password.contains("a") || password.contains("A")) {
            if (password.contains("d") || password.contains("D")) {
                if (password.contains("z") || password.contains("Z")) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean number() { // SPECIAL CHARACTER REQUIREMENT
        for (int i = 0; i < numbers.length; i++) {
            if (password.contains(numbers[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean specialCharacter() { // SPECIAL CHARACTER REQUIREMENT
        for (int i = 0; i < specialCharacters.length; i++) {
            if (password.contains(specialCharacters[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean classmateName() { // INCLUDES CLASSMATES NAME REQUIREMENT
        for (int i = 0; i < ClassmateName.length; i++) {
            if (password.contains(ClassmateName[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean capitalLetter() { // CAPITAL LETTER REQUIREMENT
        for (int i = 0; i < upperCaseLetters.length; i++) {
            if (password.contains(upperCaseLetters[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean season() { // SEASON REQUIREMENT
        for (int i = 0; i < seasons.length; i++) {
            if (password.contains(seasons[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean month() { // MONTH REQUIREMENT
        for (int i = 0; i < months.length; i++) {
            if (password.contains(months[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean romanNumerals() { // ROMAN NUMERAL REQUIREMENT
        if (password.endsWith("XXV")) {
            return true;
        }
        return false;
    }

    public void randNumber() { // RANDOM REQUIREMENT
        int rand1 = (int) (Math.random() * (9 - 69 + 69) + 1);
        randomNumber = rand1;
    }
    public boolean displayNum(int random){
        if (password.contains(String.valueOf(random))){
            return true;
        }
        return false;
    }

    public boolean decimal(){
        if(password.contains(".")) {
            int z = password.indexOf(".");
            char[] temporary = password.toCharArray();
            for (int n = 0;n<numbers.length;n++) {
                if (String.valueOf(temporary[z+1]).equals(numbers[n])) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean productFifty() {
        int product = 1;
        if (password.contains("0")) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            for (int n = 0; n < numbers.length; n++) {
                int z = i;
                if (!(i == password.length() - 1)) {
                    z = i + 1;
                }
                if (password.substring(i, z).equals(numbers[n])) {
                    product *= n + 1;
                }
            }
        }
        if (product >= 50) {
            return true;
        }
        return false;
    }

    public boolean sumThirty() {        //SUM OF THIRTY REQUIREMENT
        int sum = 0;
        for (int i = 0; i < password.length(); i++) {
            for (int n = 0; n < numbers.length; n++) {
                int z = i;
                if (!(i == password.length() - 1)) {
                    z = i + 1;
                }
                if (password.substring(i, z).equals(numbers[n])) {
                    sum += n + 1;
                }
            }
        }
        if (sum == 30) {
            return true;
        } else {
            return false;
        }
    }
}




