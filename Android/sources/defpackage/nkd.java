package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* renamed from: nkd  reason: default package */
public final class nkd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SearchMessageBottomWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nkd(SearchMessageBottomWidget searchMessageBottomWidget, Continuation continuation) {
        super(2, continuation);
        this.b = searchMessageBottomWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nkd nkd = new nkd(this.b, continuation);
        nkd.a = obj;
        return nkd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nkd) create((pa4) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zkd.b.Y0((pa4) this.a);
        return Unit.INSTANCE;
    }
}
