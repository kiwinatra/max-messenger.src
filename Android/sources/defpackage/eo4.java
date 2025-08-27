package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: eo4  reason: default package */
public final class eo4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ fo4 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eo4(fo4 fo4, Continuation continuation) {
        super(2, continuation);
        this.a = fo4;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new eo4(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eo4) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [l0g, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = fo4.y;
        fo4 fo4 = this.a;
        int i = 1;
        if (((pid) ((fq) fo4.c.getValue())).o() == 1) {
            i = 0;
        }
        String t = pid.t(i);
        pid pid = (pid) ((fq) fo4.c.getValue());
        pid.j(i, "app.notification.dialogs.show");
        pid.j.d(Integer.valueOf(i));
        ? obj2 = new Object();
        obj2.c = t;
        ((rl) fo4.b.getValue()).a(new n0g(obj2));
        fo4.v.setValue(fo4.j());
        return Unit.INSTANCE;
    }
}
