package Genopfriskning;

import java.util.Locale;
import java.util.Scanner;

/*
Skriv en metode, der tager imod en sætning af ord med mellemrum imellem. Sætningen ændres efter følgende regler:
        • Ord, som udelukkende er skrevet med store bogstaver, skal ikke ændres.
        • Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav.
        • Ord på max. 3 bogstaver skal skrives med småt.
 */
public class ProperCase {
    public static void main(String[] args) {

        Scanner userSentence = new Scanner(System.in);
        System.out.println("Write a sentence!");
        String sentence = userSentence.nextLine();

        System.out.println(changedSentence(sentence));
    }

    public static String changedSentence (String sentence) {

        String[] wordsInSentence = sentence.split(" ");

        String newSentence = "";

        for (int i = 0; i < wordsInSentence.length; i++) {
            if (!wordsInSentence[i].equals(wordsInSentence[i].toLowerCase())){
                if(wordsInSentence[i].length() > 3){
                    String wholeWord = wordsInSentence[i].toLowerCase();
                    String firstLetter = wholeWord.substring(0,1).toUpperCase();

                    newSentence += firstLetter + " ";
                }

            }
            else {
                newSentence += wordsInSentence[i] +" ";
            }
        }

        return newSentence;
    }


}
