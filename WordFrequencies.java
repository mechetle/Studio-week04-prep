import java.util.Scanner;

public class WordFrequencies {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numWords = scnr.nextInt();
      int n = 0;
      int i, j, k;

      // puts it into an array
      String[] words = new String[numWords];
      for (i = 0; i < numWords; i++) {
         words[i] = scnr.next();
      }

      // tallying
      for (j = 0; j < numWords; j++) {
         String stagedWord = words[j];

         for (k = 0; k < numWords; k++) {
            String comparingWord = words[k];
            if (comparingWord.equals(stagedWord)) {
               n++;
            }
         }

         // System.out.println(stagedWord);  // <-- for testing
         System.out.println(stagedWord + " - " + n);
         n = 0; // start over, CLear n value

      }

   }
}