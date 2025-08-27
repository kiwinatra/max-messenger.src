package defpackage;

import android.graphics.Bitmap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: iwa  reason: default package */
public final class iwa extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ jwa b;
    public final /* synthetic */ vk3 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iwa(jwa jwa, vk3 vk3, Continuation continuation) {
        super(2, continuation);
        this.b = jwa;
        this.c = vk3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new iwa(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iwa) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        vk3 vk3 = this.c;
        jwa jwa = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            hwa hwa = new hwa(jwa, vk3, (Continuation) null);
            this.a = 1;
            obj = okf.c(200, hwa, this);
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
        return b2.e(vk3.q(), vk3.r());
    }
}
