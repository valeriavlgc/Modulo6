package com.jobs.domain;

public class Senior extends Employee {

	public Senior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
				
		totalPaid= paymentRate.pay(salaryPerMonth);
		if (totalPaid < 2700 || totalPaid > 4000) throw new Exception("Error 103: Usuario no añadido. El sueldo mensual de un senior debe estar entre 2700 y 4000.");
		
	}
	
	public String toString() {
		return "Senior [name=" + name + ", address=" + address + ", phone=" + phone + ", salaryPerMonth=" + salaryPerMonth + ", totalPaid=" + totalPaid + "]";
	}
}
