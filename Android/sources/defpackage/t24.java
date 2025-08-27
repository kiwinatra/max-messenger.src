package defpackage;

import androidx.appcompat.widget.AppCompatEditText;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: t24  reason: default package */
public final class t24 extends qf5 {
    public static final /* synthetic */ KProperty[] Z;
    public final w28 X = c(lic.frg_channel_create__progress_bar);
    public final w28 Y = c(lic.frg_channel_create__btn_done);
    public final w28 c = c(lic.root);
    public final w28 o = c(lic.toolbar);
    public final w28 v = c(lic.frg_channel_create__sd_avatar);
    public final w28 w = c(lic.frg_channel_create__ed_name);
    public final w28 x = c(lic.frg_channel_create__iv_name_clear);
    public final w28 y = c(lic.frg_channel_create__ed_description);
    public final w28 z = c(lic.frg_channel_create__tv_description_counter);

    static {
        Class<t24> cls = t24.class;
        Z = new KProperty[]{wj6.p(cls, "root", "getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), wj6.p(cls, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), wj6.p(cls, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), wj6.p(cls, "nameEditText", "getNameEditText()Landroidx/appcompat/widget/AppCompatEditText;", 0), wj6.p(cls, "nameClear", "getNameClear()Landroid/widget/ImageView;", 0), wj6.p(cls, "descriptionEditText", "getDescriptionEditText()Landroidx/appcompat/widget/AppCompatEditText;", 0), wj6.p(cls, "descriptionCounter", "getDescriptionCounter()Landroidx/appcompat/widget/AppCompatTextView;", 0), wj6.p(cls, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0), wj6.p(cls, "doneButton", "getDoneButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public final OneMeAvatarView d() {
        return (OneMeAvatarView) this.v.getValue(this, Z[2]);
    }

    public final AppCompatEditText e() {
        return (AppCompatEditText) this.y.getValue(this, Z[5]);
    }

    public final OneMeButton f() {
        return (OneMeButton) this.Y.getValue(this, Z[8]);
    }

    public final AppCompatEditText g() {
        return (AppCompatEditText) this.w.getValue(this, Z[3]);
    }
}
