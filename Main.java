public class Main {
        public static void main(String[] args) {
        String error = "We have ran into an error here \n ....";
        try {
            new AWT();
        }
        catch (ArithmeticException | NullPointerException | IndexOutOfBoundsException e){
            catchError(error);
        }
    }
    public static void catchError(String word2){
        System.out.println(word2);
        System.out.println(new Game());
    }

}
