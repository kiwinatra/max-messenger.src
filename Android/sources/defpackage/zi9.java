package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.b;

/* renamed from: zi9  reason: default package */
public final class zi9 extends q75 {
    public final /* synthetic */ int o;
    public final /* synthetic */ Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi9(Object obj, OneMeRoomDatabase oneMeRoomDatabase, int i) {
        super((i6d) oneMeRoomDatabase);
        this.o = i;
        this.v = obj;
    }

    public final String F() {
        switch (this.o) {
            case 0:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`server_id` = ?,`time` = ?,`chat_id` = ?,`update_time` = ?,`sender` = ?,`cid` = ?,`text` = ?,`elements` = ?,`reactions` = ?,`msg_link_type` = ?,`msg_link_id` = ?,`inserted_from_msg_link` = ?,`msg_link_chat_id` = ?,`msg_link_chat_name` = ?,`msg_link_chat_link` = ?,`status` = ?,`type` = ?,`ttl` = ?,`view_time` = ?,`zoom` = ?,`options` = ?,`live_until` = ?,`delayed_attrs_time_to_fire` = ?,`delayed_attrs_notify_sender` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`server_id` = ?,`time` = ?,`update_time` = ?,`sender` = ?,`cid` = ?,`text` = ?,`delivery_status` = ?,`status` = ?,`time_local` = ?,`error` = ?,`localized_error` = ?,`attaches` = ?,`media_type` = ?,`detect_share` = ?,`msg_link_type` = ?,`msg_link_id` = ?,`inserted_from_msg_link` = ?,`msg_link_chat_id` = ?,`msg_link_chat_name` = ?,`msg_link_chat_link` = ?,`msg_link_out_chat_id` = ?,`msg_link_out_msg_id` = ?,`type` = ?,`chat_id` = ?,`ttl` = ?,`channel_views` = ?,`channel_forwards` = ?,`view_time` = ?,`zoom` = ?,`options` = ?,`live_until` = ?,`elements` = ?,`reactions` = ?,`delayed_attrs_time_to_fire` = ?,`delayed_attrs_notify_sender` = ? WHERE `id` = ?";
            case 2:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`attaches` = ?,`media_type` = ? WHERE `id` = ?";
            case 3:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`text` = ?,`elements` = ?,`status` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR REPLACE `tasks` SET `id` = ?,`type` = ?,`status` = ?,`fails_count` = ?,`depends_request_id` = ?,`dependency_type` = ?,`data` = ?,`created_time` = ? WHERE `id` = ?";
        }
    }

