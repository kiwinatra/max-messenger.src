package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: gs9  reason: default package */
public final class gs9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ is9 b;
    public final /* synthetic */ long[] c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gs9(is9 is9, Continuation continuation, long[] jArr) {
        super(2, continuation);
        this.b = is9;
        this.c = jArr;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gs9(this.b, continuation, this.c);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gs9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            np2 np2 = new np2(this.c);
            this.a = 1;
            obj = ((jna) ((rl) this.b.b.getValue())).T(np2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                String q = ArraysKt___ArraysKt.joinToString$default(this.c, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
                z68.f("MissedContactsController", "fail to fetch contact info " + q, th);
                return null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long[] jArr = this.c;
        jo3 jo3 = (jo3) obj;
        a67 a67 = z68.b;
        if (a67 != null) {
            if (a67.c()) {
                w78 w78 = w78.o;
                String q2 = ArraysKt___ArraysKt.joinToString$default(jArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
                a67.d(w78, "MissedContactsController", "success CONTACT_INFO request: " + jo3 + "; " + q2 + "}", (Throwable) null);
            }
        }
        return (jo3) obj;
    }
}
