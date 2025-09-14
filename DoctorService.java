import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<String> getAvailableTimes(int doctorId, String date) {
        // giả sử lấy từ cơ sở dữ liệu
        return doctorRepository.findAvailableTimesByDoctorIdAndDate(doctorId, date);
    }

    public boolean validateLogin(String email, String password) {
        Doctor doctor = doctorRepository.findByEmail(email).orElse(null);
        if (doctor != null && doctor.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
