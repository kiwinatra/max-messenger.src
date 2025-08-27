package defpackage;

import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.List;
import kotlin.io.encoding.Base64;
import ru.ok.android.api.json.JsonSyntaxException;

/* renamed from: f57  reason: default package */
public final class f57 extends v1 {
    public static final byte[] z = {110, 117, 108, 108};
    public final OutputStream a;
    public final List b;
    public final String c;
    public final ni0 o = new ni0(19);
    public final MessageDigest v;
    public final i6b w;
    public int x;
    public boolean y;

    /* JADX WARNING: type inference failed for: r4v1, types: [pa9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f57(java.io.OutputStream r2, java.util.ArrayList r3, java.lang.String r4) {
        /*
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            ni0 r3 = new ni0
            r0 = 19
            r3.<init>((int) r0)
            r1.o = r3
            ozf r3 = new ozf
            r3.<init>(r2)
            if (r4 == 0) goto L_0x002f
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0028 }
            r1.v = r2
            pa9 r4 = new pa9
            r4.<init>(r3, r2)
            r3 = r4
            goto L_0x0033
        L_0x0028:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
        L_0x002f:
            maa r2 = defpackage.maa.a
            r1.v = r2
        L_0x0033:
            i6b r2 = new i6b
            r2.<init>(r3)
            r1.w = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f57.<init>(java.io.OutputStream, java.util.ArrayList, java.lang.String):void");
    }

    public final void a(String str) {
        m();
        this.w.write(str);
    }

    public final void close() {
        this.w.close();
        int C = this.o.C();
        if (C != 0 && C != 2) {
            throw new IllegalStateException("Unfinished document");
        }
    }

    public final void d0() {
        m();
        if (this.o.C() == 2) {
            this.v.update(z);
            return;
        }
        i6b i6b = this.w;
        i6b.getClass();
        i6b.write("null", 0, 4);
    }

    public final void flush() {
        this.w.flush();
    }

    public final zp7 h0(String str) {
        int i;
        int C = this.o.C();
        if ((C == 0 || C == 2) && (i = this.x) >= 0) {
            this.x = -1;
            while (true) {
                List list = this.b;
                if (i >= list.size()) {
                    break;
                }
                xxe xxe = (xxe) list.get(i);
                int compareTo = str.compareTo(xxe.a);
                if (compareTo < 0) {
                    break;
                }
                if (compareTo > 0) {
                    xxe.a(this);
                }
                i++;
            }
            this.x = i;
        }
        n(str);
        return this;
    }

    public final void i(String str) {
        m();
        int C = this.o.C();
        i6b i6b = this.w;
        if (C == 2) {
            if (str.length() == 0) {
                this.v.update(z);
            }
            i6b.getClass();
            i6b.write(str, 0, str.length());
            return;
        }
        y64.O(str, i6b);
    }

    public final void m() {
        ni0 ni0 = this.o;
        int C = ni0.C();
        if (C != 1) {
            i6b i6b = this.w;
            if (C == 4) {
                ni0.E(5);
                i6b.write(58);
            } else if (C == 6) {
                ni0.E(7);
            } else if (C == 7) {
                i6b.write(44);
            } else {
                throw new IllegalStateException("Nesting problem: " + mz4.b(ni0));
            }
        } else {
            ni0.E(2);
            this.a.write(61);
            this.v.update(Base64.padSymbol);
        }
    }

    public final void n(String str) {
        ni0 ni0 = this.o;
        int C = ni0.C();
        i6b i6b = this.w;
        if (C == 0) {
            ni0.E(1);
            i6b.write(str);
        } else if (C == 5) {
            i6b.write(44);
            ni0.E(4);
            y64.O(str, i6b);
        } else if (C == 2) {
            this.a.write(38);
            ni0.E(1);
            i6b.write(str);
        } else if (C == 3) {
            ni0.E(4);
            y64.O(str, i6b);
        } else {
            throw new IllegalStateException("Nesting problem: " + mz4.b(ni0));
        }
    }

    public final void p(InputStreamReader inputStreamReader) {
        m();
        ni0 ni0 = this.o;
        int C = ni0.C();
        i6b i6b = this.w;
        if (C == 2 || C == 5) {
            kp7 kp7 = new kp7(inputStreamReader);
            tf6.l0(kp7, i6b);
            if (kp7.U() != 0) {
                throw JsonSyntaxException.b(kp7.U(), kp7.m(), (long) kp7.o);
            }
        } else if (C == 6 || C == 7) {
            kp7 kp72 = new kp7(inputStreamReader);
            tf6.l0(kp72, i6b);
            while (kp72.U() != 0) {
                kp72.b(44);
                kp72.a(i6b);
                tf6.l0(kp72, i6b);
            }
        } else {
            throw new IllegalStateException("Nesting problem: " + mz4.b(ni0));
        }
    }

    public final void r() {
        ni0 ni0 = this.o;
        int C = ni0.C();
        if (C == 3 || C == 5) {
            ni0.D();
            this.w.write(125);
            return;
        }
        throw new IllegalStateException("Nesting problem: " + mz4.b(ni0));
    }

    public final void t() {
        m();
        this.o.G(3);
        this.w.write(123);
    }

    public final void u() {
        ni0 ni0 = this.o;
        int C = ni0.C();
        if (C == 6 || C == 7) {
            ni0.D();
            this.w.write(93);
            return;
        }
        throw new IllegalStateException("Nesting problem: " + mz4.b(ni0));
    }

    public final void v() {
        m();
        this.o.G(6);
        this.w.write(91);
    }
}
