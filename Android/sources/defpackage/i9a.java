package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.time.Duration;

/* renamed from: i9a  reason: default package */
public final class i9a implements k9a {
    public final long b;
    public final long c;

    public i9a(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final Date a(Date date) {
        int year = date.getYear();
        int month = date.getMonth();
        int date2 = date.getDate();
        long j = this.c;
        return new Date(year, month, date2, (int) Duration.m1369getInWholeHoursimpl(j), (int) (Duration.m1372getInWholeMinutesimpl(j) % ((long) 60)));
    }

    public final boolean b() {
        Date time = Calendar.getInstance().getTime();
        Date c2 = c(time);
        Date a = a(time);
        if ((time.compareTo(c2) < 0 || time.compareTo(a) > 0) && c2.compareTo(a) > 0) {
            c2.setTime(c2.getTime() - TimeUnit.DAYS.toMillis(1));
        } else if (a.compareTo(c2) < 0) {
            a.setTime(TimeUnit.DAYS.toMillis(1) + a.getTime());
        }
        return time.compareTo(c2) >= 0 && time.compareTo(a) < 0;
    }

    public final Date c(Date date) {
        int year = date.getYear();
        int month = date.getMonth();
        int date2 = date.getDate();
        long j = this.b;
        return new Date(year, month, date2, (int) Duration.m1369getInWholeHoursimpl(j), (int) (Duration.m1372getInWholeMinutesimpl(j) % ((long) 60)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9a)) {
            return false;
        }
        i9a i9a = (i9a) obj;
        return Duration.m1358equalsimpl0(this.b, i9a.b) && Duration.m1358equalsimpl0(this.c, i9a.c);
    }

    public final int hashCode() {
        return Duration.m1381hashCodeimpl(this.c) + (Duration.m1381hashCodeimpl(this.b) * 31);
    }

    public final String toString() {
        return rae.p("Schedule(startTime=", Duration.m1402toStringimpl(this.b), ", endTime=", Duration.m1402toStringimpl(this.c), ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i9a(int r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r1 = kotlin.time.DurationKt.toDuration((int) r6, (kotlin.time.DurationUnit) r0)
            kotlin.time.DurationUnit r6 = kotlin.time.DurationUnit.MINUTES
            long r3 = kotlin.time.DurationKt.toDuration((int) r7, (kotlin.time.DurationUnit) r6)
            long r1 = kotlin.time.Duration.m1389plusLRDsOJo(r1, r3)
            long r7 = kotlin.time.DurationKt.toDuration((int) r8, (kotlin.time.DurationUnit) r0)
            long r3 = kotlin.time.DurationKt.toDuration((int) r9, (kotlin.time.DurationUnit) r6)
            long r6 = kotlin.time.Duration.m1389plusLRDsOJo(r7, r3)
            r5.<init>(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i9a.<init>(int, int, int, int):void");
    }
}
