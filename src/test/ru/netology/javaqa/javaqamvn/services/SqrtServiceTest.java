package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.services.SqrtService;

public class SqrtServiceTest {

    @ParameterizedTest
    @CsvSource({
            "200,300"
    })
    public void shouldCalcExact(int x, int y) {
        SqrtService service = new SqrtService();

        int expected = ;
        int actual = service.calcSqrt(x,y);

        Assertions.assertEquals(expected, actual);
    }
}