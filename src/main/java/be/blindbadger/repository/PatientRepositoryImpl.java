package be.blindbadger.repository;

import be.blindbadger.Patient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Map;

public class PatientRepositoryImpl
    implements PatientRepository {

    private final EntityManagerFactory emf;

    public PatientRepositoryImpl(EntityManagerFactory entityManagerFactory) {
        this.emf = entityManagerFactory;
    }


    @Override
    public Patient savePatient(Patient patient) {
        EntityManager em = emf.createEntityManager();
        em.persist(patient);

        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();

        return patient;
    }

    @Override
    public Patient readPatient(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Patient.class, id);
    }

    @Override
    public boolean deletePatient(Integer id) {
        EntityManager em = emf.createEntityManager();
        Patient p = em.find(Patient.class, id);

        if (p == null) return false;
        else {
            em.remove(p);
            em.getTransaction().begin();
            em.getTransaction().commit();
            return true;
        }
    }

    @Override
    public Patient readPatient(Patient example) {
        return null;
    }

    @Override
    public boolean deletePatient(Patient patient) {
        return false;
    }

    @Override
    public Patient readPatient(Map<String, String> predicates) {
        // name contains jan

        // SELECT * FROM patient_table WHERE patientname LIKE '%jan%';

        EntityManager em = emf.createEntityManager();
        em.createQuery("SELECT p FROM Patient p");
        


        return null;
    }
}











