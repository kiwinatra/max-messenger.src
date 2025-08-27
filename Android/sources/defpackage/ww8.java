package defpackage;

import android.media.MediaRouter;

/* renamed from: ww8  reason: default package */
public final class ww8 extends MediaRouter.VolumeCallback {
    public final vw8 a;

    public ww8(vw8 vw8) {
        this.a = vw8;
    }

    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.b(i, routeInfo);
    }

    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.a(i, routeInfo);
    }
}
