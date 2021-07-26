package com.jobs.domain;

public class Boss extends Employee {
	public Boss(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
				
		totalPaid= paymentRate.pay(salaryPerMonth);
		if (totalPaid < 8000) throw new Exception("Error 101: Usuario no añadido. El sueldo mensual de un jefe debe ser superior a 8000.");
		
	}
	
	public String toString() {
		return "Boss [name=" + name + ", address=" + address + ", phone=" + phone + ", salaryPerMonth=" + salaryPerMonth + ", totalPaid=" + totalPaid + "]";
	}

}
