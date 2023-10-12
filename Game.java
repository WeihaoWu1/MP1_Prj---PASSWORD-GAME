import java.security.KeyStore;
import java.util.Scanner;
public class Game
{
    private String password;
    private final String[] months = {"january", "february", "march", "april", "may", "june",
            "july", "august", "september", "october", "november", "december" };
    private final String[] specialCharacters = {",", "<", ".", ">", "/", "?", ";", ":", "'",
            "\"\"", "[", "{", "]", "}", "`", "~", "!", "@", "#", "$", "%",
            "^", "&", "*", "(", ")", "-", "_", "=", "+", "\\", "|"};
    private final String[] seasons = {"winter", "summer", "fall", "autumn", "spring"};
    private final String[] upperCaseLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M","N","O", "P","Q","R","S","T","U","V","W", "X","Y", "Z"};

    public Game(String pass){
        password = pass;

    }
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
    public boolean capitalLetter() { // CAPITAL LETTER REQUIREMENT
        for (int i = 0; i < upperCaseLetters.length; i++) {
            if (password.contains(upperCaseLetters[i])) {
                return true;
            }
        }
        return false;
    }
    public boolean season(){ // SEASON REQUIREMENT
        for (int i = 0; i < seasons.length; i++){
            if(password.contains(seasons[i])){
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
    public boolean romanNumerals(){ // ROMAN NUMERAL REQUIREMENT
        if (password.endsWith("XXV")){
            return true;
        }
        return false;
    }
    public boolean randNumber(){ // RANDOM REQUIREMENT
        int rand1 = (int)(Math.random()*(9-1+1) + 1);
        String rand2 = String.format("%d", rand1);
        if (password.contains(rand2)){
            return true;
        }
        return false;
    }
    public boolean decimal() {
        return false;
    }
}



