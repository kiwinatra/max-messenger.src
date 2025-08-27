package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import kotlin.io.ConstantsKt;

/* renamed from: u69  reason: default package */
public final class u69 implements d3f {
    public CharSequence A0;
    public ColorStateList B0 = null;
    public PorterDuff.Mode C0 = null;
    public boolean D0 = false;
    public boolean E0 = false;
    public boolean F0 = false;
    public int G0 = 16;
    public int H0;
    public View I0;
    public c8 J0;
    public MenuItem.OnActionExpandListener K0;
    public boolean L0 = false;
    public char X;
    public int Y = ConstantsKt.DEFAULT_BLOCK_SIZE;
    public Drawable Z;
    public final int a;
    public final int b;
    public final int c;
    public final int o;
    public CharSequence v;
    public int v0 = 0;
    public CharSequence w;
    public final m69 w0;
    public Intent x;
    public lye x0;
    public char y;
    public MenuItem.OnMenuItemClickListener y0;
    public int z = ConstantsKt.DEFAULT_BLOCK_SIZE;
    public CharSequence z0;

    public u69(m69 m69, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.w0 = m69;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.o = i4;
        this.v = charSequence;
        this.H0 = i5;
    }

    public static void a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final d3f b(c8 c8Var) {
        this.I0 = null;
        this.J0 = c8Var;
        this.w0.p(true);
        c8 c8Var2 = this.J0;
        if (c8Var2 != null) {
            c8Var2.h(new b8d((Object) this));
        }
        return this;
    }

    public final c8 c() {
        return this.J0;
    }

    public final boolean collapseActionView() {
        if ((this.H0 & 8) == 0) {
            return false;
        }
        if (this.I0 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.K0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.w0.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.F0 && (this.D0 || this.E0)) {
            drawable = drawable.mutate();
            if (this.D0) {
                ru4.h(drawable, this.B0);
            }
            if (this.E0) {
                ru4.i(drawable, this.C0);
            }
            this.F0 = false;
        }
        return drawable;
    }

