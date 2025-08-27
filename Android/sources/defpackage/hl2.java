package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: hl2  reason: default package */
public final class hl2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ EndlessRecyclerView2 b;
    public final /* synthetic */ nwe c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl2(nwe nwe, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.c = nwe;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                hl2 hl2 = new hl2(this.c, continuation, 0);
                hl2.b = endlessRecyclerView2;
                return hl2.invokeSuspend(Unit.INSTANCE);
            default:
                hl2 hl22 = new hl2(this.c, continuation, 1);
                hl22.b = endlessRecyclerView2;
                return hl22.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = this.b;
                this.c.j();
                endlessRecyclerView2.a0();
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                EndlessRecyclerView2 endlessRecyclerView22 = this.b;
                this.c.j();
                endlessRecyclerView22.a0();
                return Unit.INSTANCE;
        }
    }
}
