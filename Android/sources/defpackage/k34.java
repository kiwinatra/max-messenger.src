package defpackage;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.channels.CreateChannelViewModel;

/* renamed from: k34  reason: default package */
public final class k34 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CreateChannelViewModel a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k34(CreateChannelViewModel createChannelViewModel, Continuation continuation) {
        super(2, continuation);
        this.a = createChannelViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new k34(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k34) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CreateChannelViewModel createChannelViewModel = this.a;
        ln5 ln5 = createChannelViewModel.d;
        po5 po5 = (po5) ln5;
        o85 o85 = new o85(Uri.fromFile(po5.r((String) createChannelViewModel.D.getValue(createChannelViewModel, CreateChannelViewModel.G[7]))));
        xme xme = createChannelViewModel.u;
        xme.getClass();
        xme.m((Object) null, o85);
        return Unit.INSTANCE;
    }
}
