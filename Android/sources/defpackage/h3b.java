package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: h3b  reason: default package */
public abstract class h3b extends FrameLayout implements ird, phf {
    public static final p9a E0 = new p9a(16);
    public static final /* synthetic */ KProperty[] F0;
    public static boolean G0;
    public final Rect A0;
    public boolean B0;
    public boolean C0;
    public Function0 D0;
    public final g3b a = new g3b(this, 0);
    public final g3b b;
    public final g3b c;
    public final g3b o;
    public final g3b v;
    public final Lazy v0;
    public final TextView w;
    public final Lazy w0;
    public final Lazy x;
    public View x0;
    public final Lazy y;
    public View y0;
    public final Lazy z;
    public View z0;

    static {
        Class<h3b> cls = h3b.class;
        F0 = new KProperty[]{rae.s(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;", 0), rae.s(cls, "form", "getForm()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Form;", 0), rae.s(cls, "rightActions", "getRightActions()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Action$Right;", 0), rae.s(cls, "leftActions", "getLeftActions()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Action$Left;", 0), rae.s(cls, "isTextShimmerEnabled", "isTextShimmerEnabled()Z", 0)};
    }

    public h3b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Delegates delegates = Delegates.INSTANCE;
        z2b z2b = z2b.a;
        this.b = new g3b(this, 1);
        this.c = new g3b(this, 2);
        this.o = new g3b(this, 3);
        this.v = new g3b(this, 4);
        TextView textView = new TextView(context);
        textView.setId(dad.J0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(fu4.k.e(textView.getContext()).f().getText().e);
        textView.setTextAlignment(5);
        textView.setSingleLine();
        this.w = textView;
        o2b o2b = new o2b(context, this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.x = LazyKt.lazy(lazyThreadSafetyMode, o2b);
        this.y = LazyKt.lazy(lazyThreadSafetyMode, new o2b(context, this, 1));
        this.z = LazyKt.lazy(lazyThreadSafetyMode, new o2b(context, this, 2));
        this.v0 = LazyKt.lazy(lazyThreadSafetyMode, new c28(25, this));
        this.w0 = LazyKt.lazy(lazyThreadSafetyMode, new o2b(context, this, 3));
        this.A0 = new Rect();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addOnLayoutChangeListener(new dr0(11, this));
        if (isLaidOut()) {
            e(this);
        }
    }

    public static final void d(h3b h3b, x2b x2b) {
        View view;
        OneMeButton oneMeButton;
        h3b.i(h3b.y0);
        h3b.i(h3b.z0);
        Context context = h3b.getContext();
        f3b searchViewInteraction = h3b.getSearchViewInteraction();
        boolean z2 = x2b instanceof u2b;
        View view2 = null;
        u2b u2b = z2 ? (u2b) x2b : null;
        View S = hd8.S(context, u2b != null ? u2b.a : null, searchViewInteraction);
        if (S != null) {
            S.setId(dad.p0);
        } else {
            S = null;
        }
        h3b.z0 = S;
        Context context2 = h3b.getContext();
        f3b searchViewInteraction2 = h3b.getSearchViewInteraction();
        k2b customTheme = h3b.getCustomTheme();
        if (z2) {
            view = hd8.S(context2, ((u2b) x2b).b, searchViewInteraction2);
        } else {
            if (x2b instanceof w2b) {
                oneMeButton = new OneMeButton(context2, (AttributeSet) null);
                oneMeButton.setCustomTheme(customTheme);
                oneMeButton.d(Integer.valueOf(zec.ic_more_vertical_filled_16), true);
                ct.G(oneMeButton, 300, new mmf(x2b, 0));
            } else if (x2b instanceof r2b) {
                oneMeButton = new OneMeButton(context2, (AttributeSet) null);
                oneMeButton.d(Integer.valueOf(zec.ic_done_28), true);
                ct.G(oneMeButton, 300, new mmf(x2b, 1));
            } else if (x2b instanceof q2b) {
                oneMeButton = new OneMeButton(context2, (AttributeSet) null);
                oneMeButton.d(Integer.valueOf(zec.ic_cancel_outline_28), true);
                ct.G(oneMeButton, 300, new mmf(x2b, 2));
            } else if (x2b instanceof s2b) {
                view = null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            view = oneMeButton;
        }
        if (view != null) {
            view.setId(dad.o0);
            view2 = view;
        }
        h3b.y0 = view2;
        if (view2 != null) {
            h3b.h(view2);
            b59.w(view2, MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density));
        }
        View view3 = h3b.z0;
        if (view3 != null) {
            h3b.h(view3);
            b59.w(view3, MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density));
        }
    }

    public static final void e(h3b h3b) {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        Rect bounds;
        int i;
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo2;
        Rect bounds2;
        int i2;
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo3;
        Rect bounds3;
        TextView textView = h3b.w;
        int left = textView.getLeft();
        int right = textView.getRight();
        int height = h3b.getHeight();
        Rect rect = h3b.A0;
        rect.set(left, 0, right, height);
        Lazy lazy = h3b.y;
        if (lazy.isInitialized()) {
            rect.left = Math.min(((OneMeAvatarView) lazy.getValue()).getLeft(), rect.left);
        }
        Lazy lazy2 = h3b.x;
        if (lazy2.isInitialized()) {
            j7e j7e = (j7e) lazy2.getValue();
            rect.left = Math.min(j7e.getLeft(), rect.left);
            rect.right = Math.max(j7e.getRight(), rect.right);
        }
        View view = h3b.x0;
        int i3 = -1;
        Region region = null;
        if (view != null) {
            TouchDelegate touchDelegate = view.getTouchDelegate();
            if (!(touchDelegate == null || (touchDelegateInfo3 = touchDelegate.getTouchDelegateInfo()) == null)) {
                Region regionAt = touchDelegateInfo3.getRegionCount() <= 0 ? null : touchDelegateInfo3.getRegionAt(0);
                if (!(regionAt == null || (bounds3 = regionAt.getBounds()) == null)) {
                    i2 = bounds3.right;
                    rect.left = Math.max(i2, view.getRight());
                }
            }
            i2 = -1;
            rect.left = Math.max(i2, view.getRight());
        }
        Lazy lazy3 = h3b.z;
        if (lazy3.isInitialized()) {
            rect.right = Math.max(((ImageView) lazy3.getValue()).getRight(), rect.right);
        }
        View view2 = h3b.y0;
        if (view2 != null) {
            TouchDelegate touchDelegate2 = view2.getTouchDelegate();
            if (!(touchDelegate2 == null || (touchDelegateInfo2 = touchDelegate2.getTouchDelegateInfo()) == null)) {
                Region regionAt2 = touchDelegateInfo2.getRegionCount() <= 0 ? null : touchDelegateInfo2.getRegionAt(0);
                if (!(regionAt2 == null || (bounds2 = regionAt2.getBounds()) == null)) {
                    i = bounds2.left;
                    rect.right = Math.min(i, view2.getLeft());
                }
            }
            i = -1;
            rect.right = Math.min(i, view2.getLeft());
        }
        View view3 = h3b.z0;
        if (view3 != null) {
            TouchDelegate touchDelegate3 = view3.getTouchDelegate();
            if (!(touchDelegate3 == null || (touchDelegateInfo = touchDelegate3.getTouchDelegateInfo()) == null)) {
                if (touchDelegateInfo.getRegionCount() > 0) {
                    region = touchDelegateInfo.getRegionAt(0);
                }
                if (!(region == null || (bounds = region.getBounds()) == null)) {
                    i3 = bounds.left;
                }
            }
            rect.right = Math.min(i3, view3.getLeft());
        }
    }

    private final k2b getCurrentTheme() {
        k2b customTheme = getCustomTheme();
        return customTheme == null ? fu4.k.e(getContext()).f() : customTheme;
    }

    private final f3b getSearchViewInteraction() {
        return (f3b) this.v0.getValue();
    }

    @Deprecated(message = "Уберу когда перейдем на NewOneMeToolbar")
    public static /* synthetic */ void getShouldUpdateConstraints$annotations() {
    }

    public final void a(String str, List list, Function0 function0, Function1 function1) {
        ((k3b) this.w0.getValue()).a(str, list, function0, function1);
    }

    public final void b() {
        ((k3b) this.w0.getValue()).b();
    }

    public final boolean c() {
        Lazy lazy = this.w0;
        return lazy.isInitialized() && ((k3b) lazy.getValue()).c();
    }

    public abstract void f(j7e j7e);

    public final void g(boolean z2) {
        setShouldUpdateConstraints(true);
        this.C0 = !z2;
        int i = 8;
        this.w.setVisibility(z2 ? 0 : 8);
        Lazy lazy = this.x;
        if (lazy.isInitialized()) {
            ((j7e) lazy.getValue()).setVisibility(z2 ? 0 : 8);
        }
        Lazy lazy2 = this.y;
        if (lazy2.isInitialized()) {
            ((OneMeAvatarView) lazy2.getValue()).setVisibility(z2 ? 0 : 8);
        }
        Lazy lazy3 = this.z;
        if (lazy3.isInitialized()) {
            ((ImageView) lazy3.getValue()).setVisibility(z2 ? 0 : 8);
        }
        View view = this.x0;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
        View view2 = this.y0;
        if (view2 != null) {
            view2.setVisibility(z2 ? 0 : 8);
        }
        View view3 = this.z0;
        if (view3 != null) {
            if (z2) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    public final k2b getCustomTheme() {
        return (k2b) this.a.getValue(this, F0[0]);
    }

    public final z2b getForm() {
        return (z2b) this.b.getValue(this, F0[1]);
    }

    public final v2b getLeftActions() {
        return (v2b) this.o.getValue(this, F0[3]);
    }

    public final View getLeftView() {
        return this.x0;
    }

    public final x2b getRightActions() {
        return (x2b) this.c.getValue(this, F0[2]);
    }

    public final View getRightPrimaryView() {
        return this.y0;
    }

    public final View getRightSecondaryView() {
        return this.z0;
    }

    public final pza getSearchView() {
        View view = this.y0;
        pza pza = view instanceof pza ? (pza) view : null;
        if (pza != null) {
            return pza;
        }
        View view2 = this.z0;
        if (view2 instanceof pza) {
            return (pza) view2;
        }
        return null;
    }

    public final Lazy<k3b> getSelectionViewLazy() {
        return this.w0;
    }

    public abstract boolean getShouldUpdateConstraints();

    public final Lazy<j7e> getSubtitleTextViewLazy() {
        return this.x;
    }

    public final TextView getTitle() {
        return this.w;
    }

    public final Lazy<OneMeAvatarView> getTitleAvatarViewLazy() {
        return this.y;
    }

    public final Lazy<ImageView> getTitleDropdownViewLazy() {
        return this.z;
    }

    public final TextView getTitleTextView() {
        return this.w;
    }

    public abstract void h(View view);

    public abstract void i(View view);

    public abstract void j();

    public final boolean k() {
        pza searchView = getSearchView();
        nza state = searchView != null ? searchView.getState() : null;
        return state == nza.c || state == nza.o || state == nza.b;
    }

    public final void l() {
        int ordinal = getForm().ordinal();
        TextView textView = this.w;
        if (ordinal == 0) {
            puf.z.b(textView, uy4.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            View view = this.x0;
            if (view != null) {
                m58.c(view, getLeftActions(), getCustomTheme());
            }
            View view2 = this.z0;
            if (view2 != null) {
                m58.d(view2, getRightActions(), false);
            }
            View view3 = this.y0;
            if (view3 != null) {
                m58.d(view3, getRightActions(), true);
            }
        } else if (ordinal == 1) {
            puf.y.b(textView, uy4.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            View view4 = this.z0;
            if (view4 != null) {
                m58.e(view4, getRightActions(), false);
            }
            View view5 = this.y0;
            if (view5 != null) {
                m58.e(view5, getRightActions(), true);
            }
        } else if (ordinal == 2) {
            puf.z.b(textView, uy4.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            View view6 = this.x0;
            if (view6 != null) {
                m58.c(view6, getLeftActions(), getCustomTheme());
            }
            View view7 = this.z0;
            if (view7 != null) {
                m58.d(view7, getRightActions(), false);
            }
            View view8 = this.y0;
            if (view8 != null) {
                m58.d(view8, getRightActions(), true);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Lazy lazy = this.x;
        if (lazy.isInitialized()) {
            j7e j7e = (j7e) lazy.getValue();
            if (((Boolean) this.v.getValue(this, F0[4])).booleanValue()) {
                puf.i.b(j7e, uy4.b);
                j7e.setTextColor(getCurrentTheme().getText().g);
                return;
            }
            puf.o.b(j7e, uy4.b);
            j7e.setTextColor(getCurrentTheme().getText().f);
        }
    }

    public final void m() {
        int ordinal = getForm().ordinal();
        Lazy lazy = this.y;
        TextView textView = this.w;
        if (ordinal == 0) {
            textView.setGravity(17);
            if (lazy.isInitialized()) {
                OneMeAvatarView oneMeAvatarView = (OneMeAvatarView) lazy.getValue();
                ViewGroup.LayoutParams layoutParams = oneMeAvatarView.getLayoutParams();
                if (layoutParams != null) {
                    float f = (float) 24;
                    layoutParams.width = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
                    layoutParams.height = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
                    oneMeAvatarView.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            n();
            float f2 = (float) 12;
            setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), 0, MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), 0);
        } else if (ordinal == 1) {
            textView.setGravity(8388611);
            if (lazy.isInitialized()) {
                OneMeAvatarView oneMeAvatarView2 = (OneMeAvatarView) lazy.getValue();
                ViewGroup.LayoutParams layoutParams2 = oneMeAvatarView2.getLayoutParams();
                if (layoutParams2 != null) {
                    float f3 = (float) 24;
                    layoutParams2.width = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3);
                    layoutParams2.height = MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density);
                    oneMeAvatarView2.setLayoutParams(layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            n();
            setPadding(MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density), 0, MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), 0);
        } else if (ordinal == 2) {
            textView.setGravity(8388611);
            if (lazy.isInitialized()) {
                OneMeAvatarView oneMeAvatarView3 = (OneMeAvatarView) lazy.getValue();
                ViewGroup.LayoutParams layoutParams3 = oneMeAvatarView3.getLayoutParams();
                if (layoutParams3 != null) {
                    float f4 = (float) 40;
                    layoutParams3.width = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4);
                    layoutParams3.height = MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density);
                    oneMeAvatarView3.setLayoutParams(layoutParams3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            n();
            float f5 = (float) 4;
            setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5), 0, MathKt.roundToInt(f5 * vo4.c().getDisplayMetrics().density), 0);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        j();
    }

    public abstract void n();

    public final void onThemeChanged(k2b k2b) {
        js9 js9 = fu4.k;
        fu4 e = js9.e(getContext());
        k2b currentTheme = getCurrentTheme();
        e.getClass();
        fu4.d(this, currentTheme);
        l();
        Lazy lazy = this.x;
        if (lazy.isInitialized()) {
            j7e j7e = (j7e) lazy.getValue();
            CharSequence text = j7e.getText();
            Object[] objArr = null;
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                objArr = spanned.getSpans(0, j7e.getText().length(), phf.class);
            }
            if (objArr == null) {
                objArr = new phf[0];
            }
            for (Object obj : objArr) {
                phf phf = (phf) obj;
                phf.onThemeChanged(getCurrentTheme());
                wgf.c(j7e, phf);
            }
        }
        Lazy lazy2 = this.z;
        if (lazy2.isInitialized()) {
            ImageView imageView = (ImageView) lazy2.getValue();
            imageView.setImageTintList(ColorStateList.valueOf(js9.f(imageView).getIcon().f));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate;
        View view;
        TouchDelegate touchDelegate2;
        View view2;
        TouchDelegate touchDelegate3;
        View view3;
        if (motionEvent == null || this.C0) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            if (this.A0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                Function0 function0 = this.D0;
                if (function0 != null) {
                    function0.invoke();
                }
                performClick();
                return true;
            }
        }
        View view4 = this.x0;
        if (view4 == null || (touchDelegate3 = view4.getTouchDelegate()) == null || !touchDelegate3.onTouchEvent(motionEvent)) {
            View view5 = this.z0;
            if (view5 == null || (touchDelegate2 = view5.getTouchDelegate()) == null || !touchDelegate2.onTouchEvent(motionEvent)) {
                View view6 = this.y0;
                if (!(view6 == null || (touchDelegate = view6.getTouchDelegate()) == null || !touchDelegate.onTouchEvent(motionEvent) || motionEvent.getAction() != 1 || (view = this.y0) == null)) {
                    view.performClick();
                }
                return true;
            }
            if (motionEvent.getAction() == 1 && (view2 = this.z0) != null) {
                view2.performClick();
            }
            return true;
        }
        if (motionEvent.getAction() == 1 && (view3 = this.x0) != null) {
            view3.performClick();
        }
        return true;
    }

    public final void setAvatar(y2b y2b) {
        if (getForm() != z2b.b) {
            int i = 8;
            Lazy lazy = this.y;
            if (y2b != null) {
                OneMeAvatarView oneMeAvatarView = (OneMeAvatarView) lazy.getValue();
                oneMeAvatarView.f(new gd0(y2b.b, y2b.c), true);
                oneMeAvatarView.setAvatarUrl(y2b.a);
                OneMeAvatarView.g(oneMeAvatarView, y2b.d, (joa) null, 30);
                if (!k() && !this.C0) {
                    i = 0;
                }
                oneMeAvatarView.setVisibility(i);
            } else if (lazy.isInitialized()) {
                ((OneMeAvatarView) lazy.getValue()).setVisibility(8);
            }
            if (!k()) {
                setShouldUpdateConstraints(true);
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalStateException("setAvatar can't be applied for Form.Main");
    }

    public final void setAvatarAlpha(float f) {
        Lazy lazy = this.y;
        if (lazy.isInitialized()) {
            ((OneMeAvatarView) lazy.getValue()).setAlpha(f);
        }
    }

    public final void setCustomTheme(k2b k2b) {
        this.a.setValue(this, F0[0], k2b);
    }

    public final void setDropdownRotationProgress(float f) {
        Lazy lazy = this.z;
        if (lazy.isInitialized()) {
            ((ImageView) lazy.getValue()).setRotation(RangesKt.coerceIn(f, (float) c44.DEFAULT_ASPECT_RATIO, 1.0f) * 180.0f);
        }
    }

    public final void setForm(z2b z2b) {
        this.b.setValue(this, F0[1], z2b);
    }

    public final void setLeftActions(v2b v2b) {
        this.o.setValue(this, F0[3], v2b);
    }

    public final void setLeftView(View view) {
        this.x0 = view;
    }

    public final void setRightActions(x2b x2b) {
        this.c.setValue(this, F0[2], x2b);
    }

    public final void setRightPrimaryView(View view) {
        this.y0 = view;
    }

    public final void setRightSecondaryView(View view) {
        this.z0 = view;
    }

    public abstract void setShouldUpdateConstraints(boolean z2);

    public final void setShowDropdown(boolean z2) {
        ((View) this.z.getValue()).setVisibility(z2 ? 0 : 8);
        setShouldUpdateConstraints(true);
        requestLayout();
    }

    public final void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public final void setTextShimmerEnabled(boolean z2) {
        this.v.setValue(this, F0[4], Boolean.valueOf(z2));
    }

    public final void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public final void setTitleAlpha(float f) {
        this.w.setAlpha(f);
    }

    public final void setTitleClickListener(Function0<Unit> function0) {
        this.D0 = function0;
    }

    public final void setSubtitle(CharSequence charSequence) {
        int i = 0;
        this.B0 = charSequence != null;
        Lazy lazy = this.x;
        if (charSequence != null) {
            ((j7e) lazy.getValue()).setText(charSequence);
            View view = (View) lazy.getValue();
            if (!(!k() && !this.C0)) {
                i = 8;
            }
            view.setVisibility(i);
        } else if (lazy.isInitialized()) {
            ((j7e) lazy.getValue()).setVisibility(8);
        }
        n();
        if (!k()) {
            setShouldUpdateConstraints(true);
            requestLayout();
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.w.setText(charSequence);
    }
}
