package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: uig  reason: default package */
public final class uig extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hjg b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uig(hjg hjg, Continuation continuation) {
        super(2, continuation);
        this.b = hjg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new uig(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uig) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            hjg hjg = this.b;
            xme xme = hjg.C0;
            Boolean bool = Boolean.FALSE;
            xme.getClass();
            xme.m((Object) null, bool);
            xme xme2 = hjg.D0;
            xme2.getClass();
            xme2.m((Object) null, bool);
            hjg.y0 = null;
            for (xo7 d : (List) hjg.A0.c) {
                d.d((tfg) null);
            }
            Object I = ev0.I(((osa) ((gaf) hjg.X.getValue())).b(), new wig(hjg, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
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
