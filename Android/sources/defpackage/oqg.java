package defpackage;

import androidx.work.impl.model.WorkersQueueDao_Impl;
import kotlin.jvm.functions.Function1;

/* renamed from: oqg  reason: default package */
public final class oqg extends r75 {
    public final /* synthetic */ int o;
    public final /* synthetic */ WorkersQueueDao_Impl v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oqg(WorkersQueueDao_Impl workersQueueDao_Impl, i6d i6d, int i) {
        super(i6d);
        this.o = i;
        this.v = workersQueueDao_Impl;
    }

    public final String F() {
        switch (this.o) {
            case 0:
                return "INSERT OR IGNORE INTO `WorkerQueueItem` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `WorkerQueueItem` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public final void Z(gf6 gf6, Object obj) {
        switch (this.o) {
            case 0:
                hqg hqg = (hqg) obj;
                String str = hqg.a;
                if (str == null) {
                    gf6.X(1);
                } else {
                    gf6.h(1, str);
                }
                String str2 = hqg.b;
                if (str2 == null) {
                    gf6.X(2);
                } else {
                    gf6.h(2, str2);
                }
                gf6.h(3, this.v.__ExistingWorkPolicy_enumToString(hqg.c));
                String p = CollectionsKt___CollectionsKt.joinToString$default(hqg.e, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                if (p == null) {
                    gf6.X(4);
                } else {
                    gf6.h(4, p);
                }
                gf6.k(5, hqg.f);
                gf6.k(6, (long) hqg.g);
                xpg xpg = hqg.d;
                String str3 = xpg.a;
                if (str3 == null) {
                    gf6.X(7);
                } else {
                    gf6.h(7, str3);
                }
                gf6.k(8, (long) o5a.h0(xpg.b));
                String str4 = xpg.c;
                if (str4 == null) {
                    gf6.X(9);
                } else {
                    gf6.h(9, str4);
                }
                String str5 = xpg.d;
                if (str5 == null) {
                    gf6.X(10);
                } else {
                    gf6.h(10, str5);
                }
                byte[] f = t64.f(xpg.e);
                if (f == null) {
                    gf6.X(11);
                } else {
                    gf6.l(11, f);
                }
                byte[] f2 = t64.f(xpg.f);
                if (f2 == null) {
                    gf6.X(12);
                } else {
                    gf6.l(12, f2);
                }
                gf6.k(13, xpg.g);
                gf6.k(14, xpg.h);
                gf6.k(15, xpg.i);
                gf6.k(16, (long) xpg.k);
                gf6.k(17, (long) o5a.e(xpg.l));
                gf6.k(18, xpg.m);
                gf6.k(19, xpg.n);
                gf6.k(20, xpg.o);
                gf6.k(21, xpg.p);
                gf6.k(22, xpg.q ? 1 : 0);
                gf6.k(23, (long) o5a.S(xpg.r));
                gf6.k(24, (long) xpg.s);
                gf6.k(25, (long) xpg.t);
                wj3 wj3 = xpg.j;
                gf6.k(26, (long) o5a.Q(wj3.a));
                gf6.k(27, wj3.b ? 1 : 0);
                gf6.k(28, wj3.c ? 1 : 0);
                gf6.k(29, wj3.d ? 1 : 0);
                gf6.k(30, wj3.e ? 1 : 0);
                gf6.k(31, wj3.f);
                gf6.k(32, wj3.g);
                byte[] f0 = o5a.f0(wj3.h);
                if (f0 == null) {
                    gf6.X(33);
                    return;
                } else {
                    gf6.l(33, f0);
                    return;
                }
            default:
                hqg hqg2 = (hqg) obj;
                String str6 = hqg2.a;
                if (str6 == null) {
                    gf6.X(1);
                } else {
                    gf6.h(1, str6);
                }
                String str7 = hqg2.b;
                if (str7 == null) {
                    gf6.X(2);
                } else {
                    gf6.h(2, str7);
                }
                gf6.h(3, this.v.__ExistingWorkPolicy_enumToString(hqg2.c));
                String p2 = CollectionsKt___CollectionsKt.joinToString$default(hqg2.e, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                if (p2 == null) {
                    gf6.X(4);
                } else {
                    gf6.h(4, p2);
                }
                gf6.k(5, hqg2.f);
                gf6.k(6, (long) hqg2.g);
                xpg xpg2 = hqg2.d;
                String str8 = xpg2.a;
                if (str8 == null) {
                    gf6.X(7);
                } else {
                    gf6.h(7, str8);
                }
                gf6.k(8, (long) o5a.h0(xpg2.b));
                String str9 = xpg2.c;
                if (str9 == null) {
                    gf6.X(9);
                } else {
                    gf6.h(9, str9);
                }
                String str10 = xpg2.d;
                if (str10 == null) {
                    gf6.X(10);
                } else {
                    gf6.h(10, str10);
                }
                byte[] f3 = t64.f(xpg2.e);
                if (f3 == null) {
                    gf6.X(11);
                } else {
                    gf6.l(11, f3);
                }
                byte[] f4 = t64.f(xpg2.f);
                if (f4 == null) {
                    gf6.X(12);
                } else {
                    gf6.l(12, f4);
                }
                gf6.k(13, xpg2.g);
                gf6.k(14, xpg2.h);
                gf6.k(15, xpg2.i);
                gf6.k(16, (long) xpg2.k);
                gf6.k(17, (long) o5a.e(xpg2.l));
                gf6.k(18, xpg2.m);
                gf6.k(19, xpg2.n);
                gf6.k(20, xpg2.o);
                gf6.k(21, xpg2.p);
                gf6.k(22, xpg2.q ? 1 : 0);
                gf6.k(23, (long) o5a.S(xpg2.r));
                gf6.k(24, (long) xpg2.s);
                gf6.k(25, (long) xpg2.t);
                wj3 wj32 = xpg2.j;
                gf6.k(26, (long) o5a.Q(wj32.a));
                gf6.k(27, wj32.b ? 1 : 0);
                gf6.k(28, wj32.c ? 1 : 0);
                gf6.k(29, wj32.d ? 1 : 0);
                gf6.k(30, wj32.e ? 1 : 0);
                gf6.k(31, wj32.f);
                gf6.k(32, wj32.g);
                byte[] f02 = o5a.f0(wj32.h);
                if (f02 == null) {
                    gf6.X(33);
                    return;
                } else {
                    gf6.l(33, f02);
                    return;
                }
        }
    }
}
