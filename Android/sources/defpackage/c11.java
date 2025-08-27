package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: c11  reason: default package */
public final class c11 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c11(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        switch (this.a) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                c11 c11 = new c11(3, (Continuation) obj3, 0);
                c11.b = booleanValue;
                c11.c = booleanValue2;
                return c11.invokeSuspend(Unit.INSTANCE);
            case 1:
                boolean booleanValue3 = bool.booleanValue();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                c11 c112 = new c11(3, (Continuation) obj3, 1);
                c112.b = booleanValue3;
                c112.c = booleanValue4;
                return c112.invokeSuspend(Unit.INSTANCE);
            default:
                boolean booleanValue5 = bool.booleanValue();
                boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                c11 c113 = new c11(3, (Continuation) obj3, 2);
                c113.b = booleanValue5;
                c113.c = booleanValue6;
                return c113.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.b && this.c);
            case 1:
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.b && !this.c);
            default:
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.b || this.c);
        }
    }
}
