package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: h5e  reason: default package */
public final class h5e extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ occ b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h5e(occ occ, Continuation continuation) {
        super(2, continuation);
        this.b = occ;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        h5e h5e = new h5e(this.b, continuation);
        h5e.a = obj;
        return h5e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h5e) create((b5e) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        b5e b5e = (b5e) this.a;
        occ occ = this.b;
        if (b5e == null) {
            occ.setVisibility(8);
        } else {
            occ.setVisibility(0);
            CharSequence a2 = b5e.a.a(occ.getContext());
            if (a2 != null) {
                occ.setTitle(a2);
                ngf ngf = b5e.b;
                occ.setBody(ngf != null ? ngf.a(occ.getContext()) : null);
                occ.a(b5e.c, (Integer) null);
                occ.setCounter(b5e.d);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return Unit.INSTANCE;
    }
}
