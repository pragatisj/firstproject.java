package prescription;

public class prescription {
    private String prescriptionId;
    private String patientName;
    private String doctorName;
    private String feesAmount;
    private String medicineName;

    public String getPrescriptionId() {
        return prescriptionId;
    }
    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getFeesAmount() {
        return feesAmount;
    }
    public void setFeesAmount(String feesAmount) {
        this.feesAmount = feesAmount;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
  
}
