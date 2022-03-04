package com.example.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.LaptopService;
import com.example.demo.model.Laptop;

@RestController
@RequestMapping("/laptop")
public class LaptopRestController {
	
	@Autowired
	private LaptopService laptopService;
	
	@GetMapping("/")
	public List<Laptop> findlaptop()
	{
		return laptopService.listLoptop();
	}
	
	@PostMapping("/")
	public Laptop storelaptop(@RequestBody Laptop laptop)
	{
		return laptopService.saveLaptop(laptop);
	}
	@PutMapping("/")
	public Laptop updatelaptop(@RequestBody Laptop laptop)
	{
		return laptopService.saveLaptop(laptop);
	}
	@DeleteMapping("/")
	public String deletelaptop(@RequestBody Laptop laptop)
	{
		laptopService.deleteLaptop(laptop);
		return "delete Successfully";
		
	}

}
