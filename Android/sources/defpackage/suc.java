package defpackage;

import java.util.Locale;
import ru.ok.tamtam.nano.b;

/* renamed from: suc  reason: default package */
public abstract class suc {
    public static final /* synthetic */ int a = 0;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, luc] */
    /* JADX WARNING: type inference failed for: r5v2, types: [e35, java.lang.Object] */
    public static luc a(ouc ouc, long j) {
        ? obj = new Object();
        cvc cvc = ouc.a;
        obj.b = cvc;
        obj.d = ouc.b;
        obj.c = j;
        int ordinal = cvc.ordinal();
        if (ordinal == 1) {
            ? obj2 = new Object();
            obj2.a = ((d35) ouc).c;
            obj.f = obj2;
        } else if (ordinal == 2) {
            yl4 yl4 = new yl4(18, false);
            yl4.b = ((vpe) ouc).c;
            obj.e = yl4;
        } else if (ordinal == 3) {
            x10 x10 = ((rr6) ouc).c;
            byte[] byteArray = ad9.toByteArray(b.n(x10));
            jz2 jz2 = new jz2(6);
            jz2.c = byteArray;
            jz2.b = x10.y;
            obj.g = jz2;
        } else if (ordinal != 4) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException("Unexpected value: " + ouc.a);
        }
        return obj;
    }
}
