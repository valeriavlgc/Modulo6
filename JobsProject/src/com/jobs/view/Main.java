package com.jobs.view;

import java.util.ArrayList;
import com.jobs.domain.AbsStaffMember;
import com.jobs.application.JobsController;

public class Main {

		
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		//No añaden usuario por error en el sueldo (Salta excepción)
		controller.createBossEmployee("Pepe Boss", "Direccion molona", "666666666", 100.0);
		controller.createEmployeeJunior("Pedro Employee", "Direccion molona 2", "665266666", 40.0);
		controller.createEmployeeMid("Laura Employee", "Direccion molona 3", "625266666", 45.0);
		controller.createEmployeeJunior("Pedro Employee", "Direccion molona 2", "665266666", 1000);
		//Añaden trabajador.
		controller.createManagerEmployee("Pedro Employee", "Direccion molona 2", "665226666", 4500);
		controller.createBossEmployee("Pepe Boss", "Direccion molona", "666666666", 8900);
		controller.createVolunteer("Juan Volunteer", "Direccion molona 4", "614266666", "No cobra");
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
				
		System.out.println("EMPLOYEES:\n" + allEmployees + " \n");
			
	}

}
