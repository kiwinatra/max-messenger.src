package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: sja  reason: default package */
public final class sja extends jha {
    public final gh3 a;
    public final int b = 1;
    public qja c;

    public sja(gh3 gh3) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.a = gh3;
    }

    public final void D(qja qja) {
        synchronized (this) {
            try {
                if (this.c == qja) {
                    qja.getClass();
                    long j = qja.b - 1;
                    qja.b = j;
                    if (j == 0) {
                        this.c = null;
                        this.a.F();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void E(qja qja) {
        synchronized (this) {
            try {
                if (qja.b == 0 && qja == this.c) {
                    this.c = null;
                    mq4 mq4 = (mq4) qja.get();
                    qq4.a(qja);
                    if (mq4 == null) {
                        qja.o = true;
                    } else {
                        this.a.F();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(cla cla) {
        qja qja;
        boolean z;
        synchronized (this) {
            try {
                qja = this.c;
                if (qja == null) {
                    qja = new qja(this);
                    this.c = qja;
                }
                long j = qja.b + 1;
                qja.b = j;
                if (qja.c || j != ((long) this.b)) {
                    z = false;
                } else {
                    z = true;
                    qja.c = true;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.a.a(new rja(cla, this, qja));
        if (z) {
            this.a.D(qja);
        }
    }
}
