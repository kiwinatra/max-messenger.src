package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: k5e  reason: default package */
public final class k5e extends SuspendLambda implements Function2 {
    public final /* synthetic */ View a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k5e(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.a = viewGroup;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new k5e((ViewGroup) this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((k5e) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h88.f(this.a, ShareDataPickerScreen.B0, (Function1) null);
        return Unit.INSTANCE;
    }
}
