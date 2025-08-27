package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: wwb  reason: default package */
public final class wwb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileChangeLinkScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wwb(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.b = profileChangeLinkScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wwb wwb = new wwb(continuation, this.b);
        wwb.a = obj;
        return wwb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wwb) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.w.G((List) this.a);
        return Unit.INSTANCE;
    }
}
