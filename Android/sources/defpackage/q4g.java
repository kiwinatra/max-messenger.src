package defpackage;

import java.util.Locale;

/* renamed from: q4g  reason: default package */
public final /* synthetic */ class q4g implements qk3, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4g b;

    public /* synthetic */ q4g(k4g k4g, int i) {
        this.a = i;
        this.b = k4g;
    }

    public void accept(Object obj) {
        Locale locale = Locale.ENGLISH;
        z68.f("t4g", "removeFromRepository: failed conversionData = " + this.b, (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                o4g o4g = (o4g) obj;
                k4g k4g = this.b;
                String str = k4g.a;
                p4g p4g = k4g.b;
                qac qac = p4g.a;
                o4g.getClass();
                d7d a2 = d7d.a(5, "SELECT * FROM video_conversions WHERE source_uri=? AND quality=? AND start_trim_position=? AND end_trim_position=? AND mute=?");
                if (str == null) {
                    a2.X(1);
                } else {
                    a2.h(1, str);
                }
                a2.k(2, (long) qac.b);
                a2.T((double) p4g.b, 3);
                a2.T((double) p4g.c, 4);
                a2.k(5, p4g.d ? 1 : 0);
                return new bi8(new czf(2, o4g, a2));
            default:
                o4g o4g2 = (o4g) obj;
                k4g k4g2 = this.b;
                String str2 = k4g2.a;
                p4g p4g2 = k4g2.b;
                qac qac2 = p4g2.a;
                o4g2.getClass();
                return new qa3(2, new n4g(o4g2, str2, qac2, p4g2.b, p4g2.c, p4g2.d));
        }
    }
}
