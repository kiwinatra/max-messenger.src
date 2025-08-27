package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: usc  reason: default package */
public final class usc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ vsc b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public usc(vsc vsc, Continuation continuation) {
        super(2, continuation);
        this.b = vsc;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        usc usc = new usc(this.b, continuation);
        usc.a = obj;
        return usc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((usc) create((a32) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ReactionsViewModel j = this.b.j();
        long j2 = ((a32) this.a).b.l0;
        hdd hdd = j.h;
        if (hdd != null) {
            hdd.c(Long.valueOf(j2), "lastReactedMessageId");
        }
        return Unit.INSTANCE;
    }
}
