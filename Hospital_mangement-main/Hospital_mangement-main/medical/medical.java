package medical;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import registration.*;
import login.*;

interface med {
    public void add();

    public void update();

    public void comm();

    public void read();

    public void delete();

    public void save();

    public void medicalStart();

    public void medicalOption();

    public void medicalOptionMore();
}

public class medical implements med {
    login login = new login();
    String[][] medicalRecordDetails = new String[10][5];
    mediacalR mediacalR = new mediacalR();

    int medicalRecordCount = 0;

    public void add() {

        String mediceId = "MEDI" + medicalRecordCount;
        mediacalR.setMedicalRecId(mediceId);

        System.out.println("Please enter medicine name");
        Scanner scan6 = new Scanner(System.in);
        String medicineN = scan6.next();
        mediacalR.setMediceName(medicineN);

        System.out.println("Please enter how many box");
        Scanner scan7 = new Scanner(System.in);
        String boxN = scan7.next();
        mediacalR.setMediceBox(boxN);

        System.out.println("Please enter per pack price");
        Scanner scan8 = new Scanner(System.in);
        String perPack = scan8.next();
        mediacalR.setMedicePerPack(perPack);

        System.out.println("Please enter date");
        Scanner scan9 = new Scanner(System.in);
        String date = scan9.next();
        mediacalR.setMediceUpdateDate(date);

        medicalRecordDetails[medicalRecordCount][0] = mediacalR.getMedicalRecId();
        medicalRecordDetails[medicalRecordCount][1] = mediacalR.getMediceName();
        medicalRecordDetails[medicalRecordCount][2] = mediacalR.getMediceBox();
        medicalRecordDetails[medicalRecordCount][3] = mediacalR.getMedicePerPack();
        medicalRecordDetails[medicalRecordCount][4] = mediacalR.getMediceUpdateDate();
        comm();

    }

    public void update() {
          System.out.println("*************************************");
        System.out.println("");
        System.out.println(" . . . Medical Record Update  . . . ");
        System.out.println(" ");
          System.out.println("*************************************");
        System.out.println(Arrays.toString(medicalRecordDetails[medicalRecordCount]));
        System.out.println(" ");
        System.out.println("");
        System.out.println("1. Medicine Name");
        System.out.println("2. Nmuber of box");
        System.out.println("3. Per Pack");
        System.out.println("4. Date");
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
        }

        if (option12 == 1) {
            System.out.println("Please enter medicine name");
            Scanner scan6 = new Scanner(System.in);
            String medicineN = scan6.next();
            mediacalR.setMediceName(medicineN);
            medicalRecordDetails[medicalRecordCount][1] = mediacalR.getMediceName();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 2) {
            System.out.println("Please enter how many box");
            Scanner scan7 = new Scanner(System.in);
            String boxN = scan7.next();
            mediacalR.setMediceBox(boxN);
            medicalRecordDetails[medicalRecordCount][2] = mediacalR.getMediceBox();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 3) {

            System.out.println("Please enter per pack price");
            Scanner scan8 = new Scanner(System.in);
            String perPack = scan8.next();
            mediacalR.setMedicePerPack(perPack);
            medicalRecordDetails[medicalRecordCount][3] = mediacalR.getMedicePerPack();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 4) {
            System.out.println("Please enter date");
            Scanner scan9 = new Scanner(System.in);
            String date = scan9.next();
            mediacalR.setMediceUpdateDate(date);
            medicalRecordDetails[medicalRecordCount][4] = mediacalR.getMediceUpdateDate();
            System.out.println("*************************************");
            System.out.println("Update Successfully. . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();

        } else if (option12 == 5) {
            comm();

        }else {
            System.out.println("Please enter correct number");
            System.out.println();
            update();
        }
    }

