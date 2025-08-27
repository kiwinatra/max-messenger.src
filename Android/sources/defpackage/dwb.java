package defpackage;

import android.content.ContentResolver;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import ru.ok.tamtam.nano.Protos;

/* renamed from: dwb  reason: default package */
public final /* synthetic */ class dwb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ewb b;

    public /* synthetic */ dwb(ewb ewb, int i) {
        this.a = i;
        this.b = ewb;
    }

    public final Object invoke() {
        ewb ewb = this.b;
        switch (this.a) {
            case 0:
                tf6.P();
                return new oa((xvb) ewb.p.getValue(), 1);
            case 1:
                tf6.P();
                return new oa((xvb) ewb.u.getValue(), 1);
            case 2:
                tf6.P();
                return ewb.i((xvb) ewb.r.getValue());
            case 3:
                tf6.P();
                ewb.b.getClass();
                return new hif((xvb) ewb.r.getValue(), ewb.e, 0);
            case 4:
                tf6.P();
                ewb.b.getClass();
                return new oa((xvb) ewb.p.getValue(), 2);
            case 5:
                tf6.P();
                return ewb.k(ewb.c);
            case 6:
                tf6.P();
                ewb.b.getClass();
                return new oa((xvb) ewb.t.getValue(), 2);
            case 7:
                tf6.P();
                awb awb = ewb.b;
                jo0 l = ewb.l(new z64(awb.j.f(), awb.k, 1));
                ewb.b.getClass();
                return new hif(l, ewb.e, 0);
            case 8:
                tf6.P();
                awb awb2 = ewb.b;
                jo0 l2 = ewb.l(new i38(awb2.j.f(), awb2.k, awb2.a, 0));
                ewb.b.getClass();
                return new hif(l2, ewb.e, 0);
            case 9:
                awb awb3 = ewb.b;
                z64 z64 = new z64(awb3.j.f(), awb3.k, 1);
                awb awb4 = ewb.b;
                return ewb.j(z64, new bjf[]{new p38(awb4.j.g(), awb4.k, awb4.a)});
            case 10:
                awb awb5 = ewb.b;
                return ewb.h(new e58(awb5.j.f(), awb5.a, 1));
            case 11:
                awb awb6 = ewb.b;
                i38 i38 = new i38(awb6.j.f(), awb6.k, awb6.a, 0);
                awb awb7 = ewb.b;
                awb7.getClass();
                ma5 ma5 = awb7.j;
                ExecutorService f = ma5.f();
                ContentResolver contentResolver = awb7.a;
                p7d p7d = awb7.k;
                return ewb.j(i38, new bjf[]{new j38(f, p7d, contentResolver), new p38(ma5.g(), p7d, awb7.a)});
            case 12:
                awb awb8 = ewb.b;
                return ewb.h(new e58(awb8.j.c(), awb8.a, 0));
            case 13:
                awb awb9 = ewb.b;
                i38 i382 = new i38(awb9.j.f(), awb9.k, awb9.a, 1);
                awb awb10 = ewb.b;
                return ewb.j(i382, new bjf[]{new p38(awb10.j.g(), awb10.k, awb10.a)});
            case Protos.Attaches.Attach.LOCATION /*14*/:
                awb awb11 = ewb.b;
                f38 f38 = new f38(awb11.j.f(), awb11.k, awb11.b, 1);
                awb awb12 = ewb.b;
                return ewb.j(f38, new bjf[]{new p38(awb12.j.g(), awb12.k, awb12.a)});
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                awb awb13 = ewb.b;
                f38 f382 = new f38(awb13.j.f(), awb13.k, awb13.c, 0);
                awb awb14 = ewb.b;
                return ewb.j(f382, new bjf[]{new p38(awb14.j.g(), awb14.k, awb14.a)});
            case 16:
                awb awb15 = ewb.b;
                awb15.getClass();
                return ewb.i(ewb.b.b(new oa(new z64(io1.a, awb15.k, 0), 0), true, ewb.h));
            default:
                tf6.P();
                return new oa((xvb) ewb.t.getValue(), 1);
        }
    }
}
