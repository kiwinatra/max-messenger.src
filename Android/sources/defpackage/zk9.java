package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zk9  reason: default package */
public final class zk9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ en9 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zk9(en9 en9, long j, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zk9 zk9 = new zk9(this.b, this.c, continuation);
        zk9.a = obj;
        return zk9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zk9) create((c04) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        o8e o8e;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        c04 c04 = (c04) this.a;
        if (c04 instanceof b04) {
            o8e = new o8e(((b04) c04).a, 0, (igf) null, 6);
        } else if (c04 instanceof a04) {
            o8e = new o8e(((a04) c04).a, 0, (igf) null, 6);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        en9 en9 = this.b;
        xag.h(en9.q1, o8e);
        en9.v1.remove(Boxing.boxLong(this.c));
        return Unit.INSTANCE;
    }
}
