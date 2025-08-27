package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: q6d  reason: default package */
public final /* synthetic */ class q6d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6d b;

    public /* synthetic */ q6d(z6d z6d, int i) {
        this.a = i;
        this.b = z6d;
    }

    public final Object invoke(Object obj) {
        d7d d7d;
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
        z6d z6d = this.b;
        switch (this.a) {
            case 0:
                List<Long> list = (List) obj;
                aj9 d = z6d.d();
                sq6 sq6 = qe9.b;
                d.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM messages WHERE id in (");
                int size = list.size();
                n79.c(sb, size);
                sb.append(") AND inserted_from_msg_link = 0 AND status <> ");
                sb.append("?");
                int i9 = size + 1;
                d7d a2 = d7d.a(i9, sb.toString());
                int i10 = 1;
                for (Long l2 : list) {
                    if (l2 == null) {
                        a2.X(i10);
                    } else {
                        a2.k(i10, l2.longValue());
                    }
                    i10++;
                }
                d.a().getClass();
                a2.k(i9, (long) 10);
                i6d i6d = d.a;
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
                        int i11 = u13;
                        ArrayList arrayList = new ArrayList(o.getCount());
                        while (o.moveToNext()) {
                            long j = o.getLong(u);
                            long j2 = o.getLong(u2);
                            long j3 = o.getLong(u3);
                            long j4 = o.getLong(u4);
                            long j5 = o.getLong(u5);
                            long j6 = o.getLong(u6);
                            String string = o.isNull(u7) ? null : o.getString(u7);
                            int i12 = o.getInt(u8);
                            d.a().getClass();
                            oa9.b.getClass();
                            oa9 n = cd4.n(i12);
                            int i13 = o.getInt(u9);
                            d.a().getClass();
                            qe9.b.getClass();
                            qe9 D = sq6.D(i13);
                            long j7 = o.getLong(u10);
                            String string2 = o.isNull(u11) ? null : o.getString(u11);
                            if (o.isNull(u12)) {
                                i = i11;
                                str = null;
                            } else {
                                str = o.getString(u12);
                                i = i11;
                            }
                            byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                            d.a().getClass();
                            w28 b2 = qe8.b(blob);
                            int i14 = u;
                            int i15 = u14;
                            int i16 = o.getInt(i15);
                            u14 = i15;
                            int i17 = u15;
                            boolean z3 = false;
                            if (o.getInt(i17) != 0) {
                                u15 = i17;
                                i2 = u16;
                                z = true;
                            } else {
                                u15 = i17;
                                i2 = u16;
                                z = false;
                            }
                            int i18 = o.getInt(i2);
                            u16 = i2;
                            int i19 = u17;
                            long j8 = o.getLong(i19);
                            u17 = i19;
                            int i20 = u18;
                            if (o.getInt(i20) != 0) {
                                u18 = i20;
                                i3 = u19;
                                z2 = true;
                            } else {
                                u18 = i20;
                                i3 = u19;
                                z2 = false;
                            }
                            long j9 = o.getLong(i3);
                            u19 = i3;
                            int i21 = u20;
                            if (o.isNull(i21)) {
                                u20 = i21;
                                i4 = u21;
                                str2 = null;
                            } else {
                                str2 = o.getString(i21);
                                u20 = i21;
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
                            int i22 = u23;
                            long j11 = o.getLong(i22);
                            u23 = i22;
                            int i23 = u24;
                            int i24 = o.getInt(i23);
                            d.a().getClass();
                            int c = wj6.c(i24);
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
                            d.a().getClass();
                            List a3 = hp9.a(blob2);
                            u33 = i38;
                            int i39 = u34;
                            if (o.isNull(i39)) {
                                i6 = i39;
                                i7 = u12;
                                bArr = null;
                            } else {
                                i6 = i39;
                                bArr = o.getBlob(i39);
                                i7 = u12;
                            }
                            xd9 b3 = d.a().b(bArr);
                            int i40 = u35;
                            if (o.isNull(i40)) {
                                i8 = u36;
                                l = null;
                            } else {
                                l = Long.valueOf(o.getLong(i40));
                                i8 = u36;
                            }
                            Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                            if (valueOf == null) {
                                u35 = i40;
                                bool = null;
                            } else {
                                if (valueOf.intValue() != 0) {
                                    z3 = true;
                                }
                                bool = Boolean.valueOf(z3);
                                u35 = i40;
                            }
                            arrayList.add(new ya9(j, j2, j3, j4, j5, j6, string, n, D, j7, string2, str, b2, i16, z, i18, j8, z2, j9, str2, str3, j10, j11, c, j12, i27, i29, i31, j13, i34, i36, j14, a3, b3, l, bool));
                            u36 = i8;
                            u12 = i7;
                            u = i14;
                            u34 = i6;
                            i11 = i;
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
                    d7d = a2;
                    o.close();
                    d7d.o();
                    throw th;
                }
            default:
                return z6d.b((ya9) obj);
        }
    }
}
