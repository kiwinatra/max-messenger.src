package com.facebook.common.time;

@cr4
public class AwakeTimeSinceBootClock implements zs9 {
    @cr4
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @cr4
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @cr4
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @cr4
    public long nowNanos() {
        return System.nanoTime();
    }
}
