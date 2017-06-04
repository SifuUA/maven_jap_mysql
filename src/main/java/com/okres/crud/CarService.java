package com.okres.crud;

/**
 * Created by Alex on 04.06.2017.
 */
import com.okres.entity.Car;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

//класс сервер
public class CarService {
    public EntityManager em = Persistence.createEntityManagerFactory("okres").createEntityManager();

    public Car add(Car car){
        em.getTransaction().begin();
        Car carFromDB = em.merge(car);
        em.getTransaction().commit();
        return carFromDB;
    }

    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Car get(long id){
        return em.find(Car.class, id);
    }

    public void update(Car car) {
        em.getTransaction().begin();
        em.merge(car);
        em.getTransaction().commit();
    }

    public List<Car> getAll(){
        TypedQuery<Car> namedQurey = em.createNamedQuery("com.okres.entity.Car.getAll", Car.class);
        return namedQurey.getResultList();
    }
}
