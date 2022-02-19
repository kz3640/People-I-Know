import java.util.Date;      //Date class for dates
import java.util.Scanner;   //Scanner class for input
import java.util.Hashtable; //Hashtable

public class database {
    private static Hashtable<String, Person> allPeople;

    public static String[] takeInput() {
    /**
     * Prompts the user for an input and returns the input split by " "
     *
     * @return The user's input split by " " in an array
     */
        Scanner input = new Scanner(System.in);
        String rawUserInput = input.nextLine();
        String[] splitUserInput = rawUserInput.split(" ", 0);
        return splitUserInput;
    }
    public static boolean addPerson(String[] splitUserInput) {
    /**
     * Creates a new person with the name specified, and adds it to the
     * hashtable
     *
     * @param splitUserInput The rawUserInput split by " "
     * @return true if successful, false otherwise
     */
        int id = allPeople.size();
        Person thisPerson = new Person(id, 
        splitUserInput[1], splitUserInput[2]);
        if(allPeople.put(
        splitUserInput[1]+" "+splitUserInput[2], thisPerson) == null) {
            return true;
        }
        return false;
    }
    public static boolean doUserInput(String[] splitUserInput) {
    /**
     * Acts on a user input by calling helper methods, then prints if the
     * command worked
     *
     * @param splitUserInput The rawUserInput split by " "
     * @return true if successful, false otherwise
     */
        //Command info
        int commandIndex = 0;

        //See what the first word in the user input is
        switch(splitUserInput[commandIndex]) {
            case "add":
                if(addPerson(splitUserInput)) {
                    System.out.println("Add Success!");
                }
                else {
                    System.out.println("Add aborted.");
                }
                break;
            case "delete":
                break;
            case "edit":
                break;
            case "get":
                break;
            case "search":
                break;
            case "help":
                break;
        }

        //Invalid command
        System.err.println(splitUserInput[commandIndex] + 
        " is not a valid command.");
        return false;

    }
    public static void main(String args[]) {
        System.out.println("Hello");
        takeInput();
    }
}
