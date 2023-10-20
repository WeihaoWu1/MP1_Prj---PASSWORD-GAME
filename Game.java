//import java.security.KeyStore;
import java.util.*;
import java.util.List;

public class Game {
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
    private int displayNum;
    List<String> numList = Arrays.asList(numbers);

    // GAME METHOD

    public Game(String pass, int attemptNumber) {
        this.password = pass;
        this.attempts = attemptNumber;
    }

    public Game(){
        System.out.println("Game is overloaded");
    }

    public void updatePassword(String newPassword){
        password = newPassword;
    }

    // ACCESSOR METHODS

    public String getPassword(){
        return password;
    }
    public String toString(){
        return "Welcome to the Password Game!";
    }
    public String getIntroduction(){
        return introduction;
    }
    public Integer getDisplayNum() {return displayNum;}

    public int getSums(){
        return sums;
    }
    public int getAttempts() {
        return attempts;
    }

    //MISCELLANEOUS METHODS
    public static double calculateScore(int attempts){
        double percentage = .000001;
        int formula = (int)(percentage * Integer.MAX_VALUE * attempts + .5);
        return Double.parseDouble((("Your Score is: " + (formula) + "and it took you " + attempts + "tries!")));
    }

    public void getScore(int numAttempts){
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

    public boolean randNumber() { // RANDOM REQUIREMENT
        int rand1 = (int) (Math.random() * (9 - 1 + 1) + 1);
        displayNum = rand1;
        String rand2 = String.format("%d", rand1);
        if (password.contains(rand2)) {
            return true;
        }
        return false;
    }

    public boolean decimal() { // DECIMAL REQUIREMENT
        for (int i = 0; i < numbers.length; i++) {
            if (password.contains(numbers[i])) {
                if ((password.charAt(i + 1) == '.')){
                    if ((numList.contains(password.charAt(i + 2)))) {
                        return true;
                    }
                    else if (password.charAt(i--) == '.') {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean productFifty(){
        int product = 1;
        if(password.contains("0")){
            return false;
        }
        for (int i=0;i<password.length(); i++){
            for (int n = 0; n < numbers.length; n++) {
                if (password.substring(i, i+=1).equals(numbers[n])) {
                    product *= n+1;
                }
            }
        }
        return true;
    }
    public boolean sumThirty() {        //SUM OF THIRTY REQUIREMENT
        int sum = 0;
        for (int i = 0; i < password.length(); i++) {
            String y = String.valueOf(i + 1);
            for (int n = 0; n < numbers.length; n++) {
                if (password.substring(i, i+=1).equals(numbers[n])) {
                    sum += n+1;
                }
            }
        }
        if (sum == 30) {
            return true;
        }
        else {
            return false;
        }
    }
}




