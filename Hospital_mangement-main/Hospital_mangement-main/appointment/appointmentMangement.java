package appointment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import registration.*;
import login.*;

interface appointMange {
    public void add();

    public void update();

    public void comm();

    public void read();

    public void delete();

    public void save();

    public void appointMangementStart();

    public void appointStart();

    public void appointMangementOption();

}

public class appointmentMangement implements appointMange {
    login login = new login();
    String[][] appointDetails = new String[10][6];

    int appointCount = 0;
    appointment appointment = new appointment();

    public void add() {

        String apponitId = "APPO" + appointCount;
        appointment.setAppointmentId(apponitId);

        System.out.println("");
        System.out.println("Please enter patient name");
        Scanner scan6 = new Scanner(System.in);
        String patient = scan6.next();
        appointment.setPatientId(patient);
        System.out.println("");

        System.out.println("Please enter doctor name");
        Scanner scan7 = new Scanner(System.in);
        String doctorN = scan7.next();
        String doctor = "Dr." + doctorN;
        appointment.setDoctorId(doctor);
        System.out.println("");

        System.out.println("Please enter fees");
        Scanner scan8 = new Scanner(System.in);
        String fees = scan8.next();
        appointment.setFees(fees);
        System.out.println("");

        System.out.println("Please enter date");
        Scanner scan9 = new Scanner(System.in);
        String date = scan9.next();
        appointment.setAppointmentDate(date);
        System.out.println("");

        System.out.println("Please enter time");
        Scanner scan10 = new Scanner(System.in);
        String time = scan10.next();
        appointment.setAppointmentTime(time);
        System.out.println("");

        appointDetails[appointCount][0] = appointment.getAppointmentId();
        appointDetails[appointCount][1] = appointment.getPatientId();
        appointDetails[appointCount][2] = appointment.getDoctorId();
        appointDetails[appointCount][3] = appointment.getFees();
        appointDetails[appointCount][4] = appointment.getAppointmentDate();
        appointDetails[appointCount][5] = appointment.getAppointmentTime();
        comm();

    }

    public void comm() {
        System.out.println("*************************************");
        System.out.println("");
        System.out.println(" . . . Appointment information  . . . ");
        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println("");
        System.out.println(Arrays.toString(appointDetails[appointCount]));
        // appointCount++;
        System.out.println("");
        System.out.println("1. Appointment Update");
        System.out.println("2. Appointment delete");
        System.out.println("3. Appointment Save & exit");
        System.out.println("");
        System.out.println("Please select any one option");
        System.out.println("");
        Scanner scan11 = new Scanner(System.in);
        int option11 = 0;
        try {
            option11 = scan11.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter number");
            System.out.println("");
        }
        if (option11 == 1) {
            update();
        } else if (option11 == 2) {
            delete();
        } else if (option11 == 3) {
            save();
        } else {
            System.out.println("Please enter correct number");
            System.out.println("");
            comm();
        }
    }

