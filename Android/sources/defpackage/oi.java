package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: oi  reason: default package */
public final class oi implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7d b;
    public final /* synthetic */ pi c;

    public /* synthetic */ oi(pi piVar, d7d d7d, int i) {
        this.a = i;
        this.c = piVar;
        this.b = d7d;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                i6d i6d = this.c.a;
                d7d d7d = this.b;
                Cursor o = i6d.o(d7d, (CancellationSignal) null);
                try {
                    int u = kne.u(o, "id");
                    int u2 = kne.u(o, "update_time");
                    int u3 = kne.u(o, "emoji");
                    int u4 = kne.u(o, "lottie_url");
                    int u5 = kne.u(o, "lottie_play_url");
                    int u6 = kne.u(o, "set_id");
                    int u7 = kne.u(o, "icon_url");
                    ArrayList arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        arrayList.add(new dj(o.getLong(u), o.getLong(u2), o.isNull(u3) ? null : o.getString(u3), o.isNull(u4) ? null : o.getString(u4), o.isNull(u5) ? null : o.getString(u5), o.isNull(u6) ? null : Long.valueOf(o.getLong(u6)), o.isNull(u7) ? null : o.getString(u7)));
                    }
                    return arrayList;
                } finally {
                    o.close();
                    d7d.o();
                }
            case 1:
                i6d i6d2 = this.c.a;
                d7d d7d2 = this.b;
                Cursor o2 = i6d2.o(d7d2, (CancellationSignal) null);
                try {
                    int u8 = kne.u(o2, "id");
                    int u9 = kne.u(o2, "update_time");
                    int u10 = kne.u(o2, "emoji");
                    int u11 = kne.u(o2, "lottie_url");
                    int u12 = kne.u(o2, "lottie_play_url");
                    int u13 = kne.u(o2, "set_id");
                    int u14 = kne.u(o2, "icon_url");
                    ArrayList arrayList2 = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        arrayList2.add(new dj(o2.getLong(u8), o2.getLong(u9), o2.isNull(u10) ? null : o2.getString(u10), o2.isNull(u11) ? null : o2.getString(u11), o2.isNull(u12) ? null : o2.getString(u12), o2.isNull(u13) ? null : Long.valueOf(o2.getLong(u13)), o2.isNull(u14) ? null : o2.getString(u14)));
                    }
                    return arrayList2;
                } finally {
                    o2.close();
                    d7d2.o();
                }
            default:
                i6d i6d3 = this.c.a;
                d7d d7d3 = this.b;
                Integer num = null;
                Cursor o3 = i6d3.o(d7d3, (CancellationSignal) null);
                try {
                    if (o3.moveToFirst()) {
                        if (!o3.isNull(0)) {
                            num = Integer.valueOf(o3.getInt(0));
                        }
                    }
                    return num;
                } finally {
                    o3.close();
                    d7d3.o();
                }
        }
    }
}
