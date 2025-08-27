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

/* renamed from: pfb  reason: default package */
public final class pfb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ OneMeButton b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pfb(OneMeButton oneMeButton, Continuation continuation) {
        super(2, continuation);
        this.b = oneMeButton;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        pfb pfb = new pfb(this.b, continuation);
        pfb.a = obj;
        return pfb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pfb) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int size = ((Set) this.a).size();
        OneMeButton oneMeButton = this.b;
        if (size == 0) {
            oneMeButton.setText(g1b.v);
            oneMeButton.c((Integer) null, true);
        } else {
            oneMeButton.setText(g1b.u);
            oneMeButton.c(Boxing.boxInt(size), true);
        }
        return Unit.INSTANCE;
    }
}
