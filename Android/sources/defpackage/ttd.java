package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.devmenu.server.ServerHostBottomSheet;

/* renamed from: ttd  reason: default package */
public final class ttd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ServerHostBottomSheet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ttd(Continuation continuation, ServerHostBottomSheet serverHostBottomSheet) {
        super(2, continuation);
        this.b = serverHostBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ttd ttd = new ttd(continuation, this.b);
        ttd.a = obj;
        return ttd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ttd) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.y0.G((List) this.a);
        return Unit.INSTANCE;
    }
}
