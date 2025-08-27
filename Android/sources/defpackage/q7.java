package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import kotlin.io.ConstantsKt;

/* renamed from: q7  reason: default package */
public final class q7 implements d3f {
    public CharSequence X;
    public CharSequence Y;
    public ColorStateList Z = null;
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char o;
    public int v = ConstantsKt.DEFAULT_BLOCK_SIZE;
    public PorterDuff.Mode v0 = null;
    public char w;
    public boolean w0 = false;
    public int x = ConstantsKt.DEFAULT_BLOCK_SIZE;
    public boolean x0 = false;
    public Drawable y;
    public int y0 = 16;
    public final Context z;

    public q7(Context context, CharSequence charSequence) {
        this.z = context;
        this.a = charSequence;
    }

    public final void a() {
        Drawable drawable = this.y;
        if (drawable == null) {
            return;
        }
        if (this.w0 || this.x0) {
            this.y = drawable;
            Drawable mutate = drawable.mutate();
            this.y = mutate;
            if (this.w0) {
                ru4.h(mutate, this.Z);
            }
            if (this.x0) {
                ru4.i(this.y, this.v0);
            }
        }
    }

    public final d3f b(c8 c8Var) {
        throw new UnsupportedOperationException();
    }

    public final c8 c() {
        return null;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.x;
    }

    public final char getAlphabeticShortcut() {
        return this.w;
    }

    public final CharSequence getContentDescription() {
        return this.X;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.y;
    }

    public final ColorStateList getIconTintList() {
        return this.Z;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.v0;
    }

    public final Intent getIntent() {
        return this.c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.v;
    }

    public final char getNumericShortcut() {
        return this.o;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : this.a;
    }

    public final CharSequence getTooltipText() {
        return this.Y;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.y0 & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.y0 & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.y0 & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.y0 & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.w = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setCheckable(boolean z2) {
        this.y0 = z2 | (this.y0 & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z2) {
        this.y0 = (z2 ? 2 : 0) | (this.y0 & -3);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final d3f m1530setContentDescription(CharSequence charSequence) {
        this.X = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z2) {
        this.y0 = (z2 ? 16 : 0) | (this.y0 & -17);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.y = drawable;
        a();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.Z = colorStateList;
        this.w0 = true;
        a();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.v0 = mode;
        this.x0 = true;
        a();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.o = c2;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.o = c2;
        this.w = Character.toLowerCase(c3);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final d3f m1531setTooltipText(CharSequence charSequence) {
        this.Y = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z2) {
        int i = 8;
        int i2 = this.y0 & 8;
        if (z2) {
            i = 0;
        }
        this.y0 = i2 | i;
        return this;
    }

    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.w = Character.toLowerCase(c2);
        this.x = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.X = charSequence;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i) {
        this.o = c2;
        this.v = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.a = this.z.getResources().getString(i);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.Y = charSequence;
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.y = ew3.b(this.z, i);
        a();
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.o = c2;
        this.v = KeyEvent.normalizeMetaState(i);
        this.w = Character.toLowerCase(c3);
        this.x = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
