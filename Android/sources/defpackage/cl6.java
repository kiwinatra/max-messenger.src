package defpackage;

import kotlin.reflect.KProperty;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import ru.ok.messages.gallery.view.CameraContainerView;

/* renamed from: cl6  reason: default package */
public final class cl6 extends qf5 {
    public static final /* synthetic */ KProperty[] y;
    public final w28 c = c(lic.media_permissions_view);
    public final w28 o = c(lic.camera_container_view);
    public final w28 v = c(lic.gallery_recycler_view);
    public final w28 w = c(lic.empty_view);
    public final w28 x = c(lic.content);

    static {
        Class<cl6> cls = cl6.class;
        y = new KProperty[]{wj6.p(cls, "mediaPermissionsView", "getMediaPermissionsView()Lru/ok/messages/gallery/view/MediaPermissionsView;", 0), wj6.p(cls, "cameraContainerView", "getCameraContainerView()Lru/ok/messages/gallery/view/CameraContainerView;", 0), wj6.p(cls, "galleryRecyclerView", "getGalleryRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), wj6.p(cls, "emptyView", "getEmptyView()Landroid/view/View;", 0), wj6.p(cls, "content", "getContent()Landroid/view/View;", 0)};
    }

    public final CameraContainerView d() {
        return (CameraContainerView) this.o.getValue(this, y[1]);
    }

    public final EndlessRecyclerView e() {
        return (EndlessRecyclerView) this.v.getValue(this, y[2]);
    }
}
