package defpackage;

import android.app.SharedElementCallback;
import android.graphics.Rect;
import android.view.View;
import java.util.List;
import java.util.Map;

/* renamed from: d5  reason: default package */
public final class d5 extends SharedElementCallback {
    public final /* synthetic */ Rect a;

    public d5(Rect rect) {
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
}
