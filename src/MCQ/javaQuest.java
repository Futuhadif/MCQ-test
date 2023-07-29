package MCQ;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class javaQuest extends Quest{
    File fileInput;
    Scanner sc, userInput;
    String q,a,b,c,d,answer;
    String data;
    public void GetQuestions(){
        userInput = new Scanner(System.in);
        try {
            fileInput = new File("javaQuestions.csv");
            sc = new Scanner(fileInput);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        data = sc.nextLine();

        int i = 1;
        while (i <= 10){
            StringTokenizer st = new StringTokenizer(data,"-");
            q = st.nextToken(); a = st.nextToken(); b = st.nextToken(); c = st.nextToken(); d = st.nextToken();
            answer = st.nextToken();

            String correctAnswerIs = Character.toString(answer.charAt(0));

            System.out.println("-------------------------------------------------------------");
            System.out.println(q);
            System.out.println(" "+a);
            System.out.println(" "+b);
            System.out.println(" "+c);
            System.out.println(" "+d);
            System.out.print("your answer is : ");
            String yourAnswer = userInput.next();
            while ( !(yourAnswer.equals("a")) && !(yourAnswer.equals("b")) && !(yourAnswer.equals("c")) && !(yourAnswer.equals("d"))){
                System.out.println("Sorry please select a, b ,c, or d");
                yourAnswer = userInput.next();
            }
            if (yourAnswer.equalsIgnoreCase(correctAnswerIs)){
                //to making the response of the correct answer more variative
                Random random = new Random();
                int generateRandom = random.nextInt(3);

                if (generateRandom == 0){
                    System.out.println("GREAT!!");
                }else if (generateRandom == 1){
                    System.out.println("GOOD!!");
                }else {
                    System.out.println("NICE!!");
                }
                correct+=1;
            }else {
                System.out.println("your answer is wrong. The Correct Answer is " +answer);
            }
            data = sc.nextLine();
            i++;
        }
        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("Name : %s Score : %d",getName(),getScore());
        System.out.println("\n\t\tEND");
    }
}
