package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: s0f  reason: default package */
public final class s0f extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ l72 b;
    public final /* synthetic */ v0f c;
    public final /* synthetic */ Context o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s0f(l72 l72, v0f v0f, Context context, Continuation continuation) {
        super(2, continuation);
        this.b = l72;
        this.c = v0f;
        this.o = context;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new s0f(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s0f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [l15, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        l72 l72 = this.b;
        v0f v0f = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (l72 == null) {
                return Unit.INSTANCE;
            }
            on2 on2 = new on2(v0f.b, 28);
            this.a = 1;
            obj2 = bs0.z(on2, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rl rlVar = (rl) v0f.z.getValue();
        sv0 sv0 = (sv0) v0f.X.getValue();
        r62 r62 = (r62) v0f.Z.getValue();
        mq0 mq0 = (mq0) v0f.v0.getValue();
        lfd a2 = ((kbf) ((jbf) v0f.w0.getValue())).a();
        Lazy lazy = v0f.x;
        Lazy lazy2 = v0f.A0;
        Lazy lazy3 = v0f.x0;
        Lazy lazy4 = v0f.y0;
        Lazy lazy5 = lazy4;
        Lazy lazy6 = v0f.o;
        Lazy lazy7 = lazy3;
        r1f r1f = new r1f(rlVar, sv0, r62, mq0, (a32) obj2, a2, (tld) lazy.getValue(), (yva) lazy2.getValue(), (jtb) lazy3.getValue(), (ptb) lazy4.getValue(), (hxd) v0f.z0.getValue(), lazy6, v0f.c, (w1f) null);
        Lazy lazy8 = v0f.y;
        l72 l722 = this.b;
        l72 l723 = l72;
        b33 b33 = new b33(l723, (gaf) lazy8.getValue(), r1f, (o1f) new su3(l722, (km3) v0f.Y.getValue(), (gaf) lazy8.getValue(), (tld) lazy.getValue(), (yva) lazy2.getValue(), (jtb) lazy7.getValue(), (ptb) lazy5.getValue()));
        Context context = this.o;
        Lazy lazy9 = rjd.r;
        ? obj3 = new Object();
        obj3.a = context;
        obj3.b = l723;
        obj3.c = lazy9;
        v0f.P0 = l723;
        v0f.O0 = b33;
        v0f.Q0 = obj3;
        return Unit.INSTANCE;
    }
}
