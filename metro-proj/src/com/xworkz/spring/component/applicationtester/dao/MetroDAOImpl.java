
package com.xworkz.spring.component.applicationtester.dao;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.spring.component.applicationtester.dto.MetroDTO;

public class MetroDAOImpl implements MetroDAO {

	private SessionFactory factory;

	public MetroDAOImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public Integer save(MetroDTO dto) {
		System.out.println("invoked save in dao" + dto);
		Session session = null;
		try {
			if (Objects.nonNull(dto)) {
				System.out.println("data saved in database");
			} else {
				System.out.println("data not saved in database");
			}
			session = factory.openSession();
			session.beginTransaction();
			Serializable id = session.save(dto);
			session.getTransaction().commit();
			return (Integer) id;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
			}
		}
		return null;
	}

	public void getMetroId(int metroId) {
		Session session = null;
		try {

			session = factory.openSession();
			MetroDTO metroDTO = session.get(MetroDTO.class, metroId);
			if (Objects.nonNull(metroDTO)) {
				System.out.println("getting data" + metroDTO.toString());
				System.out.println(metroId);
			} else {
				System.out.println("data is not getting...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
			}
		}
	}

	public void updateMetroLocationById(String metroLocation, int metroId) {
		Session session = null;
		try {
			session = factory.openSession();
			MetroDTO metroDTO = session.get(MetroDTO.class, metroId);
			session.beginTransaction();
			if (Objects.nonNull(metroDTO)) {
				metroDTO.setAvailable("qweriop");
				session.update(metroDTO);
				session.getTransaction().commit();
				System.out.println("data  is updated");
			} else {
				System.out.println("data is not update ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
			}
		}

	}

	public void deleteMetroById(int i) {
		Session session = null;
		try {
			session = factory.openSession();
			MetroDTO metroDTO = session.get(MetroDTO.class, i);
			session.beginTransaction();
			if (Objects.nonNull(metroDTO)) {
				session.delete(metroDTO);
				session.getTransaction().commit();
				System.out.println("data is deleted");
			} else {
				System.out.println("data is  not delete .....");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
			}
		}

	}

}
