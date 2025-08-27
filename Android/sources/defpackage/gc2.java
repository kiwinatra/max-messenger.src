package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: gc2  reason: default package */
public final class gc2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7d b;
    public final /* synthetic */ jc2 c;

    public /* synthetic */ gc2(jc2 jc2, d7d d7d, int i) {
        this.a = i;
        this.c = jc2;
        this.b = d7d;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Object, lc2] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.Object, kc2] */
    /* JADX WARNING: type inference failed for: r10v3, types: [java.lang.Object, lc2] */
    /* JADX WARNING: type inference failed for: r11v3, types: [java.lang.Object, kc2] */
    /* JADX WARNING: type inference failed for: r9v4, types: [java.lang.Object, lc2] */
    /* JADX WARNING: type inference failed for: r6v11, types: [java.lang.Object, kc2] */
    /* JADX WARNING: type inference failed for: r10v7, types: [java.lang.Object, lc2] */
    /* JADX WARNING: type inference failed for: r11v7, types: [java.lang.Object, kc2] */
    /* JADX WARNING: type inference failed for: r10v10, types: [java.lang.Object, lc2] */
    /* JADX WARNING: type inference failed for: r11v11, types: [java.lang.Object, kc2] */
    /* JADX WARNING: type inference failed for: r10v13, types: [java.lang.Object, lc2] */
    /* JADX WARNING: type inference failed for: r11v15, types: [java.lang.Object, kc2] */
    /* JADX WARNING: type inference failed for: r10v16, types: [java.lang.Object, lc2] */
    /* JADX WARNING: type inference failed for: r11v19, types: [java.lang.Object, kc2] */
    /* JADX WARNING: type inference failed for: r10v19, types: [java.lang.Object, lc2] */
    /* JADX WARNING: type inference failed for: r11v23, types: [java.lang.Object, kc2] */
    public final Object call() {
        switch (this.a) {
            case 0:
                Object obj = null;
                Cursor o = this.c.a.o(this.b, (CancellationSignal) null);
                try {
                    int u = kne.u(o, "message_time");
                    int u2 = kne.u(o, "live_period");
                    int u3 = kne.u(o, "start_time");
                    int u4 = kne.u(o, "end_time");
                    int u5 = kne.u(o, "device_id");
                    int u6 = kne.u(o, "contact_server_id");
                    int u7 = kne.u(o, "chat_id");
                    int u8 = kne.u(o, "message_id");
                    if (o.moveToFirst()) {
                        ? obj2 = new Object();
                        obj2.a = o.getLong(u6);
                        obj2.b = o.getLong(u7);
                        obj2.c = o.getLong(u8);
                        ? obj3 = new Object();
                        obj3.b = o.getLong(u);
                        obj3.c = o.getLong(u2);
                        obj3.d = o.getLong(u3);
                        obj3.e = o.getLong(u4);
                        if (o.isNull(u5)) {
                            obj3.f = null;
                        } else {
                            obj3.f = o.getString(u5);
                        }
                        obj3.a = obj2;
                        obj = obj3;
                    }
                    o.close();
                    return obj;
                } catch (Throwable th) {
                    o.close();
                    throw th;
                }
            case 1:
                Cursor o2 = this.c.a.o(this.b, (CancellationSignal) null);
                try {
                    int u9 = kne.u(o2, "message_time");
                    int u10 = kne.u(o2, "live_period");
                    int u11 = kne.u(o2, "start_time");
                    int u12 = kne.u(o2, "end_time");
                    int u13 = kne.u(o2, "device_id");
                    int u14 = kne.u(o2, "contact_server_id");
                    int u15 = kne.u(o2, "chat_id");
                    int u16 = kne.u(o2, "message_id");
                    ArrayList arrayList = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        ? obj4 = new Object();
                        obj4.a = o2.getLong(u14);
                        obj4.b = o2.getLong(u15);
                        obj4.c = o2.getLong(u16);
                        ? obj5 = new Object();
                        obj5.b = o2.getLong(u9);
                        obj5.c = o2.getLong(u10);
                        obj5.d = o2.getLong(u11);
                        obj5.e = o2.getLong(u12);
                        if (o2.isNull(u13)) {
                            obj5.f = null;
                        } else {
                            obj5.f = o2.getString(u13);
                        }
                        obj5.a = obj4;
                        arrayList.add(obj5);
                    }
                    o2.close();
                    return arrayList;
                } catch (Throwable th2) {
                    o2.close();
                    throw th2;
                }
            case 2:
                Object obj6 = null;
                Cursor o3 = this.c.a.o(this.b, (CancellationSignal) null);
                try {
                    int u17 = kne.u(o3, "message_time");
                    int u18 = kne.u(o3, "live_period");
                    int u19 = kne.u(o3, "start_time");
                    int u20 = kne.u(o3, "end_time");
                    int u21 = kne.u(o3, "device_id");
                    int u22 = kne.u(o3, "contact_server_id");
                    int u23 = kne.u(o3, "chat_id");
                    int u24 = kne.u(o3, "message_id");
                    if (o3.moveToFirst()) {
                        ? obj7 = new Object();
                        obj7.a = o3.getLong(u22);
                        obj7.b = o3.getLong(u23);
                        obj7.c = o3.getLong(u24);
                        ? obj8 = new Object();
                        obj8.b = o3.getLong(u17);
                        obj8.c = o3.getLong(u18);
                        obj8.d = o3.getLong(u19);
                        obj8.e = o3.getLong(u20);
                        if (o3.isNull(u21)) {
                            obj8.f = null;
                        } else {
                            obj8.f = o3.getString(u21);
                        }
                        obj8.a = obj7;
                        obj6 = obj8;
                    }
                    o3.close();
                    return obj6;
                } catch (Throwable th3) {
                    o3.close();
                    throw th3;
                }
            case 3:
                Cursor o4 = this.c.a.o(this.b, (CancellationSignal) null);
                try {
                    int u25 = kne.u(o4, "message_time");
                    int u26 = kne.u(o4, "live_period");
                    int u27 = kne.u(o4, "start_time");
                    int u28 = kne.u(o4, "end_time");
                    int u29 = kne.u(o4, "device_id");
                    int u30 = kne.u(o4, "contact_server_id");
                    int u31 = kne.u(o4, "chat_id");
                    int u32 = kne.u(o4, "message_id");
                    ArrayList arrayList2 = new ArrayList(o4.getCount());
                    while (o4.moveToNext()) {
                        ? obj9 = new Object();
                        obj9.a = o4.getLong(u30);
                        obj9.b = o4.getLong(u31);
                        obj9.c = o4.getLong(u32);
                        ? obj10 = new Object();
                        obj10.b = o4.getLong(u25);
                        obj10.c = o4.getLong(u26);
                        obj10.d = o4.getLong(u27);
                        obj10.e = o4.getLong(u28);
                        if (o4.isNull(u29)) {
                            obj10.f = null;
                        } else {
                            obj10.f = o4.getString(u29);
                        }
                        obj10.a = obj9;
                        arrayList2.add(obj10);
                    }
                    o4.close();
                    return arrayList2;
                } catch (Throwable th4) {
                    o4.close();
                    throw th4;
                }
            case 4:
                Cursor o5 = this.c.a.o(this.b, (CancellationSignal) null);
                try {
                    int u33 = kne.u(o5, "message_time");
                    int u34 = kne.u(o5, "live_period");
                    int u35 = kne.u(o5, "start_time");
                    int u36 = kne.u(o5, "end_time");
                    int u37 = kne.u(o5, "device_id");
                    int u38 = kne.u(o5, "contact_server_id");
                    int u39 = kne.u(o5, "chat_id");
                    int u40 = kne.u(o5, "message_id");
                    ArrayList arrayList3 = new ArrayList(o5.getCount());
                    while (o5.moveToNext()) {
                        ? obj11 = new Object();
                        obj11.a = o5.getLong(u38);
                        obj11.b = o5.getLong(u39);
                        obj11.c = o5.getLong(u40);
                        ? obj12 = new Object();
                        obj12.b = o5.getLong(u33);
                        obj12.c = o5.getLong(u34);
                        obj12.d = o5.getLong(u35);
                        obj12.e = o5.getLong(u36);
                        if (o5.isNull(u37)) {
                            obj12.f = null;
                        } else {
                            obj12.f = o5.getString(u37);
                        }
                        obj12.a = obj11;
                        arrayList3.add(obj12);
                    }
                    o5.close();
                    return arrayList3;
                } catch (Throwable th5) {
                    o5.close();
                    throw th5;
                }
            case 5:
                Cursor o6 = this.c.a.o(this.b, (CancellationSignal) null);
                try {
                    int u41 = kne.u(o6, "message_time");
                    int u42 = kne.u(o6, "live_period");
                    int u43 = kne.u(o6, "start_time");
                    int u44 = kne.u(o6, "end_time");
                    int u45 = kne.u(o6, "device_id");
                    int u46 = kne.u(o6, "contact_server_id");
                    int u47 = kne.u(o6, "chat_id");
                    int u48 = kne.u(o6, "message_id");
                    ArrayList arrayList4 = new ArrayList(o6.getCount());
                    while (o6.moveToNext()) {
                        ? obj13 = new Object();
                        obj13.a = o6.getLong(u46);
                        obj13.b = o6.getLong(u47);
                        obj13.c = o6.getLong(u48);
                        ? obj14 = new Object();
                        obj14.b = o6.getLong(u41);
                        obj14.c = o6.getLong(u42);
                        obj14.d = o6.getLong(u43);
                        obj14.e = o6.getLong(u44);
                        if (o6.isNull(u45)) {
                            obj14.f = null;
                        } else {
                            obj14.f = o6.getString(u45);
                        }
                        obj14.a = obj13;
                        arrayList4.add(obj14);
                    }
                    o6.close();
                    return arrayList4;
                } catch (Throwable th6) {
                    o6.close();
                    throw th6;
                }
            case 6:
                Cursor o7 = this.c.a.o(this.b, (CancellationSignal) null);
                try {
                    int u49 = kne.u(o7, "message_time");
                    int u50 = kne.u(o7, "live_period");
                    int u51 = kne.u(o7, "start_time");
                    int u52 = kne.u(o7, "end_time");
                    int u53 = kne.u(o7, "device_id");
                    int u54 = kne.u(o7, "contact_server_id");
                    int u55 = kne.u(o7, "chat_id");
                    int u56 = kne.u(o7, "message_id");
                    ArrayList arrayList5 = new ArrayList(o7.getCount());
                    while (o7.moveToNext()) {
                        ? obj15 = new Object();
                        obj15.a = o7.getLong(u54);
                        obj15.b = o7.getLong(u55);
                        obj15.c = o7.getLong(u56);
                        ? obj16 = new Object();
                        obj16.b = o7.getLong(u49);
                        obj16.c = o7.getLong(u50);
                        obj16.d = o7.getLong(u51);
                        obj16.e = o7.getLong(u52);
                        if (o7.isNull(u53)) {
                            obj16.f = null;
                        } else {
                            obj16.f = o7.getString(u53);
                        }
                        obj16.a = obj15;
                        arrayList5.add(obj16);
                    }
                    o7.close();
                    return arrayList5;
                } catch (Throwable th7) {
                    o7.close();
                    throw th7;
                }
            default:
                Cursor o8 = this.c.a.o(this.b, (CancellationSignal) null);
                try {
                    int u57 = kne.u(o8, "message_time");
                    int u58 = kne.u(o8, "live_period");
                    int u59 = kne.u(o8, "start_time");
                    int u60 = kne.u(o8, "end_time");
                    int u61 = kne.u(o8, "device_id");
                    int u62 = kne.u(o8, "contact_server_id");
                    int u63 = kne.u(o8, "chat_id");
                    int u64 = kne.u(o8, "message_id");
                    ArrayList arrayList6 = new ArrayList(o8.getCount());
                    while (o8.moveToNext()) {
                        ? obj17 = new Object();
                        obj17.a = o8.getLong(u62);
                        obj17.b = o8.getLong(u63);
                        obj17.c = o8.getLong(u64);
                        ? obj18 = new Object();
                        obj18.b = o8.getLong(u57);
                        obj18.c = o8.getLong(u58);
                        obj18.d = o8.getLong(u59);
                        obj18.e = o8.getLong(u60);
                        if (o8.isNull(u61)) {
                            obj18.f = null;
                        } else {
                            obj18.f = o8.getString(u61);
                        }
                        obj18.a = obj17;
                        arrayList6.add(obj18);
                    }
                    o8.close();
                    return arrayList6;
                } catch (Throwable th8) {
                    o8.close();
                    throw th8;
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
            case 2:
                this.b.o();
                return;
            case 3:
                this.b.o();
                return;
            case 4:
                this.b.o();
                return;
            case 5:
                this.b.o();
                return;
            case 6:
                this.b.o();
                return;
            default:
                this.b.o();
                return;
        }
    }
}
