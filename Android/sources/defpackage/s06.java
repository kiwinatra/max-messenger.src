package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.stickers.panel.RelativePanelLayout;

/* renamed from: s06  reason: default package */
public final class s06 extends qf5 {
    public static final /* synthetic */ KProperty[] Z;
    public final w28 X = c(lic.fragment_folder_filters__root);
    public b33 Y;
    public final w28 c = c(lic.fragment_folder_filters__toolbar);
    public final w28 o = c(lic.fragment_folder_filters__general_filters);
    public final w28 v = c(lic.fragment_folder_filters__management_filters_title);
    public final w28 w = c(lic.fragment_folder_filters__management_filters);
    public final w28 x = c(lic.fragment_folder_filters__notification_and_read_filters_title);
    public final w28 y = c(lic.fragment_folder_filters__notification_and_read_filters);
    public final w28 z = c(lic.fragment_folder_filters__save_button);

    static {
        Class<s06> cls = s06.class;
        Z = new KProperty[]{wj6.p(cls, "scrollView", "getScrollView()Landroidx/core/widget/NestedScrollView;", 0), wj6.p(cls, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), wj6.p(cls, "generalFilters", "getGeneralFilters()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "managementFiltersTitle", "getManagementFiltersTitle()Landroidx/appcompat/widget/AppCompatTextView;", 0), wj6.p(cls, "managementFilters", "getManagementFilters()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "notificationFiltersTitle", "getNotificationFiltersTitle()Landroidx/appcompat/widget/AppCompatTextView;", 0), wj6.p(cls, "notificationFilters", "getNotificationFilters()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "saveButton", "getSaveButton()Lru/ok/utils/widgets/LongRoundedTitleSubtitleButton;", 0), wj6.p(cls, "root", "getRoot()Lru/ok/tamtam/stickers/panel/RelativePanelLayout;", 0)};
    }

    public final void L0(scf scf) {
        super.L0(scf);
        KProperty[] kPropertyArr = Z;
        ((RelativePanelLayout) this.X.getValue(this, kPropertyArr[8])).setBackgroundColor(scf.n);
        b33 b33 = this.Y;
        if (b33 != null) {
            b33.a(scf);
        }
        AppCompatTextView d = d();
        int i = scf.G;
        d.setTextColor(i);
        ((AppCompatTextView) this.x.getValue(this, kPropertyArr[5])).setTextColor(i);
    }

    public final AppCompatTextView d() {
        return (AppCompatTextView) this.v.getValue(this, Z[3]);
    }
}
