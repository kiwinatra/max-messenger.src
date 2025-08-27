package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: sy1  reason: default package */
public abstract class sy1 implements xye {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public oy1 d;
    public long e;
    public long f;
    public long g;

    public sy1() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new ba4(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            ms1 ms1 = new ms1(4, this);
            qy1 qy1 = new qy1();
            qy1.y = ms1;
            arrayDeque.add(qy1);
        }
        this.c = new PriorityQueue();
        this.g = -9223372036854775807L;
    }

    public final void a(long j) {
        this.g = j;
    }

    public final void b(long j) {
        this.e = j;
    }

    public final void c(cze cze) {
        n79.g(cze == this.d);
        oy1 oy1 = (oy1) cze;
        long j = this.g;
        if (j == -9223372036854775807L || oy1.x >= j) {
            long j2 = this.f;
            this.f = 1 + j2;
            oy1.Z = j2;
            this.c.add(oy1);
        } else {
            oy1.z();
            this.a.add(oy1);
        }
        this.d = null;
    }

    public abstract b8d e();

    public final Object f() {
        n79.n(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        oy1 oy1 = (oy1) arrayDeque.pollFirst();
        this.d = oy1;
        return oy1;
    }

    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0;
        this.e = 0;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            oy1 oy1 = (oy1) priorityQueue.poll();
            int i = v0g.a;
            oy1.z();
            arrayDeque.add(oy1);
        }
        oy1 oy12 = this.d;
        if (oy12 != null) {
            oy12.z();
            arrayDeque.add(oy12);
            this.d = null;
        }
    }

    public abstract void g(oy1 oy1);

    /* renamed from: h */
    public eze d() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.c;
            if (priorityQueue.isEmpty()) {
                break;
            }
            int i = v0g.a;
            if (((oy1) priorityQueue.peek()).x > this.e) {
                break;
            }
            oy1 oy1 = (oy1) priorityQueue.poll();
            boolean h = oy1.h(4);
            ArrayDeque arrayDeque2 = this.a;
            if (h) {
                eze eze = (eze) arrayDeque.pollFirst();
                eze.a(4);
                oy1.z();
                arrayDeque2.add(oy1);
                return eze;
            }
            g(oy1);
            if (i()) {
                b8d e2 = e();
                eze eze2 = (eze) arrayDeque.pollFirst();
                long j = oy1.x;
                eze2.c = j;
                eze2.v = e2;
                eze2.w = j;
                oy1.z();
                arrayDeque2.add(oy1);
                return eze2;
            }
            oy1.z();
            arrayDeque2.add(oy1);
        }
        return null;
    }

    public abstract boolean i();

    public void release() {
    }
}
