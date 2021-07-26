package com.jobs.domain;

public class Volunteer extends AbsStaffMember {

protected String description;

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		this.description = description;
		
		totalPaid= 0;
		if (totalPaid != 0) throw new Exception("Error 106. Los becarios no cobran.");
    }

	
	@Override
	public void pay() {
		super.totalPaid= 0;
		
	}
	

	public void setDescription(String description) {
		this.description = description;
	}


	//Creo el tostring
	@Override
	public String toString() {
		return "Volunteer [name=" + name + ", address=" + address + ", phone=" + phone + ", description=" + description + ", totalPaid="
				+ totalPaid + "]";
	}

	
}
