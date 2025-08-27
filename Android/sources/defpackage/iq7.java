package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: iq7  reason: default package */
public final class iq7 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ RecyclerView b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iq7(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                iq7 iq7 = new iq7(3, continuation, 0);
                iq7.b = recyclerView;
                return iq7.invokeSuspend(Unit.INSTANCE);
            case 1:
                iq7 iq72 = new iq7(3, continuation, 1);
                iq72.b = recyclerView;
                return iq72.invokeSuspend(Unit.INSTANCE);
            default:
                iq7 iq73 = new iq7(3, continuation, 2);
                iq73.b = recyclerView;
                return iq73.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                RecyclerView recyclerView = this.b;
                recyclerView.setBackgroundColor(fu4.k.f(recyclerView).c().j);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                RecyclerView recyclerView2 = this.b;
                recyclerView2.setBackgroundColor(fu4.k.f(recyclerView2).c().k);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                RecyclerView recyclerView3 = this.b;
                js9 js9 = fu4.k;
                recyclerView3.setBackgroundColor(js9.f(recyclerView3).c().j);
                fu4.e(js9.e(recyclerView3.getContext()), recyclerView3);
                return Unit.INSTANCE;
        }
    }
}
