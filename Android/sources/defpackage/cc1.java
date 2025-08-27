package defpackage;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: cc1  reason: default package */
public final class cc1 extends SuspendLambda implements Function2 {
    public dc1 a;
    public int b;
    public final /* synthetic */ dc1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cc1(dc1 dc1, Continuation continuation) {
        super(2, continuation);
        this.c = dc1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new cc1(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cc1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        dc1 dc1;
        Object value;
        SpannableStringBuilder spannableStringBuilder;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            dc1 dc12 = this.c;
            qpg qpg = dc12.o;
            this.a = dc12;
            this.b = 1;
            Object I = ev0.I(((osa) ((gaf) ((Lazy) qpg.c).getValue())).b(), new bq1(qpg, (Continuation) null), this);
            if (I == coroutine_suspended) {
                return coroutine_suspended;
            }
            dc1 = dc12;
            obj = I;
        } else if (i == 1) {
            dc1 = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dc1.w = (Long) obj;
        dc1 dc13 = this.c;
        xme xme = dc13.x;
        do {
            value = xme.getValue();
            npg npg = dc13.c;
            npg.getClass();
            spannableStringBuilder = new SpannableStringBuilder(" ");
            spannableStringBuilder.setSpan(new bq5((Drawable) (b38) ((Lazy) npg.c).getValue(), (vp5) null, 6), 0, 1, 17);
        } while (!xme.b(value, tb1.a((tb1) value, (gd0) null, (String) null, new qb1(new mgf(spannableStringBuilder)), (ngf) null, false, 499)));
        return Unit.INSTANCE;
    }
}
