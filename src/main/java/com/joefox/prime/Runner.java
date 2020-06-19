package com.joefox.prime;

import java.util.ArrayList;
import com.joefox.prime.results.Result;
import com.joefox.prime.test.Tester;

public class Runner
{
    private final boolean showAll;
    private final ArrayList<Result> resultsCollection;
    private final int max;
    private final int min;
    private final Output output;
    private final Tester tester;

    public Runner(
        int min,
        int max,
        Output output,
        boolean showAll,
        Tester tester
    ) {
        this.min               = min;
        this.max               = max;
        this.resultsCollection = new ArrayList<Result>();
        this.output            = output;
        this.showAll           = showAll;
        this.tester            = tester;
    }

    public void run() {
        for (int i = this.min; i <= this.max; i++) {
            this.registerResult(this.tester.testIsPrime(i));
        }
        this.displayResults();
    }

    private void registerResult(Result result) {
        this.resultsCollection.add(result);
    }

    private void displayResults()
    {
        // this works with lambdas as the reference is already set
        int[] counter = {0};

        this.resultsCollection.forEach((Result result) -> {
            if (result.getIsPrime() || this.showAll) {
                this.output.printLine(String.format(
                    "%d is %sa prime number. Test took %d nanoseconds.",
                    result.getValue(),
                    result.getIsPrime() ? "" : "not ",
                    result.getDuration()
                ));
            }

            if (result.getIsPrime()) {
                counter[0]++;
            }
        });

        this.output.printLine(String.format(
            "\nFound %d prime numbers between %d and %d",
            counter[0],
            this.min,
            this.max
        ));
    }
}
