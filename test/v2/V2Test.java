package v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * v2
 * 1. 가짜로 구현하기
 * 2. 명백한 구현 사용하기
 */
class V2Test {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        five.times(3);
        assertEquals(15, product.amount);
    }

}