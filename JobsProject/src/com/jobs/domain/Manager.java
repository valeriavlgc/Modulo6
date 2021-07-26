package com.jobs.domain;

public class Manager extends Employee {
	
	public Manager(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
				
		totalPaid= paymentRate.pay(salaryPerMonth);
		if (totalPaid < 3000 || totalPaid > 5000) throw new Exception("Error 102: Usuario no añadido. El sueldo mensual de un manager debe estar entre 3000 y 5000.");
		
	}
	
	public String toString() {
		return "Manager [name=" + name + ", address=" + address + ", phone=" + phone + ", salaryPerMonth=" + salaryPerMonth + ", totalPaid=" + totalPaid + "]";
	}
}
