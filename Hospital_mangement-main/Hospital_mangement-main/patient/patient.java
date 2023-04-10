package patient;

import payment.*;
import java.util.*;
import login.login;
import registration.registration;
import appointment.*;

interface patie {
  public void patientStart();

  public void patientOption();

  public void patientOptionMore();
}

public class patient implements patie {
  login login = new login();
  appointmentMangement appointmentMangement = new appointmentMangement();

  public void patientStart() {
    System.out.println("3. Patient Management");
  }

  public void patientOption() {
    System.out.println("");
    System.out.println("1. Registration");
    System.out.println("2. Login");
    System.out.println("3. Exit");
    System.out.println("");
    System.out.println("Please select any option . . .");

    Scanner scan3 = new Scanner(System.in);
    int optionAdmin = 0;
    try {
      optionAdmin = scan3.nextInt();
    } catch (Exception e) {
      System.out.println("Please enter number" + e.getMessage());
      System.out.println("");
    }

    if (optionAdmin == 1) {
      registration registrat = new registration();
      registrat.registra("Patient");
    } else if (optionAdmin == 2) {
      login.userLogin("Patient");
    } else if (optionAdmin == 3) {
      System.out.println("*************************************");
      System.out.println("Thank you . . . !");
      System.out.println("*************************************");
    } else {
      System.out.println("");
      System.out.println(" * * * Please enter correct number * * * ");
      System.out.println("");
      patientOption();
    }
  }

  public void patientOptionMore() {
    System.out.println(" . . . Welcome to Patient Management  . . . ");
    System.out.println(" ");
    System.out.println("1. Make appointment");
    System.out.println("2. Appointment status");
    System.out.println("3. Cancel appointment");
    System.out.println("4. Payment");
    System.out.println("5. Exit");
    System.out.println("");
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
      System.out.println(" * * *Create New Appointment * * *");
      System.out.println("");
        System.out.println("*************************************");
      patientAppoint patientAppoint = new patientAppoint();
      patientAppoint.add();

    } else if (option12 == 2) {
      System.out.println("*************************************");
      System.out.println("");
      System.out.println(" * * * Not found any Appointment status * * * ");
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("");
      System.out.println("1. Go To Patient Management");
      System.out.println("2. Exit");
      System.out.println("");
      System.out.println("Please select any one option");
      System.out.println("");
      Scanner scan15 = new Scanner(System.in);
      int option15 = 0;
      try {
        option15 = scan15.nextInt();
      } catch (Exception e) {
        System.out.println("Please enter number");
        System.out.println("");
      }
      if (option15 == 1) {
        patientOptionMore();
      } else if (option15 == 2) {
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("Thank you . . . !");
        System.out.println("*************************************");
      }else{
        System.out.println("please enter correct number");
      }

    } else if (option12 == 3) {
      System.out.println("*************************************");
      System.out.println("");
      System.out.println(" * * * Not found any Cancel appointment * * * ");
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("");
      System.out.println("1. Go To Patient Management");
      System.out.println("2. Exit");
      System.out.println("");
      System.out.println("Please select any one option");
      System.out.println("");
      Scanner scan15 = new Scanner(System.in);
      int option15 = 0;
      try {
        option15 = scan15.nextInt();
      } catch (Exception e) {
        System.out.println("Please enter number");
        System.out.println(" ");
      }
      if (option15 == 1) {
        patientOptionMore();
      } else if (option15 == 2) {

        System.out.println("");
        System.out.println("*************************************");
        System.out.println("Thank you . . . !");
        System.out.println("*************************************");
      }
      else{
        System.out.println("please enter correct number");
      }
    } else if (option12 == 4) {

      paymentStart paymentStart = new paymentStart();
      paymentStart.paymentStartOption();

    } else if (option12 == 5) {

      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Thank you . . . !");
      System.out.println("*************************************");

    } else {
      System.out.println("Please enter correct number");
      System.out.println("");
      patientOptionMore();
    }
  }
}
