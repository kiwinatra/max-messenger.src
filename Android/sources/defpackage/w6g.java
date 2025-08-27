package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException;

/* renamed from: w6g  reason: default package */
public final class w6g extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ y6g c;
    public final /* synthetic */ File o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w6g(y6g y6g, File file, Continuation continuation) {
        super(2, continuation);
        this.c = y6g;
        this.o = file;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        w6g w6g = new w6g(this.c, this.o, continuation);
        w6g.b = obj;
        return w6g;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w6g) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [v6g, kotlin.coroutines.jvm.internal.SuspendLambda] */
    public final Object invokeSuspend(Object obj) {
        d14 d14;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        nyc nyc = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.b;
            etc etc = this.c.y0;
            ? suspendLambda = new SuspendLambda(2, (Continuation<Object>) null);
            this.b = d142;
            this.a = 1;
            Object B = bs0.B(etc, suspendLambda, this);
            if (B == coroutine_suspended) {
                return coroutine_suspended;
            }
            d14 = d142;
            obj = B;
        } else if (i == 1) {
            d14 = (d14) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (Intrinsics.areEqual((Object) (Boolean) obj, (Object) Boxing.boxBoolean(true))) {
            String name = d14.getClass().getName();
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, name, "Camera preview was bind successfully", (Throwable) null);
            }
            y6g y6g = this.c;
            File file = this.o;
            jv1 jv1 = y6g.D0;
            y6g.getClass();
            y6g.w0 = kne.b();
            lyc lyc = y6g.y;
            if (lyc != null) {
                gy0 gy0 = new gy0((Context) y6g.a.getValue(), lyc, new grg(file).v());
                gy0.w = true;
                gy0.x();
                nyc = gy0.u((ExecutorService) y6g.w.getValue(), new a0(20, y6g));
            }
            y6g.v0 = nyc;
            return Unit.INSTANCE;
        }
        throw new VideoMessageRecordDelegate$PreviewRenderException(0);
    }
}
