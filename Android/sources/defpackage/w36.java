package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: w36  reason: default package */
public final class w36 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ TextView b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w36(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TextView textView = (TextView) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                w36 w36 = new w36(3, continuation, 0);
                w36.b = textView;
                return w36.invokeSuspend(Unit.INSTANCE);
            case 1:
                w36 w362 = new w36(3, continuation, 1);
                w362.b = textView;
                return w362.invokeSuspend(Unit.INSTANCE);
            default:
                w36 w363 = new w36(3, continuation, 2);
                w363.b = textView;
                return w363.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                TextView textView = this.b;
                js9 js9 = fu4.k;
                textView.setTextColor(js9.f(textView).getText().e);
                textView.setBackground(new RippleDrawable(ColorStateList.valueOf(js9.e(textView.getContext()).f().b().a.f), (Drawable) null, new ColorDrawable(-1)));
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                TextView textView2 = this.b;
                textView2.setTextColor(fu4.k.f(textView2).getText().e);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                TextView textView3 = this.b;
                textView3.setTextColor(fu4.k.f(textView3).getText().f);
                return Unit.INSTANCE;
        }
    }
}
