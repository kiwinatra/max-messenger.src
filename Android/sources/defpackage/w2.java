package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chats.picker.AbstractPickerScreen;

/* renamed from: w2  reason: default package */
public final class w2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AbstractPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w2(Continuation continuation, AbstractPickerScreen abstractPickerScreen) {
        super(2, continuation);
        this.b = abstractPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        w2 w2Var = new w2(continuation, this.b);
        w2Var.a = obj;
        return w2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual((Object) (xhb) this.a, (Object) xhb.a)) {
            KProperty[] kPropertyArr = AbstractPickerScreen.x;
            this.b.h0().getEditText().setText((CharSequence) null);
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
