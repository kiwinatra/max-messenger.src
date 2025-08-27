package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chatscreen.ChatScreen;

/* renamed from: dn2  reason: default package */
public final class dn2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dn2 dn2 = new dn2(continuation, this.b);
        dn2.a = obj;
        return dn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dn2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        wg9 wg9 = (wg9) this.a;
        boolean z = true;
        if (!(wg9.b.getAction() == 3 || wg9.b.getAction() == 1)) {
            z = false;
        }
        this.b.Y = z;
        return Unit.INSTANCE;
    }
}
