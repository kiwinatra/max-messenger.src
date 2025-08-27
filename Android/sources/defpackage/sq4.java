package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: sq4  reason: default package */
public final class sq4 implements Future {
    public final mq4 a;

    public sq4(mq4 mq4) {
        this.a = mq4;
    }

    public final boolean cancel(boolean z) {
        this.a.dispose();
        return false;
    }

    public final Object get() {
        return null;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }
}
