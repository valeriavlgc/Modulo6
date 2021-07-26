package com.jobs.domain;

public class Mid extends Employee {
	public Mid(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		
		totalPaid= paymentRate.pay(salaryPerMonth);
		if (totalPaid < 1800 || totalPaid > 2500) throw new Exception("Error 105: Usuario no añadido. El sueldo mensual de un mid debe estar entre 1800 y 2500.");
		
	}
	
	public String toString() {
		return "Mid [name=" + name + ", address=" + address + ", phone=" + phone + ", salaryPerMonth=" + salaryPerMonth + ", totalPaid=" + totalPaid + "]";
	}
}
