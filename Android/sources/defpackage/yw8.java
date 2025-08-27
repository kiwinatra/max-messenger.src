package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;

/* renamed from: yw8  reason: default package */
public final class yw8 extends MediaRouter.Callback {
    public final uw8 a;

    public yw8(uw8 uw8) {
        this.a = uw8;
    }

    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        w7f w7f = (w7f) this.a;
        if (w7f.i(routeInfo)) {
            w7f.s();
        }
    }

    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        w7f w7f = (w7f) this.a;
        w7f.getClass();
        if (w7f.n(routeInfo) == null && (j = w7f.j(routeInfo)) >= 0) {
            u7f u7f = (u7f) w7f.z0.get(j);
            String str = u7f.b;
            CharSequence name = ((MediaRouter.RouteInfo) u7f.a).getName(w7f.a);
            l15 l15 = new l15(str, name != null ? name.toString() : "");
            w7f.o(u7f, l15);
            u7f.c = l15.g();
            w7f.s();
        }
    }

    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        Display display;
        s7f s7f = (s7f) ((xw8) this.a);
        int j = s7f.j(routeInfo);
        if (j >= 0) {
            u7f u7f = (u7f) s7f.z0.get(j);
            ArrayList arrayList = null;
            try {
                display = routeInfo.getPresentationDisplay();
            } catch (NoSuchMethodError unused) {
                display = null;
            }
            int displayId = display != null ? display.getDisplayId() : -1;
            if (displayId != u7f.c.a.getInt("presentationDisplayId", -1)) {
                nv8 nv8 = u7f.c;
                if (nv8 != null) {
                    Bundle bundle = new Bundle(nv8.a);
                    ArrayList arrayList2 = !nv8.b().isEmpty() ? new ArrayList(nv8.b()) : null;
                    nv8.a();
                    if (!nv8.c.isEmpty()) {
                        arrayList = new ArrayList(nv8.c);
                    }
                    bundle.putInt("presentationDisplayId", displayId);
                    if (arrayList != null) {
                        bundle.putParcelableArrayList("controlFilters", arrayList);
                    }
                    if (arrayList2 != null) {
                        bundle.putStringArrayList("groupMemberIds", arrayList2);
                    }
                    u7f.c = new nv8(bundle);
                    s7f.s();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }

    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        w7f w7f = (w7f) this.a;
        w7f.getClass();
        if (w7f.n(routeInfo) == null && (j = w7f.j(routeInfo)) >= 0) {
            w7f.z0.remove(j);
            w7f.s();
        }
    }

    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        rw8 a2;
        w7f w7f = (w7f) this.a;
        if (routeInfo == ((MediaRouter) w7f.X).getSelectedRoute(8388611)) {
            v7f n = w7f.n(routeInfo);
            if (n != null) {
                n.a.l();
                return;
            }
            int j = w7f.j(routeInfo);
            if (j >= 0) {
                String str = ((u7f) w7f.z0.get(j)).b;
                ow8 ow8 = (ow8) w7f.z;
                ow8.m.removeMessages(262);
                qw8 e = ow8.e(ow8.c);
                if (e != null && (a2 = e.a(str)) != null) {
                    a2.l();
                }
            }
        }
    }

    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        w7f w7f = (w7f) this.a;
        w7f.getClass();
        if (w7f.n(routeInfo) == null && (j = w7f.j(routeInfo)) >= 0) {
            u7f u7f = (u7f) w7f.z0.get(j);
            int volume = routeInfo.getVolume();
            if (volume != u7f.c.a.getInt("volume")) {
                nv8 nv8 = u7f.c;
                if (nv8 != null) {
                    Bundle bundle = new Bundle(nv8.a);
                    ArrayList arrayList = null;
                    ArrayList arrayList2 = !nv8.b().isEmpty() ? new ArrayList(nv8.b()) : null;
                    nv8.a();
                    if (!nv8.c.isEmpty()) {
                        arrayList = new ArrayList(nv8.c);
                    }
                    bundle.putInt("volume", volume);
                    if (arrayList != null) {
                        bundle.putParcelableArrayList("controlFilters", arrayList);
                    }
                    if (arrayList2 != null) {
                        bundle.putStringArrayList("groupMemberIds", arrayList2);
                    }
                    u7f.c = new nv8(bundle);
                    w7f.s();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }
}
