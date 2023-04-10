package payment;
import java.util.*;

interface pay {
    public void paymentStartOption();
}

public class paymentStart implements pay {

    payment payment = new payment();
    
    public void paymentStartOption() {
        System.out.println("*************************************");
        System.out.println(" ");
        System.out.println(" . . . Payment method  . . . ");
        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println(" ");
        System.out.println("1. Cash");
        System.out.println("2. UPI");
        System.out.println("3. Credit Card");
        System.out.println("4. Debit Card");
        System.out.println("5. Exit");
        System.out.println("");
        System.out.println("Please select any one option");
        System.out.println("");
        Scanner scan12 = new Scanner(System.in);
        int option12 = 0;
        try {
            option12 = scan12.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter number");
            System.out.println("");
        }
        if (option12 == 1) {
            System.out.println("*************************************");
            System.out.println("");
            System.out.println(" * * *Cash Payment * * *");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("Please enter amount. . .");
            System.out.println("");
            Scanner scan20 = new Scanner(System.in);
            String option20 = null;
            try {
                option20 = scan20.next();
            } catch (Exception e) {
                System.out.println("Please enter number");
                System.out.println("");
            }
            payment.setCash(option20);
            System.out.println("");
            System.out.println("*************************************");
            System.out.println(payment.getCash() + ".00 /- Cash Received");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("Thank you for payment . . .");
            System.out.println("*************************************");
        }else if (option12 == 2){
            System.out.println("*************************************");
            System.out.println("");
            System.out.println(" * * *UPI Payment * * *");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("Please enter amount. . .");
            System.out.println("");
            Scanner scan22 = new Scanner(System.in);
            String option22 = scan22.next();

            payment.setAmount(option22);
            System.out.println("");
            System.out.println("Please enter you UPI id. . .");
            System.out.println("");
            Scanner scan20 = new Scanner(System.in);
            String option20 = scan20.next();

            payment.setUPI_ID(option20);
            System.out.println("");
            System.out.println("Please enter you UPI pin. . .");
            System.out.println("");
            Scanner scan21 = new Scanner(System.in);
            String option21 = scan21.next();
            payment.setUpiPin(option21);
            System.out.println("");
            System.out.println("*************************************");
            System.out.println(payment.getAmount() + ".00 /- Payment Received on UPI");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("Thank you for payment . . .");
            System.out.println("*************************************");
        } else if (option12 == 3){
            System.out.println("*************************************");
            System.out.println("");
            System.out.println(" * * *Credit Card Payment * * *");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("Please enter amount. . .");
            System.out.println("");
            Scanner scan22 = new Scanner(System.in);
            String option22 = scan22.next();
            payment.setAmount(option22);

            System.out.println("");
            System.out.println("Please enter you card number. . .");
            System.out.println("");
            Scanner scan20 = new Scanner(System.in);
            String option20 = scan20.next();
            payment.setCardNumber(option20);

            System.out.println("");
            System.out.println("Please enter you card month. . .");
            System.out.println("");
            Scanner scan23 = new Scanner(System.in);
            String option23 = scan23.next();
            payment.setCardMonth(option23);

            System.out.println("");
            System.out.println("Please enter you card year. . .");
            System.out.println("");
            Scanner scan24 = new Scanner(System.in);
            String option24 = scan24.next();
            payment.setCardYear(option24);

            System.out.println("");
            System.out.println("Please enter you card CVV number. . .");
            System.out.println("");
            Scanner scan25 = new Scanner(System.in);
            String option25 = scan25.next();
            payment.setCardCvv(option25);

            System.out.println("");
            System.out.println("Please enter you card pin. . .");
            System.out.println("");
            Scanner scan21 = new Scanner(System.in);
            String option21 = scan21.next();
            payment.setCarPin(option21);
            System.out.println("");
            System.out.println("*************************************");
            System.out.println(payment.getAmount() + ".00 /- Payment Received");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("Thank you for payment . . .");
            System.out.println("*************************************");
        }else if (option12 == 4){
            System.out.println("*************************************");
            System.out.println("");
            System.out.println(" * * *Debit Card Payment * * *");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("Please enter amount. . .");
            System.out.println("");
            Scanner scan22 = new Scanner(System.in);
            String option22 = scan22.next();
            payment.setAmount(option22);

            System.out.println("");
            System.out.println("Please enter you card number. . .");
            System.out.println("");
            Scanner scan20 = new Scanner(System.in);
            String option20 = scan20.next();
            payment.setCardNumber(option20);

            System.out.println("");
            System.out.println("Please enter you card month. . .");
            System.out.println("");
            Scanner scan23 = new Scanner(System.in);
            String option23 = scan23.next();
            payment.setCardMonth(option23);

            System.out.println("");
            System.out.println("Please enter you card year. . .");
            System.out.println("");
            Scanner scan24 = new Scanner(System.in);
            String option24 = scan24.next();
            payment.setCardYear(option24);

            System.out.println("");
            System.out.println("Please enter you card CVV number. . .");
            System.out.println("");
            Scanner scan25 = new Scanner(System.in);
            String option25 = scan25.next();
            payment.setCardCvv(option25);

            System.out.println("");
            System.out.println("Please enter you card pin. . .");
            System.out.println("");
            Scanner scan21 = new Scanner(System.in);
            String option21 = scan21.next();

            payment.setCarPin(option21);
            System.out.println("");
            System.out.println("*************************************");
            System.out.println(payment.getAmount() + ".00 /- Payment Received");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("Thank you for payment . . .");
            System.out.println("*************************************");
        }
        else if (option12 == 5){
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("Thank you . . . !");
            System.out.println("*************************************");
            System.out.println("");
        }else {
            System.out.println("Please enter correct number");
            System.out.println();
            paymentStartOption();
        }
    }
}
