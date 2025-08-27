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

/* renamed from: vyd  reason: default package */
public final class vyd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ wyd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vyd(wyd wyd, Continuation continuation) {
        super(2, continuation);
        this.b = wyd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vyd vyd = new vyd(this.b, continuation);
        vyd.a = obj;
        return vyd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vyd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        wyd wyd = this.b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        try {
            Result.Companion companion = Result.Companion;
            AtomicReference atomicReference = wyd.B0;
            Lazy lazy = wyd.y;
            atomicReference.set(String.valueOf(System.currentTimeMillis()));
            Uri fromFile = Uri.fromFile(((po5) lazy.getValue()).r((String) wyd.B0.get()));
            String uri = fromFile.toString();
            int i = o5a.f;
            if (!uri.startsWith("content://")) {
                fromFile = ((po5) lazy.getValue()).f((Application) wyd.z.getValue(), n79.V(fromFile));
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
            wyd.q();
        }
        if (Result.m30isSuccessimpl(obj2)) {
            xag.h(wyd.v0, new x2e((Intent) obj2));
        }
        return Unit.INSTANCE;
    }
}
