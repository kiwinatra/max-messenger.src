package defpackage;

import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ja  reason: default package */
public final class ja extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ OneMeButton b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ja(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.b = oneMeButton;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ja jaVar = new ja(this.b, continuation);
        jaVar.a = obj;
        return jaVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ja) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int size = ((Set) this.a).size();
        OneMeButton oneMeButton = this.b;
        if (size == 0) {
            oneMeButton.setVisibility(8);
        } else {
            oneMeButton.setVisibility(0);
            oneMeButton.c(Boxing.boxInt(size), true);
        }
        return Unit.INSTANCE;
    }
}
