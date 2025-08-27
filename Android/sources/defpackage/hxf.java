package defpackage;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.my.tracker.obfuscated.b2;
import com.my.tracker.obfuscated.m0;
import com.my.tracker.obfuscated.p2;
import java.io.File;
import java.util.List;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: hxf  reason: default package */
public final /* synthetic */ class hxf implements nsb, qk3, zi6, yf5, zf5, PurchasesUpdatedListener, b2 {
    public final /* synthetic */ int a;

    public /* synthetic */ hxf(int i) {
        this.a = i;
    }

    public Object a() {
        return p2.d();
    }

    public void accept(Object obj) {
        d20 d20 = d20.o;
        switch (this.a) {
            case 1:
                ((j10) obj).i = d20;
                return;
            case 9:
                z68.f("t4g", "clear: failed", (Throwable) obj);
                return;
            case 10:
                z68.c("t4g", "convertObs: progress %f", (Float) obj);
                return;
            case 11:
                z68.c("t4g", "convertVideo: loaded from storage = %s", (j4g) obj);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                j10 j10 = (j10) obj;
                if (j10.c().f || !cvg.A(j10.c().g)) {
                    d20 = d20.a;
                }
                j10.i = d20;
                return;
            default:
                Throwable th = (Throwable) obj;
                int i = VideoPlayerSeekBarPreview.C0;
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                return ((a32) obj).b.f0.b();
            case 4:
                return new File((String) obj);
            case 5:
                dzf dzf = (dzf) obj;
                dzf.getClass();
                return new qa3(2, new fc2(15, dzf));
            case 6:
                return kv0.S((lxf) obj);
            case 7:
                List list = (List) obj;
                return list.isEmpty() ? uh8.a : nh8.e(list);
            case 8:
                return ((OneMeRoomDatabase) obj).V();
            case 12:
                o4g o4g = (o4g) obj;
                o4g.getClass();
                return new qa3(2, new fc2(16, o4g));
            case 13:
                m4g m4g = (m4g) obj;
                k4g k4g = null;
                if (m4g == null) {
                    return null;
                }
                lf6 lf6 = new lf6(9);
                l4g l4g = m4g.a;
                if (l4g != null) {
                    i20 i20 = new i20(1);
                    i20.a = l4g.b;
                    i20.b = l4g.c;
                    i20.c = l4g.d;
                    i20.d = l4g.e;
                    p4g p4g = new p4g(i20);
                    p7d p7d = new p7d(25);
                    p7d.b = l4g.a;
                    p7d.c = p4g;
                    k4g = new k4g(p7d);
                }
                lf6.c = k4g;
                lf6.o = m4g.c;
                lf6.v = m4g.d;
                lf6.b = m4g.b;
                return new j4g(lf6);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return ((OneMeRoomDatabase) obj).W();
            default:
                return ((pl0) obj).a();
        }
    }

    public sf5[] c() {
        return new sf5[]{new dfg()};
    }

    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        m0.a(billingResult, list);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((bxf) obj).a();
            default:
                return ((a32) obj).b.f0 != null;
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    public tf5[] m1542c() {
        return new tf5[]{new efg()};
    }
}
