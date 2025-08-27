package defpackage;

import java.lang.Thread;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: aua  reason: default package */
public final class aua {
    public static final /* synthetic */ KProperty[] o;
    public final tw8 a;
    public volatile nif b;
    public final Thread.UncaughtExceptionHandler c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final Lazy e = LazyKt.lazy(new yta(this, 1));
    public final v95 f;
    public final v95 g;
    public final v95 h;
    public final v95 i;
    public final v95 j;
    public final v95 k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;

    static {
        Class<aua> cls = aua.class;
        o = new KProperty[]{wj6.p(cls, "ioExecutor", "getIoExecutor()Ljava/util/concurrent/ExecutorService;", 0), wj6.p(cls, "computationExecutor", "getComputationExecutor()Ljava/util/concurrent/ExecutorService;", 0), wj6.p(cls, "singleExecutor", "getSingleExecutor()Ljava/util/concurrent/ExecutorService;", 0), wj6.p(cls, "singleLowPriorityExecutor", "getSingleLowPriorityExecutor()Ljava/util/concurrent/ExecutorService;", 0), wj6.p(cls, "network", "getNetwork()Ljava/util/concurrent/ExecutorService;", 0), wj6.p(cls, "singleTransmitExecutor", "getSingleTransmitExecutor()Ljava/util/concurrent/ExecutorService;", 0)};
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        new tw8(false, DurationKt.toDuration((int) IntCompanionObject.MAX_VALUE, durationUnit), DurationKt.toDuration((int) IntCompanionObject.MAX_VALUE, durationUnit), new oo9(11), new oo9(12));
    }

    public aua(tw8 tw8, vd3 vd3, v95 v95, v95 v952, v95 v953) {
        v95 v954 = v95;
        te teVar = te.a;
        v95 v955 = new v95("single", 1, 0, false, true, 0, 72);
        v95 v956 = new v95("single-low", 1, 0, false, true, 1, 8);
        v95 v957 = new v95("trnsmt", 1, 1, 0, true, false, 10);
        this.a = tw8;
        this.b = teVar;
        this.c = vd3;
        this.f = v954;
        this.g = v953;
        this.h = v955;
        this.i = v956;
        this.j = v952;
        this.k = v957;
        this.l = LazyKt.lazy(new xta(this, v954, 1));
        this.m = LazyKt.lazy(new xta(this, v955, 2));
        this.n = LazyKt.lazy(new xta(this, v955, 0));
    }

    public final ExecutorService a() {
        KProperty kProperty = o[1];
        return d(this.g);
    }

    public final ExecutorService b() {
        KProperty kProperty = o[0];
        return d(this.f);
    }

    public final ExecutorService c() {
        KProperty kProperty = o[2];
        return d(this.h);
    }

    public final ExecutorService d(v95 v95) {
        return (ExecutorService) this.d.computeIfAbsent(v95, new yi(11, new wk(26, this, v95)));
    }

    public final ExecutorService e(int i2, String str, int i3, int i4) {
        wta wta = (wta) this.e.getValue();
        wta.getClass();
        LinkedTransferQueue linkedTransferQueue = new LinkedTransferQueue();
        int i5 = i2;
        int i6 = i3;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i5, i6, 60000, TimeUnit.MILLISECONDS, linkedTransferQueue, wta.a.B(str, Integer.valueOf(i4)));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.setRejectedExecutionHandler(new iu1(1));
        return i(threadPoolExecutor, str);
    }

    public final ExecutorService f(int i2, String str) {
        wta wta = (wta) this.e.getValue();
        wta.getClass();
        LinkedTransferQueue linkedTransferQueue = new LinkedTransferQueue();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, linkedTransferQueue, wta.a.B(str, Integer.valueOf(i2)));
        threadPoolExecutor.setRejectedExecutionHandler(new iu1(1));
        return i(threadPoolExecutor, str);
    }

    public final ExecutorService g() {
        wta wta = (wta) this.e.getValue();
        wta.getClass();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 60000, TimeUnit.MILLISECONDS, new LinkedTransferQueue(), wta.a.B("tam-srvc", 5));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.setRejectedExecutionHandler(new iu1(1));
        return i(threadPoolExecutor, "tam-srvc");
    }

    public final ScheduledExecutorService h(ExecutorService executorService, String str) {
        boolean z = executorService instanceof la5;
        Lazy lazy = this.n;
        return z ? new ol4(executorService, lazy) : j(new ol4(executorService, lazy), str);
    }

    public final ExecutorService i(xo5 xo5, String str) {
        return this.a.b ? new la5(xo5, new zta(this, 0), new iz1(str, 5)) : xo5;
    }

    public final ScheduledExecutorService j(ScheduledExecutorService scheduledExecutorService, String str) {
        return (!this.a.b || (scheduledExecutorService instanceof ied)) ? scheduledExecutorService : new ied(scheduledExecutorService, new zta(this, 1), new iz1(str, 6));
    }
}
