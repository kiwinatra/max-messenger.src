package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* renamed from: n8f  reason: default package */
public final class n8f extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public ValueAnimator a;
    public final /* synthetic */ TabLayout b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n8f(TabLayout tabLayout, Context context) {
        super(context);
        this.b = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i) {
        TabLayout tabLayout = this.b;
        if (tabLayout.g1 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i);
            v02 v02 = tabLayout.U0;
            Drawable drawable = tabLayout.A0;
            v02.getClass();
            RectF e = v02.e(tabLayout, childAt);
            drawable.setBounds((int) e.left, drawable.getBounds().top, (int) e.right, drawable.getBounds().bottom);
            tabLayout.a = i;
        }
    }

    public final void b(int i) {
        TabLayout tabLayout = this.b;
        Rect bounds = tabLayout.A0.getBounds();
        tabLayout.A0.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        TabLayout tabLayout = this.b;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.A0;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.A0.getBounds().bottom);
        } else {
            tabLayout.U0.n(tabLayout, view, view2, f, tabLayout.A0);
        }
        WeakHashMap weakHashMap = gag.a;
        postInvalidateOnAnimation();
    }

    public final void d(int i, int i2, boolean z) {
        TabLayout tabLayout = this.b;
        if (tabLayout.a != i) {
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.a = i;
            m8f m8f = new m8f(this, childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.a = valueAnimator;
                valueAnimator.setInterpolator(tabLayout.V0);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                valueAnimator.addUpdateListener(m8f);
                valueAnimator.start();
                return;
            }
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener(m8f);
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        TabLayout tabLayout = this.b;
        int height = tabLayout.A0.getBounds().height();
        if (height < 0) {
            height = tabLayout.A0.getIntrinsicHeight();
        }
        int i2 = tabLayout.N0;
        if (i2 == 0) {
            i = getHeight() - height;
            height = getHeight();
        } else if (i2 != 1) {
            i = 0;
            if (i2 != 2) {
                height = i2 != 3 ? 0 : getHeight();
            }
        } else {
            i = (getHeight() - height) / 2;
            height = (getHeight() + height) / 2;
        }
        if (tabLayout.A0.getBounds().width() > 0) {
            Rect bounds = tabLayout.A0.getBounds();
            tabLayout.A0.setBounds(bounds.left, i, bounds.right, height);
            tabLayout.A0.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        TabLayout tabLayout = this.b;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            if (tabLayout.a == -1) {
                tabLayout.a = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.a);
            return;
        }
        d(tabLayout.getSelectedTabPosition(), -1, false);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            TabLayout tabLayout = this.b;
            boolean z = true;
            if (tabLayout.L0 == 1 || tabLayout.O0 == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    if (i3 * childCount <= getMeasuredWidth() - (((int) ct.j(16, getContext())) * 2)) {
                        boolean z2 = false;
                        for (int i5 = 0; i5 < childCount; i5++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                            if (layoutParams.width != i3 || layoutParams.weight != c44.DEFAULT_ASPECT_RATIO) {
                                layoutParams.width = i3;
                                layoutParams.weight = c44.DEFAULT_ASPECT_RATIO;
                                z2 = true;
                            }
                        }
                        z = z2;
                    } else {
                        tabLayout.L0 = 0;
                        tabLayout.q(false);
                    }
                    if (z) {
                        super.onMeasure(i, i2);
                    }
                }
            }
        }
    }
}
