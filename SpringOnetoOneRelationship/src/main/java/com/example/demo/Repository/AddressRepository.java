package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
