package doctor;

import prescription.*;
import java.util.*;
import login.*;
import registration.registration;

interface doct {
  public void doctorStart();

  public void doctorOption();

  public void doctorOptionMore();

  public void appointConfirm();

  public void appointPending();

  public void appointHistory();

  public void appointCancel();
}

public class doctor implements doct {
  login login = new login();

  public void doctorStart() {
    System.out.println("2. Doctor Management");
  }

  public void doctorOption() {
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
      System.out.println("Please enter number " + e.getMessage());
      System.out.println("");
    }

    if (optionAdmin == 1) {
      registration registrat = new registration();
      registrat.registra("Doctor");
    } else if (optionAdmin == 2) {
      login.userLogin("Doctor");
    } else if (optionAdmin == 3) {
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Thank you . . . !");
      System.out.println("******************************");
    } else {
      System.out.println("");
      System.out.println(" * * * Please enter correct number * * * ");
      System.out.println("");
      doctorOption();
    }
  }

  public void appointConfirm() {
    System.out.println("*************************************");
    System.out.println("");
    System.out.println(" * * *Confirm Appointment * * *");
    System.out.println("");
    System.out.println("*************************************");

    appointConfirm appointConfirm = new appointConfirm();
    for (int i = 0; i < appointConfirm.appointmentCon.length; i++) {
      for (int j = 0; j <= 0; j++) {
        System.out.print(Arrays.toString(appointConfirm.appointmentCon[i]));
      }
      System.out.println();
    }
    System.out.println("");
    System.out.println("1. Go To Doctor Management");
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
    }
    if (option15 == 1) {
      doctorOptionMore();
    } else if (option15 == 2) {
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Thank you . . . !");
      System.out.println("*************************************");
    } else {
      System.out.println("Please enter correct number");
      System.out.println("");
      appointConfirm();
    }
  }

  public void appointPending() {
    System.out.println("*************************************");
    System.out.println("");
    System.out.println(" * * *Pending Appointment * * *");
    System.out.println("");
    System.out.println("*************************************");

    appointPending appointPending = new appointPending();
    for (int i = 0; i < appointPending.appointmentPen.length; i++) {
      for (int j = 0; j <= 0; j++) {
        System.out.print(Arrays.toString(appointPending.appointmentPen[i]));
      }
      System.out.println();
    }
    System.out.println("");
    System.out.println("1. Go To Doctor Management");
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
      doctorOptionMore();
    } else if (option15 == 2) {
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Thank you . . . !");
      System.out.println("*************************************");
    } else {
      System.out.println("Please enter correct number");
      System.out.println("");
      appointPending();
    }
  }

  public void appointHistory() {
    System.out.println("");
    System.out.println(" * * *History Appointment * * *");
    System.out.println("");

    appointHistory appointHistory = new appointHistory();
    for (int i = 0; i < appointHistory.appointmentHis.length; i++) {
      for (int j = 0; j <= 0; j++) {
        System.out.print(Arrays.toString(appointHistory.appointmentHis[i]));
      }
      System.out.println();
    }
    System.out.println("");
    System.out.println("1. Go To Doctor Management");
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
      doctorOptionMore();
    } else if (option15 == 2) {
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Thank you . . . !");
      System.out.println("*************************************");
    } else {
      System.out.println("Please enter correct number");
      System.out.println("");
      appointHistory();
    }
  }

  public void appointCancel() {
    System.out.println("");
    System.out.println(" * * *Cancel Appointment * * *");
    System.out.println("");

    appointCancel appointCancel = new appointCancel();
    for (int i = 0; i < appointCancel.appointmentCan.length; i++) {
      for (int j = 0; j <= 0; j++) {
        System.out.print(Arrays.toString(appointCancel.appointmentCan[i]));
      }
      System.out.println();
    }
    System.out.println("");
    System.out.println("1. Go To Doctor Management");
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
      doctorOptionMore();
    } else if (option15 == 2) {
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Thank you . . . !");
      System.out.println("*************************************");
    } else {
      System.out.println("Please enter correct number");
      System.out.println("");
      appointCancel();
    }
  }

  public void doctorOptionMore() {
    System.out.println("*************************************");
    System.out.println(" ");
    System.out.println(" . . . Welcome to Doctor Management  . . . ");
    System.out.println(" ");
    System.out.println("*************************************");
    System.out.println(" ");
    System.out.println("1. Confirm Appointment");
    System.out.println("2. Pending Appointment");
    System.out.println("3. History Appointment");
    System.out.println("4. Add prescription");
    System.out.println("5. Cancel Appointment");
    System.out.println("6. Exit");
    System.out.println("");
    System.out.println("Please select any one option");
    Scanner scan6 = new Scanner(System.in);
    int option6 = 0;
    try {
      option6 = scan6.nextInt();
    } catch (Exception e) {
      System.out.println("Please enter number");
    }

    if (option6 == 1) {
      appointConfirm();
    } else if (option6 == 2) {
      appointPending();
    } else if (option6 == 3) {
      appointHistory();
    } else if (option6 == 4) {
      prescriptionAdd prescriptionAdd = new prescriptionAdd();
      prescriptionAdd.prescriptionAddC();
    } else if (option6 == 5) {
      appointCancel();
    } else if (option6 == 6) {
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Thanks . . . !");
      System.out.println("*************************************");
      System.out.println("");
    } else {
      System.out.println("Please enter correct number");
      System.out.println("");
      doctorOptionMore();
    }
  }

}
