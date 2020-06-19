package com.joefox.prime;

import com.joefox.prime.results.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ResultTest
{
    private Result result;

    @BeforeEach public void init() {
        this.result = new Result(true, 5, 10);
    }

    @Test public void testGetIsPrimeReturnsSetValue() {
        assertTrue(this.result.getIsPrime());
    }

    @Test public void testGetDurationReturnsSetValue() {
        assertEquals(5, this.result.getDuration());
    }

    @Test public void testGetValueReturnsSetValue() {
        assertEquals(10, this.result.getValue());
    }
}
