package defpackage;

import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.reflect.KProperty;

/* renamed from: b76  reason: default package */
public final class b76 extends qf5 {
    public static final /* synthetic */ KProperty[] x0;
    public final w28 X = c(lic.fragment_folders__selected_container);
    public final w28 Y = c(lic.fragment_folders__not_created_view);
    public final w28 Z = c(lic.fragment_folders__not_created_text);
    public final w28 c = c(lic.fragment_folders__toolbar);
    public final w28 o = c(lic.fragment_folders__folders_view);
    public final w28 v = c(lic.fragment_folders__selected_folders_view);
    public final w28 v0 = c(lic.fragment_folders__not_created_button);
    public final w28 w = c(lic.fragment_folders__done_button);
    public final w28 w0 = c(lic.fragment_folders__remove_all_submit);
    public final w28 x = c(lic.fragment_folders__done_button_container);
    public final w28 y = c(lic.fragment_folders__selected_count_badge);
    public final w28 z = c(lic.fragment_folders__count_container);

    static {
        Class<b76> cls = b76.class;
        x0 = new KProperty[]{wj6.p(cls, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), wj6.p(cls, "foldersView", "getFoldersView()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "selectedFoldersView", "getSelectedFoldersView()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "doneButton", "getDoneButton()Landroid/widget/ImageView;", 0), wj6.p(cls, "doneButtonContainer", "getDoneButtonContainer()Landroid/widget/FrameLayout;", 0), wj6.p(cls, "selectedBadgeView", "getSelectedBadgeView()Lru/ok/utils/widgets/BadgeCountView;", 0), wj6.p(cls, "countContainer", "getCountContainer()Landroid/widget/FrameLayout;", 0), wj6.p(cls, "selectedContainer", "getSelectedContainer()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "notCreatedContainerView", "getNotCreatedContainerView()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "notCreatedText", "getNotCreatedText()Landroid/widget/TextView;", 0), wj6.p(cls, "notCreatedButton", "getNotCreatedButton()Landroid/widget/TextView;", 0), wj6.p(cls, "removeAllSubmitButton", "getRemoveAllSubmitButton()Landroid/widget/Button;", 0)};
    }

    public final RecyclerView d() {
        return (RecyclerView) this.o.getValue(this, x0[1]);
    }

    public final Button e() {
        return (Button) this.w0.getValue(this, x0[11]);
    }

    public final RecyclerView f() {
        return (RecyclerView) this.v.getValue(this, x0[2]);
    }
}
