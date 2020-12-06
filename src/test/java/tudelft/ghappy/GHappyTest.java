package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest
{
    @ParameterizedTest(name = "{0}: {1} = {2}")
    @CsvSource({
            "'test1','xxggxx',true",
            "'test2','xxgxx',false",
            "'test3','xxggyygxx',false",
            "'test4','g', false",
            "'test5','gg', true",
            "'test6','xxgggxygg', true",
            "'test7','yyygggxyy', true",
            "'test8','', true"
    })

    public void testAlgorithm(String partition, String str ,  boolean expectedResult)
    {
        boolean result = new GHappy().gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
}