    public final void Z(gf6 gf6, Object obj) {
        gf6 gf62 = gf6;
        Object obj2 = this.v;
        switch (this.o) {
            case 0:
                id9 id9 = (id9) obj;
                gf62.k(1, id9.a);
                gf62.k(2, id9.b);
                gf62.k(3, id9.c);
                gf62.k(4, id9.d);
                gf62.k(5, id9.e);
                gf62.k(6, id9.f);
                gf62.k(7, id9.g);
                String str = id9.h;
                if (str == null) {
                    gf62.X(8);
                } else {
                    gf62.h(8, str);
                }
                aj9 aj9 = (aj9) obj2;
                aj9.a().getClass();
                byte[] b = ua9.b(id9.i);
                if (b == null) {
                    gf62.X(9);
                } else {
                    gf62.l(9, b);
                }
                aj9.a().getClass();
                byte[] c = hp9.c(id9.j);
                if (c == null) {
                    gf62.X(10);
                } else {
                    gf62.l(10, c);
                }
                gf62.k(11, (long) id9.k);
                gf62.k(12, id9.l);
                gf62.k(13, id9.m ? 1 : 0);
                gf62.k(14, id9.n);
                String str2 = id9.o;
                if (str2 == null) {
                    gf62.X(15);
                } else {
                    gf62.h(15, str2);
                }
                String str3 = id9.p;
                if (str3 == null) {
                    gf62.X(16);
                } else {
                    gf62.h(16, str3);
                }
                aj9.a().getClass();
                gf62.k(17, (long) id9.q.a);
                aj9.a().getClass();
                gf62.k(18, (long) wj6.d(id9.r));
                gf62.k(19, (long) id9.s);
                gf62.k(20, id9.t);
                gf62.k(21, (long) id9.u);
                gf62.k(22, (long) id9.v);
                gf62.k(23, id9.w);
                Long l = id9.x;
                if (l == null) {
                    gf62.X(24);
                } else {
                    gf62.k(24, l.longValue());
                }
                Boolean bool = id9.y;
                Integer valueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
                if (valueOf == null) {
                    gf62.X(25);
                } else {
                    gf62.k(25, (long) valueOf.intValue());
                }
                gf62.k(26, id9.a);
                return;
            case 1:
                ya9 ya9 = (ya9) obj;
                gf62.k(1, ya9.a);
                gf62.k(2, ya9.b);
                gf62.k(3, ya9.c);
                gf62.k(4, ya9.d);
                gf62.k(5, ya9.e);
                gf62.k(6, ya9.f);
                String str4 = ya9.g;
                if (str4 == null) {
                    gf62.X(7);
                } else {
                    gf62.h(7, str4);
                }
                aj9 aj92 = (aj9) obj2;
                aj92.a().getClass();
                gf62.k(8, (long) ya9.h.a);
                aj92.a().getClass();
                gf62.k(9, (long) ya9.i.a);
                gf62.k(10, ya9.j);
                String str5 = ya9.k;
                if (str5 == null) {
                    gf62.X(11);
                } else {
                    gf62.h(11, str5);
                }
                String str6 = ya9.l;
                if (str6 == null) {
                    gf62.X(12);
                } else {
                    gf62.h(12, str6);
                }
                aj92.a().getClass();
                w28 w28 = ya9.m;
                byte[] byteArray = w28 != null ? ad9.toByteArray(b.f(w28)) : null;
                if (byteArray == null) {
                    gf62.X(13);
                } else {
                    gf62.l(13, byteArray);
                }
                gf62.k(14, (long) ya9.n);
                gf62.k(15, ya9.o ? 1 : 0);
                gf62.k(16, (long) ya9.p);
                gf62.k(17, ya9.q);
                gf62.k(18, ya9.r ? 1 : 0);
                gf62.k(19, ya9.s);
                String str7 = ya9.t;
                if (str7 == null) {
                    gf62.X(20);
                } else {
                    gf62.h(20, str7);
                }
                String str8 = ya9.u;
                if (str8 == null) {
                    gf62.X(21);
                } else {
                    gf62.h(21, str8);
                }
                gf62.k(22, ya9.v);
                gf62.k(23, ya9.w);
                aj92.a().getClass();
                gf62.k(24, (long) wj6.d(ya9.J));
                gf62.k(25, ya9.x);
                gf62.k(26, (long) ya9.y);
                gf62.k(27, (long) ya9.z);
                gf62.k(28, (long) ya9.A);
                gf62.k(29, ya9.B);
                gf62.k(30, (long) ya9.C);
                gf62.k(31, (long) ya9.D);
                gf62.k(32, ya9.E);
                aj92.a().getClass();
                byte[] b2 = ua9.b(ya9.F);
                if (b2 == null) {
                    gf62.X(33);
                } else {
                    gf62.l(33, b2);
                }
                aj92.a().getClass();
                byte[] c2 = hp9.c(ya9.G);
                if (c2 == null) {
                    gf62.X(34);
                } else {
                    gf62.l(34, c2);
                }
                Long l2 = ya9.H;
                if (l2 == null) {
                    gf62.X(35);
                } else {
                    gf62.k(35, l2.longValue());
                }
                Boolean bool2 = ya9.I;
                Integer valueOf2 = bool2 == null ? null : Integer.valueOf(bool2.booleanValue() ? 1 : 0);
                if (valueOf2 == null) {
                    gf62.X(36);
                } else {
                    gf62.k(36, (long) valueOf2.intValue());
                }
                gf62.k(37, ya9.a);
                return;
            case 2:
                iwf iwf = (iwf) obj;
                gf62.k(1, iwf.a);
                ((aj9) obj2).a().getClass();
                w28 w282 = iwf.b;
                byte[] byteArray2 = w282 != null ? ad9.toByteArray(b.f(w282)) : null;
                if (byteArray2 == null) {
                    gf62.X(2);
                } else {
                    gf62.l(2, byteArray2);
                }
                gf62.k(3, (long) iwf.c);
                gf62.k(4, iwf.a);
                return;
            case 3:
                zwf zwf = (zwf) obj;
                gf62.k(1, zwf.a);
                String str9 = zwf.b;
                if (str9 == null) {
                    gf62.X(2);
                } else {
                    gf62.h(2, str9);
                }
                aj9 aj93 = (aj9) obj2;
                aj93.a().getClass();
                byte[] b3 = ua9.b(zwf.c);
                if (b3 == null) {
                    gf62.X(3);
                } else {
                    gf62.l(3, b3);
                }
                aj93.a().getClass();
                gf62.k(4, (long) zwf.d.a);
                gf62.k(5, zwf.a);
                return;
            default:
                vdf vdf = (vdf) obj;
                gf62.k(1, vdf.a);
                hef hef = (hef) obj2;
                hef.c.getClass();
                gf62.k(2, (long) vdf.b.a);
                hef.c.getClass();
                gf62.k(3, (long) vdf.c.a);
                gf62.k(4, (long) vdf.d);
                gf62.k(5, vdf.e);
                gf62.k(6, (long) vdf.f);
                byte[] bArr = vdf.g;
                if (bArr == null) {
                    gf62.X(7);
                } else {
                    gf62.l(7, bArr);
                }
                gf62.k(8, vdf.h);
                gf62.k(9, vdf.a);
                return;
        }
    }
}
