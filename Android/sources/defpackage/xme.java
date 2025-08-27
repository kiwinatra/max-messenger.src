package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: xme  reason: default package */
public final class xme extends j3 implements tz9, nw1, lj6 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(xme.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int v;

    public xme(Object obj) {
        this._state$volatile = obj;
    }

    public final Object a(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.INSTANCE;
    }

    public final boolean b(Object obj, Object obj2) {
        bpa bpa = q8.e;
        if (obj == null) {
            obj = bpa;
        }
        if (obj2 == null) {
            obj2 = bpa;
        }
        return m(obj, obj2);
    }

    public final void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public final boolean d(Object obj) {
        setValue(obj);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085 A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009f A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2 A[Catch:{ all -> 0x003a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b3 A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c0 A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c1 A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.ds5 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.wme
            if (r0 == 0) goto L_0x0013
            r0 = r11
            wme r0 = (defpackage.wme) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            wme r0 = new wme
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.w
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.y
            r3 = 0
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x0063
            r9 = 1
            if (r2 == r9) goto L_0x0054
            if (r2 == r5) goto L_0x0045
            if (r2 != r4) goto L_0x003d
            java.lang.Object r9 = r0.v
            pm7 r10 = r0.o
            yme r2 = r0.c
            ds5 r6 = r0.b
            xme r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x003a }
            goto L_0x007d
        L_0x003a:
            r9 = move-exception
            goto L_0x00d4
        L_0x003d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0045:
            java.lang.Object r9 = r0.v
            pm7 r10 = r0.o
            yme r2 = r0.c
            ds5 r6 = r0.b
            xme r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x003a }
            goto L_0x00b4
        L_0x0054:
            yme r2 = r0.c
            ds5 r10 = r0.b
            xme r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x005e }
            goto L_0x006d
        L_0x005e:
            r10 = move-exception
            r7 = r9
            r9 = r10
            goto L_0x00d4
        L_0x0063:
            kotlin.ResultKt.throwOnFailure(r11)
            k3 r11 = r9.h()
            yme r11 = (defpackage.yme) r11
            r2 = r11
        L_0x006d:
            kotlin.coroutines.CoroutineContext r11 = r0.getContext()     // Catch:{ all -> 0x005e }
            om7 r6 = defpackage.om7.a     // Catch:{ all -> 0x005e }
            kotlin.coroutines.CoroutineContext$Element r11 = r11.get(r6)     // Catch:{ all -> 0x005e }
            pm7 r11 = (defpackage.pm7) r11     // Catch:{ all -> 0x005e }
            r7 = r9
            r6 = r10
            r10 = r11
            r9 = r3
        L_0x007d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = w     // Catch:{ all -> 0x003a }
            java.lang.Object r11 = r11.get(r7)     // Catch:{ all -> 0x003a }
            if (r10 == 0) goto L_0x0091
            boolean r8 = r10.isActive()     // Catch:{ all -> 0x003a }
            if (r8 == 0) goto L_0x008c
            goto L_0x0091
        L_0x008c:
            java.util.concurrent.CancellationException r9 = r10.n()     // Catch:{ all -> 0x003a }
            throw r9     // Catch:{ all -> 0x003a }
        L_0x0091:
            if (r9 == 0) goto L_0x0099
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)     // Catch:{ all -> 0x003a }
            if (r8 != 0) goto L_0x00b4
        L_0x0099:
            bpa r9 = defpackage.q8.e     // Catch:{ all -> 0x003a }
            if (r11 != r9) goto L_0x009f
            r9 = r3
            goto L_0x00a0
        L_0x009f:
            r9 = r11
        L_0x00a0:
            r0.a = r7     // Catch:{ all -> 0x003a }
            r0.b = r6     // Catch:{ all -> 0x003a }
            r0.c = r2     // Catch:{ all -> 0x003a }
            r0.o = r10     // Catch:{ all -> 0x003a }
            r0.v = r11     // Catch:{ all -> 0x003a }
            r0.y = r5     // Catch:{ all -> 0x003a }
            java.lang.Object r9 = r6.a(r9, r0)     // Catch:{ all -> 0x003a }
            if (r9 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            r9 = r11
        L_0x00b4:
            java.util.concurrent.atomic.AtomicReference r11 = r2.a     // Catch:{ all -> 0x003a }
            bpa r8 = defpackage.f6e.h     // Catch:{ all -> 0x003a }
            java.lang.Object r11 = r11.getAndSet(r8)     // Catch:{ all -> 0x003a }
            bpa r8 = defpackage.f6e.i     // Catch:{ all -> 0x003a }
            if (r11 != r8) goto L_0x00c1
            goto L_0x007d
        L_0x00c1:
            r0.a = r7     // Catch:{ all -> 0x003a }
            r0.b = r6     // Catch:{ all -> 0x003a }
            r0.c = r2     // Catch:{ all -> 0x003a }
            r0.o = r10     // Catch:{ all -> 0x003a }
            r0.v = r9     // Catch:{ all -> 0x003a }
            r0.y = r4     // Catch:{ all -> 0x003a }
            java.lang.Object r11 = r2.c(r0)     // Catch:{ all -> 0x003a }
            if (r11 != r1) goto L_0x007d
            return r1
        L_0x00d4:
            r7.k(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xme.e(ds5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final bs5 f(CoroutineContext coroutineContext, int i, cu0 cu0) {
        return (((i < 0 || i >= 2) && i != -2) || cu0 != cu0.b) ? m5a.y(this, coroutineContext, i, cu0) : this;
    }

    public final Object getValue() {
        bpa bpa = q8.e;
        Object obj = w.get(this);
        if (obj == bpa) {
            return null;
        }
        return obj;
    }

    public final k3 i() {
        return new yme();
    }

    public final k3[] j() {
        return new yme[2];
    }

    public final List l() {
        return CollectionsKt.listOf(getValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        r11 = (defpackage.yme[]) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        if (r11 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        r1 = r11.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        if (r2 >= r1) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0037, code lost:
        r4 = r11[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0039, code lost:
        if (r4 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003b, code lost:
        r4 = r4.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        r5 = r4.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        if (r5 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0044, code lost:
        r6 = defpackage.f6e.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0046, code lost:
        if (r5 != r6) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0049, code lost:
        r7 = defpackage.f6e.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        if (r5 != r7) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0051, code lost:
        if (r4.compareAndSet(r5, r6) == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0058, code lost:
        if (r4.get() == r5) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005f, code lost:
        if (r4.compareAndSet(r5, r7) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0061, code lost:
        r4 = kotlin.Result.Companion;
        ((defpackage.lw1) r5).resumeWith(kotlin.Result.m23constructorimpl(kotlin.Unit.INSTANCE));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0073, code lost:
        if (r4.get() == r5) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0076, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0078, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r11 = r9.v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007b, code lost:
        if (r11 != r10) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007d, code lost:
        r9.v = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0080, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0081, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r10 = r9.a;
        r1 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0088, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0089, code lost:
        r8 = r11;
        r11 = r10;
        r10 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r0 = 1
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = w     // Catch:{ all -> 0x0013 }
            java.lang.Object r2 = r1.get(r9)     // Catch:{ all -> 0x0013 }
            r3 = 0
            if (r10 == 0) goto L_0x0016
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r10)     // Catch:{ all -> 0x0013 }
            if (r10 != 0) goto L_0x0016
            monitor-exit(r9)
            return r3
        L_0x0013:
            r10 = move-exception
            goto L_0x0095
        L_0x0016:
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r11)     // Catch:{ all -> 0x0013 }
            if (r10 == 0) goto L_0x001e
            monitor-exit(r9)
            return r0
        L_0x001e:
            r1.set(r9, r11)     // Catch:{ all -> 0x0013 }
            int r10 = r9.v     // Catch:{ all -> 0x0013 }
            r11 = r10 & 1
            if (r11 != 0) goto L_0x008f
            int r10 = r10 + r0
            r9.v = r10     // Catch:{ all -> 0x0013 }
            k3[] r11 = r9.a     // Catch:{ all -> 0x0013 }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0013 }
            monitor-exit(r9)
        L_0x002f:
            yme[] r11 = (defpackage.yme[]) r11
            if (r11 == 0) goto L_0x0078
            int r1 = r11.length
            r2 = r3
        L_0x0035:
            if (r2 >= r1) goto L_0x0078
            r4 = r11[r2]
            if (r4 == 0) goto L_0x0076
            java.util.concurrent.atomic.AtomicReference r4 = r4.a
        L_0x003d:
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L_0x0044
            goto L_0x0076
        L_0x0044:
            bpa r6 = defpackage.f6e.i
            if (r5 != r6) goto L_0x0049
            goto L_0x0076
        L_0x0049:
            bpa r7 = defpackage.f6e.h
            if (r5 != r7) goto L_0x005b
        L_0x004d:
            boolean r7 = r4.compareAndSet(r5, r6)
            if (r7 == 0) goto L_0x0054
            goto L_0x0076
        L_0x0054:
            java.lang.Object r7 = r4.get()
            if (r7 == r5) goto L_0x004d
            goto L_0x003d
        L_0x005b:
            boolean r6 = r4.compareAndSet(r5, r7)
            if (r6 == 0) goto L_0x006f
            lw1 r5 = (defpackage.lw1) r5
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = kotlin.Result.m23constructorimpl(r4)
            r5.resumeWith(r4)
            goto L_0x0076
        L_0x006f:
            java.lang.Object r6 = r4.get()
            if (r6 == r5) goto L_0x005b
            goto L_0x003d
        L_0x0076:
            int r2 = r2 + r0
            goto L_0x0035
        L_0x0078:
            monitor-enter(r9)
            int r11 = r9.v     // Catch:{ all -> 0x0082 }
            if (r11 != r10) goto L_0x0084
            int r10 = r10 + r0
            r9.v = r10     // Catch:{ all -> 0x0082 }
            monitor-exit(r9)
            return r0
        L_0x0082:
            r10 = move-exception
            goto L_0x008d
        L_0x0084:
            k3[] r10 = r9.a     // Catch:{ all -> 0x0082 }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0082 }
            monitor-exit(r9)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x002f
        L_0x008d:
            monitor-exit(r9)
            throw r10
        L_0x008f:
            int r10 = r10 + 2
            r9.v = r10     // Catch:{ all -> 0x0013 }
            monitor-exit(r9)
            return r0
        L_0x0095:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xme.m(java.lang.Object, java.lang.Object):boolean");
    }

    public final void setValue(Object obj) {
        if (obj == null) {
            obj = q8.e;
        }
        m((Object) null, obj);
    }
}
