package com.omreon.tDevice.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TDeviceRepository extends JpaRepository<TDevice, Long>, CrudRepository<TDevice, Long>{
	
	// CRUD ve JPA implementasyonlarının yapılması

}
