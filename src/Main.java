
public class Main {

    public static void main(String args[]) {
        String question = "What is the largest planet of the Solar System?";
        String choiceOne = "Earth";
        String choiceTwo = "Jupiter";
        String choiceThree = "Saturn";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println("What is the largest planet of the Solar System?");
                           
        // Write a print statement giving the answer choices
        System.out.println("Choose one of the following: " + choiceOne + " ," + choiceTwo + " ," + choiceThree + ".");

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        
        // Retrieve the user's input
        String input = scanner.next();

        // If the user's input matches the correctAnswer...
        if(correctAnswer.equals(input)) {
            System.out.println("Congratulations! You are correct!");
        } else {
            System.out.println("You are incorrect. The correct answer is: " + choiceTwo);
        }
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was..

    }

}
