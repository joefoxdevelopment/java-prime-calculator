package com.joefox.prime;

import com.joefox.prime.Output;
import com.joefox.prime.Runner;
import com.joefox.prime.results.Result;
import com.joefox.prime.test.Tester;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class RunnerTest
{
    private Output output;
    private Tester tester;

    @BeforeEach public void init() {
        this.output = mock(Output.class);
        this.tester = mock(Tester.class);
    }

    @Test public void testRunDisplaysAllResultsWhenShowAllTrue() {
        Runner runner = new Runner(
            4,
            5,
            this.output,
            true,
            this.tester
        );

        doReturn(new Result(false, 1, 4)).when(this.tester).testIsPrime(4);
        doReturn(new Result(true, 1, 5)).when(this.tester).testIsPrime(5);

        runner.run();
        verify(this.output, times(3)).printLine(anyString());
    }

    @Test public void testRunDisplaysAllResultsWhenShowAllFalse() {
        Runner runner = new Runner(
            4,
            5,
            this.output,
            false,
            this.tester
        );

        doReturn(new Result(false, 1, 4)).when(this.tester).testIsPrime(4);
        doReturn(new Result(true, 1, 5)).when(this.tester).testIsPrime(5);

        runner.run();
        verify(this.output, times(2)).printLine(anyString());
    }
}
