package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.sequences.SequencesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: la5  reason: default package */
public class la5 implements ExecutorService {
    public static final AtomicInteger X = new AtomicInteger(0);
    public final ExecutorService a;
    public final zta b;
    public final boolean c = false;
    public final Function0 o;
    public volatile boolean v;
    public final AtomicLong w;
    public final ConcurrentHashMap x;
    public final ReentrantLock y;
    public final Condition z;

    public la5(ExecutorService executorService, zta zta, Function1 function1) {
        qr3 qr3 = new qr3(23);
        this.a = executorService;
        this.b = zta;
        this.o = qr3;
        this.w = new AtomicLong(0);
        this.x = new ConcurrentHashMap();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.y = reentrantLock;
        this.z = reentrantLock.newCondition();
        function1.invoke(new ne4(20, this));
    }

    public static long c(long j, long j2) {
        long r2 = Duration.m1371getInWholeMillisecondsimpl(j);
        long r4 = Duration.m1371getInWholeMillisecondsimpl(j2);
        long j3 = r2 + r4;
        return ((r2 ^ j3) & (r4 ^ j3)) < 0 ? DurationKt.toDuration((long) LongCompanionObject.MAX_VALUE, DurationUnit.MILLISECONDS) : DurationKt.toDuration(j3, DurationUnit.MILLISECONDS);
    }

    public static List g(ConcurrentHashMap concurrentHashMap) {
        Collection values = concurrentHashMap.values();
        int size = concurrentHashMap.size();
        if (size == 0) {
            return CollectionsKt.emptyList();
        }
        if (size != 1) {
            return new ArrayList(values);
        }
        Iterator it = values.iterator();
        return it.hasNext() ? CollectionsKt.listOf(it.next()) : CollectionsKt.emptyList();
    }

    public final void a(long j) {
        ReentrantLock reentrantLock = this.y;
        reentrantLock.lock();
        try {
            this.x.remove(Long.valueOf(j));
            this.z.signal();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public final yeg b() {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        long f = f();
        return new yeg(name, f, f, (Thread) null, this.c ? SequencesKt.toList(SequencesKt.filter(SequencesKt.drop(ArraysKt.asSequence((T[]) currentThread.getStackTrace()), 2), new ga5(this, 1))) : CollectionsKt.emptyList());
    }

    public final void d() {
        this.v = true;
        ReentrantLock reentrantLock = this.y;
        reentrantLock.lock();
        try {
            this.z.signal();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long e(yeg yeg) {
        long andIncrement = this.w.getAndIncrement();
        ReentrantLock reentrantLock = this.y;
        reentrantLock.lock();
        try {
            Long valueOf = Long.valueOf(andIncrement);
            this.x.put(valueOf, new yeg(yeg.a, yeg.b, f(), Thread.currentThread(), yeg.e));
            Unit unit = Unit.INSTANCE;
            return andIncrement;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void execute(Runnable runnable) {
        this.a.execute(i(runnable, b()));
    }

    public final long f() {
        return ((Duration) this.o.invoke()).m1408unboximpl();
    }

    public final ja5 h(Callable callable, yeg yeg) {
        return new ja5(callable, new fa5(this, yeg, 0), new ga5(this, 0));
    }

    public final ka5 i(Runnable runnable, yeg yeg) {
        return new ka5(runnable, new fa5(this, yeg, 1), new ga5(this, 2));
    }

    public final List invokeAll(Collection collection) {
        Iterable<Callable> iterable = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (Callable h : iterable) {
            arrayList.add(h(h, b()));
        }
        return this.a.invokeAll(arrayList);
    }

    public final Object invokeAny(Collection collection) {
        Iterable<Callable> iterable = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (Callable h : iterable) {
            arrayList.add(h(h, b()));
        }
        return this.a.invokeAny(arrayList);
    }

    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final void shutdown() {
        this.a.shutdown();
        d();
    }

    public final List shutdownNow() {
        ArrayList arrayList = new ArrayList();
        for (Runnable runnable : this.a.shutdownNow()) {
            if (runnable instanceof ka5) {
                runnable = ((ka5) runnable).a;
            }
            arrayList.add(runnable);
        }
        d();
        return arrayList;
    }

    public final Future submit(Callable callable) {
        return this.a.submit(h(callable, b()));
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.a.submit(i(runnable, b()), obj);
    }

    public final Future submit(Runnable runnable) {
        return this.a.submit(i(runnable, b()));
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        Iterable<Callable> iterable = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (Callable h : iterable) {
            arrayList.add(h(h, b()));
        }
        return this.a.invokeAll(arrayList, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        Iterable<Callable> iterable = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (Callable h : iterable) {
            arrayList.add(h(h, b()));
        }
        return this.a.invokeAny(arrayList, j, timeUnit);
    }
}
