package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: v1g  reason: default package */
public final class v1g extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public v1g(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        w1g w1g = new w1g();
        w1g.a = (VectorDrawable) this.a.newDrawable();
        return w1g;
    }

    public final Drawable newDrawable(Resources resources) {
        w1g w1g = new w1g();
        w1g.a = (VectorDrawable) this.a.newDrawable(resources);
        return w1g;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        w1g w1g = new w1g();
        w1g.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return w1g;
    }
}
