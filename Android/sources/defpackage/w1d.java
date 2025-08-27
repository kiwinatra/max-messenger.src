package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: w1d  reason: default package */
public final class w1d implements zu7 {
    public final /* synthetic */ hu7 a;
    public final /* synthetic */ Ref.ObjectRef b;
    public final /* synthetic */ d14 c;
    public final /* synthetic */ hu7 o;
    public final /* synthetic */ kw1 v;
    public final /* synthetic */ xz9 w;
    public final /* synthetic */ Function2 x;

    public w1d(hu7 hu7, Ref.ObjectRef objectRef, d14 d14, hu7 hu72, lw1 lw1, a0a a0a, Function2 function2) {
        this.a = hu7;
        this.b = objectRef;
        this.c = d14;
        this.o = hu72;
        this.v = lw1;
        this.w = a0a;
        this.x = function2;
    }

    public final void d(jv7 jv7, hu7 hu7) {
        hu7 hu72 = this.a;
        Ref.ObjectRef objectRef = this.b;
        if (hu7 == hu72) {
            objectRef.element = ev0.v(this.c, (CoroutineContext) null, (f14) null, new v1d(this.w, this.x, (Continuation) null), 3);
            return;
        }
        if (hu7 == this.o) {
            pm7 pm7 = (pm7) objectRef.element;
            if (pm7 != null) {
                pm7.b((CancellationException) null);
            }
            objectRef.element = null;
        }
        if (hu7 == hu7.ON_DESTROY) {
            Result.Companion companion = Result.Companion;
            this.v.resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
        }
    }
}
