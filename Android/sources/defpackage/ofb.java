package defpackage;

import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.startconversation.chat.PickChatMembers;

/* renamed from: ofb  reason: default package */
public final class ofb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickChatMembers b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ofb(Continuation continuation, PickChatMembers pickChatMembers) {
        super(2, continuation);
        this.b = pickChatMembers;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ofb ofb = new ofb(continuation, this.b);
        ofb.a = obj;
        return ofb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ofb) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long[] longArray = CollectionsKt.toLongArray((Set) this.a);
        KProperty[] kPropertyArr = PickChatMembers.Z;
        PickChatMembers pickChatMembers = this.b;
        pickChatMembers.getClass();
        KProperty kProperty = PickChatMembers.Z[0];
        pickChatMembers.y.b(pickChatMembers, longArray);
        return Unit.INSTANCE;
    }
}
