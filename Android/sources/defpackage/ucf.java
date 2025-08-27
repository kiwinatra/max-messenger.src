package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ucf  reason: default package */
public final class ucf extends SuspendLambda implements Function2 {
    public final /* synthetic */ View a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucf(View view, Continuation continuation) {
        super(2, continuation);
        this.a = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ucf(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ucf) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        View view = this.a;
        if (view.isInEditMode()) {
            vi4 vi4 = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            j4b.k0(context);
        }
        return Unit.INSTANCE;
    }
}
