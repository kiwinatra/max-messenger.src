package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: k7a  reason: default package */
public final class k7a extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l7a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k7a(l7a l7a, Continuation continuation) {
        super(2, continuation);
        this.c = l7a;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        k7a k7a = new k7a(this.c, continuation);
        k7a.b = obj;
        return k7a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k7a) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            l7a l7a = this.c;
            try {
                Result.Companion companion = Result.Companion;
                l7a.k = String.valueOf(System.currentTimeMillis());
                Uri fromFile = Uri.fromFile(((po5) l7a.b.getValue()).r(l7a.k));
                String uri = fromFile.toString();
                int i2 = o5a.f;
                if (!uri.startsWith("content://")) {
                    fromFile = ((po5) l7a.b.getValue()).f((Context) l7a.c.getValue(), n79.V(fromFile));
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", fromFile);
                intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
                obj2 = Result.m23constructorimpl(intent);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
            l7a l7a2 = this.c;
            Throwable r4 = Result.m26exceptionOrNullimpl(obj2);
            if (r4 != null) {
                z68.f(d14.getClass().getName(), "capturePhoto: failed to capture photo", r4);
                l7a2.a();
            }
            l7a l7a3 = this.c;
            if (Result.m30isSuccessimpl(obj2)) {
                n6e n6e = l7a3.g;
                od0 od0 = new od0((Intent) obj2);
                this.b = obj2;
                this.a = 1;
                if (n6e.a(od0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
