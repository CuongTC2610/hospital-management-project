import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    
    @ElementCollection
    private List<LocalDateTime> availableTimes;

    // getters và setters
}

