package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: aj9  reason: default package */
public final class aj9 {
    public final i6d a;
    public final gs2 b;
    public hp9 c;
    public final zi9 d;
    public final zi9 e;
    public final zi9 f;
    public final uf9 g;
    public final uf9 h;
    public final uf9 i;
    public final uf9 j;
    public final uf9 k;
    public final uf9 l;
    public final uf9 m;
    public final uf9 n;
    public final uf9 o;
    public final uf9 p;
    public final uf9 q;
    public final uf9 r;
    public final uf9 s;

    public aj9(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new gs2(this, oneMeRoomDatabase, 1);
        this.d = new zi9(this, oneMeRoomDatabase, 0);
        new zi9(this, oneMeRoomDatabase, 1);
        new we4(oneMeRoomDatabase, 1);
        this.e = new zi9(this, oneMeRoomDatabase, 2);
        new we4(oneMeRoomDatabase, 2);
        this.f = new zi9(this, oneMeRoomDatabase, 3);
        this.g = new uf9(oneMeRoomDatabase, 14);
        this.h = new uf9(oneMeRoomDatabase, 15);
        this.i = new uf9(oneMeRoomDatabase, 1);
        this.j = new uf9(oneMeRoomDatabase, 2);
        this.k = new uf9(oneMeRoomDatabase, 3);
        this.l = new uf9(oneMeRoomDatabase, 4);
        new uf9(oneMeRoomDatabase, 5);
        this.m = new uf9(oneMeRoomDatabase, 6);
        this.n = new uf9(oneMeRoomDatabase, 7);
        this.o = new uf9(oneMeRoomDatabase, 8);
        this.p = new uf9(oneMeRoomDatabase, 9);
        this.q = new uf9(oneMeRoomDatabase, 10);
        this.r = new uf9(oneMeRoomDatabase, 11);
        this.s = new uf9(oneMeRoomDatabase, 12);
        new uf9(oneMeRoomDatabase, 13);
    }

    public static id9 g(aj9 aj9, ya9 ya9, id9 id9, long j2, Long l2, Long l3, int i2) {
        String str;
        ya9 ya92 = ya9;
        id9 id92 = id9;
        Long l4 = null;
        Long l5 = (i2 & 8) != 0 ? null : l2;
        if ((i2 & 16) == 0) {
            l4 = l3;
        }
        String str2 = id92.h;
        String str3 = ((str2 != null && str2.length() != 0) || (str = ya92.g) == null || str.length() == 0) ? str2 : str;
        long j3 = id92.l;
        if (j3 == 0) {
            j3 = ya92.q;
        }
        long j4 = j3;
        int i3 = id92.k;
        if (i3 == 0) {
            i3 = ya92.p;
        }
        int i4 = i3;
        long j5 = id92.n;
        if (j5 == 0) {
            j5 = ya92.s;
        }
        long j6 = j5;
        String str4 = id92.p;
        if (str4 == null) {
            str4 = ya92.u;
        }
        String str5 = str4;
        String str6 = id92.o;
        if (str6 == null) {
            str6 = ya92.t;
        }
        String str7 = str6;
        xd9 xd9 = id92.j;
        if (xd9 == null) {
            xd9 = ya92.G;
        }
        return new id9(ya92.a, l5 != null ? l5.longValue() : id92.b, id92.c, j2, id92.e, id92.f, l4 != null ? l4.longValue() : id92.g, str3, id92.i, xd9, i4, j4, ya92.r && id92.m, j6, str7, str5, id92.q, id92.r, id92.s, id92.t, id92.u, id92.v, id92.w, id92.x, id92.y);
    }

