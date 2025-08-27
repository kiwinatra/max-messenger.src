package defpackage;

import kotlin.Unit;

/* renamed from: gac  reason: default package */
public final class gac {
    public volatile boolean a = false;
    public final Object b = new Object();

    public final void a() {
        synchronized (this.b) {
            this.a = true;
            this.b.notify();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void b(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = j + currentTimeMillis;
        if (j2 < currentTimeMillis) {
            synchronized (this.b) {
                while (!this.a) {
                    try {
                        this.b.wait();
                    } finally {
                    }
                }
                this.a = false;
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        synchronized (this.b) {
            while (!this.a && currentTimeMillis < j2) {
                try {
                    this.b.wait(j2 - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                } finally {
                }
            }
            this.a = false;
        }
    }
}
