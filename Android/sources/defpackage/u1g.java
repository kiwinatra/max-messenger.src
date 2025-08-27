package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: u1g  reason: default package */
public final class u1g extends Drawable.ConstantState {
    public int a;
    public t1g b;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    public int getChangingConfigurations() {
        return this.a;
    }

    public final Drawable newDrawable() {
        return new w1g(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new w1g(this);
    }
}
