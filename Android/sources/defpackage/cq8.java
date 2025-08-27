package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView;

/* renamed from: cq8  reason: default package */
public final /* synthetic */ class cq8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaGalleryWidget b;

    public /* synthetic */ cq8(MediaGalleryWidget mediaGalleryWidget, int i) {
        this.a = i;
        this.b = mediaGalleryWidget;
    }

    public final Object invoke() {
        MediaGalleryWidget mediaGalleryWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MediaGalleryWidget.x;
                return new kk6(mediaGalleryWidget.e0());
            default:
                KProperty[] kPropertyArr2 = MediaGalleryWidget.x;
                EndlessRecyclerView endlessRecyclerView = new EndlessRecyclerView(mediaGalleryWidget.getContext(), (AttributeSet) null);
                endlessRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return endlessRecyclerView;
        }
    }
}
