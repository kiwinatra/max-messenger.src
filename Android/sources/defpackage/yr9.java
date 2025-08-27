package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yr9  reason: default package */
public final class yr9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ d14 c;
    public final /* synthetic */ is9 o;
    public long[] v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yr9(Object obj, Continuation continuation, d14 d14, is9 is9) {
        super(2, continuation);
        this.b = obj;
        this.c = d14;
        this.o = is9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yr9(this.b, continuation, this.c, this.o);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yr9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        long[] jArr;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            e14.e(this.c);
            long[] longArray = CollectionsKt.toLongArray((List) this.b);
            this.v = longArray;
            this.a = 1;
            is9 is9 = this.o;
            is9.getClass();
            Object d = e14.d(new hs9(is9, (Continuation) null, longArray), this);
            if (d == coroutine_suspended) {
                return coroutine_suspended;
            }
            long[] jArr2 = longArray;
            obj = d;
            jArr = jArr2;
        } else if (i == 1) {
            jArr = this.v;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return TuplesKt.to(jArr, obj);
    }
}
