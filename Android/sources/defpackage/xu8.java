package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: xu8  reason: default package */
public final class xu8 extends MediaRouter2$TransferCallback {
    public final /* synthetic */ yu8 a;

    public xu8(yu8 yu8) {
        this.a = yu8;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        hw8 hw8 = (hw8) this.a.Y.remove(routingController);
        if (hw8 != null) {
            ow8 ow8 = (ow8) this.a.X.b;
            if (hw8 == ow8.s) {
                rw8 c = ow8.c();
                if (ow8.f() != c) {
                    ow8.i(c, 2);
                }
            } else if (sw8.c) {
                Objects.toString(hw8);
            }
        } else {
            Objects.toString(routingController);
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        rw8 rw8;
        this.a.Y.remove(routingController);
        if (routingController2 == this.a.z.getSystemController()) {
            ow8 ow8 = (ow8) this.a.X.b;
            rw8 c = ow8.c();
            if (ow8.f() != c) {
                ow8.i(c, 3);
                return;
            }
            return;
        }
        List u = routingController2.getSelectedRoutes();
        if (!u.isEmpty()) {
            String r = x3.i(u.get(0)).getId();
            this.a.Y.put(routingController2, new uu8(this.a, routingController2, r));
            ow8 ow82 = (ow8) this.a.X.b;
            Iterator it = ow82.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    rw8 = null;
                    break;
                }
                rw8 = (rw8) it.next();
                if (rw8.c() == ow82.e && TextUtils.equals(r, rw8.b)) {
                    break;
                }
            }
            if (rw8 != null) {
                ow82.i(rw8, 3);
            }
            this.a.k(routingController2);
        }
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Objects.toString(mediaRoute2Info);
    }
}
