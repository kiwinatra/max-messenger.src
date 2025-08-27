package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: zf  reason: default package */
public final class zf extends Drawable.ConstantState {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ zf(Drawable drawable, int i) {
        this.a = i;
        this.b = drawable;
    }

    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    public final Drawable newDrawable() {
        switch (this.a) {
            case 0:
                ag agVar = new ag((Context) null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable();
                agVar.a = newDrawable;
                newDrawable.setCallback(agVar.w);
                return agVar;
            case 1:
                return (jq0) this.b;
            default:
                EnhancedVectorDrawable enhancedVectorDrawable = (EnhancedVectorDrawable) this.b;
                return new EnhancedVectorDrawable(enhancedVectorDrawable.resources, enhancedVectorDrawable.resId);
        }
    }

    public zf(Drawable.ConstantState constantState) {
        this.a = 0;
        this.b = constantState;
    }

    public Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                ag agVar = new ag((Context) null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                agVar.a = newDrawable;
                newDrawable.setCallback(agVar.w);
                return agVar;
            case 2:
                return resources != null ? new EnhancedVectorDrawable(resources, ((EnhancedVectorDrawable) this.b).resId) : newDrawable();
            default:
                return super.newDrawable(resources);
        }
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                ag agVar = new ag((Context) null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                agVar.a = newDrawable;
                newDrawable.setCallback(agVar.w);
                return agVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
