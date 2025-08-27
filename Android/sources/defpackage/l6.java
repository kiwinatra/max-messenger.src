package defpackage;

import android.app.SharedElementCallback;
import android.graphics.Rect;
import android.view.View;
import java.util.List;
import java.util.Map;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: l6  reason: default package */
public final class l6 extends SharedElementCallback {
    public final /* synthetic */ Rect a;
    public final /* synthetic */ ActLocalMedias b;

    public l6(ActLocalMedias actLocalMedias, Rect rect) {
        this.b = actLocalMedias;
        this.a = rect;
    }

    public final void onMapSharedElements(List list, Map map) {
        Rect rect;
        if (map != null && (rect = this.a) != null) {
            for (View x : map.values()) {
                iq.x(rect, x);
            }
        }
    }

    public final void onRejectSharedElements(List list) {
        if (list != null && !list.isEmpty()) {
            this.b.G0.postDelayed(new b(5, (Object) this), 100);
        }
    }
}
