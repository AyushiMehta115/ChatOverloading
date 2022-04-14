import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] lineArray = sc.nextLine().split(" ");

        // New Class Model
        Chat newChat = new Chat();

        newChat.add(lineArray);

        lineArray = sc.nextLine().split(" ");

        int[] files = new int[lineArray.length];
        for (int i = 0; i < lineArray.length; i++) {
            files[i] = Integer.parseInt(lineArray[i]);
        }
        newChat.add(files);

        String line = sc.nextLine();
        int numberOfMessages = Integer.parseInt(line);

        for (int i = 0; i < numberOfMessages; i++) {
            line = sc.nextLine();
            newChat.add(i, line);
        }

        lineArray = sc.nextLine().split(" ");
        newChat.remove(lineArray);

        lineArray = sc.nextLine().split(" ");
        int[] filesRemoved = new int[lineArray.length];
        for (int i = 0; i < lineArray.length; i++) {
            filesRemoved[i] = Integer.parseInt(lineArray[i]);
        }
        newChat.remove(filesRemoved);

        lineArray = sc.nextLine().split(" ");
        for (int i = 0; i < lineArray.length; i++) {
            newChat.remove(Integer.parseInt(lineArray[i]));
        }

        newChat.printConversation();
    }
}
