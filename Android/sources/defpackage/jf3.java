package defpackage;

import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.login.inputname.InputNameScreen;

/* renamed from: jf3  reason: default package */
public final class jf3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jf3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.b = confirmPhoneScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jf3 jf3 = new jf3(this.b, continuation);
        jf3.a = obj;
        return jf3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jf3) create((v5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        boolean z = v5a instanceof df3;
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        if (z) {
            ((ecb) n88.a.getAccessor().g(ecb.class)).c();
            kr7.z(confirmPhoneScreen);
            f98 f98 = f98.b;
            f98.getClass();
            Unit unit = Unit.INSTANCE;
            f98.W0().b(":chat-list", (Bundle) null);
        } else if (v5a instanceof ef3) {
            aj7 aj7 = (aj7) confirmPhoneScreen.y.getValue();
            ef3 ef3 = (ef3) v5a;
            String str = ef3.b;
            KProperty kProperty = ConfirmPhoneScreen.A0[1];
            aj7.getClass();
            aj7.a(iq.n(new InputNameScreen(str, (String) confirmPhoneScreen.o.a(confirmPhoneScreen), ef3.c), (ey3) null, (ey3) null), "InputNameScreen");
        } else if (v5a instanceof pa4) {
            kr7.z(confirmPhoneScreen);
            f98.b.Y0((pa4) v5a);
        }
        return Unit.INSTANCE;
    }
}
