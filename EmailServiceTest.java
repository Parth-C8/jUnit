import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailServiceTest {

    Order order;
    EmailService email;

    @BeforeEach
    void setUp() {
        this.order = new Order(2, "Router", 5000.00);
        email = EmailService.getInstance();
    }

    @Test
    void testSendEmail() {
        Executable executable = () -> email.sendEmail(order);
        assertThrows(RuntimeException.class, executable);
    }

    @Test
    void testSendEmailWithString() {
        assertTrue(email.sendEmail(order, "WiFi"));
    }

    @Test
    void testGetInstance() {
        assertTrue(EmailService.getInstance() instanceof EmailService);
    }
}
