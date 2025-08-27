package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: upd  reason: default package */
public final class upd implements bw1, vpd, neg {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(upd.class, Object.class, "state$volatile");
    public final CoroutineContext a;
    public ArrayList b = new ArrayList(2);
    public Object c;
    public int o = -1;
    private volatile /* synthetic */ Object state$volatile = ld9.k;
    public Object v = ld9.n;

    public upd(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    public final void a(iod iod, int i) {
        this.c = iod;
        this.o = i;
    }

    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != ld9.l) {
                bpa bpa = ld9.m;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, bpa)) {
                        ArrayList<spd> arrayList = this.b;
                        if (arrayList != null) {
                            for (spd a2 : arrayList) {
                                a2.a();
                            }
                            this.v = ld9.n;
                            this.b = null;
                            return;
                        }
                        return;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
            } else {
                return;
            }
        }
    }

    public final Object c(Continuation continuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
        spd spd = (spd) atomicReferenceFieldUpdater.get(this);
        Object obj = this.v;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                spd spd2 = (spd) it.next();
                if (spd2 != spd) {
                    spd2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, ld9.l);
            this.v = ld9.n;
            this.b = null;
        }
        Object obj2 = spd.a;
        Function3 function3 = spd.c;
        Object obj3 = spd.d;
        Object invoke = function3.invoke(obj2, obj3, obj);
        bpa bpa = ld9.o;
        Object obj4 = spd.e;
        return obj3 == bpa ? ((Function1) obj4).invoke(continuation) : ((Function2) obj4).invoke(invoke, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d8 A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v3 java.lang.Object), (r10v1 java.lang.Object) binds: [B:48:0x00d5, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.tpd
            if (r0 == 0) goto L_0x0013
            r0 = r10
            tpd r0 = (defpackage.tpd) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            tpd r0 = new tpd
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r5) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00d8
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            upd r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00cd
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r10)
            r0.a = r9
            r0.o = r5
            lw1 r10 = new lw1
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r10.<init>(r5, r2)
            r10.u()
        L_0x0050:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = w
            java.lang.Object r6 = r2.get(r9)
            bpa r7 = defpackage.ld9.k
            if (r6 != r7) goto L_0x006b
        L_0x005a:
            boolean r7 = r2.compareAndSet(r9, r6, r10)
            if (r7 == 0) goto L_0x0064
            defpackage.cvg.z(r10, r9)
            goto L_0x00b4
        L_0x0064:
            java.lang.Object r7 = r2.get(r9)
            if (r7 == r6) goto L_0x005a
            goto L_0x0050
        L_0x006b:
            boolean r8 = r6 instanceof java.util.List
            if (r8 == 0) goto L_0x0099
        L_0x006f:
            boolean r8 = r2.compareAndSet(r9, r6, r7)
            if (r8 == 0) goto L_0x0092
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L_0x007b:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0050
            java.lang.Object r6 = r2.next()
            spd r6 = r9.e(r6)
            r6.g = r3
            r7 = -1
            r6.h = r7
            r9.f(r6, r5)
            goto L_0x007b
        L_0x0092:
            java.lang.Object r8 = r2.get(r9)
            if (r8 == r6) goto L_0x006f
            goto L_0x0050
        L_0x0099:
            boolean r2 = r6 instanceof defpackage.spd
            if (r2 == 0) goto L_0x00d9
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            spd r6 = (defpackage.spd) r6
            java.lang.Object r5 = r9.v
            kotlin.jvm.functions.Function3 r7 = r6.f
            if (r7 == 0) goto L_0x00b0
            java.lang.Object r6 = r6.d
            java.lang.Object r5 = r7.invoke(r9, r6, r5)
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
            goto L_0x00b1
        L_0x00b0:
            r5 = r3
        L_0x00b1:
            r10.l(r2, r5)
        L_0x00b4:
            java.lang.Object r10 = r10.t()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r10 != r2) goto L_0x00c1
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L_0x00c1:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r10 != r2) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
        L_0x00ca:
            if (r10 != r1) goto L_0x00cd
            return r1
        L_0x00cd:
            r0.a = r3
            r0.o = r4
            java.lang.Object r10 = r9.c(r0)
            if (r10 != r1) goto L_0x00d8
            return r1
        L_0x00d8:
            return r10
        L_0x00d9:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r10.<init>(r0)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upd.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: spd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: spd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: spd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: spd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.spd e(java.lang.Object r4) {
        /*
            r3 = this;
            java.util.ArrayList r3 = r3.b
            r0 = 0
            if (r3 != 0) goto L_0x0006
            return r0
        L_0x0006:
            java.util.Iterator r3 = r3.iterator()
        L_0x000a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x001c
            java.lang.Object r1 = r3.next()
            r2 = r1
            spd r2 = (defpackage.spd) r2
            java.lang.Object r2 = r2.a
            if (r2 != r4) goto L_0x000a
            r0 = r1
        L_0x001c:
            spd r0 = (defpackage.spd) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Clause with object "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " is not found"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upd.e(java.lang.Object):spd");
    }

    public final void f(spd spd, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
        if (!(atomicReferenceFieldUpdater.get(this) instanceof spd)) {
            Object obj = spd.a;
            if (!z) {
                ArrayList<spd> arrayList = this.b;
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    for (spd spd2 : arrayList) {
                        if (spd2.a == obj) {
                            throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                        }
                    }
                }
            }
            spd.b.invoke(obj, this, spd.d);
            if (this.v == ld9.n) {
                if (!z) {
                    this.b.add(spd);
                }
                spd.g = this.c;
                spd.h = this.o;
                this.c = null;
                this.o = -1;
                return;
            }
            atomicReferenceFieldUpdater.set(this, spd);
        }
    }

    public final int g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof kw1) {
                spd e = e(obj);
                if (e != null) {
                    Function3 function3 = e.f;
                    Function3 function32 = function3 != null ? (Function3) function3.invoke(this, e.d, obj2) : null;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, e)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    kw1 kw1 = (kw1) obj3;
                    this.v = obj2;
                    bpa f = kw1.f(Unit.INSTANCE, function32);
                    if (f == null) {
                        this.v = ld9.n;
                        return 2;
                    }
                    kw1.v(f);
                    return 0;
                }
                continue;
            } else if (Intrinsics.areEqual(obj3, (Object) ld9.l) || (obj3 instanceof spd)) {
                return 3;
            } else {
                if (Intrinsics.areEqual(obj3, (Object) ld9.m)) {
                    return 2;
                }
                if (Intrinsics.areEqual(obj3, (Object) ld9.k)) {
                    List listOf = CollectionsKt.listOf(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listOf)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                } else if (obj3 instanceof List) {
                    List plus = CollectionsKt.plus((Collection) obj3, obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, plus)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                } else {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
            }
        }
    }
}
