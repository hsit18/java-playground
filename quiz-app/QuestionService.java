import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "First Questions", "1", "2", "3", "4", "2");
        questions[1] = new Question(2, "Second Questions", "1", "2", "3", "4", "2");
        questions[2] = new Question(3, "Third Questions", "1", "2", "3", "4", "2");
        questions[3] = new Question(4, "Forth Questions", "1", "2", "3", "4", "2");
        questions[4] = new Question(5, "Fivth Questions", "1", "2", "3", "4", "2");
    }

    public void displayQuestions() {
        for(Question q : questions) {
            System.out.print("Question: " + q.getId());
            System.out.println(" "+ q.getQuestion());
            System.out.println("Option1  "+ q.getOpt1());
            System.out.println("Option2  "+ q.getOpt2());
            System.out.println("Option3  "+ q.getOpt3());
            System.out.println("Option4  "+ q.getOpt4());
            System.out.println();
            Scanner sc = new Scanner(System.in);
            String userAnswer = sc.nextLine();
            System.out.println(userAnswer+"   "+ q.getAnswer());
            if(q.getAnswer().equals(userAnswer)) {
                System.out.println("Correct Answer");
            } else {
                System.out.println("Wrong Answer");
            }
        }
        
    }
}
