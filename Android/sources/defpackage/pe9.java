package defpackage;

import java.io.Serializable;

/* renamed from: pe9  reason: default package */
public final class pe9 implements Serializable {
    public final int a;
    public final int b;

    public pe9(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static pe9 a(pf9 pf9) {
        int e0 = ryg.e0(pf9);
        if (e0 == 0) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < e0; i3++) {
            String A0 = pf9.A0();
            A0.getClass();
            if (A0.equals("views")) {
                i = pf9.w0();
            } else if (!A0.equals("forwards")) {
                pf9.A();
            } else {
                i2 = pf9.w0();
            }
        }
        return new pe9(i, i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{views=");
        sb.append(this.a);
        sb.append(", forwards=");
        return wj6.l(sb, this.b, "}");
    }
}
