package com.example.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.model.Laptop;
@Service
public interface LaptopService{
	public Laptop saveLaptop(Laptop laptop);
	public List<Laptop> listLoptop();
	public Laptop updateLaptop(Laptop laptop);
	public String deleteLaptop(Laptop laptop);

}
