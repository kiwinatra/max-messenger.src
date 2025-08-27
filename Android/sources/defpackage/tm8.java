package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;

/* renamed from: tm8  reason: default package */
public final class tm8 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ um8 b;
    public final /* synthetic */ ResultReceiver c;
    public final /* synthetic */ er7 o;

    public tm8(er7 er7, vm8 vm8, String str, ResultReceiver resultReceiver) {
        this.o = er7;
        this.b = vm8;
        this.c = resultReceiver;
    }

    public final void run() {
        ResultReceiver resultReceiver = this.c;
        er7 er7 = this.o;
        um8 um8 = this.b;
        switch (this.a) {
            case 0:
                mm8 mm8 = (mm8) ((sy8) er7.b).v.get(((vm8) um8).a.getBinder());
                if (mm8 != null) {
                    sy8 sy8 = (sy8) er7.b;
                    sy8.getClass();
                    sy8.w = mm8;
                    if (true && true) {
                        resultReceiver.send(-1, (Bundle) null);
                    } else {
                        Bundle bundle = new Bundle();
                        int i = MediaBrowserCompat.MediaItem.FLAG_BROWSABLE;
                        bundle.putParcelable("media_item", (Parcelable) null);
                        resultReceiver.send(0, bundle);
                    }
                    sy8.w = null;
                    return;
                }
                return;
            default:
                mm8 mm82 = (mm8) ((sy8) er7.b).v.get(((vm8) um8).a.getBinder());
                if (mm82 != null) {
                    sy8 sy82 = (sy8) er7.b;
                    sy82.getClass();
                    sy82.w = mm82;
                    resultReceiver.send(-1, (Bundle) null);
                    sy82.w = null;
                    return;
                }
                return;
        }
    }

    public tm8(er7 er7, vm8 vm8, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.o = er7;
        this.b = vm8;
        this.c = resultReceiver;
    }
}
