package doctor;

public class doctorData {
    private String doctorId;
    private String doctorfullName;
    private String doctorEmail;
    private String doctorPhoneNumber;
    private String doctorFees;
    private String doctorPassword;

    public doctorData(String doctorId, String doctorfullName, String doctorEmail, String doctorPhoneNumber,
            String doctorFees, String doctorPassword) {
        this.doctorId = doctorId;
        this.doctorfullName = doctorfullName;
        this.doctorEmail = doctorEmail;
        this.doctorPhoneNumber = doctorPhoneNumber;
        this.doctorFees = doctorFees;
        this.doctorPassword = doctorPassword;
    }

    public doctorData() {
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorfullName() {
        return doctorfullName;
    }

    public void setDoctorfullName(String doctorfullName) {
        this.doctorfullName = doctorfullName;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public String getDoctorPhoneNumber() {
        return doctorPhoneNumber;
    }

    public void setDoctorPhoneNumber(String doctorPhoneNumber) {
        this.doctorPhoneNumber = doctorPhoneNumber;
    }

    public String getDoctorFees() {
        return doctorFees;
    }

    public void setDoctorFees(String doctorFees) {
        this.doctorFees = doctorFees;
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }

}
