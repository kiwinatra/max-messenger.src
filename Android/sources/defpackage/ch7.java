package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KProperty;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: ch7  reason: default package */
public final class ch7 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ k2b b;
    public final /* synthetic */ InputPhoneScreen c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch7(InputPhoneScreen inputPhoneScreen, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.c = inputPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                ch7 ch7 = new ch7(this.c, (Continuation) obj3, 0);
                ch7.b = (k2b) obj2;
                return ch7.invokeSuspend(Unit.INSTANCE);
            default:
                View view = (View) obj;
                ch7 ch72 = new ch7(this.c, (Continuation) obj3, 1);
                ch72.b = (k2b) obj2;
                return ch72.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        InputPhoneScreen inputPhoneScreen = this.c;
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                k2b k2b = this.b;
                KProperty[] kPropertyArr = InputPhoneScreen.D0;
                inputPhoneScreen.f0().onThemeChanged(k2b);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                k2b k2b2 = this.b;
                KProperty[] kPropertyArr2 = InputPhoneScreen.D0;
                inputPhoneScreen.getClass();
                Drawable background = ((View) inputPhoneScreen.z.getValue(inputPhoneScreen, InputPhoneScreen.D0[2])).getBackground();
                tr9 tr9 = background instanceof tr9 ? (tr9) background : null;
                if (tr9 != null) {
                    tr9.onThemeChanged(k2b2);
                }
                return Unit.INSTANCE;
        }
    }
}
