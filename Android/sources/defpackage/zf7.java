package defpackage;

import java.util.List;

/* renamed from: zf7  reason: default package */
public final class zf7 implements eq7 {
    public static final /* synthetic */ int c = 0;
    public final List a;
    public final String b;

    static {
        new zf7(new yf7());
    }

    public zf7(yf7 yf7) {
        this.a = yf7.a;
        this.b = yf7.b;
    }

    public final List a() {
        return this.a;
    }

    public final boolean b(eq7 eq7) {
        if (eq7 == null || !cvg.c(eq7.c(), this.b)) {
            return false;
        }
        List a2 = eq7.a();
        List list = this.a;
        if (list.size() != a2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            ew0 ew0 = (ew0) list.get(i);
            if (ew0.size() != ((ew0) a2.get(i)).size()) {
                return false;
            }
            for (int i2 = 0; i2 < ew0.size(); i2++) {
                if (!((xv0) ew0.get(i2)).equals(((ew0) a2.get(i)).get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String c() {
        return this.b;
    }
}
