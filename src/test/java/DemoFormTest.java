import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoFormTest {
    @Test
    void testDefaultDataIsUsed() {
        DemoForm demoForm = new DemoForm();
        demoForm.fillForm();
        assertEquals(demoForm.formData.firstName, "Sam");
    }

    @Test
    void testCustomDataIsUsed() {
        DemoFormDataBuilder dataWithCustomFirstName = new DemoFormDataBuilder().withFirstName("Ali");
        DemoForm demoForm = new DemoForm(dataWithCustomFirstName);
        demoForm.fillForm();
        assertEquals(demoForm.formData.firstName, "Ali");
    }
}
