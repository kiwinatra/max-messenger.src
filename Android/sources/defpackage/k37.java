package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* renamed from: k37  reason: default package */
public final class k37 extends i37 {
    public long o = -1;
    public boolean v = true;
    public final m57 w;
    public final /* synthetic */ u9 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k37(u9 u9Var, m57 m57) {
        super(u9Var);
        this.x = u9Var;
        this.w = m57;
    }

    public final void close() {
        boolean z;
        if (!this.b) {
            if (this.v) {
                try {
                    z = u0g.s(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    z = false;
                }
                if (!z) {
                    ((mtc) this.x.v).k();
                    m();
                }
            }
            this.b = true;
        }
    }

    public final long e(rt0 rt0, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(wj6.i(j, "byteCount < 0: ").toString());
        } else if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.v) {
            return -1;
        } else {
            long j2 = this.o;
            int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            u9 u9Var = this.x;
            if (i == 0 || j2 == -1) {
                if (j2 != -1) {
                    ((xu0) u9Var.w).Y();
                }
                try {
                    this.o = ((xu0) u9Var.w).l0();
                    String obj = StringsKt.trim((CharSequence) ((xu0) u9Var.w).Y()).toString();
                    if (this.o < 0 || (obj.length() > 0 && !StringsKt__StringsJVMKt.startsWith$default(obj, ";", false, 2, (Object) null))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.o + obj + Typography.quote);
                    }
                    if (this.o == 0) {
                        this.v = false;
                        d57.b(((rla) u9Var.o).X, this.w, ((jz2) u9Var.c).Y());
                        m();
                    }
                    if (!this.v) {
                        return -1;
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long e2 = super.e(rt0, Math.min(j, this.o));
            if (e2 != -1) {
                this.o -= e2;
                return e2;
            }
            ((mtc) u9Var.v).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }
    }
}
