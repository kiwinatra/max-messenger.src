package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: lf3  reason: default package */
public final class lf3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lf3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.b = confirmPhoneScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        lf3 lf3 = new lf3(this.b, continuation);
        lf3.a = obj;
        return lf3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lf3) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = ConfirmPhoneScreen.A0;
        this.b.f0().L0(0, (String) this.a);
        return Unit.INSTANCE;
    }
}
