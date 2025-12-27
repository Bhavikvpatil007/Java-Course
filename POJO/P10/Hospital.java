package POJO.P10;

public class Hospital {

    private Patient patient;
    private Doctor doctor;
    private Room room;

    public Hospital(Patient patient, Doctor doctor, Room room) {
        this.patient = patient;
        this.doctor = doctor;
        this.room = room;
    }

    public void printReport() {

        System.out.println("\n===== HOSPITAL REPORT =====");

        System.out.println("\nPatient Details:");
        System.out.println("ID: " + patient.getId());
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        if (patient.getAge() < 12) {
            System.out.println("Assigned Specialist: Child Specialist");
        }

        if (patient.getAge() >= 60) {
            System.out.println("Note: Senior Citizen Priority");
        }

        System.out.println("\nDoctor Details:");
        System.out.println("Name: " + doctor.getName());
        System.out.println("Specialization: " + doctor.getSpecialization());

        System.out.println("\nRoom Details:");
        System.out.println("Room No: " + room.getRoomNo());
        System.out.println("Room Type: " + room.getType());
    }
}
