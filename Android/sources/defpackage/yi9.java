package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: yi9  reason: default package */
public final class yi9 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7d b;
    public final /* synthetic */ aj9 c;

    public /* synthetic */ yi9(aj9 aj9, d7d d7d, int i) {
        this.a = i;
        this.c = aj9;
        this.b = d7d;
    }

    private final Object a() {
        d7d d7d;
        String str;
        int i;
        boolean z;
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
        aj9 aj9 = this.c;
        i6d i6d = aj9.a;
        d7d d7d2 = this.b;
        Cursor o = i6d.o(d7d2, (CancellationSignal) null);
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
            int u13 = kne.u(o, "attaches");
            d7d = d7d2;
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
                int i8 = u13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(u);
                    long j2 = o.getLong(u2);
                    long j3 = o.getLong(u3);
                    long j4 = o.getLong(u4);
                    long j5 = o.getLong(u5);
                    long j6 = o.getLong(u6);
                    String string = o.isNull(u7) ? null : o.getString(u7);
                    int i9 = o.getInt(u8);
                    aj9.a().getClass();
                    oa9.b.getClass();
                    oa9 n = cd4.n(i9);
                    int i10 = o.getInt(u9);
                    aj9.a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i10);
                    long j7 = o.getLong(u10);
                    String string2 = o.isNull(u11) ? null : o.getString(u11);
                    if (o.isNull(u12)) {
                        i = i8;
                        str = null;
                    } else {
                        str = o.getString(u12);
                        i = i8;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    aj9.a().getClass();
                    w28 b2 = qe8.b(blob);
                    i8 = i;
                    int i11 = u14;
                    int i12 = o.getInt(i11);
                    u14 = i11;
                    int i13 = u15;
                    boolean z2 = false;
                    boolean z3 = o.getInt(i13) != 0;
                    int i14 = u16;
                    int i15 = i13;
                    int i16 = i14;
                    int i17 = o.getInt(i16);
                    int i18 = i16;
                    int i19 = u17;
                    long j8 = o.getLong(i19);
                    u17 = i19;
                    int i20 = u18;
                    if (o.getInt(i20) != 0) {
                        u18 = i20;
                        i2 = u19;
                        z = true;
                    } else {
                        u18 = i20;
                        i2 = u19;
                        z = false;
                    }
                    long j9 = o.getLong(i2);
                    u19 = i2;
                    int i21 = u20;
                    if (o.isNull(i21)) {
                        u20 = i21;
                        i3 = u21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i21);
                        u20 = i21;
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
                    long j10 = o.getLong(i4);
                    u22 = i4;
                    int i22 = u23;
                    long j11 = o.getLong(i22);
                    u23 = i22;
                    int i23 = u24;
                    int i24 = o.getInt(i23);
                    aj9.a().getClass();
                    int c2 = wj6.c(i24);
                    u24 = i23;
                    int i25 = u25;
                    long j12 = o.getLong(i25);
                    u25 = i25;
                    int i26 = u26;
                    int i27 = o.getInt(i26);
                    u26 = i26;
                    int i28 = u27;
                    int i29 = o.getInt(i28);
                    u27 = i28;
                    int i30 = u28;
                    int i31 = o.getInt(i30);
                    u28 = i30;
                    int i32 = u29;
                    long j13 = o.getLong(i32);
                    u29 = i32;
                    int i33 = u30;
                    int i34 = o.getInt(i33);
                    u30 = i33;
                    int i35 = u31;
                    int i36 = o.getInt(i35);
                    u31 = i35;
                    int i37 = u32;
                    long j14 = o.getLong(i37);
                    u32 = i37;
                    int i38 = u33;
                    byte[] blob2 = o.isNull(i38) ? null : o.getBlob(i38);
                    aj9.a().getClass();
                    List a2 = hp9.a(blob2);
                    u33 = i38;
                    int i39 = u34;
                    if (o.isNull(i39)) {
                        i5 = i39;
                        i6 = u;
                        bArr = null;
                    } else {
                        i5 = i39;
                        bArr = o.getBlob(i39);
                        i6 = u;
                    }
                    xd9 b3 = aj9.a().b(bArr);
                    int i40 = u35;
                    if (o.isNull(i40)) {
                        i7 = u36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i40));
                        i7 = u36;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        u35 = i40;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        u35 = i40;
                    }
                    arrayList.add(new ya9(j, j2, j3, j4, j5, j6, string, n, D, j7, string2, str, b2, i12, z3, i17, j8, z, j9, str2, str3, j10, j11, c2, j12, i27, i29, i31, j13, i34, i36, j14, a2, b3, l, bool));
                    u36 = i7;
                    u15 = i15;
                    u = i6;
                    u16 = i18;
                    u34 = i5;
                }
                o.close();
                d7d.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = d7d2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    private final Object b() {
        d7d d7d;
        ya9 ya9;
        String str;
        int i;
        String str2;
        int i2;
        Boolean bool;
        aj9 aj9 = this.c;
        i6d i6d = aj9.a;
        d7d d7d2 = this.b;
        Cursor o = i6d.o(d7d2, (CancellationSignal) null);
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
            int u13 = kne.u(o, "attaches");
            d7d = d7d2;
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
                if (o.moveToFirst()) {
                    long j = o.getLong(u);
                    long j2 = o.getLong(u2);
                    long j3 = o.getLong(u3);
                    long j4 = o.getLong(u4);
                    long j5 = o.getLong(u5);
                    long j6 = o.getLong(u6);
                    String string = o.isNull(u7) ? null : o.getString(u7);
                    int i3 = o.getInt(u8);
                    aj9.a().getClass();
                    oa9.b.getClass();
                    oa9 n = cd4.n(i3);
                    int i4 = o.getInt(u9);
                    aj9.a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i4);
                    long j7 = o.getLong(u10);
                    String string2 = o.isNull(u11) ? null : o.getString(u11);
                    String string3 = o.isNull(u12) ? null : o.getString(u12);
                    byte[] blob = o.isNull(u13) ? null : o.getBlob(u13);
                    aj9.a().getClass();
                    w28 b2 = qe8.b(blob);
                    int i5 = o.getInt(u14);
                    boolean z = false;
                    boolean z2 = o.getInt(u15) != 0;
                    int i6 = o.getInt(u16);
                    long j8 = o.getLong(u17);
                    boolean z3 = o.getInt(u18) != 0;
                    long j9 = o.getLong(u19);
                    int i7 = u20;
                    if (o.isNull(i7)) {
                        i = u21;
                        str = null;
                    } else {
                        str = o.getString(i7);
                        i = u21;
                    }
                    if (o.isNull(i)) {
                        i2 = u22;
                        str2 = null;
                    } else {
                        str2 = o.getString(i);
                        i2 = u22;
                    }
                    long j10 = o.getLong(i2);
                    long j11 = o.getLong(u23);
                    int i8 = o.getInt(u24);
                    aj9.a().getClass();
                    int c2 = wj6.c(i8);
                    long j12 = o.getLong(u25);
                    int i9 = o.getInt(u26);
                    int i10 = o.getInt(u27);
                    int i11 = o.getInt(u28);
                    long j13 = o.getLong(u29);
                    int i12 = o.getInt(u30);
                    int i13 = o.getInt(u31);
                    long j14 = o.getLong(u32);
                    int i14 = u33;
                    byte[] blob2 = o.isNull(i14) ? null : o.getBlob(i14);
                    aj9.a().getClass();
                    List a2 = hp9.a(blob2);
                    int i15 = u34;
                    xd9 b3 = aj9.a().b(o.isNull(i15) ? null : o.getBlob(i15));
                    int i16 = u35;
                    Long valueOf = o.isNull(i16) ? null : Long.valueOf(o.getLong(i16));
                    Integer valueOf2 = o.isNull(u36) ? null : Integer.valueOf(o.getInt(u36));
                    if (valueOf2 == null) {
                        bool = null;
                    } else {
                        if (valueOf2.intValue() != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    }
                    ya9 = new ya9(j, j2, j3, j4, j5, j6, string, n, D, j7, string2, string3, b2, i5, z2, i6, j8, z3, j9, str, str2, j10, j11, c2, j12, i9, i10, i11, j13, i12, i13, j14, a2, b3, valueOf, bool);
                } else {
                    ya9 = null;
                }
                o.close();
                d7d.o();
                return ya9;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = d7d2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    private final Object c() {
        d7d d7d;
        String str;
        int i;
        boolean z;
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
        aj9 aj9 = this.c;
        i6d i6d = aj9.a;
        d7d d7d2 = this.b;
        Cursor o = i6d.o(d7d2, (CancellationSignal) null);
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
            int u13 = kne.u(o, "attaches");
            d7d = d7d2;
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
                int i8 = u13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(u);
                    long j2 = o.getLong(u2);
                    long j3 = o.getLong(u3);
                    long j4 = o.getLong(u4);
                    long j5 = o.getLong(u5);
                    long j6 = o.getLong(u6);
                    String string = o.isNull(u7) ? null : o.getString(u7);
                    int i9 = o.getInt(u8);
                    aj9.a().getClass();
                    oa9.b.getClass();
                    oa9 n = cd4.n(i9);
                    int i10 = o.getInt(u9);
                    aj9.a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i10);
                    long j7 = o.getLong(u10);
                    String string2 = o.isNull(u11) ? null : o.getString(u11);
                    if (o.isNull(u12)) {
                        i = i8;
                        str = null;
                    } else {
                        str = o.getString(u12);
                        i = i8;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    aj9.a().getClass();
                    w28 b2 = qe8.b(blob);
                    i8 = i;
                    int i11 = u14;
                    int i12 = o.getInt(i11);
                    u14 = i11;
                    int i13 = u15;
                    boolean z2 = false;
                    boolean z3 = o.getInt(i13) != 0;
                    int i14 = u16;
                    int i15 = i13;
                    int i16 = i14;
                    int i17 = o.getInt(i16);
                    int i18 = i16;
                    int i19 = u17;
                    long j8 = o.getLong(i19);
                    u17 = i19;
                    int i20 = u18;
                    if (o.getInt(i20) != 0) {
                        u18 = i20;
                        i2 = u19;
                        z = true;
                    } else {
                        u18 = i20;
                        i2 = u19;
                        z = false;
                    }
                    long j9 = o.getLong(i2);
                    u19 = i2;
                    int i21 = u20;
                    if (o.isNull(i21)) {
                        u20 = i21;
                        i3 = u21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i21);
                        u20 = i21;
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
                    long j10 = o.getLong(i4);
                    u22 = i4;
                    int i22 = u23;
                    long j11 = o.getLong(i22);
                    u23 = i22;
                    int i23 = u24;
                    int i24 = o.getInt(i23);
                    aj9.a().getClass();
                    int c2 = wj6.c(i24);
                    u24 = i23;
                    int i25 = u25;
                    long j12 = o.getLong(i25);
                    u25 = i25;
                    int i26 = u26;
                    int i27 = o.getInt(i26);
                    u26 = i26;
                    int i28 = u27;
                    int i29 = o.getInt(i28);
                    u27 = i28;
                    int i30 = u28;
                    int i31 = o.getInt(i30);
                    u28 = i30;
                    int i32 = u29;
                    long j13 = o.getLong(i32);
                    u29 = i32;
                    int i33 = u30;
                    int i34 = o.getInt(i33);
                    u30 = i33;
                    int i35 = u31;
                    int i36 = o.getInt(i35);
                    u31 = i35;
                    int i37 = u32;
                    long j14 = o.getLong(i37);
                    u32 = i37;
                    int i38 = u33;
                    byte[] blob2 = o.isNull(i38) ? null : o.getBlob(i38);
                    aj9.a().getClass();
                    List a2 = hp9.a(blob2);
                    u33 = i38;
                    int i39 = u34;
                    if (o.isNull(i39)) {
                        i5 = i39;
                        i6 = u;
                        bArr = null;
                    } else {
                        i5 = i39;
                        bArr = o.getBlob(i39);
                        i6 = u;
                    }
                    xd9 b3 = aj9.a().b(bArr);
                    int i40 = u35;
                    if (o.isNull(i40)) {
                        i7 = u36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i40));
                        i7 = u36;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        u35 = i40;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        u35 = i40;
                    }
                    arrayList.add(new ya9(j, j2, j3, j4, j5, j6, string, n, D, j7, string2, str, b2, i12, z3, i17, j8, z, j9, str2, str3, j10, j11, c2, j12, i27, i29, i31, j13, i34, i36, j14, a2, b3, l, bool));
                    u36 = i7;
                    u15 = i15;
                    u = i6;
                    u16 = i18;
                    u34 = i5;
                }
                o.close();
                d7d.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = d7d2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    private final Object d() {
        d7d d7d;
        String str;
        int i;
        boolean z;
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
        aj9 aj9 = this.c;
        i6d i6d = aj9.a;
        d7d d7d2 = this.b;
        Cursor o = i6d.o(d7d2, (CancellationSignal) null);
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
            int u13 = kne.u(o, "attaches");
            d7d = d7d2;
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
                int i8 = u13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(u);
                    long j2 = o.getLong(u2);
                    long j3 = o.getLong(u3);
                    long j4 = o.getLong(u4);
                    long j5 = o.getLong(u5);
                    long j6 = o.getLong(u6);
                    String string = o.isNull(u7) ? null : o.getString(u7);
                    int i9 = o.getInt(u8);
                    aj9.a().getClass();
                    oa9.b.getClass();
                    oa9 n = cd4.n(i9);
                    int i10 = o.getInt(u9);
                    aj9.a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i10);
                    long j7 = o.getLong(u10);
                    String string2 = o.isNull(u11) ? null : o.getString(u11);
                    if (o.isNull(u12)) {
                        i = i8;
                        str = null;
                    } else {
                        str = o.getString(u12);
                        i = i8;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    aj9.a().getClass();
                    w28 b2 = qe8.b(blob);
                    i8 = i;
                    int i11 = u14;
                    int i12 = o.getInt(i11);
                    u14 = i11;
                    int i13 = u15;
                    boolean z2 = false;
                    boolean z3 = o.getInt(i13) != 0;
                    int i14 = u16;
                    int i15 = i13;
                    int i16 = i14;
                    int i17 = o.getInt(i16);
                    int i18 = i16;
                    int i19 = u17;
                    long j8 = o.getLong(i19);
                    u17 = i19;
                    int i20 = u18;
                    if (o.getInt(i20) != 0) {
                        u18 = i20;
                        i2 = u19;
                        z = true;
                    } else {
                        u18 = i20;
                        i2 = u19;
                        z = false;
                    }
                    long j9 = o.getLong(i2);
                    u19 = i2;
                    int i21 = u20;
                    if (o.isNull(i21)) {
                        u20 = i21;
                        i3 = u21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i21);
                        u20 = i21;
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
                    long j10 = o.getLong(i4);
                    u22 = i4;
                    int i22 = u23;
                    long j11 = o.getLong(i22);
                    u23 = i22;
                    int i23 = u24;
                    int i24 = o.getInt(i23);
                    aj9.a().getClass();
                    int c2 = wj6.c(i24);
                    u24 = i23;
                    int i25 = u25;
                    long j12 = o.getLong(i25);
                    u25 = i25;
                    int i26 = u26;
                    int i27 = o.getInt(i26);
                    u26 = i26;
                    int i28 = u27;
                    int i29 = o.getInt(i28);
                    u27 = i28;
                    int i30 = u28;
                    int i31 = o.getInt(i30);
                    u28 = i30;
                    int i32 = u29;
                    long j13 = o.getLong(i32);
                    u29 = i32;
                    int i33 = u30;
                    int i34 = o.getInt(i33);
                    u30 = i33;
                    int i35 = u31;
                    int i36 = o.getInt(i35);
                    u31 = i35;
                    int i37 = u32;
                    long j14 = o.getLong(i37);
                    u32 = i37;
                    int i38 = u33;
                    byte[] blob2 = o.isNull(i38) ? null : o.getBlob(i38);
                    aj9.a().getClass();
                    List a2 = hp9.a(blob2);
                    u33 = i38;
                    int i39 = u34;
                    if (o.isNull(i39)) {
                        i5 = i39;
                        i6 = u;
                        bArr = null;
                    } else {
                        i5 = i39;
                        bArr = o.getBlob(i39);
                        i6 = u;
                    }
                    xd9 b3 = aj9.a().b(bArr);
                    int i40 = u35;
                    if (o.isNull(i40)) {
                        i7 = u36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i40));
                        i7 = u36;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        u35 = i40;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        u35 = i40;
                    }
                    arrayList.add(new ya9(j, j2, j3, j4, j5, j6, string, n, D, j7, string2, str, b2, i12, z3, i17, j8, z, j9, str2, str3, j10, j11, c2, j12, i27, i29, i31, j13, i34, i36, j14, a2, b3, l, bool));
                    u36 = i7;
                    u15 = i15;
                    u = i6;
                    u16 = i18;
                    u34 = i5;
                }
                o.close();
                d7d.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = d7d2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    private final Object e() {
        d7d d7d;
        String str;
        int i;
        boolean z;
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
        aj9 aj9 = this.c;
        i6d i6d = aj9.a;
        d7d d7d2 = this.b;
        Cursor o = i6d.o(d7d2, (CancellationSignal) null);
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
            int u13 = kne.u(o, "attaches");
            d7d = d7d2;
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
                int i8 = u13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(u);
                    long j2 = o.getLong(u2);
                    long j3 = o.getLong(u3);
                    long j4 = o.getLong(u4);
                    long j5 = o.getLong(u5);
                    long j6 = o.getLong(u6);
                    String string = o.isNull(u7) ? null : o.getString(u7);
                    int i9 = o.getInt(u8);
                    aj9.a().getClass();
                    oa9.b.getClass();
                    oa9 n = cd4.n(i9);
                    int i10 = o.getInt(u9);
                    aj9.a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i10);
                    long j7 = o.getLong(u10);
                    String string2 = o.isNull(u11) ? null : o.getString(u11);
                    if (o.isNull(u12)) {
                        i = i8;
                        str = null;
                    } else {
                        str = o.getString(u12);
                        i = i8;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    aj9.a().getClass();
                    w28 b2 = qe8.b(blob);
                    i8 = i;
                    int i11 = u14;
                    int i12 = o.getInt(i11);
                    u14 = i11;
                    int i13 = u15;
                    boolean z2 = false;
                    boolean z3 = o.getInt(i13) != 0;
                    int i14 = u16;
                    int i15 = i13;
                    int i16 = i14;
                    int i17 = o.getInt(i16);
                    int i18 = i16;
                    int i19 = u17;
                    long j8 = o.getLong(i19);
                    u17 = i19;
                    int i20 = u18;
                    if (o.getInt(i20) != 0) {
                        u18 = i20;
                        i2 = u19;
                        z = true;
                    } else {
                        u18 = i20;
                        i2 = u19;
                        z = false;
                    }
                    long j9 = o.getLong(i2);
                    u19 = i2;
                    int i21 = u20;
                    if (o.isNull(i21)) {
                        u20 = i21;
                        i3 = u21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i21);
                        u20 = i21;
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
                    long j10 = o.getLong(i4);
                    u22 = i4;
                    int i22 = u23;
                    long j11 = o.getLong(i22);
                    u23 = i22;
                    int i23 = u24;
                    int i24 = o.getInt(i23);
                    aj9.a().getClass();
                    int c2 = wj6.c(i24);
                    u24 = i23;
                    int i25 = u25;
                    long j12 = o.getLong(i25);
                    u25 = i25;
                    int i26 = u26;
                    int i27 = o.getInt(i26);
                    u26 = i26;
                    int i28 = u27;
                    int i29 = o.getInt(i28);
                    u27 = i28;
                    int i30 = u28;
                    int i31 = o.getInt(i30);
                    u28 = i30;
                    int i32 = u29;
                    long j13 = o.getLong(i32);
                    u29 = i32;
                    int i33 = u30;
                    int i34 = o.getInt(i33);
                    u30 = i33;
                    int i35 = u31;
                    int i36 = o.getInt(i35);
                    u31 = i35;
                    int i37 = u32;
                    long j14 = o.getLong(i37);
                    u32 = i37;
                    int i38 = u33;
                    byte[] blob2 = o.isNull(i38) ? null : o.getBlob(i38);
                    aj9.a().getClass();
                    List a2 = hp9.a(blob2);
                    u33 = i38;
                    int i39 = u34;
                    if (o.isNull(i39)) {
                        i5 = i39;
                        i6 = u;
                        bArr = null;
                    } else {
                        i5 = i39;
                        bArr = o.getBlob(i39);
                        i6 = u;
                    }
                    xd9 b3 = aj9.a().b(bArr);
                    int i40 = u35;
                    if (o.isNull(i40)) {
                        i7 = u36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i40));
                        i7 = u36;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        u35 = i40;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        u35 = i40;
                    }
                    arrayList.add(new ya9(j, j2, j3, j4, j5, j6, string, n, D, j7, string2, str, b2, i12, z3, i17, j8, z, j9, str2, str3, j10, j11, c2, j12, i27, i29, i31, j13, i34, i36, j14, a2, b3, l, bool));
                    u36 = i7;
                    u15 = i15;
                    u = i6;
                    u16 = i18;
                    u34 = i5;
                }
                o.close();
                d7d.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = d7d2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    public final Object call() {
        d7d d7d;
        ya9 ya9;
        String str;
        int i;
        String str2;
        int i2;
        Boolean bool;
        d7d d7d2;
        String str3;
        int i3;
        boolean z;
        int i4;
        String str4;
        int i5;
        String str5;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l;
        int i9;
        Boolean bool2;
        switch (this.a) {
            case 0:
                aj9 aj9 = this.c;
                i6d i6d = aj9.a;
                d7d d7d3 = this.b;
                Cursor o = i6d.o(d7d3, (CancellationSignal) null);
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
                    int u13 = kne.u(o, "attaches");
                    d7d = d7d3;
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
                        if (o.moveToFirst()) {
                            long j = o.getLong(u);
                            long j2 = o.getLong(u2);
                            long j3 = o.getLong(u3);
                            long j4 = o.getLong(u4);
                            long j5 = o.getLong(u5);
                            long j6 = o.getLong(u6);
                            String string = o.isNull(u7) ? null : o.getString(u7);
                            int i10 = o.getInt(u8);
                            aj9.a().getClass();
                            oa9.b.getClass();
                            oa9 n = cd4.n(i10);
                            int i11 = o.getInt(u9);
                            aj9.a().getClass();
                            qe9.b.getClass();
                            qe9 D = sq6.D(i11);
                            long j7 = o.getLong(u10);
                            String string2 = o.isNull(u11) ? null : o.getString(u11);
                            String string3 = o.isNull(u12) ? null : o.getString(u12);
                            byte[] blob = o.isNull(u13) ? null : o.getBlob(u13);
                            aj9.a().getClass();
                            w28 b2 = qe8.b(blob);
                            int i12 = o.getInt(u14);
                            boolean z2 = false;
                            boolean z3 = o.getInt(u15) != 0;
                            int i13 = o.getInt(u16);
                            long j8 = o.getLong(u17);
                            boolean z4 = o.getInt(u18) != 0;
                            long j9 = o.getLong(u19);
                            int i14 = u20;
                            if (o.isNull(i14)) {
                                i = u21;
                                str = null;
                            } else {
                                str = o.getString(i14);
                                i = u21;
                            }
                            if (o.isNull(i)) {
                                i2 = u22;
                                str2 = null;
                            } else {
                                str2 = o.getString(i);
                                i2 = u22;
                            }
                            long j10 = o.getLong(i2);
                            long j11 = o.getLong(u23);
                            int i15 = o.getInt(u24);
                            aj9.a().getClass();
                            int c2 = wj6.c(i15);
                            long j12 = o.getLong(u25);
                            int i16 = o.getInt(u26);
                            int i17 = o.getInt(u27);
                            int i18 = o.getInt(u28);
                            long j13 = o.getLong(u29);
                            int i19 = o.getInt(u30);
                            int i20 = o.getInt(u31);
                            long j14 = o.getLong(u32);
                            int i21 = u33;
                            byte[] blob2 = o.isNull(i21) ? null : o.getBlob(i21);
                            aj9.a().getClass();
                            List a2 = hp9.a(blob2);
                            int i22 = u34;
                            xd9 b3 = aj9.a().b(o.isNull(i22) ? null : o.getBlob(i22));
                            int i23 = u35;
                            Long valueOf = o.isNull(i23) ? null : Long.valueOf(o.getLong(i23));
                            Integer valueOf2 = o.isNull(u36) ? null : Integer.valueOf(o.getInt(u36));
                            if (valueOf2 == null) {
                                bool = null;
                            } else {
                                if (valueOf2.intValue() != 0) {
                                    z2 = true;
                                }
                                bool = Boolean.valueOf(z2);
                            }
                            ya9 = new ya9(j, j2, j3, j4, j5, j6, string, n, D, j7, string2, string3, b2, i12, z3, i13, j8, z4, j9, str, str2, j10, j11, c2, j12, i16, i17, i18, j13, i19, i20, j14, a2, b3, valueOf, bool);
                        } else {
                            ya9 = null;
                        }
                        o.close();
                        d7d.o();
                        return ya9;
                    } catch (Throwable th) {
                        th = th;
                        o.close();
                        d7d.o();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    d7d = d7d3;
                    o.close();
                    d7d.o();
                    throw th;
                }
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return d();
            case 5:
                return e();
            default:
                aj9 aj92 = this.c;
                i6d i6d2 = aj92.a;
                d7d d7d4 = this.b;
                Cursor o2 = i6d2.o(d7d4, (CancellationSignal) null);
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
                    int u47 = kne.u(o2, "error");
                    int u48 = kne.u(o2, "localized_error");
                    int u49 = kne.u(o2, "attaches");
                    d7d2 = d7d4;
                    try {
                        int u50 = kne.u(o2, "media_type");
                        int u51 = kne.u(o2, "detect_share");
                        int u52 = kne.u(o2, "msg_link_type");
                        int u53 = kne.u(o2, "msg_link_id");
                        int u54 = kne.u(o2, "inserted_from_msg_link");
                        int u55 = kne.u(o2, "msg_link_chat_id");
                        int u56 = kne.u(o2, "msg_link_chat_name");
                        int u57 = kne.u(o2, "msg_link_chat_link");
                        int u58 = kne.u(o2, "msg_link_out_chat_id");
                        int u59 = kne.u(o2, "msg_link_out_msg_id");
                        int u60 = kne.u(o2, "type");
                        int u61 = kne.u(o2, "chat_id");
                        int u62 = kne.u(o2, "ttl");
                        int u63 = kne.u(o2, "channel_views");
                        int u64 = kne.u(o2, "channel_forwards");
                        int u65 = kne.u(o2, "view_time");
                        int u66 = kne.u(o2, "zoom");
                        int u67 = kne.u(o2, "options");
                        int u68 = kne.u(o2, "live_until");
                        int u69 = kne.u(o2, "elements");
                        int u70 = kne.u(o2, "reactions");
                        int u71 = kne.u(o2, "delayed_attrs_time_to_fire");
                        int u72 = kne.u(o2, "delayed_attrs_notify_sender");
                        int i24 = u49;
                        ArrayList arrayList = new ArrayList(o2.getCount());
                        while (o2.moveToNext()) {
                            long j15 = o2.getLong(u37);
                            long j16 = o2.getLong(u38);
                            long j17 = o2.getLong(u39);
                            long j18 = o2.getLong(u40);
                            long j19 = o2.getLong(u41);
                            long j20 = o2.getLong(u42);
                            String string4 = o2.isNull(u43) ? null : o2.getString(u43);
                            int i25 = o2.getInt(u44);
                            aj92.a().getClass();
                            oa9.b.getClass();
                            oa9 n2 = cd4.n(i25);
                            int i26 = o2.getInt(u45);
                            aj92.a().getClass();
                            qe9.b.getClass();
                            qe9 D2 = sq6.D(i26);
                            long j21 = o2.getLong(u46);
                            String string5 = o2.isNull(u47) ? null : o2.getString(u47);
                            if (o2.isNull(u48)) {
                                i3 = i24;
                                str3 = null;
                            } else {
                                str3 = o2.getString(u48);
                                i3 = i24;
                            }
                            byte[] blob3 = o2.isNull(i3) ? null : o2.getBlob(i3);
                            aj92.a().getClass();
                            w28 b4 = qe8.b(blob3);
                            i24 = i3;
                            int i27 = u50;
                            int i28 = o2.getInt(i27);
                            u50 = i27;
                            int i29 = u51;
                            boolean z5 = false;
                            boolean z6 = o2.getInt(i29) != 0;
                            int i30 = u52;
                            int i31 = i29;
                            int i32 = i30;
                            int i33 = o2.getInt(i32);
                            int i34 = i32;
                            int i35 = u53;
                            long j22 = o2.getLong(i35);
                            u53 = i35;
                            int i36 = u54;
                            if (o2.getInt(i36) != 0) {
                                u54 = i36;
                                i4 = u55;
                                z = true;
                            } else {
                                u54 = i36;
                                i4 = u55;
                                z = false;
                            }
                            long j23 = o2.getLong(i4);
                            u55 = i4;
                            int i37 = u56;
                            if (o2.isNull(i37)) {
                                u56 = i37;
                                i5 = u57;
                                str4 = null;
                            } else {
                                str4 = o2.getString(i37);
                                u56 = i37;
                                i5 = u57;
                            }
                            if (o2.isNull(i5)) {
                                u57 = i5;
                                i6 = u58;
                                str5 = null;
                            } else {
                                str5 = o2.getString(i5);
                                u57 = i5;
                                i6 = u58;
                            }
                            long j24 = o2.getLong(i6);
                            u58 = i6;
                            int i38 = u59;
                            long j25 = o2.getLong(i38);
                            u59 = i38;
                            int i39 = u60;
                            int i40 = o2.getInt(i39);
                            aj92.a().getClass();
                            int c3 = wj6.c(i40);
                            u60 = i39;
                            int i41 = u61;
                            long j26 = o2.getLong(i41);
                            u61 = i41;
                            int i42 = u62;
                            int i43 = o2.getInt(i42);
                            u62 = i42;
                            int i44 = u63;
                            int i45 = o2.getInt(i44);
                            u63 = i44;
                            int i46 = u64;
                            int i47 = o2.getInt(i46);
                            u64 = i46;
                            int i48 = u65;
                            long j27 = o2.getLong(i48);
                            u65 = i48;
                            int i49 = u66;
                            int i50 = o2.getInt(i49);
                            u66 = i49;
                            int i51 = u67;
                            int i52 = o2.getInt(i51);
                            u67 = i51;
                            int i53 = u68;
                            long j28 = o2.getLong(i53);
                            u68 = i53;
                            int i54 = u69;
                            byte[] blob4 = o2.isNull(i54) ? null : o2.getBlob(i54);
                            aj92.a().getClass();
                            List a3 = hp9.a(blob4);
                            u69 = i54;
                            int i55 = u70;
                            if (o2.isNull(i55)) {
                                i7 = i55;
                                i8 = u37;
                                bArr = null;
                            } else {
                                i7 = i55;
                                bArr = o2.getBlob(i55);
                                i8 = u37;
                            }
                            xd9 b5 = aj92.a().b(bArr);
                            int i56 = u71;
                            if (o2.isNull(i56)) {
                                i9 = u72;
                                l = null;
                            } else {
                                l = Long.valueOf(o2.getLong(i56));
                                i9 = u72;
                            }
                            Integer valueOf3 = o2.isNull(i9) ? null : Integer.valueOf(o2.getInt(i9));
                            if (valueOf3 == null) {
                                u71 = i56;
                                bool2 = null;
                            } else {
                                if (valueOf3.intValue() != 0) {
                                    z5 = true;
                                }
                                bool2 = Boolean.valueOf(z5);
                                u71 = i56;
                            }
                            arrayList.add(new ya9(j15, j16, j17, j18, j19, j20, string4, n2, D2, j21, string5, str3, b4, i28, z6, i33, j22, z, j23, str4, str5, j24, j25, c3, j26, i43, i45, i47, j27, i50, i52, j28, a3, b5, l, bool2));
                            u72 = i9;
                            u51 = i31;
                            u37 = i8;
                            u52 = i34;
                            u70 = i7;
                        }
                        o2.close();
                        d7d2.o();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        o2.close();
                        d7d2.o();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    d7d2 = d7d4;
                    o2.close();
                    d7d2.o();
                    throw th;
                }
        }
    }
}
