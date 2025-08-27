package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* renamed from: fw1  reason: default package */
public final class fw1 extends gw1 {
    public final /* synthetic */ dpg c;
    public final /* synthetic */ String o;
    public final /* synthetic */ boolean v;

    public fw1(dpg dpg, String str, boolean z) {
        this.c = dpg;
        this.o = str;
        this.v = z;
    }

    public final void c() {
        dpg dpg = this.c;
        WorkDatabase workDatabase = dpg.c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.y().k(this.o).iterator();
            while (it.hasNext()) {
                gw1.b(dpg, (String) it.next());
            }
            workDatabase.r();
            workDatabase.l();
            if (this.v) {
                yfd.a(dpg.b, dpg.c, dpg.e);
            }
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }
}
