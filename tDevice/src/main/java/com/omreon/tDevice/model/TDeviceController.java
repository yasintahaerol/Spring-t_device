package com.omreon.tDevice.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tdevice")
public class TDeviceController {
	
	@Autowired
	private TDeviceService tService;
	
	@GetMapping("/all")
	public List<TDevice> getAll() {
		return tService.findAllList();
	}
	@PutMapping(value = "/updateAll")
	public void executeUpdate() {
		tService.updateBatching();
	}
	

}
