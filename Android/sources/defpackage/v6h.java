package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: v6h  reason: default package */
public final class v6h implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v6h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.a) {
            case 0:
                h7h h7h = (h7h) this.b;
                h7h.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                h7h.a().post(new t2h(this, iBinder));
                return;
            default:
                x7h x7h = (x7h) this.b;
                x7h.b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                x7h.a().post(new g7h(this, iBinder));
                return;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                h7h h7h = (h7h) this.b;
                h7h.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                h7h.a().post(new b6h(1, this));
                return;
            default:
                x7h x7h = (x7h) this.b;
                x7h.b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                x7h.a().post(new b7h(1, this));
                return;
        }
    }
}
