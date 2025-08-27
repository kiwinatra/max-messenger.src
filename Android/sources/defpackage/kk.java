package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* renamed from: kk  reason: default package */
public final class kk {
    public final hr6 a;
    public final ic3 b;
    public volatile Integer c;
    public volatile u64 d;
    public volatile w64 e;
    public final jk f = new jk(this);
    public volatile o15 g;
    public volatile long h;

    public kk(hr6 hr6, ic3 ic3, Integer num) {
        this.a = hr6;
        this.b = ic3;
        this.c = num;
        Integer num2 = this.c;
        this.g = (num2 != null && num2.intValue() == 1) ? null : new o15(this);
        hr6.getClass();
    }

    public final void a(int i, gsg gsg) {
        Boolean bool;
        String str;
        w64 w64;
        boolean z = true;
        ik ikVar = (i != 1 || !(gsg instanceof si)) ? new ik(i, (int) (SystemClock.elapsedRealtime() - this.h), gsg) : null;
        if (ikVar == null || (w64 = this.e) == null) {
            bool = null;
        } else {
            AtomicInteger atomicInteger = w64.v;
            int i2 = atomicInteger.get();
            int i3 = w64.b;
            ic3 ic3 = w64.a;
            if (i2 > i3) {
                ((AtomicInteger) ic3.c).incrementAndGet();
                z = false;
            } else {
                w64.o.add(ikVar);
                ((AtomicInteger) ic3.o).incrementAndGet();
                atomicInteger.incrementAndGet();
                ReentrantLock reentrantLock = w64.y;
                reentrantLock.lock();
                try {
                    w64.z.signal();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }
            bool = Boolean.valueOf(z);
        }
        if (!Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            if (!(gsg instanceof ri)) {
                if (gsg instanceof si) {
                    String l = Long.toString(((long) ((si) gsg).k) & 4294967295L, CharsKt.checkRadix(16));
                    int i4 = 6;
                    if (l.length() > 6) {
                        i4 = 8;
                    }
                    str = a81.m("bgColor: 0x", StringsKt.padStart(l, i4, '0'));
                } else if (gsg instanceof ti) {
                    str = "EOS";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                ((voc) this.a.a).log("AniSend", "package was not sent: " + str);
                return;
            }
            ((ri) gsg).getClass();
            throw null;
        }
    }

    public final void b() {
        u64 u64 = this.d;
        if (u64 != null) {
            jk jkVar = this.f;
            if (jkVar != null) {
                u64.c.remove(jkVar);
            } else {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        this.d = null;
        w64 w64 = this.e;
        if (w64 != null) {
            if (!w64.Y) {
                w64.Y = true;
                w64.interrupt();
            }
            ReentrantLock reentrantLock = w64.X;
            reentrantLock.lock();
            try {
                w64.c = null;
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
        this.e = null;
    }

    public final void c(int i) {
        o15 o15 = this.g;
        Integer num = this.c;
        if (o15 != null) {
            o15.b = Integer.valueOf(i);
            o15.a();
        } else if (num != null) {
            int intValue = num.intValue();
            if (intValue == 2) {
                a(intValue, new si(i));
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
            voc voc = (voc) this.a.a;
            String message = illegalStateException.getMessage();
            if (message == null) {
                message = "animoji error";
            }
            voc.reportException("AniSend", message, illegalStateException);
            o15 o152 = new o15(this);
            o152.b = Integer.valueOf(i);
            o152.a();
            this.g = o152;
        }
    }

    public final void d(u64 u64) {
        b();
        this.d = u64;
        jk jkVar = this.f;
        if (jkVar != null) {
            u64.c.add(jkVar);
            this.h = SystemClock.elapsedRealtime();
            ic3 ic3 = this.b;
            ((AtomicInteger) ic3.a).set(0);
            ((AtomicInteger) ic3.b).set(0);
            ((AtomicInteger) ic3.c).set(0);
            ((AtomicInteger) ic3.o).set(0);
            this.e = new w64(u64, this.b);
            w64 w64 = this.e;
            if (w64 != null) {
                w64.start();
            }
            o15 o15 = this.g;
            if (o15 != null) {
                o15.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Illegal 'listener' value: null");
    }
}
