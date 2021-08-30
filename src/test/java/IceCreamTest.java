import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IceCreamTest
{
    @Test
    void mustReturnExceptionForLargeIceCream()
    {
        try
        {
            IceCreamBuilder iceCreamBuilder = new IceCreamBuilder();
            IceCream iceCream = iceCreamBuilder
                    .setName("Chocolate")
                    .setSize("Grande")
                    .build();
            fail();
        }
        catch (IllegalArgumentException exception)
        {
            assertEquals("Size not available!", exception.getMessage());
        }
    }

    @Test
    void mustReturnIceCream()
    {
        IceCreamBuilder iceCreamBuilder = new IceCreamBuilder();
        IceCream iceCream = iceCreamBuilder
                .setName("Chocolate")
                .setSize("Small")
                .setSugar(true)
                .build();

        assertNotNull(iceCream);
    }
}
