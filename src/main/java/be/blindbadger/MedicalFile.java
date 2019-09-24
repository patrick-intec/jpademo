package be.blindbadger;

import javax.persistence.*;
import java.util.List;

@Entity
public class MedicalFile {
    @Id
    @GeneratedValue
    private int idMedicalFile;
    private String description;

    @OneToOne(mappedBy = "medicalFile")
    @JoinColumn(name = "huppeldepup")
    private Patient patient;

    @ManyToMany(mappedBy = "medicalFileSet")
    @JoinTable(
            name = "JoinTableTussen2Tabellen",
            joinColumns = @JoinColumn(name = "joinColumnTableA"),
            inverseJoinColumns = @JoinColumn(name = "joinColumnTableB")
    )
    private List<Disease> diseases;

    public int getIdMedicalFile() {
        return idMedicalFile;
    }

    public MedicalFile setIdMedicalFile(int idMedicalFile) {
        this.idMedicalFile = idMedicalFile;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MedicalFile setDescription(String description) {
        this.description = description;
        return this;
    }

    public Patient getPatient() {
        return patient;
    }

    public MedicalFile setPatient(Patient patient) {
        this.patient = patient;
        return this;
    }
}
