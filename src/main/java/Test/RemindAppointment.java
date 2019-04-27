package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class RemindAppointment {
	public static void main(String[] args) throws IOException, ParseException {
		Doctor doctor = new Doctor();
		Patient patient = new Patient();
		Date bookingDate = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmm");
		String date = "";
		String time = "";
		int count = 1;
		int pid = 0;
		int did = 0;
		int sid = 0;
		BufferedReader br = new BufferedReader(new FileReader("src/main/resources/properties.txt"));
		try {
			String line;

			while ((line = br.readLine()) != null) {
				String fields[] = line.split("=");
				if (count == 1) {
					patient.setPatientID(pid++);
					patient.setPatientName(fields[1].trim());
				} else if (count == 2) {
					doctor.setDoctorsID(did++);
					doctor.setDoctorName(fields[1].trim());
				} else if (count == 3) {
					doctor.setSpecialization(new Specialization(sid++, fields[1].trim()));
				} else if (count == 4) {
					date = fields[1].trim();
				} else if (count == 5) {
					time = fields[1].trim();
					count = 0;
				}

				if (date != "" && time != "")
					bookingDate = formatter.parse(date + time);
				count++;

			}

		} finally {
			br.close();
		}
		
		Appointment appointment = new Appointment(doctor, patient, bookingDate);
		String doctorName = appointment.getDoctor().getDoctorName();
		String patientName = appointment.getPatient().getPatientName();
		String specializationName = appointment.getDoctor().getSpecialization().getSpecializationName();
		Date appointmentDate = appointment.getDate();

		System.out.println("Mr." + patientName + ", you have an appointment with " + doctorName + " ("
				+ specializationName + ")" + " scheduled on " + appointmentDate);

	}
}