package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;

/* renamed from: o37  reason: default package */
public final class o37 extends mdf {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o37(String str, long j, ttc ttc) {
        super(str, true);
        this.f = j;
        this.g = ttc;
    }

    public final long a() {
        a47 a47;
        boolean z;
        switch (this.e) {
            case 0:
                synchronized (((a47) this.g)) {
                    a47 = (a47) this.g;
                    long j = a47.w0;
                    long j2 = a47.v0;
                    if (j < j2) {
                        z = true;
                    } else {
                        a47.v0 = j2 + 1;
                        z = false;
                    }
                }
                if (z) {
                    a47.a(2, 2, (IOException) null);
                    return -1;
                }
                try {
                    a47.H0.j(1, 0, false);
                } catch (IOException e2) {
                    a47.a(2, 2, e2);
                }
                return this.f;
            default:
                ttc ttc = (ttc) this.g;
                synchronized (ttc) {
                    try {
                        if (!ttc.o) {
                            nlg nlg = ttc.e;
                            if (nlg != null) {
                                int i = ttc.q ? ttc.p : -1;
                                ttc.p++;
                                ttc.q = true;
                                Unit unit = Unit.INSTANCE;
                                if (i != -1) {
                                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                    sb.append(ttc.u);
                                    sb.append("ms (after ");
                                    ttc.c(new SocketTimeoutException(wj6.l(sb, i - 1, " successful ping/pongs)")));
                                } else {
                                    try {
                                        nlg.b(9, vw0.o);
                                    } catch (IOException e3) {
                                        ttc.c(e3);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return this.f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o37(String str, a47 a47, long j) {
        super(str, true);
        this.g = a47;
        this.f = j;
    }
}