    public final boolean e() {
        c8 c8Var;
        if ((this.H0 & 8) == 0) {
            return false;
        }
        if (this.I0 == null && (c8Var = this.J0) != null) {
            this.I0 = c8Var.d(this);
        }
        return this.I0 != null;
    }

    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.K0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.w0.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.G0 & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.G0 |= 32;
        } else {
            this.G0 &= -33;
        }
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.I0;
        if (view != null) {
            return view;
        }
        c8 c8Var = this.J0;
        if (c8Var == null) {
            return null;
        }
        View d = c8Var.d(this);
        this.I0 = d;
        return d;
    }

    public final int getAlphabeticModifiers() {
        return this.Y;
    }

    public final char getAlphabeticShortcut() {
        return this.X;
    }

    public final CharSequence getContentDescription() {
        return this.z0;
    }

    public final int getGroupId() {
        return this.b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.Z;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.v0;
        if (i == 0) {
            return null;
        }
        Drawable D = iq.D(this.w0.a, i);
        this.v0 = 0;
        this.Z = D;
        return d(D);
    }

    public final ColorStateList getIconTintList() {
        return this.B0;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.C0;
    }

    public final Intent getIntent() {
        return this.x;
    }

    public final int getItemId() {
        return this.a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.z;
    }

    public final char getNumericShortcut() {
        return this.y;
    }

    public final int getOrder() {
        return this.c;
    }

    public final SubMenu getSubMenu() {
        return this.x0;
    }

    public final CharSequence getTitle() {
        return this.v;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.w;
        return charSequence != null ? charSequence : this.v;
    }

    public final CharSequence getTooltipText() {
        return this.A0;
    }

    public final boolean hasSubMenu() {
        return this.x0 != null;
    }

    public final boolean isActionViewExpanded() {
        return this.L0;
    }

    public final boolean isCheckable() {
        return (this.G0 & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.G0 & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.G0 & 16) != 0;
    }

    public final boolean isVisible() {
        c8 c8Var = this.J0;
        return (c8Var == null || !c8Var.g()) ? (this.G0 & 8) == 0 : (this.G0 & 8) == 0 && this.J0.b();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(View view) {
        int i;
        this.I0 = view;
        this.J0 = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        m69 m69 = this.w0;
        m69.Y = true;
        m69.p(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.X == c2) {
            return this;
        }
        this.X = Character.toLowerCase(c2);
        this.w0.p(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z2) {
        int i = this.G0;
        boolean z3 = z2 | (i & true);
        this.G0 = z3 ? 1 : 0;
        if (i != z3) {
            this.w0.p(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z2) {
        int i = this.G0;
        int i2 = 2;
        if ((i & 4) != 0) {
            m69 m69 = this.w0;
            m69.getClass();
            ArrayList arrayList = m69.w;
            int size = arrayList.size();
            m69.w();
            for (int i3 = 0; i3 < size; i3++) {
                u69 u69 = (u69) arrayList.get(i3);
                if (u69.b == this.b && (u69.G0 & 4) != 0 && u69.isCheckable()) {
                    boolean z3 = u69 == this;
                    int i4 = u69.G0;
                    int i5 = (z3 ? 2 : 0) | (i4 & -3);
                    u69.G0 = i5;
                    if (i4 != i5) {
                        u69.w0.p(false);
                    }
                }
            }
            m69.v();
        } else {
            int i6 = i & -3;
            if (!z2) {
                i2 = 0;
            }
            int i7 = i6 | i2;
            this.G0 = i7;
            if (i != i7) {
                this.w0.p(false);
            }
        }
        return this;
    }

    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.G0 |= 16;
        } else {
            this.G0 &= -17;
        }
        this.w0.p(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.v0 = 0;
        this.Z = drawable;
        this.F0 = true;
        this.w0.p(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.B0 = colorStateList;
        this.D0 = true;
        this.F0 = true;
        this.w0.p(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.C0 = mode;
        this.E0 = true;
        this.F0 = true;
        this.w0.p(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.x = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        if (this.y == c2) {
            return this;
        }
        this.y = c2;
        this.w0.p(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.K0 = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.y0 = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.y = c2;
        this.X = Character.toLowerCase(c3);
        this.w0.p(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.H0 = i;
            m69 m69 = this.w0;
            m69.Y = true;
            m69.p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.v = charSequence;
        this.w0.p(false);
        lye lye = this.x0;
        if (lye != null) {
            lye.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.w = charSequence;
        this.w0.p(false);
        return this;
    }

    public final MenuItem setVisible(boolean z2) {
        int i = this.G0;
        int i2 = (z2 ? 0 : 8) | (i & -9);
        this.G0 = i2;
        if (i != i2) {
            m69 m69 = this.w0;
            m69.y = true;
            m69.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.v;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final d3f setContentDescription(CharSequence charSequence) {
        this.z0 = charSequence;
        this.w0.p(false);
        return this;
    }

    public final d3f setTooltipText(CharSequence charSequence) {
        this.A0 = charSequence;
        this.w0.p(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.X == c2 && this.Y == i) {
            return this;
        }
        this.X = Character.toLowerCase(c2);
        this.Y = KeyEvent.normalizeMetaState(i);
        this.w0.p(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.y == c2 && this.z == i) {
            return this;
        }
        this.y = c2;
        this.z = KeyEvent.normalizeMetaState(i);
        this.w0.p(false);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.y = c2;
        this.z = KeyEvent.normalizeMetaState(i);
        this.X = Character.toLowerCase(c3);
        this.Y = KeyEvent.normalizeMetaState(i2);
        this.w0.p(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.Z = null;
        this.v0 = i;
        this.F0 = true;
        this.w0.p(false);
        return this;
    }

    public final MenuItem setTitle(int i) {
        setTitle((CharSequence) this.w0.a.getString(i));
        return this;
    }

    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.w0.a;
        View inflate = LayoutInflater.from(context).inflate(i, new LinearLayout(context), false);
        this.I0 = inflate;
        this.J0 = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.a) > 0) {
            inflate.setId(i2);
        }
        m69 m69 = this.w0;
        m69.Y = true;
        m69.p(true);
        return this;
    }
}
