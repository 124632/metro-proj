package com.xworkz.spring.component.applicationtester.dao;

import com.xworkz.spring.component.applicationtester.dto.MetroDTO;

public interface MetroDAO {
	
	public Integer  save(MetroDTO dto);
	
	public void getMetroId(int metroId);
	
	public void updateMetroLocationById(String metroLocation,int metroId);
	
	public void deleteMetroById(int i);

}
