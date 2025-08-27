package defpackage;

import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* renamed from: ohb  reason: default package */
public final class ohb extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ whb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ohb(whb whb, Continuation continuation) {
        super(2, continuation);
        this.c = whb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ohb ohb = new ohb(this.c, continuation);
        ohb.b = obj;
        return ohb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ohb) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = (String) this.b;
            if (StringsKt.isBlank(str2)) {
                return TuplesKt.to(str2, CollectionsKt.emptyList());
            }
            this.b = str2;
            this.a = 1;
            shb shb = whb.E0;
            whb whb = this.c;
            whb.getClass();
            lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(this));
            lw1.u();
            whb.j().d();
            whb.j().h = new jk3(whb, str2, lw1);
            whb.j().f(str2);
            lw1.k(new hw2(5, whb));
            Object t = lw1.t();
            if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (t == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
            obj = t;
        } else if (i == 1) {
            str = (String) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return TuplesKt.to(str, obj);
    }
}
