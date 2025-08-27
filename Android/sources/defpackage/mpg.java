package defpackage;

/* renamed from: mpg  reason: default package */
public final class mpg extends r75 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mpg(i6d i6d, int i) {
        super(i6d);
        this.o = i;
    }

    public final String F() {
        switch (this.o) {
            case 0:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 2:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void Z(gf6 gf6, Object obj) {
        switch (this.o) {
            case 0:
                lpg lpg = (lpg) obj;
                String str = lpg.a;
                if (str == null) {
                    gf6.X(1);
                } else {
                    gf6.h(1, str);
                }
                String str2 = lpg.b;
                if (str2 == null) {
                    gf6.X(2);
                    return;
                } else {
                    gf6.h(2, str2);
                    return;
                }
            case 1:
                opg opg = (opg) obj;
                String str3 = opg.a;
                if (str3 == null) {
                    gf6.X(1);
                } else {
                    gf6.h(1, str3);
                }
                byte[] f = t64.f(opg.b);
                if (f == null) {
                    gf6.X(2);
                    return;
                } else {
                    gf6.l(2, f);
                    return;
                }
            case 2:
                xpg xpg = (xpg) obj;
                String str4 = xpg.a;
                if (str4 == null) {
                    gf6.X(1);
                } else {
                    gf6.h(1, str4);
                }
                gf6.k(2, (long) o5a.h0(xpg.b));
                String str5 = xpg.c;
                if (str5 == null) {
                    gf6.X(3);
                } else {
                    gf6.h(3, str5);
                }
                String str6 = xpg.d;
                if (str6 == null) {
                    gf6.X(4);
                } else {
                    gf6.h(4, str6);
                }
                byte[] f2 = t64.f(xpg.e);
                if (f2 == null) {
                    gf6.X(5);
                } else {
                    gf6.l(5, f2);
                }
                byte[] f3 = t64.f(xpg.f);
                if (f3 == null) {
                    gf6.X(6);
                } else {
                    gf6.l(6, f3);
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
                        return;
                    } else {
                        gf6.l(27, f0);
                        return;
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
                    return;
                }
            default:
                zpg zpg = (zpg) obj;
                String str7 = zpg.a;
                if (str7 == null) {
                    gf6.X(1);
                } else {
                    gf6.h(1, str7);
                }
                String str8 = zpg.b;
                if (str8 == null) {
                    gf6.X(2);
                    return;
                } else {
                    gf6.h(2, str8);
                    return;
                }
        }
    }
}
