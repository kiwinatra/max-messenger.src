package defpackage;

import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: cl8  reason: default package */
public final class cl8 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ zcb b;
    public /* synthetic */ zcb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl8(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zcb zcb = (zcb) obj;
        zcb zcb2 = (zcb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                cl8 cl8 = new cl8(3, continuation, 0);
                cl8.b = zcb;
                cl8.c = zcb2;
                return cl8.invokeSuspend(Unit.INSTANCE);
            case 1:
                cl8 cl82 = new cl8(3, continuation, 1);
                cl82.b = zcb;
                cl82.c = zcb2;
                return cl82.invokeSuspend(Unit.INSTANCE);
            default:
                cl8 cl83 = new cl8(3, continuation, 2);
                cl83.b = zcb;
                cl83.c = zcb2;
                return cl83.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                zcb zcb = this.b;
                zcb zcb2 = this.c;
                int ordinal = zcb.ordinal();
                if (ordinal == 0) {
                    return pub.a;
                }
                if (ordinal == 1) {
                    int ordinal2 = zcb2.ordinal();
                    if (ordinal2 == 0) {
                        return pub.a;
                    }
                    if (ordinal2 == 1) {
                        return pub.b;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(Build.VERSION.SDK_INT >= 34 && this.b == zcb.b && this.c == zcb.a);
            default:
                ResultKt.throwOnFailure(obj);
                zcb zcb3 = this.b;
                zcb zcb4 = this.c;
                zcb zcb5 = zcb.a;
                return Boxing.boxBoolean(zcb3 == zcb5 || zcb4 == zcb5);
        }
    }
}
