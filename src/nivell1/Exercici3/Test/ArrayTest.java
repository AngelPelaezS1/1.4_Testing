package nivell1.Exercici3.Test;

import nivell1.Exercici3.ArrayException;
import org.testng.annotations.Test;

public class ArrayTest {

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testArrayException() {

        ArrayException arrayException = new ArrayException();
        arrayException.exception();
    }
}

