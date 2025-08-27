package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: m4d  reason: default package */
public final class m4d extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ o21 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m4d(o21 o21, long j, Continuation continuation) {
        super(2, continuation);
        this.b = o21;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        m4d m4d = new m4d(this.b, this.c, continuation);
        m4d.a = obj;
        return m4d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m4d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        String name = d14.getClass().getName();
        long j = this.c;
        a67 a67 = z68.b;
        CharSequence charSequence = null;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, name, wj6.i(j, "start restore draft for chatId:"), (Throwable) null);
        }
        a32 a32 = (a32) ((my2) ((qx2) this.b.a.getValue())).o(this.c).a.getValue();
        if (a32 == null) {
            z68.c(d14.getClass().getName(), "can't restore draft because chat is null", new Object[0]);
            return null;
        }
        pt4 pt4 = a32.b.f0;
        mta mta = pt4 instanceof mta ? (mta) pt4 : null;
        if (mta == null) {
            z68.c(d14.getClass().getName(), "Draft empty in chat don't need restore", new Object[0]);
            return null;
        }
        o21 o21 = this.b;
        ur7 ur7 = mta.b;
        o21.getClass();
        if (!ev0.t(ur7)) {
            charSequence = ((yva) o21.b.getValue()).k.c(((yva) o21.b.getValue()).m(ur7.a, ur7.b));
        }
        return new l4d(charSequence, mta.d, mta.c);
    }
}
