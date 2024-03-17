package v2;

public class Dollar {

    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        /**
         * 1. 가짜로 구현하기(컴파일)
         */
//        amount *= multiplier;
//        return null;
        /**
         * 2. 명백한 구현 사용하기
         */
        return new Dollar(amount * multiplier);
    }
}
