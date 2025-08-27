package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: svd  reason: default package */
public final class svd extends gud {
    public final /* synthetic */ int b = 0;
    public final long c;
    public final Object o;

    public svd(long j) {
        this.c = j;
        this.o = svd.class.getName();
    }

    public boolean A(a32 a32) {
        long j;
        List<a89> list;
        a32 a322 = a32;
        Object obj = this.o;
        if (a322 == null) {
            return false;
        }
        m72 m72 = a322.b;
        bl4 bl4 = (bl4) obj;
        if (m72.n.c(bl4) == 0) {
            return false;
        }
        int ordinal = bl4.ordinal();
        if (ordinal == 0) {
            e().getClass();
            j = a32.o();
            a89 a89 = a322.c;
            if (a89 != null) {
                long j2 = a89.a.o;
                if (j > j2) {
                    j = j2;
                }
            }
        } else if (ordinal == 1) {
            j = System.currentTimeMillis();
        } else {
            throw new IllegalStateException("Unexpected value: " + bl4);
        }
        fa9 o2 = o();
        ArrayList d = m72.n.d(bl4);
        o2.getClass();
        z68.c("fa9", "loadInitialToReadMark " + iq.U(Long.valueOf(j)) + "; chunks count = " + d.size(), new Object[0]);
        f72 f72 = (f72) hd8.r(j, d).getSecond();
        bl4 bl42 = (bl4) obj;
        hs7 hs7 = o2.g;
        if (f72 == null) {
            f72 s = hd8.s(j, d);
            if (s != null) {
                long j3 = a322.a;
                long j4 = s.a;
                long j5 = s.b;
                list = ((gb9) hs7.get()).b(o2.o(j3, j4, j5, true, bl42));
            } else {
                list = null;
            }
        } else {
            hs7 hs72 = hs7;
            String str = "fa9";
            ArrayList o3 = o2.o(a322.a, f72.a, j, true, bl42);
            ArrayList o4 = o2.o(a322.a, j, f72.b, false, bl42);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Iterator it = o3.iterator();
            while (it.hasNext()) {
                ha9 ha9 = (ha9) it.next();
                arrayList.add(ha9);
                hashSet.add(Long.valueOf(ha9.b));
            }
            Iterator it2 = o4.iterator();
            while (it2.hasNext()) {
                ha9 ha92 = (ha9) it2.next();
                if (!hashSet.contains(Long.valueOf(ha92.b))) {
                    arrayList.add(ha92);
                    hashSet.add(Long.valueOf(ha92.b));
                }
            }
            z68.c(str, "result record count = " + hashSet.size(), new Object[0]);
            list = ((gb9) hs72.get()).b(arrayList);
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        for (a89 a892 : list) {
            hud hud = this.a;
            if (hud == null) {
                hud = null;
            }
            esb esb = (esb) hud.n0.getValue();
            ha9 ha93 = a892.a;
            ((gsb) esb.c.computeIfAbsent(Long.valueOf(ha93.b), new yi(15, new ep1(esb, ha93, a322, 10)))).i(a322);
            ha9 ha94 = a892.a;
            if (ha94.o()) {
                w28 w28 = ha94.x0;
                int G = w28.G();
                for (int i = 0; i < G; i++) {
                    ou8 n = n();
                    w28.F(i);
                    n.getClass();
                }
            }
        }
        return true;
    }

    public final void z() {
        List<ha9> list;
        String str;
        long j;
        String str2;
        d7d d7d;
        String str3;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        String str4;
        int i4;
        String str5;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        long j2 = 0;
        long j3 = this.c;
        switch (this.b) {
            case 0:
                List emptyList = CollectionsKt.emptyList();
                a32 G = h().G(j3);
                String str6 = (String) this.o;
                if (G != null) {
                    m72 m72 = G.b;
                    if (!m72.e.isEmpty()) {
                        for (Map.Entry entry : m72.e.entrySet()) {
                            long longValue = ((Number) entry.getKey()).longValue();
                            long longValue2 = ((Number) entry.getValue()).longValue();
                            if (longValue != ((ltb) q()).a.s() && longValue2 > j2) {
                                j2 = longValue2;
                            }
                        }
                    } else {
                        a89 a89 = G.c;
                        if (a89 != null) {
                            j2 = a89.a.o;
                        }
                    }
                    fa9 p = p();
                    z6d z6d = ((a74) p.a).c;
                    long s = ((ltb) p.c).a.s();
                    aj9 d = z6d.d();
                    cd4 cd4 = oa9.b;
                    sq6 sq6 = qe9.b;
                    d.getClass();
                    d7d a = d7d.a(5, "SELECT * FROM messages WHERE chat_id = ? AND sender = ? AND time <= ? AND delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ?");
                    a.k(1, j3);
                    a.k(2, s);
                    i2a.o(a, 3, j2, d);
                    i2a.o(a, 4, (long) 20, d);
                    a.k(5, (long) 10);
                    i6d i6d = d.a;
                    i6d.b();
                    Cursor o2 = i6d.o(a, (CancellationSignal) null);
                    try {
                        int u = kne.u(o2, "id");
                        int u2 = kne.u(o2, "server_id");
                        int u3 = kne.u(o2, "time");
                        int u4 = kne.u(o2, "update_time");
                        int u5 = kne.u(o2, "sender");
                        int u6 = kne.u(o2, "cid");
                        int u7 = kne.u(o2, "text");
                        String str7 = str6;
                        int u8 = kne.u(o2, "delivery_status");
                        String str8 = " to update = ";
                        int u9 = kne.u(o2, "status");
                        long j4 = j3;
                        int u10 = kne.u(o2, "time_local");
                        int u11 = kne.u(o2, "error");
                        String str9 = "messages for chat ";
                        int u12 = kne.u(o2, "localized_error");
                        z6d z6d2 = z6d;
                        int u13 = kne.u(o2, "attaches");
                        d7d = a;
                        try {
                            int u14 = kne.u(o2, "media_type");
                            int u15 = kne.u(o2, "detect_share");
                            int u16 = kne.u(o2, "msg_link_type");
                            int u17 = kne.u(o2, "msg_link_id");
                            int u18 = kne.u(o2, "inserted_from_msg_link");
                            int u19 = kne.u(o2, "msg_link_chat_id");
                            int u20 = kne.u(o2, "msg_link_chat_name");
                            int u21 = kne.u(o2, "msg_link_chat_link");
                            int u22 = kne.u(o2, "msg_link_out_chat_id");
                            int u23 = kne.u(o2, "msg_link_out_msg_id");
                            int u24 = kne.u(o2, "type");
                            int u25 = kne.u(o2, "chat_id");
                            int u26 = kne.u(o2, "ttl");
                            int u27 = kne.u(o2, "channel_views");
                            int u28 = kne.u(o2, "channel_forwards");
                            int u29 = kne.u(o2, "view_time");
                            int u30 = kne.u(o2, "zoom");
                            int u31 = kne.u(o2, "options");
                            int u32 = kne.u(o2, "live_until");
                            int u33 = kne.u(o2, "elements");
                            int u34 = kne.u(o2, "reactions");
                            int u35 = kne.u(o2, "delayed_attrs_time_to_fire");
                            int u36 = kne.u(o2, "delayed_attrs_notify_sender");
                            int i9 = u13;
                            ArrayList arrayList = new ArrayList(o2.getCount());
                            while (o2.moveToNext()) {
                                long j5 = o2.getLong(u);
                                long j6 = o2.getLong(u2);
                                long j7 = o2.getLong(u3);
                                long j8 = o2.getLong(u4);
                                long j9 = o2.getLong(u5);
                                long j10 = o2.getLong(u6);
                                String string = o2.isNull(u7) ? null : o2.getString(u7);
                                int i10 = o2.getInt(u8);
                                d.a().getClass();
                                oa9.b.getClass();
                                oa9 n = cd4.n(i10);
                                int i11 = o2.getInt(u9);
                                d.a().getClass();
                                qe9.b.getClass();
                                qe9 D = sq6.D(i11);
                                long j11 = o2.getLong(u10);
                                String string2 = o2.isNull(u11) ? null : o2.getString(u11);
                                if (o2.isNull(u12)) {
                                    i = i9;
                                    str3 = null;
                                } else {
                                    str3 = o2.getString(u12);
                                    i = i9;
                                }
                                byte[] blob = o2.isNull(i) ? null : o2.getBlob(i);
                                d.a().getClass();
                                w28 b2 = qe8.b(blob);
                                int i12 = u7;
                                int i13 = u14;
                                int i14 = o2.getInt(i13);
                                u14 = i13;
                                int i15 = u15;
                                if (o2.getInt(i15) != 0) {
                                    u15 = i15;
                                    i2 = u16;
                                    z = true;
                                } else {
                                    u15 = i15;
                                    i2 = u16;
                                    z = false;
                                }
                                int i16 = o2.getInt(i2);
                                u16 = i2;
                                int i17 = u17;
                                long j12 = o2.getLong(i17);
                                u17 = i17;
                                int i18 = u18;
                                if (o2.getInt(i18) != 0) {
                                    u18 = i18;
                                    i3 = u19;
                                    z2 = true;
                                } else {
                                    u18 = i18;
                                    i3 = u19;
                                    z2 = false;
                                }
                                long j13 = o2.getLong(i3);
                                u19 = i3;
                                int i19 = u20;
                                if (o2.isNull(i19)) {
                                    u20 = i19;
                                    i4 = u21;
                                    str4 = null;
                                } else {
                                    str4 = o2.getString(i19);
                                    u20 = i19;
                                    i4 = u21;
                                }
                                if (o2.isNull(i4)) {
                                    u21 = i4;
                                    i5 = u22;
                                    str5 = null;
                                } else {
                                    str5 = o2.getString(i4);
                                    u21 = i4;
                                    i5 = u22;
                                }
                                long j14 = o2.getLong(i5);
                                u22 = i5;
                                int i20 = u23;
                                long j15 = o2.getLong(i20);
                                u23 = i20;
                                int i21 = u24;
                                int i22 = o2.getInt(i21);
                                d.a().getClass();
                                int c2 = wj6.c(i22);
                                u24 = i21;
                                int i23 = u25;
                                long j16 = o2.getLong(i23);
                                u25 = i23;
                                int i24 = u26;
                                int i25 = o2.getInt(i24);
                                u26 = i24;
                                int i26 = u27;
                                int i27 = o2.getInt(i26);
                                u27 = i26;
                                int i28 = u28;
                                int i29 = o2.getInt(i28);
                                u28 = i28;
                                int i30 = u29;
                                long j17 = o2.getLong(i30);
                                u29 = i30;
                                int i31 = u30;
                                int i32 = o2.getInt(i31);
                                u30 = i31;
                                int i33 = u31;
                                int i34 = o2.getInt(i33);
                                u31 = i33;
                                int i35 = u32;
                                long j18 = o2.getLong(i35);
                                u32 = i35;
                                int i36 = u33;
                                byte[] blob2 = o2.isNull(i36) ? null : o2.getBlob(i36);
                                d.a().getClass();
                                List a2 = hp9.a(blob2);
                                u33 = i36;
                                int i37 = u34;
                                if (o2.isNull(i37)) {
                                    i6 = i37;
                                    i7 = u6;
                                    bArr = null;
                                } else {
                                    i6 = i37;
                                    bArr = o2.getBlob(i37);
                                    i7 = u6;
                                }
                                xd9 b3 = d.a().b(bArr);
                                int i38 = u35;
                                if (o2.isNull(i38)) {
                                    i8 = u36;
                                    l = null;
                                } else {
                                    l = Long.valueOf(o2.getLong(i38));
                                    i8 = u36;
                                }
                                Integer valueOf = o2.isNull(i8) ? null : Integer.valueOf(o2.getInt(i8));
                                if (valueOf == null) {
                                    u35 = i38;
                                    bool = null;
                                } else {
                                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                                    u35 = i38;
                                }
                                arrayList.add(new ya9(j5, j6, j7, j8, j9, j10, string, n, D, j11, string2, str3, b2, i14, z, i16, j12, z2, j13, str4, str5, j14, j15, c2, j16, i25, i27, i29, j17, i32, i34, j18, a2, b3, l, bool));
                                u36 = i8;
                                u6 = i7;
                                u7 = i12;
                                u34 = i6;
                                i9 = i;
                            }
                            o2.close();
                            d7d.o();
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(z6d2.b((ya9) it.next()));
                            }
                            if (!arrayList2.isEmpty()) {
                                int size = arrayList2.size();
                                str2 = str9;
                                StringBuilder sb = new StringBuilder(str2);
                                j = j4;
                                sb.append(j);
                                str = str8;
                                sb.append(str);
                                sb.append(size);
                                str6 = str7;
                                z68.c(str6, sb.toString(), new Object[0]);
                                list = arrayList2;
                            } else {
                                str6 = str7;
                                str = str8;
                                j = j4;
                                str2 = str9;
                                list = arrayList2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            o2.close();
                            d7d.o();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        d7d = a;
                        o2.close();
                        d7d.o();
                        throw th;
                    }
                } else {
                    j = j3;
                    str = " to update = ";
                    str2 = "messages for chat ";
                    list = emptyList;
                }
                int size2 = list.size();
                z68.c(str6, str2 + j + str + size2, new Object[0]);
                if (!list.isEmpty()) {
                    fa9 p2 = p();
                    cd4 cd42 = oa9.b;
                    z6d z6d3 = ((a74) p2.a).c;
                    ((OneMeRoomDatabase) z6d3.a.m()).q(new o6d(list, z6d3));
                    a32 G2 = h().G(j);
                    for (ha9 ha9 : list) {
                        if ((G2 != null ? G2.c : null) != null && G2.c.a.b == ha9.b) {
                            h().u0(j, ha9, false);
                        }
                        hud hud = this.a;
                        if (hud == null) {
                            hud = null;
                        }
                        ((sv0) hud.c.getValue()).c(new twf(0, ha9.z, ha9.b));
                    }
                    int size3 = list.size();
                    z68.c(str6, "records updated " + size3, new Object[0]);
                    return;
                }
                return;
            default:
                if (j3 > 0) {
                    A(e().G(j3));
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i39 = 0;
                for (a32 a32 : e().I(r62.I)) {
                    if (currentTimeMillis - a32.b.k < 1209600000) {
                        if (A(a32)) {
                            i39++;
                        }
                        if (i39 >= 10) {
                            return;
                        }
                    }
                }
                return;
        }
    }

    public svd(long j, bl4 bl4) {
        this.c = j;
        this.o = bl4;
    }
}
