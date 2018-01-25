package com.bmw.cc.casa.bm.devicemanager.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Vin17PK implements Serializable {
	
	public Vin17PK(String vin2) {
	}

	public Vin17PK() {
	}

	private String vin;
}
