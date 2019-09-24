package be.blindbadger.repository;

import be.blindbadger.Patient;

import java.util.Map;

public interface PatientRepository {
    // Create & Update
    Patient savePatient(Patient patient);

    // Read
    // custom queries
    Patient readPatient(Integer id);

    // Delete
    boolean deletePatient(Integer id);

    Patient readPatient(Patient example);

    boolean deletePatient(Patient patient);

    Patient readPatient(Map<String, String> predicates);


}




