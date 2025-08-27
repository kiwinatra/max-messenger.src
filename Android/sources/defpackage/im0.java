package defpackage;

import android.os.Build;

/* renamed from: im0  reason: default package */
public final class im0 extends cj3 {
    public final /* synthetic */ int f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ im0(qj3 qj3, int i) {
        super(qj3);
        this.f = i;
    }

    public final boolean a(xpg xpg) {
        switch (this.f) {
            case 0:
                return xpg.j.b;
            case 1:
                return xpg.j.d;
            case 2:
                return xpg.j.a == 2;
            case 3:
                int i = xpg.j.a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return xpg.j.e;
        }
    }

    public final boolean b(Object obj) {
        switch (this.f) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                x6a x6a = (x6a) obj;
                return !x6a.a || !x6a.b;
            case 3:
                x6a x6a2 = (x6a) obj;
                return !x6a2.a || x6a2.c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
