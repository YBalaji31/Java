//Create a simple hospital management system using inheritance in Java

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalManagement {
    private List<Doctor> doctors;
    private int noofDentists;
    private int noofCardiologists;

    public HospitalManagement() {
        this.doctors = new ArrayList<>();
        this.noofDentists = 0;
        this.noofCardiologists = 0;
    }

    public void createDoctor(String name, String specialization) {
        Doctor doctor = new Doctor(name, specialization);
        doctors.add(doctor);
        if (specialization.equals("cardiologist")) {
            noofCardiologists++;
        } else if (specialization.equals("dentist")) {
            noofDentists++;
        }
    }

    public void displayDoctors() {
		System.out.println();
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
			System.out.println();
            doctor.display();
        }
    }

    public void assignPatientToDoctor(Patient patient, String specialization) {
        boolean assigned = false;
        for (Doctor doctor : doctors) {
			System.out.println();
            if (doctor.getSpecialization().equals(specialization)) {
                doctor.addPatient(patient);
                System.out.println(patient.getName() + " assigned to " + doctor.getName());
                assigned = true;
                break;
            }
        }
        if (!assigned) {
            System.out.println("No doctor available for specialization: " + specialization);
        }
    }

    public void displayPatientsForDoctor() {
		for(Doctor doctor:doctors){
			System.out.println();
        System.out.println("Patients for Doctor " + doctor.getName() + ":");
        List<Patient> patients=doctor.getPatients();
        for (Patient patient : patients) {
            patient.display();
		}
		}
		
	}
	

    public static void main(String[] args) {
        HospitalManagement hospitalManagement = new HospitalManagement();

        hospitalManagement.createDoctor("Dr. Jack", "cardiologist");
        hospitalManagement.createDoctor("Dr. John", "dentist");
	
        System.out.println();
        System.out.println("Specialization\tNo of Doctors");
        System.out.println("Cardiologist\t  " + hospitalManagement.noofCardiologists);
        System.out.println("Dentist\t\t  " + hospitalManagement.noofDentists);

	boolean flag=true;
	while(flag){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nOptions:");
		System.out.println();
        System.out.println("1. New Patient");
        System.out.println("2. Doctor details");
		System.out.println("3. Patients for each doctor");
		System.out.println("4. Exit");
		System.out.println();
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

		switch(choice){
			case 1:
            scanner.nextLine();
            System.out.print("Enter patient name: ");
            String name = scanner.nextLine();
            System.out.print("Enter patient age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter patient gender: ");
            String gender = scanner.nextLine();
            System.out.print("Enter the specialization: ");
            String problem = scanner.nextLine();

            Patient newPatient = new Patient(name, age, gender, problem);
            hospitalManagement.assignPatientToDoctor(newPatient, problem);
			break;
			
			case 2:
				hospitalManagement.displayDoctors();
				break;
			
			case 3:
				hospitalManagement.displayPatientsForDoctor();
				break;
				
			case 4:
				 flag=false;
				 break;
        } 

        System.out.println();
        
    }
}
}