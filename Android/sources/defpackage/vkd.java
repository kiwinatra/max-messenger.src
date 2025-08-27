package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vkd  reason: default package */
public final class vkd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ wkd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vkd(wkd wkd, Continuation continuation) {
        super(2, continuation);
        this.b = wkd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vkd vkd = new vkd(this.b, continuation);
        vkd.a = obj;
        return vkd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vkd) create((qy6) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long j = ((qy6) this.a).b;
        wkd wkd = this.b;
        wkd.getClass();
        zkd zkd = zkd.b;
        boolean z = wkd.c == q72.LOCAL_ID;
        zkd.getClass();
        String str = z ? "local" : "server";
        xag.h(wkd.y, new pa4(":chats?id=" + wkd.b + "&type=" + str + "&message_id=" + j));
        return Unit.INSTANCE;
    }
}
