package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: y69  reason: default package */
public final class y69 extends fbf implements MenuItem {
    public final d3f v;
    public Method w;

    public y69(Context context, d3f d3f) {
        super(context);
        if (d3f != null) {
            this.v = d3f;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.v.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.v.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        c8 c = this.v.c();
        if (c instanceof v69) {
            return ((v69) c).c;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.v.getActionView();
        return actionView instanceof w69 ? (View) ((w69) actionView).a : actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.v.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.v.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.v.getContentDescription();
    }

    public final int getGroupId() {
        return this.v.getGroupId();
    }

    public final Drawable getIcon() {
        return this.v.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.v.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.v.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.v.getIntent();
    }

    public final int getItemId() {
        return this.v.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.v.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.v.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.v.getNumericShortcut();
    }

    public final int getOrder() {
        return this.v.getOrder();
    }

    public final SubMenu getSubMenu() {
        return this.v.getSubMenu();
    }

    public final CharSequence getTitle() {
        return this.v.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.v.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.v.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.v.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.v.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.v.isCheckable();
    }

    public final boolean isChecked() {
        return this.v.isChecked();
    }

    public final boolean isEnabled() {
        return this.v.isEnabled();
    }

    public final boolean isVisible() {
        return this.v.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        v69 v69 = new v69(this, (Context) this.b, actionProvider);
        if (actionProvider == null) {
            v69 = null;
        }
        this.v.b(v69);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new w69(view);
        }
        this.v.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.v.setAlphabeticShortcut(c);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.v.setCheckable(z);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.v.setChecked(z);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.v.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.v.setEnabled(z);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.v.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.v.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.v.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.v.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.v.setNumericShortcut(c);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.v.setOnActionExpandListener(onActionExpandListener != null ? new x69(0, this, onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.v.setOnMenuItemClickListener(onMenuItemClickListener != null ? new a3f(this, onMenuItemClickListener) : null);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.v.setShortcut(c, c2);
        return this;
    }

    public final void setShowAsAction(int i) {
        this.v.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.v.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.v.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.v.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.v.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        return this.v.setVisible(z);
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.v.setAlphabeticShortcut(c, i);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.v.setIcon(i);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.v.setNumericShortcut(c, i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.v.setShortcut(c, c2, i, i2);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.v.setTitle(i);
        return this;
    }

    public final MenuItem setActionView(int i) {
        d3f d3f = this.v;
        d3f.setActionView(i);
        View actionView = d3f.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            d3f.setActionView(new w69(actionView));
        }
        return this;
    }
}
