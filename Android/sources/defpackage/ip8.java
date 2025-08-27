package defpackage;

import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ip8  reason: default package */
public final /* synthetic */ class ip8 implements i08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ppb b;

    public /* synthetic */ ip8(ppb ppb, int i) {
        this.a = i;
        this.b = ppb;
    }

    public final void invoke(Object obj) {
        sob sob = (sob) obj;
        switch (this.a) {
            case 0:
                sob.c(this.b.x);
                return;
            case 1:
                sob.n(this.b.v);
                return;
            case 2:
                sob.o0(this.b.g);
                return;
            case 3:
                sob.onRepeatModeChanged(this.b.h);
                return;
            case 4:
                sob.O(this.b.i);
                return;
            case 5:
                sob.c0(this.b.m);
                return;
            case 6:
                sob.f(this.b.n);
                return;
            case 7:
                sob.w(this.b.o);
                return;
            case 8:
                sob.k(this.b.p.a);
                return;
            case 9:
                sob.S(this.b.p);
                return;
            case 10:
                sob.s0(this.b.q);
                return;
            case 11:
                ppb ppb = this.b;
                sob.i(ppb.r, ppb.s);
                return;
            case 12:
                sob.x(this.b.l);
                return;
            case 13:
                sob.a0(this.b.A);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                sob.d0(this.b.B);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                sob.t0(this.b.C);
                return;
            case 16:
                sob.z(this.b.E);
                return;
            case LangUtils.HASH_SEED /*17*/:
                sob.X(this.b.D);
                return;
            case 18:
                sob.b0(this.b.z);
                return;
            case 19:
                sob.d(this.b.w);
                return;
            default:
                sob.h(this.b.y);
                return;
        }
    }
}
