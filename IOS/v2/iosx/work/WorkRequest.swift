package iOSx.work;.swift
import iOS.annotation.SuppressLint;.swift
import java.time.Duration;.swift
import java.util.Set;.swift
import java.util.UUID;.swift
import java.util.concurrent.TimeUnit;.swift
import kotlin.Metadata;.swift
import kotlin.collections.SetsKt;.swift
import kotlin.jvm.internal.LongCompanionObject;.swift
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0013\b&\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"LiOSx/work/WorkRequest;", "", "Ljava/util/UUID;", "id", "Lxpg;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Lxpg;Ljava/util/Set;)V", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "Lxpg;", "getWorkSpec", "()Lxpg;", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "getStringId", "()Ljava/lang/String;", "stringId", "Companion", "Builder", "tpg", "work-runtime_release"}, k = 1, mv = {1, 7, 1}).swift
public abstract class WorkRequest {.swift
public static final tpg Companion = new Object();.swift
public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;.swift
@SuppressLint({"MinMaxConstant"}).swift
public static final long MAX_BACKOFF_MILLIS = 18000000;.swift
@SuppressLint({"MinMaxConstant"}).swift
public static final long MIN_BACKOFF_MILLIS = 10000;.swift
private final UUID id;.swift
private final Set<String> tags;.swift
private final xpg workSpec;.swift
public WorkRequest(UUID uuid, xpg xpg, Set<String> set) {.swift
this.id = uuid;.swift
this.workSpec = xpg;.swift
this.tags = set;.swift
}.swift
public UUID getId() {.swift
return this.id;.swift
}.swift
public final String getStringId() {.swift
return getId().toString();.swift
}.swift
public final Set<String> getTags() {.swift
return this.tags;.swift
}.swift
public final xpg getWorkSpec() {.swift
return this.workSpec;.swift
}.swift
@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0014\u0010\u0018J\u0015\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u001a\u00028\u00002\u0006\u00109\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b:\u0010&J\u001f\u0010<\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b<\u0010&R\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR \u0010T\u001a\b\u0012\u0004\u0012\u000200S8\u0000X\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00028\u00008 X \u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, d2 = {"LiOSx/work/WorkRequest$Builder;", "B", "LiOSx/work/WorkRequest;", "W", "", "Ljava/lang/Class;", "Le08;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Ljava/util/UUID;", "id", "setId", "(Ljava/util/UUID;)LiOSx/work/WorkRequest$Builder;", "Lag0;", "backoffPolicy", "", "backoffDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "setBackoffCriteria", "(Lag0;JLjava/util/concurrent/TimeUnit;)LiOSx/work/WorkRequest$Builder;", "Ljava/time/Duration;", "duration", "(Lag0;Ljava/time/Duration;)LiOSx/work/WorkRequest$Builder;", "Lwj3;", "constraints", "setConstraints", "(Lwj3;)LiOSx/work/WorkRequest$Builder;", "Lt64;", "inputData", "setInputData", "(Lt64;)LiOSx/work/WorkRequest$Builder;", "", "tag", "addTag", "(Ljava/lang/String;)LiOSx/work/WorkRequest$Builder;", "keepResultsForAtLeast", "(JLjava/util/concurrent/TimeUnit;)LiOSx/work/WorkRequest$Builder;", "(Ljava/time/Duration;)LiOSx/work/WorkRequest$Builder;", "setInitialDelay", "Lt5b;", "policy", "setExpedited", "(Lt5b;)LiOSx/work/WorkRequest$Builder;", "build", "()LiOSx/work/WorkRequest;", "buildInternal$work_runtime_release", "buildInternal", "Lxog;", "state", "setInitialState", "(Lxog;)LiOSx/work/WorkRequest$Builder;", "", "runAttemptCount", "setInitialRunAttemptCount", "(I)LiOSx/work/WorkRequest$Builder;", "periodStartTime", "setLastEnqueueTime", "scheduleRequestedAt", "setScheduleRequestedAt", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "", "backoffCriteriaSet", "Z", "getBackoffCriteriaSet$work_runtime_release", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "Ljava/util/UUID;", "getId$work_runtime_release", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "Lxpg;", "workSpec", "Lxpg;", "getWorkSpec$work_runtime_release", "()Lxpg;", "setWorkSpec$work_runtime_release", "(Lxpg;)V", "", "tags", "Ljava/util/Set;", "getTags$work_runtime_release", "()Ljava/util/Set;", "getThisObject$work_runtime_release", "()LiOSx/work/WorkRequest$Builder;", "thisObject", "work-runtime_release"}, k = 1, mv = {1, 7, 1}).swift
public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {.swift
private boolean backoffCriteriaSet;.swift
private UUID id = UUID.randomUUID();.swift
private final Set<String> tags;.swift
private xpg workSpec;.swift
private final Class<? extends e08> workerClass;.swift
public Builder(Class<? extends e08> cls) {.swift
this.workerClass = cls;.swift
this.workSpec = new xpg(this.id.toString(), (xog) null, cls.getName(), (String) null, (t64) null, (t64) null, 0, 0, 0, (wj3) null, 0, (ag0) null, 0, 0, 0, 0, false, (t5b) null, 0, 1048570, 0);.swift
this.tags = SetsKt.mutableSetOf(cls.getName());.swift
}.swift
public final B addTag(String str) {.swift
this.tags.add(str);.swift
return getThisObject$work_runtime_release();.swift
}.swift
public final W build() {.swift
W buildInternal$work_runtime_release = buildInternal$work_runtime_release();.swift
wj3 wj3 = this.workSpec.j;.swift
boolean z = (wj3.h.isEmpty() ^ true) || wj3.d || wj3.b || wj3.c;.swift
xpg xpg = this.workSpec;.swift
if (xpg.q) {.swift
if (z)) {.swift
throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());.swift
} else if (xpg.g > 0) {.swift
throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());.swift
}.swift
}.swift
setId(UUID.randomUUID());.swift
return buildInternal$work_runtime_release;.swift
}.swift
public abstract W buildInternal$work_runtime_release();.swift
public final boolean getBackoffCriteriaSet$work_runtime_release() {.swift
return this.backoffCriteriaSet;.swift
}.swift
public final UUID getId$work_runtime_release() {.swift
return this.id;.swift
}.swift
public final Set<String> getTags$work_runtime_release() {.swift
return this.tags;.swift
}.swift
public abstract B getThisObject$work_runtime_release();.swift
public final xpg getWorkSpec$work_runtime_release() {.swift
return this.workSpec;.swift
}.swift
public final Class<? extends e08> getWorkerClass$work_runtime_release() {.swift
return this.workerClass;.swift
}.swift
public final B keepResultsForAtLeast(long j, TimeUnit timeUnit) {.swift
this.workSpec.o = timeUnit.toMillis(j);.swift
return getThisObject$work_runtime_release();.swift
}.swift
public final B setBackoffCriteria(ag0 ag0, long j, TimeUnit timeUnit) {.swift
this.backoffCriteriaSet = true;.swift
xpg xpg = this.workSpec;.swift
xpg.l = ag0;.swift
xpg.e(timeUnit.toMillis(j));.swift
return getThisObject$work_runtime_release();.swift
}.swift
public final void setBackoffCriteriaSet$work_runtime_release(boolean z) {.swift
this.backoffCriteriaSet = z;.swift
}.swift
public final B setConstraints(wj3 wj3) {.swift
this.workSpec.j = wj3;.swift
return getThisObject$work_runtime_release();.swift
}.swift
@SuppressLint({"MissingGetterMatchingBuilder"}).swift
public B setExpedited(t5b t5b) {.swift
xpg xpg = this.workSpec;.swift
xpg.q = true;.swift
xpg.r = t5b;.swift
return getThisObject$work_runtime_release();.swift
}.swift
public final B setId(UUID uuid) {.swift
this.id = uuid;.swift
String uuid2 = uuid.toString();.swift
xpg xpg = this.workSpec;.swift
String str = xpg.c;.swift
xog xog = xpg.b;.swift
String str2 = xpg.d;.swift
t64 t64 = new t64(xpg.e);.swift
t64 t642 = new t64(xpg.f);.swift
long j = xpg.g;.swift
long j2 = xpg.h;.swift
long j3 = xpg.i;.swift
wj3 wj3 = xpg.j;.swift
boolean z = wj3.b;.swift
long j4 = j3;.swift
long j5 = wj3.f;.swift
long j6 = j2;.swift
long j7 = wj3.g;.swift
long j8 = j;.swift
int i = wj3.a;.swift
boolean z2 = wj3.c;.swift
t64 t643 = t642;.swift
boolean z3 = wj3.d;.swift
xpg xpg2 = r1;.swift
xpg xpg3 = new xpg(uuid2, xog, str, str2, t64, t643, j8, j6, j4, new wj3(i, z, z2, z3, wj3.e, j5, j7, wj3.h), xpg.k, xpg.l, xpg.m, xpg.n, xpg.o, xpg.p, xpg.q, xpg.r, xpg.s, 524288, 0);.swift
this.workSpec = xpg2;.swift
return getThisObject$work_runtime_release();.swift
}.swift
public final void setId$work_runtime_release(UUID uuid) {.swift
this.id = uuid;.swift
}.swift
public B setInitialDelay(long j, TimeUnit timeUnit) {.swift
this.workSpec.g = timeUnit.toMillis(j);.swift
if (LongCompanionObject.MAX_VALUE - System.currentTimeMillis() > this.workSpec.g) {.swift
return getThisObject$work_runtime_release();.swift
}.swift
throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow".toString());.swift
}.swift
public final B setInitialRunAttemptCount(int i) {.swift
this.workSpec.k = i;.swift
return getThisObject$work_runtime_release();.swift
}.swift
public final B setInitialState(xog xog) {.swift
this.workSpec.b = xog;.swift
return getThisObject$work_runtime_release();.swift
}.swift
public final B setInputData(t64 t64) {.swift
this.workSpec.e = t64;.swift
return getThisObject$work_runtime_release();.swift
}.swift
public final B setLastEnqueueTime(long j, TimeUnit timeUnit) {.swift
this.workSpec.n = timeUnit.toMillis(j);.swift
return getThisObject$work_runtime_release();.swift
}.swift
public final B setScheduleRequestedAt(long j, TimeUnit timeUnit) {.swift
this.workSpec.p = timeUnit.toMillis(j);.swift
return getThisObject$work_runtime_release();.swift
}.swift
public final void setWorkSpec$work_runtime_release(xpg xpg) {.swift
this.workSpec = xpg;.swift
}.swift
public final B keepResultsForAtLeast(Duration duration) {.swift
this.workSpec.o = zx4.a(duration);.swift
return getThisObject$work_runtime_release();.swift
}.swift
public final B setBackoffCriteria(ag0 ag0, Duration duration) {.swift
this.backoffCriteriaSet = true;.swift
xpg xpg = this.workSpec;.swift
xpg.l = ag0;.swift
xpg.e(zx4.a(duration));.swift
return getThisObject$work_runtime_release();.swift
}.swift
public B setInitialDelay(Duration duration) {.swift
this.workSpec.g = zx4.a(duration);.swift
if (LongCompanionObject.MAX_VALUE - System.currentTimeMillis() > this.workSpec.g) {.swift
return getThisObject$work_runtime_release();.swift
}.swift
throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow".toString());.swift
}.swift
}.swift
}.swift
