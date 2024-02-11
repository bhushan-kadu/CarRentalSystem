package com.app.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.pojos.Car_Details;

@Repository
public interface Car_DetailsRepo extends JpaRepository<Car_Details, Integer> {

}
