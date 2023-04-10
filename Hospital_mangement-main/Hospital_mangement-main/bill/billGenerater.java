package bill;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import registration.registration;
import login.login;

interface billGe {
    public void add();

    public void update();

    public void comm();

    public void read();

    public void delete();

    public void save();

    public void billGenetaterStart();

    public void billGenetateroption();

    public void billStart();
}

public class billGenerater implements billGe {
    login login = new login();
    String[][] billDetails = new String[10][6];
    int billGCount = 0;
    billG billG = new billG();

    public void add() {

        String billGId = "BILLO" + billGCount;
        billG.setBillId(billGId);

        System.out.println("Please enter patient name");
        Scanner scan6 = new Scanner(System.in);
        String patient = scan6.next();
        billG.setPatientName(patient);
        System.out.println("");

        System.out.println("Please enter doctor name");
        Scanner scan7 = new Scanner(System.in);
        String doctorN = scan7.next();
        String doctor = "Dr." + doctorN;
        billG.setDoctorName(doctor);
        System.out.println("");

        System.out.println("Please enter fees");
        Scanner scan8 = new Scanner(System.in);
        String fees = scan8.next();
        billG.setFeesAmount(fees);
        System.out.println("");

        System.out.println("Please enter date");
        Scanner scan9 = new Scanner(System.in);
        String date = scan9.next();
        billG.setDateOnBill(date);
        System.out.println("");

        System.out.println("Please enter time");
        Scanner scan10 = new Scanner(System.in);
        String time = scan10.next();
        billG.setTimeOnBill(time);
        System.out.println("");

        billDetails[billGCount][0] = billG.getBillId();
        billDetails[billGCount][1] = billG.getPatientName();
        billDetails[billGCount][2] = billG.getDoctorName();
        billDetails[billGCount][3] = billG.getFeesAmount();
        billDetails[billGCount][4] = billG.getDateOnBill();
        billDetails[billGCount][5] = billG.getTimeOnBill();
        comm();
    }

    public void update() {
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("");
        System.out.println(" . . . Bill Update  . . . ");
        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println(" ");
        System.out.println(Arrays.toString(billDetails[billGCount]));
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
            billG.setPatientName(patient);
            billDetails[billGCount][1] = billG.getPatientName();
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
            billG.setDoctorName(doctor);
            billDetails[billGCount][2] = billG.getDoctorName();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 3) {
            System.out.println("Please enter fees");
            Scanner scan8 = new Scanner(System.in);
            String fees = scan8.next();
            billG.setFeesAmount(fees);
            billDetails[billGCount][3] = billG.getFeesAmount();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 4) {
            System.out.println("Please enter date");
            Scanner scan9 = new Scanner(System.in);
            String date = scan9.next();
            billG.setDateOnBill(date);
            billDetails[billGCount][4] = billG.getDateOnBill();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 5) {
            System.out.println("Please enter time");
            Scanner scan10 = new Scanner(System.in);
            String time = scan10.next();
            billG.setTimeOnBill(time);
            billDetails[billGCount][5] = billG.getTimeOnBill();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        }else if (option12 == 6) {
            comm();
        }else{
            System.out.println("Please enter correct number");
            System.out.println("");
            update();
        }
    }

    public void comm() {
        System.out.println("");
         System.out.println("*************************************");
        System.out.println("");
        System.out.println(" . . . Bill information  . . . ");
        System.out.println(" ");
         System.out.println("*************************************");
        System.out.println(" ");
        System.out.println(Arrays.toString(billDetails[billGCount]));
        // appointCount++;
        System.out.println("");
        System.out.println("1. Bill Update");
        System.out.println("2. Bill delete");
        System.out.println("3. Bill Save & exit");
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

    public void read() {
        billGenerateData billGenerateData = new billGenerateData();
        for (int i = 0; i < billGenerateData.billData.length; i++) {
            for (int j = 0; j <= 0; j++) {
                System.out.print(Arrays.toString(billGenerateData.billData[i]));
            }
            System.out.println();
        }
    }

    public void delete() {

        System.out.println("");
        System.out.println("Are you confirm to delete this information ?");
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
            System.out.println("");
            System.out.println("Thanks for your conformation . . . !");
            System.out.println("*************************************");
            System.out.println("");
            String apponitId = null;
            billG.setBillId(apponitId);
            String patient = null;
            billG.setPatientName(patient);
            String doctor = null;
            billG.setDoctorName(doctor);
            String fees = null;
            billG.setFeesAmount(fees);
            String date = null;
            billG.setDateOnBill(date);
            String time = null;
            billG.setTimeOnBill(time);
            System.out.println("");
            System.out.println("Your information delete permanently");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("1. Go To Bill Management");
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
                billGenetaterStart();
            } else if (option15 == 2) {
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
            delete() ;
        }
    }

    public void save() {
        try {
            String FileName = billDetails[billGCount][0] + "_" + billDetails[billGCount][1] + "_"
                    + billDetails[billGCount][2];
            FileWriter writer = new FileWriter("bill/" + FileName);
            writer.write(" [ ");
            for (String billsG : billDetails[billGCount]) {
                writer.write(" ' " + billsG + " ' ");
            }
            writer.write(" ] ");
            writer.close();
            System.out.println(" ");
            System.out.println("New file created successfully.");
            System.out.println(" ");
            billGCount++;
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void billStart() {
        System.out.println("6. Bill Generater");
    }

    public void billGenetateroption() {
        System.out.println("");
        System.out.println("1. Registration");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.println("");
        System.out.println("Please select any option . . .");
        System.out.println("");
        Scanner scan3 = new Scanner(System.in);
        int optionAdmin = 0;
        try {
            optionAdmin = scan3.nextInt();
        } catch (Exception e) {
            System.out.println("");
            System.out.println("Please enter number " + e.getMessage());
            System.out.println("");
        }

        if (optionAdmin == 1) {
            registration registrat = new registration();
            registrat.registra("Bill");
        } else if (optionAdmin == 2) {
            login.userLogin("Bill");
        } else if (optionAdmin == 3) {
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("Thank you . . . !");
            System.out.println("");
            System.out.println("*************************************");
        } else {
            System.out.println("");
            System.out.println("Please enter correct number");
            System.out.println("");
            billGenetateroption();
        }
    }

    public void billGenetaterStart() {
        System.out.println("*************************************");
        System.out.println(" ");
        System.out.println("* * * Welcome to Bill Generater  * * *");
        System.out.println(" ");
        System.out.println("*************************************");
        System.out.println("");
        System.out.println("1. Create New bill");
        System.out.println("2. bill history Check");
        System.out.println("3. Exit");
        System.out.println("");
        System.out.println("Please select any one option");
        System.out.println("");
        Scanner scan6 = new Scanner(System.in);
        int option6 = 0;
        try {
            option6 = scan6.nextInt();
        } catch (Exception e) {
            System.out.println("");
            System.out.println("Please enter number");
            System.out.println("");
        }

        if (option6 == 1) {
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println(" * * *Create New Bill * * *");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            add();
        } else if (option6 == 2) {
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println(" * * * Bill History Details * * *");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println(" ");
            read();
            System.out.println("");
        }else if (option6 == 3) {
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("Thank you . . . !");
            System.out.println("");
            System.out.println("*************************************");
           
        } 
        else {
            System.out.println("");
            System.out.println("Please enter correct number");
            System.out.println("");
            billGenetaterStart();
        }
    }
}
