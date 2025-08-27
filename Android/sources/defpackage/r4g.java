package defpackage;

import java.util.Locale;

/* renamed from: r4g  reason: default package */
public final /* synthetic */ class r4g implements qk3, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4g b;

    public /* synthetic */ r4g(j4g j4g, int i) {
        this.a = i;
        this.b = j4g;
    }

    public void accept(Object obj) {
        j4g j4g = this.b;
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                Locale locale = Locale.ENGLISH;
                z68.f("t4g", "putConversionInRepository: failed, videoConversion=" + j4g, th);
                return;
            default:
                wc8.s(j4g.d);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [m4g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, l4g] */
    public Object apply(Object obj) {
        o4g o4g = (o4g) obj;
        j4g j4g = this.b;
        l4g l4g = null;
        if (j4g != null) {
            ? obj2 = new Object();
            k4g k4g = j4g.a;
            if (k4g != null) {
                ? obj3 = new Object();
                obj3.a = k4g.a;
                p4g p4g = k4g.b;
                obj3.b = p4g.a;
                obj3.c = p4g.b;
                obj3.d = p4g.c;
                obj3.e = p4g.d;
                l4g = obj3;
            }
            obj2.a = l4g;
            obj2.c = j4g.c;
            obj2.d = j4g.d;
            obj2.b = j4g.b;
            l4g = obj2;
        }
        o4g.getClass();
        return new qa3(2, new czf(1, o4g, l4g));
    }
}
