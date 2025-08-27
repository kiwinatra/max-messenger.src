package androidx.work;

import android.annotation.SuppressLint;
import java.time.Duration;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.LongCompanionObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0013\b&\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/work/WorkRequest;", "", "Ljava/util/UUID;", "id", "Lxpg;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Lxpg;Ljava/util/Set;)V", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "Lxpg;", "getWorkSpec", "()Lxpg;", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "getStringId", "()Ljava/lang/String;", "stringId", "Companion", "Builder", "tpg", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public abstract class WorkRequest {
    public static final tpg Companion = new Object();
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;
    @SuppressLint({"MinMaxConstant"})
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_BACKOFF_MILLIS = 10000;
    private final UUID id;
    private final Set<String> tags;
    private final xpg workSpec;

    public WorkRequest(UUID uuid, xpg xpg, Set<String> set) {
        this.id = uuid;
        this.workSpec = xpg;
        this.tags = set;
    }

    public UUID getId() {
        return this.id;
    }

    public final String getStringId() {
        return getId().toString();
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    public final xpg getWorkSpec() {
        return this.workSpec;
    }

    @Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0014\u0010\u0018J\u0015\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\u0017\u0010%\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b%\u0010'J\u001f\u0010(\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010&J\u0017\u0010(\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b(\u0010'J\u0017\u0010+\u001a\u00028\u00002\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00028\u0001¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00028\u0001H ¢\u0006\u0004\b/\u0010.J\u0017\u00103\u001a\u00028\u00002\u0006\u00102\u001a\u000201H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00028\u00002\u0006\u00106\u001a\u000205H\u0007¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00028\u00002\u0006\u00109\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b:\u0010&J\u001f\u0010<\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b<\u0010&R\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR \u0010T\u001a\b\u0012\u0004\u0012\u00020!0S8\u0000X\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00028\u00008 X \u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, d2 = {"Landroidx/work/WorkRequest$Builder;", "B", "Landroidx/work/WorkRequest;", "W", "", "Ljava/lang/Class;", "Le08;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Ljava/util/UUID;", "id", "setId", "(Ljava/util/UUID;)Landroidx/work/WorkRequest$Builder;", "Lag0;", "backoffPolicy", "", "backoffDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "setBackoffCriteria", "(Lag0;JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "Ljava/time/Duration;", "duration", "(Lag0;Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "Lwj3;", "constraints", "setConstraints", "(Lwj3;)Landroidx/work/WorkRequest$Builder;", "Lt64;", "inputData", "setInputData", "(Lt64;)Landroidx/work/WorkRequest$Builder;", "", "tag", "addTag", "(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;", "keepResultsForAtLeast", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "(Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "setInitialDelay", "Lt5b;", "policy", "setExpedited", "(Lt5b;)Landroidx/work/WorkRequest$Builder;", "build", "()Landroidx/work/WorkRequest;", "buildInternal$work_runtime_release", "buildInternal", "Lxog;", "state", "setInitialState", "(Lxog;)Landroidx/work/WorkRequest$Builder;", "", "runAttemptCount", "setInitialRunAttemptCount", "(I)Landroidx/work/WorkRequest$Builder;", "periodStartTime", "setLastEnqueueTime", "scheduleRequestedAt", "setScheduleRequestedAt", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "", "backoffCriteriaSet", "Z", "getBackoffCriteriaSet$work_runtime_release", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "Ljava/util/UUID;", "getId$work_runtime_release", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "Lxpg;", "workSpec", "Lxpg;", "getWorkSpec$work_runtime_release", "()Lxpg;", "setWorkSpec$work_runtime_release", "(Lxpg;)V", "", "tags", "Ljava/util/Set;", "getTags$work_runtime_release", "()Ljava/util/Set;", "getThisObject$work_runtime_release", "()Landroidx/work/WorkRequest$Builder;", "thisObject", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {
        private boolean backoffCriteriaSet;
        private UUID id = UUID.randomUUID();
        private final Set<String> tags;
        private xpg workSpec;
        private final Class<? extends e08> workerClass;

        public Builder(Class<? extends e08> cls) {
            this.workerClass = cls;
            this.workSpec = new xpg(this.id.toString(), (xog) null, cls.getName(), (String) null, (t64) null, (t64) null, 0, 0, 0, (wj3) null, 0, (ag0) null, 0, 0, 0, 0, false, (t5b) null, 0, 1048570, 0);
            this.tags = SetsKt.mutableSetOf(cls.getName());
        }

        public final B addTag(String str) {
            this.tags.add(str);
            return getThisObject$work_runtime_release();
        }

        public final W build() {
            W buildInternal$work_runtime_release = buildInternal$work_runtime_release();
            wj3 wj3 = this.workSpec.j;
            boolean z = (wj3.h.isEmpty() ^ true) || wj3.d || wj3.b || wj3.c;
            xpg xpg = this.workSpec;
            if (xpg.q) {
                if (!(!z)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                } else if (xpg.g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            setId(UUID.randomUUID());
            return buildInternal$work_runtime_release;
        }

        public abstract W buildInternal$work_runtime_release();

        public final boolean getBackoffCriteriaSet$work_runtime_release() {
            return this.backoffCriteriaSet;
        }

        public final UUID getId$work_runtime_release() {
            return this.id;
        }

        public final Set<String> getTags$work_runtime_release() {
            return this.tags;
        }

        public abstract B getThisObject$work_runtime_release();

        public final xpg getWorkSpec$work_runtime_release() {
            return this.workSpec;
        }

        public final Class<? extends e08> getWorkerClass$work_runtime_release() {
            return this.workerClass;
        }

        public final B keepResultsForAtLeast(long j, TimeUnit timeUnit) {
            this.workSpec.o = timeUnit.toMillis(j);
            return getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(ag0 ag0, long j, TimeUnit timeUnit) {
            this.backoffCriteriaSet = true;
            xpg xpg = this.workSpec;
            xpg.l = ag0;
            xpg.e(timeUnit.toMillis(j));
            return getThisObject$work_runtime_release();
        }

        public final void setBackoffCriteriaSet$work_runtime_release(boolean z) {
            this.backoffCriteriaSet = z;
        }

        public final B setConstraints(wj3 wj3) {
            this.workSpec.j = wj3;
            return getThisObject$work_runtime_release();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B setExpedited(t5b t5b) {
            xpg xpg = this.workSpec;
            xpg.q = true;
            xpg.r = t5b;
            return getThisObject$work_runtime_release();
        }

        public final B setId(UUID uuid) {
            this.id = uuid;
            String uuid2 = uuid.toString();
            xpg xpg = this.workSpec;
            String str = xpg.c;
            xog xog = xpg.b;
            String str2 = xpg.d;
            t64 t64 = new t64(xpg.e);
            t64 t642 = new t64(xpg.f);
            long j = xpg.g;
            long j2 = xpg.h;
            long j3 = xpg.i;
            wj3 wj3 = xpg.j;
            boolean z = wj3.b;
            long j4 = j3;
            long j5 = wj3.f;
            long j6 = j2;
            long j7 = wj3.g;
            long j8 = j;
            int i = wj3.a;
            boolean z2 = wj3.c;
            t64 t643 = t642;
            boolean z3 = wj3.d;
            xpg xpg2 = r1;
            xpg xpg3 = new xpg(uuid2, xog, str, str2, t64, t643, j8, j6, j4, new wj3(i, z, z2, z3, wj3.e, j5, j7, wj3.h), xpg.k, xpg.l, xpg.m, xpg.n, xpg.o, xpg.p, xpg.q, xpg.r, xpg.s, 524288, 0);
            this.workSpec = xpg2;
            return getThisObject$work_runtime_release();
        }

        public final void setId$work_runtime_release(UUID uuid) {
            this.id = uuid;
        }

        public B setInitialDelay(long j, TimeUnit timeUnit) {
            this.workSpec.g = timeUnit.toMillis(j);
            if (LongCompanionObject.MAX_VALUE - System.currentTimeMillis() > this.workSpec.g) {
                return getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        public final B setInitialRunAttemptCount(int i) {
            this.workSpec.k = i;
            return getThisObject$work_runtime_release();
        }

        public final B setInitialState(xog xog) {
            this.workSpec.b = xog;
            return getThisObject$work_runtime_release();
        }

        public final B setInputData(t64 t64) {
            this.workSpec.e = t64;
            return getThisObject$work_runtime_release();
        }

        public final B setLastEnqueueTime(long j, TimeUnit timeUnit) {
            this.workSpec.n = timeUnit.toMillis(j);
            return getThisObject$work_runtime_release();
        }

        public final B setScheduleRequestedAt(long j, TimeUnit timeUnit) {
            this.workSpec.p = timeUnit.toMillis(j);
            return getThisObject$work_runtime_release();
        }

        public final void setWorkSpec$work_runtime_release(xpg xpg) {
            this.workSpec = xpg;
        }

        public final B keepResultsForAtLeast(Duration duration) {
            this.workSpec.o = zx4.a(duration);
            return getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(ag0 ag0, Duration duration) {
            this.backoffCriteriaSet = true;
            xpg xpg = this.workSpec;
            xpg.l = ag0;
            xpg.e(zx4.a(duration));
            return getThisObject$work_runtime_release();
        }

        public B setInitialDelay(Duration duration) {
            this.workSpec.g = zx4.a(duration);
            if (LongCompanionObject.MAX_VALUE - System.currentTimeMillis() > this.workSpec.g) {
                return getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }
    }
}
