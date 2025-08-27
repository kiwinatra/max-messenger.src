package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: q95  reason: default package */
public final class q95 implements nde {
    public final nde a;
    public boolean b;
    public long c;
    public boolean o;
    public final long v;
    public final /* synthetic */ ce w;

    public q95(ce ceVar, nde nde, long j) {
        this.w = ceVar;
        this.a = nde;
        this.v = j;
    }

    public final void O(rt0 rt0, long j) {
        if (!this.o) {
            long j2 = this.v;
            if (j2 == -1 || this.c + j <= j2) {
                try {
                    this.a.O(rt0, j);
                    this.c += j;
                } catch (IOException e) {
                    throw n(e);
                }
            } else {
                StringBuilder n = tr1.n(j2, "expected ", " bytes but received ");
                n.append(this.c + j);
                throw new ProtocolException(n.toString());
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final void close() {
        if (!this.o) {
            this.o = true;
            long j = this.v;
            if (j == -1 || this.c == j) {
                try {
                    m();
                    n((IOException) null);
                } catch (IOException e) {
                    throw n(e);
                }
            } else {
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    public final void flush() {
        try {
            o();
        } catch (IOException e) {
            throw n(e);
        }
    }

    public final void m() {
        this.a.close();
    }

    public final IOException n(IOException iOException) {
        if (this.b) {
            return iOException;
        }
        this.b = true;
        return this.w.f(false, true, iOException);
    }

    public final void o() {
        this.a.flush();
    }

    public final lkf q() {
        return this.a.q();
    }

    public final String toString() {
        return q95.class.getSimpleName() + '(' + this.a + ')';
    }
}
