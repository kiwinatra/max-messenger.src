package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: wqa  reason: default package */
public final class wqa implements dz6 {
    public final long b;
    public final a07 c;
    public final Lazy d;
    public final Lazy e;
    public boolean f;
    public final oj4 g = new oj4(16);

    public wqa(Lazy lazy, Lazy lazy2, long j, a07 a07) {
        this.b = j;
        this.c = a07;
        this.d = lazy;
        this.e = lazy2;
    }

    public final boolean a() {
        return false;
    }

    public final void b() {
        this.f = true;
    }

    public final Comparator c() {
        return new oj4(17);
    }

    public final l03 d(long j) {
        return m58.o(j, i());
    }

    public final Comparator e() {
        return this.g;
    }

    public final l03 f(long j) {
        return m58.n(j, i());
    }

    public final long g() {
        d7d d7d;
        cl4 cl4;
        String str;
        int i;
        boolean z;
        int i2;
        boolean z2;
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
        if (!this.f) {
            return 0;
        }
        z6d z6d = ((to9) this.e.getValue()).a;
        aj9 d2 = z6d.d();
        sq6 sq6 = qe9.b;
        d2.getClass();
        d7d a = d7d.a(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
        i2a.o(a, 1, this.b, d2);
        a.k(2, (long) 10);
        a.k(3, 1);
        i6d i6d = d2.a;
        i6d.b();
        Cursor o = i6d.o(a, (CancellationSignal) null);
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
            d7d = a;
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
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(u);
                    long j2 = o.getLong(u2);
                    long j3 = o.getLong(u3);
                    long j4 = o.getLong(u4);
                    long j5 = o.getLong(u5);
                    long j6 = o.getLong(u6);
                    String string = o.isNull(u7) ? null : o.getString(u7);
                    int i10 = o.getInt(u8);
                    d2.a().getClass();
                    oa9.b.getClass();
                    oa9 n = cd4.n(i10);
                    int i11 = o.getInt(u9);
                    d2.a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i11);
                    long j7 = o.getLong(u10);
                    String string2 = o.isNull(u11) ? null : o.getString(u11);
                    if (o.isNull(u12)) {
                        i = i9;
                        str = null;
                    } else {
                        str = o.getString(u12);
                        i = i9;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    d2.a().getClass();
                    w28 b2 = qe8.b(blob);
                    int i12 = u12;
                    int i13 = u14;
                    int i14 = o.getInt(i13);
                    u14 = i13;
                    int i15 = u15;
                    boolean z3 = false;
                    if (o.getInt(i15) != 0) {
                        u15 = i15;
                        i2 = u16;
                        z = true;
                    } else {
                        u15 = i15;
                        i2 = u16;
                        z = false;
                    }
                    int i16 = o.getInt(i2);
                    u16 = i2;
                    int i17 = u17;
                    long j8 = o.getLong(i17);
                    u17 = i17;
                    int i18 = u18;
                    if (o.getInt(i18) != 0) {
                        u18 = i18;
                        i3 = u19;
                        z2 = true;
                    } else {
                        u18 = i18;
                        i3 = u19;
                        z2 = false;
                    }
                    long j9 = o.getLong(i3);
                    u19 = i3;
                    int i19 = u20;
                    if (o.isNull(i19)) {
                        u20 = i19;
                        i4 = u21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i19);
                        u20 = i19;
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
                    long j10 = o.getLong(i5);
                    u22 = i5;
                    int i20 = u23;
                    long j11 = o.getLong(i20);
                    u23 = i20;
                    int i21 = u24;
                    int i22 = o.getInt(i21);
                    d2.a().getClass();
                    int c2 = wj6.c(i22);
                    u24 = i21;
                    int i23 = u25;
                    long j12 = o.getLong(i23);
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
                    long j13 = o.getLong(i30);
                    u29 = i30;
                    int i31 = u30;
                    int i32 = o.getInt(i31);
                    u30 = i31;
                    int i33 = u31;
                    int i34 = o.getInt(i33);
                    u31 = i33;
                    int i35 = u32;
                    long j14 = o.getLong(i35);
                    u32 = i35;
                    int i36 = u33;
                    byte[] blob2 = o.isNull(i36) ? null : o.getBlob(i36);
                    d2.a().getClass();
                    List a2 = hp9.a(blob2);
                    u33 = i36;
                    int i37 = u34;
                    if (o.isNull(i37)) {
                        i6 = i37;
                        i7 = i;
                        bArr = null;
                    } else {
                        i6 = i37;
                        bArr = o.getBlob(i37);
                        i7 = i;
                    }
                    xd9 b3 = d2.a().b(bArr);
                    int i38 = u35;
                    if (o.isNull(i38)) {
                        i8 = u36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i38));
                        i8 = u36;
                    }
                    Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
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
                    arrayList.add(new ya9(j, j2, j3, j4, j5, j6, string, n, D, j7, string2, str, b2, i14, z, i16, j8, z2, j9, str2, str3, j10, j11, c2, j12, i25, i27, i29, j13, i32, i34, j14, a2, b3, l, bool));
                    u36 = i8;
                    u12 = i12;
                    i9 = i7;
                    u34 = i6;
                }
                o.close();
                d7d.o();
                ya9 ya9 = (ya9) CollectionsKt.firstOrNull(arrayList);
                ha9 b4 = ya9 != null ? z6d2.b(ya9) : null;
                if (b4 == null || (cl4 = b4.R0) == null || !this.c.z(cl4.a)) {
                    return 0;
                }
                return b4.b;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a;
            o.close();
            d7d.o();
            throw th;
        }
    }

    public final long h() {
        cl4 cl4;
        z6d z6d = ((to9) this.e.getValue()).a;
        ya9 ya9 = (ya9) CollectionsKt.firstOrNull(aj9.j(z6d.d(), this.b));
        ha9 b2 = ya9 != null ? z6d.b(ya9) : null;
        if (b2 == null || (cl4 = b2.R0) == null || !this.c.z(cl4.a)) {
            return 0;
        }
        return b2.b;
    }

    public final List i() {
        return ((a32) ev0.C(EmptyCoroutineContext.INSTANCE, new vqa(this, (Continuation) null))).b.n.d(bl4.DELAYED);
    }
}
