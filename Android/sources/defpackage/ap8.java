package defpackage;

import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ap8  reason: default package */
public final /* synthetic */ class ap8 implements pk3, lp8, k08, i08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np8 b;

    public /* synthetic */ ap8(np8 np8, int i) {
        this.a = i;
        this.b = np8;
    }

    public void accept(Object obj) {
        oo8 oo8 = (oo8) obj;
        switch (this.a) {
            case 0:
                k0d k0d = this.b.p;
                oo8.g();
                return;
            case LangUtils.HASH_SEED /*17*/:
                qo8 qo8 = this.b.a;
                oo8.b();
                return;
            default:
                k0d k0d2 = this.b.p;
                oo8.g();
                return;
        }
    }

    public void d(i67 i67, int i) {
        switch (this.a) {
            case 1:
                i67.C(this.b.c, i);
                return;
            case 2:
                i67.S(this.b.c, i);
                return;
            case 3:
                i67.V(this.b.c, i);
                return;
            case 4:
                i67.w0(this.b.c, i);
                return;
            case 5:
                i67.s0(this.b.c, i);
                return;
            case 7:
                i67.O(this.b.c, i);
                return;
            case 8:
                i67.G(this.b.c, i);
                return;
            case 9:
                i67.f(this.b.c, i);
                return;
            case 10:
                i67.z(this.b.c, i);
                return;
            case 11:
                i67.p(this.b.c, i);
                return;
            case 12:
                i67.y0(this.b.c, i);
                return;
            case 13:
                i67.Y(this.b.c, i);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                i67.w(this.b.c, i);
                return;
            default:
                i67.a0(this.b.c, i);
                return;
        }
    }

    public void f(Object obj, xq5 xq5) {
        np8 np8 = this.b;
        np8.getClass();
        ((sob) obj).Y(np8.a, new qob(xq5));
    }

    public void invoke(Object obj) {
        sob sob = (sob) obj;
        switch (this.a) {
            case 16:
                sob.p0(this.b.t);
                return;
            default:
                sob.p0(this.b.t);
                return;
        }
    }

    public /* synthetic */ ap8(np8 np8, zvd zvd) {
        this.a = 17;
        this.b = np8;
    }
}
