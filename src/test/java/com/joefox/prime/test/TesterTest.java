package com.joefox.prime;

import com.joefox.prime.test.Tester;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TesterTest
{
    private Tester tester;

    @BeforeEach public void init() {
        this.tester = new Tester();
    }

    @Test public void testTestIsPrimeReturnsFalseResultForNonPrimeNumber() {
        // 10 isn't prime, has factors 1, 2, 5 and 10
        assertFalse(this.tester.testIsPrime(10).getIsPrime());
    }

    @Test public void testTestIsPrimeReturnsTrueResultForNonPrimeNumber() {
        // 11 is prime, only itself and 1 are factors
        assertTrue(this.tester.testIsPrime(11).getIsPrime());
    }
}
