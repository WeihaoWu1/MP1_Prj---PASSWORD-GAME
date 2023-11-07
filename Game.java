//import java.security.KeyStore;
import java.util.*;
import java.util.List;

public class Game {
    private int chessNum;
    private String password;
    private Integer sums;
    private final String introduction = "Welcome to the Password Game!";
    private Integer attempts;
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
    private final String[] Chess = {"chess1.png", "chess2.png", "chess3.png", "chess4.png", "chess5.png", "chess6.png", "chess7.png", "chess8.png", "chess9.png", "chess10.png"};
    private final String[] chessAnswers = {"Nxc4#","Ne2#", "Qg7#", "Ne8#", "Nf1#", "axb5#", "Rh8#", "Bxb5#", "Rc1#", "dxe6#"};
    private final String[] captcha ={"captcha1.png", "captcha2.png", "captcha3.png", "captcha4.png", "captcha5.png", "captcha6.png", "captcha7.png", "captcha8.png", "captcha9.png", "captcha10.png"};
    private final String[] captchaAnswers ={"bdg84", "2x7bm","m67b3","y4n6m","7wyp4", "b28g8","2x7bm","3den6","rg8ecm","ecd4w"};
    private final String[] countries ={"thailand.png","turkey.png","usa.png","england.png", "china.png,","japan.png","france.png","italy.png","india.png","northkorea.png"};
    private final String[] countriesAnswers = {"thailand", "turkey", "unitedstates","england", "china","japan", "france","italy","india","northkorea"};
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

    public String chess(int chessN){

        return Chess[chessN];
    }

    public boolean checkChess(int chessN){
        if(password.contains(chessAnswers[chessN])) return true;
        return false;
    }

    public String captcha(int captchaN){
        return captcha[captchaN];
    }

    public boolean checkCaptcha(int captchaN){
        if(password.contains(captchaAnswers[captchaN])) return true;
        return false;
    }

    public boolean lengthPassword(){
        if(password.contains(String.valueOf(password.length()))) return true;
        return false;
    }

    public String countries(int countriesN){
        return countries[countriesN];
    }

    public boolean checkCountries(int countriesN){
        if(password.toLowerCase().contains(countriesAnswers[countriesN])) return true;
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
    public static String calculateScore(int attempts) {
        double percentage = .000001;
        int formula = (int) (percentage * Integer.MAX_VALUE * attempts + .5);
        return String.valueOf(("Your Score is: " + (formula) + " and it took you " + attempts + " tries!"));
    }

    public static double calculateScore(double attempts) { //this is never actually used - Mr. Holmer plz give credit for this
        double percentage = .000001;
        double formula = (double) (percentage * Integer.MAX_VALUE * attempts + .5);
        return Integer.parseInt((("Your Score is: " + (formula) + "and it took you " + attempts + "tries!")));
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
        int rand1 = (int) (Math.random() * (9 - 69 + 69) + 2);
        rand1--;
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

    public boolean sumFourty() {        //SUM OF FOURTY REQUIREMENT
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
        if (sum == 40) {
            return true;
        } else {
            return false;
        }
    }
}




