package be.blindbadger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Disease {
    @Id
    @GeneratedValue
    private int idDisease;
    private String diseaseName;

    @ManyToMany
    private Set<MedicalFile> medicalFileSet;

    public int getIdDisease() {
        return idDisease;
    }

    public Disease setIdDisease(int idDisease) {
        this.idDisease = idDisease;
        return this;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public Disease setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
        return this;
    }

    public void addMedicalFile(MedicalFile file) {
        if (this.medicalFileSet == null)
            this.medicalFileSet = Set.of();

        this.medicalFileSet.add(file);
    }

    public void removeMedicalFile(MedicalFile file) {
        this.medicalFileSet.remove(file);
    }

    protected Set<MedicalFile> getMedicalFileSet() {
        return medicalFileSet;
    }

    protected Disease setMedicalFileSet(Set<MedicalFile> medicalFileSet) {
        this.medicalFileSet = medicalFileSet;
        return this;
    }
}








