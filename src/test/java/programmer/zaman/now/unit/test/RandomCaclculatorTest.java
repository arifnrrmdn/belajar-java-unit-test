package programmer.zaman.now.unit.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import programmer.zaman.now.unit.test.resolver.RandomParameterResolver;

import java.util.Random;

@Extensions({
        @ExtendWith(RandomParameterResolver.class)
})
public class RandomCaclculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void testRandom(TestInfo info, Random random) {
        var a = random.nextInt(10);
        var b = random.nextInt(10);

        var result = calculator.add(a,b);
        var expected = a + b;

        Assertions.assertEquals(expected,result);

    }
}