    public void update() {
        System.out.println("*************************************");
        System.out.println("");
        System.out.println(" . . . Appointment Update  . . . ");
        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println("");
        System.out.println(Arrays.toString(appointDetails[appointCount]));
        System.out.println(" ");
        System.out.println("");
        System.out.println("1. Patient");
        System.out.println("2. Doctor");
        System.out.println("3. Fees");
        System.out.println("4. Date");
        System.out.println("5. Time");
        System.out.println("6. Back To Previous Option");
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
            System.out.println("Please enter patient name");
            Scanner scan6 = new Scanner(System.in);
            String patient = scan6.next();
            appointment.setPatientId(patient);
            appointDetails[appointCount][1] = appointment.getPatientId();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 2) {
            System.out.println("Please enter doctor name");
            Scanner scan7 = new Scanner(System.in);
            String doctorN = scan7.next();
            String doctor = "Dr." + doctorN;
            appointment.setDoctorId(doctor);
            appointDetails[appointCount][2] = appointment.getDoctorId();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 3) {
            System.out.println("Please enter fees");
            Scanner scan8 = new Scanner(System.in);
            String fees = scan8.next();
            appointment.setFees(fees);
            appointDetails[appointCount][3] = appointment.getFees();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 4) {
            System.out.println("Please enter date");
            Scanner scan9 = new Scanner(System.in);
            String date = scan9.next();
            appointment.setAppointmentDate(date);
            appointDetails[appointCount][4] = appointment.getAppointmentDate();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 5) {
            System.out.println("Please enter time");
            Scanner scan10 = new Scanner(System.in);
            String time = scan10.next();
            appointment.setAppointmentTime(time);
            appointDetails[appointCount][5] = appointment.getAppointmentTime();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 6) {
            comm();
        } else {
            System.out.println("Please enter correct number");
            System.out.println("");
            comm();
        }
    }

    public void read() {
        appointmentData appointmentData = new appointmentData();
        for (int i = 0; i < appointmentData.appointment.length; i++) {
            for (int j = 0; j <= 0; j++) {
                System.out.print(Arrays.toString(appointmentData.appointment[i]));
            }
            System.out.println();
        }
    }

    public void save() {

        try {
            String FileName = appointDetails[appointCount][0] + "_" + appointDetails[appointCount][1] + "_"
                    + appointDetails[appointCount][3];
            FileWriter writer = new FileWriter("appointFiles/" + FileName);
            writer.write(" [ ");
            for (String appoi : appointDetails[appointCount]) {
                writer.write(" ' " + appoi + " ' ");
            }
            writer.write(" ] ");
            writer.close();
            System.out.println("*************************************");
            System.out.println(" ");
            System.out.println("New file created successfully in appointFiles folder.");
            System.out.println(" ");
            System.out.println("*************************************");
            appointCount++;
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

    public void delete() {
        System.out.println("*************************************************************");
        System.out.println("");
        System.out.println("Are you confirm to delete this information ?");
        System.out.println("");
        System.out.println("*************************************************************");
        System.out.println("");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("");
        System.out.println("Please select any one option");
        System.out.println("");
        Scanner scan13 = new Scanner(System.in);
        int option13 = 0;

        try {
            option13 = scan13.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter number");
            System.out.println("");
        }

        if (option13 == 1) {
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("Thanks for your conformation . . . !");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            String apponitId = null;
            appointment.setAppointmentId(apponitId);
            String patient = null;
            appointment.setPatientId(patient);
            String doctor = null;
            appointment.setDoctorId(doctor);
            String fees = null;
            appointment.setFees(fees);
            String date = null;
            appointment.setAppointmentDate(date);
            String time = null;
            appointment.setAppointmentTime(time);
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("Your information delete permanently");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("1. Go To Appointment Management");
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
                appointStart();
            } else if (option15 == 2) {
                System.out.println("");
                System.out.println("*************************************");
                System.out.println("");
                System.out.println("Thank you . . . !");
                System.out.println("*************************************");
                System.out.println("");
            }else{
                System.out.println("Please enter correct number");
                System.out.println("");
            }

        } else if (option13 == 2) {
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("Thanks . . . !");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            comm();
        } else {
            System.out.println("Please enter correct number");
            System.out.println("");
            delete();
        }
    }

    public void appointMangementStart() {
        System.out.println("5. Appointment Management");
    }

    public void appointMangementOption() {
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
            registrat.registra("Appointment");
        } else if (optionAdmin == 2) {
            login.userLogin("Appointment");
        } else if (optionAdmin == 3) {
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("Thank you . . . !");
            System.out.println("*************************************");
        }else {
            System.out.println("Please enter correct number");
            System.out.println("");
            appointMangementOption();
        }
    }

    public void appointStart() {
        System.out.println("******************************************************");
        System.out.println(" ");
        System.out.println(" . . . Welcome to Appointment Management  . . . ");
        System.out.println(" ");
        System.out.println("******************************************************");
        System.out.println("");
        System.out.println("1. Create Appointment");
        System.out.println("2. Appointment Read");
        System.out.println("3. Exit");
        System.out.println("");
        System.out.println("Please select any one option");
        Scanner scan6 = new Scanner(System.in);
        int option6 = 0;
        try {
            option6 = scan6.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter number");
            System.out.println("");
        }

        if (option6 == 1) {
            System.out.println("*************************************");
            System.out.println("");
            System.out.println(" * * *Create New Appointment * * *");
            System.out.println("");
            System.out.println("*************************************");
            add();
            System.out.println("");
        } else if (option6 == 2) {
            System.out.println("*************************************");
            System.out.println("");
            System.out.println(" * * * Appointment Details * * *");
            System.out.println("");
            System.out.println("*************************************");
            read();
            System.out.println("");
        }
        else if (option6 == 3) {
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("Thank you . . . !");
            System.out.println("");
            System.out.println("*************************************");
            read();
            System.out.println("");
        } else {
            System.out.println("Please enter correct number");
            System.out.println("");
            appointStart();
        }
    }

}
