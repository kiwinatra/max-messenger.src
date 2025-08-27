package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: cw6  reason: default package */
public abstract class cw6 {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl(new bw6(a(Looper.getMainLooper())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj)) {
            obj = null;
        }
        bw6 bw6 = (bw6) obj;
    }

    public static final Handler a(Looper looper) {
        return (Handler) Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
    }
}
