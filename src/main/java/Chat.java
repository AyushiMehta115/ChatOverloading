import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Chat {

    // List of members in chat.
    private List<String> members;

    // List of files in chat.
    private List<Integer> files;

    // List of all the messages in the chat.
    private HashMap<Integer, String> message;

    String memberError="";
    String fileError="";
    String messageError="";

    Chat() {
        members = new ArrayList<>();
        files = new ArrayList<>();
        message = new HashMap<>();
    }

    // Adding members
    void add(String[] names) {
        members.addAll(Arrays.asList(names));
    }

    // Adding files
    void add(int[] ids) {
        for (int id : ids) {
            files.add(id);
        }
    }

    // Adding messages
    void add(int id, String newMessage) {
        message.put(id, newMessage);
    }

    // Removing members
    void remove(String[] names) {
        for (String name : names) {
            if (members.contains(name)) {
                members.remove(name);
            } else {
                System.out.println("Member with name " + name + " does not exist.");
                //memberError="Member with name " + name + " does not exist.";
            }
        }
    }

    // Removing files
    void remove(int[] ids) {
        for (int id : ids) {
            if (files.contains(id)) {
                files.remove(Integer.valueOf(id));
            } else {
                System.out.println("File with id " + id + " does not exist.");
                //fileError="File with id " + id + " does not exist.";
            }
        }
    }

    // Removing messages
    void remove(int id) {
        if (message.containsKey(id)) {
            message.remove(id);
        } else {
            System.out.println("Message with id " + id + " does not exist.");
            //messageError="Message with id " + id + " does not exist.";
        }
    }

    // Printing the conversation
    void printConversation() {
//        System.out.println(memberError);
//        System.out.println(fileError);
//        System.out.println(messageError);
        // Members
        System.out.println("Total number of members in this conversation are " + members.size());

        // Names
        StringBuilder names = new StringBuilder();
        for (String member : members) {
            names.append(member).append(" ");
        }

        System.out.println("The names of these members are " + names.toString().trim());

        // Files
        System.out.println("Total number of files in this conversation are " + files.size());


        // Messages
        StringBuilder messageBuilder = new StringBuilder();

        for (int key : message.keySet()) {
            messageBuilder.append("'").append(message.get(key)).append("'").append(" ");
        }

        System.out.println("The messages in the conversation are " + messageBuilder.toString().trim());
    }
}
