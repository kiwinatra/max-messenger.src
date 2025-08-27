package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.gridlayout.widget.GridLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import ru.ok.messages.actions.ExtraActionsView;
import ru.ok.messages.gallery.view.CameraContainerView;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.messages.views.widgets.quickcamera.QuickCameraView;
import ru.ok.tamtam.util.HandledException;

/* renamed from: ok8  reason: default package */
public final class ok8 extends nrb implements fk8, q1a, mbc, bif {
    public final View A0;
    public final View B0;
    public final View C0;
    public final View D0;
    public final View E0;
    public List F0;
    public final ViewGroup G0;
    public final ViewGroup H0 = ((ViewGroup) findViewById(lic.media_bar_view__fl_root));
    public final ViewGroup I0;
    public final MediaBarPreviewLayout J0;
    public final View K0;
    public final Toolbar L0;
    public final View M0;
    public final int N0;
    public final ExtraActionsView O0;
    public final CameraContainerView P0;
    public final RecyclerView Q0;
    public final View R0 = findViewById(lic.content);
    public final pk4 S0;
    public final v1a T0;
    public final bud U0;
    public boolean v0;
    public lk8 w0;
    public final vuf x;
    public final b4a x0;
    public final ro4 y;
    public final View y0;
    public final boolean z;
    public final View z0;

    /* JADX WARNING: type inference failed for: r3v19, types: [pk4, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ok8(Context context, wj8 wj8, dm4 dm4, vuf vuf, bud bud, ln5 ln5, ggd ggd) {
        super(context, (AttributeSet) null);
        wj8 wj82 = wj8;
        this.z = wj82.a;
        this.x = vuf;
        this.U0 = bud;
        ch d = ((qra) ym.e()).d();
        getContext();
        ro4 b = ro4.b();
        this.y = b;
        setBackground(new ColorDrawable(fw3.a(getContext(), lad.e)));
        View.inflate(getContext(), ujc.media_bar_view, this);
        View findViewById = findViewById(lic.stub_status_bar);
        this.K0 = findViewById;
        findViewById.setLayoutParams(new RelativeLayout.LayoutParams(-1, ((qra) ym.e()).n().m()));
        findViewById.setVisibility(0);
        Toolbar toolbar = (Toolbar) findViewById(lic.albums_selection_toolbar);
        this.L0 = toolbar;
        if (toolbar != null) {
            WeakHashMap weakHashMap = gag.a;
            v9g.s(toolbar, (float) b.a);
            this.L0.setNavigationIcon(nad.X);
            this.L0.setNavigationOnClickListener(new xu3(25, (Object) this));
            this.L0.setAlpha(c44.DEFAULT_ASPECT_RATIO);
            this.L0.setClickable(false);
        }
        this.I0 = (ViewGroup) findViewById(lic.media_bar_view__layout_create);
        MediaBarPreviewLayout mediaBarPreviewLayout = (MediaBarPreviewLayout) findViewById(lic.media_bar_view__preview);
        this.J0 = mediaBarPreviewLayout;
        mediaBarPreviewLayout.setChatMode(wj82.b);
        this.y0 = findViewById(lic.media_bar_view__ll_gallery);
        this.z0 = findViewById(lic.media_bar_view__ll_photo);
        this.A0 = findViewById(lic.media_bar_view__ll_video);
        this.B0 = findViewById(lic.media_bar_view__ll_file);
        this.C0 = findViewById(lic.media_bar_view__ll_contact);
        this.D0 = findViewById(lic.media_bar_view__ll_location);
        this.E0 = findViewById(lic.media_bar_view__ll_constructor);
        ViewGroup viewGroup = (ViewGroup) findViewById(lic.media_bar_view__ll_layout_create);
        this.G0 = viewGroup;
        if (viewGroup == null) {
            this.G0 = this.I0;
        }
        y();
        View view = this.y0;
        if (view != null) {
            y64.n(view, new kk8(this, 5));
        }
        View view2 = this.z0;
        if (view2 != null) {
            y64.n(view2, new kk8(this, 6));
        }
        View view3 = this.A0;
        if (view3 != null) {
            y64.n(view3, new kk8(this, 0));
        }
        View view4 = this.B0;
        if (view4 != null) {
            y64.n(view4, new kk8(this, 1));
        }
        View view5 = this.C0;
        if (view5 != null) {
            y64.n(view5, new kk8(this, 2));
        }
        View view6 = this.D0;
        if (view6 != null) {
            y64.n(view6, new kk8(this, 3));
        }
        View view7 = this.E0;
        if (view7 != null) {
            y64.n(view7, new kk8(this, 4));
        }
        this.J0.setListener(this);
        setCallback(new hk3(this, 2));
        this.O0 = (ExtraActionsView) findViewById(lic.albums_view);
        this.P0 = (CameraContainerView) findViewById(lic.camera_container_view);
        RecyclerView recyclerView = (RecyclerView) findViewById(lic.gallery_recycler_view);
        this.Q0 = recyclerView;
        this.N0 = h88.a(getContext()).c;
        b4a b4a = new b4a(getContext(), (QuickCameraView) findViewById(lic.media_bar_view__quick_camera), ((qra) ym.e()).n(), ((qra) ym.e()).y().a, ((qra) ym.e()).y().c, ((qra) ym.e()).o(), dm4, ln5, ggd, ((qra) ym.e()).c(), (aua) ((qra) ym.e()).getAccessor().g(aua.class));
        this.x0 = b4a;
        Toolbar toolbar2 = this.L0;
        ? obj = new Object();
        obj.a = b4a;
        obj.b = toolbar2;
        obj.c = d;
        obj.d = this;
        this.S0 = obj;
        b4a.c();
        this.T0 = new v1a(b4a, this, ggd);
        this.M0 = findViewById(lic.media_bar_view_empty_separator);
        recyclerView.m(new yx1(this, (LinearLayoutManager) recyclerView.getLayoutManager()));
        recyclerView.setOnTouchListener(new ng1(8, this));
        c();
    }

    /* access modifiers changed from: private */
    public int getKeyboardHeight() {
        d8b d8b;
        d8b d8b2;
        lk8 lk8 = this.w0;
        if (lk8 == null || (d8b = ((i3a) lk8).x.X) == null || !d8b.g || (d8b2 = ((i3a) lk8).x.X) == null) {
            return 0;
        }
        return d8b2.c();
    }

