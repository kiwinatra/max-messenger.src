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
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: ogb  reason: default package */
public final class ogb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickSubscribersScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ogb(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.b = pickSubscribersScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ogb ogb = new ogb(this.b, continuation);
        ogb.a = obj;
        return ogb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ogb) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long[] longArray = CollectionsKt.toLongArray((Set) this.a);
        KProperty[] kPropertyArr = PickSubscribersScreen.w0;
        PickSubscribersScreen pickSubscribersScreen = this.b;
        pickSubscribersScreen.getClass();
        KProperty kProperty = PickSubscribersScreen.w0[0];
        pickSubscribersScreen.y.b(pickSubscribersScreen, longArray);
        return Unit.INSTANCE;
    }
}
