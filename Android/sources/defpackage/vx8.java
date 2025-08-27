package defpackage;

import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: vx8  reason: default package */
public final /* synthetic */ class vx8 implements xx8, gz8, pk3, fz8, yi6 {
    public final /* synthetic */ int a;

    public /* synthetic */ vx8(int i) {
        this.a = i;
    }

    public void a(bx8 bx8, int i) {
        switch (this.a) {
            case 0:
                bx8.getClass();
                return;
            case 1:
                bx8.getClass();
                return;
            default:
                bx8.b(i);
                return;
        }
    }

    public void accept(Object obj) {
        ypb ypb = (ypb) obj;
        switch (this.a) {
            case 5:
                ypb.pause();
                return;
            case 6:
                ypb.U();
                return;
            case 7:
                ypb.p0();
                return;
            case 8:
                ypb.x0();
                return;
            case 10:
                ypb.M();
                return;
            case 11:
                ypb.z();
                return;
            case 13:
                ypb.w0();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ypb.v0();
                return;
            case LangUtils.HASH_SEED /*17*/:
                ypb.E();
                return;
            case 20:
                ypb.stop();
                return;
            case 22:
                ypb.prepare();
                return;
            case 23:
                ypb.A();
                return;
            default:
                ypb.r();
                return;
        }
    }

    public Object apply(Object obj) {
        return Long.valueOf(((q44) obj).b);
    }

    public void b(ypb ypb, cx8 cx8, List list) {
        switch (this.a) {
            case 16:
                ypb.k0(list);
                return;
            default:
                ypb.k0(list);
                return;
        }
    }

    public void c(ypb ypb, dx8 dx8) {
        kne.M(ypb, dx8);
    }

    public Object g(yx8 yx8, cx8 cx8, int i) {
        switch (this.a) {
            case 3:
                rae.w(yx8);
                throw null;
            case 4:
                rae.w(yx8);
                throw null;
            case 9:
                return yx8.m(cx8);
            case 12:
                rae.w(yx8);
                throw null;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                yx8.s(cx8);
                yx8.e.getClass();
                return o5a.F(new swd(-6));
            case 19:
                rae.w(yx8);
                throw null;
            case 21:
                rae.w(yx8);
                throw null;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                rae.w(yx8);
                throw null;
            case 26:
                rae.w(yx8);
                throw null;
            default:
                yx8.s(cx8);
                yx8.e.getClass();
                return o5a.F(new swd(-6));
        }
    }

    public /* synthetic */ vx8(int i, Object obj, Object obj2) {
        this.a = i;
    }
}