    public static void s(ok8 ok8, Runnable runnable, boolean z2) {
        ok8.w(z2);
        b4a b4a = ok8.x0;
        b4a.q0();
        ArrayList arrayList = ok8.Q0.s1;
        if (arrayList != null) {
            arrayList.clear();
        }
        runnable.run();
        ((View) b4a.c).setVisibility(8);
    }

    public final void c() {
        MediaBarPreviewLayout mediaBarPreviewLayout = this.J0;
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        fu4 e = fu4.k.e(getContext());
        ro4 ro4 = this.y;
        int i = ro4.d;
        float f = (float) i;
        this.H0.setBackground(i8b.P(Integer.valueOf(k0.n), (Integer) null, (Integer) null, new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}));
        this.K0.setBackgroundColor(k0.M);
        this.M0.setBackgroundColor(k0.L);
        int i2 = ro4.u;
        ImageView imageView = (ImageView) findViewById(lic.media_bar_view__iv_gallery);
        int i3 = k0.J;
        int i4 = k0.j;
        imageView.setBackground(i8b.f(i3, i4, 0, i2));
        int i5 = e.f().getIcon().f;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(i5, mode);
        int i6 = k0.N;
        ((TextView) findViewById(lic.media_bar_view__tv_gallery)).setTextColor(i6);
        ImageView imageView2 = (ImageView) findViewById(lic.media_bar_view__iv_photo);
        imageView2.setBackground(i8b.f(i3, i4, 0, i2));
        imageView2.setColorFilter(e.f().getIcon().f, mode);
        ((TextView) findViewById(lic.media_bar_view__tv_photo)).setTextColor(i6);
        findViewById(lic.media_bar_view__iv_video).setBackground(i8b.f(i3, i4, 0, i2));
        ((TextView) findViewById(lic.media_bar_view__tv_video)).setTextColor(i6);
        ImageView imageView3 = (ImageView) findViewById(lic.media_bar_view__iv_file);
        imageView3.setBackground(i8b.f(i3, i4, 0, i2));
        imageView3.setColorFilter(e.f().getIcon().f, mode);
        ((TextView) findViewById(lic.media_bar_view__tv_file)).setTextColor(i6);
        ImageView imageView4 = (ImageView) findViewById(lic.media_bar_view__iv_contact);
        imageView4.setBackground(i8b.f(i3, i4, 0, i2));
        imageView4.setColorFilter(e.f().getIcon().f, mode);
        ((TextView) findViewById(lic.media_bar_view__tv_contact)).setTextColor(i6);
        ImageView imageView5 = (ImageView) findViewById(lic.media_bar_view__iv_location);
        if (imageView5 != null) {
            imageView5.setBackground(i8b.f(i3, i4, 0, i2));
            imageView5.setColorFilter(e.f().getIcon().f, mode);
            ((TextView) findViewById(lic.media_bar_view__tv_location)).setTextColor(i6);
        }
        ImageView imageView6 = (ImageView) findViewById(lic.media_bar_view__iv_constructor);
        if (imageView6 != null) {
            imageView6.setBackground(i8b.f(i3, i4, 0, i2));
            ((TextView) findViewById(lic.media_bar_view__tv_constructor)).setTextColor(i6);
        }
        ((ImageView) findViewById(lic.media_bar_view__iv_puller)).setColorFilter(j4b.l0(0.7f, k0.x), mode);
        this.U0.getClass();
        mediaBarPreviewLayout.setAnimojisEnabled(ryg.h(Collections.emptySet(), hj.a));
        mediaBarPreviewLayout.c();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if ((keyEvent.getKeyCode() == 4) && keyEvent.getAction() == 0) {
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || this.w0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b4a b4a = this.x0;
        if (b4a.Z0 == 3) {
            b4a.C0 = true;
            b4a.n0();
            b4a.k0(false);
        } else if (b4a.Z()) {
            z68.a("b4a", "closeFullScreenMode");
            for (v1a v1a : (Set) b4a.a) {
                v1a.W();
                ((ok8) v1a.b).w(true);
            }
        } else {
            l((Runnable) null, true);
            return true;
        }
        return true;
    }

