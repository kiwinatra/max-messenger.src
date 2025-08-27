package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: zm5  reason: default package */
public final class zm5 extends vff {
    public static final /* synthetic */ KProperty[] U0 = {rae.s(zm5.class, "model", "getModel()Lone/me/messages/list/loader/model/FileAttachModel;", 0)};
    public boolean A0;
    public boolean B0;
    public p50 C0;
    public pm7 D0;
    public final bl E0 = new bl(10, this);
    public final Rect F0 = new Rect();
    public final Lazy G0;
    public final Lazy H0;
    public final Lazy I0;
    public final ShapeDrawable J0;
    public final Lazy K0;
    public final Lazy L0;
    public final Lazy M0;
    public final Lazy N0;
    public final Lazy O0;
    public final OneMeDraweeView P0;
    public final TextView Q0;
    public Layout R0;
    public final int S0;
    public final int T0;
    public int y0;
    public final Lazy z0;

    public zm5(Context context) {
        super(context);
        js9 js9 = fu4.k;
        int i = js9.e(getContext()).f().a().a(true).a.i;
        this.y0 = js9.e(getContext()).f().a().a(true).c.f;
        p35 p35 = new p35(context, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.z0 = LazyKt.lazy(lazyThreadSafetyMode, p35);
        Delegates delegates = Delegates.INSTANCE;
        this.G0 = LazyKt.lazy(lazyThreadSafetyMode, new wm5(this, 0));
        this.H0 = LazyKt.lazy(lazyThreadSafetyMode, new wm5(this, 1));
        this.I0 = LazyKt.lazy(lazyThreadSafetyMode, new wm5(this, 2));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(getPreviewActionIconBackgroundColor());
        this.J0 = shapeDrawable;
        this.K0 = LazyKt.lazy(lazyThreadSafetyMode, new xm5(context, this, 0));
        this.L0 = LazyKt.lazy(lazyThreadSafetyMode, new xm5(context, this, 1));
        this.M0 = LazyKt.lazy(lazyThreadSafetyMode, new xm5(context, this, 2));
        this.N0 = LazyKt.lazy(lazyThreadSafetyMode, new xm5(context, this, 3));
        this.O0 = LazyKt.lazy(lazyThreadSafetyMode, new qr3(28));
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.P0 = oneMeDraweeView;
        TextView textView = new TextView(context);
        tr2.f.b(textView, uy4.b);
        textView.setMaxLines(1);
        this.Q0 = textView;
        this.S0 = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        this.T0 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(oneMeDraweeView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ejd ejd = r89.y;
        k2b f = js9.e(getContext()).f();
        ejd.getClass();
        setBackground(ejd.a(f));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    private final fm5 getActionIconView() {
        return (fm5) this.K0.getValue();
    }

    private final ImageView getBigPreviewActionIcon() {
        return (ImageView) this.L0.getValue();
    }

    private final cq0 getBlurPostProcessor() {
        return (cq0) this.z0.getValue();
    }

    private final n04 getCornersOutlineProvider() {
        return (n04) this.O0.getValue();
    }

    private final bl5 getModel() {
        return (bl5) this.E0.getValue(this, U0[0]);
    }

    private final int getPreviewActionIconBackgroundColor() {
        fu4.k.e(getContext()).f().a().l().a.getClass();
        return 1543503872;
    }

    private final int getPreviewActionIconColor() {
        fu4.k.e(getContext()).f().a().l().c.getClass();
        return -1;
    }

    public static Drawable s(zm5 zm5) {
        int i = cad.n0;
        int previewActionIconColor = zm5.getPreviewActionIconColor();
        Drawable b = ew3.b(zm5.getContext(), i);
        iq.a0(b, previewActionIconColor);
        return b;
    }

    private final void setModel(bl5 bl5) {
        this.E0.setValue(this, U0[0], bl5);
    }

    private final void setPreview(bl5 bl5) {
        bl5 bl52 = bl5;
        p87 p87 = bl52.k;
        b3g b3g = bl52.l;
        if (!(p87 == null && b3g == null) && !bl52.m) {
            if (p87 == null) {
                p87 = b3g != null ? new p87(0, b3g.b, b3g.c, b3g.d, false, b3g.e, b3g.h, (v3d) null, false, (String) null, (Uri) null, 3456) : null;
            }
            Lazy lazy = this.N0;
            ((View) lazy.getValue()).setVisibility(bl52.j == al5.b ? 0 : 8);
            if (y7e.L(lazy)) {
                m3g m3g = (m3g) lazy.getValue();
                if (b3g != null) {
                    long r5 = Duration.m1371getInWholeMillisecondsimpl(b3g.f);
                    String[] strArr = ghf.c;
                    m3g.setContent(b0h.c(r5));
                }
            }
            if (p87 != null) {
                s87 s87 = (s87) this.M0.getValue();
                s87.setVisibility(0);
                s87.setImageAttach(p87);
                OneMeDraweeView oneMeDraweeView = this.P0;
                ra7 d = ra7.d(p87.b);
                d.d = p87.h;
                d.l = getBlurPostProcessor();
                oneMeDraweeView.o(d.a(), (qa7) null);
                ((sp6) oneMeDraweeView.getHierarchy()).h(p87.i);
            }
        }
    }

    private final void setState(bl5 bl5) {
        boolean z = false;
        getMessageTextView$message_list_release().setVisibility(bl5.m ? 0 : 8);
        boolean z2 = this.B0;
        Lazy lazy = this.L0;
        ome ome = bl5.n;
        zk5 zk5 = bl5.i;
        if (z2) {
            Lazy lazy2 = this.K0;
            if (lazy2.isInitialized()) {
                ((fm5) lazy2.getValue()).setVisibility(8);
            }
            getBigPreviewActionIcon().setVisibility(0);
            if (zk5 instanceof yk5) {
                w(lazy);
            } else if (zk5 instanceof wk5) {
                u(lazy);
            } else if (ome.getValue() == null && (zk5 instanceof xk5)) {
                v(lazy, ((xk5) zk5).a);
            }
        } else {
            if (lazy.isInitialized()) {
                ((ImageView) lazy.getValue()).setVisibility(8);
            }
            Lazy lazy3 = this.M0;
            if (lazy3.isInitialized()) {
                ((s87) lazy3.getValue()).setVisibility(8);
            }
            this.P0.setVisibility(8);
            getActionIconView().setVisibility(0);
            if (zk5 instanceof yk5) {
                fm5 actionIconView = getActionIconView();
                short s = actionIconView.o;
                actionIconView.o = 0;
                if (s == 0) {
                    z = true;
                }
                boolean z3 = !z;
                ((Drawable) actionIconView.c.getValue()).invalidateSelf();
                if (z3) {
                    actionIconView.requestLayout();
                    actionIconView.invalidate();
                }
            } else if (zk5 instanceof wk5) {
                fm5 actionIconView2 = getActionIconView();
                short s2 = actionIconView2.o;
                actionIconView2.o = 2;
                if (s2 == 2) {
                    z = true;
                }
                boolean z4 = !z;
                ((km5) actionIconView2.x.getValue()).a(bl5.f);
                if (z4) {
                    actionIconView2.requestLayout();
                    actionIconView2.invalidate();
                }
            } else if (ome.getValue() == null && (zk5 instanceof xk5)) {
                getActionIconView().c(((xk5) zk5).a);
            }
        }
    }

    private final void setSubtitle(ngf ngf) {
        if (ngf != null) {
            this.Q0.setText(ngf.a(getContext()));
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        Layout layout = this.R0;
        if (layout != null) {
            View t = y7e.t(this.K0);
            if (t != null) {
                i = getContentHorizontalPadding$message_list_release() + t.getMeasuredWidth();
            } else {
                i = 0;
            }
            int i2 = this.S0 + i;
            int save = canvas.save();
            canvas.translate((float) i2, (float) (this.Q0.getTop() - layout.getHeight()));
            try {
                layout.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    public final void h(CharSequence charSequence, boolean z) {
        z74 date$message_list_release = getDate$message_list_release();
        KProperty[] kPropertyArr = z74.B0;
        date$message_list_release.c(charSequence, false);
    }

    public final boolean i(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.A0 && rcg.c(this.P0, this).contains(x, y)) {
            return true;
        }
        Lazy lazy = this.M0;
        if (!y7e.L(lazy) || !rcg.c((View) lazy.getValue(), this).contains(x, y)) {
            return this.F0.contains(x, y);
        }
        return true;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int roundToInt = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
        float f = (float) 4;
        int roundToInt2 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        boolean L = y7e.L(getSenderNameViewStub$message_list_release().b);
        int i10 = this.S0;
        if (L) {
            getSenderNameViewStub$message_list_release().c(i10, i10);
            i5 = getSenderBottomMargin$message_list_release() + getSenderNameViewStub$message_list_release().a() + i10;
        } else {
            i5 = i10;
        }
        if (y7e.L((Lazy) getSenderAliasDelegate().c) && y7e.L(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().S((getMeasuredWidth() - i10) - getSenderAliasDelegate().L(), ((getSenderNameViewStub$message_list_release().a() / 2) - (getSenderAliasDelegate().K() / 2)) + i10);
        }
        if (y7e.L((Lazy) getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().S(i10, i5);
            i5 += getMessageLinkDelegate().K() + roundToInt2;
        }
        bl5 model = getModel();
        int i11 = this.T0;
        if (model != null && model.m) {
            lf9 messageTextView$message_list_release = getMessageTextView$message_list_release();
            ev0.x(messageTextView$message_list_release, i10, i5, 0, 12);
            i5 += messageTextView$message_list_release.getMeasuredHeight() + i11;
        }
        boolean z2 = this.A0;
        OneMeDraweeView oneMeDraweeView = this.P0;
        if (z2) {
            oneMeDraweeView.layout(i10, i5, oneMeDraweeView.getMeasuredWidth() + i10, oneMeDraweeView.getMeasuredHeight() + i5);
        }
        Lazy lazy = this.M0;
        if (y7e.L(lazy)) {
            s87 s87 = (s87) lazy.getValue();
            if (this.A0) {
                i9 = s87.getMeasuredLayoutHeight() != s87.getMeasuredHeight() ? ((s87.getMeasuredLayoutHeight() - s87.getMeasuredHeight()) / 2) + i5 : i5;
                i8 = s87.getMeasuredLayoutWidth() != s87.getMeasuredWidth() ? ((s87.getMeasuredLayoutWidth() - s87.getMeasuredWidth()) / 2) + i10 : i10;
            } else {
                i8 = i10;
                i9 = i5;
            }
            ev0.x(s87, i8, i9, 0, 12);
            if (this.A0) {
                oneMeDraweeView.setOutlineProvider(getCornersOutlineProvider());
                s87.setOutlineProvider(getCornersOutlineProvider());
            } else {
                s87.setOutlineProvider(getCornersOutlineProvider());
            }
        }
        Lazy lazy2 = this.L0;
        if (y7e.L(lazy2)) {
            ImageView imageView = (ImageView) lazy2.getValue();
            int measuredLayoutWidth = (((s87) lazy.getValue()).getMeasuredLayoutWidth() / 2) + i10;
            int measuredLayoutHeight = (((s87) lazy.getValue()).getMeasuredLayoutHeight() / 2) + i5;
            ev0.w(imageView, measuredLayoutWidth - (imageView.getMeasuredWidth() / 2), measuredLayoutHeight - (imageView.getMeasuredHeight() / 2), (imageView.getMeasuredWidth() / 2) + measuredLayoutWidth, (imageView.getMeasuredHeight() / 2) + measuredLayoutHeight);
        }
        if (y7e.L(lazy)) {
            Lazy lazy3 = this.N0;
            if (y7e.L(lazy3)) {
                m3g m3g = (m3g) lazy3.getValue();
                ev0.x(m3g, g63.b(f, vo4.c().getDisplayMetrics().density, i10), a81.e(f, vo4.c().getDisplayMetrics().density, (((s87) lazy.getValue()).getMeasuredLayoutHeight() + i5) - m3g.getMeasuredHeight()), 0, 12);
            }
            i5 += ((s87) lazy.getValue()).getMeasuredLayoutHeight() + i11;
        }
        Lazy lazy4 = this.K0;
        if (y7e.L(lazy4)) {
            fm5 fm5 = (fm5) lazy4.getValue();
            if (y7e.L((Lazy) getReactionsDelegate().c)) {
                if (getMeasuredWidth() - (getReactionsDelegate().L() + (i10 * 2)) < getDate$message_list_release().getMeasuredWidth()) {
                    i7 = g63.b((float) 6, vo4.c().getDisplayMetrics().density, getDate$message_list_release().getMeasuredHeight() + g63.b((float) 10, vo4.c().getDisplayMetrics().density, getReactionsDelegate().K()));
                    ev0.x(fm5, i10, ((((getMeasuredHeight() - i7) - i5) / 2) + i5) - (fm5.getMeasuredHeight() / 2), 0, 12);
                    i6 = getContentHorizontalPadding$message_list_release() + roundToInt + i10;
                }
            }
            i7 = y7e.L((Lazy) getReactionsDelegate().c) ? g63.b((float) 8, vo4.c().getDisplayMetrics().density, g63.b((float) 10, vo4.c().getDisplayMetrics().density, getReactionsDelegate().K())) : i10;
            ev0.x(fm5, i10, ((((getMeasuredHeight() - i7) - i5) / 2) + i5) - (fm5.getMeasuredHeight() / 2), 0, 12);
            i6 = getContentHorizontalPadding$message_list_release() + roundToInt + i10;
        } else {
            i6 = i10;
        }
        int roundToInt3 = y7e.L(lazy4) ? MathKt.roundToInt(getActionIconView().getY() + ((float) (getActionIconView().getMeasuredHeight() / 2))) : (roundToInt / 2) + i5;
        TextView textView = this.Q0;
        ev0.w(textView, i6, roundToInt3, textView.getMeasuredWidth() + i6, textView.getMeasuredHeight() + roundToInt3);
        Math.max(ld8.O(this.R0), textView.getMeasuredWidth());
        int bottom = y7e.L(lazy4) ? ((fm5) lazy4.getValue()).getBottom() : textView.getBottom();
        if (y7e.L((Lazy) getReactionsDelegate().c)) {
            float f2 = (float) 10;
            getReactionsDelegate().S(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), g63.b(f2, vo4.c().getDisplayMetrics().density, bottom));
            getReactionsDelegate().K();
        }
        ev0.x(getDate$message_list_release(), (getMeasuredWidth() - getDate$message_list_release().getMeasuredWidth()) - i10, a81.e(f, vo4.c().getDisplayMetrics().density, getMeasuredHeight() - getDate$message_list_release().getMeasuredHeight()), 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        int i4;
        int i5 = i;
        int i6 = i2;
        float f2 = (float) 10;
        int f3 = a81.f(f2, vo4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int roundToInt = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
        int roundToInt2 = MathKt.roundToInt(((float) 44) * vo4.c().getDisplayMetrics().density);
        int roundToInt3 = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : getSuggestedMinimumWidth() + getContentHorizontalPadding$message_list_release();
        if (y7e.L((Lazy) getSenderAliasDelegate().c) && y7e.L(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().T(View.MeasureSpec.makeMeasureSpec(f3, IntCompanionObject.MIN_VALUE), i6);
            size = Math.max(size, getSenderAliasDelegate().L());
        }
        boolean L = y7e.L(getSenderNameViewStub$message_list_release().b);
        int i7 = this.S0;
        if (L) {
            getSenderNameViewStub$message_list_release().d(View.MeasureSpec.makeMeasureSpec(f3, IntCompanionObject.MIN_VALUE), i6);
            int g0 = getSenderAliasDelegate().g0();
            i3 = getSenderBottomMargin$message_list_release() + getSenderNameViewStub$message_list_release().a() + i7;
            size = Math.max(size, (i7 * 2) + getSenderNameViewStub$message_list_release().b() + g0);
        } else {
            i3 = i7;
        }
        bl5 model = getModel();
        int i8 = this.T0;
        if (model != null && model.m) {
            lf9 messageTextView$message_list_release = getMessageTextView$message_list_release();
            messageTextView$message_list_release.d();
            size = Math.max(size, (i7 * 2) + messageTextView$message_list_release.getMeasuredWidth());
            i3 += messageTextView$message_list_release.getMeasuredHeight() + i8;
        }
        Lazy lazy = this.M0;
        boolean L2 = y7e.L(lazy);
        OneMeDraweeView oneMeDraweeView = this.P0;
        if (L2) {
            s87 s87 = (s87) lazy.getValue();
            int i9 = i7 * 2;
            f = f2;
            s87.measure(View.MeasureSpec.makeMeasureSpec(f3 - i9, 1073741824), i6);
            i3 += s87.getMeasuredLayoutHeight() + i8;
            size = Math.max(size, s87.getMeasuredLayoutWidth() + i9);
            boolean z = (s87.getMeasuredLayoutWidth() == s87.getMeasuredWidth() && s87.getMeasuredLayoutHeight() == s87.getMeasuredHeight()) ? false : true;
            this.A0 = z;
            oneMeDraweeView.setVisibility(z ? 0 : 8);
        } else {
            f = f2;
        }
        if (this.A0) {
            oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(f3 - (i7 * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(((s87) lazy.getValue()).getMeasuredLayoutHeight(), 1073741824));
        }
        Lazy lazy2 = this.L0;
        if (lazy2.isInitialized()) {
            ((ImageView) lazy2.getValue()).measure(View.MeasureSpec.makeMeasureSpec(roundToInt2, 1073741824), View.MeasureSpec.makeMeasureSpec(roundToInt2, 1073741824));
        }
        boolean L3 = y7e.L(lazy);
        Lazy lazy3 = this.K0;
        if (L3) {
            i4 = Math.min(f3, ((s87) lazy.getValue()).getMeasuredWidth());
        } else {
            Integer valueOf = Integer.valueOf(getContentHorizontalPadding$message_list_release() + roundToInt);
            if (!y7e.L(lazy3)) {
                valueOf = 0;
            }
            i4 = (f3 - valueOf.intValue()) - (i7 * 2);
        }
        if (y7e.L((Lazy) getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().T(View.MeasureSpec.makeMeasureSpec(f3, IntCompanionObject.MIN_VALUE), i6);
            size = Math.max(size, (i7 * 2) + getMessageLinkDelegate().L());
            i3 += getMessageLinkDelegate().K() + roundToInt3;
        }
        getDate$message_list_release().measure(i5, i6);
        Lazy lazy4 = this.N0;
        if (lazy4.isInitialized()) {
            ((m3g) lazy4.getValue()).measure(i5, i6);
        }
        if (lazy3.isInitialized()) {
            ((fm5) lazy3.getValue()).measure(View.MeasureSpec.makeMeasureSpec(roundToInt, 1073741824), View.MeasureSpec.makeMeasureSpec(roundToInt, 1073741824));
        }
        TextView textView = this.Q0;
        textView.measure(View.MeasureSpec.makeMeasureSpec(i4, IntCompanionObject.MIN_VALUE), i6);
        int max = Math.max(ld8.O(this.R0), textView.getMeasuredWidth());
        if (!y7e.L(lazy)) {
            size = Math.max(size, getContentHorizontalPadding$message_list_release() + (i7 * 2) + max + roundToInt);
        }
        int contentHorizontalPadding$message_list_release = (size - i7) - getContentHorizontalPadding$message_list_release();
        Integer valueOf2 = Integer.valueOf(roundToInt);
        Integer valueOf3 = Integer.valueOf(textView.getMeasuredHeight() + ld8.N(this.R0));
        if (!y7e.L(lazy3)) {
            valueOf2 = valueOf3;
        }
        this.F0.set(i7, i3, contentHorizontalPadding$message_list_release, valueOf2.intValue() + i3);
        int measuredHeight = textView.getMeasuredHeight() + ld8.N(this.R0);
        Integer valueOf4 = Integer.valueOf(roundToInt);
        Integer valueOf5 = Integer.valueOf(measuredHeight);
        if (!y7e.L(lazy3)) {
            valueOf4 = valueOf5;
        }
        int max2 = Math.max(valueOf4.intValue(), measuredHeight) + i3;
        if (y7e.L((Lazy) getReactionsDelegate().c)) {
            getReactionsDelegate().T(View.MeasureSpec.makeMeasureSpec(f3, IntCompanionObject.MIN_VALUE), i6);
            max2 = tr1.e(f, vo4.c().getDisplayMetrics().density, getReactionsDelegate().K(), max2);
            size = Math.max(size, (i7 * 2) + getReactionsDelegate().L());
        }
        if (y7e.L((Lazy) getReactionsDelegate().c)) {
            if (size - (getReactionsDelegate().L() + (i7 * 2)) < getDate$message_list_release().getMeasuredWidth()) {
                max2 += g63.b((float) 6, vo4.c().getDisplayMetrics().density, getDate$message_list_release().getMeasuredHeight()) - MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
            }
        }
        int O = ld8.O(this.R0) - textView.getMeasuredWidth();
        if (!y7e.L((Lazy) getReactionsDelegate().c) && O < getDate$message_list_release().getMeasuredWidth()) {
            size += (MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density) + getDate$message_list_release().getMeasuredWidth()) - O;
        }
        if (y7e.L((Lazy) getReactionsDelegate().c)) {
            i7 = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        }
        setMeasuredDimension(size, max2 + i7);
    }

    public void setDateBackgroundColor(int i) {
    }

    public void setDateTextColor(int i) {
        getDate$message_list_release().setTextColor(i);
    }

    public void setDateViewStatus(hcg hcg) {
        getDate$message_list_release().setStatus(hcg);
    }

    public final void setFileInfo(bl5 bl5) {
        p50 p50;
        setModel(bl5);
        this.C0 = new p50(2, this, bl5);
        if (isAttachedToWindow() && (p50 = this.C0) != null) {
            p50.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.C0);
    }

    public void setSenderName(Layout layout) {
        getSenderNameViewStub$message_list_release().e(layout);
    }

    public void setSenderNameColor(int i) {
        getSenderNameViewStub$message_list_release().f(i);
    }

    public final void t(ws0 ws0) {
        TextPaint paint;
        int i = ws0.a.i;
        xs0 xs0 = ws0.c;
        this.y0 = xs0.f;
        Lazy lazy = this.G0;
        boolean isInitialized = lazy.isInitialized();
        js9 js9 = fu4.k;
        if (isInitialized) {
            js9.e(getContext()).f().a().l().c.getClass();
            iq.a0((Drawable) lazy.getValue(), -1);
        }
        Lazy lazy2 = this.I0;
        if (lazy2.isInitialized()) {
            js9.e(getContext()).f().a().l().c.getClass();
            iq.a0((Drawable) lazy2.getValue(), -1);
        }
        Layout layout = this.R0;
        zs0 zs0 = ws0.b;
        if (!(layout == null || (paint = layout.getPaint()) == null)) {
            paint.setColor(zs0.d);
        }
        this.Q0.setTextColor(zs0.e);
        Lazy lazy3 = this.K0;
        if (lazy3.isInitialized()) {
            ((fm5) lazy3.getValue()).b(ws0);
        }
        Lazy lazy4 = this.L0;
        boolean isInitialized2 = lazy4.isInitialized();
        ShapeDrawable shapeDrawable = this.J0;
        if (isInitialized2) {
            ImageView imageView = (ImageView) lazy4.getValue();
            if (imageView.getDrawable() instanceof a10) {
                Drawable drawable = imageView.getDrawable();
                a10 a10 = drawable instanceof a10 ? (a10) drawable : null;
                if (a10 != null) {
                    a10.b(this.y0);
                }
            } else {
                imageView.setBackground(shapeDrawable);
                imageView.setImageTintList(ColorStateList.valueOf(getPreviewActionIconColor()));
            }
        }
        shapeDrawable.getPaint().setColor(getPreviewActionIconBackgroundColor());
        getDate$message_list_release().setTextColor(xs0.a);
        invalidate();
    }

    public final void u(Lazy lazy) {
        if (lazy.isInitialized()) {
            ImageView imageView = (ImageView) lazy.getValue();
            bl5 model = getModel();
            al5 al5 = null;
            al5 al52 = model != null ? model.j : null;
            al5 al53 = al5.b;
            if (al52 == al53) {
                Drawable drawable = (Drawable) this.H0.getValue();
                iq.a0(drawable, getPreviewActionIconColor());
                imageView.setImageDrawable(drawable);
                imageView.setBackground(this.J0);
            }
            bl5 model2 = getModel();
            if (model2 != null) {
                al5 = model2.j;
            }
            imageView.setVisibility(al5 == al53 ? 0 : 8);
        }
    }

    public final void v(Lazy lazy, float f) {
        Drawable drawable = (Drawable) this.I0.getValue();
        int previewActionIconColor = getPreviewActionIconColor();
        ImageView imageView = (ImageView) lazy.getValue();
        if (!(imageView.getDrawable() instanceof a10)) {
            a10 a10 = new a10();
            a10.a = drawable;
            a10.invalidateSelf();
            a10.b(previewActionIconColor);
            a10.e = true;
            a10.invalidateSelf();
            imageView.setImageDrawable(a10);
            imageView.setAdjustViewBounds(false);
        }
        imageView.getDrawable().setLevel((int) (f * ((float) 100)));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public final void w(Lazy lazy) {
        ImageView imageView = (ImageView) lazy.getValue();
        imageView.setAdjustViewBounds(false);
        Drawable drawable = (Drawable) this.G0.getValue();
        iq.a0(drawable, getPreviewActionIconColor());
        imageView.setImageDrawable(drawable);
        imageView.setBackground(this.J0);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
    }

    public final void x(bl5 bl5) {
        setModel(bl5);
    }

    public final void y(f00 f00) {
        bl5 model;
        vk5 vk5;
        if (f00 != null && (model = getModel()) != null && f00.a() == model.b) {
            setSubtitle(f00.b());
            boolean z = this.B0;
            boolean z2 = false;
            Lazy lazy = this.L0;
            if (z) {
                Lazy lazy2 = this.K0;
                if (lazy2.isInitialized()) {
                    ((fm5) lazy2.getValue()).setVisibility(8);
                }
                getBigPreviewActionIcon().setVisibility(0);
                if (f00 instanceof b00) {
                    v(lazy, ((b00) f00).b);
                } else if (f00 instanceof e00) {
                    v(lazy, ((e00) f00).b);
                } else if (f00 instanceof c00) {
                    w(lazy);
                } else if (f00 instanceof d00) {
                    u(lazy);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (lazy.isInitialized()) {
                    ((ImageView) lazy.getValue()).setVisibility(8);
                }
                Lazy lazy3 = this.M0;
                if (lazy3.isInitialized()) {
                    ((s87) lazy3.getValue()).setVisibility(8);
                }
                this.P0.setVisibility(8);
                getActionIconView().setVisibility(0);
                if (f00 instanceof b00) {
                    getActionIconView().c(((b00) f00).b);
                } else if (f00 instanceof e00) {
                    getActionIconView().c(((e00) f00).b);
                } else if (f00 instanceof c00) {
                    fm5 actionIconView = getActionIconView();
                    short s = actionIconView.o;
                    actionIconView.o = 0;
                    if (s == 0) {
                        z2 = true;
                    }
                    boolean z3 = !z2;
                    ((Drawable) actionIconView.c.getValue()).invalidateSelf();
                    if (z3) {
                        actionIconView.requestLayout();
                        actionIconView.invalidate();
                    }
                } else if (f00 instanceof d00) {
                    fm5 actionIconView2 = getActionIconView();
                    bl5 model2 = getModel();
                    if (model2 == null || (vk5 = model2.f) == null) {
                        vk5 = vk5.UNKNOWN;
                    }
                    short s2 = actionIconView2.o;
                    actionIconView2.o = 2;
                    if (s2 == 2) {
                        z2 = true;
                    }
                    boolean z4 = !z2;
                    ((km5) actionIconView2.x.getValue()).a(vk5);
                    if (z4) {
                        actionIconView2.requestLayout();
                        actionIconView2.invalidate();
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    public final void z() {
        bl5 model = getModel();
        if (model != null) {
            this.R0 = model.e;
            setSubtitle(model.g);
            setPreview(model);
            setState(model);
        }
    }
}
