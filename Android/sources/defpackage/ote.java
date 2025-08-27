package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ote  reason: default package */
public final class ote extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ute b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ote(ute ute, Continuation continuation) {
        super(2, continuation);
        this.b = ute;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ote ote = new ote(this.b, continuation);
        ote.a = obj;
        return ote;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ote) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ute ute = this.b;
        List list = (List) ute.X.updateAndGet(new r76(2, (List) this.a, ute));
        String str = ((pte) ute.Y.get()).a;
        if (str == null || str.length() == 0) {
            kld kld = new kld(jld.b, list);
            xme xme = ute.w;
            xme.getClass();
            xme.m((Object) null, kld);
        }
        return Unit.INSTANCE;
    }
}
