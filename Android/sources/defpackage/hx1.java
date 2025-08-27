package defpackage;

/* renamed from: hx1  reason: default package */
public final /* synthetic */ class hx1 implements eo1 {
    public final /* synthetic */ jx1 a;

    public /* synthetic */ hx1(jx1 jx1) {
        this.a = jx1;
    }

    public void a() {
        jx1 jx1 = this.a;
        synchronized (jx1.a) {
            try {
                if (jx1.i == 5) {
                    jx1.k(jx1.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object r(do1 do1) {
        String str;
        jx1 jx1 = this.a;
        synchronized (jx1.a) {
            bs0.r("Release completer expected to be null", jx1.k == null);
            jx1.k = do1;
            str = "Release[session=" + jx1 + "]";
        }
        return str;
    }
}
