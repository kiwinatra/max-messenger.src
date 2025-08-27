package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: dh7  reason: default package */
public final class dh7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ InputPhoneScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dh7(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.b = inputPhoneScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dh7 dh7 = new dh7(continuation, this.b);
        dh7.a = obj;
        return dh7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dh7) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((Boolean) this.a).booleanValue();
        KProperty[] kPropertyArr = InputPhoneScreen.D0;
        this.b.e0().setEnabled(booleanValue);
        return Unit.INSTANCE;
    }
}
