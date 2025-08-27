package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gz2  reason: default package */
public final class gz2 extends dn7 {
    public final /* synthetic */ int v;
    public final lw1 w;

    public /* synthetic */ gz2(lw1 lw1, int i) {
        this.v = i;
        this.w = lw1;
    }

    public final boolean h() {
        switch (this.v) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void i(Throwable th) {
        lw1 lw1 = this.w;
        qn7 qn7 = null;
        switch (this.v) {
            case 0:
                qn7 qn72 = this.o;
                if (qn72 == null) {
                    qn72 = null;
                }
                Throwable s = lw1.s(qn72);
                if (lw1.y()) {
                    zp4 zp4 = (zp4) lw1.o;
                    zp4.getClass();
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zp4.y;
                        Object obj = atomicReferenceFieldUpdater.get(zp4);
                        bpa bpa = y7e.d;
                        if (Intrinsics.areEqual(obj, (Object) bpa)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(zp4, bpa, s)) {
                                if (atomicReferenceFieldUpdater.get(zp4) != bpa) {
                                }
                            }
                            return;
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(zp4, obj, (Object) null)) {
                                if (atomicReferenceFieldUpdater.get(zp4) != obj) {
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
                lw1.q(s);
                if (!lw1.y()) {
                    lw1.p();
                    return;
                }
                return;
            default:
                qn7 qn73 = this.o;
                if (qn73 != null) {
                    qn7 = qn73;
                }
                qn7.getClass();
                Object obj2 = qn7.a.get(qn7);
                if (obj2 instanceof jb3) {
                    Result.Companion companion = Result.Companion;
                    lw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(((jb3) obj2).a)));
                    return;
                }
                Result.Companion companion2 = Result.Companion;
                lw1.resumeWith(Result.m23constructorimpl(ld9.U(obj2)));
                return;
        }
    }
}
