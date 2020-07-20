package com.xworkz.spring.component.applicationtester.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="metro_table")
public class MetroDTO implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="metro_Id")
	private int mId;
	@Column(name="metro_location")
	private String location;
	@Column(name="metro_price")
	private double price;
	@Column(name="metro_ingurationDate")
	private Date ingurationDate;
	@Column(name="metro_available")
	private String available;
	
	public MetroDTO() {
		System.out.println("created "+ this.getClass().getSimpleName());
	}

	public int getmId(int i) {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getIngurationDate() {
		return ingurationDate;
	}

	public void setIngurationDate(Date ingurationDate) {
		this.ingurationDate = ingurationDate;
	}

	public String isAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "MetroDTO [mId=" + mId + ", location=" + location + ", price=" + price + ", ingurationDate="
				+ ingurationDate + ", available=" + available + "]";
	}
	
	/*public MetroDTO( int mId,String location,double price,Date ingurationDate,boolean available) {
		super();
		this.mId=mId;
		this.location=location;
		this.price=price;
		this.ingurationDate=ingurationDate;
		this.available=available;
	}
*/
	
	
}

