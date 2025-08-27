package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;

/* renamed from: so8  reason: default package */
public final class so8 extends ResultReceiver {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so8(int i, Handler handler, Object obj) {
        super(handler);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [f67, java.lang.Object] */
    public final void onReceiveResult(int i, Bundle bundle) {
        h67 h67 = null;
        switch (this.a) {
            case 0:
                uo8 uo8 = (uo8) ((WeakReference) this.b).get();
                if (uo8 != null && bundle != null) {
                    synchronized (uo8.b) {
                        ox8 ox8 = uo8.e;
                        IBinder binder = bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER);
                        int i2 = ix8.d;
                        if (binder != null) {
                            IInterface queryLocalInterface = binder.queryLocalInterface(IMediaSession.DESCRIPTOR);
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof h67)) {
                                ? obj = new Object();
                                obj.c = binder;
                                h67 = obj;
                            } else {
                                h67 = (h67) queryLocalInterface;
                            }
                        }
                        synchronized (ox8.a) {
                            ox8.c = h67;
                        }
                        ox8 ox82 = uo8.e;
                        t2g A = i8b.A(bundle);
                        synchronized (ox82.a) {
                            ox82.o = A;
                        }
                        uo8.a();
                    }
                    return;
                }
                return;
            case 1:
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                ((byd) this.b).l(new swd(i, bundle));
                return;
            default:
                ((qdf) this.b).d((Object) null);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so8(Handler handler) {
        super(handler);
        this.a = 0;
    }
}
