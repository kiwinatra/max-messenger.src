package defpackage;

import kotlin.Lazy;

/* renamed from: l5f  reason: default package */
public final class l5f {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public l5f(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy4;
        this.c = lazy2;
        this.d = lazy3;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, u05] */
    public static final kxf a(l5f l5f, qf9 qf9) {
        l5f.getClass();
        ? obj = new Object();
        String str = qf9.f;
        if (str.length() == 0) {
            str = qf9.a.c;
        }
        obj.o = str;
        obj.b = qf9.b;
        obj.c = qf9.d;
        obj.a = qf9.c;
        return new kxf(obj);
    }
}
