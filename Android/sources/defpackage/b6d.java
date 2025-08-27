package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.collections.CollectionsKt;
import ru.ok.tamtam.nano.Protos;

/* renamed from: b6d  reason: default package */
public final class b6d implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7d b;
    public final /* synthetic */ c6d c;

    public /* synthetic */ b6d(c6d c6d, d7d d7d, int i) {
        this.a = i;
        this.c = c6d;
        this.b = d7d;
    }

    public final Object call() {
        List emptyList;
        d7d d7d;
        List emptyList2;
        d7d d7d2;
        List emptyList3;
        d7d d7d3;
        List emptyList4;
        Long l;
        d7d d7d4 = this.b;
        c6d c6d = this.c;
        switch (this.a) {
            case 0:
                String str = "isRemoved";
                d7d d7d5 = d7d4;
                Cursor o = c6d.a.o(d7d4, (CancellationSignal) null);
                try {
                    int u = kne.u(o, "id");
                    int u2 = kne.u(o, "title");
                    int u3 = kne.u(o, "emoji");
                    int u4 = kne.u(o, "order");
                    int u5 = kne.u(o, "filters");
                    int u6 = kne.u(o, "isHiddenForAllFolder");
                    int u7 = kne.u(o, "hideIfEmpty");
                    int u8 = kne.u(o, "elements");
                    int u9 = kne.u(o, "creatorId");
                    int u10 = kne.u(o, "filterSubjects");
                    int u11 = kne.u(o, "widgets");
                    int u12 = kne.u(o, "options");
                    int u13 = kne.u(o, str);
                    ArrayList arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        String string = o.isNull(u) ? null : o.getString(u);
                        String string2 = o.isNull(u2) ? null : o.getString(u2);
                        String string3 = o.isNull(u3) ? null : o.getString(u3);
                        int i = o.getInt(u4);
                        EnumSet n0 = tf6.n0(o.isNull(u5) ? null : o.getString(u5));
                        boolean z = o.getInt(u6) != 0;
                        boolean z2 = o.getInt(u7) != 0;
                        byte[] blob = o.isNull(u8) ? null : o.getBlob(u8);
                        int i2 = u8;
                        if (blob != null) {
                            Protos.MessageElements messageElements = new Protos.MessageElements();
                            ad9.mergeFrom(messageElements, blob);
                            emptyList = ua9.a(messageElements);
                        } else {
                            emptyList = CollectionsKt.emptyList();
                        }
                        arrayList.add(new j5d(string, string2, string3, i, (Set) n0, z, z2, emptyList, o.isNull(u9) ? null : Long.valueOf(o.getLong(u9)), tf6.L(o.isNull(u10) ? null : o.getBlob(u10)), tf6.N(o.isNull(u11) ? null : o.getBlob(u11)), tf6.M(o.isNull(u12) ? null : o.getBlob(u12)), o.getInt(u13) != 0));
                        u8 = i2;
                    }
                    return arrayList;
                } finally {
                    o.close();
                }
            case 1:
                String str2 = "isRemoved";
                d7d d7d6 = d7d4;
                Cursor o2 = c6d.a.o(d7d6, (CancellationSignal) null);
                try {
                    int u14 = kne.u(o2, "id");
                    int u15 = kne.u(o2, "title");
                    int u16 = kne.u(o2, "emoji");
                    int u17 = kne.u(o2, "order");
                    int u18 = kne.u(o2, "filters");
                    int u19 = kne.u(o2, "isHiddenForAllFolder");
                    int u20 = kne.u(o2, "hideIfEmpty");
                    int u21 = kne.u(o2, "elements");
                    int u22 = kne.u(o2, "creatorId");
                    int u23 = kne.u(o2, "filterSubjects");
                    int u24 = kne.u(o2, "widgets");
                    int u25 = kne.u(o2, "options");
                    int u26 = kne.u(o2, str2);
                    d7d = d7d6;
                    try {
                        ArrayList arrayList2 = new ArrayList(o2.getCount());
                        while (o2.moveToNext()) {
                            String string4 = o2.isNull(u14) ? null : o2.getString(u14);
                            String string5 = o2.isNull(u15) ? null : o2.getString(u15);
                            String string6 = o2.isNull(u16) ? null : o2.getString(u16);
                            int i3 = o2.getInt(u17);
                            EnumSet n02 = tf6.n0(o2.isNull(u18) ? null : o2.getString(u18));
                            boolean z3 = o2.getInt(u19) != 0;
                            boolean z4 = o2.getInt(u20) != 0;
                            byte[] blob2 = o2.isNull(u21) ? null : o2.getBlob(u21);
                            int i4 = u21;
                            if (blob2 != null) {
                                Protos.MessageElements messageElements2 = new Protos.MessageElements();
                                ad9.mergeFrom(messageElements2, blob2);
                                emptyList2 = ua9.a(messageElements2);
                            } else {
                                emptyList2 = CollectionsKt.emptyList();
                            }
                            arrayList2.add(new j5d(string4, string5, string6, i3, (Set) n02, z3, z4, emptyList2, o2.isNull(u22) ? null : Long.valueOf(o2.getLong(u22)), tf6.L(o2.isNull(u23) ? null : o2.getBlob(u23)), tf6.N(o2.isNull(u24) ? null : o2.getBlob(u24)), tf6.M(o2.isNull(u25) ? null : o2.getBlob(u25)), o2.getInt(u26) != 0));
                            u21 = i4;
                        }
                        o2.close();
                        d7d.o();
                        return arrayList2;
                    } catch (Throwable th) {
                        th = th;
                        o2.close();
                        d7d.o();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    d7d = d7d6;
                    o2.close();
                    d7d.o();
                    throw th;
                }
            case 2:
                d7d d7d7 = d7d4;
                String str3 = "isRemoved";
                Cursor o3 = c6d.a.o(d7d4, (CancellationSignal) null);
                try {
                    int u27 = kne.u(o3, "id");
                    int u28 = kne.u(o3, "title");
                    int u29 = kne.u(o3, "emoji");
                    int u30 = kne.u(o3, "order");
                    int u31 = kne.u(o3, "filters");
                    int u32 = kne.u(o3, "isHiddenForAllFolder");
                    int u33 = kne.u(o3, "hideIfEmpty");
                    int u34 = kne.u(o3, "elements");
                    int u35 = kne.u(o3, "creatorId");
                    int u36 = kne.u(o3, "filterSubjects");
                    int u37 = kne.u(o3, "widgets");
                    int u38 = kne.u(o3, "options");
                    int u39 = kne.u(o3, str3);
                    d7d2 = d7d4;
                    try {
                        ArrayList arrayList3 = new ArrayList(o3.getCount());
                        while (o3.moveToNext()) {
                            String string7 = o3.isNull(u27) ? null : o3.getString(u27);
                            String string8 = o3.isNull(u28) ? null : o3.getString(u28);
                            String string9 = o3.isNull(u29) ? null : o3.getString(u29);
                            int i5 = o3.getInt(u30);
                            EnumSet n03 = tf6.n0(o3.isNull(u31) ? null : o3.getString(u31));
                            boolean z5 = o3.getInt(u32) != 0;
                            boolean z6 = o3.getInt(u33) != 0;
                            byte[] blob3 = o3.isNull(u34) ? null : o3.getBlob(u34);
                            int i6 = u27;
                            if (blob3 != null) {
                                Protos.MessageElements messageElements3 = new Protos.MessageElements();
                                ad9.mergeFrom(messageElements3, blob3);
                                emptyList3 = ua9.a(messageElements3);
                            } else {
                                emptyList3 = CollectionsKt.emptyList();
                            }
                            arrayList3.add(new j5d(string7, string8, string9, i5, (Set) n03, z5, z6, emptyList3, o3.isNull(u35) ? null : Long.valueOf(o3.getLong(u35)), tf6.L(o3.isNull(u36) ? null : o3.getBlob(u36)), tf6.N(o3.isNull(u37) ? null : o3.getBlob(u37)), tf6.M(o3.isNull(u38) ? null : o3.getBlob(u38)), o3.getInt(u39) != 0));
                            u27 = i6;
                        }
                        o3.close();
                        d7d2.o();
                        return arrayList3;
                    } catch (Throwable th3) {
                        th = th3;
                        o3.close();
                        d7d2.o();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    d7d2 = d7d4;
                    o3.close();
                    d7d2.o();
                    throw th;
                }
            case 3:
                Cursor o4 = c6d.a.o(d7d4, (CancellationSignal) null);
                try {
                    int u40 = kne.u(o4, "id");
                    int u41 = kne.u(o4, "title");
                    int u42 = kne.u(o4, "emoji");
                    int u43 = kne.u(o4, "order");
                    int u44 = kne.u(o4, "filters");
                    int u45 = kne.u(o4, "isHiddenForAllFolder");
                    int u46 = kne.u(o4, "hideIfEmpty");
                    int u47 = kne.u(o4, "elements");
                    int u48 = kne.u(o4, "creatorId");
                    int u49 = kne.u(o4, "filterSubjects");
                    int u50 = kne.u(o4, "widgets");
                    int u51 = kne.u(o4, "options");
                    int u52 = kne.u(o4, "isRemoved");
                    d7d3 = d7d4;
                    try {
                        ArrayList arrayList4 = new ArrayList(o4.getCount());
                        while (o4.moveToNext()) {
                            String string10 = o4.isNull(u40) ? null : o4.getString(u40);
                            String string11 = o4.isNull(u41) ? null : o4.getString(u41);
                            String string12 = o4.isNull(u42) ? null : o4.getString(u42);
                            int i7 = o4.getInt(u43);
                            EnumSet n04 = tf6.n0(o4.isNull(u44) ? null : o4.getString(u44));
                            boolean z7 = o4.getInt(u45) != 0;
                            boolean z8 = o4.getInt(u46) != 0;
                            byte[] blob4 = o4.isNull(u47) ? null : o4.getBlob(u47);
                            int i8 = u40;
                            if (blob4 != null) {
                                Protos.MessageElements messageElements4 = new Protos.MessageElements();
                                ad9.mergeFrom(messageElements4, blob4);
                                emptyList4 = ua9.a(messageElements4);
                            } else {
                                emptyList4 = CollectionsKt.emptyList();
                            }
                            arrayList4.add(new j5d(string10, string11, string12, i7, (Set) n04, z7, z8, emptyList4, o4.isNull(u48) ? null : Long.valueOf(o4.getLong(u48)), tf6.L(o4.isNull(u49) ? null : o4.getBlob(u49)), tf6.N(o4.isNull(u50) ? null : o4.getBlob(u50)), tf6.M(o4.isNull(u51) ? null : o4.getBlob(u51)), o4.getInt(u52) != 0));
                            u40 = i8;
                        }
                        o4.close();
                        d7d3.o();
                        return arrayList4;
                    } catch (Throwable th5) {
                        th = th5;
                        o4.close();
                        d7d3.o();
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    d7d3 = d7d4;
                    o4.close();
                    d7d3.o();
                    throw th;
                }
            case 4:
                Cursor o5 = c6d.a.o(d7d4, (CancellationSignal) null);
                try {
                    if (o5.moveToFirst()) {
                        if (!o5.isNull(0)) {
                            l = Long.valueOf(o5.getLong(0));
                            return l;
                        }
                    }
                    l = null;
                    return l;
                } finally {
                    o5.close();
                    d7d4.o();
                }
            default:
                Cursor o6 = c6d.a.o(d7d4, (CancellationSignal) null);
                try {
                    return (!o6.moveToFirst() || o6.isNull(0)) ? null : o6.getBlob(0);
                } finally {
                    o6.close();
                    d7d4.o();
                }
        }
    }

    public void finalize() {
        switch (this.a) {
            case 0:
                this.b.o();
                return;
            default:
                super.finalize();
                return;
        }
    }
}
