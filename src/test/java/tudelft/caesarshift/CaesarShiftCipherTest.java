package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "{0}: {1} , {2} = {3}")
    @CsvSource({
            "'test1','abc', 3, 'def' ",
            "'test2','xyz', 3, 'abc'",
            "'test3','abcd', 4, 'efgh'",
            "'test4','ab#', 2, 'invalid'",
            "'test5','ab', 4, 'ef'"
    })

    public void testAlgorithm(String partition, String message, int shift ,  String expectedResult)
    {
        String result = new CaesarShiftCipher().CaesarShiftCipher(message , shift);
        Assertions.assertEquals(expectedResult, result);
    }

}
