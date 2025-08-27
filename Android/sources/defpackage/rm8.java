package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: rm8  reason: default package */
public final class rm8 implements Runnable {
    public final /* synthetic */ um8 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;
    public final /* synthetic */ Bundle v;
    public final /* synthetic */ er7 w;

    public rm8(int i, int i2, er7 er7, vm8 vm8, Bundle bundle, String str) {
        this.w = er7;
        this.a = vm8;
        this.b = str;
        this.c = i;
        this.o = i2;
        this.v = bundle;
    }

    public final void run() {
        um8 um8 = this.a;
        IBinder binder = ((vm8) um8).a.getBinder();
        er7 er7 = this.w;
        ((sy8) er7.b).v.remove(binder);
        mm8 mm8 = new mm8((sy8) er7.b, this.b, this.c, this.o, (vm8) um8);
        sy8 sy8 = (sy8) er7.b;
        sy8.w = mm8;
        fj b2 = sy8.b(this.v);
        sy8.w = null;
        if (b2 == null) {
            try {
                ((vm8) um8).a(2, (Bundle) null);
            } catch (RemoteException unused) {
            }
        } else {
            try {
                sy8.v.put(binder, mm8);
                binder.linkToDeath(mm8, 0);
                ox8 ox8 = sy8.y;
                if (ox8 != null) {
                    Bundle bundle = (Bundle) b2.c;
                    vm8 vm8 = (vm8) um8;
                    vm8.getClass();
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putInt("extra_service_version", 2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_media_item_id", "androidx.media3.session.MediaLibraryService");
                    bundle2.putParcelable("data_media_session_token", pt7.a(ox8, MediaSessionCompat.Token.CREATOR));
                    bundle2.putBundle("data_root_hints", bundle);
                    vm8.a(1, bundle2);
                }
            } catch (RemoteException unused2) {
                sy8.v.remove(binder);
            }
        }
    }
}
