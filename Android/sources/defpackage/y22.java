package defpackage;

import android.text.SpannableString;
import android.text.style.URLSpan;
import java.util.Set;
import java.util.function.UnaryOperator;

/* renamed from: y22  reason: default package */
public final /* synthetic */ class y22 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ a32 b;

    public /* synthetic */ y22(a32 a32, int i) {
        this.a = i;
        this.b = a32;
    }

    public final Object apply(Object obj) {
        a32 a32 = this.b;
        switch (this.a) {
            case 0:
                v7b v7b = (v7b) obj;
                a89 a89 = a32.v;
                gge gge = null;
                if (a89 == null) {
                    return null;
                }
                ha9 ha9 = a89.a;
                if (v7b != null && ((Long) v7b.a).longValue() == ha9.b) {
                    return v7b;
                }
                vb2 vb2 = (vb2) a89.y;
                vb2.getClass();
                a89 a892 = a32.v;
                SpannableString e = a892 == null ? null : vb2.d(a32, a892, qb2.a, false);
                if (cvg.D(e)) {
                    int i = gge.a;
                    e = sq6.A(e, true);
                    for (Object obj2 : e.getSpans(0, e.length(), Object.class)) {
                        if ((obj2 instanceof URLSpan) || (obj2 instanceof jf8)) {
                            e.removeSpan(obj2);
                        }
                    }
                }
                Long valueOf = Long.valueOf(ha9.b);
                if (!cvg.A(e)) {
                    int i2 = gge.a;
                    gge = sq6.A(e, true);
                }
                return new v7b(valueOf, gge);
            default:
                Set set = (Set) obj;
                set.add(a32);
                return set;
        }
    }
}
