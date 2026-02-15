import java.util.Scanner;

public class TicketCLItoGitHub {
    public static void main(String[]args){
        Scanner inputBuffObj=new Scanner(System.in);
        int maxNoOfFeedback=5;
        String [] customerFeedback=new String[maxNoOfFeedback];
        for (int currentNoOfTickets = 0; currentNoOfTickets < maxNoOfFeedback; currentNoOfTickets++) {
            System.out.printf("[%d] Please enter your Feedback Number: ", currentNoOfTickets);
            customerFeedback[currentNoOfTickets] = inputBuffObj.nextLine();
        }
        for (int currentNoOfFeedback=0; currentNoOfFeedback<maxNoOfFeedback;currentNoOfFeedback++) {
            System.out.printf("Feedback number: %d, The Feedback: %s \n", currentNoOfFeedback,customerFeedback[currentNoOfFeedback]);
        }
    }


}
