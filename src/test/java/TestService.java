import org.junit.Assert;
import org.junit.Test;
import hu.iac.opdracht1.controller.PowerServiceImpl;

/**
 * Created by lap on 10-3-2017.
 */
public class TestService {
    @Test
    public void testStadAmersfoort() {
        PowerServiceImpl service1 = new PowerServiceImpl();
        Assert.assertEquals(350, service1.geefAantalKoffieautomaten("Amersfoort"));

    }

    @Test
    public void testTotaal() {
        PowerServiceImpl service2 = new PowerServiceImpl();
        Assert.assertEquals(1600, service2.geefTotaal());
    }
}
