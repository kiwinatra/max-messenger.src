package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bc1  reason: default package */
public final class bc1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ dc1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bc1(dc1 dc1, Continuation continuation) {
        super(2, continuation);
        this.b = dc1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bc1 bc1 = new bc1(this.b, continuation);
        bc1.a = obj;
        return bc1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bc1) create((a71) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        SpannableStringBuilder spannableStringBuilder;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a71 a71 = (a71) this.a;
        if (a71 instanceof y61) {
            Long l = this.b.w;
            y61 y61 = (y61) a71;
            long j = y61.a.b;
            if (l == null || l.longValue() != j) {
                return Unit.INSTANCE;
            }
            this.b.w = null;
            this.b.l(true, y61.a.v, (String) null, (Long) null);
        } else if (a71 instanceof z61) {
            Long l2 = this.b.w;
            long j2 = ((z61) a71).a;
            if (l2 == null || l2.longValue() != j2) {
                return Unit.INSTANCE;
            }
            this.b.w = null;
            dc1 dc1 = this.b;
            xme xme = dc1.x;
            do {
                value = xme.getValue();
                npg npg = dc1.c;
                npg.getClass();
                int i = lqa.c;
                Context context = (Context) npg.b;
                spannableStringBuilder = new SpannableStringBuilder(context.getString(i));
                spannableStringBuilder.setSpan(new aif(fu4.k.e(context).f(), new m91(npg, 0)), 0, spannableStringBuilder.length(), 17);
            } while (!xme.b(value, tb1.a((tb1) value, (gd0) null, (String) null, new pb1(new mgf(spannableStringBuilder)), (ngf) null, false, 499)));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
