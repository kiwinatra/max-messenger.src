package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.reflect.KProperty;
import ru.ok.messages.settings.folders.view.LockableNestedScrollView;

/* renamed from: f46  reason: default package */
public final class f46 extends qf5 {
    public static final /* synthetic */ KProperty[] v0;
    public final w28 X = c(lic.frg_chats_folder_settings__all_name);
    public final w28 Y = c(lic.frg_chats_folder_settings__all_subtitle);
    public final w28 Z = c(lic.frg_chats_folder_settings__cl_all_background);
    public final w28 c = c(lic.frg_chats_folder_settings__folders);
    public final w28 o = c(lic.frg_chats_folder_settings__smart_folders);
    public final w28 v = c(lic.frg_chats_folder_settings__toolbar);
    public final w28 w = c(lic.frg_chats_folder_settings__smart_title);
    public final w28 x = c(lic.frg_chats_folder_settings__scroll_view);
    public final w28 y = c(lic.frg_chats_folder_settings__your_folders_title);
    public final w28 z = c(lic.frg_chats_folder_settings__iv_all_icon);

    static {
        Class<f46> cls = f46.class;
        v0 = new KProperty[]{wj6.p(cls, "rvFolders", "getRvFolders()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "rvSmartFolders", "getRvSmartFolders()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), wj6.p(cls, "tvSmartFolderTitle", "getTvSmartFolderTitle()Landroid/widget/TextView;", 0), wj6.p(cls, "scrollView", "getScrollView()Lru/ok/messages/settings/folders/view/LockableNestedScrollView;", 0), wj6.p(cls, "tvYourFoldersTitle", "getTvYourFoldersTitle()Landroid/widget/TextView;", 0), wj6.p(cls, "ivAll", "getIvAll()Landroid/widget/ImageView;", 0), wj6.p(cls, "tvAll", "getTvAll()Landroid/widget/TextView;", 0), wj6.p(cls, "tvAllSubtitle", "getTvAllSubtitle()Landroid/widget/TextView;", 0), wj6.p(cls, "clAllBackground", "getClAllBackground()Landroid/view/View;", 0)};
    }

    public final RecyclerView d() {
        return (RecyclerView) this.c.getValue(this, v0[0]);
    }

    public final RecyclerView e() {
        return (RecyclerView) this.o.getValue(this, v0[1]);
    }

    public final LockableNestedScrollView f() {
        return (LockableNestedScrollView) this.x.getValue(this, v0[4]);
    }
}
