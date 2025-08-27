package defpackage;

import android.widget.EditText;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: eh7  reason: default package */
public final class eh7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ InputPhoneScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eh7(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.b = inputPhoneScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        eh7 eh7 = new eh7(continuation, this.b);
        eh7.a = obj;
        return eh7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eh7) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Unit unit = (Unit) this.a;
        KProperty[] kPropertyArr = InputPhoneScreen.D0;
        zwa f0 = this.b.f0();
        if (f0.hasWindowFocus()) {
            EditText editText = f0.z;
            editText.requestFocus();
            Boxing.boxBoolean(editText.post(new sx8(15, f0, editText)));
        } else {
            f0.setOnWindowFocusChanged(new hw2(3, f0));
        }
        return Unit.INSTANCE;
    }
}
