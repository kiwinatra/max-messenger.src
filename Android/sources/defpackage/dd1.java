package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;

/* renamed from: dd1  reason: default package */
public final class dd1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallMoreBottomSheet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dd1(Continuation continuation, CallMoreBottomSheet callMoreBottomSheet) {
        super(2, continuation);
        this.b = callMoreBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dd1 dd1 = new dd1(continuation, this.b);
        dd1.a = obj;
        return dd1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dd1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CharSequence charSequence = (CharSequence) this.a;
        KProperty[] kPropertyArr = CallMoreBottomSheet.v0;
        nxc nxc = (nxc) this.b.Y.getValue();
        nxc.b = charSequence;
        for (mxc mxc : nxc.a) {
            ((r1e) ((ad1) mxc).a).setDescription(charSequence);
        }
        return Unit.INSTANCE;
    }
}
