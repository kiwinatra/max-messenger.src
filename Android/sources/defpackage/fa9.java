package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: fa9  reason: default package */
public final class fa9 {
    public final s74 a;
    public final sv0 b;
    public final jtb c;
    public final d6b d;
    public final jqg e;
    public final esb f;
    public final hs7 g;
    public final lfd h;
    public qk3 i;

    public fa9(s74 s74, sv0 sv0, jtb jtb, d6b d6b, jqg jqg, esb esb, hs7 hs7, lfd lfd) {
        this.a = s74;
        this.b = sv0;
        this.c = jtb;
        this.d = d6b;
        this.e = jqg;
        this.f = esb;
        this.g = hs7;
        this.h = lfd;
    }

    public final void A(long j, long j2, qe9 qe9) {
        aj9 d2 = ((a74) this.a).c.d();
        i6d i6d = d2.a;
        i6d.b();
        uf9 uf9 = d2.k;
        gf6 E = uf9.E();
        d2.a().getClass();
        E.k(1, (long) qe9.a);
        E.k(2, j);
        E.k(3, j2);
        try {
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            uf9.S(E);
        } catch (Throwable th) {
            uf9.S(E);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void B(long j, String str, List list, r62 r62, qe9 qe9) {
        aj9 d2 = ((a74) this.a).c.d();
        zwf zwf = new zwf(j, str, list, qe9);
        i6d i6d = d2.a;
        i6d.b();
        i6d.c();
        try {
            d2.f.a0(zwf);
            i6d.r();
            i6d.l();
            ha9 r = r(j);
            if (r != null) {
                this.f.b(r62.G(r.z), r);
            }
        } catch (Throwable th) {
            i6d.l();
            throw th;
        }
    }

    public final void C(long j, long j2) {
        aj9 d2 = ((a74) this.a).c.d();
        i6d i6d = d2.a;
        i6d.b();
        uf9 uf9 = d2.j;
        gf6 E = uf9.E();
        E.k(1, j2);
        E.k(2, j);
        try {
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            uf9.S(E);
        } catch (Throwable th) {
            uf9.S(E);
            throw th;
        }
    }

    public final void a(a89 a89, String str, rf9 rf9) {
        jbd.a(new ba9(this, a89, str, rf9), this.h, (x6) null, new p79(8), (lfd) null);
    }

    public final long b(long j, long j2) {
        z68.c("fa9", "countMessagesFrom chatId = %d, timeFrom = %d", Long.valueOf(j), Long.valueOf(j2));
        aj9 d2 = ((a74) this.a).c.d();
        sq6 sq6 = qe9.b;
        d2.getClass();
        d7d a2 = d7d.a(4, "SELECT COUNT(*) FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = ? AND status <> ?");
        a2.k(1, j);
        a2.k(2, j2);
        i2a.o(a2, 3, (long) 0, d2);
        a2.k(4, (long) 10);
        i6d i6d = d2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            return o.moveToFirst() ? o.getLong(0) : 0;
        } finally {
            o.close();
            a2.o();
        }
    }

    public final void c(long j, long j2, long j3) {
        d7d d7d;
        String str;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l;
        int i9;
        Boolean bool;
        long j4 = j;
        long j5 = j3;
        a74 a74 = (a74) this.a;
        z6d z6d = a74.c;
        aj9 d2 = z6d.d();
        d2.getClass();
        d7d a2 = d7d.a(2, "SELECT * FROM messages WHERE time >= ? AND time <= ? AND msg_link_id > 0");
        a2.k(1, j2);
        a2.k(2, LongCompanionObject.MAX_VALUE);
        i6d i6d = d2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "server_id");
            int u3 = kne.u(o, "time");
            int u4 = kne.u(o, "update_time");
            int u5 = kne.u(o, "sender");
            int u6 = kne.u(o, "cid");
            int u7 = kne.u(o, "text");
            int u8 = kne.u(o, "delivery_status");
            int u9 = kne.u(o, "status");
            int u10 = kne.u(o, "time_local");
            int u11 = kne.u(o, "error");
            a74 a742 = a74;
            int u12 = kne.u(o, "localized_error");
            z6d z6d2 = z6d;
            int u13 = kne.u(o, "attaches");
            d7d = a2;
            try {
                int u14 = kne.u(o, "media_type");
                int u15 = kne.u(o, "detect_share");
                int u16 = kne.u(o, "msg_link_type");
                int u17 = kne.u(o, "msg_link_id");
                int u18 = kne.u(o, "inserted_from_msg_link");
                int u19 = kne.u(o, "msg_link_chat_id");
                int u20 = kne.u(o, "msg_link_chat_name");
                int u21 = kne.u(o, "msg_link_chat_link");
                int u22 = kne.u(o, "msg_link_out_chat_id");
                int u23 = kne.u(o, "msg_link_out_msg_id");
                int u24 = kne.u(o, "type");
                int u25 = kne.u(o, "chat_id");
                int u26 = kne.u(o, "ttl");
                int u27 = kne.u(o, "channel_views");
                int u28 = kne.u(o, "channel_forwards");
                int u29 = kne.u(o, "view_time");
                int u30 = kne.u(o, "zoom");
                int u31 = kne.u(o, "options");
                int u32 = kne.u(o, "live_until");
                int u33 = kne.u(o, "elements");
                int u34 = kne.u(o, "reactions");
                int u35 = kne.u(o, "delayed_attrs_time_to_fire");
                int u36 = kne.u(o, "delayed_attrs_notify_sender");
                int i10 = u13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j6 = o.getLong(u);
                    long j7 = o.getLong(u2);
                    long j8 = o.getLong(u3);
                    long j9 = o.getLong(u4);
                    long j10 = o.getLong(u5);
                    long j11 = o.getLong(u6);
                    String string = o.isNull(u7) ? null : o.getString(u7);
                    int i11 = o.getInt(u8);
                    d2.a().getClass();
                    oa9.b.getClass();
                    oa9 n = cd4.n(i11);
                    int i12 = o.getInt(u9);
                    d2.a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i12);
                    long j12 = o.getLong(u10);
                    String string2 = o.isNull(u11) ? null : o.getString(u11);
                    if (o.isNull(u12)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(u12);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    w28 b2 = qe8.b(blob);
                    int i13 = u5;
                    int i14 = u14;
                    int i15 = o.getInt(i14);
                    u14 = i14;
                    int i16 = u15;
                    boolean z3 = false;
                    if (o.getInt(i16) != 0) {
                        u15 = i16;
                        i3 = u16;
                        z = true;
                    } else {
                        u15 = i16;
                        i3 = u16;
                        z = false;
                    }
                    int i17 = o.getInt(i3);
                    u16 = i3;
                    int i18 = u17;
                    long j13 = o.getLong(i18);
                    u17 = i18;
                    int i19 = u18;
                    if (o.getInt(i19) != 0) {
                        u18 = i19;
                        i4 = u19;
                        z2 = true;
                    } else {
                        u18 = i19;
                        i4 = u19;
                        z2 = false;
                    }
                    long j14 = o.getLong(i4);
                    u19 = i4;
                    int i20 = u20;
                    if (o.isNull(i20)) {
                        u20 = i20;
                        i5 = u21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i20);
                        u20 = i20;
                        i5 = u21;
                    }
                    if (o.isNull(i5)) {
                        u21 = i5;
                        i6 = u22;
                        str3 = null;
                    } else {
                        str3 = o.getString(i5);
                        u21 = i5;
                        i6 = u22;
                    }
                    long j15 = o.getLong(i6);
                    u22 = i6;
                    int i21 = u23;
                    long j16 = o.getLong(i21);
                    u23 = i21;
                    int i22 = u24;
                    int i23 = o.getInt(i22);
                    d2.a().getClass();
                    int c2 = wj6.c(i23);
                    u24 = i22;
                    int i24 = u25;
                    long j17 = o.getLong(i24);
                    u25 = i24;
                    int i25 = u26;
                    int i26 = o.getInt(i25);
                    u26 = i25;
                    int i27 = u27;
                    int i28 = o.getInt(i27);
                    u27 = i27;
                    int i29 = u28;
                    int i30 = o.getInt(i29);
                    u28 = i29;
                    int i31 = u29;
                    long j18 = o.getLong(i31);
                    u29 = i31;
                    int i32 = u30;
                    int i33 = o.getInt(i32);
                    u30 = i32;
                    int i34 = u31;
                    int i35 = o.getInt(i34);
                    u31 = i34;
                    int i36 = u32;
                    long j19 = o.getLong(i36);
                    u32 = i36;
                    int i37 = u33;
                    byte[] blob2 = o.isNull(i37) ? null : o.getBlob(i37);
                    d2.a().getClass();
                    List a3 = hp9.a(blob2);
                    u33 = i37;
                    int i38 = u34;
                    if (o.isNull(i38)) {
                        i7 = i38;
                        i8 = u12;
                        bArr = null;
                    } else {
                        i7 = i38;
                        bArr = o.getBlob(i38);
                        i8 = u12;
                    }
                    xd9 b3 = d2.a().b(bArr);
                    int i39 = u35;
                    if (o.isNull(i39)) {
                        i9 = u36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i39));
                        i9 = u36;
                    }
                    Integer valueOf = o.isNull(i9) ? null : Integer.valueOf(o.getInt(i9));
                    if (valueOf == null) {
                        u35 = i39;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                        u35 = i39;
                    }
                    arrayList.add(new ya9(j6, j7, j8, j9, j10, j11, string, n, D, j12, string2, str, b2, i15, z, i17, j13, z2, j14, str2, str3, j15, j16, c2, j17, i26, i28, i30, j18, i33, i35, j19, a3, b3, l, bool));
                    u36 = i9;
                    u12 = i8;
                    u5 = i13;
                    u34 = i7;
                    i10 = i2;
                }
                o.close();
                d7d.o();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(z6d2.b((ya9) it.next()));
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        ha9 ha9 = ((ha9) it2.next()).A0;
                        arrayList3.add(Long.valueOf(ha9 != null ? ha9.b : 0));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                z6d z6d3 = a742.c;
                bl4 bl4 = bl4.REGULAR;
                z6d3.getClass();
                int ordinal = bl4.ordinal();
                int i40 = 4;
                if (ordinal == 0) {
                    i6d i6d2 = z6d3.d().a;
                    i6d2.b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("DELETE FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND id NOT IN (");
                    n79.c(sb, arrayList3.size());
                    sb.append(")");
                    gf6 d3 = i6d2.d(sb.toString());
                    d3.k(1, j);
                    d3.k(2, j2);
                    d3.k(3, j3);
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Long l2 = (Long) it3.next();
                        if (l2 == null) {
                            d3.X(i40);
                        } else {
                            d3.k(i40, l2.longValue());
                        }
                        i40++;
                    }
                    i6d2.c();
                    try {
                        d3.n();
                        i6d2.r();
                    } finally {
                        i6d2.l();
                    }
                } else if (ordinal == 1) {
                    i6d i6d3 = z6d3.d().a;
                    i6d3.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DELETE FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND id NOT IN (");
                    n79.c(sb2, arrayList3.size());
                    sb2.append(")");
                    gf6 d4 = i6d3.d(sb2.toString());
                    d4.k(1, j);
                    d4.k(2, j2);
                    d4.k(3, j3);
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        Long l3 = (Long) it4.next();
                        if (l3 == null) {
                            d4.X(i40);
                        } else {
                            d4.k(i40, l3.longValue());
                        }
                        i40++;
                    }
                    i6d3.c();
                    try {
                        d4.n();
                        i6d3.r();
                    } finally {
                        i6d3.l();
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                this.b.c(new kv9(j, j2, j3, bl4.REGULAR));
            } catch (Throwable th2) {
                th = th2;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d7d = a2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    public final void d(long j, Collection collection) {
        z68.c("fa9", "deleteMessages %d ids = %s", Long.valueOf(j), CollectionsKt___CollectionsKt.joinToString(collection, ",", "[", "]", -1, "", new vq7(5, (Object) new p79(6))));
        this.d.getClass();
        if (j != 0) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                d6b.b(j, ((Long) it.next()).longValue());
            }
        }
        esb esb = this.f;
        esb.getClass();
        Iterable iterable = collection;
        for (Number longValue : CollectionsKt.toList(iterable)) {
            esb.c.remove(Long.valueOf(longValue.longValue()));
        }
        aj9 d2 = ((a74) this.a).c.d();
        List<Long> list = CollectionsKt.toList(iterable);
        i6d i6d = d2.a;
        i6d.b();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM messages WHERE chat_id = ? AND id in (");
        n79.c(sb, list.size());
        sb.append(")");
        gf6 d3 = i6d.d(sb.toString());
        d3.k(1, j);
        int i2 = 2;
        for (Long l : list) {
            if (l == null) {
                d3.X(i2);
            } else {
                d3.k(i2, l.longValue());
            }
            i2++;
        }
        i6d.c();
        try {
            d3.n();
            i6d.r();
        } finally {
            i6d.l();
        }
    }

    public final int e(long j, long j2, bl4 bl4) {
        ConcurrentHashMap concurrentHashMap = this.f.c;
        int i2 = 0;
        for (gsb gsb : CollectionsKt.toList(concurrentHashMap.values())) {
            ha9 ha9 = gsb.d;
            if (ha9.z == j) {
                int i3 = bl4 == null ? -1 : dsb.$EnumSwitchMapping$0[bl4.ordinal()];
                long j3 = ha9.b;
                if (i3 == -1 || i3 == 1) {
                    if (ha9.o <= j2) {
                        concurrentHashMap.remove(Long.valueOf(j3));
                    }
                } else if (i3 == 2) {
                    cl4 cl4 = ha9.R0;
                    if (cl4 != null && cl4.a <= j2) {
                        concurrentHashMap.remove(Long.valueOf(j3));
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                i2++;
            }
        }
        if (i2 > 0) {
            z68.c("esb", "clearPreprocessedDataInChat: chatId = %d, itemType = %s, count = %d", Long.valueOf(j), bl4, Integer.valueOf(i2));
        }
        return ((a74) this.a).c.a(j, j2, bl4);
    }

    public final boolean f(long j, long j2) {
        return ((a74) this.a).c.d().i(j, j2) != null;
    }

    public final long g(long j, long j2, b89 b89) {
        List singletonList = Collections.singletonList(b89);
        qk3 qk3 = this.i;
        if (qk3 != null) {
            try {
                qk3.accept(singletonList);
            } catch (Throwable th) {
                z68.f("fa9", "validateMessages: exception", th);
            }
        }
        return ((a74) this.a).c.e(j, j2, b89);
    }

    public final void h(long j, long j2, List list) {
        qk3 qk3 = this.i;
        if (qk3 != null) {
            try {
                qk3.accept(list);
            } catch (Throwable th) {
                z68.f("fa9", "validateMessages: exception", th);
            }
        }
        z6d z6d = ((a74) this.a).c;
        ((OneMeRoomDatabase) z6d.a.m()).q(new d70(list, z6d, j, j2, 2));
    }

    public final void i(Map map) {
        z6d z6d = ((a74) this.a).c;
        ((OneMeRoomDatabase) z6d.a.m()).q(new ovb(14, map, z6d));
    }

    public final ArrayList j(long j) {
        z6d z6d;
        ArrayList<ya9> arrayList;
        d7d d7d;
        String str;
        int i2;
        boolean z;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        d7d d7d2;
        String str4;
        int i9;
        boolean z2;
        int i10;
        String str5;
        int i11;
        String str6;
        int i12;
        int i13;
        int i14;
        byte[] bArr2;
        Long l2;
        int i15;
        Boolean bool2;
        long j2 = j;
        z6d z6d2 = ((a74) this.a).c;
        z6d2.getClass();
        int ordinal = bl4.REGULAR.ordinal();
        String str7 = "delayed_attrs_notify_sender";
        String str8 = "delayed_attrs_time_to_fire";
        String str9 = "reactions";
        String str10 = "elements";
        String str11 = "live_until";
        String str12 = "options";
        String str13 = "zoom";
        String str14 = "view_time";
        String str15 = "channel_forwards";
        String str16 = "channel_views";
        String str17 = "ttl";
        String str18 = "chat_id";
        String str19 = "type";
        String str20 = "msg_link_out_msg_id";
        String str21 = "msg_link_out_chat_id";
        String str22 = "msg_link_chat_link";
        String str23 = "msg_link_chat_name";
        String str24 = "msg_link_chat_id";
        String str25 = "inserted_from_msg_link";
        String str26 = "msg_link_id";
        String str27 = "msg_link_type";
        String str28 = "detect_share";
        String str29 = "media_type";
        String str30 = "attaches";
        String str31 = "localized_error";
        if (ordinal == 0) {
            z6d = z6d2;
            String str32 = "error";
            aj9 d2 = z6d.d();
            d2.getClass();
            String str33 = str30;
            String str34 = str31;
            d7d a2 = d7d.a(2, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC LIMIT ?");
            a2.k(1, j2);
            a2.k(2, (long) -1);
            i6d i6d = d2.a;
            i6d.b();
            Cursor o = i6d.o(a2, (CancellationSignal) null);
            try {
                int u = kne.u(o, "id");
                int u2 = kne.u(o, "server_id");
                int u3 = kne.u(o, "time");
                int u4 = kne.u(o, "update_time");
                int u5 = kne.u(o, "sender");
                int u6 = kne.u(o, "cid");
                int u7 = kne.u(o, "text");
                int u8 = kne.u(o, "delivery_status");
                int u9 = kne.u(o, "status");
                int u10 = kne.u(o, "time_local");
                int u11 = kne.u(o, str32);
                int u12 = kne.u(o, str34);
                int u13 = kne.u(o, str33);
                d7d = a2;
                try {
                    int u14 = kne.u(o, str29);
                    int u15 = kne.u(o, str28);
                    int u16 = kne.u(o, str27);
                    int u17 = kne.u(o, str26);
                    int u18 = kne.u(o, str25);
                    int u19 = kne.u(o, str24);
                    int u20 = kne.u(o, str23);
                    int u21 = kne.u(o, str22);
                    int u22 = kne.u(o, str21);
                    int u23 = kne.u(o, str20);
                    int u24 = kne.u(o, str19);
                    int u25 = kne.u(o, str18);
                    int u26 = kne.u(o, str17);
                    int u27 = kne.u(o, str16);
                    int u28 = kne.u(o, str15);
                    int u29 = kne.u(o, str14);
                    int u30 = kne.u(o, str13);
                    int u31 = kne.u(o, str12);
                    int u32 = kne.u(o, str11);
                    int u33 = kne.u(o, str10);
                    int u34 = kne.u(o, str9);
                    int u35 = kne.u(o, str8);
                    int u36 = kne.u(o, str7);
                    int i16 = u13;
                    ArrayList arrayList2 = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        long j3 = o.getLong(u);
                        long j4 = o.getLong(u2);
                        long j5 = o.getLong(u3);
                        long j6 = o.getLong(u4);
                        long j7 = o.getLong(u5);
                        long j8 = o.getLong(u6);
                        String string = o.isNull(u7) ? null : o.getString(u7);
                        int i17 = o.getInt(u8);
                        d2.a().getClass();
                        oa9.b.getClass();
                        oa9 n = cd4.n(i17);
                        int i18 = o.getInt(u9);
                        d2.a().getClass();
                        qe9.b.getClass();
                        qe9 D = sq6.D(i18);
                        long j9 = o.getLong(u10);
                        String string2 = o.isNull(u11) ? null : o.getString(u11);
                        if (o.isNull(u12)) {
                            i2 = i16;
                            str = null;
                        } else {
                            str = o.getString(u12);
                            i2 = i16;
                        }
                        byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                        d2.a().getClass();
                        w28 b2 = qe8.b(blob);
                        int i19 = u;
                        int i20 = u14;
                        int i21 = o.getInt(i20);
                        u14 = i20;
                        int i22 = u15;
                        int i23 = o.getInt(i22);
                        u15 = i22;
                        int i24 = u16;
                        boolean z3 = i23 != 0;
                        int i25 = o.getInt(i24);
                        u16 = i24;
                        int i26 = u17;
                        long j10 = o.getLong(i26);
                        u17 = i26;
                        int i27 = u18;
                        if (o.getInt(i27) != 0) {
                            u18 = i27;
                            i3 = u19;
                            z = true;
                        } else {
                            u18 = i27;
                            i3 = u19;
                            z = false;
                        }
                        long j11 = o.getLong(i3);
                        u19 = i3;
                        int i28 = u20;
                        if (o.isNull(i28)) {
                            u20 = i28;
                            i4 = u21;
                            str2 = null;
                        } else {
                            str2 = o.getString(i28);
                            u20 = i28;
                            i4 = u21;
                        }
                        if (o.isNull(i4)) {
                            u21 = i4;
                            i5 = u22;
                            str3 = null;
                        } else {
                            str3 = o.getString(i4);
                            u21 = i4;
                            i5 = u22;
                        }
                        long j12 = o.getLong(i5);
                        u22 = i5;
                        int i29 = u23;
                        long j13 = o.getLong(i29);
                        u23 = i29;
                        int i30 = u24;
                        int i31 = o.getInt(i30);
                        d2.a().getClass();
                        int c2 = wj6.c(i31);
                        u24 = i30;
                        int i32 = u25;
                        long j14 = o.getLong(i32);
                        u25 = i32;
                        int i33 = u26;
                        int i34 = o.getInt(i33);
                        u26 = i33;
                        int i35 = u27;
                        int i36 = o.getInt(i35);
                        u27 = i35;
                        int i37 = u28;
                        int i38 = o.getInt(i37);
                        u28 = i37;
                        int i39 = u29;
                        long j15 = o.getLong(i39);
                        u29 = i39;
                        int i40 = u30;
                        int i41 = o.getInt(i40);
                        u30 = i40;
                        int i42 = u31;
                        int i43 = o.getInt(i42);
                        u31 = i42;
                        int i44 = u32;
                        long j16 = o.getLong(i44);
                        u32 = i44;
                        int i45 = u33;
                        byte[] blob2 = o.isNull(i45) ? null : o.getBlob(i45);
                        d2.a().getClass();
                        List a3 = hp9.a(blob2);
                        u33 = i45;
                        int i46 = u34;
                        if (o.isNull(i46)) {
                            i6 = i46;
                            i7 = i2;
                            bArr = null;
                        } else {
                            i6 = i46;
                            bArr = o.getBlob(i46);
                            i7 = i2;
                        }
                        xd9 b3 = d2.a().b(bArr);
                        int i47 = u35;
                        if (o.isNull(i47)) {
                            i8 = u36;
                            l = null;
                        } else {
                            l = Long.valueOf(o.getLong(i47));
                            i8 = u36;
                        }
                        Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                        if (valueOf == null) {
                            u35 = i47;
                            bool = null;
                        } else {
                            u35 = i47;
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        arrayList2.add(new ya9(j3, j4, j5, j6, j7, j8, string, n, D, j9, string2, str, b2, i21, z3, i25, j10, z, j11, str2, str3, j12, j13, c2, j14, i34, i36, i38, j15, i41, i43, j16, a3, b3, l, bool));
                        u36 = i8;
                        u = i19;
                        i16 = i7;
                        u34 = i6;
                    }
                    o.close();
                    d7d.o();
                    arrayList = arrayList2;
                } catch (Throwable th) {
                    th = th;
                    o.close();
                    d7d.o();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                d7d = a2;
                o.close();
                d7d.o();
                throw th;
            }
        } else if (ordinal == 1) {
            aj9 d3 = z6d2.d();
            d3.getClass();
            z6d = z6d2;
            String str35 = "error";
            d7d a4 = d7d.a(2, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
            a4.k(1, j2);
            a4.k(2, (long) -1);
            i6d i6d2 = d3.a;
            i6d2.b();
            Cursor o2 = i6d2.o(a4, (CancellationSignal) null);
            try {
                int u37 = kne.u(o2, "id");
                int u38 = kne.u(o2, "server_id");
                int u39 = kne.u(o2, "time");
                int u40 = kne.u(o2, "update_time");
                int u41 = kne.u(o2, "sender");
                int u42 = kne.u(o2, "cid");
                int u43 = kne.u(o2, "text");
                int u44 = kne.u(o2, "delivery_status");
                int u45 = kne.u(o2, "status");
                int u46 = kne.u(o2, "time_local");
                int u47 = kne.u(o2, str35);
                int u48 = kne.u(o2, str31);
                int u49 = kne.u(o2, str30);
                d7d2 = a4;
                try {
                    int u50 = kne.u(o2, str29);
                    int u51 = kne.u(o2, str28);
                    int u52 = kne.u(o2, str27);
                    int u53 = kne.u(o2, str26);
                    int u54 = kne.u(o2, str25);
                    int u55 = kne.u(o2, str24);
                    int u56 = kne.u(o2, str23);
                    int u57 = kne.u(o2, str22);
                    int u58 = kne.u(o2, str21);
                    int u59 = kne.u(o2, str20);
                    int u60 = kne.u(o2, str19);
                    int u61 = kne.u(o2, str18);
                    int u62 = kne.u(o2, str17);
                    int u63 = kne.u(o2, str16);
                    int u64 = kne.u(o2, str15);
                    int u65 = kne.u(o2, str14);
                    int u66 = kne.u(o2, str13);
                    int u67 = kne.u(o2, str12);
                    int u68 = kne.u(o2, str11);
                    int u69 = kne.u(o2, str10);
                    int u70 = kne.u(o2, str9);
                    int u71 = kne.u(o2, str8);
                    int u72 = kne.u(o2, str7);
                    int i48 = u49;
                    arrayList = new ArrayList<>(o2.getCount());
                    while (o2.moveToNext()) {
                        long j17 = o2.getLong(u37);
                        long j18 = o2.getLong(u38);
                        long j19 = o2.getLong(u39);
                        long j20 = o2.getLong(u40);
                        long j21 = o2.getLong(u41);
                        long j22 = o2.getLong(u42);
                        String string3 = o2.isNull(u43) ? null : o2.getString(u43);
                        int i49 = o2.getInt(u44);
                        d3.a().getClass();
                        oa9.b.getClass();
                        oa9 n2 = cd4.n(i49);
                        int i50 = o2.getInt(u45);
                        d3.a().getClass();
                        qe9.b.getClass();
                        qe9 D2 = sq6.D(i50);
                        long j23 = o2.getLong(u46);
                        String string4 = o2.isNull(u47) ? null : o2.getString(u47);
                        if (o2.isNull(u48)) {
                            i9 = i48;
                            str4 = null;
                        } else {
                            str4 = o2.getString(u48);
                            i9 = i48;
                        }
                        byte[] blob3 = o2.isNull(i9) ? null : o2.getBlob(i9);
                        d3.a().getClass();
                        w28 b4 = qe8.b(blob3);
                        int i51 = u37;
                        int i52 = u50;
                        int i53 = o2.getInt(i52);
                        u50 = i52;
                        int i54 = u51;
                        int i55 = o2.getInt(i54);
                        u51 = i54;
                        int i56 = u52;
                        boolean z4 = i55 != 0;
                        int i57 = o2.getInt(i56);
                        u52 = i56;
                        int i58 = u53;
                        long j24 = o2.getLong(i58);
                        u53 = i58;
                        int i59 = u54;
                        if (o2.getInt(i59) != 0) {
                            u54 = i59;
                            i10 = u55;
                            z2 = true;
                        } else {
                            u54 = i59;
                            i10 = u55;
                            z2 = false;
                        }
                        long j25 = o2.getLong(i10);
                        u55 = i10;
                        int i60 = u56;
                        if (o2.isNull(i60)) {
                            u56 = i60;
                            i11 = u57;
                            str5 = null;
                        } else {
                            str5 = o2.getString(i60);
                            u56 = i60;
                            i11 = u57;
                        }
                        if (o2.isNull(i11)) {
                            u57 = i11;
                            i12 = u58;
                            str6 = null;
                        } else {
                            str6 = o2.getString(i11);
                            u57 = i11;
                            i12 = u58;
                        }
                        long j26 = o2.getLong(i12);
                        u58 = i12;
                        int i61 = u59;
                        long j27 = o2.getLong(i61);
                        u59 = i61;
                        int i62 = u60;
                        int i63 = o2.getInt(i62);
                        d3.a().getClass();
                        int c3 = wj6.c(i63);
                        u60 = i62;
                        int i64 = u61;
                        long j28 = o2.getLong(i64);
                        u61 = i64;
                        int i65 = u62;
                        int i66 = o2.getInt(i65);
                        u62 = i65;
                        int i67 = u63;
                        int i68 = o2.getInt(i67);
                        u63 = i67;
                        int i69 = u64;
                        int i70 = o2.getInt(i69);
                        u64 = i69;
                        int i71 = u65;
                        long j29 = o2.getLong(i71);
                        u65 = i71;
                        int i72 = u66;
                        int i73 = o2.getInt(i72);
                        u66 = i72;
                        int i74 = u67;
                        int i75 = o2.getInt(i74);
                        u67 = i74;
                        int i76 = u68;
                        long j30 = o2.getLong(i76);
                        u68 = i76;
                        int i77 = u69;
                        byte[] blob4 = o2.isNull(i77) ? null : o2.getBlob(i77);
                        d3.a().getClass();
                        List a5 = hp9.a(blob4);
                        u69 = i77;
                        int i78 = u70;
                        if (o2.isNull(i78)) {
                            i13 = i78;
                            i14 = u38;
                            bArr2 = null;
                        } else {
                            i13 = i78;
                            bArr2 = o2.getBlob(i78);
                            i14 = u38;
                        }
                        xd9 b5 = d3.a().b(bArr2);
                        int i79 = u71;
                        if (o2.isNull(i79)) {
                            i15 = u72;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(o2.getLong(i79));
                            i15 = u72;
                        }
                        Integer valueOf2 = o2.isNull(i15) ? null : Integer.valueOf(o2.getInt(i15));
                        if (valueOf2 == null) {
                            u71 = i79;
                            bool2 = null;
                        } else {
                            u71 = i79;
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        }
                        arrayList.add(new ya9(j17, j18, j19, j20, j21, j22, string3, n2, D2, j23, string4, str4, b4, i53, z4, i57, j24, z2, j25, str5, str6, j26, j27, c3, j28, i66, i68, i70, j29, i73, i75, j30, a5, b5, l2, bool2));
                        u72 = i15;
                        u38 = i14;
                        u37 = i51;
                        u70 = i13;
                        i48 = i9;
                    }
                    o2.close();
                    d7d2.o();
                } catch (Throwable th3) {
                    th = th3;
                    o2.close();
                    d7d2.o();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                d7d2 = a4;
                o2.close();
                d7d2.o();
                throw th;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (ya9 b6 : arrayList) {
            arrayList3.add(z6d.b(b6));
        }
        return arrayList3;
    }

    public final ha9 k(long j, long j2) {
        z6d z6d = ((a74) this.a).c;
        ya9 b2 = z6d.d().b(j, j2);
        if (b2 != null) {
            return z6d.b(b2);
        }
        return null;
    }

    public final ArrayList l(long j, Collection collection) {
        d7d d7d;
        String str;
        int i2;
        boolean z;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        z6d z6d = ((a74) this.a).c;
        aj9 d2 = z6d.d();
        List<Long> list = CollectionsKt.toList(collection);
        d2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM messages WHERE chat_id = ? AND server_id in (");
        int size = list.size();
        n79.c(sb, size);
        sb.append(")");
        d7d a2 = d7d.a(size + 1, sb.toString());
        a2.k(1, j);
        int i9 = 2;
        for (Long l2 : list) {
            if (l2 == null) {
                a2.X(i9);
            } else {
                a2.k(i9, l2.longValue());
            }
            i9++;
        }
        i6d i6d = d2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "server_id");
            int u3 = kne.u(o, "time");
            int u4 = kne.u(o, "update_time");
            int u5 = kne.u(o, "sender");
            int u6 = kne.u(o, "cid");
            int u7 = kne.u(o, "text");
            int u8 = kne.u(o, "delivery_status");
            int u9 = kne.u(o, "status");
            int u10 = kne.u(o, "time_local");
            int u11 = kne.u(o, "error");
            int u12 = kne.u(o, "localized_error");
            z6d z6d2 = z6d;
            int u13 = kne.u(o, "attaches");
            d7d = a2;
            try {
                int u14 = kne.u(o, "media_type");
                int u15 = kne.u(o, "detect_share");
                int u16 = kne.u(o, "msg_link_type");
                int u17 = kne.u(o, "msg_link_id");
                int u18 = kne.u(o, "inserted_from_msg_link");
                int u19 = kne.u(o, "msg_link_chat_id");
                int u20 = kne.u(o, "msg_link_chat_name");
                int u21 = kne.u(o, "msg_link_chat_link");
                int u22 = kne.u(o, "msg_link_out_chat_id");
                int u23 = kne.u(o, "msg_link_out_msg_id");
                int u24 = kne.u(o, "type");
                int u25 = kne.u(o, "chat_id");
                int u26 = kne.u(o, "ttl");
                int u27 = kne.u(o, "channel_views");
                int u28 = kne.u(o, "channel_forwards");
                int u29 = kne.u(o, "view_time");
                int u30 = kne.u(o, "zoom");
                int u31 = kne.u(o, "options");
                int u32 = kne.u(o, "live_until");
                int u33 = kne.u(o, "elements");
                int u34 = kne.u(o, "reactions");
                int u35 = kne.u(o, "delayed_attrs_time_to_fire");
                int u36 = kne.u(o, "delayed_attrs_notify_sender");
                int i10 = u13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j2 = o.getLong(u);
                    long j3 = o.getLong(u2);
                    long j4 = o.getLong(u3);
                    long j5 = o.getLong(u4);
                    long j6 = o.getLong(u5);
                    long j7 = o.getLong(u6);
                    String string = o.isNull(u7) ? null : o.getString(u7);
                    int i11 = o.getInt(u8);
                    d2.a().getClass();
                    oa9.b.getClass();
                    oa9 n = cd4.n(i11);
                    int i12 = o.getInt(u9);
                    d2.a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i12);
                    long j8 = o.getLong(u10);
                    String string2 = o.isNull(u11) ? null : o.getString(u11);
                    if (o.isNull(u12)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(u12);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    w28 b2 = qe8.b(blob);
                    i10 = i2;
                    int i13 = u14;
                    int i14 = o.getInt(i13);
                    u14 = i13;
                    int i15 = u15;
                    int i16 = o.getInt(i15);
                    boolean z2 = false;
                    u15 = i15;
                    int i17 = u16;
                    boolean z3 = i16 != 0;
                    int i18 = o.getInt(i17);
                    int i19 = i17;
                    int i20 = u17;
                    long j9 = o.getLong(i20);
                    u17 = i20;
                    int i21 = u18;
                    if (o.getInt(i21) != 0) {
                        u18 = i21;
                        i3 = u19;
                        z = true;
                    } else {
                        u18 = i21;
                        i3 = u19;
                        z = false;
                    }
                    long j10 = o.getLong(i3);
                    u19 = i3;
                    int i22 = u20;
                    if (o.isNull(i22)) {
                        u20 = i22;
                        i4 = u21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i22);
                        u20 = i22;
                        i4 = u21;
                    }
                    if (o.isNull(i4)) {
                        u21 = i4;
                        i5 = u22;
                        str3 = null;
                    } else {
                        str3 = o.getString(i4);
                        u21 = i4;
                        i5 = u22;
                    }
                    long j11 = o.getLong(i5);
                    u22 = i5;
                    int i23 = u23;
                    long j12 = o.getLong(i23);
                    u23 = i23;
                    int i24 = u24;
                    int i25 = o.getInt(i24);
                    d2.a().getClass();
                    int c2 = wj6.c(i25);
                    u24 = i24;
                    int i26 = u25;
                    long j13 = o.getLong(i26);
                    u25 = i26;
                    int i27 = u26;
                    int i28 = o.getInt(i27);
                    u26 = i27;
                    int i29 = u27;
                    int i30 = o.getInt(i29);
                    u27 = i29;
                    int i31 = u28;
                    int i32 = o.getInt(i31);
                    u28 = i31;
                    int i33 = u29;
                    long j14 = o.getLong(i33);
                    u29 = i33;
                    int i34 = u30;
                    int i35 = o.getInt(i34);
                    u30 = i34;
                    int i36 = u31;
                    int i37 = o.getInt(i36);
                    u31 = i36;
                    int i38 = u32;
                    long j15 = o.getLong(i38);
                    u32 = i38;
                    int i39 = u33;
                    byte[] blob2 = o.isNull(i39) ? null : o.getBlob(i39);
                    d2.a().getClass();
                    List a3 = hp9.a(blob2);
                    u33 = i39;
                    int i40 = u34;
                    if (o.isNull(i40)) {
                        i6 = i40;
                        i7 = u11;
                        bArr = null;
                    } else {
                        i6 = i40;
                        bArr = o.getBlob(i40);
                        i7 = u11;
                    }
                    xd9 b3 = d2.a().b(bArr);
                    int i41 = u35;
                    if (o.isNull(i41)) {
                        i8 = u36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i41));
                        i8 = u36;
                    }
                    Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                    if (valueOf == null) {
                        u35 = i41;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        u35 = i41;
                    }
                    arrayList.add(new ya9(j2, j3, j4, j5, j6, j7, string, n, D, j8, string2, str, b2, i14, z3, i18, j9, z, j10, str2, str3, j11, j12, c2, j13, i28, i30, i32, j14, i35, i37, j15, a3, b3, l, bool));
                    u36 = i8;
                    u11 = i7;
                    u16 = i19;
                    u34 = i6;
                }
                o.close();
                d7d.o();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(z6d2.b((ya9) it.next()));
                }
                return arrayList2;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [qae, ts] */
    public final ts m(ArrayList arrayList) {
        z6d z6d = ((a74) this.a).c;
        z6d.getClass();
        Sequence map = SequencesKt.map(SequencesKt.flattenSequenceOfIterable(SequencesKt.map(SequencesKt___SequencesKt.chunked(CollectionsKt.asSequence(arrayList), 200), new q6d(z6d, 0))), new q6d(z6d, 1));
        ? qae = new qae(0);
        for (Object next : map) {
            qae.put(Long.valueOf(((ha9) next).b), next);
        }
        return qae;
    }

    public final ArrayList n(long j, long j2) {
        d7d d7d;
        String str;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        Long l;
        int i7;
        Boolean bool;
        gb9 gb9 = (gb9) this.g.get();
        z6d z6d = ((a74) this.a).c;
        aj9 d2 = z6d.d();
        Set<Integer> of = SetsKt.setOf(8);
        sq6 sq6 = qe9.b;
        d2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM messages WHERE media_type in (");
        int size = of.size();
        n79.c(sb, size);
        sb.append(") AND time >= ");
        sb.append("?");
        sb.append(" AND time <= ");
        sb.append("?");
        sb.append(" AND inserted_from_msg_link = 0 AND status <> ");
        sb.append("?");
        sb.append(" ORDER BY time DESC LIMIT ");
        sb.append("?");
        int i8 = size + 4;
        d7d a2 = d7d.a(i8, sb.toString());
        int i9 = 1;
        for (Integer num : of) {
            if (num == null) {
                a2.X(i9);
            } else {
                a2.k(i9, (long) num.intValue());
            }
            i9++;
        }
        a2.k(size + 1, j);
        a2.k(size + 2, j2);
        d2.a().getClass();
        a2.k(size + 3, (long) 10);
        a2.k(i8, (long) 100);
        i6d i6d = d2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "server_id");
            int u3 = kne.u(o, "time");
            int u4 = kne.u(o, "update_time");
            int u5 = kne.u(o, "sender");
            int u6 = kne.u(o, "cid");
            int u7 = kne.u(o, "text");
            int u8 = kne.u(o, "delivery_status");
            int u9 = kne.u(o, "status");
            int u10 = kne.u(o, "time_local");
            int u11 = kne.u(o, "error");
            gb9 gb92 = gb9;
            int u12 = kne.u(o, "localized_error");
            z6d z6d2 = z6d;
            int u13 = kne.u(o, "attaches");
            d7d = a2;
            try {
                int u14 = kne.u(o, "media_type");
                int u15 = kne.u(o, "detect_share");
                int u16 = kne.u(o, "msg_link_type");
                int u17 = kne.u(o, "msg_link_id");
                int u18 = kne.u(o, "inserted_from_msg_link");
                int u19 = kne.u(o, "msg_link_chat_id");
                int u20 = kne.u(o, "msg_link_chat_name");
                int u21 = kne.u(o, "msg_link_chat_link");
                int u22 = kne.u(o, "msg_link_out_chat_id");
                int u23 = kne.u(o, "msg_link_out_msg_id");
                int u24 = kne.u(o, "type");
                int u25 = kne.u(o, "chat_id");
                int u26 = kne.u(o, "ttl");
                int u27 = kne.u(o, "channel_views");
                int u28 = kne.u(o, "channel_forwards");
                int u29 = kne.u(o, "view_time");
                int u30 = kne.u(o, "zoom");
                int u31 = kne.u(o, "options");
                int u32 = kne.u(o, "live_until");
                int u33 = kne.u(o, "elements");
                int u34 = kne.u(o, "reactions");
                int u35 = kne.u(o, "delayed_attrs_time_to_fire");
                int u36 = kne.u(o, "delayed_attrs_notify_sender");
                int i10 = u13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j3 = o.getLong(u);
                    long j4 = o.getLong(u2);
                    long j5 = o.getLong(u3);
                    long j6 = o.getLong(u4);
                    long j7 = o.getLong(u5);
                    long j8 = o.getLong(u6);
                    String string = o.isNull(u7) ? null : o.getString(u7);
                    int i11 = o.getInt(u8);
                    d2.a().getClass();
                    oa9.b.getClass();
                    oa9 n = cd4.n(i11);
                    int i12 = o.getInt(u9);
                    d2.a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i12);
                    long j9 = o.getLong(u10);
                    String string2 = o.isNull(u11) ? null : o.getString(u11);
                    if (o.isNull(u12)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(u12);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    w28 b2 = qe8.b(blob);
                    i10 = i2;
                    int i13 = u14;
                    int i14 = o.getInt(i13);
                    u14 = i13;
                    int i15 = u15;
                    boolean z = false;
                    u15 = i15;
                    boolean z2 = o.getInt(i15) != 0;
                    int i16 = u16;
                    int i17 = o.getInt(i16);
                    u16 = i16;
                    int i18 = u17;
                    long j10 = o.getLong(i18);
                    u17 = i18;
                    int i19 = u18;
                    boolean z3 = o.getInt(i19) != 0;
                    int i20 = u19;
                    int i21 = i19;
                    int i22 = i20;
                    long j11 = o.getLong(i22);
                    int i23 = i22;
                    int i24 = u20;
                    if (o.isNull(i24)) {
                        u20 = i24;
                        i3 = u21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i24);
                        u20 = i24;
                        i3 = u21;
                    }
                    if (o.isNull(i3)) {
                        u21 = i3;
                        i4 = u22;
                        str3 = null;
                    } else {
                        str3 = o.getString(i3);
                        u21 = i3;
                        i4 = u22;
                    }
                    long j12 = o.getLong(i4);
                    u22 = i4;
                    int i25 = u23;
                    long j13 = o.getLong(i25);
                    u23 = i25;
                    int i26 = u24;
                    int i27 = o.getInt(i26);
                    d2.a().getClass();
                    int c2 = wj6.c(i27);
                    u24 = i26;
                    int i28 = u25;
                    long j14 = o.getLong(i28);
                    u25 = i28;
                    int i29 = u26;
                    int i30 = o.getInt(i29);
                    u26 = i29;
                    int i31 = u27;
                    int i32 = o.getInt(i31);
                    u27 = i31;
                    int i33 = u28;
                    int i34 = o.getInt(i33);
                    u28 = i33;
                    int i35 = u29;
                    long j15 = o.getLong(i35);
                    u29 = i35;
                    int i36 = u30;
                    int i37 = o.getInt(i36);
                    u30 = i36;
                    int i38 = u31;
                    int i39 = o.getInt(i38);
                    u31 = i38;
                    int i40 = u32;
                    long j16 = o.getLong(i40);
                    u32 = i40;
                    int i41 = u33;
                    byte[] blob2 = o.isNull(i41) ? null : o.getBlob(i41);
                    d2.a().getClass();
                    List a3 = hp9.a(blob2);
                    u33 = i41;
                    int i42 = u34;
                    if (o.isNull(i42)) {
                        i5 = i42;
                        i6 = u10;
                        bArr = null;
                    } else {
                        i5 = i42;
                        bArr = o.getBlob(i42);
                        i6 = u10;
                    }
                    xd9 b3 = d2.a().b(bArr);
                    int i43 = u35;
                    if (o.isNull(i43)) {
                        i7 = u36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i43));
                        i7 = u36;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        u35 = i43;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                        u35 = i43;
                    }
                    arrayList.add(new ya9(j3, j4, j5, j6, j7, j8, string, n, D, j9, string2, str, b2, i14, z2, i17, j10, z3, j11, str2, str3, j12, j13, c2, j14, i30, i32, i34, j15, i37, i39, j16, a3, b3, l, bool));
                    u36 = i7;
                    u18 = i21;
                    u10 = i6;
                    u19 = i23;
                    u34 = i5;
                }
                o.close();
                d7d.o();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(z6d2.b((ya9) it.next()));
                }
                return gb92.b(arrayList2);
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    public final ArrayList o(long j, long j2, long j3, boolean z, bl4 bl4) {
        z6d z6d;
        ArrayList<ya9> arrayList;
        d7d d7d;
        String str;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        Long l;
        int i7;
        Boolean bool;
        aj9 aj9;
        d7d d7d2;
        String str4;
        int i8;
        String str5;
        int i9;
        String str6;
        int i10;
        int i11;
        int i12;
        byte[] bArr2;
        Long l2;
        int i13;
        Boolean bool2;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z2 = z;
        StringBuilder n = tr1.n(j4, "selectFromTo chatId = ", "; timeFrom = ");
        n.append(j5);
        tr1.v(n, "; timeTo = ", j6, "; backwards = ");
        n.append(z2);
        z68.c("fa9", n.toString(), new Object[0]);
        z6d z6d2 = ((a74) this.a).c;
        z6d2.getClass();
        int ordinal = bl4.ordinal();
        if (ordinal == 0) {
            z6d = z6d2;
            arrayList = z6d.d().d(j, j2, z, j3);
        } else if (ordinal == 1) {
            aj9 d2 = z6d2.d();
            i6d i6d = d2.a;
            z6d = z6d2;
            String str7 = "delayed_attrs_notify_sender";
            String str8 = "delayed_attrs_time_to_fire";
            String str9 = "reactions";
            String str10 = "elements";
            String str11 = "live_until";
            String str12 = "options";
            String str13 = "zoom";
            String str14 = "view_time";
            String str15 = "channel_forwards";
            String str16 = "channel_views";
            String str17 = "ttl";
            String str18 = "chat_id";
            String str19 = "type";
            String str20 = "msg_link_out_msg_id";
            String str21 = "msg_link_out_chat_id";
            String str22 = "msg_link_chat_link";
            String str23 = "msg_link_chat_name";
            String str24 = "msg_link_chat_id";
            String str25 = "inserted_from_msg_link";
            String str26 = "msg_link_id";
            String str27 = "msg_link_type";
            String str28 = "detect_share";
            String str29 = "media_type";
            String str30 = "attaches";
            String str31 = "localized_error";
            String str32 = "error";
            String str33 = "time_local";
            String str34 = "status";
            String str35 = "delivery_status";
            String str36 = "text";
            if (z2) {
                sq6 sq6 = qe9.b;
                String str37 = "cid";
                d7d a2 = d7d.a(5, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?");
                a2.k(1, j4);
                a2.k(2, j5);
                i2a.o(a2, 3, j6, d2);
                a2.k(4, (long) 10);
                a2.k(5, (long) 40);
                i6d.b();
                Cursor o = i6d.o(a2, (CancellationSignal) null);
                try {
                    int u = kne.u(o, "id");
                    int u2 = kne.u(o, "server_id");
                    int u3 = kne.u(o, "time");
                    int u4 = kne.u(o, "update_time");
                    int u5 = kne.u(o, "sender");
                    int u6 = kne.u(o, str37);
                    int u7 = kne.u(o, str36);
                    int u8 = kne.u(o, str35);
                    int u9 = kne.u(o, str34);
                    int u10 = kne.u(o, str33);
                    int u11 = kne.u(o, str32);
                    int u12 = kne.u(o, str31);
                    int u13 = kne.u(o, str30);
                    d7d2 = a2;
                    try {
                        int u14 = kne.u(o, str29);
                        int u15 = kne.u(o, str28);
                        int u16 = kne.u(o, str27);
                        int u17 = kne.u(o, str26);
                        int u18 = kne.u(o, str25);
                        int u19 = kne.u(o, str24);
                        int u20 = kne.u(o, str23);
                        int u21 = kne.u(o, str22);
                        int u22 = kne.u(o, str21);
                        int u23 = kne.u(o, str20);
                        int u24 = kne.u(o, str19);
                        int u25 = kne.u(o, str18);
                        int u26 = kne.u(o, str17);
                        int u27 = kne.u(o, str16);
                        int u28 = kne.u(o, str15);
                        int u29 = kne.u(o, str14);
                        int u30 = kne.u(o, str13);
                        int u31 = kne.u(o, str12);
                        int u32 = kne.u(o, str11);
                        int u33 = kne.u(o, str10);
                        int u34 = kne.u(o, str9);
                        int u35 = kne.u(o, str8);
                        int u36 = kne.u(o, str7);
                        int i14 = u13;
                        arrayList = new ArrayList<>(o.getCount());
                        while (o.moveToNext()) {
                            long j7 = o.getLong(u);
                            long j8 = o.getLong(u2);
                            long j9 = o.getLong(u3);
                            long j10 = o.getLong(u4);
                            long j11 = o.getLong(u5);
                            long j12 = o.getLong(u6);
                            String string = o.isNull(u7) ? null : o.getString(u7);
                            int i15 = o.getInt(u8);
                            d2.a().getClass();
                            oa9.b.getClass();
                            oa9 n2 = cd4.n(i15);
                            int i16 = o.getInt(u9);
                            d2.a().getClass();
                            qe9.b.getClass();
                            qe9 D = sq6.D(i16);
                            long j13 = o.getLong(u10);
                            String string2 = o.isNull(u11) ? null : o.getString(u11);
                            if (o.isNull(u12)) {
                                i8 = i14;
                                str4 = null;
                            } else {
                                str4 = o.getString(u12);
                                i8 = i14;
                            }
                            byte[] blob = o.isNull(i8) ? null : o.getBlob(i8);
                            d2.a().getClass();
                            w28 b2 = qe8.b(blob);
                            int i17 = u;
                            int i18 = u14;
                            int i19 = o.getInt(i18);
                            u14 = i18;
                            int i20 = u15;
                            u15 = i20;
                            boolean z3 = o.getInt(i20) != 0;
                            int i21 = u16;
                            int i22 = o.getInt(i21);
                            u16 = i21;
                            int i23 = u17;
                            long j14 = o.getLong(i23);
                            u17 = i23;
                            int i24 = u18;
                            u18 = i24;
                            boolean z4 = o.getInt(i24) != 0;
                            int i25 = u19;
                            long j15 = o.getLong(i25);
                            u19 = i25;
                            int i26 = u20;
                            if (o.isNull(i26)) {
                                u20 = i26;
                                i9 = u21;
                                str5 = null;
                            } else {
                                str5 = o.getString(i26);
                                u20 = i26;
                                i9 = u21;
                            }
                            if (o.isNull(i9)) {
                                u21 = i9;
                                i10 = u22;
                                str6 = null;
                            } else {
                                str6 = o.getString(i9);
                                u21 = i9;
                                i10 = u22;
                            }
                            long j16 = o.getLong(i10);
                            u22 = i10;
                            int i27 = u23;
                            long j17 = o.getLong(i27);
                            u23 = i27;
                            int i28 = u24;
                            int i29 = o.getInt(i28);
                            d2.a().getClass();
                            int c2 = wj6.c(i29);
                            u24 = i28;
                            int i30 = u25;
                            long j18 = o.getLong(i30);
                            u25 = i30;
                            int i31 = u26;
                            int i32 = o.getInt(i31);
                            u26 = i31;
                            int i33 = u27;
                            int i34 = o.getInt(i33);
                            u27 = i33;
                            int i35 = u28;
                            int i36 = o.getInt(i35);
                            u28 = i35;
                            int i37 = u29;
                            long j19 = o.getLong(i37);
                            u29 = i37;
                            int i38 = u30;
                            int i39 = o.getInt(i38);
                            u30 = i38;
                            int i40 = u31;
                            int i41 = o.getInt(i40);
                            u31 = i40;
                            int i42 = u32;
                            long j20 = o.getLong(i42);
                            u32 = i42;
                            int i43 = u33;
                            byte[] blob2 = o.isNull(i43) ? null : o.getBlob(i43);
                            d2.a().getClass();
                            List a3 = hp9.a(blob2);
                            u33 = i43;
                            int i44 = u34;
                            if (o.isNull(i44)) {
                                i11 = i44;
                                i12 = u2;
                                bArr2 = null;
                            } else {
                                i11 = i44;
                                bArr2 = o.getBlob(i44);
                                i12 = u2;
                            }
                            xd9 b3 = d2.a().b(bArr2);
                            int i45 = u35;
                            if (o.isNull(i45)) {
                                i13 = u36;
                                l2 = null;
                            } else {
                                l2 = Long.valueOf(o.getLong(i45));
                                i13 = u36;
                            }
                            Integer valueOf = o.isNull(i13) ? null : Integer.valueOf(o.getInt(i13));
                            if (valueOf == null) {
                                u35 = i45;
                                bool2 = null;
                            } else {
                                u35 = i45;
                                bool2 = Boolean.valueOf(valueOf.intValue() != 0);
                            }
                            arrayList.add(new ya9(j7, j8, j9, j10, j11, j12, string, n2, D, j13, string2, str4, b2, i19, z3, i22, j14, z4, j15, str5, str6, j16, j17, c2, j18, i32, i34, i36, j19, i39, i41, j20, a3, b3, l2, bool2));
                            u36 = i13;
                            u2 = i12;
                            u = i17;
                            u34 = i11;
                            i14 = i8;
                        }
                        o.close();
                        d7d2.o();
                    } catch (Throwable th) {
                        th = th;
                        o.close();
                        d7d2.o();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    d7d2 = a2;
                    o.close();
                    d7d2.o();
                    throw th;
                }
            } else {
                String str38 = "cid";
                String str39 = str7;
                String str40 = str8;
                String str41 = str9;
                String str42 = str10;
                String str43 = str11;
                String str44 = str12;
                String str45 = str13;
                String str46 = str14;
                String str47 = str15;
                String str48 = str16;
                String str49 = str17;
                String str50 = str18;
                String str51 = str19;
                String str52 = str20;
                String str53 = str21;
                String str54 = str22;
                String str55 = str23;
                String str56 = str24;
                String str57 = str25;
                String str58 = str26;
                String str59 = str27;
                String str60 = str28;
                String str61 = str29;
                String str62 = str30;
                String str63 = str31;
                String str64 = str32;
                String str65 = str33;
                String str66 = str34;
                String str67 = str35;
                String str68 = str36;
                sq6 sq62 = qe9.b;
                String str69 = str39;
                d7d a4 = d7d.a(5, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
                a4.k(1, j4);
                a4.k(2, j5);
                i2a.o(a4, 3, j6, d2);
                a4.k(4, (long) 10);
                a4.k(5, (long) 40);
                i6d.b();
                Cursor o2 = i6d.o(a4, (CancellationSignal) null);
                try {
                    int u37 = kne.u(o2, "id");
                    int u38 = kne.u(o2, "server_id");
                    int u39 = kne.u(o2, "time");
                    int u40 = kne.u(o2, "update_time");
                    int u41 = kne.u(o2, "sender");
                    int u42 = kne.u(o2, str38);
                    int u43 = kne.u(o2, str68);
                    int u44 = kne.u(o2, str67);
                    int u45 = kne.u(o2, str66);
                    int u46 = kne.u(o2, str65);
                    int u47 = kne.u(o2, str64);
                    int u48 = kne.u(o2, str63);
                    d7d = a4;
                    try {
                        int u49 = kne.u(o2, str62);
                        int u50 = kne.u(o2, str61);
                        int u51 = kne.u(o2, str60);
                        int u52 = kne.u(o2, str59);
                        int u53 = kne.u(o2, str58);
                        int u54 = kne.u(o2, str57);
                        int u55 = kne.u(o2, str56);
                        int u56 = kne.u(o2, str55);
                        int u57 = kne.u(o2, str54);
                        int u58 = kne.u(o2, str53);
                        int u59 = kne.u(o2, str52);
                        int u60 = kne.u(o2, str51);
                        int u61 = kne.u(o2, str50);
                        int u62 = kne.u(o2, str49);
                        int u63 = kne.u(o2, str48);
                        int u64 = kne.u(o2, str47);
                        int u65 = kne.u(o2, str46);
                        int u66 = kne.u(o2, str45);
                        int u67 = kne.u(o2, str44);
                        int u68 = kne.u(o2, str43);
                        int u69 = kne.u(o2, str42);
                        int u70 = kne.u(o2, str41);
                        int u71 = kne.u(o2, str40);
                        int u72 = kne.u(o2, str69);
                        int i46 = u70;
                        ArrayList arrayList2 = new ArrayList(o2.getCount());
                        while (o2.moveToNext()) {
                            long j21 = o2.getLong(u37);
                            long j22 = o2.getLong(u38);
                            long j23 = o2.getLong(u39);
                            long j24 = o2.getLong(u40);
                            long j25 = o2.getLong(u41);
                            long j26 = o2.getLong(u42);
                            String string3 = o2.isNull(u43) ? null : o2.getString(u43);
                            int i47 = o2.getInt(u44);
                            d2.a().getClass();
                            oa9.b.getClass();
                            oa9 n3 = cd4.n(i47);
                            int i48 = o2.getInt(u45);
                            d2.a().getClass();
                            qe9.b.getClass();
                            qe9 D2 = sq6.D(i48);
                            long j27 = o2.getLong(u46);
                            String string4 = o2.isNull(u47) ? null : o2.getString(u47);
                            if (o2.isNull(u48)) {
                                i2 = u49;
                                str = null;
                            } else {
                                str = o2.getString(u48);
                                i2 = u49;
                            }
                            byte[] blob3 = o2.isNull(i2) ? null : o2.getBlob(i2);
                            d2.a().getClass();
                            w28 b4 = qe8.b(blob3);
                            int i49 = u47;
                            int i50 = u50;
                            int i51 = o2.getInt(i50);
                            u50 = i50;
                            int i52 = u51;
                            u51 = i52;
                            boolean z5 = o2.getInt(i52) != 0;
                            int i53 = u52;
                            int i54 = o2.getInt(i53);
                            u52 = i53;
                            int i55 = u53;
                            long j28 = o2.getLong(i55);
                            u53 = i55;
                            int i56 = u54;
                            int i57 = o2.getInt(i56);
                            u54 = i56;
                            int i58 = u55;
                            boolean z6 = i57 != 0;
                            long j29 = o2.getLong(i58);
                            u55 = i58;
                            int i59 = u56;
                            if (o2.isNull(i59)) {
                                u56 = i59;
                                i3 = u57;
                                str2 = null;
                            } else {
                                str2 = o2.getString(i59);
                                u56 = i59;
                                i3 = u57;
                            }
                            if (o2.isNull(i3)) {
                                u57 = i3;
                                i4 = u58;
                                str3 = null;
                            } else {
                                str3 = o2.getString(i3);
                                u57 = i3;
                                i4 = u58;
                            }
                            long j30 = o2.getLong(i4);
                            u58 = i4;
                            int i60 = u59;
                            long j31 = o2.getLong(i60);
                            u59 = i60;
                            int i61 = u60;
                            int i62 = o2.getInt(i61);
                            d2.a().getClass();
                            int c3 = wj6.c(i62);
                            u60 = i61;
                            int i63 = u61;
                            long j32 = o2.getLong(i63);
                            u61 = i63;
                            int i64 = u62;
                            int i65 = o2.getInt(i64);
                            u62 = i64;
                            int i66 = u63;
                            int i67 = o2.getInt(i66);
                            u63 = i66;
                            int i68 = u64;
                            int i69 = o2.getInt(i68);
                            u64 = i68;
                            int i70 = u65;
                            long j33 = o2.getLong(i70);
                            u65 = i70;
                            int i71 = u66;
                            int i72 = o2.getInt(i71);
                            u66 = i71;
                            int i73 = u67;
                            int i74 = o2.getInt(i73);
                            u67 = i73;
                            int i75 = u68;
                            long j34 = o2.getLong(i75);
                            u68 = i75;
                            int i76 = u69;
                            byte[] blob4 = o2.isNull(i76) ? null : o2.getBlob(i76);
                            d2.a().getClass();
                            List a5 = hp9.a(blob4);
                            u69 = i76;
                            int i77 = i46;
                            if (o2.isNull(i77)) {
                                i5 = i77;
                                i6 = u37;
                                bArr = null;
                            } else {
                                i5 = i77;
                                bArr = o2.getBlob(i77);
                                i6 = u37;
                            }
                            xd9 b5 = d2.a().b(bArr);
                            int i78 = u71;
                            if (o2.isNull(i78)) {
                                i7 = u72;
                                l = null;
                            } else {
                                l = Long.valueOf(o2.getLong(i78));
                                i7 = u72;
                            }
                            Integer valueOf2 = o2.isNull(i7) ? null : Integer.valueOf(o2.getInt(i7));
                            if (valueOf2 == null) {
                                aj9 = d2;
                                bool = null;
                            } else {
                                bool = Boolean.valueOf(valueOf2.intValue() != 0);
                                aj9 = d2;
                            }
                            arrayList2.add(new ya9(j21, j22, j23, j24, j25, j26, string3, n3, D2, j27, string4, str, b4, i51, z5, i54, j28, z6, j29, str2, str3, j30, j31, c3, j32, i65, i67, i69, j33, i72, i74, j34, a5, b5, l, bool));
                            u71 = i78;
                            d2 = aj9;
                            u47 = i49;
                            u72 = i7;
                            u49 = i2;
                            u37 = i6;
                            i46 = i5;
                        }
                        o2.close();
                        d7d.o();
                        arrayList = arrayList2;
                    } catch (Throwable th3) {
                        th = th3;
                        o2.close();
                        d7d.o();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    d7d = a4;
                    o2.close();
                    d7d.o();
                    throw th;
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (ya9 b6 : arrayList) {
            arrayList3.add(z6d.b(b6));
        }
        if (z) {
            Collections.reverse(arrayList3);
        }
        return arrayList3;
    }

    public final ha9 p(long j) {
        d7d d7d;
        String str;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l;
        int i9;
        Boolean bool;
        z6d z6d = ((a74) this.a).c;
        aj9 d2 = z6d.d();
        sq6 sq6 = qe9.b;
        d2.getClass();
        d7d a2 = d7d.a(3, "SELECT * FROM messages WHERE chat_id = ? AND server_id > 0 AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC LIMIT ?");
        i2a.o(a2, 1, j, d2);
        a2.k(2, (long) 10);
        a2.k(3, (long) 1);
        i6d i6d = d2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "server_id");
            int u3 = kne.u(o, "time");
            int u4 = kne.u(o, "update_time");
            int u5 = kne.u(o, "sender");
            int u6 = kne.u(o, "cid");
            int u7 = kne.u(o, "text");
            int u8 = kne.u(o, "delivery_status");
            int u9 = kne.u(o, "status");
            int u10 = kne.u(o, "time_local");
            int u11 = kne.u(o, "error");
            int u12 = kne.u(o, "localized_error");
            z6d z6d2 = z6d;
            int u13 = kne.u(o, "attaches");
            d7d = a2;
            try {
                int u14 = kne.u(o, "media_type");
                int u15 = kne.u(o, "detect_share");
                int u16 = kne.u(o, "msg_link_type");
                int u17 = kne.u(o, "msg_link_id");
                int u18 = kne.u(o, "inserted_from_msg_link");
                int u19 = kne.u(o, "msg_link_chat_id");
                int u20 = kne.u(o, "msg_link_chat_name");
                int u21 = kne.u(o, "msg_link_chat_link");
                int u22 = kne.u(o, "msg_link_out_chat_id");
                int u23 = kne.u(o, "msg_link_out_msg_id");
                int u24 = kne.u(o, "type");
                int u25 = kne.u(o, "chat_id");
                int u26 = kne.u(o, "ttl");
                int u27 = kne.u(o, "channel_views");
                int u28 = kne.u(o, "channel_forwards");
                int u29 = kne.u(o, "view_time");
                int u30 = kne.u(o, "zoom");
                int u31 = kne.u(o, "options");
                int u32 = kne.u(o, "live_until");
                int u33 = kne.u(o, "elements");
                int u34 = kne.u(o, "reactions");
                int u35 = kne.u(o, "delayed_attrs_time_to_fire");
                int u36 = kne.u(o, "delayed_attrs_notify_sender");
                int i10 = u13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j2 = o.getLong(u);
                    long j3 = o.getLong(u2);
                    long j4 = o.getLong(u3);
                    long j5 = o.getLong(u4);
                    long j6 = o.getLong(u5);
                    long j7 = o.getLong(u6);
                    String string = o.isNull(u7) ? null : o.getString(u7);
                    int i11 = o.getInt(u8);
                    d2.a().getClass();
                    oa9.b.getClass();
                    oa9 n = cd4.n(i11);
                    int i12 = o.getInt(u9);
                    d2.a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i12);
                    long j8 = o.getLong(u10);
                    String string2 = o.isNull(u11) ? null : o.getString(u11);
                    if (o.isNull(u12)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(u12);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    w28 b2 = qe8.b(blob);
                    i10 = i2;
                    int i13 = u14;
                    int i14 = o.getInt(i13);
                    u14 = i13;
                    int i15 = u15;
                    boolean z3 = false;
                    if (o.getInt(i15) != 0) {
                        u15 = i15;
                        i3 = u16;
                        z = true;
                    } else {
                        u15 = i15;
                        i3 = u16;
                        z = false;
                    }
                    int i16 = o.getInt(i3);
                    u16 = i3;
                    int i17 = u17;
                    long j9 = o.getLong(i17);
                    u17 = i17;
                    int i18 = u18;
                    if (o.getInt(i18) != 0) {
                        u18 = i18;
                        i4 = u19;
                        z2 = true;
                    } else {
                        u18 = i18;
                        i4 = u19;
                        z2 = false;
                    }
                    long j10 = o.getLong(i4);
                    u19 = i4;
                    int i19 = u20;
                    if (o.isNull(i19)) {
                        u20 = i19;
                        i5 = u21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i19);
                        u20 = i19;
                        i5 = u21;
                    }
                    if (o.isNull(i5)) {
                        u21 = i5;
                        i6 = u22;
                        str3 = null;
                    } else {
                        str3 = o.getString(i5);
                        u21 = i5;
                        i6 = u22;
                    }
                    long j11 = o.getLong(i6);
                    u22 = i6;
                    int i20 = u23;
                    long j12 = o.getLong(i20);
                    u23 = i20;
                    int i21 = u24;
                    int i22 = o.getInt(i21);
                    d2.a().getClass();
                    int c2 = wj6.c(i22);
                    u24 = i21;
                    int i23 = u25;
                    long j13 = o.getLong(i23);
                    u25 = i23;
                    int i24 = u26;
                    int i25 = o.getInt(i24);
                    u26 = i24;
                    int i26 = u27;
                    int i27 = o.getInt(i26);
                    u27 = i26;
                    int i28 = u28;
                    int i29 = o.getInt(i28);
                    u28 = i28;
                    int i30 = u29;
                    long j14 = o.getLong(i30);
                    u29 = i30;
                    int i31 = u30;
                    int i32 = o.getInt(i31);
                    u30 = i31;
                    int i33 = u31;
                    int i34 = o.getInt(i33);
                    u31 = i33;
                    int i35 = u32;
                    long j15 = o.getLong(i35);
                    u32 = i35;
                    int i36 = u33;
                    byte[] blob2 = o.isNull(i36) ? null : o.getBlob(i36);
                    d2.a().getClass();
                    List a3 = hp9.a(blob2);
                    u33 = i36;
                    int i37 = u34;
                    if (o.isNull(i37)) {
                        i7 = i37;
                        i8 = u11;
                        bArr = null;
                    } else {
                        i7 = i37;
                        bArr = o.getBlob(i37);
                        i8 = u11;
                    }
                    xd9 b3 = d2.a().b(bArr);
                    int i38 = u35;
                    if (o.isNull(i38)) {
                        i9 = u36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i38));
                        i9 = u36;
                    }
                    Integer valueOf = o.isNull(i9) ? null : Integer.valueOf(o.getInt(i9));
                    if (valueOf == null) {
                        u35 = i38;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                        u35 = i38;
                    }
                    arrayList.add(new ya9(j2, j3, j4, j5, j6, j7, string, n, D, j8, string2, str, b2, i14, z, i16, j9, z2, j10, str2, str3, j11, j12, c2, j13, i25, i27, i29, j14, i32, i34, j15, a3, b3, l, bool));
                    u36 = i9;
                    u11 = i8;
                    u34 = i7;
                }
                o.close();
                d7d.o();
                ya9 ya9 = (ya9) CollectionsKt.firstOrNull(arrayList);
                if (ya9 != null) {
                    return z6d2.b(ya9);
                }
                return null;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    public final ha9 q(long j, bl4 bl4) {
        z6d z6d;
        ArrayList<ya9> arrayList;
        d7d d7d;
        String str;
        int i2;
        boolean z;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        long j2 = j;
        z6d z6d2 = ((a74) this.a).c;
        z6d2.getClass();
        int ordinal = bl4.ordinal();
        if (ordinal == 0) {
            aj9 d2 = z6d2.d();
            sq6 sq6 = qe9.b;
            d2.getClass();
            d7d a2 = d7d.a(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC LIMIT ?");
            i2a.o(a2, 1, j2, d2);
            a2.k(2, (long) 10);
            a2.k(3, 1);
            i6d i6d = d2.a;
            i6d.b();
            Cursor o = i6d.o(a2, (CancellationSignal) null);
            try {
                int u = kne.u(o, "id");
                int u2 = kne.u(o, "server_id");
                int u3 = kne.u(o, "time");
                int u4 = kne.u(o, "update_time");
                int u5 = kne.u(o, "sender");
                int u6 = kne.u(o, "cid");
                int u7 = kne.u(o, "text");
                int u8 = kne.u(o, "delivery_status");
                int u9 = kne.u(o, "status");
                int u10 = kne.u(o, "time_local");
                int u11 = kne.u(o, "error");
                int u12 = kne.u(o, "localized_error");
                z6d = z6d2;
                int u13 = kne.u(o, "attaches");
                d7d = a2;
                try {
                    int u14 = kne.u(o, "media_type");
                    int u15 = kne.u(o, "detect_share");
                    int u16 = kne.u(o, "msg_link_type");
                    int u17 = kne.u(o, "msg_link_id");
                    int u18 = kne.u(o, "inserted_from_msg_link");
                    int u19 = kne.u(o, "msg_link_chat_id");
                    int u20 = kne.u(o, "msg_link_chat_name");
                    int u21 = kne.u(o, "msg_link_chat_link");
                    int u22 = kne.u(o, "msg_link_out_chat_id");
                    int u23 = kne.u(o, "msg_link_out_msg_id");
                    int u24 = kne.u(o, "type");
                    int u25 = kne.u(o, "chat_id");
                    int u26 = kne.u(o, "ttl");
                    int u27 = kne.u(o, "channel_views");
                    int u28 = kne.u(o, "channel_forwards");
                    int u29 = kne.u(o, "view_time");
                    int u30 = kne.u(o, "zoom");
                    int u31 = kne.u(o, "options");
                    int u32 = kne.u(o, "live_until");
                    int u33 = kne.u(o, "elements");
                    int u34 = kne.u(o, "reactions");
                    int u35 = kne.u(o, "delayed_attrs_time_to_fire");
                    int u36 = kne.u(o, "delayed_attrs_notify_sender");
                    int i9 = u13;
                    ArrayList arrayList2 = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        long j3 = o.getLong(u);
                        long j4 = o.getLong(u2);
                        long j5 = o.getLong(u3);
                        long j6 = o.getLong(u4);
                        long j7 = o.getLong(u5);
                        long j8 = o.getLong(u6);
                        String string = o.isNull(u7) ? null : o.getString(u7);
                        int i10 = o.getInt(u8);
                        d2.a().getClass();
                        oa9.b.getClass();
                        oa9 n = cd4.n(i10);
                        int i11 = o.getInt(u9);
                        d2.a().getClass();
                        qe9.b.getClass();
                        qe9 D = sq6.D(i11);
                        long j9 = o.getLong(u10);
                        String string2 = o.isNull(u11) ? null : o.getString(u11);
                        if (o.isNull(u12)) {
                            i2 = i9;
                            str = null;
                        } else {
                            str = o.getString(u12);
                            i2 = i9;
                        }
                        byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                        d2.a().getClass();
                        w28 b2 = qe8.b(blob);
                        int i12 = u;
                        int i13 = u14;
                        int i14 = o.getInt(i13);
                        u14 = i13;
                        int i15 = u15;
                        int i16 = o.getInt(i15);
                        boolean z2 = false;
                        u15 = i15;
                        int i17 = u16;
                        boolean z3 = i16 != 0;
                        int i18 = o.getInt(i17);
                        int i19 = i17;
                        int i20 = u17;
                        long j10 = o.getLong(i20);
                        u17 = i20;
                        int i21 = u18;
                        if (o.getInt(i21) != 0) {
                            u18 = i21;
                            i3 = u19;
                            z = true;
                        } else {
                            u18 = i21;
                            i3 = u19;
                            z = false;
                        }
                        long j11 = o.getLong(i3);
                        u19 = i3;
                        int i22 = u20;
                        if (o.isNull(i22)) {
                            u20 = i22;
                            i4 = u21;
                            str2 = null;
                        } else {
                            str2 = o.getString(i22);
                            u20 = i22;
                            i4 = u21;
                        }
                        if (o.isNull(i4)) {
                            u21 = i4;
                            i5 = u22;
                            str3 = null;
                        } else {
                            str3 = o.getString(i4);
                            u21 = i4;
                            i5 = u22;
                        }
                        long j12 = o.getLong(i5);
                        u22 = i5;
                        int i23 = u23;
                        long j13 = o.getLong(i23);
                        u23 = i23;
                        int i24 = u24;
                        int i25 = o.getInt(i24);
                        d2.a().getClass();
                        int c2 = wj6.c(i25);
                        u24 = i24;
                        int i26 = u25;
                        long j14 = o.getLong(i26);
                        u25 = i26;
                        int i27 = u26;
                        int i28 = o.getInt(i27);
                        u26 = i27;
                        int i29 = u27;
                        int i30 = o.getInt(i29);
                        u27 = i29;
                        int i31 = u28;
                        int i32 = o.getInt(i31);
                        u28 = i31;
                        int i33 = u29;
                        long j15 = o.getLong(i33);
                        u29 = i33;
                        int i34 = u30;
                        int i35 = o.getInt(i34);
                        u30 = i34;
                        int i36 = u31;
                        int i37 = o.getInt(i36);
                        u31 = i36;
                        int i38 = u32;
                        long j16 = o.getLong(i38);
                        u32 = i38;
                        int i39 = u33;
                        byte[] blob2 = o.isNull(i39) ? null : o.getBlob(i39);
                        d2.a().getClass();
                        List a3 = hp9.a(blob2);
                        u33 = i39;
                        int i40 = u34;
                        if (o.isNull(i40)) {
                            i6 = i40;
                            i7 = u11;
                            bArr = null;
                        } else {
                            i6 = i40;
                            bArr = o.getBlob(i40);
                            i7 = u11;
                        }
                        xd9 b3 = d2.a().b(bArr);
                        int i41 = u35;
                        if (o.isNull(i41)) {
                            i8 = u36;
                            l = null;
                        } else {
                            l = Long.valueOf(o.getLong(i41));
                            i8 = u36;
                        }
                        Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                        if (valueOf == null) {
                            u35 = i41;
                            bool = null;
                        } else {
                            if (valueOf.intValue() != 0) {
                                z2 = true;
                            }
                            bool = Boolean.valueOf(z2);
                            u35 = i41;
                        }
                        arrayList2.add(new ya9(j3, j4, j5, j6, j7, j8, string, n, D, j9, string2, str, b2, i14, z3, i18, j10, z, j11, str2, str3, j12, j13, c2, j14, i28, i30, i32, j15, i35, i37, j16, a3, b3, l, bool));
                        u36 = i8;
                        u11 = i7;
                        u = i12;
                        u16 = i19;
                        u34 = i6;
                        i9 = i2;
                    }
                    o.close();
                    d7d.o();
                    arrayList = arrayList2;
                } catch (Throwable th) {
                    th = th;
                    o.close();
                    d7d.o();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                d7d = a2;
                o.close();
                d7d.o();
                throw th;
            }
        } else if (ordinal == 1) {
            arrayList = aj9.j(z6d2.d(), j2);
            z6d = z6d2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (ya9 b4 : arrayList) {
            arrayList3.add(z6d.b(b4));
        }
        return (ha9) CollectionsKt.firstOrNull(arrayList3);
    }

    public final ha9 r(long j) {
        z6d z6d = ((a74) this.a).c;
        ya9 c2 = z6d.d().c(j);
        if (c2 != null) {
            return z6d.b(c2);
        }
        return null;
    }

    public final ha9 s(long j, long j2) {
        z6d z6d;
        ArrayList arrayList;
        d7d d7d;
        String str;
        int i2;
        boolean z;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        d7d d7d2;
        String str4;
        int i9;
        boolean z2;
        int i10;
        String str5;
        int i11;
        String str6;
        int i12;
        int i13;
        int i14;
        byte[] bArr2;
        Long l2;
        int i15;
        Boolean bool2;
        long j3 = j;
        long j4 = j2;
        bl4 bl4 = bl4.REGULAR;
        z6d z6d2 = ((a74) this.a).c;
        z6d2.getClass();
        int ordinal = bl4.ordinal();
        String str7 = "delayed_attrs_notify_sender";
        String str8 = "delayed_attrs_time_to_fire";
        String str9 = "reactions";
        String str10 = "elements";
        String str11 = "live_until";
        String str12 = "options";
        String str13 = "zoom";
        String str14 = "view_time";
        String str15 = "channel_forwards";
        String str16 = "channel_views";
        String str17 = "ttl";
        String str18 = "chat_id";
        String str19 = "type";
        String str20 = "msg_link_out_msg_id";
        String str21 = "msg_link_out_chat_id";
        String str22 = "msg_link_chat_link";
        String str23 = "msg_link_chat_name";
        String str24 = "msg_link_chat_id";
        String str25 = "inserted_from_msg_link";
        String str26 = "msg_link_id";
        String str27 = "msg_link_type";
        String str28 = "detect_share";
        String str29 = "media_type";
        String str30 = "attaches";
        String str31 = "localized_error";
        String str32 = "error";
        String str33 = "time_local";
        if (ordinal == 0) {
            z6d = z6d2;
            String str34 = str32;
            String str35 = str33;
            String str36 = str31;
            aj9 d2 = z6d.d();
            sq6 sq6 = qe9.b;
            d2.getClass();
            String str37 = str34;
            String str38 = str35;
            d7d a2 = d7d.a(4, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC LIMIT ?");
            a2.k(1, j3);
            i2a.o(a2, 2, j4, d2);
            a2.k(3, (long) 10);
            a2.k(4, (long) 1);
            i6d i6d = d2.a;
            i6d.b();
            Cursor o = i6d.o(a2, (CancellationSignal) null);
            try {
                int u = kne.u(o, "id");
                int u2 = kne.u(o, "server_id");
                int u3 = kne.u(o, "time");
                int u4 = kne.u(o, "update_time");
                int u5 = kne.u(o, "sender");
                int u6 = kne.u(o, "cid");
                int u7 = kne.u(o, "text");
                int u8 = kne.u(o, "delivery_status");
                int u9 = kne.u(o, "status");
                int u10 = kne.u(o, str38);
                int u11 = kne.u(o, str37);
                int u12 = kne.u(o, str36);
                int u13 = kne.u(o, str30);
                d7d = a2;
                try {
                    int u14 = kne.u(o, str29);
                    int u15 = kne.u(o, str28);
                    int u16 = kne.u(o, str27);
                    int u17 = kne.u(o, str26);
                    int u18 = kne.u(o, str25);
                    int u19 = kne.u(o, str24);
                    int u20 = kne.u(o, str23);
                    int u21 = kne.u(o, str22);
                    int u22 = kne.u(o, str21);
                    int u23 = kne.u(o, str20);
                    int u24 = kne.u(o, str19);
                    int u25 = kne.u(o, str18);
                    int u26 = kne.u(o, str17);
                    int u27 = kne.u(o, str16);
                    int u28 = kne.u(o, str15);
                    int u29 = kne.u(o, str14);
                    int u30 = kne.u(o, str13);
                    int u31 = kne.u(o, str12);
                    int u32 = kne.u(o, str11);
                    int u33 = kne.u(o, str10);
                    int u34 = kne.u(o, str9);
                    int u35 = kne.u(o, str8);
                    int u36 = kne.u(o, str7);
                    int i16 = u13;
                    arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        long j5 = o.getLong(u);
                        long j6 = o.getLong(u2);
                        long j7 = o.getLong(u3);
                        long j8 = o.getLong(u4);
                        long j9 = o.getLong(u5);
                        long j10 = o.getLong(u6);
                        String string = o.isNull(u7) ? null : o.getString(u7);
                        int i17 = o.getInt(u8);
                        d2.a().getClass();
                        oa9.b.getClass();
                        oa9 n = cd4.n(i17);
                        int i18 = o.getInt(u9);
                        d2.a().getClass();
                        qe9.b.getClass();
                        qe9 D = sq6.D(i18);
                        long j11 = o.getLong(u10);
                        String string2 = o.isNull(u11) ? null : o.getString(u11);
                        if (o.isNull(u12)) {
                            i2 = i16;
                            str = null;
                        } else {
                            str = o.getString(u12);
                            i2 = i16;
                        }
                        byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                        d2.a().getClass();
                        w28 b2 = qe8.b(blob);
                        int i19 = u;
                        int i20 = u14;
                        int i21 = o.getInt(i20);
                        u14 = i20;
                        int i22 = u15;
                        u15 = i22;
                        boolean z3 = o.getInt(i22) != 0;
                        int i23 = u16;
                        int i24 = o.getInt(i23);
                        u16 = i23;
                        int i25 = u17;
                        long j12 = o.getLong(i25);
                        u17 = i25;
                        int i26 = u18;
                        if (o.getInt(i26) != 0) {
                            u18 = i26;
                            i3 = u19;
                            z = true;
                        } else {
                            u18 = i26;
                            i3 = u19;
                            z = false;
                        }
                        long j13 = o.getLong(i3);
                        u19 = i3;
                        int i27 = u20;
                        if (o.isNull(i27)) {
                            u20 = i27;
                            i4 = u21;
                            str2 = null;
                        } else {
                            str2 = o.getString(i27);
                            u20 = i27;
                            i4 = u21;
                        }
                        if (o.isNull(i4)) {
                            u21 = i4;
                            i5 = u22;
                            str3 = null;
                        } else {
                            str3 = o.getString(i4);
                            u21 = i4;
                            i5 = u22;
                        }
                        long j14 = o.getLong(i5);
                        u22 = i5;
                        int i28 = u23;
                        long j15 = o.getLong(i28);
                        u23 = i28;
                        int i29 = u24;
                        int i30 = o.getInt(i29);
                        d2.a().getClass();
                        int c2 = wj6.c(i30);
                        u24 = i29;
                        int i31 = u25;
                        long j16 = o.getLong(i31);
                        u25 = i31;
                        int i32 = u26;
                        int i33 = o.getInt(i32);
                        u26 = i32;
                        int i34 = u27;
                        int i35 = o.getInt(i34);
                        u27 = i34;
                        int i36 = u28;
                        int i37 = o.getInt(i36);
                        u28 = i36;
                        int i38 = u29;
                        long j17 = o.getLong(i38);
                        u29 = i38;
                        int i39 = u30;
                        int i40 = o.getInt(i39);
                        u30 = i39;
                        int i41 = u31;
                        int i42 = o.getInt(i41);
                        u31 = i41;
                        int i43 = u32;
                        long j18 = o.getLong(i43);
                        u32 = i43;
                        int i44 = u33;
                        byte[] blob2 = o.isNull(i44) ? null : o.getBlob(i44);
                        d2.a().getClass();
                        List a3 = hp9.a(blob2);
                        u33 = i44;
                        int i45 = u34;
                        if (o.isNull(i45)) {
                            i6 = i45;
                            i7 = u12;
                            bArr = null;
                        } else {
                            i6 = i45;
                            bArr = o.getBlob(i45);
                            i7 = u12;
                        }
                        xd9 b3 = d2.a().b(bArr);
                        int i46 = u35;
                        if (o.isNull(i46)) {
                            i8 = u36;
                            l = null;
                        } else {
                            l = Long.valueOf(o.getLong(i46));
                            i8 = u36;
                        }
                        Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                        if (valueOf == null) {
                            u35 = i46;
                            bool = null;
                        } else {
                            u35 = i46;
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        arrayList.add(new ya9(j5, j6, j7, j8, j9, j10, string, n, D, j11, string2, str, b2, i21, z3, i24, j12, z, j13, str2, str3, j14, j15, c2, j16, i33, i35, i37, j17, i40, i42, j18, a3, b3, l, bool));
                        u36 = i8;
                        u12 = i7;
                        u = i19;
                        u34 = i6;
                        i16 = i2;
                    }
                    o.close();
                    d7d.o();
                } catch (Throwable th) {
                    th = th;
                    o.close();
                    d7d.o();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                d7d = a2;
                o.close();
                d7d.o();
                throw th;
            }
        } else if (ordinal == 1) {
            aj9 d3 = z6d2.d();
            sq6 sq62 = qe9.b;
            d3.getClass();
            z6d = z6d2;
            String str39 = "status";
            d7d a4 = d7d.a(4, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY time ASC LIMIT ?");
            a4.k(1, j3);
            i2a.o(a4, 2, j4, d3);
            a4.k(3, (long) 10);
            a4.k(4, (long) 1);
            i6d i6d2 = d3.a;
            i6d2.b();
            Cursor o2 = i6d2.o(a4, (CancellationSignal) null);
            try {
                int u37 = kne.u(o2, "id");
                int u38 = kne.u(o2, "server_id");
                int u39 = kne.u(o2, "time");
                int u40 = kne.u(o2, "update_time");
                int u41 = kne.u(o2, "sender");
                int u42 = kne.u(o2, "cid");
                int u43 = kne.u(o2, "text");
                int u44 = kne.u(o2, "delivery_status");
                int u45 = kne.u(o2, str39);
                int u46 = kne.u(o2, str33);
                int u47 = kne.u(o2, str32);
                int u48 = kne.u(o2, str31);
                int u49 = kne.u(o2, str30);
                d7d2 = a4;
                try {
                    int u50 = kne.u(o2, str29);
                    int u51 = kne.u(o2, str28);
                    int u52 = kne.u(o2, str27);
                    int u53 = kne.u(o2, str26);
                    int u54 = kne.u(o2, str25);
                    int u55 = kne.u(o2, str24);
                    int u56 = kne.u(o2, str23);
                    int u57 = kne.u(o2, str22);
                    int u58 = kne.u(o2, str21);
                    int u59 = kne.u(o2, str20);
                    int u60 = kne.u(o2, str19);
                    int u61 = kne.u(o2, str18);
                    int u62 = kne.u(o2, str17);
                    int u63 = kne.u(o2, str16);
                    int u64 = kne.u(o2, str15);
                    int u65 = kne.u(o2, str14);
                    int u66 = kne.u(o2, str13);
                    int u67 = kne.u(o2, str12);
                    int u68 = kne.u(o2, str11);
                    int u69 = kne.u(o2, str10);
                    int u70 = kne.u(o2, str9);
                    int u71 = kne.u(o2, str8);
                    int u72 = kne.u(o2, str7);
                    int i47 = u49;
                    arrayList = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        long j19 = o2.getLong(u37);
                        long j20 = o2.getLong(u38);
                        long j21 = o2.getLong(u39);
                        long j22 = o2.getLong(u40);
                        long j23 = o2.getLong(u41);
                        long j24 = o2.getLong(u42);
                        String string3 = o2.isNull(u43) ? null : o2.getString(u43);
                        int i48 = o2.getInt(u44);
                        d3.a().getClass();
                        oa9.b.getClass();
                        oa9 n2 = cd4.n(i48);
                        int i49 = o2.getInt(u45);
                        d3.a().getClass();
                        qe9.b.getClass();
                        qe9 D2 = sq6.D(i49);
                        long j25 = o2.getLong(u46);
                        String string4 = o2.isNull(u47) ? null : o2.getString(u47);
                        if (o2.isNull(u48)) {
                            i9 = i47;
                            str4 = null;
                        } else {
                            str4 = o2.getString(u48);
                            i9 = i47;
                        }
                        byte[] blob3 = o2.isNull(i9) ? null : o2.getBlob(i9);
                        d3.a().getClass();
                        w28 b4 = qe8.b(blob3);
                        int i50 = u37;
                        int i51 = u50;
                        int i52 = o2.getInt(i51);
                        u50 = i51;
                        int i53 = u51;
                        u51 = i53;
                        boolean z4 = o2.getInt(i53) != 0;
                        int i54 = u52;
                        int i55 = o2.getInt(i54);
                        u52 = i54;
                        int i56 = u53;
                        long j26 = o2.getLong(i56);
                        u53 = i56;
                        int i57 = u54;
                        if (o2.getInt(i57) != 0) {
                            u54 = i57;
                            i10 = u55;
                            z2 = true;
                        } else {
                            u54 = i57;
                            i10 = u55;
                            z2 = false;
                        }
                        long j27 = o2.getLong(i10);
                        u55 = i10;
                        int i58 = u56;
                        if (o2.isNull(i58)) {
                            u56 = i58;
                            i11 = u57;
                            str5 = null;
                        } else {
                            str5 = o2.getString(i58);
                            u56 = i58;
                            i11 = u57;
                        }
                        if (o2.isNull(i11)) {
                            u57 = i11;
                            i12 = u58;
                            str6 = null;
                        } else {
                            str6 = o2.getString(i11);
                            u57 = i11;
                            i12 = u58;
                        }
                        long j28 = o2.getLong(i12);
                        u58 = i12;
                        int i59 = u59;
                        long j29 = o2.getLong(i59);
                        u59 = i59;
                        int i60 = u60;
                        int i61 = o2.getInt(i60);
                        d3.a().getClass();
                        int c3 = wj6.c(i61);
                        u60 = i60;
                        int i62 = u61;
                        long j30 = o2.getLong(i62);
                        u61 = i62;
                        int i63 = u62;
                        int i64 = o2.getInt(i63);
                        u62 = i63;
                        int i65 = u63;
                        int i66 = o2.getInt(i65);
                        u63 = i65;
                        int i67 = u64;
                        int i68 = o2.getInt(i67);
                        u64 = i67;
                        int i69 = u65;
                        long j31 = o2.getLong(i69);
                        u65 = i69;
                        int i70 = u66;
                        int i71 = o2.getInt(i70);
                        u66 = i70;
                        int i72 = u67;
                        int i73 = o2.getInt(i72);
                        u67 = i72;
                        int i74 = u68;
                        long j32 = o2.getLong(i74);
                        u68 = i74;
                        int i75 = u69;
                        byte[] blob4 = o2.isNull(i75) ? null : o2.getBlob(i75);
                        d3.a().getClass();
                        List a5 = hp9.a(blob4);
                        u69 = i75;
                        int i76 = u70;
                        if (o2.isNull(i76)) {
                            i13 = i76;
                            i14 = u38;
                            bArr2 = null;
                        } else {
                            i13 = i76;
                            bArr2 = o2.getBlob(i76);
                            i14 = u38;
                        }
                        xd9 b5 = d3.a().b(bArr2);
                        int i77 = u71;
                        if (o2.isNull(i77)) {
                            i15 = u72;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(o2.getLong(i77));
                            i15 = u72;
                        }
                        Integer valueOf2 = o2.isNull(i15) ? null : Integer.valueOf(o2.getInt(i15));
                        if (valueOf2 == null) {
                            u71 = i77;
                            bool2 = null;
                        } else {
                            u71 = i77;
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        }
                        arrayList.add(new ya9(j19, j20, j21, j22, j23, j24, string3, n2, D2, j25, string4, str4, b4, i52, z4, i55, j26, z2, j27, str5, str6, j28, j29, c3, j30, i64, i66, i68, j31, i71, i73, j32, a5, b5, l2, bool2));
                        u72 = i15;
                        u38 = i14;
                        u37 = i50;
                        u70 = i13;
                        i47 = i9;
                    }
                    o2.close();
                    d7d2.o();
                } catch (Throwable th3) {
                    th = th3;
                    o2.close();
                    d7d2.o();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                d7d2 = a4;
                o2.close();
                d7d2.o();
                throw th;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ya9 ya9 = (ya9) CollectionsKt.firstOrNull(arrayList);
        if (ya9 != null) {
            return z6d.b(ya9);
        }
        return null;
    }

    public final ArrayList t() {
        d7d d7d;
        String str;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l;
        int i9;
        Boolean bool;
        cd4 cd4 = oa9.b;
        z6d z6d = ((a74) this.a).c;
        aj9 d2 = z6d.d();
        sq6 sq6 = qe9.b;
        d2.getClass();
        d7d a2 = d7d.a(2, "SELECT * FROM messages WHERE delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ?");
        d2.a().getClass();
        long j = (long) 10;
        i2a.o(a2, 1, j, d2);
        a2.k(2, j);
        i6d i6d = d2.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "server_id");
            int u3 = kne.u(o, "time");
            int u4 = kne.u(o, "update_time");
            int u5 = kne.u(o, "sender");
            int u6 = kne.u(o, "cid");
            int u7 = kne.u(o, "text");
            int u8 = kne.u(o, "delivery_status");
            int u9 = kne.u(o, "status");
            int u10 = kne.u(o, "time_local");
            int u11 = kne.u(o, "error");
            int u12 = kne.u(o, "localized_error");
            z6d z6d2 = z6d;
            int u13 = kne.u(o, "attaches");
            d7d = a2;
            try {
                int u14 = kne.u(o, "media_type");
                int u15 = kne.u(o, "detect_share");
                int u16 = kne.u(o, "msg_link_type");
                int u17 = kne.u(o, "msg_link_id");
                int u18 = kne.u(o, "inserted_from_msg_link");
                int u19 = kne.u(o, "msg_link_chat_id");
                int u20 = kne.u(o, "msg_link_chat_name");
                int u21 = kne.u(o, "msg_link_chat_link");
                int u22 = kne.u(o, "msg_link_out_chat_id");
                int u23 = kne.u(o, "msg_link_out_msg_id");
                int u24 = kne.u(o, "type");
                int u25 = kne.u(o, "chat_id");
                int u26 = kne.u(o, "ttl");
                int u27 = kne.u(o, "channel_views");
                int u28 = kne.u(o, "channel_forwards");
                int u29 = kne.u(o, "view_time");
                int u30 = kne.u(o, "zoom");
                int u31 = kne.u(o, "options");
                int u32 = kne.u(o, "live_until");
                int u33 = kne.u(o, "elements");
                int u34 = kne.u(o, "reactions");
                int u35 = kne.u(o, "delayed_attrs_time_to_fire");
                int u36 = kne.u(o, "delayed_attrs_notify_sender");
                int i10 = u13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j2 = o.getLong(u);
                    long j3 = o.getLong(u2);
                    long j4 = o.getLong(u3);
                    long j5 = o.getLong(u4);
                    long j6 = o.getLong(u5);
                    long j7 = o.getLong(u6);
                    String string = o.isNull(u7) ? null : o.getString(u7);
                    int i11 = o.getInt(u8);
                    d2.a().getClass();
                    oa9.b.getClass();
                    oa9 n = cd4.n(i11);
                    int i12 = o.getInt(u9);
                    d2.a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i12);
                    long j8 = o.getLong(u10);
                    String string2 = o.isNull(u11) ? null : o.getString(u11);
                    if (o.isNull(u12)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(u12);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    w28 b2 = qe8.b(blob);
                    i10 = i2;
                    int i13 = u14;
                    int i14 = o.getInt(i13);
                    u14 = i13;
                    int i15 = u15;
                    boolean z3 = false;
                    if (o.getInt(i15) != 0) {
                        u15 = i15;
                        i3 = u16;
                        z = true;
                    } else {
                        u15 = i15;
                        i3 = u16;
                        z = false;
                    }
                    int i16 = o.getInt(i3);
                    u16 = i3;
                    int i17 = u17;
                    long j9 = o.getLong(i17);
                    u17 = i17;
                    int i18 = u18;
                    if (o.getInt(i18) != 0) {
                        u18 = i18;
                        i4 = u19;
                        z2 = true;
                    } else {
                        u18 = i18;
                        i4 = u19;
                        z2 = false;
                    }
                    long j10 = o.getLong(i4);
                    u19 = i4;
                    int i19 = u20;
                    if (o.isNull(i19)) {
                        u20 = i19;
                        i5 = u21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i19);
                        u20 = i19;
                        i5 = u21;
                    }
                    if (o.isNull(i5)) {
                        u21 = i5;
                        i6 = u22;
                        str3 = null;
                    } else {
                        str3 = o.getString(i5);
                        u21 = i5;
                        i6 = u22;
                    }
                    long j11 = o.getLong(i6);
                    u22 = i6;
                    int i20 = u23;
                    long j12 = o.getLong(i20);
                    u23 = i20;
                    int i21 = u24;
                    int i22 = o.getInt(i21);
                    d2.a().getClass();
                    int c2 = wj6.c(i22);
                    u24 = i21;
                    int i23 = u25;
                    long j13 = o.getLong(i23);
                    u25 = i23;
                    int i24 = u26;
                    int i25 = o.getInt(i24);
                    u26 = i24;
                    int i26 = u27;
                    int i27 = o.getInt(i26);
                    u27 = i26;
                    int i28 = u28;
                    int i29 = o.getInt(i28);
                    u28 = i28;
                    int i30 = u29;
                    long j14 = o.getLong(i30);
                    u29 = i30;
                    int i31 = u30;
                    int i32 = o.getInt(i31);
                    u30 = i31;
                    int i33 = u31;
                    int i34 = o.getInt(i33);
                    u31 = i33;
                    int i35 = u32;
                    long j15 = o.getLong(i35);
                    u32 = i35;
                    int i36 = u33;
                    byte[] blob2 = o.isNull(i36) ? null : o.getBlob(i36);
                    d2.a().getClass();
                    List a3 = hp9.a(blob2);
                    u33 = i36;
                    int i37 = u34;
                    if (o.isNull(i37)) {
                        i7 = i37;
                        i8 = u11;
                        bArr = null;
                    } else {
                        i7 = i37;
                        bArr = o.getBlob(i37);
                        i8 = u11;
                    }
                    xd9 b3 = d2.a().b(bArr);
                    int i38 = u35;
                    if (o.isNull(i38)) {
                        i9 = u36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i38));
                        i9 = u36;
                    }
                    Integer valueOf = o.isNull(i9) ? null : Integer.valueOf(o.getInt(i9));
                    if (valueOf == null) {
                        u35 = i38;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                        u35 = i38;
                    }
                    arrayList.add(new ya9(j2, j3, j4, j5, j6, j7, string, n, D, j8, string2, str, b2, i14, z, i16, j9, z2, j10, str2, str3, j11, j12, c2, j13, i25, i27, i29, j14, i32, i34, j15, a3, b3, l, bool));
                    u36 = i9;
                    u11 = i8;
                    u34 = i7;
                }
                o.close();
                d7d.o();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(z6d2.b((ya9) it.next()));
                }
                return arrayList2;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    public final ha9 u(ha9 ha9, String str, qk3 qk3) {
        jbd.a.r(new kl5(this, ha9, str, qk3), new a62(str, 4));
        try {
            m20 Q = ha9.x0.Q();
            kr7.P(Q, str, qk3);
            ga9 I = ha9.I();
            I.n = Q.c();
            return I.a();
        } catch (Throwable unused) {
            z68.f("fa9", "Can't update attach localId = " + str, (Throwable) null);
            return ha9;
        }
    }

    public final void v(ha9 ha9, l20 l20) {
        u(ha9, l20.q, new vz0());
    }

    public final a89 w(ha9 ha9, String str, d20 d20) {
        ha9 u = u(ha9, str, new g18(22, this, d20));
        gb9 gb9 = (gb9) this.g.get();
        ha9 a2 = u.I().a();
        gb9.getClass();
        return gb9.a(gb9, a2);
    }

    public final void x(long j, String str, qk3 qk3) {
        ((a74) this.a).c.n(j, new g18(21, str, qk3));
    }

    public final void y(ha9 ha9, w28 w28) {
        ((a74) this.a).c.n(ha9.b, new ca9(ha9, w28, 0));
    }

    public final void z(ha9 ha9, oa9 oa9) {
        a74 a74 = (a74) this.a;
        z6d z6d = a74.c;
        z6d.d().n(ha9.b, oa9);
        if (oa9 == oa9.ERROR && ha9.o()) {
            a74.c.n(ha9.b, new td8(14, this));
        }
    }
}
