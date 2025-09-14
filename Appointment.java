import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Doctor doctor;

    @ManyToOne
    private Patient patient;

    private LocalDateTime appointmentTime;

    // getters và setters
}

