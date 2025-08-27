package defpackage;

import android.graphics.Bitmap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gwa  reason: default package */
public final class gwa extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ jwa b;
    public final /* synthetic */ a32 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gwa(jwa jwa, a32 a32, Continuation continuation) {
        super(2, continuation);
        this.b = jwa;
        this.c = a32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gwa(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gwa) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        a32 a32 = this.c;
        jwa jwa = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            fwa fwa = new fwa(jwa, a32, (Continuation) null);
            this.a = 1;
            obj = okf.c(200, fwa, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            return bitmap;
        }
        jca b2 = jwa.b();
        b2.getClass();
        a32.l0();
        a32.m0();
        return b2.e(a32.v0, a32.g());
    }
}
