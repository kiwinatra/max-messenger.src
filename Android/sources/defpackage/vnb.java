package defpackage;

import java.io.InputStreamReader;
import java.io.Writer;
import java.util.NoSuchElementException;
import ru.ok.android.api.json.JsonSyntaxException;

/* renamed from: vnb  reason: default package */
public final class vnb extends v1 {
    public final Writer a;
    public final ni0 b;

    public vnb(Writer writer) {
        ni0 ni0 = new ni0(19);
        this.b = ni0;
        this.a = writer;
        ni0.G(0);
    }

    public static String o(ni0 ni0) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        int i = ni0.b;
        if (i >= 0) {
            int[] iArr2 = new int[Math.max(i, 8)];
            int i2 = 0;
            while (ni0.b != 0) {
                int D = ni0.D();
                int length = iArr2.length;
                if (i2 < length) {
                    iArr = iArr2;
                } else {
                    iArr = new int[(length * 2)];
                    System.arraycopy(iArr2, 0, iArr, 0, length);
                    iArr2 = iArr;
                }
                iArr2[i2] = D;
                i2++;
                iArr2 = iArr;
            }
            while (i2 != 0) {
                if (i2 != 0) {
                    i2--;
                    int i3 = iArr2[i2];
                    String str = "";
                    switch (i3) {
                        case 0:
                        case 1:
                            break;
                        case 2:
                        case 3:
                            str = "[";
                            break;
                        case 4:
                        case 6:
                            str = "{";
                            break;
                        case 5:
                            str = "{:";
                            break;
                        default:
                            throw new IllegalArgumentException(wj6.h(i3, str));
                    }
                    sb.append(str);
                    ni0.G(i3);
                } else {
                    throw new NoSuchElementException();
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException(wj6.h(i, "Illegal Capacity: "));
    }

    public final void a(String str) {
        m();
        this.a.write(str);
    }

    public final void close() {
        this.a.close();
        if (this.b.C() != 1) {
            throw new IllegalStateException("Unfinished document");
        }
    }

    public final void flush() {
        this.a.flush();
    }

    public final zp7 h0(String str) {
        ni0 ni0 = this.b;
        int C = ni0.C();
        Writer writer = this.a;
        if (C == 6) {
            writer.write(44);
        } else if (C != 4) {
            throw new IllegalStateException("Nesting problem: " + o(ni0));
        }
        ni0.E(5);
        y64.O(str, writer);
        return this;
    }

    public final void i(String str) {
        m();
        y64.O(str, this.a);
    }

    public final void m() {
        ni0 ni0 = this.b;
        int C = ni0.C();
        if (C != 0) {
            Writer writer = this.a;
            if (C == 5) {
                writer.write(":");
                ni0.E(6);
            } else if (C == 2) {
                ni0.E(3);
            } else if (C == 3) {
                writer.write(44);
            } else {
                throw new IllegalStateException("Nesting problem: " + o(ni0));
            }
        } else {
            ni0.E(1);
        }
    }

    public final void n(int i, int i2) {
        ni0 ni0 = this.b;
        int C = ni0.C();
        if (C == i2 || C == i) {
            ni0.D();
            return;
        }
        throw new IllegalStateException("Nesting problem: " + o(ni0));
    }

    public final void p(InputStreamReader inputStreamReader) {
        m();
        ni0 ni0 = this.b;
        int C = ni0.C();
        Writer writer = this.a;
        if (C == 2 || C == 3) {
            kp7 kp7 = new kp7(inputStreamReader);
            tf6.l0(kp7, writer);
            while (kp7.U() != 0) {
                kp7.b(44);
                kp7.a(writer);
                tf6.l0(kp7, writer);
            }
        } else if (C == 6) {
            kp7 kp72 = new kp7(inputStreamReader);
            tf6.l0(kp72, writer);
            if (kp72.U() != 0) {
                throw JsonSyntaxException.b(kp72.U(), kp72.m(), (long) kp72.o);
            }
        } else {
            throw new IllegalStateException("Nesting problem: " + o(ni0));
        }
    }

    public final void r() {
        n(4, 6);
        this.a.write(125);
    }

    public final void t() {
        m();
        this.b.G(4);
        this.a.write(123);
    }

    public final void u() {
        n(2, 3);
        this.a.write(93);
    }

    public final void v() {
        m();
        this.b.G(2);
        this.a.write(91);
    }
}
