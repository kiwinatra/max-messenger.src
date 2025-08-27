package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* renamed from: w77  reason: default package */
public final /* synthetic */ class w77 implements Callable {
    public final /* synthetic */ rt6 a;
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;

    public /* synthetic */ w77(rt6 rt6, int i) {
        this.a = rt6;
        this.c = i;
    }

    public final Object call() {
        rt6 rt6 = this.a;
        WorkDatabase workDatabase = (WorkDatabase) rt6.b;
        Long Z = workDatabase.u().Z("next_job_scheduler_id");
        int i = 0;
        int longValue = Z != null ? (int) Z.longValue() : 0;
        if (longValue != Integer.MAX_VALUE) {
            i = longValue + 1;
        }
        workDatabase.u().b0(new vsb("next_job_scheduler_id", Long.valueOf((long) i)));
        int i2 = this.b;
        if (i2 > longValue || longValue > this.c) {
            ((WorkDatabase) rt6.b).u().b0(new vsb("next_job_scheduler_id", Long.valueOf((long) (i2 + 1))));
            longValue = i2;
        }
        return Integer.valueOf(longValue);
    }
}
