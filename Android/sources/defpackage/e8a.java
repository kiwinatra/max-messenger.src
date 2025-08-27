package defpackage;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: e8a  reason: default package */
public final class e8a extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ AppBarLayout b;
    public /* synthetic */ k2b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e8a(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AppBarLayout appBarLayout = (AppBarLayout) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                e8a e8a = new e8a(3, continuation, 0);
                e8a.b = appBarLayout;
                e8a.c = k2b;
                return e8a.invokeSuspend(Unit.INSTANCE);
            default:
                e8a e8a2 = new e8a(3, continuation, 1);
                e8a2.b = appBarLayout;
                e8a2.c = k2b;
                return e8a2.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().i);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
        }
    }
}
