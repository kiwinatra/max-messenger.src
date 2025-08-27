package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: r7c  reason: default package */
public final class r7c implements lt4 {
    public final Executor a;
    public final q74 b;
    public final jx0 c;
    public final by0 d;
    public kt4 e;
    public volatile q7c f;
    public volatile boolean g;

    public r7c(ir8 ir8, hx0 hx0, Executor executor) {
        executor.getClass();
        this.a = executor;
        xq8 xq8 = ir8.b;
        xq8.getClass();
        Map emptyMap = Collections.emptyMap();
        Uri uri = xq8.a;
        n79.p(uri, "The uri must be set.");
        String str = xq8.f;
        q74 q74 = r2;
        q74 q742 = new q74(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, str, 4, (Object) null);
        this.b = q74;
        jx0 c2 = hx0.c();
        this.c = c2;
        this.d = new by0(c2, q74, (byte[]) null, new y3a(17, (Object) this));
    }

    public final void a(kt4 kt4) {
        this.e = kt4;
        boolean z = false;
        while (!z) {
            try {
                if (this.g) {
                    break;
                }
                this.f = new q7c(this);
                this.a.execute(this.f);
                this.f.get();
                z = true;
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                cause.getClass();
                if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    int i = v0g.a;
                    throw cause;
                }
            } catch (Throwable th) {
                q7c q7c = this.f;
                q7c.getClass();
                q7c.a();
                throw th;
            }
        }
        q7c q7c2 = this.f;
        q7c2.getClass();
        q7c2.a();
    }

    public final void cancel() {
        this.g = true;
        q7c q7c = this.f;
        if (q7c != null) {
            q7c.cancel(true);
        }
    }

    public final void remove() {
        jx0 jx0 = this.c;
        ((tae) jx0.a).l(jx0.v.b(this.b));
    }
}
