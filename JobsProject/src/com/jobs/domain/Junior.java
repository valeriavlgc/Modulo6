package com.jobs.domain;

public class Junior extends Employee {
	
	public Junior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
				
		totalPaid= paymentRate.pay(salaryPerMonth);
		if (totalPaid < 900 || totalPaid > 1600) throw new Exception("Error 104: Usuario no añadido. El sueldo mensual de un junior debe estar entre 900 y 1600.");
		
	}
	
	public String toString() {
		return "Junior [name=" + name + ", address=" + address + ", phone=" + phone + ", salaryPerMonth=" + salaryPerMonth + ", totalPaid=" + totalPaid + "]";
	}
}
