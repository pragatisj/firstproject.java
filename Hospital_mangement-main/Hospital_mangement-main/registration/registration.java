package registration;

import java.util.*;
import admin.admin;
import doctor.doctor;
import patient.patient;
import bill.*;
import appointment.appointmentMangement;
import medical.medical;

interface reg {
  public void registra(String section);
}

public class registration implements reg {
  admin admin = new admin();
  doctor doctor = new doctor();
  patient patient = new patient();
  billGenerater billGenerater = new billGenerater();
  medical medical = new medical();
  registrationData registrationData = new registrationData();
  appointmentMangement appointmentMangement = new appointmentMangement();

  public void registra(String section) {
    System.out.println("");
    System.out.println("*************************************");
    System.out.println("Registration  . . . !");
    System.out.println("*************************************");
    System.out.println("");

    if (section == "Admin") {
      String[][] users = new String[10][5];
      int userCount = 0;

      String id = "UID" + userCount;
      registrationData.setUserId(id);

      System.out.println("Please enter full name");
      Scanner userfullName = new Scanner(System.in);
      String userfull = userfullName.next();
      registrationData.setFullName(userfull);

      System.out.println("");
      System.out.println("Please enter email");
      Scanner userEmail = new Scanner(System.in);
      String Emailuser = userEmail.next();
      registrationData.setEmail(Emailuser);

      System.out.println("");
      System.out.println("Please enter phone number");
      Scanner userPhoneNumber = new Scanner(System.in);
      String PhoneNumber = userPhoneNumber.next();
      registrationData.setPhonenum(PhoneNumber);

      System.out.println("");
      System.out.println("Please enter password");
      Scanner userPassword = new Scanner(System.in);
      String Password = userPassword.next();
      registrationData.setPassword(Password);

      System.out.println("");
      users[userCount][0] = registrationData.getUserId();
      users[userCount][1] = registrationData.getFullName();
      users[userCount][2] = registrationData.getEmail();
      users[userCount][3] = registrationData.getPhonenum();
      users[userCount][4] = registrationData.getPassword();
      // System.out.println(Arrays.toString(users[userCount]));
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Your personal information . . .");
      System.out.println("*************************************");
      System.out.println("");
      System.out.println(Arrays.toString(users[userCount]));
      System.out.println("");
      userCount++;
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("");
      System.out.println("Registration successful . . . !");
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("");
      admin.adminOptionMore();

    } else if (section == "Doctor") {
      String[][] users = new String[10][6];
      int userCount = 0;

      String id = "DR" + userCount;
      registrationData.setUserId(id);

      System.out.println("Please enter full name");
      Scanner userfullName = new Scanner(System.in);
      String userfull = userfullName.next();
      String userfullN = "Dr." + userfull;
      registrationData.setFullName(userfullN);

      System.out.println("Please enter email");
      Scanner userEmail = new Scanner(System.in);
      String Emailuser = userEmail.next();
      registrationData.setEmail(Emailuser);

      System.out.println("Please enter phone number");
      Scanner userPhoneNumber = new Scanner(System.in);
      String PhoneNumber = userPhoneNumber.next();
      registrationData.setPhonenum(PhoneNumber);

      System.out.println("Please enter your fees amount");
      Scanner doctorFees = new Scanner(System.in);
      String doctorfeesA = doctorFees.next();
      String doctorfeesAmount = "Rs. " + doctorfeesA;
      registrationData.setFessAmount(doctorfeesAmount);

      System.out.println("Please enter password");
      Scanner userPassword = new Scanner(System.in);
      String Password = userPassword.next();
      registrationData.setPassword(Password);

      users[userCount][0] = registrationData.getUserId();
      users[userCount][1] = registrationData.getFullName();
      users[userCount][2] = registrationData.getEmail();
      users[userCount][3] = registrationData.getPhonenum();
      users[userCount][4] = registrationData.getFessAmount();
      users[userCount][5] = registrationData.getPassword();

      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Your personal information . . .");
      System.out.println("");
      System.out.println(Arrays.toString(users[userCount]));
      System.out.println("");
      System.out.println("*************************************");
      userCount++;
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Registration successful . . . !");
      System.out.println("*************************************");
      System.out.println("");
      doctor.doctorOptionMore();
    } else if (section == "Patient") {
      String[][] users = new String[10][6];
      int userCount = 0;

      String id = "PTI" + userCount;
      registrationData.setUserId(id);

      System.out.println("Please enter full name");
      Scanner userfullName = new Scanner(System.in);
      String userfull = userfullName.next();
      registrationData.setFullName(userfull);

      System.out.println("Please enter email");
      Scanner userEmail = new Scanner(System.in);
      String Emailuser = userEmail.next();
      registrationData.setEmail(Emailuser);

      System.out.println("Please enter phone number");
      Scanner userPhoneNumber = new Scanner(System.in);
      String PhoneNumber = userPhoneNumber.next();
      registrationData.setPhonenum(PhoneNumber);

      System.out.println("Please enter your blood group");
      Scanner bloodG = new Scanner(System.in);
      String bloodgroup = bloodG.next();
      String bloodGroupUser = bloodgroup + " +";
      registrationData.setBloodGroup(bloodGroupUser);

      System.out.println("Please enter password");
      Scanner userPassword = new Scanner(System.in);
      String Password = userPassword.next();
      registrationData.setPassword(Password);

      users[userCount][0] = registrationData.getUserId();
      users[userCount][1] = registrationData.getFullName();
      users[userCount][2] = registrationData.getEmail();
      users[userCount][3] = registrationData.getPhonenum();
      users[userCount][4] = registrationData.getBloodGroup();
      users[userCount][5] = registrationData.getPassword();
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Your personal information . . .");
      System.out.println("");
      System.out.println(Arrays.toString(users[userCount]));
      System.out.println("");
      System.out.println("*************************************");
      userCount++;
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Registration successful . . . !");
      System.out.println("*************************************");
      System.out.println("");
      patient.patientOptionMore();
    } else if (section == "Appointment") {
      String[][] users = new String[10][5];
      int userCount = 0;

      String id = "APPO" + userCount;
      registrationData.setUserId(id);

      System.out.println("Please enter full name");
      Scanner userfullName = new Scanner(System.in);
      String userfull = userfullName.next();
      registrationData.setFullName(userfull);

      System.out.println("Please enter email");
      Scanner userEmail = new Scanner(System.in);
      String Emailuser = userEmail.next();
      registrationData.setEmail(Emailuser);

      System.out.println("Please enter phone number");
      Scanner userPhoneNumber = new Scanner(System.in);
      String PhoneNumber = userPhoneNumber.next();
      registrationData.setPhonenum(PhoneNumber);

      System.out.println("Please enter password");
      Scanner userPassword = new Scanner(System.in);
      String Password = userPassword.next();
      registrationData.setPassword(Password);

      users[userCount][0] = registrationData.getUserId();
      users[userCount][1] = registrationData.getFullName();
      users[userCount][2] = registrationData.getEmail();
      users[userCount][3] = registrationData.getPhonenum();
      users[userCount][4] = registrationData.getPassword();
      // System.out.println(Arrays.toString(users[userCount]));
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Your personal information . . .");
      System.out.println("");
      System.out.println(Arrays.toString(users[userCount]));
      userCount++;
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Registration successful . . . !");
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("");
      appointmentMangement.appointStart();
    } else if (section == "Bill") {
      String[][] users = new String[10][5];
      int userCount = 0;

      String id = "BILL" + userCount;
      registrationData.setUserId(id);

      System.out.println("Please enter full name");
      Scanner userfullName = new Scanner(System.in);
      String userfull = userfullName.next();
      registrationData.setFullName(userfull);

      System.out.println("Please enter email");
      Scanner userEmail = new Scanner(System.in);
      String Emailuser = userEmail.next();
      registrationData.setEmail(Emailuser);

      System.out.println("Please enter phone number");
      Scanner userPhoneNumber = new Scanner(System.in);
      String PhoneNumber = userPhoneNumber.next();
      registrationData.setPhonenum(PhoneNumber);

      System.out.println("Please enter password");
      Scanner userPassword = new Scanner(System.in);
      String Password = userPassword.next();
      registrationData.setPassword(Password);

      users[userCount][0] = registrationData.getUserId();
      users[userCount][1] = registrationData.getFullName();
      users[userCount][2] = registrationData.getEmail();
      users[userCount][3] = registrationData.getPhonenum();
      users[userCount][4] = registrationData.getPassword();
      // System.out.println(Arrays.toString(users[userCount]));
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Your personal information . . .");
      System.out.println("");
      System.out.println(Arrays.toString(users[userCount]));

      userCount++;
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Registration successful . . . !");
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("");
      billGenerater.billGenetaterStart();
    } else if (section == "Medical") {
      String[][] users = new String[10][5];
      int userCount = 0;

      String id = "MedI" + userCount;
      registrationData.setUserId(id);

      System.out.println("Please enter full name");
      Scanner userfullName = new Scanner(System.in);
      String userfull = userfullName.next();
      registrationData.setFullName(userfull);

      System.out.println("Please enter email");
      Scanner userEmail = new Scanner(System.in);
      String Emailuser = userEmail.next();
      registrationData.setEmail(Emailuser);

      System.out.println("Please enter phone number");
      Scanner userPhoneNumber = new Scanner(System.in);
      String PhoneNumber = userPhoneNumber.next();
      registrationData.setPhonenum(PhoneNumber);

      System.out.println("Please enter password");
      Scanner userPassword = new Scanner(System.in);
      String Password = userPassword.next();
      registrationData.setPassword(Password);

      users[userCount][0] = registrationData.getUserId();
      users[userCount][1] = registrationData.getFullName();
      users[userCount][2] = registrationData.getEmail();
      users[userCount][3] = registrationData.getPhonenum();
      users[userCount][4] = registrationData.getPassword();
      // System.out.println(Arrays.toString(users[userCount]));
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Your personal information . . .");
      System.out.println("");
      System.out.println(Arrays.toString(users[userCount]));

      userCount++;
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("Registration successful . . . !");
      System.out.println("");
      System.out.println("*************************************");
      System.out.println("");
      medical.medicalOptionMore();
    }

  }
}
