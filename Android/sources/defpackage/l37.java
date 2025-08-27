package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: l37  reason: default package */
public final class l37 extends i37 {
    public long o;
    public final /* synthetic */ u9 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l37(u9 u9Var, long j) {
        super(u9Var);
        this.v = u9Var;
        this.o = j;
        if (j == 0) {
            m();
        }
    }

    public final void close() {
        boolean z;
        if (!this.b) {
            if (this.o != 0) {
                try {
                    z = u0g.s(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    z = false;
                }
                if (!z) {
                    ((mtc) this.v.v).k();
                    m();
                }
            }
            this.b = true;
        }
    }

    public final long e(rt0 rt0, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(wj6.i(j, "byteCount < 0: ").toString());
        } else if (!this.b) {
            long j2 = this.o;
            if (j2 == 0) {
                return -1;
            }
            long e = super.e(rt0, Math.min(j2, j));
            if (e != -1) {
                long j3 = this.o - e;
                this.o = j3;
                if (j3 == 0) {
                    m();
                }
                return e;
            }
            ((mtc) this.v.v).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }
}
