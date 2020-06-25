package com.omreon.tDevice.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_device")
public class TDevice implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "dbid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "discovery_yime")
	private Date discoveryYime;

	public TDevice() {
	}

	public TDevice(long id, String name, Date discoveryYime) {
		this.id = id;
		this.name = name;
		this.discoveryYime = discoveryYime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDiscoveryYime() {
		return discoveryYime;
	}

	public void setDiscoveryYime(Date discoveryYime) {
		this.discoveryYime = discoveryYime;
	}

	
	@Override
	public String toString() {
		return "TDeviceService [id=" + id + ", name=" + name + ", discoveryYime=" + discoveryYime + "]";
	}
	
	
	
	

}