    public void comm() {
         System.out.println("********************************************");
        System.out.println("");
        System.out.println(" . . . Medical Record information  . . . ");
        System.out.println(" ");
         System.out.println("********************************************");
        System.out.println(Arrays.toString(medicalRecordDetails[medicalRecordCount]));
        // appointCount++;
        System.out.println("");
        System.out.println("1. Medical Record Update");
        System.out.println("2. Medical Record delete");
        System.out.println("3. Medical Record Save & exit");
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
            comm() ;
        }
    }

    public void read() {
        medicalRecordData medicalRecordData = new medicalRecordData();
        for (int i = 0; i < medicalRecordData.medicalRecordD.length; i++) {
            for (int j = 0; j <= 0; j++) {
                System.out.print(Arrays.toString(medicalRecordData.medicalRecordD[i]));
            }
            System.out.println();
        }
    }

    public void delete() {
          System.out.println("********************************************");
        System.out.println("");
        System.out.println("Are you confirm to delete this information ?");
        System.out.println("");
          System.out.println("********************************************");
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
            String medicalid = null;
            mediacalR.setMedicalRecId(medicalid);
            String medicinename = null;
            mediacalR.setMediceName(medicinename);
            String boxNm = null;
            mediacalR.setMediceBox(boxNm);
            String perpack = null;
            mediacalR.setMedicePerPack(perpack);
            String date = null;
            mediacalR.setMediceUpdateDate(date);
            System.out.println("");
            System.out.println("Your information delete permanently");
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("1. Go To Medical Record Management");
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
                medicalOptionMore();
            } else if (option15 == 2) {
                System.out.println("");
                System.out.println("*************************************");
                System.out.println("Thank you . . . !");
                System.out.println("*************************************");
            }else{
                System.out.println("Please enter correct number");
            }

        } else if (option13 == 2) {
            System.out.println("");
            System.out.println("Thanks . . . !");
            System.out.println("*************************************");
            System.out.println("");
            comm();
        } else {
            System.out.println("Please enter correct number");
            System.out.println("");
            delete();
        }
    }

    public void save() {
        try {
            String FileName = medicalRecordDetails[medicalRecordCount][0] + "_"
                    + medicalRecordDetails[medicalRecordCount][1] + "_" + medicalRecordDetails[medicalRecordCount][2];
            FileWriter writer = new FileWriter("medical/" + FileName);
            writer.write(" [ ");
            for (String appoi : medicalRecordDetails[medicalRecordCount]) {
                writer.write(" ' " + appoi + " ' ");
            }
            writer.write(" ] ");
            writer.close();
            System.out.println(" ");
            System.out.println("New file created successfully.");
            System.out.println(" ");
            medicalRecordCount++;
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void medicalStart() {
        System.out.println("4. Medical Record Management");
    }

    public void medicalOption() {

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
            registrat.registra("Medical");
        } else if (optionAdmin == 2) {
            login.userLogin("Medical");
        } else if (optionAdmin == 3) {
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("Thank you . . . !");
            System.out.println("*************************************");
        } else {
            System.out.println("");
            System.out.println(" * * * Please enter correct number * * * ");
            System.out.println("");
            medicalOption();
        }
    }

    public void medicalOptionMore() {
        System.out.println(" ");
        System.out.println(" . . . Welcome to Medical Record Management  . . . ");
        System.out.println(" ");
        System.out.println("1. Create Medical Record");
        System.out.println("2. Medical Record Read");
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
            System.out.println("********************************************");
            System.out.println("");
            System.out.println(" * * *Create New Medical Record * * *");
            System.out.println("");
            System.out.println("********************************************");
            add();
        } else if (option6 == 2) {
            System.out.println("********************************************");
            System.out.println("");
            System.out.println(" * * * Medical Record Details * * *");
            System.out.println("");
            System.out.println("********************************************");
            read();
            System.out.println("");
        } else if (option6 == 3) {
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("Thank you . . . !");
            System.out.println("*************************************");
        } else {
            System.out.println("Please enter correct number");
            System.out.println("");
            medicalOptionMore();
        }
    }
}
