package defpackage;

import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: qkf  reason: default package */
public final class qkf {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public qkf(long j) {
        d(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.b == -9223372036854775807L) {
                long j2 = this.a;
                if (j2 == 9223372036854775806L) {
                    Long l = (Long) this.d.get();
                    l.getClass();
                    j2 = l.longValue();
                }
                this.b = j2 - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long j3 = (j2 * 90000) / 1000000;
                long j4 = (4294967296L + j3) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j;
                long j6 = (j4 * 8589934592L) + j;
                j = Math.abs(j5 - j3) < Math.abs(j6 - j3) ? j5 : j6;
            }
            return a((j * 1000000) / 90000);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized long c() {
        long j;
        j = this.a;
        if (j == LongCompanionObject.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void d(long j) {
        this.a = j;
        this.b = j == LongCompanionObject.MAX_VALUE ? 0 : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }
}
