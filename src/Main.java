// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    int number = 10;
    check(number,10,5);
    }
    public static boolean check(int x , int bigger , int smaller){
        if(x > bigger || x < smaller){
            throw new ArithmeticException();
        }else{
            return true;
        }
    }
}