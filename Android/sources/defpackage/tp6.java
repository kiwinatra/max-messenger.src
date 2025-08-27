package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.List;
import org.apache.http.HttpStatus;

/* renamed from: tp6  reason: default package */
public final class tp6 {
    public static final ydd q = ydd.n;
    public static final ydd r = ydd.m;
    public final Resources a;
    public int b = HttpStatus.SC_MULTIPLE_CHOICES;
    public float c = c44.DEFAULT_ASPECT_RATIO;
    public Drawable d = null;
    public xdd e;
    public Drawable f;
    public xdd g;
    public Drawable h;
    public xdd i;
    public Drawable j;
    public xdd k;
    public xdd l;
    public Drawable m;
    public List n;
    public StateListDrawable o;
    public b9d p;

    public tp6(Resources resources) {
        this.a = resources;
        ydd ydd = q;
        this.e = ydd;
        this.f = null;
        this.g = ydd;
        this.h = null;
        this.i = ydd;
        this.j = null;
        this.k = ydd;
        this.l = r;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public final sp6 a() {
        List<Drawable> list = this.n;
        if (list != null) {
            for (Drawable drawable : list) {
                drawable.getClass();
            }
        }
        return new sp6(this);
    }
}
