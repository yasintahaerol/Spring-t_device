package com.omreon.tDevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


import com.omreon.tDevice.model.TDeviceService;
@ComponentScan
@SpringBootApplication(scanBasePackageClasses = {TDeviceService.class})
public class TDeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TDeviceApplication.class, args);
	}

}
