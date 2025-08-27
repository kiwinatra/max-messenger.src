package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: r5b  reason: default package */
public final class r5b extends SuspendLambda implements Function2 {
    public final /* synthetic */ s5b a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r5b(s5b s5b, Continuation continuation) {
        super(2, continuation);
        this.a = s5b;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new r5b(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r5b) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [l0g, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = s5b.y;
        s5b s5b = this.a;
        boolean z = !((hq) ((fq) s5b.c.getValue())).g.getBoolean("app.notification.show.new.users", true);
        ((hq) ((fq) s5b.c.getValue())).i("app.notification.show.new.users", z);
        ? obj2 = new Object();
        obj2.a = Boxing.boxBoolean(z);
        ((rl) s5b.b.getValue()).a(new n0g(obj2));
        s5b.v.setValue(s5b.j());
        return Unit.INSTANCE;
    }
}
