import java.util.Scanner;

public class Dashboard {
    public static void main(String[] args) {
        Scanner inputBufferObj = new Scanner(System.in);
        //Calcalator program having two answers
        //First Answer
        //Take input
      /*  System.out.println("Please enter a Positive Number:  ");
        int number=inputBufferObj.nextInt();
        //process input
        System.out.println("The Multiplication Table for (" + number + "): ");
        // to calculate and disapaly the table by using the for loop
        for (int i = 1; i <= 10; i++) {
            int result = number * i;

        //output result
        System.out.println(number + "X" + i + " = " + result);
    }*/
        //Second Answer
       int number;
        while (true) {
            System.out.println("Please enter a \"Positive\" Number: ");
            if (inputBufferObj.hasNextInt()) {
                number = inputBufferObj.nextInt();
                if (number > 0) {
                    break;
                } else {
                    System.out.print("Invalid input.");
                }
            }
        }
        System.out.println("The Multiplication Table for (" + number + "): ");
                for (int i = 1; i <= 10; i++) {
                    //System.out.println(i+"X"+i+"="+i*i);
                    System.out.println(number + "X" + i + " = "+ number*i);
                }
                //End of the program



      /*  int noOfTucketsToProcess=3;
        int currentTicketNumber=1;
        while (currentTicketNumber<=noOfTucketsToProcess){


        System.out.println("Please enter you ticket number to check status: ");
        String ticketNumber=inputBufferObj.nextLine();
       // System.out.println("Please enter you ticket number to check status: ");
        // String ticketNumberTwo=inputBufferObj.nextLine();
        //System.out.println("Please enter you ticket number to check status: ");
        //String ticketNumberThree=inputBufferObj.nextLine();
        String dummyStatus="Pending";
        System.out.printf("The complain status of ticket %s is: %s \n", ticketNumber , dummyStatus);
        // System.out.printf("The complain status of ticket %s is: %s \n",ticketNumberTwo,dummyStatus);
        //System.out.printf("The complain status of ticket %s is: %s \n",ticketNumberThree,dummyStatus);
            currentTicketNumber=currentTicketNumber+1;

        }
        System.out.println("Ending of Execution  ");*/
    }

}