package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.startconversation.chat.PickChatMembers;

/* renamed from: qfb  reason: default package */
public final class qfb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickChatMembers b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qfb(Continuation continuation, PickChatMembers pickChatMembers) {
        super(2, continuation);
        this.b = pickChatMembers;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qfb qfb = new qfb(continuation, this.b);
        qfb.a = obj;
        return qfb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qfb) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((Boolean) this.a).booleanValue()) {
            KProperty[] kPropertyArr = PickChatMembers.Z;
            PickChatMembers pickChatMembers = this.b;
            ((edb) pickChatMembers.z.getValue()).e(new eng(pickChatMembers, 1));
        }
        return Unit.INSTANCE;
    }
}
