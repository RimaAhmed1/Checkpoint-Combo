import java.util.Scanner;

public class TicketCLItoGitHub {
    public static void main(String[]args){
        Scanner inputBuffObj=new Scanner(System.in);
        int maxNoOfTickets=5;
        int [] customerTickets=new int[maxNoOfTickets];
        for (int currentNoOfTickets = 0; currentNoOfTickets < maxNoOfTickets; currentNoOfTickets++) {
            System.out.printf("[%d] Please enter your Ticket Number: ", currentNoOfTickets);
            customerTickets[currentNoOfTickets] = inputBuffObj.nextInt();
        }
        for (int currentNoOfTickets=0; currentNoOfTickets<maxNoOfTickets;currentNoOfTickets++) {
            System.out.printf("Tickets number: %s, The Number of the Tickets: %s \n", currentNoOfTickets,customerTickets[currentNoOfTickets]);
        }
    }


}
