package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import java.util.List;

/* renamed from: jx8  reason: default package */
public abstract class jx8 implements hx8 {
    public final MediaSession a;
    public final ix8 b;
    public final ox8 c;
    public final Object d = new Object();
    public final Bundle e;
    public final RemoteCallbackList f = new RemoteCallbackList();
    public mob g;
    public List h;
    public vs8 i;
    public int j;
    public int k;
    public f0 l;

    public jx8(Context context, String str, Bundle bundle) {
        MediaSession b2 = b(context, str, bundle);
        this.a = b2;
        ix8 ix8 = new ix8((kx8) this);
        this.b = ix8;
        this.c = new ox8(b2.getSessionToken(), ix8);
        this.e = bundle;
        b2.setFlags(3);
    }

    public abstract MediaSession b(Context context, String str, Bundle bundle);

    public final void c(f0 f0Var, Handler handler) {
        synchronized (this.d) {
            try {
                this.l = f0Var;
                this.a.setCallback(f0Var == null ? null : (gx8) f0Var.a, handler);
                if (f0Var != null) {
                    f0Var.L(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final f0 getCallback() {
        f0 f0Var;
        synchronized (this.d) {
            f0Var = this.l;
        }
        return f0Var;
    }
}
