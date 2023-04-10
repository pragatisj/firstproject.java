package doctor;
import admin.*;
import java.util.*;

public class doctorAddc {
   
    public void doctoAddc() {
        String[][] users = new String[10][6];
        doctorData doctorData = new doctorData();
        int userCount = 0;

        String id = "DR" + userCount;
        doctorData.setDoctorId(id);

        System.out.println("Please enter full name");
        Scanner doctorfullName = new Scanner(System.in);
        String doctorfull = doctorfullName.next();
        String userfullN = "Dr." + doctorfull;
        doctorData.setDoctorfullName(userfullN);

        System.out.println("Please enter email");
        Scanner doctorEmail = new Scanner(System.in);
        String Emaildoctor = doctorEmail.next();
        doctorData.setDoctorEmail(Emaildoctor);

        System.out.println("Please enter phone number");
        Scanner doctorPhoneNumber = new Scanner(System.in);
        String PhoneNumber = doctorPhoneNumber.next();
        doctorData.setDoctorPhoneNumber(PhoneNumber);

        System.out.println("Please enter your fees amount");
        Scanner doctorFees = new Scanner(System.in);
        String doctorfeesA = doctorFees.next();
        String doctorfeesAmount = "Rs" + doctorfeesA;
        doctorData.setDoctorFees(doctorfeesAmount);

        System.out.println("Please enter password");
        Scanner doctorPassword = new Scanner(System.in);
        String Password = doctorPassword.next();
        doctorData.setDoctorPassword(Password);

        users[userCount][0] = doctorData.getDoctorId();
        users[userCount][1] = doctorData.getDoctorfullName();
        users[userCount][2] = doctorData.getDoctorEmail();
        users[userCount][3] = doctorData.getDoctorFees();
        users[userCount][4] = doctorData.getDoctorPhoneNumber();
        users[userCount][5] = doctorData.getDoctorPassword();
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("Doctor details . . .");
        System.out.println("");
        System.out.println(Arrays.toString(users[userCount]));
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("Add Doctor " + users[userCount][1] + " successful . . . !");
        System.out.println("*************************************");
        System.out.println("");
        userCount++;
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
        if (option15 == 1) {
             admin admin = new admin();
            admin.adminOptionMore();
        } else if (option15 == 2) {
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("Thank you . . . !");
            System.out.println("*************************************");
        }else{
            System.out.println("Please enter correct number");
            System.out.println("");  
        }
    }

}
