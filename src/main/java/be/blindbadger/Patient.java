package be.blindbadger;

import javax.persistence.*;

@Entity
public class Patient {
    @Id
    @GeneratedValue
    private int idPatient;
    private String patientName;

    @OneToOne(fetch = FetchType.LAZY,
        cascade = {CascadeType.PERSIST, CascadeType.DETACH})
    private MedicalFile medicalFile;

    public int getIdPatient() {
        return idPatient;
    }

    public Patient setIdPatient(int idPatient) {
        this.idPatient = idPatient;
        return this;
    }

    public String getPatientName() {
        return patientName;
    }

    public Patient setPatientName(String patientName) {
        this.patientName = patientName;
        return this;
    }

    public MedicalFile getMedicalFile() {
        return medicalFile;
    }

    public Patient setMedicalFile(MedicalFile medicalFile) {
        this.medicalFile = medicalFile;
        return this;
    }
}
