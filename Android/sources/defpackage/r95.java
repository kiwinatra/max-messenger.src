package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: r95  reason: default package */
public final class r95 implements yfe {
    public final yfe a;
    public long b;
    public boolean c = true;
    public boolean o;
    public boolean v;
    public final long w;
    public final /* synthetic */ ce x;

    public r95(ce ceVar, yfe yfe, long j) {
        this.x = ceVar;
        this.a = yfe;
        this.w = j;
        if (j == 0) {
            n((IOException) null);
        }
    }

    public final void close() {
        if (!this.v) {
            this.v = true;
            try {
                m();
                n((IOException) null);
            } catch (IOException e) {
                throw n(e);
            }
        }
    }

    public final long e(rt0 rt0, long j) {
        if (!this.v) {
            try {
                long e = this.a.e(rt0, j);
                if (this.c) {
                    this.c = false;
                    ce ceVar = this.x;
                    Object obj = ceVar.c;
                    ((bk3) ceVar.o).getClass();
                }
                if (e == -1) {
                    n((IOException) null);
                    return -1;
                }
                long j2 = this.b + e;
                long j3 = this.w;
                if (j3 == -1 || j2 <= j3) {
                    this.b = j2;
                    if (j2 == j3) {
                        n((IOException) null);
                    }
                    return e;
                }
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            } catch (IOException e2) {
                throw n(e2);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final void m() {
        this.a.close();
    }

    public final IOException n(IOException iOException) {
        if (this.o) {
            return iOException;
        }
        this.o = true;
        ce ceVar = this.x;
        if (iOException == null && this.c) {
            this.c = false;
            ((bk3) ceVar.o).getClass();
        }
        return ceVar.f(true, false, iOException);
    }

    public final lkf q() {
        return this.a.q();
    }

    public final String toString() {
        return r95.class.getSimpleName() + '(' + this.a + ')';
    }
}
