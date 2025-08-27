package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wgb  reason: default package */
public final class wgb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ occ b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wgb(occ occ, Continuation continuation) {
        super(2, continuation);
        this.b = occ;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wgb wgb = new wgb(this.b, continuation);
        wgb.a = obj;
        return wgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wgb) create((rhb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        rhb rhb = (rhb) this.a;
        occ occ = this.b;
        if (rhb == null) {
            occ.setVisibility(8);
        } else {
            occ.setVisibility(0);
            CharSequence a2 = rhb.a.a(occ.getContext());
            if (a2 != null) {
                occ.setTitle(a2);
                ngf ngf = rhb.b;
                occ.setBody(ngf != null ? ngf.a(occ.getContext()) : null);
                occ.a(rhb.c, rhb.e);
                occ.setCounter(rhb.d);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return Unit.INSTANCE;
    }
}
