package com.omreon.tDevice.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.omreon.model.ScUserlog;

@Service
@Transactional
public class TDeviceService {
	
	@Autowired
	private TDeviceRepository tRepo;
	
	@Autowired
	public TDeviceService(TDeviceRepository tRepo) {
		this.tRepo = tRepo;
	}
	
	public List<TDevice> findAllList()
	{
		List<TDevice> devices = new ArrayList<TDevice>();
		tRepo.findAll().forEach(devices::add);
		return devices;
	}
	
	public Iterable<TDevice> findAlll() {
		return tRepo.findAll();
	}
	
	public TDevice save(TDevice tDevice) {
		return tRepo.save(tDevice);
	}
	public boolean updateBatching() {
		List<TDevice> tDevices = findAllList();
		
		for(TDevice tDevice : tDevices) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			cal.add(Calendar.DATE, - (int) tDevice.getId()/14400);
			cal.add(Calendar.HOUR_OF_DAY, (int) tDevice.getId()/1400);
			Date forAdd = cal.getTime();
			tDevice.setDiscoveryYime(forAdd);
			tRepo.save(tDevice);
			tRepo.flush();
		}
		return true;
	}

}


