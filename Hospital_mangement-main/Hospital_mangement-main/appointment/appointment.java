package appointment;


public class appointment{
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private String fees;
    private String appointmentDate;
    private String appointmentTime;

    
    public void Appointment(String appointmentId, String patientId, String doctorId, String fees, String appointmentDate, String appointmentTime) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.fees = fees;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }


    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }
    
    public String getFees() {
        return fees;
    }


    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

 


    
}