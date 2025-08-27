package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: ew1  reason: default package */
public final class ew1 extends gw1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ dpg o;
    public final /* synthetic */ Object v;

    public ew1(dpg dpg, UUID uuid) {
        this.o = dpg;
        this.v = uuid;
    }

    /* JADX INFO: finally extract failed */
    public final void c() {
        switch (this.c) {
            case 0:
                dpg dpg = this.o;
                WorkDatabase workDatabase = dpg.c;
                workDatabase.c();
                try {
                    gw1.b(dpg, ((UUID) this.v).toString());
                    workDatabase.r();
                    workDatabase.l();
                    yfd.a(dpg.b, dpg.c, dpg.e);
                    return;
                } catch (Throwable th) {
                    workDatabase.l();
                    throw th;
                }
            default:
                dpg dpg2 = this.o;
                WorkDatabase workDatabase2 = dpg2.c;
                workDatabase2.c();
                try {
                    Iterator it = workDatabase2.y().l((String) this.v).iterator();
                    while (it.hasNext()) {
                        gw1.b(dpg2, (String) it.next());
                    }
                    workDatabase2.r();
                    workDatabase2.l();
                    yfd.a(dpg2.b, dpg2.c, dpg2.e);
                    return;
                } catch (Throwable th2) {
                    workDatabase2.l();
                    throw th2;
                }
        }
    }

    public ew1(dpg dpg) {
        this.o = dpg;
        this.v = "LIVE_LOCATION_WORKER";
    }
}
