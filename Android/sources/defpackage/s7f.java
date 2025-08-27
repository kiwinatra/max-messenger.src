package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;

/* renamed from: s7f  reason: default package */
public final class s7f extends w7f implements xw8 {
    public final MediaRouter.RouteInfo m() {
        return ((MediaRouter) this.X).getDefaultRoute();
    }

    public final void o(u7f u7f, l15 l15) {
        z(u7f, l15);
        ((Bundle) l15.a).putInt("deviceType", ((MediaRouter.RouteInfo) u7f.a).getDeviceType());
    }

    public final void t(Object obj) {
        ((MediaRouter) this.X).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
    }

    public final void u() {
        boolean z = this.y0;
        Object obj = this.Y;
        Object obj2 = this.X;
        if (z) {
            ((MediaRouter) obj2).removeCallback((MediaRouter.Callback) obj);
        }
        this.y0 = true;
        ((MediaRouter) obj2).addCallback(this.w0, (MediaRouter.Callback) obj, this.x0 | true ? 1 : 0);
    }

    public final void w(v7f v7f) {
        super.w(v7f);
        ((MediaRouter.UserRouteInfo) v7f.b).setDescription(v7f.a.e);
    }

    public final boolean x(u7f u7f) {
        return ((MediaRouter.RouteInfo) u7f.a).isConnecting();
    }

    public final void y(u7f u7f, l15 l15) {
        Display display;
        super.o(u7f, l15);
        Object obj = u7f.a;
        boolean isEnabled = ((MediaRouter.RouteInfo) obj).isEnabled();
        Bundle bundle = (Bundle) l15.a;
        if (!isEnabled) {
            bundle.putBoolean("enabled", false);
        }
        if (x(u7f)) {
            bundle.putInt("connectionState", 1);
        }
        try {
            display = ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
        } catch (NoSuchMethodError unused) {
            display = null;
        }
        if (display != null) {
            bundle.putInt("presentationDisplayId", display.getDisplayId());
        }
    }

    public final void z(u7f u7f, l15 l15) {
        y(u7f, l15);
        CharSequence description = ((MediaRouter.RouteInfo) u7f.a).getDescription();
        if (description != null) {
            ((Bundle) l15.a).putString("status", description.toString());
        }
    }
}
