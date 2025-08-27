package defpackage;

import kotlin.collections.ArrayDeque;
import kotlin.uuid.Uuid;

/* renamed from: yo7  reason: default package */
public final class yo7 {
    public static final yo7 d = new yo7();
    public final ap7 a;
    public final pk4 b;
    public final li3 c = new li3(1);

    public yo7() {
        ap7 ap7 = new ap7();
        pk4 pk4 = gtd.a;
        this.a = ap7;
        this.b = pk4;
    }

    public final Object a(aq7 aq7, String str) {
        mqf mqf = !this.a.o ? new mqf(str) : new mqf(str);
        Object t = new u9(this, xqg.OBJ, mqf, aq7.d()).t(aq7);
        if (mqf.q() == 10) {
            return t;
        }
        mqf.A(mqf, "Expected EOF after parsing, but had " + ((String) mqf.c).charAt(mqf.b - 1) + " instead", 0, (String) null, 6);
        throw null;
    }

    public final String b(aq7 aq7, Object obj) {
        char[] cArr;
        ni0 ni0 = new ni0(9, false);
        m22 m22 = m22.c;
        synchronized (m22) {
            cArr = (char[]) ((ArrayDeque) m22.b).removeLastOrNull();
            if (cArr != null) {
                m22.a -= cArr.length;
            } else {
                cArr = null;
            }
        }
        if (cArr == null) {
            cArr = new char[Uuid.SIZE_BITS];
        }
        ni0.c = cArr;
        try {
            new cy3(this.a.e ? new jc3(ni0, this) : new qr0(ni0), this, xqg.OBJ, new cy3[xqg.y.size()]).i(aq7, obj);
            return ni0.toString();
        } finally {
            ni0.M();
        }
    }
}
