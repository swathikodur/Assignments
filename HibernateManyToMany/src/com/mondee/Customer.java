package com.mondee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer_m")
public class Customer {
	
	@Id
	@Column(name="cid")
	private int customerId;
	@Column(name="cname")
	private String customerName;
	
	@ManyToMany
	private List<Vendor>vendor=new ArrayList();

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Vendor> getVendor() {
		return vendor;
	}

	public void setVendor(List<Vendor> vendor) {
		this.vendor = vendor;
	}
}
