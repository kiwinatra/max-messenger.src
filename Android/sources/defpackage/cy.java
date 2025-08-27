package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* renamed from: cy  reason: default package */
public class cy extends lkf {
    public static final long h;
    public static final long i;
    public static cy j;
    public boolean e;
    public cy f;
    public long g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [cy, java.lang.Object] */
    public final void i() {
        cy cyVar;
        if (!this.e) {
            long j2 = this.c;
            boolean z = this.a;
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 != 0 || z) {
                this.e = true;
                synchronized (cy.class) {
                    try {
                        if (j == null) {
                            j = new Object();
                            yx yxVar = new yx("Okio Watchdog");
                            yxVar.setDaemon(true);
                            yxVar.start();
                        }
                        long nanoTime = System.nanoTime();
                        if (i2 != 0 && z) {
                            this.g = Math.min(j2, c() - nanoTime) + nanoTime;
                        } else if (i2 != 0) {
                            this.g = j2 + nanoTime;
                        } else if (z) {
                            this.g = c();
                        } else {
                            throw new AssertionError();
                        }
                        long j3 = this.g - nanoTime;
                        cy cyVar2 = j;
                        while (true) {
                            cyVar = cyVar2.f;
                            if (cyVar == null) {
                                break;
                            } else if (j3 < cyVar.g - nanoTime) {
                                break;
                            } else {
                                cyVar2 = cyVar;
                            }
                        }
                        this.f = cyVar;
                        cyVar2.f = this;
                        if (cyVar2 == j) {
                            cy.class.notify();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean j() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        synchronized (cy.class) {
            cy cyVar = j;
            while (cyVar != null) {
                cy cyVar2 = cyVar.f;
                if (cyVar2 == this) {
                    cyVar.f = this.f;
                    this.f = null;
                    return false;
                }
                cyVar = cyVar2;
            }
            return true;
        }
    }

    public IOException k(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void l() {
    }
}
