package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: i7a  reason: default package */
public final class i7a extends SuspendLambda implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ l7a c;
    public final /* synthetic */ RectF o;
    public final /* synthetic */ sd0 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i7a(String str, Rect rect, l7a l7a, RectF rectF, sd0 sd0, Continuation continuation) {
        super(2, continuation);
        this.a = str;
        this.b = rect;
        this.c = l7a;
        this.o = rectF;
        this.v = sd0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new i7a(this.a, this.b, this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i7a) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        l7a l7a = this.c;
        String str = this.a;
        rd0 rd0 = new rd0(m5a.r(str, this.b, (bud) l7a.d.getValue()), str, m5a.n(this.o), this.v);
        xme xme = l7a.i;
        xme.getClass();
        xme.m((Object) null, rd0);
        return Unit.INSTANCE;
    }
}
