package bill;

public class billG {
    private String billId;
    private String patientName;
    private String doctorName;
    private String feesAmount;
    private String dateOnBill;
    private String timeOnBill;

    public billG(String billId, String patientName, String doctorName, String feesAmount, String dateOnBill,String timeOnBill) {
        this.billId = billId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.feesAmount = feesAmount;
        this.dateOnBill = dateOnBill;
        this.timeOnBill = timeOnBill;
    }

    public billG() {
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
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

    public String getDateOnBill() {
        return dateOnBill;
    }

    public void setDateOnBill(String dateOnBill) {
        this.dateOnBill = dateOnBill;
    }

    public String getTimeOnBill() {
        return timeOnBill;
    }

    public void setTimeOnBill(String timeOnBill) {
        this.timeOnBill = timeOnBill;
    }

}
