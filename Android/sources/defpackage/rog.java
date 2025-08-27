package defpackage;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: rog  reason: default package */
public final class rog extends b59 {
    public static final String E = h88.V("WorkContinuationImpl");
    public final ArrayList A;
    public final ArrayList B = new ArrayList();
    public boolean C;
    public ata D;
    public final dpg w;
    public final String x;
    public final fb5 y;
    public final List z;

    public rog(dpg dpg, String str, fb5 fb5, List list) {
        this.w = dpg;
        this.x = str;
        this.y = fb5;
        this.z = list;
        this.A = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String stringId = ((WorkRequest) list.get(i)).getStringId();
            this.A.add(stringId);
            this.B.add(stringId);
        }
    }

    public static HashSet h0(rog rog) {
        HashSet hashSet = new HashSet();
        rog.getClass();
        return hashSet;
    }

    public final u08 H() {
        ArrayList<String> arrayList = this.B;
        dpg dpg = this.w;
        ypg y2 = dpg.c.y();
        y2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        int size = arrayList.size();
        n79.c(sb, size);
        sb.append(")");
        d7d a = d7d.a(size, sb.toString());
        int i = 1;
        for (String str : arrayList) {
            if (str == null) {
                a.X(i);
            } else {
                a.h(i, str);
            }
            i++;
        }
        uj7 uj7 = ((i6d) y2.a).e;
        czf czf = new czf(3, y2, a);
        String[] d = uj7.d(new String[]{"WorkTag", "WorkProgress", "workspec"});
        int length = d.length;
        int i2 = 0;
        while (i2 < length) {
            String str2 = d[i2];
            if (uj7.d.containsKey(str2.toLowerCase(Locale.US))) {
                i2++;
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str2).toString());
            }
        }
        npg npg = uj7.j;
        s7d s7d = new s7d((i6d) npg.b, npg, czf, d);
        es1 es1 = xpg.v;
        wdf wdf = dpg.d;
        Object obj = new Object();
        q29 q29 = new q29();
        q29.l(s7d, new a18((g6d) wdf, obj, es1, q29));
        return q29;
    }

    public final u4b v() {
        if (!this.C) {
            ata ata = new ata(19);
            this.w.d.h(new h75(this, ata));
            this.D = ata;
        } else {
            h88 x2 = h88.x();
            x2.Z(E, "Already enqueued work ids (" + TextUtils.join(", ", this.A) + ")");
        }
        return this.D;
    }
}
