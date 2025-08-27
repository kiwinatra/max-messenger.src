package defpackage;

import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.CompletionHandler;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: ev  reason: default package */
public final class ev implements CompletionHandler {
    public static final ev b = new ev(0);
    public static final ev c = new ev(1);
    public final /* synthetic */ int a;

    public /* synthetic */ ev(int i) {
        this.a = i;
    }

    public final void completed(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((kw1) obj2).resumeWith(Result.m23constructorimpl(obj));
                return;
            default:
                Void voidR = (Void) obj;
                Result.Companion companion = Result.Companion;
                ((kw1) obj2).resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
                return;
        }
    }

    public final void failed(Throwable th, Object obj) {
        switch (this.a) {
            case 0:
                kw1 kw1 = (kw1) obj;
                if (!(th instanceof AsynchronousCloseException) || !kw1.isCancelled()) {
                    Result.Companion companion = Result.Companion;
                    kw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(th)));
                    return;
                }
                return;
            default:
                kw1 kw12 = (kw1) obj;
                if (!(th instanceof AsynchronousCloseException) || !kw12.isCancelled()) {
                    Result.Companion companion2 = Result.Companion;
                    kw12.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(th)));
                    return;
                }
                return;
        }
    }
}
