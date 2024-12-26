package simpleproject.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import simpleproject.project.demo.entity.customer;

public interface CustomerRepo extends JpaRepository<customer, Integer> {

}
