package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gu3  reason: default package */
public final class gu3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ju3 a;
    public final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gu3(ju3 ju3, String str, Continuation continuation) {
        super(2, continuation);
        this.a = ju3;
        this.b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gu3(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gu3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ju3 ju3 = this.a;
        List list = ((po3) ju3.b.getValue()).a;
        if (list != null) {
            return ju3.a(ju3, list, this.b);
        }
        return null;
    }
}
