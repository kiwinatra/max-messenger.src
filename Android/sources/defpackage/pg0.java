package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: pg0  reason: default package */
public final class pg0 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;
    public final qg0 b;

    public pg0(Drawable.ConstantState constantState, qg0 qg0) {
        this.a = constantState;
        this.b = qg0;
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        qg0 qg0 = this.b;
        qg0.mutate();
        return qg0;
    }
}
