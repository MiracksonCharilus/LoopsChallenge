import java.util.Scanner;
public class LoopsChallenge {

    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        question11();
        question12();


    }

    public static void question1() {
        System.out.println("Question 1: ");
        int Qi = 0;

        while (Qi < 4) {
            System.out.println("Hello");
            Qi++;
        }
    }

    public static void question2() {
        System.out.println("Question 2: ");
        int numQ2 = 5;
        numQ2 = numQ2 + 1;
        do{
            numQ2 = numQ2 + 2;
        System.out.println(numQ2);}
        while (numQ2 < 13) ;
    }

    public static void question3() {
        System.out.println("Question 3: ");
        Scanner keyboard = new Scanner(System.in);
        int userInputQ3;
        do {
            System.out.println("Enter a number between 3 and 7, inclusive");
            userInputQ3 = keyboard.nextInt();
            keyboard.nextLine();
        }
        while(userInputQ3 < 3 || userInputQ3 > 7);
        }

    public static void question4() {
        System.out.println("Question4: ");

        for (int Q4i = 1; Q4i <= 12; ++Q4i)
        {
            System.out.println(Q4i * 5);
        }
    }

    public static void question5() {
        System.out.println("Question 5: ");

        int Q5i;
        for (Q5i = 10; Q5i >= 0; Q5i -= 2) {
            System.out.println(Q5i);
        }

    }

    public static void question6() {
        System.out.println("Question 6: ");

        int Q6i;
        for (Q6i = 12; Q6i >= 0; Q6i -= 3) {
            System.out.println(Q6i);
        }

    }

    public static void question7() {
        System.out.println("Question 7: ");

        int Q7i;
        for (Q7i = 10; Q7i <= 20; Q7i += 5) {
            int numCountQ7;
            //System.out.println(numCountQ7);
            System.out.println(Q7i);
        }
    }

    public static void question8() {
        System.out.println("Question 8: ");
        System.out.println("Enter a number that is divisible by 3");
        Scanner keyboard = new Scanner(System.in);
        int userInputQ8 = keyboard.nextInt();
        int Q8i;
        int numQ8 = 0;
        for (Q8i = userInputQ8; Q8i >= 0; Q8i -= 3) {
            numQ8 = Q8i;}
        if (numQ8 == 0){
            System.out.println("The number " + userInputQ8 + " is divisible" );}
        else {
            System.out.println("The number " + userInputQ8 + " is NOT divisible" );}
        }



    public static void question9() {
        System.out.println("Question 9: ");
        /* String wordQ9 = "red";
        char charq9;
        for (int Q9i = 0; Q9i <= 2; Q9i++) {

             charq9 = wordQ9.charAt(Q9i);
             charq9 = charq9 + 3;

            numQ8 = Q8i;

            String newWordq9 = newWordq9 + charq9;
        }
        char Q9c1 =  wordQ9.charAt(0);
        char Q9c2 =  wordQ9.charAt(1);
        char Q9c3 =  wordQ9.charAt(2);
        Q9c3 = Q9c3 +

         */
        System.out.println("Enter your favorite pet.");
        Scanner keyboard = new Scanner(System.in);
        String favPet = keyboard.nextLine();
        if (!(favPet.equalsIgnoreCase("dog") ||
        favPet.equalsIgnoreCase("cat") ||
        favPet.equalsIgnoreCase("bird") ||
                favPet.equalsIgnoreCase("fish")) ){
            System.out.println("Valid : " + favPet);
        }
        else {
            System.out.println("Invalid : " + favPet);
        }
    }

    public static void question10() {
        System.out.println("Question 10: ");
        System.out.println("Enter a word to scramble.");
        Scanner keyboard = new Scanner(System.in);
        String userInput = keyboard.nextLine();

        char userChar;
        int charAscii;
        String charStr;
        String newStr = "";
        for (int i = 0; i < userInput.length(); ++i) {
            userChar = userInput.charAt(i);
            charAscii = (int)userChar + 3;
            charStr = Character.toString(charAscii);

            newStr += charStr;
        }
        System.out.println(newStr);

    }

    public static void question11() {
        System.out.println("Question 11: ");

    }

    public static void question12() {
        System.out.println("Question 12: ");

    }
}
