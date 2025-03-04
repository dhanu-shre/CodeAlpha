import java.util.HashMap;
import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        HashMap<String, String> responses = new HashMap<>();
        responses.put("hello", "Hi there! How can I help you?");
        responses.put("how are you", "I'm just a bot, but I'm doing fine!");
        responses.put("bye", "Goodbye! Have a great day!");
        responses.put("default", "Sorry, I didn't understand that.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("bye")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            String response = responses.getOrDefault(userInput, responses.get("default"));
            System.out.println("Chatbot: " + response);
        }

        scanner.close();
    }
}