package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* renamed from: tu8  reason: default package */
public final class tu8 extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ yu8 a;

    public tu8(yu8 yu8) {
        this.a = yu8;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.k(routingController);
    }
}
