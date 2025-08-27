package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: kf3  reason: default package */
public final class kf3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kf3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.b = confirmPhoneScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        kf3 kf3 = new kf3(this.b, continuation);
        kf3.a = obj;
        return kf3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kf3) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = (String) this.a;
        KProperty[] kPropertyArr = ConfirmPhoneScreen.A0;
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        confirmPhoneScreen.getClass();
        pm7 pm7 = (pm7) confirmPhoneScreen.z0.getValue(confirmPhoneScreen, ConfirmPhoneScreen.A0[7]);
        if ((pm7 != null && pm7.isActive()) || confirmPhoneScreen.y0 != null) {
            return Unit.INSTANCE;
        }
        confirmPhoneScreen.i0(str);
        return Unit.INSTANCE;
    }
}
