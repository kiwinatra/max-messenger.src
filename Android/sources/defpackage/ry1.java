package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: ry1  reason: default package */
public abstract class ry1 implements wye {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public ny1 o;
    public long v;
    public long w;

    public ry1() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new aa4(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            ms1 ms1 = new ms1(3, this);
            py1 py1 = new py1();
            py1.x = ms1;
            arrayDeque.add(py1);
        }
        this.c = new PriorityQueue();
    }

    public abstract ty1 a();

    public final void b(long j) {
        this.v = j;
    }

    public abstract void c(ny1 ny1);

    /* renamed from: e */
    public dze d() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.c;
            if (priorityQueue.isEmpty()) {
                break;
            }
            int i = t0g.a;
            if (((ny1) priorityQueue.peek()).w > this.v) {
                break;
            }
            ny1 ny1 = (ny1) priorityQueue.poll();
            boolean h = ny1.h(4);
            ArrayDeque arrayDeque2 = this.a;
            if (h) {
                dze dze = (dze) arrayDeque.pollFirst();
                dze.a(4);
                ny1.z();
                arrayDeque2.add(ny1);
                return dze;
            }
            c(ny1);
            if (g()) {
                ty1 a2 = a();
                dze dze2 = (dze) arrayDeque.pollFirst();
                dze2.A(ny1.w, a2, LongCompanionObject.MAX_VALUE);
                ny1.z();
                arrayDeque2.add(ny1);
                return dze2;
            }
            ny1.z();
            arrayDeque2.add(ny1);
        }
        return null;
    }

    public final Object f() {
        y64.j(this.o == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        ny1 ny1 = (ny1) arrayDeque.pollFirst();
        this.o = ny1;
        return ny1;
    }

    public void flush() {
        ArrayDeque arrayDeque;
        this.w = 0;
        this.v = 0;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            ny1 ny1 = (ny1) priorityQueue.poll();
            int i = t0g.a;
            ny1.z();
            arrayDeque.add(ny1);
        }
        ny1 ny12 = this.o;
        if (ny12 != null) {
            ny12.z();
            arrayDeque.add(ny12);
            this.o = null;
        }
    }

    public abstract boolean g();

    public final void l(bze bze) {
        y64.g(bze == this.o);
        ny1 ny1 = (ny1) bze;
        if (ny1.h(IntCompanionObject.MIN_VALUE)) {
            ny1.z();
            this.a.add(ny1);
        } else {
            long j = this.w;
            this.w = 1 + j;
            ny1.Y = j;
            this.c.add(ny1);
        }
        this.o = null;
    }

    public void release() {
    }
}
