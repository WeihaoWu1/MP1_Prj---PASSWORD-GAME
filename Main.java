//import java.awt.*;
//import java.awt.event.*;
//import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        String error = "We have ran into an error here \n ....";
        try {
            new AWT();
//            Game g = new Game("adz555555victor-winteraprilXXV", 0);
//            System.out.println(g.getPassword());
//            g.updatePassword("skibidi");
//            System.out.println(g.getPassword());

        }
        catch (ArithmeticException | NullPointerException | IndexOutOfBoundsException e){
            catchError(error);
        }
    }
    public static void catchError(String word){
        System.out.println(word);
    }

}
