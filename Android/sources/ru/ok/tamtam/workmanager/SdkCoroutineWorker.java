package ru.ok.tamtam.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H@¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\b¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8DX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020&8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Le08;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lzz7;", "Ld08;", "startWork", "()Lzz7;", "", "onStopWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt64;", "data", "setProgress", "(Lt64;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo96;", "foregroundInfo", "setForeground", "(Lo96;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Lva3;", "job", "Lva3;", "Lcyd;", "future", "Lcyd;", "Lz9f;", "tamComponent$delegate", "Lkotlin/Lazy;", "getTamComponent", "()Lz9f;", "tamComponent", "Lq04;", "coroutineContext", "Lq04;", "getCoroutineContext", "()Lq04;", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSdkCoroutineWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkCoroutineWorker.kt\nru/ok/tamtam/workmanager/SdkCoroutineWorker\n+ 2 ListenableFuture.kt\nandroidx/work/ListenableFutureKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,136:1\n41#2,8:137\n49#2:154\n61#2,7:155\n41#2,8:164\n49#2:181\n61#2,7:182\n314#3,9:145\n323#3,2:162\n314#3,9:172\n323#3,2:189\n*S KotlinDebug\n*F\n+ 1 SdkCoroutineWorker.kt\nru/ok/tamtam/workmanager/SdkCoroutineWorker\n*L\n98#1:137,8\n98#1:154\n98#1:155,7\n113#1:164,8\n113#1:181\n113#1:182,7\n98#1:145,9\n98#1:162,2\n113#1:172,9\n113#1:189,2\n*E\n"})
public abstract class SdkCoroutineWorker extends e08 {
    private final q04 coroutineContext;
    /* access modifiers changed from: private */
    public final cyd future;
    private final va3 job = kv0.b();
    private final Lazy tamComponent$delegate;

    /* JADX WARNING: type inference failed for: r4v2, types: [o1, java.lang.Object, cyd] */
    public SdkCoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ? obj = new Object();
        this.future = obj;
        obj.d(new mgd(2, this), (qn) ((g6d) getTaskExecutor()).b);
        this.tamComponent$delegate = LazyKt.lazy(new a1b(context, 21));
        this.coroutineContext = ((osa) ((sjd) getTamComponent()).y()).a();
    }

    public static void b(SdkCoroutineWorker sdkCoroutineWorker) {
        if (sdkCoroutineWorker.future.a instanceof u0) {
            ((qn7) sdkCoroutineWorker.job).b((CancellationException) null);
        }
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(SdkCoroutineWorker sdkCoroutineWorker, Continuation<? super o96> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(Continuation continuation);

    public q04 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(Continuation continuation) {
        return getForegroundInfo$suspendImpl(this, continuation);
    }

    public final zz7 getForegroundInfoAsync() {
        qm7 b = kv0.b();
        jx3 a = e14.a(getCoroutineContext().plus(b));
        cn7 cn7 = new cn7(b);
        ev0.v(a, (CoroutineContext) null, (f14) null, new tjd(cn7, this, (Continuation) null), 3);
        return cn7;
    }

    public final z9f getTamComponent() {
        return (z9f) this.tamComponent$delegate.getValue();
    }

    public Object onStopWork(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public final void onStopped() {
        this.future.cancel(false);
        ev0.v(e14.a(getCoroutineContext().plus(this.job)), (CoroutineContext) null, (f14) null, new ujd(this, (Continuation) null), 3);
    }

    public final Object setForeground(o96 o96, Continuation<? super Unit> continuation) {
        zz7 foregroundAsync = setForegroundAsync(o96);
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e) {
                e = e;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                throw e;
            }
        } else {
            lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
            lw1.u();
            foregroundAsync.d(new uj6(20, lw1, foregroundAsync), bp4.a);
            lw1.k(new vjd(foregroundAsync, 0));
            Object t = lw1.t();
            if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return t;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object setProgress(t64 t64, Continuation<? super Unit> continuation) {
        zz7 progressAsync = setProgressAsync(t64);
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e) {
                e = e;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                throw e;
            }
        } else {
            lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
            lw1.u();
            progressAsync.d(new vj6(18, (Object) lw1, (Object) progressAsync), bp4.a);
            lw1.k(new vjd(progressAsync, 1));
            Object t = lw1.t();
            if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return t;
            }
        }
        return Unit.INSTANCE;
    }

    public final zz7 startWork() {
        ev0.v(e14.a(getCoroutineContext().plus(this.job)), (CoroutineContext) null, (f14) null, new wjd(this, (Continuation) null), 3);
        return this.future;
    }
}
