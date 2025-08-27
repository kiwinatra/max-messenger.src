package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: gn1  reason: default package */
public final class gn1 extends ConstraintLayout implements phf, kk1 {
    public static final /* synthetic */ KProperty[] i1;
    public final Lazy E0;
    public final Lazy F0;
    public final Lazy G0;
    public final Lazy H0;
    public final Lazy I0;
    public final GestureDetector J0;
    public final OneMeAvatarView K0;
    public final TextView L0;
    public final p8d M0;
    public Function0 N0;
    public Function0 O0;
    public final Lazy P0;
    public final Lazy Q0;
    public final Lazy R0;
    public final Lazy S0;
    public final ViewStub T0;
    public final ViewStub U0;
    public final ViewStub V0;
    public final ViewStub W0;
    public final Lazy X0 = LazyKt.lazy(new an1(this, 0));
    public final Lazy Y0;
    public dn1 Z0;
    public Boolean a1;
    public Boolean b1;
    public CharSequence c1;
    public p0g d1;
    public ze1 e1;
    public o0g f1;
    public final fn1 g1;
    public final fn1 h1;

    static {
        Class<gn1> cls = gn1.class;
        i1 = new KProperty[]{rae.s(cls, "mode", "getMode()Lone/me/calls/ui/view/CallUserView$Mode;", 0), rae.s(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;", 0)};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gn1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        lj1 lj1 = new lj1(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E0 = LazyKt.lazy(lazyThreadSafetyMode, lj1);
        this.F0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 19));
        this.G0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 20));
        this.H0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 21));
        this.I0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 22));
        this.P0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 23));
        this.Q0 = LazyKt.lazy(lazyThreadSafetyMode, new cn1(context2, this, 0));
        this.R0 = LazyKt.lazy(lazyThreadSafetyMode, new cn1(context2, this, 1));
        this.S0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context2, 24));
        this.Y0 = LazyKt.lazy(lazyThreadSafetyMode, new an1(this, 2));
        this.e1 = ze1.c;
        Delegates delegates = Delegates.INSTANCE;
        en1 en1 = en1.a;
        this.g1 = new fn1(this, 0);
        this.h1 = new fn1(this, 1);
        setLayoutParams(new fj3(-1, -1));
        setElevation(vo4.c().getDisplayMetrics().density * 2.0f);
        kne.L(this, vo4.c().getDisplayMetrics().density * 20.0f);
        setBackgroundColor(getBackgroundColor());
        this.J0 = new GestureDetector(context2, new q00(6, this));
        OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(context2, (AttributeSet) null);
        oneMeAvatarView.setId(qqa.T0);
        oneMeAvatarView.setAvatarShape(goa.a);
        this.K0 = oneMeAvatarView;
        TextView textView = new TextView(context2);
        textView.setId(qqa.R0);
        textView.setMaxLines(1);
        textView.setTextColor(l2b.i.e);
        puf.o.b(textView, uy4.b);
        int roundToInt = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
        textView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        gsg.h(textView);
        this.L0 = textView;
        p8d p8d = new p8d(context2, (AttributeSet) null);
        p8d.setId(qqa.S);
        p8d.setMode(k8d.a);
        p8d.setVisibility(8);
        p8d.setImageSize(new l8d(getActionButtonSize(), getActionButtonSize()));
        this.M0 = p8d;
        ViewStub viewStub = new ViewStub(context2);
        viewStub.setId(qqa.d0);
        this.U0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context2);
        viewStub2.setId(qqa.b0);
        this.V0 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context2);
        viewStub3.setId(qqa.Z);
        this.T0 = viewStub3;
        ViewStub viewStub4 = new ViewStub(context2);
        viewStub4.setId(qqa.Q);
        this.W0 = viewStub4;
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.setId(qqa.Y);
        frameLayout.addView(textView, -2, -2);
        addView(oneMeAvatarView, getAvatarSize(), getAvatarSize());
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub4);
        addView(frameLayout, -1, -2);
        addView(p8d);
        addView(viewStub3);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new dr0(2, this));
        } else {
            U(this.c1);
        }
        pj3 h = ct.h(this);
        int id = oneMeAvatarView.getId();
        h.e(id, 4, 0, 4);
        tr1.u((float) 5, vo4.c().getDisplayMetrics().density, new ila(h, 4, id, 4));
        h.e(id, 3, 0, 3);
        h.e(id, 6, 0, 6);
        h.e(id, 7, 0, 7);
        int id2 = viewStub.getId();
        h.e(id2, 4, 0, 4);
        h.e(id2, 3, 0, 3);
        h.e(id2, 6, 0, 6);
        h.e(id2, 7, 0, 7);
        int id3 = viewStub4.getId();
        h.e(id3, 4, 0, 4);
        h.e(id3, 3, 0, 3);
        h.e(id3, 6, 0, 6);
        h.e(id3, 7, 0, 7);
        int id4 = viewStub2.getId();
        h.e(id4, 4, 0, 4);
        h.e(id4, 3, 0, 3);
        h.e(id4, 6, 0, 6);
        h.e(id4, 7, 0, 7);
        int id5 = frameLayout.getId();
        h.e(id5, 6, 0, 6);
        float f = (float) 8;
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 6, id5, 4));
        h.e(id5, 4, 0, 4);
        new ila(h, 4, id5, 4).e(getNameVerticalMargin());
        h.e(id5, 7, 0, 7);
        new ila(h, 7, id5, 4).e(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        int id6 = p8d.getId();
        h.e(id6, 3, 0, 3);
        new ila(h, 3, id6, 4).e(getActionButtonPadding());
        h.e(id6, 7, 0, 7);
        new ila(h, 7, id6, 4).e(getActionButtonPadding());
        int id7 = viewStub3.getId();
        h.e(id7, 3, 0, 3);
        new ila(h, 3, id7, 4).e(getActionButtonPadding());
        h.e(id7, 6, 0, 6);
        new ila(h, 6, id7, 4).e(getActionButtonPadding());
        h.a(this);
    }

    public static ShapeDrawable L(gn1 gn1) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(gn1.getMainRoundRectShape());
        shapeDrawable.getPaint().setColor(l2b.d.d);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public static void M(gn1 gn1, boolean z) {
        kne.S(gn1.getRender(), z);
        OneMeAvatarView oneMeAvatarView = gn1.K0;
        int i = 0;
        boolean z2 = !z;
        if ((oneMeAvatarView.getVisibility() == 0) != z2) {
            if (!z2) {
                i = 8;
            }
            oneMeAvatarView.setVisibility(i);
        }
        TextView textView = gn1.L0;
        ShapeDrawable backgroundItemView = gn1.getBackgroundItemView();
        if (!z) {
            backgroundItemView = null;
        }
        textView.setBackground(backgroundItemView);
    }

    public static ShapeDrawable N(gn1 gn1) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(gn1.getMainRoundRectShape());
        shapeDrawable.getPaint().setColor(l2b.d.a.k);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(vo4.c().getDisplayMetrics().density * 4.0f);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public static View O(Context context, gn1 gn1) {
        View view = new View(context);
        view.setId(qqa.Q);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackground(gn1.getLoadingDrawable());
        view.setVisibility(8);
        return view;
    }

    public static final void P(gn1 gn1) {
        OneMeAvatarView oneMeAvatarView = gn1.K0;
        ViewGroup.LayoutParams layoutParams = oneMeAvatarView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = gn1.getAvatarSize();
            layoutParams.width = gn1.getAvatarSize();
            oneMeAvatarView.setLayoutParams(layoutParams);
            TextView textView = gn1.L0;
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.bottomMargin = gn1.getNameVerticalMargin();
                textView.setLayoutParams(marginLayoutParams);
                p8d p8d = gn1.M0;
                ViewGroup.LayoutParams layoutParams3 = p8d.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams2.topMargin = gn1.getActionButtonPadding();
                    marginLayoutParams2.setMarginEnd(gn1.getActionButtonPadding());
                    p8d.setLayoutParams(marginLayoutParams2);
                    ImageView networkStatusView = gn1.getNetworkStatusView();
                    ViewGroup.LayoutParams layoutParams4 = networkStatusView.getLayoutParams();
                    if (layoutParams4 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams3.topMargin = gn1.getActionButtonPadding();
                        marginLayoutParams3.setMarginStart(gn1.getActionButtonPadding());
                        networkStatusView.setLayoutParams(marginLayoutParams3);
                        p8d.setImageSize(new l8d(gn1.getActionButtonSize(), gn1.getActionButtonSize()));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private final int getActionButtonPadding() {
        int ordinal = getMode().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                return MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
            }
            if (ordinal == 3) {
                return MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
    }

    private final int getActionButtonSize() {
        int ordinal = getMode().ordinal();
        if (!(ordinal == 0 || ordinal == 1 || ordinal == 2)) {
            if (ordinal == 3) {
                return MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return MathKt.roundToInt(((float) 26) * vo4.c().getDisplayMetrics().density);
    }

    private final int getAvatarSize() {
        int ordinal = getMode().ordinal();
        if (ordinal == 0) {
            return MathKt.roundToInt(((float) 72) * vo4.c().getDisplayMetrics().density);
        }
        if (ordinal == 1 || ordinal == 2) {
            return MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
        }
        if (ordinal == 3) {
            return MathKt.roundToInt(((float) 216) * vo4.c().getDisplayMetrics().density);
        }
        if (ordinal == 4) {
            return MathKt.roundToInt(((float) 216) * vo4.c().getDisplayMetrics().density);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int getBackgroundColor() {
        return getCurrentTheme().c().j;
    }

    private final ShapeDrawable getBackgroundItemView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(getItemRoundRectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    private final Drawable getBadConnectionIcon() {
        return (Drawable) this.F0.getValue();
    }

    private final s11 getCameraPreviewView() {
        return (s11) this.S0.getValue();
    }

    private final k2b getCurrentTheme() {
        k2b customTheme = getCustomTheme();
        return customTheme == null ? fu4.k.e(getContext()).f() : customTheme;
    }

    private final RoundRectShape getItemRoundRectShape() {
        return new RoundRectShape(getMAIN_BG_RADIUS(), (RectF) null, (float[]) null);
    }

    private final ShapeDrawable getLoadingDrawable() {
        return (ShapeDrawable) this.Y0.getValue();
    }

    private final View getLoadingView() {
        return (View) this.Q0.getValue();
    }

    private final float[] getMAIN_BG_RADIUS() {
        return (float[]) this.E0.getValue();
    }

    private final RoundRectShape getMainRoundRectShape() {
        return new RoundRectShape(getMAIN_BG_RADIUS(), (RectF) null, (float[]) null);
    }

    private final Drawable getMoreIcon() {
        return (Drawable) this.I0.getValue();
    }

    private final int getNameVerticalMargin() {
        int ordinal = getMode().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                return MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
            }
            if (ordinal == 3) {
                return MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
    }

    private final ImageView getNetworkStatusView() {
        return (ImageView) this.P0.getValue();
    }

    private final Drawable getPinnedIcon() {
        return (Drawable) this.G0.getValue();
    }

    private final on1 getRender() {
        return (on1) this.R0.getValue();
    }

    private final Drawable getRotateIcon() {
        return (Drawable) this.H0.getValue();
    }

    private final ShapeDrawable getTalkingDrawable() {
        return (ShapeDrawable) this.X0.getValue();
    }

    private final int getViewPadding() {
        int ordinal = getMode().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
            }
            if (ordinal == 2) {
                return MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
            }
            if (ordinal == 3) {
                return MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density);
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
    }

    public final void B() {
        setOpponentVideo(this.f1);
    }

    public final void Q(boolean z) {
        ViewStub viewStub = this.W0;
        if ((y7e.I(viewStub) || z) && !Intrinsics.areEqual((Object) this.b1, (Object) Boolean.valueOf(z))) {
            y7e.C(viewStub, getLoadingView(), (Function0) null);
            this.b1 = Boolean.valueOf(z);
            getLoadingView().setVisibility(z ? 0 : 8);
        }
    }

    public final void R(boolean z) {
        if (!Intrinsics.areEqual((Object) this.a1, (Object) Boolean.valueOf(z))) {
            this.a1 = Boolean.valueOf(z);
            ShapeDrawable talkingDrawable = getTalkingDrawable();
            if (!z) {
                talkingDrawable = null;
            }
            setForeground(talkingDrawable);
        }
    }

    public final void S(boolean z, boolean z2) {
        y7e.C(this.V0, getCameraPreviewView(), (Function0) null);
        getCameraPreviewView().setVisibility(z ? 0 : 8);
        getCameraPreviewView().a(z, z2);
    }

    public final void T(CharSequence charSequence, String str) {
        if (!Intrinsics.areEqual((Object) this.c1, (Object) charSequence)) {
            this.c1 = charSequence;
            U(charSequence);
            this.L0.setContentDescription(str);
        }
    }

    public final void U(CharSequence charSequence) {
        int i = 8;
        int f = a81.f((float) 8, vo4.c().getDisplayMetrics().density, 2, getMeasuredWidth());
        TextView textView = this.L0;
        CharSequence g = kne.g(charSequence, textView, a81.f((float) 6, vo4.c().getDisplayMetrics().density, 2, f) - (getViewPadding() * 2));
        textView.setText(g);
        if (!(g == null || StringsKt.isBlank(g))) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public final k2b getCustomTheme() {
        return (k2b) this.h1.getValue(this, i1[1]);
    }

    public final en1 getMode() {
        return (en1) this.g1.getValue(this, i1[0]);
    }

    public final void onAttachedToWindow() {
        lk1 lk1;
        super.onAttachedToWindow();
        Function0 function0 = this.N0;
        if (function0 != null && (lk1 = (lk1) function0.invoke()) != null) {
            ((mk1) lk1).a.add(this);
        }
    }

    public final void onDetachedFromWindow() {
        lk1 lk1;
        super.onDetachedFromWindow();
        Function0 function0 = this.N0;
        if (function0 != null && (lk1 = (lk1) function0.invoke()) != null) {
            ((mk1) lk1).a.remove(this);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        U(this.c1);
    }

    public final void onThemeChanged(k2b k2b) {
        setBackgroundColor(getBackgroundColor());
        TextView textView = this.L0;
        ShapeDrawable backgroundItemView = getBackgroundItemView();
        if (getRender().getVisibility() != 0) {
            backgroundItemView = null;
        }
        textView.setBackground(backgroundItemView);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.J0.onTouchEvent(motionEvent);
    }

    public final void setAvatar(zd0 zd0) {
        gd0 gd0 = null;
        String str = zd0 != null ? zd0.b : null;
        OneMeAvatarView oneMeAvatarView = this.K0;
        oneMeAvatarView.setAvatarUrl(str);
        if (zd0 != null) {
            gd0 = zd0.a;
        }
        oneMeAvatarView.f(gd0, true);
    }

    public final void setBackgroundCorners(float f) {
        kne.L(this, f);
    }

    public final void setButtonAction(p0g p0g) {
        if (this.d1 != p0g) {
            this.d1 = p0g;
            int ordinal = p0g.ordinal();
            p8d p8d = this.M0;
            if (ordinal == 0) {
                p8d.setVisibility(0);
                p8d.O(getMoreIcon(), l2b.f.f);
                p8d.setMode(k8d.x);
                p8d.setContentDescription(p8d.getContext().getString(ykc.call_user_item_more));
                ct.G(p8d, 300, new bn1(this, 0));
                p8d.setButtonPadding(MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density));
            } else if (ordinal == 1) {
                p8d.setVisibility(0);
                p8d.O(getRotateIcon(), l2b.f.f);
                p8d.setMode(k8d.v);
                p8d.setContentDescription(p8d.getContext().getString(sqa.L0));
                ct.G(p8d, 300, new bn1(this, 2));
                p8d.setButtonPadding(MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density));
            } else if (ordinal == 2) {
                p8d.setVisibility(0);
                p8d.O(getPinnedIcon(), l2b.f.f);
                p8d.setMode(k8d.x);
                p8d.setContentDescription(p8d.getContext().getString(ykc.call_user_info_pinned));
                ct.G(p8d, 300, new bn1(this, 1));
                p8d.setButtonPadding(MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density));
            } else if (ordinal == 3) {
                p8d.setVisibility(8);
                p8d.setContentDescription((CharSequence) null);
                p8d.setMode(k8d.x);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void setCallSpeakerMediator(Function0<? extends lk1> function0) {
        this.N0 = function0;
    }

    public final void setCustomTheme(k2b k2b) {
        this.h1.setValue(this, i1[1], k2b);
    }

    public final void setMode(en1 en1) {
        this.g1.setValue(this, i1[0], en1);
    }

    public final void setNetworkState(ca1 ca1) {
        String str;
        Drawable drawable;
        int ordinal = ca1.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            str = null;
            drawable = null;
        } else if (ordinal == 2) {
            str = getContext().getString(sqa.G0);
            drawable = getBadConnectionIcon();
            drawable.setTint(l2b.f.c);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ViewStub viewStub = this.T0;
        if (y7e.I(viewStub) || drawable != null) {
            y7e.C(viewStub, getNetworkStatusView(), (Function0) null);
            getNetworkStatusView().setImageDrawable(drawable);
            getNetworkStatusView().setContentDescription(str);
        }
    }

    public final void setOpponentVideo(o0g o0g) {
        lk1 lk1;
        o0g o0g2;
        ViewStub viewStub = this.U0;
        if (o0g != null || y7e.I(viewStub)) {
            on1 render = getRender();
            if (!y7e.I(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int indexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = render.getLayoutParams().height;
                layoutParams.width = render.getLayoutParams().width;
                render.setId(viewStub.getId());
                viewGroup.addView(render, indexOfChild, layoutParams);
                kne.S(getRender(), false);
                Unit unit = Unit.INSTANCE;
            }
            Function0 function0 = this.N0;
            boolean z = false;
            if (!(function0 == null || (lk1 = (lk1) function0.invoke()) == null || (o0g2 = ((mk1) lk1).b) == null || !o0g2.g || o0g == null || o0g2.a != o0g.a)) {
                z = true;
            }
            on1 render2 = getRender();
            render2.w = o0g;
            render2.x = z;
            getRender().d();
            this.f1 = o0g;
        }
    }

    public final void setVideoLayoutUpdatesControllerProvider(Function0<p6g> function0) {
        this.O0 = function0;
    }
}
