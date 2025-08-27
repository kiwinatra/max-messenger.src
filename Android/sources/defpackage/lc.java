package defpackage;

import kotlin.reflect.KProperty;
import ru.ok.messages.actions.ExtraActionsView;
import ru.ok.messages.views.widgets.ImageSpanEllipsizedTextView;

/* renamed from: lc  reason: default package */
public final class lc extends qf5 {
    public static final /* synthetic */ KProperty[] y;
    public final w28 c = c(lic.albums_view);
    public final w28 o = c(lic.albums_selection_toolbar);
    public final w28 v = c(lic.toolbar_title_container);
    public final w28 w = c(lic.album_title);
    public final w28 x = c(lic.albums_progress_bar);

    static {
        Class<lc> cls = lc.class;
        y = new KProperty[]{wj6.p(cls, "albumsView", "getAlbumsView()Lru/ok/messages/actions/ExtraActionsView;", 0), wj6.p(cls, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), wj6.p(cls, "toolbarTitleContainer", "getToolbarTitleContainer()Landroid/view/View;", 0), wj6.p(cls, "albumTitle", "getAlbumTitle()Lru/ok/messages/views/widgets/ImageSpanEllipsizedTextView;", 0), wj6.p(cls, "albumProgressBar", "getAlbumProgressBar()Landroid/widget/ProgressBar;", 0)};
    }

    public final ImageSpanEllipsizedTextView d() {
        return (ImageSpanEllipsizedTextView) this.w.getValue(this, y[3]);
    }

    public final ExtraActionsView e() {
        return (ExtraActionsView) this.c.getValue(this, y[0]);
    }
}
