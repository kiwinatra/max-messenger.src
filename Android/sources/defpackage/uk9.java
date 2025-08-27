package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: uk9  reason: default package */
public final class uk9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ en9 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uk9(en9 en9, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        uk9 uk9 = new uk9(this.b, continuation);
        uk9.a = obj;
        return uk9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uk9) create((fb9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        fb9 fb9 = (fb9) this.a;
        String str = this.b.z0;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "Got MessageEvent=" + fb9, (Throwable) null);
        }
        if (fb9 instanceof za9) {
            en9 en9 = this.b;
            en9.getClass();
            if (((za9) fb9).b) {
                String str2 = en9.z0;
                a67 a672 = z68.b;
                if (a672 != null && a672.c()) {
                    a672.d(w78.o, str2, "handleMessageAddEvent: delayed scroll for outgoing message", (Throwable) null);
                }
                cid cid = en9.s1;
                cid.getClass();
                cid.a.setValue(new zhd(LongCompanionObject.MAX_VALUE, false, false, true, false));
            }
        }
        return Unit.INSTANCE;
    }
}
