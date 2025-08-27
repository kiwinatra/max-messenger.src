package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: sh0  reason: default package */
public final class sh0 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ boolean b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh0(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                dh0 dh0 = (dh0) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                sh0 sh0 = new sh0(3, (Continuation) obj3, 0);
                sh0.b = booleanValue;
                return sh0.invokeSuspend(Unit.INSTANCE);
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ((Boolean) obj2).booleanValue();
                sh0 sh02 = new sh0(3, (Continuation) obj3, 1);
                sh02.b = booleanValue2;
                return sh02.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.b);
            default:
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.b);
        }
    }
}
