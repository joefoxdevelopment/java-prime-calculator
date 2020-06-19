package com.joefox.prime.test;

import com.joefox.prime.results.Result;
import java.time.Instant;

public class Tester
{
    public Result testIsPrime(int value) {
        Instant start = Instant.now();

        boolean isPrime = true;
        for (int i = 2; value > i; i++) {
            if (((double) value / i) == ((double) (value / i))) {
                isPrime = false;
                break;
            }
        }

        return new Result(
            isPrime,
            Instant.now().getNano() - start.getNano(),
            value
        );
    }
}
