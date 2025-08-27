package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: otc  reason: default package */
public final class otc {
    public int a;
    public final jtc b;
    public final List c;
    public final int d;
    public final ce e;
    public final y2d f;
    public final int g;
    public final int h;
    public final int i;

    public otc(jtc jtc, List list, int i2, ce ceVar, y2d y2d, int i3, int i4, int i5) {
        this.b = jtc;
        this.c = list;
        this.d = i2;
        this.e = ceVar;
        this.f = y2d;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public static otc a(otc otc, int i2, ce ceVar, y2d y2d, int i3) {
        if ((i3 & 1) != 0) {
            i2 = otc.d;
        }
        int i4 = i2;
        if ((i3 & 2) != 0) {
            ceVar = otc.e;
        }
        ce ceVar2 = ceVar;
        if ((i3 & 4) != 0) {
            y2d = otc.f;
        }
        int i5 = otc.g;
        int i6 = otc.h;
        int i7 = otc.i;
        return new otc(otc.b, otc.c, i4, ceVar2, y2d, i5, i6, i7);
    }

    public final k4d b(y2d y2d) {
        List list = this.c;
        int size = list.size();
        int i2 = this.d;
        if (i2 < size) {
            this.a++;
            ce ceVar = this.e;
            if (ceVar != null) {
                m57 m57 = y2d.b;
                m57 m572 = ((t95) ceVar.v).h.a;
                if (m57.f != m572.f || !Intrinsics.areEqual((Object) m57.e, (Object) m572.e)) {
                    throw new IllegalStateException(("network interceptor " + ((vi7) list.get(i2 - 1)) + " must retain the same host and port").toString());
                } else if (this.a != 1) {
                    throw new IllegalStateException(("network interceptor " + ((vi7) list.get(i2 - 1)) + " must call proceed() exactly once").toString());
                }
            }
            int i3 = i2 + 1;
            otc a2 = a(this, i3, (ce) null, y2d, 58);
            vi7 vi7 = (vi7) list.get(i2);
            k4d a3 = vi7.a(a2);
            if (a3 == null) {
                throw new NullPointerException("interceptor " + vi7 + " returned null");
            } else if (ceVar != null && i3 < list.size() && a2.a != 1) {
                throw new IllegalStateException(("network interceptor " + vi7 + " must call proceed() exactly once").toString());
            } else if (a3.x != null) {
                return a3;
            } else {
                throw new IllegalStateException(("interceptor " + vi7 + " returned a response with no body").toString());
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
