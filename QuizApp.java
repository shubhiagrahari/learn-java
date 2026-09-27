import java.util.*;
import java.io.*;

// Question Class
class Question {
    String text;
    String[] options;
    int correctIndex;

    Question(String text, String[] options, int correctIndex) {
        this.text = text;
        this.options = options;
        this.correctIndex = correctIndex;
    }

    boolean checkAnswer(int choice) {
        return choice == correctIndex;
    }
}

// Player Class
class Player {
    String name;
    int score = 0;

    Player(String name) {
        this.name = name;
    }

    void updateScore() {
        score++;
    }
}

// Timer Thread
class TimerTask implements Runnable {
    private int seconds;

    TimerTask(int seconds) {
        this.seconds = seconds;
    }

    public void run() {
        try {
            for (int i = seconds; i > 0; i--) {
                // System.out.println("⏳ Time left: " + i + " sec");
                Thread.sleep(1000);
            }
            System.out.println("Time's up!");
        } catch (InterruptedException e) {
            System.out.println("Timer stopped.");
        }
    }
}

// Quiz Class
public class QuizApp {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Player setup
        System.out.print("Enter your name: ");
        Player player = new Player(sc.nextLine());

        // Questions (hardcoded for now)
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("Capital of India?", new String[]{"Delhi", "Mumbai", "Kolkata"}, 0));
        questions.add(new Question("2 + 2 = ?", new String[]{"3", "4", "5"}, 1));
         questions.add(new Question("Birthday of Mahatma Gandhi ?", new String[]{"3 oct", "27 nov", "2 oct"}, 2));
               questions.add(new Question("2 * 2 = ?", new String[]{"0", "4", "5"}, 3));
                     questions.add(new Question("covid year = ?", new String[]{"2020", "2022", "2021"}, 4));


        // Quiz loop
        for (Question q : questions) {
            System.out.println("\n" + q.text);
            for (int i = 0; i < q.options.length; i++) {
                System.out.println((i + 1) + ". " + q.options[i]);
            }

            // Start timer thread
            Thread timer = new Thread(new TimerTask(10));
            timer.start();

            int ans = sc.nextInt();
            timer.interrupt(); // stop timer if answered

            if (q.checkAnswer(ans - 1)) {
                System.out.println(" Correct!");
                player.updateScore();
            } else {
                System.out.println(" Wrong!");
            }
        }

        // Final score
        System.out.println("\n" + player.name + ", your score: " + player.score);

        // Save score to file
        FileWriter fw = new FileWriter("scores.txt", true);
        fw.write(player.name + " - " + player.score + "\n");
        fw.close();
        // Show old scores (Leaderboard)
System.out.println("\n--- Leaderboard ---");
try {
    BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
    br.close();
} catch (IOException e) {
    System.out.println("No previous scores found.");
}

    }
}