    public final void e() {
        if (cvg.A(((qra) ym.e()).s().f.j)) {
            this.J0.M(true);
        } else {
            this.J0.Q();
        }
        z(false);
        if (getScrollState() == 1) {
            this.J0.post(new jk8(this, 4));
        }
    }

    public final void g(CharSequence charSequence) {
        lk8 lk8 = this.w0;
        if (lk8 != null) {
            i3a i3a = (i3a) lk8;
            i3a.getClass();
            i3a.N(new a0(9, charSequence));
        }
    }

    public Pair<Integer, Integer> getPreviewScrollPosition() {
        return this.J0.getScrollPosition();
    }

    public Rect getTransitionRect() {
        int m = ((qra) ym.e()).n().m();
        int heightWithoutShadow = this.J0.getVisibility() == 0 ? this.J0.getHeightWithoutShadow() : 0;
        return getScrollState() == 2 ? new Rect(0, this.L0.getMeasuredHeight() + m, getMeasuredWidth(), getMeasuredHeight() - heightWithoutShadow) : new Rect(0, m, getMeasuredWidth(), getMeasuredHeight() - heightWithoutShadow);
    }

    public final void m(Bundle bundle) {
        super.m(bundle);
        if (getScrollState() == 2) {
            this.L0.setVisibility(0);
            this.L0.setAlpha(1.0f);
        }
        if (getScrollState() != 0) {
            x();
        }
    }

