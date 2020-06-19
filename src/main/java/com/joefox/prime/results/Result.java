package com.joefox.prime.results;

public class Result {
    private final boolean isPrime;
    private final int duration;
    private final int value;

    public Result(boolean isPrime, int duration, int value) {
        this.isPrime  = isPrime;
        this.duration = duration;
        this.value    = value;
    }

    public int getValue() {
        return this.value;
    }

    public boolean getIsPrime() {
        return this.isPrime;
    }

    public int getDuration() {
        return this.duration;
    }
}
