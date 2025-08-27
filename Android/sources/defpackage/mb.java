package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: mb  reason: default package */
public final class mb extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ RecyclerView b;
    public final /* synthetic */ nwe c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb(nwe nwe, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.c = nwe;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                mb mbVar = new mb(this.c, continuation, 0);
                mbVar.b = recyclerView;
                return mbVar.invokeSuspend(Unit.INSTANCE);
            case 1:
                mb mbVar2 = new mb(this.c, continuation, 1);
                mbVar2.b = recyclerView;
                return mbVar2.invokeSuspend(Unit.INSTANCE);
            case 2:
                mb mbVar3 = new mb(this.c, continuation, 2);
                mbVar3.b = recyclerView;
                return mbVar3.invokeSuspend(Unit.INSTANCE);
            case 3:
                mb mbVar4 = new mb(this.c, continuation, 3);
                mbVar4.b = recyclerView;
                return mbVar4.invokeSuspend(Unit.INSTANCE);
            default:
                mb mbVar5 = new mb(this.c, continuation, 4);
                mbVar5.b = recyclerView;
                return mbVar5.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                RecyclerView recyclerView = this.b;
                this.c.j();
                recyclerView.a0();
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                RecyclerView recyclerView2 = this.b;
                this.c.j();
                recyclerView2.a0();
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                RecyclerView recyclerView3 = this.b;
                this.c.j();
                recyclerView3.a0();
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                RecyclerView recyclerView4 = this.b;
                this.c.j();
                recyclerView4.a0();
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                RecyclerView recyclerView5 = this.b;
                this.c.j();
                recyclerView5.a0();
                return Unit.INSTANCE;
        }
    }
}
