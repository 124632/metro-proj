package com.xworkz.spring.component.applicationtester;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.applicationtester.dao.MetroDAO;
import com.xworkz.spring.component.applicationtester.dto.MetroDTO;

public class MetroTester {

	public static void main(String[] args) {
		String xmlFile = "resource/Spring.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(xmlFile);

		MetroDAO dao = container.getBean(MetroDAO.class);

		MetroDTO dto = new MetroDTO();
		dto.setAvailable("true");
		dto.setLocation("Dvg");
		dto.setPrice(25);
		Date date = new Date();
		dto.setIngurationDate(date);

		MetroDAO metroDAO = container.getBean(MetroDAO.class);
		// Integer id=metroDAO.save(dto);
		//metroDAO.getMetroId(18);
		//metroDAO.updateMetroLocationById("shi",19 );
		metroDAO.deleteMetroById(17);
	}
}
