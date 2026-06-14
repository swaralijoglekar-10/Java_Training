package brandNewJavaLearning.QuestionsSolved;

import java.util.Scanner;

public class DSAStringQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        String decryptedMessage = decryptMessage(encryptedMessage);
        System.out.println(decryptedMessage);

//        Input:-
//                seaside the to sent be to ne2ds army ten of team a
//
//        Expected Output:-
//                a team of ten army needs to be sent to the seaside

    }

    public static String decryptMessage(String encryptedMessage) {

        String[] words = encryptedMessage.split(" "); // string array
        String answer = "";
        for (int i = words.length - 1; i >= 0; i--) {  // start with last string in the array
            String oneWord = words[i];

            for (int j = 0; j <= oneWord.length() - 1; ) {
                char ch = oneWord.charAt(j); // current character in the word
                char nextCh;
                int asciiValue; // to represent the ascii value of next character

                if (j != oneWord.length() - 1) {
                    nextCh = oneWord.charAt(j + 1);
                    asciiValue = nextCh;


                    if (asciiValue >= 49 && asciiValue <= 57) { // digits 1 to 9 in ascii
                        // repeat the character ch asciiValue number of times
                        // and attach the resulting string with answer string

                        int frequency = Integer.parseInt(String.valueOf(nextCh));
                        String repeatedString = String.valueOf(ch).repeat(frequency);
                        answer += repeatedString;
                        if (j != oneWord.length() - 2) // for 2nd last character in the word
                            j += 2; //in case when digit is the last character in the string, we can't go beyond
                        else
                            j += 1;

                    } else {
                        answer += oneWord.charAt(j);
                        j += 1;
                    }
                }
                else{
                    j+=1;
                }

            }

            answer += " ";

        }

        return answer;

    }

}





