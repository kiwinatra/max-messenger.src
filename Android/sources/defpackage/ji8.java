package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ji8  reason: default package */
public final class ji8 extends ConcurrentLinkedQueue implements mi8 {
    public int a;
    public final AtomicInteger b = new AtomicInteger();

    public final void drop() {
        poll();
    }

    public final int m() {
        return this.b.get();
    }

    public final int o() {
        return this.a;
    }

    public final boolean offer(Object obj) {
        this.b.getAndIncrement();
        return super.offer(obj);
    }

    public final Object poll() {
        Object poll = super.poll();
        if (poll != null) {
            this.a++;
        }
        return poll;
    }
}
