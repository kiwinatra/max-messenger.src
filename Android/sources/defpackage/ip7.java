package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.Closeable;
import java.io.Flushable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: ip7  reason: default package */
public abstract class ip7 implements Closeable, Flushable {
    static {
        s9a.h(oxe.values());
        oxe.CAN_WRITE_FORMATTED_NUMBERS.getMask();
        oxe.CAN_WRITE_BINARY_NATIVELY.getMask();
    }

    public static void b(String str) {
        throw new JsonProcessingException(str, (lp7) null, (NumberFormatException) null);
    }

    public abstract void U(double d);

    public abstract void V(float f);

    public final void a(pp7 pp7) {
        int i = 1;
        while (true) {
            wp7 v0 = pp7.v0();
            if (v0 != null) {
                boolean z = false;
                switch (v0.o) {
                    case 1:
                        r0();
                        break;
                    case 2:
                        n();
                        i--;
                        if (i != 0) {
                            continue;
                        } else {
                            return;
                        }
                    case 3:
                        q0();
                        break;
                    case 4:
                        m();
                        i--;
                        if (i != 0) {
                            continue;
                        } else {
                            return;
                        }
                    case 5:
                        o(pp7.U());
                        continue;
                    case 6:
                        m8b m8b = (m8b) pp7;
                        wp7 wp7 = m8b.b;
                        if (wp7 == wp7.VALUE_STRING) {
                            z = true;
                        } else if (wp7 == wp7.FIELD_NAME) {
                            z = m8b.y0;
                        }
                        if (!z) {
                            s0(pp7.r0());
                            break;
                        } else {
                            t0(pp7.s0(), pp7.u0(), pp7.t0());
                            continue;
                        }
                    case 7:
                        int p0 = pp7.p0();
                        if (p0 != 1) {
                            if (p0 != 3) {
                                k0(pp7.m0());
                                break;
                            } else {
                                p0(pp7.n());
                                break;
                            }
                        } else {
                            e0(pp7.k0());
                            continue;
                        }
                    case 8:
                        int p02 = pp7.p0();
                        if (p02 != 6) {
                            if (p02 != 4) {
                                U(pp7.e0());
                                break;
                            } else {
                                V((float) ((m8b) pp7).e0());
                                break;
                            }
                        } else {
                            m0(pp7.V());
                            continue;
                        }
                    case 9:
                        d(true);
                        continue;
                    case 10:
                        d(false);
                        continue;
                    case 11:
                        drg drg = (drg) this;
                        drg.B0("write a null");
                        drg.C0();
                        continue;
                    case 12:
                        drg drg2 = (drg) ((pp6) this);
                        drg2.B0("write a null");
                        drg2.C0();
                        continue;
                    default:
                        throw new IllegalStateException("Internal error: unknown current token, " + v0);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public abstract void close();

    public abstract void d(boolean z);

    public abstract void e0(int i);

    public abstract void k0(long j);

    public abstract void m();

    public abstract void m0(BigDecimal bigDecimal);

    public abstract void n();

    public abstract void o(String str);

    public abstract void p0(BigInteger bigInteger);

    public abstract void q0();

    public abstract void r0();

    public abstract void s0(String str);

    public abstract void t0(char[] cArr, int i, int i2);
}
