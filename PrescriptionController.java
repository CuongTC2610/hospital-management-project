import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    private final PrescriptionService prescriptionService;
    private final TokenService tokenService;

    public PrescriptionController(PrescriptionService prescriptionService, TokenService tokenService) {
        this.prescriptionService = prescriptionService;
        this.tokenService = tokenService;
    }

    @PostMapping
    public ResponseEntity<?> savePrescription(
            @RequestBody Prescription prescription,
            @RequestHeader("Authorization") String token) {
        if (!tokenService.validateToken(token)) {
            return ResponseEntity.status(401).body("Invalid token");
        }
        prescriptionService.save(prescription);
        return ResponseEntity.ok("Prescription saved successfully");
    }
}
