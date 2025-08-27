package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* renamed from: m75  reason: default package */
public final class m75 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ EnterPinCodeScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m75(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.b = enterPinCodeScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        m75 m75 = new m75(continuation, this.b);
        m75.a = obj;
        return m75;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m75) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Unit unit = (Unit) this.a;
        KProperty[] kPropertyArr = BottomSheetWidget.v0;
        ForgotPinCodeDialog forgotPinCodeDialog = new ForgotPinCodeDialog();
        EnterPinCodeScreen enterPinCodeScreen = this.b;
        forgotPinCodeDialog.setTargetController(enterPinCodeScreen);
        zx3 zx3 = enterPinCodeScreen;
        while (zx3.getParentController() != null) {
            zx3 = zx3.getParentController();
        }
        e9d e9d = null;
        l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
        if (l9d != null) {
            e9d = l9d.K();
        }
        e9d e9d2 = e9d;
        forgotPinCodeDialog.p0(enterPinCodeScreen);
        if (e9d2 != null) {
            i9d i9d = new i9d(forgotPinCodeDialog, (String) null, (ey3) null, (ey3) null, false, -1);
            a81.t(false, i9d, true, "forgot-pin");
            e9d2.G(i9d);
        }
        return Unit.INSTANCE;
    }
}
