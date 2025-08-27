package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: t86  reason: default package */
public final class t86 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ boolean b;
    public /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t86(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                t86 t86 = new t86(3, (Continuation) obj3, 0);
                t86.b = booleanValue;
                t86.c = (jx6) obj2;
                return t86.invokeSuspend(Unit.INSTANCE);
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                t86 t862 = new t86(3, (Continuation) obj3, 1);
                t862.b = booleanValue2;
                t862.c = (wk6) obj2;
                return t862.invokeSuspend(Unit.INSTANCE);
            case 2:
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                t86 t863 = new t86(3, (Continuation) obj3, 2);
                t863.c = (List) obj;
                t863.b = booleanValue3;
                return t863.invokeSuspend(Unit.INSTANCE);
            case 3:
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                t86 t864 = new t86(3, (Continuation) obj3, 3);
                t864.c = (Map) obj;
                t864.b = booleanValue4;
                return t864.invokeSuspend(Unit.INSTANCE);
            default:
                boolean booleanValue5 = ((Boolean) obj2).booleanValue();
                t86 t865 = new t86(3, (Continuation) obj3, 4);
                t865.c = (h7b) obj;
                t865.b = booleanValue5;
                return t865.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                return this.b ? (jx6) this.c : gx6.c;
            case 1:
                ResultKt.throwOnFailure(obj);
                return TuplesKt.to(Boxing.boxBoolean(this.b), (wk6) this.c);
            case 2:
                ResultKt.throwOnFailure(obj);
                return this.b ? (List) this.c : CollectionsKt.emptyList();
            case 3:
                ResultKt.throwOnFailure(obj);
                return this.b ? ((Map) this.c).values() : CollectionsKt.emptyList();
            default:
                ResultKt.throwOnFailure(obj);
                boolean z = this.b;
                int ordinal = ((h7b) this.c).ordinal();
                if (ordinal == 0) {
                    return kjg.a;
                }
                if (ordinal == 1 || ordinal == 2) {
                    return new ljg(z);
                }
                if (ordinal == 3) {
                    return jjg.a;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
