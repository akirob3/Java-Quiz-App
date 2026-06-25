package quizz;
import java.util.Scanner;

public class QuestionService
{
    Questions[] question = new Questions[3];
    String[] selection = new String[3];


    public QuestionService()
    {
        question[0] = new Questions(1,"whats the language that is object oriented?. ","java","python","cpp","java");
        question[1] = new Questions(2,"what is the language that is used for ML?. ","java","python","cpp","python");
         question[2] = new Questions(3,"what was the language tool pubg was build with?. ","java","python","cpp","cpp");
        
    }

    public void playQuiz()
    {
        Scanner sc = new Scanner(System.in);
        int i=0;
        for(Questions q:question)
        {
            System.out.println("Question no. : "+ q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            selection [i]=sc.nextLine();
            i++;
        }
        sc.close();
       

        for(String s:selection)
        {
            System.out.println(s);
        }
    }

    public void displayScore()
    {
        int score =0;
        for(int i =0;i<question.length;i++)
        {
            Questions que = question[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];


            if(actualAnswer.equals(userAnswer))
            {
                    score++;
            }
            
        }
        System.out.println("Your score is: "+score);
    }
}
