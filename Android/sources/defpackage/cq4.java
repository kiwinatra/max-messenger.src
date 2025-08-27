package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: cq4  reason: default package */
public abstract class cq4 {
    public static final boolean a(int i) {
        return i == 1 || i == 2;
    }

    public static final void b(bq4 bq4, Continuation continuation, boolean z) {
        Object e;
        Object h = bq4.h();
        Throwable d = bq4.d(h);
        if (d != null) {
            Result.Companion companion = Result.Companion;
            e = ResultKt.createFailure(d);
        } else {
            Result.Companion companion2 = Result.Companion;
            e = bq4.e(h);
        }
        Object r3 = Result.m23constructorimpl(e);
        if (z) {
            zp4 zp4 = (zp4) continuation;
            Continuation continuation2 = zp4.v;
            CoroutineContext context = continuation2.getContext();
            Object b = eif.b(context, zp4.x);
            ivf c = b != eif.a ? o04.c(continuation2, context, b) : null;
            try {
                zp4.v.resumeWith(r3);
                Unit unit = Unit.INSTANCE;
            } finally {
                if (c == null || c.l0()) {
                    eif.a(context, b);
                }
            }
        } else {
            continuation.resumeWith(r3);
        }
    }
}
