package defpackage;

import android.content.Context;
import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: q19  reason: default package */
public final class q19 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ r19 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q19(Uri uri, r19 r19, Continuation continuation) {
        super(2, continuation);
        this.b = uri;
        this.c = r19;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        q19 q19 = new q19(this.b, this.c, continuation);
        q19.a = obj;
        return q19;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q19) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        r19 r19 = this.c;
        Context context = r19.o;
        Uri uri = this.b;
        if (!o5a.L(uri, context, (m95) null)) {
            p19 p19 = r19.b;
            xag.h(p19.b, new m19(uri));
            xag.h(p19.b, k19.a);
        } else {
            z68.p(d14.getClass().getName(), "try to share internal file!");
        }
        return Unit.INSTANCE;
    }
}
