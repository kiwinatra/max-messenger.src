package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: ie0  reason: default package */
public abstract class ie0 extends View {
    public static int w0 = Math.round(Resources.getSystem().getDisplayMetrics().density * 40.0f);
    public static volatile r6 x0 = null;
    public mv4 a;
    public Drawable b;
    public yd0 c;
    public yva o;
    public r62 v;
    public boolean v0;
    public ce0 w;
    public a33 x;
    public ptb y;
    public boolean z;

    public final void a(a32 a32, boolean z2) {
        if (a32.N()) {
            vk3 m = a32.m();
            if (m != null) {
                b(m, z2);
                return;
            }
            a32.m0();
            if (!cvg.A(a32.v0)) {
                a32.m0();
                g((String) null, a32.v0, (Long) null, 0, -1, -1);
                return;
            }
            return;
        }
        this.z = false;
        yd0 yd0 = new yd0(this.o, this.v, this.w, a32);
        this.c = yd0;
        e(yd0);
        f(this.a, this.c.b(this.x.p(), false), (Uri) null, -1, -1);
    }

    public final void b(vk3 vk3, boolean z2) {
        c(vk3, z2, false, (String) null, false);
    }

    public final void c(vk3 vk3, boolean z2, boolean z3, String str, boolean z4) {
        this.z = z2;
        this.b = i(this.y.b(vk3.r()).a, z3);
        yd0 yd0 = new yd0(this.o, this.v, this.w, vk3);
        this.c = yd0;
        e(yd0);
        boolean A = cvg.A(str);
        a33 a33 = this.x;
        f(this.a, this.c.b(a33.p(), z4), !A ? o5a.x(str) : z4 ? this.c.b(a33.p(), false) : null, -1, -1);
    }

    public final void d(qdb qdb) {
        this.z = false;
        yd0 yd0 = new yd0(this.o, this.v, this.w, qdb);
        this.c = yd0;
        e(yd0);
        f(this.a, this.c.b(this.x.p(), false), (Uri) null, -1, -1);
    }

    public final void e(yd0 yd0) {
        mv4 mv4 = this.a;
        if (mv4 != null) {
            lv4 lv4 = mv4.o;
            lv4.getClass();
            ((sp6) lv4).i(yd0.c(getContext()), 1);
        }
    }

    public final void f(mv4 mv4, Uri uri, Uri uri2, int i, int i2) {
        qa7 qa7;
        qa7 qa72;
        oa7 oa7 = oa7.a;
        if (uri == null || cvg.A(uri.getPath())) {
            qa7 = null;
        } else {
            ra7 d = ra7.d(uri);
            d.g = oa7;
            d.l = getPostprocessor();
            if (i2 > 0 && i > 0 && x0 != null) {
                d.d = (v3d) x0.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            }
            qa7 = d.a();
            ld9.B().f(qa7, (f0) null);
        }
        if (uri2 == null || cvg.A(uri2.getPath())) {
            qa72 = null;
        } else {
            ra7 d2 = ra7.d(uri2);
            d2.l = getPostprocessor();
            d2.g = oa7;
            qa72 = d2.a();
            ld9.B().f(qa72, (f0) null);
        }
        knb a2 = ld9.p.get();
        a2.l = mv4.v;
        a2.k = true;
        if (qa7 != null) {
            a2.e = qa7;
        }
        if (qa72 != null) {
            a2.f = qa72;
        }
        if (qa7 == null && qa72 == null) {
            mv4.i((gv4) null);
        } else {
            mv4.i(a2.a());
        }
    }

    public final void g(String str, CharSequence charSequence, Long l, int i, int i2, int i3) {
        this.c = new yd0(this.o, this.v, this.w, charSequence, l);
        this.z = i != 0;
        this.b = i(i, false);
        e(this.c);
        f(this.a, o5a.x(str), o5a.x((String) null), i2, i3);
    }

    public mv4 getDraweeHolder() {
        return this.a;
    }

    public Drawable getForegroundCompat() {
        return getForeground();
    }

    public bsb getPostprocessor() {
        return new o6b();
    }

    public final void h(Canvas canvas) {
        if (this.z && this.b != null) {
            int width = (int) ((((float) getWidth()) / 2.0f) - (getContext().getResources().getDisplayMetrics().density * 0.5f));
            double d = (double) width;
            canvas.save();
            canvas.translate(((float) (((int) (-0.6946583704589973d * d)) + width)) - (((float) this.b.getIntrinsicWidth()) / 2.0f), ((float) (width + (-((int) (d * -0.7193398003386512d))))) - (((float) this.b.getIntrinsicHeight()) / 2.0f));
            Drawable drawable = this.b;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.b.getIntrinsicHeight());
            this.b.draw(canvas);
            canvas.restore();
        }
    }

    public final Drawable i(int i, boolean z2) {
        int i2;
        if (i == 10 || i == 20 || i == 40) {
            i2 = z2 ? nad.k2 : ((TamAvatarView) this).v0 ? nad.l2 : nad.j2;
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            return null;
        }
        Drawable b2 = ew3.b(getContext(), i2);
        if (i == 40) {
            j(b2);
        }
        return b2;
    }

    public abstract void j(Drawable drawable);

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mv4 mv4 = this.a;
        if (mv4 != null) {
            mv4.g();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mv4 mv4 = this.a;
        if (mv4 != null) {
            mv4.h();
        }
    }

    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        z7d e = this.a.e();
        try {
            e.setBounds(0, 0, width, height);
            e.draw(canvas);
        } catch (Throwable th) {
            z68.f("ie0", "failure to onDraw", th);
        }
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
            canvas.restore();
        }
    }

    public final void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        h(canvas);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        mv4 mv4 = this.a;
        if (mv4 != null) {
            mv4.g();
        }
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        mv4 mv4 = this.a;
        if (mv4 != null) {
            mv4.h();
        }
    }

    public void setForegroundCompat(Drawable drawable) {
        setForeground(drawable);
    }

    public void setSmallOnlineImage(boolean z2) {
        this.v0 = z2;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        mv4 mv4 = this.a;
        if (mv4 == null || mv4.e() != drawable) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }
}
