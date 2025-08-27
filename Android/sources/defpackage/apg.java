package defpackage;

import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: apg  reason: default package */
public abstract class apg {
    public final void a(WorkRequest workRequest) {
        List singletonList = Collections.singletonList(workRequest);
        dpg dpg = (dpg) this;
        if (!singletonList.isEmpty()) {
            new rog(dpg, (String) null, fb5.b, singletonList).v();
            return;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public abstract u4b b(String str, int i, icb icb);
}
