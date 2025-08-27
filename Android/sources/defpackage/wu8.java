package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* renamed from: wu8  reason: default package */
public final class wu8 extends MediaRouter2$RouteCallback {
    public final /* synthetic */ yu8 a;

    public wu8(yu8 yu8) {
        this.a = yu8;
    }

    public final void onRoutesAdded(List list) {
        this.a.j();
    }

    public final void onRoutesChanged(List list) {
        this.a.j();
    }

    public final void onRoutesRemoved(List list) {
        this.a.j();
    }
}
