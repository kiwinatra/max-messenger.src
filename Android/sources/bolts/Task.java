package bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Task<TResult> {
    public static final ExecutorService BACKGROUND_EXECUTOR;
    private static final Executor IMMEDIATE_EXECUTOR;
    private static Task<?> TASK_CANCELLED = new Task<>(true);
    private static Task<Boolean> TASK_FALSE = new Task<>(Boolean.FALSE);
    private static Task<?> TASK_NULL = new Task<>((Object) null);
    private static Task<Boolean> TASK_TRUE = new Task<>(Boolean.TRUE);
    public static final Executor UI_THREAD_EXECUTOR = zd.b.a;
    private static volatile ldf unobservedExceptionHandler;
    private boolean cancelled;
    private boolean complete;
    private List<nx3> continuations = new ArrayList();
    private Exception error;
    private boolean errorHasBeenObserved;
    private final Object lock = new Object();
    private TResult result;
    private xvf unobservedErrorNotifier;

    static {
        fq0 fq0 = fq0.d;
        BACKGROUND_EXECUTOR = fq0.a;
        IMMEDIATE_EXECUTOR = fq0.c;
    }

    public Task() {
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        return call(callable, executor, (sw1) null);
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        return call(callable, BACKGROUND_EXECUTOR, (sw1) null);
    }

    public static <TResult> Task<TResult> cancelled() {
        return TASK_CANCELLED;
    }

    /* access modifiers changed from: private */
    public static <TContinuationResult, TResult> void completeAfterTask(rdf rdf, nx3 nx3, Task<TResult> task, Executor executor, sw1 sw1) {
        try {
            executor.execute(new fdf(rdf, nx3, task, 1));
        } catch (Exception e) {
            rdf.b(new ExecutorException(e));
        }
    }

    /* access modifiers changed from: private */
    public static <TContinuationResult, TResult> void completeImmediately(rdf rdf, nx3 nx3, Task<TResult> task, Executor executor, sw1 sw1) {
        try {
            executor.execute(new fdf(rdf, nx3, task, 0));
        } catch (Exception e) {
            rdf.b(new ExecutorException(e));
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [rdf, kdf] */
    public static <TResult> kdf create() {
        new Task();
        return new rdf();
    }

    public static Task<Void> delay(long j) {
        return delay(j, fq0.d.b, (sw1) null);
    }

    public static <TResult> Task<TResult> forError(Exception exc) {
        Task<TResult> task = new Task<>();
        if (task.trySetError(exc)) {
            return task;
        }
        throw new IllegalStateException("Cannot set the error on a completed task.");
    }

    public static <TResult> Task<TResult> forResult(TResult tresult) {
        if (tresult == null) {
            return TASK_NULL;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? TASK_TRUE : TASK_FALSE;
        }
        Task<TResult> task = new Task<>();
        if (task.trySetResult(tresult)) {
            return task;
        }
        throw new IllegalStateException("Cannot set the result of a completed task.");
    }

    public static ldf getUnobservedExceptionHandler() {
        return null;
    }

    private void runContinuations() {
        synchronized (this.lock) {
            for (nx3 a : this.continuations) {
                try {
                    a.a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.continuations = null;
        }
    }

    public static void setUnobservedExceptionHandler(ldf ldf) {
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult((Object) null);
        }
        rdf rdf = new rdf();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task continueWith : collection) {
            continueWith.continueWith(new jdf(obj, arrayList, atomicBoolean, atomicInteger, rdf));
        }
        return rdf.a;
    }

    public static <TResult> Task<List<TResult>> whenAllResult(Collection<? extends Task<TResult>> collection) {
        return whenAll(collection).onSuccess(new gdf(1, collection));
    }

    public static Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult((Object) null);
        }
        rdf rdf = new rdf();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task continueWith : collection) {
            continueWith.continueWith(new idf(atomicBoolean, rdf, 1));
        }
        return rdf.a;
    }

    public static <TResult> Task<Task<TResult>> whenAnyResult(Collection<? extends Task<TResult>> collection) {
        if (collection.size() == 0) {
            return forResult((Object) null);
        }
        rdf rdf = new rdf();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task continueWith : collection) {
            continueWith.continueWith(new idf(atomicBoolean, rdf, 0));
        }
        return rdf.a;
    }

    public <TOut> Task<TOut> cast() {
        return this;
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, nx3 nx3) {
        return continueWhile(callable, nx3, IMMEDIATE_EXECUTOR, (sw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(nx3 nx3, Executor executor) {
        return continueWith(nx3, executor, (sw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(nx3 nx3, Executor executor) {
        return continueWithTask(nx3, executor, (sw1) null);
    }

    public Exception getError() {
        Exception exc;
        synchronized (this.lock) {
            try {
                exc = this.error;
                if (exc != null) {
                    this.errorHasBeenObserved = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public TResult getResult() {
        TResult tresult;
        synchronized (this.lock) {
            tresult = this.result;
        }
        return tresult;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.lock) {
            z = this.cancelled;
        }
        return z;
    }

    public boolean isCompleted() {
        boolean z;
        synchronized (this.lock) {
            z = this.complete;
        }
        return z;
    }

    public boolean isFaulted() {
        boolean z;
        synchronized (this.lock) {
            z = getError() != null;
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [nx3, java.lang.Object] */
    public Task<Void> makeVoid() {
        return continueWithTask(new Object());
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(nx3 nx3, Executor executor) {
        return onSuccess(nx3, executor, (sw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(nx3 nx3, Executor executor) {
        return onSuccessTask(nx3, executor, (sw1) null);
    }

    public boolean trySetCancelled() {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.cancelled = true;
                this.lock.notifyAll();
                runContinuations();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean trySetError(java.lang.Exception r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            boolean r1 = r3.complete     // Catch:{ all -> 0x000a }
            r2 = 0
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return r2
        L_0x000a:
            r3 = move-exception
            goto L_0x0024
        L_0x000c:
            r1 = 1
            r3.complete = r1     // Catch:{ all -> 0x000a }
            r3.error = r4     // Catch:{ all -> 0x000a }
            r3.errorHasBeenObserved = r2     // Catch:{ all -> 0x000a }
            java.lang.Object r4 = r3.lock     // Catch:{ all -> 0x000a }
            r4.notifyAll()     // Catch:{ all -> 0x000a }
            r3.runContinuations()     // Catch:{ all -> 0x000a }
            boolean r3 = r3.errorHasBeenObserved     // Catch:{ all -> 0x000a }
            if (r3 != 0) goto L_0x0022
            getUnobservedExceptionHandler()     // Catch:{ all -> 0x000a }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return r1
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bolts.Task.trySetError(java.lang.Exception):boolean");
    }

    public boolean trySetResult(TResult tresult) {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.result = tresult;
                this.lock.notifyAll();
                runContinuations();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void waitForCompletion() throws InterruptedException {
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, sw1 sw1) {
        rdf rdf = new rdf();
        try {
            executor.execute(new vj6(24, (Object) rdf, (Object) callable));
        } catch (Exception e) {
            rdf.b(new ExecutorException(e));
        }
        return rdf.a;
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable, sw1 sw1) {
        return call(callable, BACKGROUND_EXECUTOR, sw1);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, nx3 nx3, sw1 sw1) {
        return continueWhile(callable, nx3, IMMEDIATE_EXECUTOR, sw1);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(nx3 nx3, Executor executor, sw1 sw1) {
        boolean isCompleted;
        rdf rdf = new rdf();
        synchronized (this.lock) {
            try {
                isCompleted = isCompleted();
                if (!isCompleted) {
                    this.continuations.add(new ddf(rdf, nx3, executor, 0));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (isCompleted) {
            completeImmediately(rdf, nx3, this, executor, sw1);
        }
        return rdf.a;
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(nx3 nx3, Executor executor, sw1 sw1) {
        boolean isCompleted;
        rdf rdf = new rdf();
        synchronized (this.lock) {
            try {
                isCompleted = isCompleted();
                if (!isCompleted) {
                    this.continuations.add(new ddf(rdf, nx3, executor, 1));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (isCompleted) {
            completeAfterTask(rdf, nx3, this, executor, sw1);
        }
        return rdf.a;
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(nx3 nx3, Executor executor, sw1 sw1) {
        return continueWithTask((nx3) new edf(nx3, 0), executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(nx3 nx3, Executor executor, sw1 sw1) {
        return continueWithTask((nx3) new edf(nx3, 1), executor);
    }

    public static Task<Void> delay(long j, sw1 sw1) {
        return delay(j, fq0.d.b, sw1);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, nx3 nx3, Executor executor) {
        return continueWhile(callable, nx3, executor, (sw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(nx3 nx3) {
        return onSuccess(nx3, IMMEDIATE_EXECUTOR, (sw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(nx3 nx3) {
        return onSuccessTask(nx3, IMMEDIATE_EXECUTOR);
    }

    private Task(TResult tresult) {
        trySetResult(tresult);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, nx3 nx3, Executor executor, sw1 sw1) {
        vs6 vs6 = new vs6(9, false);
        vs6.b = new lp4((Callable) callable, nx3, executor, vs6);
        return makeVoid().continueWithTask((nx3) vs6.b, executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(nx3 nx3, sw1 sw1) {
        return onSuccess(nx3, IMMEDIATE_EXECUTOR, sw1);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(nx3 nx3, sw1 sw1) {
        return onSuccessTask(nx3, IMMEDIATE_EXECUTOR, sw1);
    }

    public static Task<Void> delay(long j, ScheduledExecutorService scheduledExecutorService, sw1 sw1) {
        if (j <= 0) {
            return forResult((Object) null);
        }
        rdf rdf = new rdf();
        scheduledExecutorService.schedule(new haf(1, (Object) rdf), j, TimeUnit.MILLISECONDS);
        return rdf.a;
    }

    public boolean waitForCompletion(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean isCompleted;
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait(timeUnit.toMillis(j));
                }
                isCompleted = isCompleted();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isCompleted;
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(callable, IMMEDIATE_EXECUTOR, (sw1) null);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, sw1 sw1) {
        return call(callable, IMMEDIATE_EXECUTOR, sw1);
    }

    private Task(boolean z) {
        if (z) {
            trySetCancelled();
        } else {
            trySetResult((Object) null);
        }
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(nx3 nx3) {
        return continueWith(nx3, IMMEDIATE_EXECUTOR, (sw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(nx3 nx3) {
        return continueWithTask(nx3, IMMEDIATE_EXECUTOR, (sw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(nx3 nx3, sw1 sw1) {
        return continueWith(nx3, IMMEDIATE_EXECUTOR, sw1);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(nx3 nx3, sw1 sw1) {
        return continueWithTask(nx3, IMMEDIATE_EXECUTOR, sw1);
    }
}
