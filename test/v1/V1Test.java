package v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * v1
 * 목표: 완벽한 해법을 구하는 것이 아닌 테스트를 통과하는 것
 */
class V1Test {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

}