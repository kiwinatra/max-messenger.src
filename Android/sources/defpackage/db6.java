package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: db6  reason: default package */
public final class db6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ occ b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public db6(occ occ, Continuation continuation) {
        super(2, continuation);
        this.b = occ;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        db6 db6 = new db6(this.b, continuation);
        db6.a = obj;
        return db6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((db6) create((ua6) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ua6 ua6 = (ua6) this.a;
        occ occ = this.b;
        if (ua6 == null) {
            occ.setVisibility(8);
        } else {
            occ.setVisibility(0);
            CharSequence a2 = ua6.a.a(occ.getContext());
            if (a2 != null) {
                occ.setTitle(a2);
                ngf ngf = ua6.b;
                occ.setBody(ngf != null ? ngf.a(occ.getContext()) : null);
                occ.a(ua6.c, ua6.e);
                occ.setCounter(ua6.d);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return Unit.INSTANCE;
    }
}
