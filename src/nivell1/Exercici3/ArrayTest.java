package nivell1.Exercici3;

import org.testng.annotations.Test;

public class ArrayTest {

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testArrayException() {

        ArrayException arrayException = new ArrayException();
        arrayException.exception();
    }
}

