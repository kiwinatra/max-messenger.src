package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: we4  reason: default package */
public final class we4 extends q75 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we4(i6d i6d, int i) {
        super(i6d);
        this.o = i;
    }

    public final String F() {
        switch (this.o) {
            case 0:
                return "DELETE FROM `default_emoji` WHERE `emoji` = ?";
            case 1:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`server_id` = ?,`cid` = ?,`time` = ?,`time_local` = ?,`ttl` = ?,`view_time` = ?,`options` = ?,`live_until` = ?,`delivery_status` = ?,`status` = ?,`delayed_attrs_time_to_fire` = ?,`delayed_attrs_notify_sender` = ? WHERE `id` = ?";
            case 2:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`view_time` = ? WHERE `id` = ?";
            case 3:
                return "UPDATE OR ABORT `phones` SET `id` = ?,`phonebook_id` = ?,`contact_id` = ?,`phone` = ?,`server_phone` = ?,`email` = ?,`first_name` = ?,`last_name` = ?,`avatar_path` = ?,`type` = ? WHERE `id` = ?";
            case 4:
                return "DELETE FROM `recent` WHERE `id` = ?";
            case 5:
                return "UPDATE OR REPLACE `chat_folder` SET `id` = ?,`title` = ?,`emoji` = ?,`order` = ?,`filters` = ?,`isHiddenForAllFolder` = ?,`hideIfEmpty` = ?,`elements` = ?,`creatorId` = ?,`filterSubjects` = ?,`widgets` = ?,`options` = ?,`isRemoved` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    public final void Z(gf6 gf6, Object obj) {
        switch (this.o) {
            case 0:
                String str = ((ye4) obj).a;
                if (str == null) {
                    gf6.X(1);
                    return;
                } else {
                    gf6.h(1, str);
                    return;
                }
            case 1:
                rae.w(obj);
                throw null;
            case 2:
                rae.w(obj);
                throw null;
            case 3:
                ydb ydb = (ydb) obj;
                gf6.k(1, ydb.a);
                gf6.k(2, ydb.b);
                gf6.k(3, (long) ydb.c);
                String str2 = ydb.d;
                if (str2 == null) {
                    gf6.X(4);
                } else {
                    gf6.h(4, str2);
                }
                gf6.k(5, ydb.e);
                String str3 = ydb.f;
                if (str3 == null) {
                    gf6.X(6);
                } else {
                    gf6.h(6, str3);
                }
                String str4 = ydb.g;
                if (str4 == null) {
                    gf6.X(7);
                } else {
                    gf6.h(7, str4);
                }
                String str5 = ydb.h;
                if (str5 == null) {
                    gf6.X(8);
                } else {
                    gf6.h(8, str5);
                }
                String str6 = ydb.i;
                if (str6 == null) {
                    gf6.X(9);
                } else {
                    gf6.h(9, str6);
                }
                gf6.k(10, (long) tr1.y(ydb.j));
                gf6.k(11, ydb.a);
                return;
            case 4:
                gf6.k(1, ((luc) obj).a);
                return;
            case 5:
                j5d j5d = (j5d) obj;
                String str7 = j5d.a;
                if (str7 == null) {
                    gf6.X(1);
                } else {
                    gf6.h(1, str7);
                }
                String str8 = j5d.b;
                if (str8 == null) {
                    gf6.X(2);
                } else {
                    gf6.h(2, str8);
                }
                String str9 = j5d.c;
                if (str9 == null) {
                    gf6.X(3);
                } else {
                    gf6.h(3, str9);
                }
                gf6.k(4, (long) j5d.d);
                String K = tf6.K(j5d.e);
                if (K == null) {
                    gf6.X(5);
                } else {
                    gf6.h(5, K);
                }
                gf6.k(6, j5d.f ? 1 : 0);
                gf6.k(7, j5d.g ? 1 : 0);
                byte[] bArr = null;
                List list = j5d.h;
                byte[] b = list != null ? ua9.b(list) : null;
                if (b == null) {
                    gf6.X(8);
                } else {
                    gf6.l(8, b);
                }
                Long l = j5d.i;
                if (l == null) {
                    gf6.X(9);
                } else {
                    gf6.k(9, l.longValue());
                }
                Map map = j5d.j;
                byte[] byteArray = map != null ? ad9.toByteArray(m58.p(map)) : null;
                if (byteArray == null) {
                    gf6.X(10);
                } else {
                    gf6.l(10, byteArray);
                }
                List list2 = j5d.k;
                byte[] byteArray2 = list2 != null ? ad9.toByteArray(m58.r(list2)) : null;
                if (byteArray2 == null) {
                    gf6.X(11);
                } else {
                    gf6.l(11, byteArray2);
                }
                Set set = j5d.l;
                if (set != null) {
                    bArr = ad9.toByteArray(m58.q(set));
                }
                if (bArr == null) {
                    gf6.X(12);
                } else {
                    gf6.l(12, bArr);
                }
                gf6.k(13, j5d.m ? 1 : 0);
                String str10 = j5d.a;
                if (str10 == null) {
                    gf6.X(14);
                    return;
                } else {
                    gf6.h(14, str10);
                    return;
                }
            default:
                xpg xpg = (xpg) obj;
                String str11 = xpg.a;
                if (str11 == null) {
                    gf6.X(1);
                } else {
                    gf6.h(1, str11);
                }
                gf6.k(2, (long) o5a.h0(xpg.b));
                String str12 = xpg.c;
                if (str12 == null) {
                    gf6.X(3);
                } else {
                    gf6.h(3, str12);
                }
                String str13 = xpg.d;
                if (str13 == null) {
                    gf6.X(4);
                } else {
                    gf6.h(4, str13);
                }
                byte[] f = t64.f(xpg.e);
                if (f == null) {
                    gf6.X(5);
                } else {
                    gf6.l(5, f);
                }
                byte[] f2 = t64.f(xpg.f);
                if (f2 == null) {
                    gf6.X(6);
                } else {
                    gf6.l(6, f2);
                }
                gf6.k(7, xpg.g);
                gf6.k(8, xpg.h);
                gf6.k(9, xpg.i);
                gf6.k(10, (long) xpg.k);
                gf6.k(11, (long) o5a.e(xpg.l));
                gf6.k(12, xpg.m);
                gf6.k(13, xpg.n);
                gf6.k(14, xpg.o);
                gf6.k(15, xpg.p);
                gf6.k(16, xpg.q ? 1 : 0);
                gf6.k(17, (long) o5a.S(xpg.r));
                gf6.k(18, (long) xpg.s);
                gf6.k(19, (long) xpg.t);
                wj3 wj3 = xpg.j;
                if (wj3 != null) {
                    gf6.k(20, (long) o5a.Q(wj3.a));
                    gf6.k(21, wj3.b ? 1 : 0);
                    gf6.k(22, wj3.c ? 1 : 0);
                    gf6.k(23, wj3.d ? 1 : 0);
                    gf6.k(24, wj3.e ? 1 : 0);
                    gf6.k(25, wj3.f);
                    gf6.k(26, wj3.g);
                    byte[] f0 = o5a.f0(wj3.h);
                    if (f0 == null) {
                        gf6.X(27);
                    } else {
                        gf6.l(27, f0);
                    }
                } else {
                    gf6.X(20);
                    gf6.X(21);
                    gf6.X(22);
                    gf6.X(23);
                    gf6.X(24);
                    gf6.X(25);
                    gf6.X(26);
                    gf6.X(27);
                }
                String str14 = xpg.a;
                if (str14 == null) {
                    gf6.X(28);
                    return;
                } else {
                    gf6.h(28, str14);
                    return;
                }
        }
    }
}
