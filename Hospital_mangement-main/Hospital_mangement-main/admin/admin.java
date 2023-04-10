package admin;
import doctor.*;
import java.util.*;
import login.*;
import registration.registration;
import appointment.*;
import bill.*;

interface ad {
  public void adminStart();

  public void adminOption();

  public void adminOptionMore();
}

public class admin implements ad {
  login login = new login();
  doctorAddc doctorAddc = new doctorAddc();

  public void adminStart() {
    System.out.println("1. Admin Management");
  }

  public void adminOption() {

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
      System.out.println("Please enter number - " + e.getMessage());
    }

    if (optionAdmin == 1) {
      registration registrat = new registration();
      registrat.registra("Admin");
    } else if (optionAdmin == 2) {
      login.userLogin("Admin");
    }else if (optionAdmin == 3) {
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Thank you . . . !");
      System.out.println("*************************************");
    }else{
      System.out.println("");
      System.out.println(" * * * Please enter correct number * * * ");
      System.out.println("");
      adminOption();
    }
  }

  public void adminOptionMore() {
    System.out.println("*************************************");
    System.out.println(" ");
    System.out.println(" . . . Welcome to Admin Management. . . ");
    System.out.println(" ");
    System.out.println("*************************************");
    System.out.println(" ");
    System.out.println("1. Appointment Management");
    System.out.println("2. Bill Generate");
    System.out.println("3. Add New Doctor");
    System.out.println("4. Refund Payment");
    System.out.println("5. Exit");
    System.out.println("");
    System.out.println("Please select any one option");
    Scanner scan5 = new Scanner(System.in);
    int option5 = 0;
    try {
      option5 = scan5.nextInt();
    } catch (Exception e) {
      System.out.println("Please enter number");
      System.out.println("");
    }

    if (option5 == 1) {
      appointmentMangement appointmentMangement = new appointmentMangement();
      appointmentMangement.appointStart();
    } else if (option5 == 2) {
      System.out.println(" ");
      billGenerater billGenerater = new billGenerater();
      billGenerater.billGenetaterStart();
    } else if (option5 == 3){
      System.out.println("*************************************");
      System.out.println(" ");
      System.out.println(" . . . Create New Doctor. . . ");
      System.out.println(" ");
      System.out.println("*************************************");
      doctorAddc.doctoAddc();
    }  else if (option5 == 4) {
      System.out.println("*************************************");
      System.out.println("");
      System.out.println(" * * * Not found any refund payment * * * ");
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("");
      System.out.println("1. Go To Admin Management");
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
      if(option15 == 1){
        adminOptionMore();
      }else if(option15 == 2){
          System.out.println("");
          System.out.println("*************************************");
          System.out.println("Thank you . . . !");
          System.out.println("*************************************");
      }else{
        System.out.println("Please enter correct number");
        System.out.println("");
      }
      

    }else if (option5 == 5) {
      System.out.println("");
      System.out.println("*************************************");
          System.out.println("Thank you . . . !");
      System.out.println("******************************");
    } else {
      System.out.println("");
      System.out.println(" * * * Please enter correct number * * * ");
      System.out.println("");
      adminOptionMore();
    }

  }
}
