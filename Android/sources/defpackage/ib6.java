package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: ib6  reason: default package */
public final class ib6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ForwardPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ib6(Continuation continuation, ForwardPickerScreen forwardPickerScreen) {
        super(2, continuation);
        this.b = forwardPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ib6 ib6 = new ib6(continuation, this.b);
        ib6.a = obj;
        return ib6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ib6) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((Boolean) this.a).booleanValue();
        ForwardPickerScreen forwardPickerScreen = this.b;
        if (booleanValue) {
            KProperty[] kPropertyArr = ForwardPickerScreen.I0;
            ya6 ya6 = (ya6) forwardPickerScreen.l0().c;
            if (!((a33) ((x23) ya6.k.getValue())).g.getBoolean("app.onboarding.author_visibility", false)) {
                ya6.o.d(ab6.a);
                ((a33) ((x23) ya6.k.getValue())).i("app.onboarding.author_visibility", true);
            }
            occ p0 = forwardPickerScreen.p0();
            ya6 ya62 = (ya6) forwardPickerScreen.l0().c;
            p0.setRightIconDrawable(((Boolean) ya62.r.getValue()).booleanValue() ? (Drawable) ya62.t.getValue() : (Drawable) ya62.u.getValue());
            forwardPickerScreen.p0().setRightIconClickListener(new wld(4, forwardPickerScreen));
        } else {
            KProperty[] kPropertyArr2 = ForwardPickerScreen.I0;
            forwardPickerScreen.p0().setRightIconDrawable((Drawable) null);
            forwardPickerScreen.p0().setRightIconClickListener((View.OnClickListener) null);
        }
        return Unit.INSTANCE;
    }
}
