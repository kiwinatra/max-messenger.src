package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: rq3  reason: default package */
public final class rq3 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7d b;
    public final /* synthetic */ sq3 c;

    public /* synthetic */ rq3(sq3 sq3, d7d d7d, int i) {
        this.a = i;
        this.c = sq3;
        this.b = d7d;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [tq3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v7, types: [tq3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v3, types: [tq3, java.lang.Object] */
    public final Object call() {
        switch (this.a) {
            case 0:
                Object obj = null;
                Cursor o = this.c.a.o(this.b, (CancellationSignal) null);
                try {
                    int u = kne.u(o, "latitude");
                    int u2 = kne.u(o, "longitude");
                    int u3 = kne.u(o, "altitude");
                    int u4 = kne.u(o, "accuracy");
                    int u5 = kne.u(o, "bearing");
                    int u6 = kne.u(o, "speed");
                    int u7 = kne.u(o, "device_id");
                    int u8 = kne.u(o, "contact_server_id");
                    int u9 = kne.u(o, "time");
                    if (o.moveToFirst()) {
                        ap0 ap0 = new ap0(3);
                        ap0.b = o.getLong(u8);
                        ap0.c = o.getLong(u9);
                        ? obj2 = new Object();
                        obj2.b = o.getDouble(u);
                        obj2.c = o.getDouble(u2);
                        obj2.d = o.getDouble(u3);
                        obj2.e = o.getFloat(u4);
                        obj2.f = o.getFloat(u5);
                        obj2.g = o.getFloat(u6);
                        if (o.isNull(u7)) {
                            obj2.h = null;
                        } else {
                            obj2.h = o.getString(u7);
                        }
                        obj2.a = ap0;
                        obj = obj2;
                    }
                    o.close();
                    return obj;
                } catch (Throwable th) {
                    o.close();
                    throw th;
                }
            case 1:
                Object obj3 = null;
                Cursor o2 = this.c.a.o(this.b, (CancellationSignal) null);
                try {
                    int u10 = kne.u(o2, "latitude");
                    int u11 = kne.u(o2, "longitude");
                    int u12 = kne.u(o2, "altitude");
                    int u13 = kne.u(o2, "accuracy");
                    int u14 = kne.u(o2, "bearing");
                    int u15 = kne.u(o2, "speed");
                    int u16 = kne.u(o2, "device_id");
                    int u17 = kne.u(o2, "contact_server_id");
                    int u18 = kne.u(o2, "time");
                    if (o2.moveToFirst()) {
                        ap0 ap02 = new ap0(3);
                        ap02.b = o2.getLong(u17);
                        ap02.c = o2.getLong(u18);
                        ? obj4 = new Object();
                        obj4.b = o2.getDouble(u10);
                        obj4.c = o2.getDouble(u11);
                        obj4.d = o2.getDouble(u12);
                        obj4.e = o2.getFloat(u13);
                        obj4.f = o2.getFloat(u14);
                        obj4.g = o2.getFloat(u15);
                        if (o2.isNull(u16)) {
                            obj4.h = null;
                        } else {
                            obj4.h = o2.getString(u16);
                        }
                        obj4.a = ap02;
                        obj3 = obj4;
                    }
                    o2.close();
                    return obj3;
                } catch (Throwable th2) {
                    o2.close();
                    throw th2;
                }
            default:
                Cursor o3 = this.c.a.o(this.b, (CancellationSignal) null);
                try {
                    int u19 = kne.u(o3, "latitude");
                    int u20 = kne.u(o3, "longitude");
                    int u21 = kne.u(o3, "altitude");
                    int u22 = kne.u(o3, "accuracy");
                    int u23 = kne.u(o3, "bearing");
                    int u24 = kne.u(o3, "speed");
                    int u25 = kne.u(o3, "device_id");
                    int u26 = kne.u(o3, "contact_server_id");
                    int u27 = kne.u(o3, "time");
                    ArrayList arrayList = new ArrayList(o3.getCount());
                    while (o3.moveToNext()) {
                        ap0 ap03 = new ap0(3);
                        ap03.b = o3.getLong(u26);
                        ap03.c = o3.getLong(u27);
                        ? obj5 = new Object();
                        obj5.b = o3.getDouble(u19);
                        obj5.c = o3.getDouble(u20);
                        obj5.d = o3.getDouble(u21);
                        obj5.e = o3.getFloat(u22);
                        obj5.f = o3.getFloat(u23);
                        obj5.g = o3.getFloat(u24);
                        if (o3.isNull(u25)) {
                            obj5.h = null;
                        } else {
                            obj5.h = o3.getString(u25);
                        }
                        obj5.a = ap03;
                        arrayList.add(obj5);
                    }
                    o3.close();
                    return arrayList;
                } catch (Throwable th3) {
                    o3.close();
                    throw th3;
                }
        }
    }

    public final void finalize() {
        switch (this.a) {
            case 0:
                this.b.o();
                return;
            case 1:
                this.b.o();
                return;
            default:
                this.b.o();
                return;
        }
    }
}