    public static ArrayList j(aj9 aj9, long j2) {
        d7d d7d;
        boolean z;
        int i2;
        String str;
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        Long l2;
        int i7;
        Boolean bool;
        aj9 aj92 = aj9;
        sq6 sq6 = qe9.b;
        aj9.getClass();
        d7d a2 = d7d.a(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?");
        i2a.o(a2, 1, j2, aj92);
        a2.k(2, (long) 10);
        a2.k(3, 1);
        i6d i6d = aj92.a;
        i6d.b();
        Cursor o2 = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o2, "id");
            int u2 = kne.u(o2, "server_id");
            int u3 = kne.u(o2, "time");
            int u4 = kne.u(o2, "update_time");
            int u5 = kne.u(o2, "sender");
            int u6 = kne.u(o2, "cid");
            int u7 = kne.u(o2, "text");
            int u8 = kne.u(o2, "delivery_status");
            int u9 = kne.u(o2, "status");
            int u10 = kne.u(o2, "time_local");
            int u11 = kne.u(o2, "error");
            int u12 = kne.u(o2, "localized_error");
            int u13 = kne.u(o2, "attaches");
            int u14 = kne.u(o2, "media_type");
            d7d = a2;
            try {
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
                int i8 = u14;
                ArrayList arrayList = new ArrayList(o2.getCount());
                while (o2.moveToNext()) {
                    long j3 = o2.getLong(u);
                    long j4 = o2.getLong(u2);
                    long j5 = o2.getLong(u3);
                    long j6 = o2.getLong(u4);
                    long j7 = o2.getLong(u5);
                    long j8 = o2.getLong(u6);
                    String string = o2.isNull(u7) ? null : o2.getString(u7);
                    int i9 = o2.getInt(u8);
                    aj9.a().getClass();
                    oa9.b.getClass();
                    oa9 n2 = cd4.n(i9);
                    int i10 = o2.getInt(u9);
                    aj9.a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i10);
                    long j9 = o2.getLong(u10);
                    String string2 = o2.isNull(u11) ? null : o2.getString(u11);
                    String string3 = o2.isNull(u12) ? null : o2.getString(u12);
                    byte[] blob = o2.isNull(u13) ? null : o2.getBlob(u13);
                    aj9.a().getClass();
                    w28 b2 = qe8.b(blob);
                    int i11 = i8;
                    int i12 = o2.getInt(i11);
                    i8 = i11;
                    int i13 = u15;
                    int i14 = o2.getInt(i13);
                    boolean z2 = false;
                    u15 = i13;
                    int i15 = u16;
                    boolean z3 = i14 != 0;
                    int i16 = o2.getInt(i15);
                    int i17 = i15;
                    int i18 = u17;
                    long j10 = o2.getLong(i18);
                    u17 = i18;
                    int i19 = u18;
                    if (o2.getInt(i19) != 0) {
                        u18 = i19;
                        i2 = u19;
                        z = true;
                    } else {
                        u18 = i19;
                        i2 = u19;
                        z = false;
                    }
                    long j11 = o2.getLong(i2);
                    u19 = i2;
                    int i20 = u20;
                    if (o2.isNull(i20)) {
                        u20 = i20;
                        i3 = u21;
                        str = null;
                    } else {
                        str = o2.getString(i20);
                        u20 = i20;
                        i3 = u21;
                    }
                    if (o2.isNull(i3)) {
                        u21 = i3;
                        i4 = u22;
                        str2 = null;
                    } else {
                        str2 = o2.getString(i3);
                        u21 = i3;
                        i4 = u22;
                    }
                    long j12 = o2.getLong(i4);
                    u22 = i4;
                    int i21 = u23;
                    long j13 = o2.getLong(i21);
                    u23 = i21;
                    int i22 = u24;
                    int i23 = o2.getInt(i22);
                    aj9.a().getClass();
                    int c2 = wj6.c(i23);
                    u24 = i22;
                    int i24 = u25;
                    long j14 = o2.getLong(i24);
                    u25 = i24;
                    int i25 = u26;
                    int i26 = o2.getInt(i25);
                    u26 = i25;
                    int i27 = u27;
                    int i28 = o2.getInt(i27);
                    u27 = i27;
                    int i29 = u28;
                    int i30 = o2.getInt(i29);
                    u28 = i29;
                    int i31 = u29;
                    long j15 = o2.getLong(i31);
                    u29 = i31;
                    int i32 = u30;
                    int i33 = o2.getInt(i32);
                    u30 = i32;
                    int i34 = u31;
                    int i35 = o2.getInt(i34);
                    u31 = i34;
                    int i36 = u32;
                    long j16 = o2.getLong(i36);
                    u32 = i36;
                    int i37 = u33;
                    byte[] blob2 = o2.isNull(i37) ? null : o2.getBlob(i37);
                    aj9.a().getClass();
                    List a3 = hp9.a(blob2);
                    u33 = i37;
                    int i38 = u34;
                    if (o2.isNull(i38)) {
                        i5 = i38;
                        i6 = u12;
                        bArr = null;
                    } else {
                        i5 = i38;
                        bArr = o2.getBlob(i38);
                        i6 = u12;
                    }
                    xd9 b3 = aj9.a().b(bArr);
                    int i39 = u35;
                    if (o2.isNull(i39)) {
                        i7 = u36;
                        l2 = null;
                    } else {
                        l2 = Long.valueOf(o2.getLong(i39));
                        i7 = u36;
                    }
                    Integer valueOf = o2.isNull(i7) ? null : Integer.valueOf(o2.getInt(i7));
                    if (valueOf == null) {
                        u35 = i39;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        u35 = i39;
                    }
                    arrayList.add(new ya9(j3, j4, j5, j6, j7, j8, string, n2, D, j9, string2, string3, b2, i12, z3, i16, j10, z, j11, str, str2, j12, j13, c2, j14, i26, i28, i30, j15, i33, i35, j16, a3, b3, l2, bool));
                    u36 = i7;
                    u12 = i6;
                    u16 = i17;
                    u34 = i5;
                }
                o2.close();
                d7d.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o2.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a2;
            o2.close();
            d7d.o();
            throw th;
        }
    }

    public final synchronized hp9 a() {
        try {
            if (this.c == null) {
                this.c = (hp9) this.a.l.get(hp9.class);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.c;
    }

    public final ya9 b(long j2, long j3) {
        d7d d7d;
        ya9 ya9;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        String str;
        int i4;
        String str2;
        int i5;
        Boolean bool;
        d7d a2 = d7d.a(2, "SELECT * FROM messages WHERE chat_id = ? AND server_id = ?");
        a2.k(1, j2);
        a2.k(2, j3);
        i6d i6d = this.a;
        i6d.b();
        Cursor o2 = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o2, "id");
            int u2 = kne.u(o2, "server_id");
            int u3 = kne.u(o2, "time");
            int u4 = kne.u(o2, "update_time");
            int u5 = kne.u(o2, "sender");
            int u6 = kne.u(o2, "cid");
            int u7 = kne.u(o2, "text");
            int u8 = kne.u(o2, "delivery_status");
            int u9 = kne.u(o2, "status");
            int u10 = kne.u(o2, "time_local");
            int u11 = kne.u(o2, "error");
            int u12 = kne.u(o2, "localized_error");
            int u13 = kne.u(o2, "attaches");
            int u14 = kne.u(o2, "media_type");
            d7d = a2;
            try {
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
                if (o2.moveToFirst()) {
                    long j4 = o2.getLong(u);
                    long j5 = o2.getLong(u2);
                    long j6 = o2.getLong(u3);
                    long j7 = o2.getLong(u4);
                    long j8 = o2.getLong(u5);
                    long j9 = o2.getLong(u6);
                    String string = o2.isNull(u7) ? null : o2.getString(u7);
                    int i6 = o2.getInt(u8);
                    a().getClass();
                    oa9.b.getClass();
                    oa9 n2 = cd4.n(i6);
                    int i7 = o2.getInt(u9);
                    a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i7);
                    long j10 = o2.getLong(u10);
                    String string2 = o2.isNull(u11) ? null : o2.getString(u11);
                    String string3 = o2.isNull(u12) ? null : o2.getString(u12);
                    byte[] blob = o2.isNull(u13) ? null : o2.getBlob(u13);
                    a().getClass();
                    w28 b2 = qe8.b(blob);
                    int i8 = o2.getInt(u14);
                    if (o2.getInt(u15) != 0) {
                        i2 = u16;
                        z = true;
                    } else {
                        i2 = u16;
                        z = false;
                    }
                    int i9 = o2.getInt(i2);
                    long j11 = o2.getLong(u17);
                    if (o2.getInt(u18) != 0) {
                        i3 = u19;
                        z2 = true;
                    } else {
                        z2 = false;
                        i3 = u19;
                    }
                    long j12 = o2.getLong(i3);
                    int i10 = u20;
                    if (o2.isNull(i10)) {
                        i4 = u21;
                        str = null;
                    } else {
                        str = o2.getString(i10);
                        i4 = u21;
                    }
                    if (o2.isNull(i4)) {
                        i5 = u22;
                        str2 = null;
                    } else {
                        str2 = o2.getString(i4);
                        i5 = u22;
                    }
                    long j13 = o2.getLong(i5);
                    long j14 = o2.getLong(u23);
                    int i11 = o2.getInt(u24);
                    a().getClass();
                    int c2 = wj6.c(i11);
                    long j15 = o2.getLong(u25);
                    int i12 = o2.getInt(u26);
                    int i13 = o2.getInt(u27);
                    int i14 = o2.getInt(u28);
                    long j16 = o2.getLong(u29);
                    int i15 = o2.getInt(u30);
                    int i16 = o2.getInt(u31);
                    long j17 = o2.getLong(u32);
                    int i17 = u33;
                    byte[] blob2 = o2.isNull(i17) ? null : o2.getBlob(i17);
                    a().getClass();
                    List a3 = hp9.a(blob2);
                    int i18 = u34;
                    xd9 b3 = a().b(o2.isNull(i18) ? null : o2.getBlob(i18));
                    int i19 = u35;
                    Long valueOf = o2.isNull(i19) ? null : Long.valueOf(o2.getLong(i19));
                    Integer valueOf2 = o2.isNull(u36) ? null : Integer.valueOf(o2.getInt(u36));
                    if (valueOf2 == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(valueOf2.intValue() != 0);
                    }
                    ya9 = new ya9(j4, j5, j6, j7, j8, j9, string, n2, D, j10, string2, string3, b2, i8, z, i9, j11, z2, j12, str, str2, j13, j14, c2, j15, i12, i13, i14, j16, i15, i16, j17, a3, b3, valueOf, bool);
                } else {
                    ya9 = null;
                }
                o2.close();
                d7d.o();
                return ya9;
            } catch (Throwable th) {
                th = th;
                o2.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a2;
            o2.close();
            d7d.o();
            throw th;
        }
    }

    public final ya9 c(long j2) {
        d7d d7d;
        ya9 ya9;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        String str;
        int i4;
        String str2;
        int i5;
        Boolean bool;
        d7d a2 = d7d.a(1, "SELECT * FROM messages WHERE id = ?");
        a2.k(1, j2);
        i6d i6d = this.a;
        i6d.b();
        Cursor o2 = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o2, "id");
            int u2 = kne.u(o2, "server_id");
            int u3 = kne.u(o2, "time");
            int u4 = kne.u(o2, "update_time");
            int u5 = kne.u(o2, "sender");
            int u6 = kne.u(o2, "cid");
            int u7 = kne.u(o2, "text");
            int u8 = kne.u(o2, "delivery_status");
            int u9 = kne.u(o2, "status");
            int u10 = kne.u(o2, "time_local");
            int u11 = kne.u(o2, "error");
            int u12 = kne.u(o2, "localized_error");
            int u13 = kne.u(o2, "attaches");
            int u14 = kne.u(o2, "media_type");
            d7d = a2;
            try {
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
                if (o2.moveToFirst()) {
                    long j3 = o2.getLong(u);
                    long j4 = o2.getLong(u2);
                    long j5 = o2.getLong(u3);
                    long j6 = o2.getLong(u4);
                    long j7 = o2.getLong(u5);
                    long j8 = o2.getLong(u6);
                    String string = o2.isNull(u7) ? null : o2.getString(u7);
                    int i6 = o2.getInt(u8);
                    a().getClass();
                    oa9.b.getClass();
                    oa9 n2 = cd4.n(i6);
                    int i7 = o2.getInt(u9);
                    a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i7);
                    long j9 = o2.getLong(u10);
                    String string2 = o2.isNull(u11) ? null : o2.getString(u11);
                    String string3 = o2.isNull(u12) ? null : o2.getString(u12);
                    byte[] blob = o2.isNull(u13) ? null : o2.getBlob(u13);
                    a().getClass();
                    w28 b2 = qe8.b(blob);
                    int i8 = o2.getInt(u14);
                    boolean z3 = false;
                    if (o2.getInt(u15) != 0) {
                        i2 = u16;
                        z = true;
                    } else {
                        z = false;
                        i2 = u16;
                    }
                    int i9 = o2.getInt(i2);
                    long j10 = o2.getLong(u17);
                    if (o2.getInt(u18) != 0) {
                        i3 = u19;
                        z2 = true;
                    } else {
                        z2 = false;
                        i3 = u19;
                    }
                    long j11 = o2.getLong(i3);
                    int i10 = u20;
                    if (o2.isNull(i10)) {
                        i4 = u21;
                        str = null;
                    } else {
                        str = o2.getString(i10);
                        i4 = u21;
                    }
                    if (o2.isNull(i4)) {
                        i5 = u22;
                        str2 = null;
                    } else {
                        str2 = o2.getString(i4);
                        i5 = u22;
                    }
                    long j12 = o2.getLong(i5);
                    long j13 = o2.getLong(u23);
                    int i11 = o2.getInt(u24);
                    a().getClass();
                    int c2 = wj6.c(i11);
                    long j14 = o2.getLong(u25);
                    int i12 = o2.getInt(u26);
                    int i13 = o2.getInt(u27);
                    int i14 = o2.getInt(u28);
                    long j15 = o2.getLong(u29);
                    int i15 = o2.getInt(u30);
                    int i16 = o2.getInt(u31);
                    long j16 = o2.getLong(u32);
                    int i17 = u33;
                    byte[] blob2 = o2.isNull(i17) ? null : o2.getBlob(i17);
                    a().getClass();
                    List a3 = hp9.a(blob2);
                    int i18 = u34;
                    xd9 b3 = a().b(o2.isNull(i18) ? null : o2.getBlob(i18));
                    int i19 = u35;
                    Long valueOf = o2.isNull(i19) ? null : Long.valueOf(o2.getLong(i19));
                    Integer valueOf2 = o2.isNull(u36) ? null : Integer.valueOf(o2.getInt(u36));
                    if (valueOf2 == null) {
                        bool = null;
                    } else {
                        if (valueOf2.intValue() != 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                    }
                    ya9 = new ya9(j3, j4, j5, j6, j7, j8, string, n2, D, j9, string2, string3, b2, i8, z, i9, j10, z2, j11, str, str2, j12, j13, c2, j14, i12, i13, i14, j15, i15, i16, j16, a3, b3, valueOf, bool);
                } else {
                    ya9 = null;
                }
                o2.close();
                d7d.o();
                return ya9;
            } catch (Throwable th) {
                th = th;
                o2.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a2;
            o2.close();
            d7d.o();
            throw th;
        }
    }

    public final ArrayList d(long j2, long j3, boolean z, long j4) {
        ArrayList arrayList;
        d7d d7d;
        String str;
        int i2;
        String str2;
        int i3;
        int i4;
        int i5;
        byte[] bArr;
        Long l2;
        int i6;
        Boolean bool;
        d7d d7d2;
        String str3;
        int i7;
        String str4;
        int i8;
        int i9;
        int i10;
        byte[] bArr2;
        Long l3;
        int i11;
        Boolean bool2;
        long j5 = j2;
        long j6 = j3;
        long j7 = j4;
        String str5 = "delayed_attrs_notify_sender";
        String str6 = "delayed_attrs_time_to_fire";
        String str7 = "reactions";
        String str8 = "elements";
        String str9 = "live_until";
        String str10 = "options";
        String str11 = "zoom";
        String str12 = "view_time";
        String str13 = "channel_forwards";
        String str14 = "channel_views";
        String str15 = "ttl";
        String str16 = "chat_id";
        String str17 = "type";
        String str18 = "msg_link_out_msg_id";
        String str19 = "msg_link_out_chat_id";
        String str20 = "msg_link_chat_link";
        String str21 = "msg_link_chat_name";
        String str22 = "msg_link_chat_id";
        String str23 = "inserted_from_msg_link";
        String str24 = "msg_link_id";
        String str25 = "msg_link_type";
        String str26 = "detect_share";
        String str27 = "media_type";
        String str28 = "attaches";
        String str29 = "localized_error";
        String str30 = "error";
        String str31 = "time_local";
        String str32 = "status";
        i6d i6d = this.a;
        String str33 = "delivery_status";
        if (z) {
            sq6 sq6 = qe9.b;
            String str34 = "text";
            d7d a2 = d7d.a(5, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC, time_local DESC LIMIT ?");
            a2.k(1, j5);
            a2.k(2, j6);
            i2a.o(a2, 3, j7, this);
            a2.k(4, (long) 10);
            a2.k(5, (long) 40);
            i6d.b();
            Cursor o2 = i6d.o(a2, (CancellationSignal) null);
            try {
                int u = kne.u(o2, "id");
                int u2 = kne.u(o2, "server_id");
                int u3 = kne.u(o2, "time");
                int u4 = kne.u(o2, "update_time");
                int u5 = kne.u(o2, "sender");
                int u6 = kne.u(o2, "cid");
                int u7 = kne.u(o2, str34);
                int u8 = kne.u(o2, str33);
                int u9 = kne.u(o2, str32);
                int u10 = kne.u(o2, str31);
                int u11 = kne.u(o2, str30);
                int u12 = kne.u(o2, str29);
                int u13 = kne.u(o2, str28);
                int u14 = kne.u(o2, str27);
                d7d2 = a2;
                try {
                    int u15 = kne.u(o2, str26);
                    int u16 = kne.u(o2, str25);
                    int u17 = kne.u(o2, str24);
                    int u18 = kne.u(o2, str23);
                    int u19 = kne.u(o2, str22);
                    int u20 = kne.u(o2, str21);
                    int u21 = kne.u(o2, str20);
                    int u22 = kne.u(o2, str19);
                    int u23 = kne.u(o2, str18);
                    int u24 = kne.u(o2, str17);
                    int u25 = kne.u(o2, str16);
                    int u26 = kne.u(o2, str15);
                    int u27 = kne.u(o2, str14);
                    int u28 = kne.u(o2, str13);
                    int u29 = kne.u(o2, str12);
                    int u30 = kne.u(o2, str11);
                    int u31 = kne.u(o2, str10);
                    int u32 = kne.u(o2, str9);
                    int u33 = kne.u(o2, str8);
                    int u34 = kne.u(o2, str7);
                    int u35 = kne.u(o2, str6);
                    int u36 = kne.u(o2, str5);
                    int i12 = u14;
                    arrayList = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        long j8 = o2.getLong(u);
                        long j9 = o2.getLong(u2);
                        long j10 = o2.getLong(u3);
                        long j11 = o2.getLong(u4);
                        long j12 = o2.getLong(u5);
                        long j13 = o2.getLong(u6);
                        String string = o2.isNull(u7) ? null : o2.getString(u7);
                        int i13 = o2.getInt(u8);
                        a().getClass();
                        oa9.b.getClass();
                        oa9 n2 = cd4.n(i13);
                        int i14 = o2.getInt(u9);
                        a().getClass();
                        qe9.b.getClass();
                        qe9 D = sq6.D(i14);
                        long j14 = o2.getLong(u10);
                        String string2 = o2.isNull(u11) ? null : o2.getString(u11);
                        String string3 = o2.isNull(u12) ? null : o2.getString(u12);
                        byte[] blob = o2.isNull(u13) ? null : o2.getBlob(u13);
                        a().getClass();
                        w28 b2 = qe8.b(blob);
                        int i15 = i12;
                        int i16 = o2.getInt(i15);
                        i12 = i15;
                        int i17 = u15;
                        u15 = i17;
                        boolean z2 = o2.getInt(i17) != 0;
                        int i18 = u16;
                        int i19 = o2.getInt(i18);
                        u16 = i18;
                        int i20 = u17;
                        long j15 = o2.getLong(i20);
                        u17 = i20;
                        int i21 = u18;
                        u18 = i21;
                        boolean z3 = o2.getInt(i21) != 0;
                        int i22 = u19;
                        long j16 = o2.getLong(i22);
                        u19 = i22;
                        int i23 = u20;
                        if (o2.isNull(i23)) {
                            u20 = i23;
                            i7 = u21;
                            str3 = null;
                        } else {
                            String string4 = o2.getString(i23);
                            u20 = i23;
                            i7 = u21;
                            str3 = string4;
                        }
                        if (o2.isNull(i7)) {
                            u21 = i7;
                            i8 = u22;
                            str4 = null;
                        } else {
                            str4 = o2.getString(i7);
                            u21 = i7;
                            i8 = u22;
                        }
                        long j17 = o2.getLong(i8);
                        u22 = i8;
                        int i24 = u23;
                        long j18 = o2.getLong(i24);
                        u23 = i24;
                        int i25 = u24;
                        int i26 = o2.getInt(i25);
                        a().getClass();
                        int c2 = wj6.c(i26);
                        u24 = i25;
                        int i27 = u25;
                        long j19 = o2.getLong(i27);
                        u25 = i27;
                        int i28 = u26;
                        int i29 = o2.getInt(i28);
                        u26 = i28;
                        int i30 = u27;
                        int i31 = o2.getInt(i30);
                        u27 = i30;
                        int i32 = u28;
                        int i33 = o2.getInt(i32);
                        u28 = i32;
                        int i34 = u29;
                        long j20 = o2.getLong(i34);
                        u29 = i34;
                        int i35 = u30;
                        int i36 = o2.getInt(i35);
                        u30 = i35;
                        int i37 = u31;
                        int i38 = o2.getInt(i37);
                        u31 = i37;
                        int i39 = u32;
                        long j21 = o2.getLong(i39);
                        u32 = i39;
                        int i40 = u33;
                        byte[] blob2 = o2.isNull(i40) ? null : o2.getBlob(i40);
                        a().getClass();
                        List a3 = hp9.a(blob2);
                        u33 = i40;
                        int i41 = u34;
                        if (o2.isNull(i41)) {
                            i9 = i41;
                            i10 = u;
                            bArr2 = null;
                        } else {
                            i9 = i41;
                            bArr2 = o2.getBlob(i41);
                            i10 = u;
                        }
                        xd9 b3 = a().b(bArr2);
                        int i42 = u35;
                        if (o2.isNull(i42)) {
                            i11 = u36;
                            l3 = null;
                        } else {
                            l3 = Long.valueOf(o2.getLong(i42));
                            i11 = u36;
                        }
                        Integer valueOf = o2.isNull(i11) ? null : Integer.valueOf(o2.getInt(i11));
                        if (valueOf == null) {
                            u35 = i42;
                            bool2 = null;
                        } else {
                            u35 = i42;
                            bool2 = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        arrayList.add(new ya9(j8, j9, j10, j11, j12, j13, string, n2, D, j14, string2, string3, b2, i16, z2, i19, j15, z3, j16, str3, str4, j17, j18, c2, j19, i29, i31, i33, j20, i36, i38, j21, a3, b3, l3, bool2));
                        u36 = i11;
                        u = i10;
                        u34 = i9;
                    }
                    o2.close();
                    d7d2.o();
                } catch (Throwable th) {
                    th = th;
                    o2.close();
                    d7d2.o();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                d7d2 = a2;
                o2.close();
                d7d2.o();
                throw th;
            }
        } else {
            String str35 = "text";
            String str36 = str32;
            sq6 sq62 = qe9.b;
            String str37 = str36;
            String str38 = str33;
            d7d a4 = d7d.a(5, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC, time_local ASC LIMIT ?");
            a4.k(1, j5);
            a4.k(2, j6);
            String str39 = str27;
            i2a.o(a4, 3, j7, this);
            a4.k(4, (long) 10);
            a4.k(5, (long) 40);
            i6d.b();
            Cursor o3 = i6d.o(a4, (CancellationSignal) null);
            try {
                int u37 = kne.u(o3, "id");
                int u38 = kne.u(o3, "server_id");
                int u39 = kne.u(o3, "time");
                int u40 = kne.u(o3, "update_time");
                int u41 = kne.u(o3, "sender");
                int u42 = kne.u(o3, "cid");
                int u43 = kne.u(o3, str35);
                int u44 = kne.u(o3, str38);
                int u45 = kne.u(o3, str37);
                int u46 = kne.u(o3, str31);
                int u47 = kne.u(o3, str30);
                int u48 = kne.u(o3, str29);
                int u49 = kne.u(o3, str28);
                int u50 = kne.u(o3, str39);
                d7d = a4;
                try {
                    int u51 = kne.u(o3, str26);
                    int u52 = kne.u(o3, str25);
                    int u53 = kne.u(o3, str24);
                    int u54 = kne.u(o3, str23);
                    int u55 = kne.u(o3, str22);
                    int u56 = kne.u(o3, str21);
                    int u57 = kne.u(o3, str20);
                    int u58 = kne.u(o3, str19);
                    int u59 = kne.u(o3, str18);
                    int u60 = kne.u(o3, str17);
                    int u61 = kne.u(o3, str16);
                    int u62 = kne.u(o3, str15);
                    int u63 = kne.u(o3, str14);
                    int u64 = kne.u(o3, str13);
                    int u65 = kne.u(o3, str12);
                    int u66 = kne.u(o3, str11);
                    int u67 = kne.u(o3, str10);
                    int u68 = kne.u(o3, str9);
                    int u69 = kne.u(o3, str8);
                    int u70 = kne.u(o3, str7);
                    int u71 = kne.u(o3, str6);
                    int u72 = kne.u(o3, str5);
                    int i43 = u50;
                    arrayList = new ArrayList(o3.getCount());
                    while (o3.moveToNext()) {
                        long j22 = o3.getLong(u37);
                        long j23 = o3.getLong(u38);
                        long j24 = o3.getLong(u39);
                        long j25 = o3.getLong(u40);
                        long j26 = o3.getLong(u41);
                        long j27 = o3.getLong(u42);
                        String string5 = o3.isNull(u43) ? null : o3.getString(u43);
                        int i44 = o3.getInt(u44);
                        a().getClass();
                        oa9.b.getClass();
                        oa9 n3 = cd4.n(i44);
                        int i45 = o3.getInt(u45);
                        a().getClass();
                        qe9.b.getClass();
                        qe9 D2 = sq6.D(i45);
                        long j28 = o3.getLong(u46);
                        String string6 = o3.isNull(u47) ? null : o3.getString(u47);
                        String string7 = o3.isNull(u48) ? null : o3.getString(u48);
                        byte[] blob3 = o3.isNull(u49) ? null : o3.getBlob(u49);
                        a().getClass();
                        w28 b4 = qe8.b(blob3);
                        int i46 = i43;
                        int i47 = o3.getInt(i46);
                        int i48 = u47;
                        int i49 = u51;
                        u51 = i49;
                        boolean z4 = o3.getInt(i49) != 0;
                        int i50 = u52;
                        int i51 = o3.getInt(i50);
                        u52 = i50;
                        int i52 = u53;
                        long j29 = o3.getLong(i52);
                        u53 = i52;
                        int i53 = u54;
                        u54 = i53;
                        boolean z5 = o3.getInt(i53) != 0;
                        int i54 = u55;
                        long j30 = o3.getLong(i54);
                        u55 = i54;
                        int i55 = u56;
                        if (o3.isNull(i55)) {
                            u56 = i55;
                            i2 = u57;
                            str = null;
                        } else {
                            String string8 = o3.getString(i55);
                            u56 = i55;
                            i2 = u57;
                            str = string8;
                        }
                        if (o3.isNull(i2)) {
                            u57 = i2;
                            i3 = u58;
                            str2 = null;
                        } else {
                            str2 = o3.getString(i2);
                            u57 = i2;
                            i3 = u58;
                        }
                        long j31 = o3.getLong(i3);
                        u58 = i3;
                        int i56 = u59;
                        long j32 = o3.getLong(i56);
                        u59 = i56;
                        int i57 = u60;
                        int i58 = o3.getInt(i57);
                        a().getClass();
                        int c3 = wj6.c(i58);
                        u60 = i57;
                        int i59 = u61;
                        long j33 = o3.getLong(i59);
                        u61 = i59;
                        int i60 = u62;
                        int i61 = o3.getInt(i60);
                        u62 = i60;
                        int i62 = u63;
                        int i63 = o3.getInt(i62);
                        u63 = i62;
                        int i64 = u64;
                        int i65 = o3.getInt(i64);
                        u64 = i64;
                        int i66 = u65;
                        long j34 = o3.getLong(i66);
                        u65 = i66;
                        int i67 = u66;
                        int i68 = o3.getInt(i67);
                        u66 = i67;
                        int i69 = u67;
                        int i70 = o3.getInt(i69);
                        u67 = i69;
                        int i71 = u68;
                        long j35 = o3.getLong(i71);
                        u68 = i71;
                        int i72 = u69;
                        byte[] blob4 = o3.isNull(i72) ? null : o3.getBlob(i72);
                        a().getClass();
                        List a5 = hp9.a(blob4);
                        u69 = i72;
                        int i73 = u70;
                        if (o3.isNull(i73)) {
                            i4 = i73;
                            i5 = u49;
                            bArr = null;
                        } else {
                            i4 = i73;
                            bArr = o3.getBlob(i73);
                            i5 = u49;
                        }
                        xd9 b5 = a().b(bArr);
                        int i74 = u71;
                        if (o3.isNull(i74)) {
                            i6 = u72;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(o3.getLong(i74));
                            i6 = u72;
                        }
                        Integer valueOf2 = o3.isNull(i6) ? null : Integer.valueOf(o3.getInt(i6));
                        if (valueOf2 == null) {
                            u71 = i74;
                            bool = null;
                        } else {
                            u71 = i74;
                            bool = Boolean.valueOf(valueOf2.intValue() != 0);
                        }
                        arrayList.add(new ya9(j22, j23, j24, j25, j26, j27, string5, n3, D2, j28, string6, string7, b4, i47, z4, i51, j29, z5, j30, str, str2, j31, j32, c3, j33, i61, i63, i65, j34, i68, i70, j35, a5, b5, l2, bool));
                        u72 = i6;
                        u49 = i5;
                        u47 = i48;
                        u70 = i4;
                        i43 = i46;
                    }
                    o3.close();
                    d7d.o();
                } catch (Throwable th3) {
                    th = th3;
                    o3.close();
                    d7d.o();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                d7d = a4;
                o3.close();
                d7d.o();
                throw th;
            }
        }
        return arrayList;
    }

    public final void e(long j2) {
        i6d i6d = this.a;
        i6d.b();
        uf9 uf9 = this.o;
        gf6 E = uf9.E();
        E.k(1, j2);
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

    public final long f(ya9 ya9) {
        i6d i6d = this.a;
        i6d.b();
        i6d.c();
        try {
            long d0 = this.b.d0(ya9);
            i6d.r();
            return d0;
        } finally {
            i6d.l();
        }
    }

    public final ya9 h(long j2, long j3) {
        d7d d7d;
        ya9 ya9;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        String str;
        int i4;
        String str2;
        int i5;
        Boolean bool;
        d7d a2 = d7d.a(2, "SELECT * FROM messages WHERE chat_id = ? AND cid = ?");
        a2.k(1, j2);
        a2.k(2, j3);
        i6d i6d = this.a;
        i6d.b();
        Cursor o2 = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o2, "id");
            int u2 = kne.u(o2, "server_id");
            int u3 = kne.u(o2, "time");
            int u4 = kne.u(o2, "update_time");
            int u5 = kne.u(o2, "sender");
            int u6 = kne.u(o2, "cid");
            int u7 = kne.u(o2, "text");
            int u8 = kne.u(o2, "delivery_status");
            int u9 = kne.u(o2, "status");
            int u10 = kne.u(o2, "time_local");
            int u11 = kne.u(o2, "error");
            int u12 = kne.u(o2, "localized_error");
            int u13 = kne.u(o2, "attaches");
            int u14 = kne.u(o2, "media_type");
            d7d = a2;
            try {
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
                if (o2.moveToFirst()) {
                    long j4 = o2.getLong(u);
                    long j5 = o2.getLong(u2);
                    long j6 = o2.getLong(u3);
                    long j7 = o2.getLong(u4);
                    long j8 = o2.getLong(u5);
                    long j9 = o2.getLong(u6);
                    String string = o2.isNull(u7) ? null : o2.getString(u7);
                    int i6 = o2.getInt(u8);
                    a().getClass();
                    oa9.b.getClass();
                    oa9 n2 = cd4.n(i6);
                    int i7 = o2.getInt(u9);
                    a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i7);
                    long j10 = o2.getLong(u10);
                    String string2 = o2.isNull(u11) ? null : o2.getString(u11);
                    String string3 = o2.isNull(u12) ? null : o2.getString(u12);
                    byte[] blob = o2.isNull(u13) ? null : o2.getBlob(u13);
                    a().getClass();
                    w28 b2 = qe8.b(blob);
                    int i8 = o2.getInt(u14);
                    if (o2.getInt(u15) != 0) {
                        i2 = u16;
                        z = true;
                    } else {
                        i2 = u16;
                        z = false;
                    }
                    int i9 = o2.getInt(i2);
                    long j11 = o2.getLong(u17);
                    if (o2.getInt(u18) != 0) {
                        i3 = u19;
                        z2 = true;
                    } else {
                        z2 = false;
                        i3 = u19;
                    }
                    long j12 = o2.getLong(i3);
                    int i10 = u20;
                    if (o2.isNull(i10)) {
                        i4 = u21;
                        str = null;
                    } else {
                        str = o2.getString(i10);
                        i4 = u21;
                    }
                    if (o2.isNull(i4)) {
                        i5 = u22;
                        str2 = null;
                    } else {
                        str2 = o2.getString(i4);
                        i5 = u22;
                    }
                    long j13 = o2.getLong(i5);
                    long j14 = o2.getLong(u23);
                    int i11 = o2.getInt(u24);
                    a().getClass();
                    int c2 = wj6.c(i11);
                    long j15 = o2.getLong(u25);
                    int i12 = o2.getInt(u26);
                    int i13 = o2.getInt(u27);
                    int i14 = o2.getInt(u28);
                    long j16 = o2.getLong(u29);
                    int i15 = o2.getInt(u30);
                    int i16 = o2.getInt(u31);
                    long j17 = o2.getLong(u32);
                    int i17 = u33;
                    byte[] blob2 = o2.isNull(i17) ? null : o2.getBlob(i17);
                    a().getClass();
                    List a3 = hp9.a(blob2);
                    int i18 = u34;
                    xd9 b3 = a().b(o2.isNull(i18) ? null : o2.getBlob(i18));
                    int i19 = u35;
                    Long valueOf = o2.isNull(i19) ? null : Long.valueOf(o2.getLong(i19));
                    Integer valueOf2 = o2.isNull(u36) ? null : Integer.valueOf(o2.getInt(u36));
                    if (valueOf2 == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(valueOf2.intValue() != 0);
                    }
                    ya9 = new ya9(j4, j5, j6, j7, j8, j9, string, n2, D, j10, string2, string3, b2, i8, z, i9, j11, z2, j12, str, str2, j13, j14, c2, j15, i12, i13, i14, j16, i15, i16, j17, a3, b3, valueOf, bool);
                } else {
                    ya9 = null;
                }
                o2.close();
                d7d.o();
                return ya9;
            } catch (Throwable th) {
                th = th;
                o2.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a2;
            o2.close();
            d7d.o();
            throw th;
        }
    }

    public final Long i(long j2, long j3) {
        d7d a2 = d7d.a(2, "SELECT id FROM messages WHERE chat_id = ? AND server_id = ?");
        a2.k(1, j2);
        a2.k(2, j3);
        i6d i6d = this.a;
        i6d.b();
        Long l2 = null;
        Cursor o2 = i6d.o(a2, (CancellationSignal) null);
        try {
            if (o2.moveToFirst()) {
                if (!o2.isNull(0)) {
                    l2 = Long.valueOf(o2.getLong(0));
                }
            }
            return l2;
        } finally {
            o2.close();
            a2.o();
        }
    }

    public final long k(long j2) {
        d7d a2 = d7d.a(1, "SELECT time FROM messages WHERE id = ?");
        a2.k(1, j2);
        i6d i6d = this.a;
        i6d.b();
        Cursor o2 = i6d.o(a2, (CancellationSignal) null);
        try {
            return o2.moveToFirst() ? o2.getLong(0) : 0;
        } finally {
            o2.close();
            a2.o();
        }
    }

    public final int l(id9 id9) {
        i6d i6d = this.a;
        i6d.b();
        i6d.c();
        try {
            int a0 = this.d.a0(id9);
            i6d.r();
            return a0;
        } finally {
            i6d.l();
        }
    }

    public final int m(iwf iwf) {
        i6d i6d = this.a;
        i6d.b();
        i6d.c();
        try {
            int a0 = this.e.a0(iwf);
            i6d.r();
            return a0;
        } finally {
            i6d.l();
        }
    }

    public final void n(long j2, oa9 oa9) {
        i6d i6d = this.a;
        i6d.b();
        uf9 uf9 = this.g;
        gf6 E = uf9.E();
        a().getClass();
        E.k(1, (long) oa9.a);
        E.k(2, j2);
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

    public final void o(long j2, List list, qe9 qe9) {
        i6d i6d = this.a;
        i6d.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE messages SET status = ? WHERE chat_id = ? AND id in (");
        n79.c(sb, list.size());
        sb.append(")");
        gf6 d2 = i6d.d(sb.toString());
        a().getClass();
        d2.k(1, (long) qe9.a);
        d2.k(2, j2);
        Iterator it = list.iterator();
        int i2 = 3;
        while (it.hasNext()) {
            Long l2 = (Long) it.next();
            if (l2 == null) {
                d2.X(i2);
            } else {
                d2.k(i2, l2.longValue());
            }
            i2++;
        }
        i6d.c();
        try {
            d2.n();
            i6d.r();
        } finally {
            i6d.l();
        }
    }
}
