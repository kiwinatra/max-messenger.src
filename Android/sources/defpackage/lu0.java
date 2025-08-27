package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;

/* renamed from: lu0  reason: default package */
public final class lu0 implements neg {
    public Object a = tu0.p;
    public lw1 b;
    public final /* synthetic */ ru0 c;

    public lu0(ru0 ru0) {
        this.c = ru0;
    }

    public final void a(iod iod, int i) {
        lw1 lw1 = this.b;
        if (lw1 != null) {
            lw1.a(iod, i);
        }
    }

    public final Object b(Continuation continuation) {
        f22 f22;
        Boolean boxBoolean;
        f22 f222;
        boolean z = false;
        Object obj = this.a;
        if (obj == tu0.p || obj == tu0.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ru0.z;
            ru0 ru0 = this.c;
            f22 f223 = (f22) atomicReferenceFieldUpdater.get(ru0);
            while (!ru0.x()) {
                long andIncrement = ru0.v.getAndIncrement(ru0);
                long j = (long) tu0.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (f223.c != j2) {
                    f22 m = ru0.m(j2, f223);
                    if (m == null) {
                        continue;
                    } else {
                        f22 = m;
                    }
                } else {
                    f22 = f223;
                }
                Object H = ru0.H(f22, i, andIncrement, (Object) null);
                bpa bpa = tu0.m;
                if (H != bpa) {
                    bpa bpa2 = tu0.o;
                    if (H == bpa2) {
                        if (andIncrement < ru0.q()) {
                            f22.a();
                        }
                        f223 = f22;
                    } else if (H == tu0.n) {
                        ru0 ru02 = this.c;
                        lw1 w = cvg.w(IntrinsicsKt.intercepted(continuation));
                        try {
                            this.b = w;
                            f22 f224 = f22;
                            int i2 = i;
                            Object H2 = ru02.H(f22, i, andIncrement, this);
                            if (H2 == bpa) {
                                a(f224, i2);
                            } else {
                                ju0 ju0 = null;
                                Function1 function1 = ru02.b;
                                if (H2 == bpa2) {
                                    if (andIncrement < ru02.q()) {
                                        f224.a();
                                    }
                                    f22 f225 = (f22) ru0.z.get(ru02);
                                    while (true) {
                                        if (ru02.x()) {
                                            lw1 lw1 = this.b;
                                            this.b = null;
                                            this.a = tu0.l;
                                            Throwable n = ru0.n();
                                            if (n == null) {
                                                Result.Companion companion = Result.Companion;
                                                lw1.resumeWith(Result.m23constructorimpl(Boolean.FALSE));
                                            } else {
                                                Result.Companion companion2 = Result.Companion;
                                                lw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(n)));
                                            }
                                        } else {
                                            long andIncrement2 = ru0.v.getAndIncrement(ru02);
                                            long j3 = (long) tu0.b;
                                            long j4 = andIncrement2 / j3;
                                            int i3 = (int) (andIncrement2 % j3);
                                            if (f225.c != j4) {
                                                f22 m2 = ru02.m(j4, f225);
                                                if (m2 != null) {
                                                    f222 = m2;
                                                }
                                            } else {
                                                f222 = f225;
                                            }
                                            Object H3 = ru02.H(f222, i3, andIncrement2, this);
                                            if (H3 == tu0.m) {
                                                a(f222, i3);
                                                break;
                                            } else if (H3 == tu0.o) {
                                                if (andIncrement2 < ru02.q()) {
                                                    f222.a();
                                                }
                                                f225 = f222;
                                            } else if (H3 != tu0.n) {
                                                f222.a();
                                                this.a = H3;
                                                this.b = null;
                                                boxBoolean = Boxing.boxBoolean(true);
                                                if (function1 != null) {
                                                    ju0 = new ju0(0, function1, H3);
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                        }
                                    }
                                } else {
                                    f224.a();
                                    this.a = H2;
                                    this.b = null;
                                    boxBoolean = Boxing.boxBoolean(true);
                                    if (function1 != null) {
                                        ju0 = new ju0(0, function1, H2);
                                    }
                                }
                                w.l(boxBoolean, ju0);
                            }
                            Object t = w.t();
                            if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                DebugProbesKt.probeCoroutineSuspended(continuation);
                            }
                            return t;
                        } catch (Throwable th) {
                            w.B();
                            throw th;
                        }
                    } else {
                        f22.a();
                        this.a = H;
                    }
                } else {
                    throw new IllegalStateException("unreachable".toString());
                }
            }
            this.a = tu0.l;
            Throwable n2 = ru0.n();
            if (n2 != null) {
                int i4 = rie.a;
                throw n2;
            }
            return Boxing.boxBoolean(z);
        }
        z = true;
        return Boxing.boxBoolean(z);
    }

    public final Object c() {
        Object obj = this.a;
        bpa bpa = tu0.p;
        if (obj != bpa) {
            this.a = bpa;
            if (obj != tu0.l) {
                return obj;
            }
            Throwable n = this.c.n();
            if (n == null) {
                n = new NoSuchElementException("Channel was closed");
            }
            int i = rie.a;
            throw n;
        }
        throw new IllegalStateException("`hasNext()` has not been invoked".toString());
    }
}
