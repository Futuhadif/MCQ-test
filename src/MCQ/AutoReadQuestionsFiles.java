package MCQ;

import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AutoReadQuestionsFiles extends Quest{

    File fileInput;
    Scanner sc, userInput;
    String q,a,b,c,d,answer;
    String data;
    String choosed;
    File[] files;
    int selected;

    public void startTest(){
        userInput = new Scanner(System.in);

        try {
            fileInput = new File("src\\set");
            files = fileInput.listFiles();
            System.out.println("please select a set of questions below");
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName().replace(".csv","");
                System.out.println(i+fileName);
            }
            System.out.print("Choose your Quest : ");
             selected = userInput.nextByte();
            selected -=1;

            sc = new Scanner(files[selected]);

        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }


        System.out.println();
        choosed = files[selected].getName();


        data = sc.nextLine();
        System.out.println(data);
        int i = 1;

        if (choosed.equals("javaQuestions.csv")){
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
        }else{
            while (i <= 10){
                StringTokenizer st = new StringTokenizer(data,";");
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
        }

        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("Name : %s Score : %d",getName(),getScore());
        System.out.println("\n\t\tEND");
    }
}
