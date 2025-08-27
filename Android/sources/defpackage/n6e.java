package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n6e  reason: default package */
public class n6e extends j3 implements sz9, nw1, lj6 {
    public long X;
    public int Y;
    public int Z;
    public final int v;
    public final int w;
    public final cu0 x;
    public Object[] y;
    public long z;

    public n6e(int i, int i2, cu0 cu0) {
        this.v = i;
        this.w = i2;
        this.x = cu0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0093 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0094 A[EDGE_INSN: B:52:0x0094->B:38:0x0094 ?: BREAK  , SYNTHETIC] */
    public static java.lang.Object n(defpackage.n6e r8, defpackage.ds5 r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.m6e
            if (r0 == 0) goto L_0x0013
            r0 = r10
            m6e r0 = (defpackage.m6e) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            m6e r0 = new m6e
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L_0x0060
            r8 = 1
            if (r2 == r8) goto L_0x0051
            if (r2 == r4) goto L_0x0045
            if (r2 != r3) goto L_0x003d
            pm7 r8 = r0.o
            o6e r9 = r0.c
            ds5 r2 = r0.b
            n6e r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x003a }
        L_0x0036:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x0078
        L_0x003a:
            r8 = move-exception
            goto L_0x00b6
        L_0x003d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0045:
            pm7 r8 = r0.o
            o6e r9 = r0.c
            ds5 r2 = r0.b
            n6e r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x003a }
            goto L_0x007b
        L_0x0051:
            o6e r9 = r0.c
            ds5 r8 = r0.b
            n6e r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x005d }
            r10 = r8
            r8 = r2
            goto L_0x006c
        L_0x005d:
            r8 = move-exception
            r5 = r2
            goto L_0x00b6
        L_0x0060:
            kotlin.ResultKt.throwOnFailure(r10)
            k3 r10 = r8.h()
            o6e r10 = (defpackage.o6e) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x006c:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()     // Catch:{ all -> 0x00b3 }
            om7 r5 = defpackage.om7.a     // Catch:{ all -> 0x00b3 }
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r5)     // Catch:{ all -> 0x00b3 }
            pm7 r2 = (defpackage.pm7) r2     // Catch:{ all -> 0x00b3 }
        L_0x0078:
            r5 = r8
            r8 = r2
            r2 = r10
        L_0x007b:
            java.lang.Object r10 = r5.v(r9)     // Catch:{ all -> 0x003a }
            bpa r6 = defpackage.m5a.c     // Catch:{ all -> 0x003a }
            if (r10 != r6) goto L_0x0094
            r0.a = r5     // Catch:{ all -> 0x003a }
            r0.b = r2     // Catch:{ all -> 0x003a }
            r0.c = r9     // Catch:{ all -> 0x003a }
            r0.o = r8     // Catch:{ all -> 0x003a }
            r0.x = r4     // Catch:{ all -> 0x003a }
            java.lang.Object r10 = r5.l(r9, r0)     // Catch:{ all -> 0x003a }
            if (r10 != r1) goto L_0x007b
            return r1
        L_0x0094:
            if (r8 == 0) goto L_0x00a2
            boolean r6 = r8.isActive()     // Catch:{ all -> 0x003a }
            if (r6 == 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            java.util.concurrent.CancellationException r8 = r8.n()     // Catch:{ all -> 0x003a }
            throw r8     // Catch:{ all -> 0x003a }
        L_0x00a2:
            r0.a = r5     // Catch:{ all -> 0x003a }
            r0.b = r2     // Catch:{ all -> 0x003a }
            r0.c = r9     // Catch:{ all -> 0x003a }
            r0.o = r8     // Catch:{ all -> 0x003a }
            r0.x = r3     // Catch:{ all -> 0x003a }
            java.lang.Object r10 = r2.a(r10, r0)     // Catch:{ all -> 0x003a }
            if (r10 != r1) goto L_0x0036
            return r1
        L_0x00b3:
            r10 = move-exception
            r5 = r8
            r8 = r10
        L_0x00b6:
            r5.k(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n6e.n(n6e, ds5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object a(Object obj, Continuation continuation) {
        Continuation[] continuationArr;
        l6e l6e;
        if (d(obj)) {
            return Unit.INSTANCE;
        }
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
        lw1.u();
        Continuation[] continuationArr2 = ct.a;
        synchronized (this) {
            try {
                if (t(obj)) {
                    Result.Companion companion = Result.Companion;
                    lw1.resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
                    continuationArr = q(continuationArr2);
                    l6e = null;
                } else {
                    l6e l6e2 = new l6e(this, ((long) (this.Y + this.Z)) + r(), obj, lw1);
                    p(l6e2);
                    this.Z++;
                    if (this.w == 0) {
                        continuationArr2 = q(continuationArr2);
                    }
                    continuationArr = continuationArr2;
                    l6e = l6e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (l6e != null) {
            cvg.z(lw1, new aw1(2, l6e));
        }
        for (Continuation continuation2 : continuationArr) {
            if (continuation2 != null) {
                Result.Companion companion2 = Result.Companion;
                continuation2.resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
            }
        }
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (t != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            t = Unit.INSTANCE;
        }
        return t == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? t : Unit.INSTANCE;
    }

    public final void c() {
        synchronized (this) {
            w(r() + ((long) this.Y), this.X, r() + ((long) this.Y), r() + ((long) this.Y) + ((long) this.Z));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean d(Object obj) {
        int i;
        boolean z2;
        Continuation[] continuationArr = ct.a;
        synchronized (this) {
            if (t(obj)) {
                continuationArr = q(continuationArr);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
            }
        }
        return z2;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        return n(this, ds5, continuation);
    }

    public final bs5 f(CoroutineContext coroutineContext, int i, cu0 cu0) {
        return m5a.y(this, coroutineContext, i, cu0);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [k3, java.lang.Object, o6e] */
    public final k3 i() {
        ? obj = new Object();
        obj.a = -1;
        return obj;
    }

    public final k3[] j() {
        return new o6e[2];
    }

    public final Object l(o6e o6e, m6e m6e) {
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(m6e));
        lw1.u();
        synchronized (this) {
            if (u(o6e) < 0) {
                o6e.b = lw1;
            } else {
                Result.Companion companion = Result.Companion;
                lw1.resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
            }
            Unit unit = Unit.INSTANCE;
        }
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(m6e);
        }
        return t == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? t : Unit.INSTANCE;
    }

    public final void m() {
        if (this.w != 0 || this.Z > 1) {
            Object[] objArr = this.y;
            while (this.Z > 0 && m5a.c(objArr, (r() + ((long) (this.Y + this.Z))) - 1) == m5a.c) {
                this.Z--;
                m5a.d(objArr, r() + ((long) (this.Y + this.Z)), (Object) null);
            }
        }
    }

    public final void o() {
        k3[] k3VarArr;
        m5a.d(this.y, r(), (Object) null);
        this.Y--;
        long r = r() + 1;
        if (this.z < r) {
            this.z = r;
        }
        if (this.X < r) {
            if (!(this.b == 0 || (k3VarArr = this.a) == null)) {
                for (k3 k3Var : k3VarArr) {
                    if (k3Var != null) {
                        o6e o6e = (o6e) k3Var;
                        long j = o6e.a;
                        if (j >= 0 && j < r) {
                            o6e.a = r;
                        }
                    }
                }
            }
            this.X = r;
        }
    }

    public final void p(Object obj) {
        int i = this.Y + this.Z;
        Object[] objArr = this.y;
        if (objArr == null) {
            objArr = s((Object[]) null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = s(objArr, i, objArr.length * 2);
        }
        m5a.d(objArr, r() + ((long) i), obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r4 = (defpackage.o6e) r4;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.coroutines.Continuation[], code=java.lang.Object[], for r11v0, types: [kotlin.coroutines.Continuation[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.coroutines.Continuation[] q(java.lang.Object[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.b
            if (r1 == 0) goto L_0x003e
            k3[] r1 = r10.a
            if (r1 == 0) goto L_0x003e
            int r2 = r1.length
            r3 = 0
        L_0x000b:
            if (r3 >= r2) goto L_0x003e
            r4 = r1[r3]
            if (r4 == 0) goto L_0x003b
            o6e r4 = (defpackage.o6e) r4
            lw1 r5 = r4.b
            if (r5 != 0) goto L_0x0018
            goto L_0x003b
        L_0x0018:
            long r6 = r10.u(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x003b
            int r6 = r11.length
            if (r0 < r6) goto L_0x0030
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
        L_0x0030:
            r6 = r11
            kotlin.coroutines.Continuation[] r6 = (kotlin.coroutines.Continuation[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.b = r0
            r0 = r7
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x003e:
            kotlin.coroutines.Continuation[] r11 = (kotlin.coroutines.Continuation[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n6e.q(kotlin.coroutines.Continuation[]):kotlin.coroutines.Continuation[]");
    }

    public final long r() {
        return Math.min(this.X, this.z);
    }

    public final Object[] s(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.y = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long r = r();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + r;
                m5a.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean t(Object obj) {
        int i = this.b;
        int i2 = this.v;
        if (i == 0) {
            if (i2 != 0) {
                p(obj);
                int i3 = this.Y + 1;
                this.Y = i3;
                if (i3 > i2) {
                    o();
                }
                this.X = r() + ((long) this.Y);
            }
            return true;
        }
        int i4 = this.Y;
        int i5 = this.w;
        if (i4 >= i5 && this.X <= this.z) {
            int ordinal = this.x.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        p(obj);
        int i6 = this.Y + 1;
        this.Y = i6;
        if (i6 > i5) {
            o();
        }
        long r = r() + ((long) this.Y);
        long j = this.z;
        if (((int) (r - j)) > i2) {
            w(1 + j, this.X, r() + ((long) this.Y), r() + ((long) this.Y) + ((long) this.Z));
        }
        return true;
    }

    public final long u(o6e o6e) {
        long j = o6e.a;
        if (j < r() + ((long) this.Y)) {
            return j;
        }
        if (this.w <= 0 && j <= r() && this.Z != 0) {
            return j;
        }
        return -1;
    }

    public final Object v(o6e o6e) {
        Object obj;
        Continuation[] continuationArr = ct.a;
        synchronized (this) {
            try {
                long u = u(o6e);
                if (u < 0) {
                    obj = m5a.c;
                } else {
                    long j = o6e.a;
                    Object c = m5a.c(this.y, u);
                    if (c instanceof l6e) {
                        c = ((l6e) c).c;
                    }
                    o6e.a = u + 1;
                    Object obj2 = c;
                    continuationArr = x(j);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    public final void w(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long r = r(); r < min; r++) {
            m5a.d(this.y, r, (Object) null);
        }
        this.z = j;
        this.X = j2;
        this.Y = (int) (j3 - min);
        this.Z = (int) (j4 - j3);
    }

    public final Continuation[] x(long j) {
        long j2;
        long j3;
        Continuation[] continuationArr;
        long j4;
        k3[] k3VarArr;
        int i = (j > this.X ? 1 : (j == this.X ? 0 : -1));
        Continuation[] continuationArr2 = ct.a;
        if (i > 0) {
            return continuationArr2;
        }
        long r = r();
        long j5 = ((long) this.Y) + r;
        int i2 = this.w;
        if (i2 == 0 && this.Z > 0) {
            j5++;
        }
        if (!(this.b == 0 || (k3VarArr = this.a) == null)) {
            for (k3 k3Var : k3VarArr) {
                if (k3Var != null) {
                    long j6 = ((o6e) k3Var).a;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.X) {
            return continuationArr2;
        }
        long r2 = r() + ((long) this.Y);
        int min = this.b > 0 ? Math.min(this.Z, i2 - ((int) (r2 - j5))) : this.Z;
        long j7 = ((long) this.Z) + r2;
        bpa bpa = m5a.c;
        if (min > 0) {
            Continuation[] continuationArr3 = new Continuation[min];
            Object[] objArr = this.y;
            long j8 = r2;
            int i3 = 0;
            while (true) {
                if (r2 >= j7) {
                    j3 = j5;
                    j2 = j7;
                    break;
                }
                j3 = j5;
                Object c = m5a.c(objArr, r2);
                if (c != bpa) {
                    l6e l6e = (l6e) c;
                    int i4 = i3 + 1;
                    j2 = j7;
                    continuationArr3[i3] = l6e.o;
                    m5a.d(objArr, r2, bpa);
                    m5a.d(objArr, j8, l6e.c);
                    j4 = 1;
                    j8++;
                    if (i4 >= min) {
                        break;
                    }
                    i3 = i4;
                } else {
                    j2 = j7;
                    j4 = 1;
                }
                r2 += j4;
                j5 = j3;
                j7 = j2;
            }
            continuationArr = continuationArr3;
            r2 = j8;
        } else {
            j3 = j5;
            j2 = j7;
            continuationArr = continuationArr2;
        }
        int i5 = (int) (r2 - r);
        long j9 = this.b == 0 ? r2 : j3;
        long max = Math.max(this.z, r2 - ((long) Math.min(this.v, i5)));
        if (i2 == 0 && max < j2 && Intrinsics.areEqual(m5a.c(this.y, max), (Object) bpa)) {
            r2++;
            max++;
        }
        w(max, j9, r2, j2);
        m();
        return (continuationArr.length == 0) ^ true ? q(continuationArr) : continuationArr;
    }
}
