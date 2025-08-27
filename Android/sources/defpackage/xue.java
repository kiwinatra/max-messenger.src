package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: xue  reason: default package */
public final class xue extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ zue b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ Long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xue(zue zue, Long l, Long l2, Continuation continuation) {
        super(2, continuation);
        this.b = zue;
        this.c = l;
        this.o = l2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xue(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xue) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = zue.C0;
            ai5 ai5 = (ai5) this.b.x.getValue();
            Long l = this.c;
            long longValue = l.longValue();
            Long l2 = this.o;
            long longValue2 = l2.longValue();
            ai5.getClass();
            z68.c("ai5", "setFavoriteStickerSetMoved: stickerSetId=%d, targetPositionStickerId=%d", l, l2);
            long j = longValue2;
            na3 na3 = new na3(4, ai5.b(), new ac2(2, longValue, longValue2));
            mi5 mi5 = (mi5) ai5.w.getValue();
            mi5.getClass();
            bb3 g = new na3(0, na3, new na3(4, new qbe(new ji5(mi5, longValue, j), 0).i(new ch2(12, lu.class)), new ci5(7)).l(mi5.d)).h(new lw4(25)).g(new yh5(longValue, j));
            this.a = 1;
            if (bs0.e(g, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
