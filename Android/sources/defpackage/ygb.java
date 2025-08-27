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

/* renamed from: ygb  reason: default package */
public final class ygb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ OneMeButton b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ygb(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.b = oneMeButton;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ygb ygb = new ygb(this.b, continuation);
        ygb.a = obj;
        return ygb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ygb) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int size = ((Set) this.a).size();
        Integer boxInt = Boxing.boxInt(size);
        OneMeButton oneMeButton = this.b;
        boolean z = true;
        oneMeButton.c(boxInt, true);
        if (size <= 0) {
            z = false;
        }
        oneMeButton.setEnabled(z);
        return Unit.INSTANCE;
    }
}
