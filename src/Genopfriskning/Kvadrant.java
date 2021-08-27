package Genopfriskning;

public class Kvadrant {
    public static void main(String[] args) {
        printSqare(5, "#");
    }

    public static void printSqare (int num, String symbol){
        for(int k = 0; k < num; k++){
            for(int i = 0; i < num; i++){
                System.out.print(symbol + " ");
            }
            System.out.println(symbol + " ");
        }
    }
}
