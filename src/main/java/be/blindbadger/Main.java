package be.blindbadger;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("datasourceThor");
        EntityManager em = emf.createEntityManager();


        em.close();
        emf.close();
    }
}






