package Test;

import java.util.Date;

class Doctor {
	private int doctorsID;
	private String doctorName;
	private Specialization specialization;

	public int getDoctorsID() {
		return doctorsID;
	}

	public void setDoctorsID(int doctorsID) {
		this.doctorsID = doctorsID;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Specialization getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}
}

class Patient {
	private int patientID;
	private String patientName;

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
}

class Specialization {
	private int specializationID;
	private String specializationName;

	public Specialization(int specializationID, String specializationName) {
		super();
		this.specializationID = specializationID;
		this.specializationName = specializationName;
	}

	public int getSpecializationID() {
		return specializationID;
	}

	public void setSpecializationID(int specializationID) {
		this.specializationID = specializationID;
	}

	public String getSpecializationName() {
		return specializationName;
	}

	public void setSpecializationName(String specializationName) {
		this.specializationName = specializationName;
	}
}

class Appointment {
	private Doctor doctor;
	private Patient patient;
	private Date date;
	private Specialization specialization;

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Specialization getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Appointment(Doctor doctor, Patient patient, Date date) {
		this.doctor = doctor;
		this.specialization = this.doctor.getSpecialization();
		this.patient = patient;
		this.date = date;
	}

}
