package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yl3  reason: default package */
public final class yl3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ cm3 a;
    public final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yl3(cm3 cm3, String str, Continuation continuation) {
        super(2, continuation);
        this.a = cm3;
        this.b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yl3(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yl3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        cm3 cm3 = this.a;
        cm3.r.set(((jna) ((rl) cm3.m.getValue())).P((String) null, (String) null, (String) null, (a20) null, (String) null, this.b, 0, he0.USER_AVATAR));
        return Unit.INSTANCE;
    }
}