    public final void n() {
        lk8 lk8 = this.w0;
        if (lk8 != null) {
            ((i3a) lk8).N(new k2a(23));
        }
    }

    public final void o() {
        lk8 lk8 = this.w0;
        if (lk8 != null) {
            ((i3a) lk8).N(new k2a(24));
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.Q0.post(new jk8(this, 5));
        return super.onApplyWindowInsets(windowInsets);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v1a v1a = this.T0;
        if (v1a != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = v1a.w;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((pm7) it.next()).b((CancellationException) null);
            }
            copyOnWriteArrayList.clear();
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        ro4 ro4;
        super.onLayout(z2, i, i2, i3, i4);
        if (!this.v0 && this.F0 != null) {
            int measuredWidth = this.I0.getMeasuredWidth();
            View view = null;
            int i5 = 0;
            while (true) {
                int childCount = this.G0.getChildCount();
                ro4 = this.y;
                if (i5 >= childCount) {
                    break;
                }
                View childAt = this.G0.getChildAt(i5);
                if (childAt.getRight() > measuredWidth && childAt.getLeft() <= measuredWidth) {
                    if (measuredWidth - childAt.getLeft() < ro4.q) {
                        if (i5 > 0) {
                            view = this.G0.getChildAt(i5 - 1);
                        }
                    } else if (childAt.getRight() - measuredWidth < ro4.q) {
                        view = childAt;
                    }
                }
                i5++;
            }
            if (view != null) {
                int measuredWidth2 = (int) (((((float) measuredWidth) - ((((float) view.getMeasuredWidth()) / 3.0f) * 2.0f)) - ((float) view.getLeft())) / ((((float) this.G0.indexOfChild(view)) * 2.0f) + 1.0f));
                if (measuredWidth2 == 0) {
                    measuredWidth2 = ro4.a;
                }
                for (int i6 = 0; i6 < this.G0.getChildCount(); i6++) {
                    View childAt2 = this.G0.getChildAt(i6);
                    iq.t(childAt2, childAt2.getPaddingLeft() + measuredWidth2);
                    iq.r(childAt2, childAt2.getPaddingRight() + measuredWidth2);
                }
            }
            this.v0 = true;
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.H0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((this.I0.getMeasuredHeight() + (getMeasuredHeight() - this.L0.getMeasuredHeight())) - this.K0.getMeasuredHeight(), 1073741824));
    }

    public final void p() {
        if (getScrollState() != 2) {
            super.p();
            this.L0.setVisibility(0);
            this.L0.setAlpha(1.0f);
            this.L0.setClickable(true);
            View view = this.K0;
            view.setVisibility(0);
            view.setAlpha(1.0f);
        }
    }

    public final void q(d48 d48, View view, int i, float[] fArr) {
        lk8 lk8 = this.w0;
        if (lk8 != null) {
            i3a i3a = (i3a) lk8;
            i3a.getClass();
            i3a.N(new h3a(d48, view, i, fArr));
        }
    }

    public void setListener(lk8 lk8) {
        this.w0 = lk8;
    }

    public final void t() {
        hd8.B((m5) getContext());
        setSystemUiVisibility(2052);
    }

    public final void u(boolean z2) {
        this.J0.clearAnimation();
        if (z2) {
            if (getScrollState() == 1) {
                p();
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, this.J0.getTranslationY(), (float) (-getKeyboardHeight()));
            translateAnimation.setDuration(200);
            this.J0.setAnimation(translateAnimation);
            translateAnimation.start();
            translateAnimation.setAnimationListener(new tg(1, this));
            z(z2);
            return;
        }
        this.J0.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        z(z2);
    }

    public final void v(Float f, boolean z2) {
        View view = this.K0;
        boolean z3 = true;
        if (f == null) {
            if (!z2) {
                this.L0.setVisibility(0);
                view.setVisibility(0);
            }
            if (((qra) ym.e()).s().f.c() <= 0 && cvg.A(((qra) ym.e()).s().f.j)) {
                return;
            }
            if (z2) {
                this.J0.M(true);
            } else {
                this.J0.O(true);
            }
        } else {
            if (getScrollState() == 2) {
                Toolbar toolbar = this.L0;
                float floatValue = f.floatValue();
                if (z2) {
                    floatValue = 1.0f - floatValue;
                }
                toolbar.setAlpha(floatValue);
                Toolbar toolbar2 = this.L0;
                if (toolbar2.getAlpha() < 1.0f) {
                    z3 = false;
                }
                toolbar2.setClickable(z3);
            }
            view.setAlpha(z2 ? 1.0f - f.floatValue() : f.floatValue());
        }
    }

    public final void w(boolean z2) {
        if (this.x0.Z()) {
            setSystemUiVisibility(0);
            View view = this.P0;
            if (view == null) {
                view = this.Q0;
            }
            Rect rect = rcg.a;
            rcg.d(rect, view);
            this.S0.t(rect.width(), rect.height(), rect.top, z2, false);
        }
    }

    public final void x() {
        if (this.x.isActive()) {
            b4a b4a = this.x0;
            if (!b4a.D0.h()) {
                ((View) b4a.c).setVisibility(8);
                return;
            }
            try {
                b4a.p0();
            } catch (Exception e) {
                z68.h("ok8", e, "No found camera", new Object[0]);
                ((uta) ((qra) ym.e()).o()).c(new HandledException(e), true);
                ((View) b4a.c).setVisibility(8);
            }
        }
    }

    public final void y() {
        List list;
        if (this.F0 == null) {
            this.F0 = Arrays.asList(new View[]{this.y0, this.D0, this.E0, this.C0, this.B0});
        }
        this.C0.setVisibility(0);
        this.B0.setVisibility(0);
        this.D0.setVisibility(0);
        if (this.z) {
            this.E0.setVisibility(0);
        } else {
            this.E0.setVisibility(8);
        }
        for (int childCount = this.G0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.G0.getChildAt(childCount);
            List list2 = this.F0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        if (((View) it.next()) == childAt) {
                            break;
                        }
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
            childAt.setVisibility(8);
        }
        boolean z2 = false;
        for (int childCount2 = this.G0.getChildCount() - 1; childCount2 >= 0; childCount2--) {
            View childAt2 = this.G0.getChildAt(childCount2);
            if (childAt2.getVisibility() != 8 || !z2) {
                z2 = true;
            } else {
                this.G0.removeView(childAt2);
                this.G0.addView(childAt2);
            }
        }
        List list3 = this.F0;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list3) {
                try {
                    if (((View) next).getVisibility() != 8) {
                        arrayList.add(next);
                    }
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            list = arrayList;
        } else {
            list = Collections.emptyList();
        }
        for (int i = 0; i < list.size(); i++) {
            View view = (View) list.get(i);
            if (this.G0.indexOfChild(view) != i) {
                this.G0.removeView(view);
                this.G0.addView(view, i);
            }
        }
        if (hn4.i(getContext())) {
            ViewGroup viewGroup = this.G0;
            if (viewGroup instanceof GridLayout) {
                ((GridLayout) viewGroup).setColumnCount(list.size());
            }
        }
    }

    public final void z(boolean z2) {
        if (getScrollState() != 1) {
            int heightWithoutShadow = z2 ? this.J0.getHeightWithoutShadow() : 0;
            if (getKeyboardHeight() != 0) {
                heightWithoutShadow += getKeyboardHeight();
            }
            View view = this.R0;
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), heightWithoutShadow);
        }
    }
}
