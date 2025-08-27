package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import one.me.sdk.arch.Widget;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* renamed from: ag3  reason: default package */
public final class ag3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ConfirmPinCodeScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ag3(Continuation continuation, ConfirmPinCodeScreen confirmPinCodeScreen) {
        super(2, continuation);
        this.b = confirmPinCodeScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ag3 ag3 = new ag3(continuation, this.b);
        ag3.a = obj;
        return ag3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ag3) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        e0b e0b = new e0b((Widget) this.b);
        e0b.i(StringsKt.capitalize((String) this.a));
        e0b.j();
        return Unit.INSTANCE;
    }
}
