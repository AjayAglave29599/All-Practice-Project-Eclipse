package com.example.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Repository.LaptopRepository;
import com.example.Service.LaptopService;
import com.example.demo.model.Employee;
import com.example.demo.model.Laptop;

public class LaptopServiceImp implements LaptopService {
	
	@Autowired
	private LaptopRepository laptopRepository;

	@Override
	public Laptop saveLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public List<Laptop> listLoptop() {
		// TODO Auto-generated method stub
		return laptopRepository.findAll();
	}

	@Override
	public Laptop updateLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public String deleteLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		laptopRepository.delete(laptop);
		return "Delete Successfully";
	}

	

}
