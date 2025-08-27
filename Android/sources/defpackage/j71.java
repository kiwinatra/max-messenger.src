package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* renamed from: j71  reason: default package */
public final class j71 extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ CallHistoryPageScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j71(CallHistoryPageScreen callHistoryPageScreen, Continuation continuation) {
        super(2, continuation);
        this.b = callHistoryPageScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        j71 j71 = new j71(this.b, continuation);
        j71.a = ((Boolean) obj).booleanValue();
        return j71;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((j71) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        s9a s9a = CallHistoryPageScreen.X;
        xme xme = this.b.e0().X;
        do {
            value = xme.getValue();
            ((Boolean) value).getClass();
        } while (!xme.b(value, Boolean.valueOf(z)));
        return Unit.INSTANCE;
    }
}
