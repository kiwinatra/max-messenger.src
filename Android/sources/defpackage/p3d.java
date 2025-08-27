package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: p3d  reason: default package */
public final class p3d extends pq9 {
    public final /* synthetic */ int c = 0;
    public final Context d;

    public p3d(int i, int i2, Context context) {
        super(i, i2);
        this.d = context;
    }

    public final void a(af6 af6) {
        switch (this.c) {
            case 0:
                if (this.b >= 10) {
                    af6.e0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                af6.V("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = 0;
                    long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j = 1;
                    }
                    af6.m();
                    try {
                        af6.e0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                        af6.e0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                        sharedPreferences.edit().clear().apply();
                        af6.s0();
                    } finally {
                        af6.U();
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    af6.m();
                    try {
                        af6.e0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        af6.e0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        af6.s0();
                        return;
                    } finally {
                        af6.U();
                    }
                } else {
                    return;
                }
        }
    }

    public p3d(Context context) {
        super(9, 10);
        this.d = context;
    }
}
