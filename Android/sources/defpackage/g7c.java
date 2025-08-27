package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: g7c  reason: default package */
public final class g7c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ k7c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g7c(k7c k7c, Continuation continuation) {
        super(2, continuation);
        this.b = k7c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        g7c g7c = new g7c(this.b, continuation);
        g7c.a = obj;
        return g7c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g7c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        k7c k7c = this.b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        try {
            Result.Companion companion = Result.Companion;
            AtomicReference atomicReference = k7c.J0;
            Lazy lazy = k7c.v0;
            Uri fromFile = Uri.fromFile(((po5) lazy.getValue()).r((String) atomicReference.updateAndGet(new md2(7))));
            String uri = fromFile.toString();
            int i = o5a.f;
            if (!uri.startsWith("content://")) {
                fromFile = ((po5) lazy.getValue()).f(k7c.K0, n79.V(fromFile));
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", fromFile);
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
            obj2 = Result.m23constructorimpl(intent);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r1 = Result.m26exceptionOrNullimpl(obj2);
        if (r1 != null) {
            z68.f(d14.getClass().getName(), "capturePhoto: failed to capture photo", r1);
            k7c.r();
        }
        if (Result.m30isSuccessimpl(obj2)) {
            xag.h(k7c.w0, new a6c((Intent) obj2));
        }
        return Unit.INSTANCE;
    }
}
