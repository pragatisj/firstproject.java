package prescription;
import doctor.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

interface presadd{
    public void add();
    public void prescriptionAddC();
    public void update();
    public void comm();
    public void read();
    public void delete();
    public void save();
}

public class prescriptionAdd {
    String[][] prescriptionWrite = new String[10][5];

    int prescriptionCount = 0;
    prescription prescription = new prescription();
    public void add() {

        String prescriptionId = "PRES" + prescriptionCount;
        prescription.setPrescriptionId(prescriptionId);

        System.out.println("Please enter patient name");
        Scanner scan6 = new Scanner(System.in);
        String patient = scan6.next();
        prescription.setPatientName(patient);

        System.out.println("Please enter doctor name");
        Scanner scan7 = new Scanner(System.in);
        String doctorN = scan7.next();
        String doctor = "Dr." + doctorN;
        prescription.setDoctorName(doctor);

        System.out.println("Please enter fees");
        Scanner scan8 = new Scanner(System.in);
        String fees = scan8.next();
        prescription.setFeesAmount(fees);

        System.out.println("Please enter mediacine name");
        Scanner scan9 = new Scanner(System.in);
        String date = scan9.next();
        prescription.setMedicineName(date);


        prescriptionWrite[prescriptionCount][0] = prescription.getPrescriptionId();
        prescriptionWrite[prescriptionCount][1] = prescription.getPatientName();
        prescriptionWrite[prescriptionCount][2] = prescription.getDoctorName();
        prescriptionWrite[prescriptionCount][3] = prescription.getFeesAmount();
        prescriptionWrite[prescriptionCount][4] = prescription.getMedicineName();
        comm();

    }
    public void comm(){
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("");
        System.out.println(" . . . Prescription Details  . . . ");
        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println("");
        System.out.println(Arrays.toString(prescriptionWrite[prescriptionCount]));
        // appointCount++;
        System.out.println("");
        System.out.println("1. Prescription Update");
        System.out.println("2. Prescription delete");
        System.out.println("3. Prescription Save & exit");
        System.out.println("");
        System.out.println("Please select any one option");
        System.out.println("");
        Scanner scan11 = new Scanner(System.in);
        int option11 = 0;
        try {
            option11 = scan11.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter number");
            System.out.println();
        }
        if (option11 == 1) {
            update();
        } else if (option11 == 2) {
            delete();
        } else if (option11 == 3) {
            save();
        } else {
            System.out.println("Please enter correct number");
            System.out.println();
            comm();
        }
    }
    public void update(){
        System.out.println("*************************************");
        System.out.println("");
        System.out.println(" . . . Prescription Update  . . . ");
        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println("");
        System.out.println(Arrays.toString(prescriptionWrite[prescriptionCount]));
        System.out.println(" ");
        System.out.println("");
        System.out.println("1. Patient");
        System.out.println("2. Doctor");
        System.out.println("3. Fees");
        System.out.println("4. Medicine");
        System.out.println("5. Back To Previous Option");
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
            prescription.setPatientName(patient);
            prescriptionWrite[prescriptionCount][1] = prescription.getPatientName();
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
            prescription.setDoctorName(doctor);
            prescriptionWrite[prescriptionCount][2] = prescription.getDoctorName();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 3) {
            System.out.println("Please enter fees");
            Scanner scan8 = new Scanner(System.in);
            String fees = scan8.next();
            prescription.setFeesAmount(fees);
            prescriptionWrite[prescriptionCount][3] = prescription.getFeesAmount();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 4) {
            System.out.println("Please enter mediacine name");
        Scanner scan9 = new Scanner(System.in);
        String date = scan9.next();
        prescription.setMedicineName(date);
        prescriptionWrite[prescriptionCount][4] = prescription.getMedicineName();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        }else if (option12 == 5) {
            comm();
        }
        else{
            System.out.println("Please enter correct number");
            System.out.println("");
            update();
        }
    }

    public void delete(){
        System.out.println("*************************************");

        System.out.println("");
        System.out.println("Are you confirm to delete this information ?");
        System.out.println("");
        System.out.println("*************************************");
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
            prescription.setPrescriptionId(apponitId);
            String patient = null;
            prescription.setPatientName(patient);
            String doctor = null;
            prescription.setDoctorName(doctor);
            String fees = null;
            prescription.setFeesAmount(fees);
            String medicine = null;
            prescription.setMedicineName(medicine);
            System.out.println("");
            System.out.println("Your information delete permanently");
            System.out.println("");
            System.out.println("*************************************");
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
            if(option15 == 1){
                doctor doctorC = new doctor();
                doctorC.doctorOptionMore();
              
            }else if(option15 == 2){
                System.out.println("");
                System.out.println("*************************************");
                System.out.println("Thank you . . . !");
                System.out.println("*************************************");
            }else{
                System.out.println("Please enter correct number");
                System.out.println("");
            }

        } else if (option13 == 2) {
            System.out.println("Thanks for your conformation . . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();
        } else {
            System.out.println("Please enter correct number");
            System.out.println("");
            delete();
        }
    }
    public void save(){
        try {
            String FileName = prescriptionWrite[prescriptionCount][0] + "_" + prescriptionWrite[prescriptionCount][1] + "_" + prescriptionWrite[prescriptionCount][2];
            FileWriter writer = new FileWriter("prescription/" +FileName);
            writer.write(" [ ");
            for (String appoi : prescriptionWrite[prescriptionCount]) {
                writer.write(" ' " + appoi + " ' ");
            }
            writer.write(" ] ");
            writer.close();
            System.out.println(" ");
            System.out.println("New file created successfully.");
            System.out.println(" "); 
            prescriptionCount++;
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void prescriptionAddC(){
        System.out.println("*************************************");
        System.out.println(" ");
        System.out.println(" . . . Write Prescription  . . . ");
        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println("");
        add();
    }
}
