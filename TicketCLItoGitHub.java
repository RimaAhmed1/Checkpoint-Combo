import java.util.Scanner;

public class TicketCLItoGitHub {
    public static void main(String[]args) throws InterruptedException{
        //Declare
        Scanner inputBuffObj= new Scanner(System.in);
        int maxNoOfFeedbacks=5;
        boolean keepRunning=true;

        String [] customerFeedbacks=new String[maxNoOfFeedbacks];

        //Input
        for (int currentNoOfFeedback=0; currentNoOfFeedback<maxNoOfFeedbacks;currentNoOfFeedback++) {
            System.out.printf("[%d] Please enter your feedback: ", currentNoOfFeedback);
            customerFeedbacks[currentNoOfFeedback]=inputBuffObj.nextLine();
        }
        //process
        //output

    }
}
