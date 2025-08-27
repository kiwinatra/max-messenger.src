package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l1f  reason: default package */
public final class l1f extends SuspendLambda implements Function2 {
    public /* synthetic */ int a;
    public final /* synthetic */ View b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l1f(View view, Continuation continuation) {
        super(2, continuation);
        this.b = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        l1f l1f = new l1f(this.b, continuation);
        l1f.a = ((Number) obj).intValue();
        return l1f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l1f) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = this.a;
        View view = this.b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            view.setLayoutParams(marginLayoutParams);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
