package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: ov4  reason: default package */
public abstract class ov4 extends ImageView {
    public static boolean x = false;
    public final ft a = new ft(0);
    public float b = c44.DEFAULT_ASPECT_RATIO;
    public mv4 c;
    public boolean o = false;
    public boolean v = false;
    public Object w = null;

    public ov4(Context context) {
        super(context);
        g(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        x = z;
    }

    public final void g(Context context) {
        try {
            tf6.P();
            if (this.o) {
                tf6.P();
                return;
            }
            boolean z = true;
            this.o = true;
            this.c = new mv4((sp6) null);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                tf6.P();
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!x || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.v = z;
            tf6.P();
        } catch (Throwable th) {
            tf6.P();
            throw th;
        }
    }

    public float getAspectRatio() {
        return this.b;
    }

    public gv4 getController() {
        return this.c.v;
    }

    public Object getExtraData() {
        return this.w;
    }

    public lv4 getHierarchy() {
        lv4 lv4 = this.c.o;
        lv4.getClass();
        return lv4;
    }

    public Drawable getTopLevelDrawable() {
        return this.c.e();
    }

    public void h() {
        invalidate();
    }

    public final void i() {
        Drawable drawable;
        if (this.v && (drawable = getDrawable()) != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
        this.c.g();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
        this.c.h();
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        i();
        this.c.g();
    }

    public void onMeasure(int i, int i2) {
        ft ftVar = this.a;
        ftVar.b = i;
        ftVar.c = i2;
        float f = this.b;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (f > c44.DEFAULT_ASPECT_RATIO && layoutParams != null) {
            int i3 = layoutParams.height;
            if (i3 == 0 || i3 == -2) {
                ftVar.c = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(ftVar.b) - paddingRight)) / f) + ((float) paddingBottom)), ftVar.c), 1073741824);
            } else {
                int i4 = layoutParams.width;
                if (i4 == 0 || i4 == -2) {
                    ftVar.b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(ftVar.c) - paddingBottom)) * f) + ((float) paddingRight)), ftVar.b), 1073741824);
                }
            }
        }
        super.onMeasure(ftVar.b, ftVar.c);
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        i();
        this.c.h();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        aq6 aq6;
        mv4 mv4 = this.c;
        if (mv4.f()) {
            m0 m0Var = (m0) mv4.v;
            m0Var.getClass();
            boolean a2 = bg5.a.a(2);
            Class cls = m0.x;
            if (a2) {
                bg5.h(cls, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(m0Var)), m0Var.j, motionEvent);
            }
            bq6 bq6 = m0Var.e;
            if (bq6 != null && (bq6.c || m0Var.q())) {
                bq6 bq62 = m0Var.e;
                bq62.getClass();
                int action = motionEvent.getAction();
                if (action != 0) {
                    float f = bq62.b;
                    if (action == 1) {
                        bq62.c = false;
                        if (Math.abs(motionEvent.getX() - bq62.f) > f || Math.abs(motionEvent.getY() - bq62.g) > f) {
                            bq62.d = false;
                        }
                        if (bq62.d && motionEvent.getEventTime() - bq62.e <= ((long) ViewConfiguration.getLongPressTimeout()) && (aq6 = bq62.a) != null) {
                            m0 m0Var2 = (m0) aq6;
                            if (bg5.a.a(2)) {
                                bg5.g(cls, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(m0Var2)), m0Var2.j);
                            }
                            if (m0Var2.q()) {
                                m0Var2.d.c++;
                                sp6 sp6 = m0Var2.h;
                                sp6.f.o(sp6.a);
                                sp6.g();
                                m0Var2.r();
                            }
                        }
                        bq62.d = false;
                    } else if (action != 2) {
                        if (action == 3) {
                            bq62.c = false;
                            bq62.d = false;
                        }
                    } else if (Math.abs(motionEvent.getX() - bq62.f) > f || Math.abs(motionEvent.getY() - bq62.g) > f) {
                        bq62.d = false;
                    }
                } else {
                    bq62.c = true;
                    bq62.d = true;
                    bq62.e = motionEvent.getEventTime();
                    bq62.f = motionEvent.getX();
                    bq62.g = motionEvent.getY();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        i();
    }

    public void setAspectRatio(float f) {
        if (f != this.b) {
            this.b = f;
            requestLayout();
        }
    }

    public void setController(gv4 gv4) {
        this.c.i(gv4);
        super.setImageDrawable(this.c.e());
    }

    public void setExtraData(Object obj) {
        this.w = obj;
    }

    public void setHierarchy(lv4 lv4) {
        this.c.j(lv4);
        super.setImageDrawable(this.c.e());
    }

    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        g(getContext());
        this.c.i((gv4) null);
        super.setImageBitmap(bitmap);
    }

    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        g(getContext());
        this.c.i((gv4) null);
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setImageResource(int i) {
        g(getContext());
        this.c.i((gv4) null);
        super.setImageResource(i);
    }

    @Deprecated
    public void setImageURI(Uri uri) {
        g(getContext());
        this.c.i((gv4) null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.v = z;
    }

    public final String toString() {
        w28 K = hsg.K(this);
        mv4 mv4 = this.c;
        K.x(mv4 != null ? mv4.toString() : "<no holder set>", "holder");
        return K.toString();
    }

    public ov4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(context);
    }

    public ov4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g(context);
    }
}
