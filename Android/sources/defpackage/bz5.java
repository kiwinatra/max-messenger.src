package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.reflect.KProperty;

/* renamed from: bz5  reason: default package */
public final class bz5 extends qf5 {
    public static final /* synthetic */ KProperty[] w0;
    public final w28 X = c(lic.frg_chats_folder_create__title);
    public final w28 Y = c(lic.frg_chats_folder_create__back);
    public Drawable Z;
    public final w28 c = c(lic.frg_chats_folder_create__name_input);
    public final w28 o = c(lic.frg_chats_folder_create__name_input_layout);
    public final w28 v = c(lic.frg_chats_folder_create__save_button);
    public Drawable v0;
    public final w28 w = c(lic.frg_chats_folder_create__description);
    public final w28 x = c(lic.frg_chats_folder_create__avatar);
    public final w28 y = c(lic.frg_chats_folder_create__content);
    public final w28 z = c(lic.frg_chats_folder_create__remove_avatar);

    static {
        Class<bz5> cls = bz5.class;
        w0 = new KProperty[]{wj6.p(cls, "nameInput", "getNameInput()Landroid/widget/EditText;", 0), wj6.p(cls, "nameInputLayout", "getNameInputLayout()Lcom/google/android/material/textfield/TextInputLayout;", 0), wj6.p(cls, "saveButton", "getSaveButton()Landroid/widget/Button;", 0), wj6.p(cls, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0), wj6.p(cls, "avatarView", "getAvatarView()Landroid/widget/ImageView;", 0), wj6.p(cls, "contentContainer", "getContentContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), wj6.p(cls, "removeAvatarButton", "getRemoveAvatarButton()Landroid/widget/ImageButton;", 0), wj6.p(cls, "title", "getTitle()Landroid/widget/TextView;", 0), wj6.p(cls, "backButton", "getBackButton()Landroid/widget/ImageButton;", 0)};
    }

    public final void b() {
        this.Z = null;
    }

    public final ImageView d() {
        return (ImageView) this.x.getValue(this, w0[4]);
    }

    public final ConstraintLayout e() {
        return (ConstraintLayout) this.y.getValue(this, w0[5]);
    }

    public final EditText f() {
        return (EditText) this.c.getValue(this, w0[0]);
    }

    public final TextInputLayout g() {
        return (TextInputLayout) this.o.getValue(this, w0[1]);
    }

    public final ImageButton h() {
        return (ImageButton) this.z.getValue(this, w0[6]);
    }

    public final Button i() {
        return (Button) this.v.getValue(this, w0[2]);
    }

    public final TextView j() {
        return (TextView) this.X.getValue(this, w0[7]);
    }
}
