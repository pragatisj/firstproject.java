package login;
import java.util.*;
import admin.admin;
import appointment.*;
import doctor.doctor;
import patient.patient;
import medical.*;
import bill.*;

interface log {
  public void userLogin(String section);

  public void loginData(String name, String password, String sectionType);
}

public class login implements log {
  logingData logingData =  new logingData();
  public void loginData(String Email, String password, String sectionType) {
   
    if(sectionType == "Admin"){
      adminData adminData = new adminData();
      admin admin = new admin();
      boolean foundUser = false;
      for (int i = 0; i < adminData.admin.length; i++) {
        if (Email.equals(adminData.admin[i][2]) && password.equals(adminData.admin[i][4])) {
          foundUser = true;
          break;
        }
      }
  
      if (foundUser) {
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("Login successful . . . !");
        System.out.println("*************************************");
        System.out.println("");
        admin.adminOptionMore();
        System.out.println("");
      } else {
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("Invalid username or password.");
        System.out.println("*************************************");
        System.out.println("");
        admin.adminOption();
      }
    }else if(sectionType == "Doctor"){
       doctorData doctorData = new doctorData();
       doctor doctor = new doctor();

       boolean foundUser = false;
      for (int i = 0; i < doctorData.doctor.length; i++) {
        if (Email.equals(doctorData.doctor[i][2]) && password.equals(doctorData.doctor[i][4])) {
          foundUser = true;
          break;
        }
      }
  
      if (foundUser) {
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("Login successful . . . !");
        System.out.println("*************************************");
        System.out.println("");
        doctor.doctorOptionMore();
        System.out.println("");
      } else {
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("Invalid username or password.");
        System.out.println("*************************************");
        System.out.println("");
        doctor.doctorOption();
      }
    }else if(sectionType == "Patient"){
      patientData patientData = new patientData();
      patient patient = new patient();

      boolean foundUser = false;
     for (int i = 0; i < patientData.patient.length; i++) {
       if (Email.equals(patientData.patient[i][2]) && password.equals(patientData.patient[i][4])) {
         foundUser = true;
         break;
       }
     }
 
     if (foundUser) {
       System.out.println("");
       System.out.println("*************************************");
       System.out.println("Login successful . . . !");
       System.out.println("*************************************");
       System.out.println("");
       patient.patientOptionMore();
       System.out.println("");
     } else {
       System.out.println("");
       System.out.println("*************************************");
       System.out.println("Invalid username or password.");
       System.out.println("*************************************");
       System.out.println("");
       patient.patientOption();
     }
    }else if(sectionType == "Appointment"){
     appoinymentMangementData appoinymentMangementData = new appoinymentMangementData(); 
     appointmentMangement appointmentMangement = new appointmentMangement(); 

      boolean foundUser = false;
     for (int i = 0; i < appoinymentMangementData.appointdata.length; i++) {
       if (Email.equals(appoinymentMangementData.appointdata[i][2]) && password.equals(appoinymentMangementData.appointdata[i][4])) {
         foundUser = true;
         break;
       }
     }
 
     if (foundUser) {
       System.out.println("");
       System.out.println("*************************************");
       System.out.println("Login successful . . . !");
       System.out.println("*************************************");
       System.out.println("");
       appointmentMangement.appointStart();
       System.out.println("");
     } else {
       System.out.println("");
       System.out.println("*************************************");
       System.out.println("Invalid username or password.");
       System.out.println("*************************************");
       System.out.println("");
       appointmentMangement.appointMangementOption();
     }
    }else if(sectionType == "Bill"){
      billdata billdata = new billdata(); 
      billGenerater billGenerater = new billGenerater(); 
      
       boolean foundUser = false;
      for (int i = 0; i < billdata.billdata.length; i++) {
        if (Email.equals(billdata.billdata[i][2]) && password.equals(billdata.billdata[i][4])) {
          foundUser = true;
          break;
        }
      }
  
      if (foundUser) {
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("Login successful . . . !");
        System.out.println("*************************************");
        System.out.println("");
        billGenerater.billGenetaterStart();
        System.out.println("");
      } else {
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("Invalid username or password.");
        System.out.println("*************************************");
        System.out.println("");
        billGenerater.billGenetateroption();
      }
     }else if(sectionType == "Medical"){
       medicalData medicalData = new medicalData();
       medical medical = new medical();
      
       boolean foundUser = false;
      for (int i = 0; i < medicalData.medicalD.length; i++) {
        if (Email.equals(medicalData.medicalD[i][2]) && password.equals(medicalData.medicalD[i][4])) {
          foundUser = true;
          break;
        }
      }
  
      if (foundUser) {
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("Login successful . . . !");
        System.out.println("*************************************");
        System.out.println("");
        medical.medicalOptionMore();
        System.out.println("");
      } else {
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("Invalid username or password.");
        System.out.println("*************************************");
        System.out.println("");
        medical.medicalOption();
      }
     }
    


  }

  public void userLogin(String section) {
    // if(section == "Admin") {
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Login  . . . !");
      System.out.println("*************************************");
      System.out.println("");
      System.out.println("Please enter email");
      Scanner scan4 = new Scanner(System.in);
      
      String email = null;
      String password = null;

      try {
        email = scan4.next();
      } catch (Exception e) {
        System.out.println("Some problem" + e);
      }

      logingData.setEmailId(email);

      
      System.out.println("");
      System.out.println("Please enter password");
      Scanner scan5 = new Scanner(System.in);
      try {
        password = scan5.next();
      } catch (Exception e) {
        System.out.println("Some problem" + e);
      }
      logingData.setPassword(password);
      logingData.setSection(section);

      loginData(logingData.getEmailId(), logingData.getPassword(), logingData.getSection());
  }

}