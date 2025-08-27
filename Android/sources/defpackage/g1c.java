package defpackage;

import android.app.Application;
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

/* renamed from: g1c  reason: default package */
public final class g1c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ j1c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g1c(j1c j1c, Continuation continuation) {
        super(2, continuation);
        this.b = j1c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        g1c g1c = new g1c(this.b, continuation);
        g1c.a = obj;
        return g1c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g1c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        j1c j1c = this.b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        try {
            Result.Companion companion = Result.Companion;
            AtomicReference atomicReference = j1c.z0;
            Lazy lazy = j1c.x;
            atomicReference.set(String.valueOf(System.currentTimeMillis()));
            Uri fromFile = Uri.fromFile(((po5) lazy.getValue()).r((String) j1c.z0.get()));
            String uri = fromFile.toString();
            int i = o5a.f;
            if (!uri.startsWith("content://")) {
                fromFile = ((po5) lazy.getValue()).f((Application) j1c.y.getValue(), n79.V(fromFile));
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
            j1c.l();
        }
        if (Result.m30isSuccessimpl(obj2)) {
            xag.h(j1c.w0, new e0c((Intent) obj2));
        }
        return Unit.INSTANCE;
    }
}
