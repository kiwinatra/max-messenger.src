package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;

/* renamed from: ah8  reason: default package */
public class ah8 extends Drawable.ConstantState {
    public j4e a;
    public x05 b;
    public ColorStateList c = null;
    public ColorStateList d = null;
    public final ColorStateList e = null;
    public ColorStateList f = null;
    public PorterDuff.Mode g = PorterDuff.Mode.SRC_IN;
    public Rect h = null;
    public final float i = 1.0f;
    public float j = 1.0f;
    public float k;
    public int l = KotlinVersion.MAX_COMPONENT_VALUE;
    public float m = c44.DEFAULT_ASPECT_RATIO;
    public float n = c44.DEFAULT_ASPECT_RATIO;
    public final float o = c44.DEFAULT_ASPECT_RATIO;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public final int s = 0;
    public final boolean t = false;
    public final Paint.Style u = Paint.Style.FILL_AND_STROKE;

    public ah8(j4e j4e) {
        this.a = j4e;
        this.b = null;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        bh8 bh8 = new bh8(this);
        bh8.v = true;
        return bh8;
    }

    public ah8(ah8 ah8) {
        this.a = ah8.a;
        this.b = ah8.b;
        this.k = ah8.k;
        this.c = ah8.c;
        this.d = ah8.d;
        this.g = ah8.g;
        this.f = ah8.f;
        this.l = ah8.l;
        this.i = ah8.i;
        this.r = ah8.r;
        this.p = ah8.p;
        this.t = ah8.t;
        this.j = ah8.j;
        this.m = ah8.m;
        this.n = ah8.n;
        this.o = ah8.o;
        this.q = ah8.q;
        this.s = ah8.s;
        this.e = ah8.e;
        this.u = ah8.u;
        if (ah8.h != null) {
            this.h = new Rect(ah8.h);
        }
    }
}
