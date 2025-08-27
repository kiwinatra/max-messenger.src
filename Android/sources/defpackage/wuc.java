package defpackage;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: wuc  reason: default package */
public final class wuc {
    public final j6d a;
    public final x23 b;

    public wuc(j6d j6d, x23 x23) {
        this.a = j6d;
        this.b = x23;
    }

    public static bi8 d(kuc kuc, ouc ouc) {
        long j = ouc.b;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        cvc cvc = ouc.a;
        if (i > 0) {
            kuc.getClass();
            d7d a2 = d7d.a(2, "SELECT * FROM recent WHERE recent_type=? AND server_id=?");
            a2.k(1, (long) cvc.a);
            a2.k(2, j);
            return new bi8(new iuc(kuc, a2, 3));
        }
        int ordinal = cvc.ordinal();
        int i2 = cvc.a;
        if (ordinal == 1) {
            kuc.getClass();
            d7d a3 = d7d.a(2, "SELECT * FROM recent WHERE recent_type=? AND emoji=?");
            a3.k(1, (long) i2);
            String str = ((d35) ouc).c;
            if (str == null) {
                a3.X(2);
            } else {
                a3.h(2, str);
            }
            return new bi8(new iuc(kuc, a3, 1));
        } else if (ordinal == 2) {
            kuc.getClass();
            d7d a4 = d7d.a(2, "SELECT * FROM recent WHERE recent_type=? AND sticker_id=?");
            a4.k(1, (long) i2);
            a4.k(2, ((vpe) ouc).c);
            return new bi8(new iuc(kuc, a4, 0));
        } else if (ordinal == 3) {
            long j2 = ((rr6) ouc).c.y;
            kuc.getClass();
            d7d a5 = d7d.a(2, "SELECT * FROM recent WHERE recent_type=? AND gif_id=?");
            a5.k(1, (long) i2);
            a5.k(2, j2);
            return new bi8(new iuc(kuc, a5, 2));
        } else {
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException("Unexpected value: " + cvc);
        }
    }

    public final jha a(List list) {
        return new oa3(4, b(), new x52(25, list)).m(new x52(26, list), IntCompanionObject.MAX_VALUE);
    }

    public final wbe b() {
        return this.a.n().i(new qbb(14));
    }

    public final na3 c(List list) {
        return new na3(4, this.a.n(), new vuc(this, list, 1));
    }
}
