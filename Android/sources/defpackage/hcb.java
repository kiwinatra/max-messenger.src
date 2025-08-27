package defpackage;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;
import kotlin.ranges.RangesKt;

/* renamed from: hcb  reason: default package */
public final class hcb extends WorkRequest.Builder {
    public hcb(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        xpg workSpec$work_runtime_release = getWorkSpec$work_runtime_release();
        long millis = timeUnit.toMillis(j);
        workSpec$work_runtime_release.getClass();
        int i = (millis > 900000 ? 1 : (millis == 900000 ? 0 : -1));
        String str = xpg.u;
        if (i < 0) {
            h88.x().Z(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long coerceAtLeast = RangesKt.coerceAtLeast(millis, 900000);
        long coerceAtLeast2 = RangesKt.coerceAtLeast(millis, 900000);
        if (coerceAtLeast < 900000) {
            h88.x().Z(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        workSpec$work_runtime_release.h = RangesKt.coerceAtLeast(coerceAtLeast, 900000);
        if (coerceAtLeast2 < 300000) {
            h88.x().Z(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (coerceAtLeast2 > workSpec$work_runtime_release.h) {
            h88 x = h88.x();
            x.Z(str, "Flex duration greater than interval duration; Changed to " + coerceAtLeast);
        }
        workSpec$work_runtime_release.i = RangesKt.coerceIn(coerceAtLeast2, 300000, workSpec$work_runtime_release.h);
    }

    public final WorkRequest buildInternal$work_runtime_release() {
        if (getBackoffCriteriaSet$work_runtime_release() && getWorkSpec$work_runtime_release().j.c) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        } else if (!getWorkSpec$work_runtime_release().q) {
            return new WorkRequest(getId$work_runtime_release(), getWorkSpec$work_runtime_release(), getTags$work_runtime_release());
        } else {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
        }
    }

    public final WorkRequest.Builder getThisObject$work_runtime_release() {
        return this;
    }
}
