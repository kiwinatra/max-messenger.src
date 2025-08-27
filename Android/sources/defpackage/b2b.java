package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;

/* renamed from: b2b  reason: default package */
public final class b2b extends LinearLayout implements phf {
    public static final /* synthetic */ KProperty[] y;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final a2b v = new a2b(this);
    public final a2b w = new a2b((woa) woa.g.getValue(), this);
    public i8f x = b59.c0(getTabItem().c, fu4.k.e(getContext()).f());

    static {
        Class<b2b> cls = b2b.class;
        y = new KProperty[]{rae.s(cls, "isIndicatorVisible", "isIndicatorVisible()Z", 0), rae.s(cls, "tabItem", "getTabItem()Lone/me/common/tablayout/model/OneMeBaseTabItemModel;", 0)};
    }

    public b2b(Context context) {
        super(context, (AttributeSet) null);
        a1b a1b = new a1b(context, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = LazyKt.lazy(lazyThreadSafetyMode, a1b);
        this.b = LazyKt.lazy(lazyThreadSafetyMode, new a1b(context, 5));
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new a1b(context, 6));
        this.o = LazyKt.lazy(lazyThreadSafetyMode, new vra(2, context, this));
        Delegates delegates = Delegates.INSTANCE;
        setOrientation(0);
        setGravity(17);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        setClipToPadding(false);
    }

    public static final void a(b2b b2b) {
        b2b.setText(b2b.getTabItem().b);
        b2b.x = b59.c0(b2b.getTabItem().c, fu4.k.e(b2b.getContext()).f());
        Drawable drawable = b2b.getTabItem().e;
        Lazy lazy = b2b.b;
        if (drawable != null) {
            ImageView imageView = (ImageView) lazy.getValue();
            imageView.setImageDrawable(drawable);
            y7e.c(b2b, imageView, Integer.valueOf(b2b.b(imageView.getId())));
        }
        boolean booleanValue = ((Boolean) b2b.v.getValue(b2b, y[0])).booleanValue();
        Lazy lazy2 = b2b.o;
        Lazy lazy3 = b2b.c;
        if (booleanValue) {
            bs0 bs0 = b2b.getTabItem().d;
            if (bs0 instanceof soa) {
                wsa wsa = (wsa) lazy3.getValue();
                y7e.c(b2b, wsa, Integer.valueOf(b2b.b(wsa.getId())));
            } else {
                int i = 8;
                if (Intrinsics.areEqual((Object) bs0, (Object) toa.n)) {
                    ita ita = (ita) lazy2.getValue();
                    if (b2b.x.d) {
                        i = 0;
                    }
                    ita.setVisibility(i);
                    y7e.c(b2b, ita, Integer.valueOf(b2b.b(ita.getId())));
                } else if (Intrinsics.areEqual((Object) bs0, (Object) uoa.n)) {
                    if (lazy2.isInitialized()) {
                        ((ita) lazy2.getValue()).setVisibility(8);
                    }
                    if (lazy3.isInitialized()) {
                        ((wsa) lazy3.getValue()).setVisibility(8);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        b2b.c();
        boolean isInitialized = lazy.isInitialized();
        Lazy lazy4 = b2b.a;
        if (isInitialized) {
            ImageView imageView2 = (ImageView) lazy.getValue();
            if (imageView2.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginEnd(MathKt.roundToInt(((y7e.L(lazy4) || y7e.L(lazy2) || y7e.L(lazy3)) ? (float) 4 : (float) 0) * vo4.c().getDisplayMetrics().density));
                    Unit unit = Unit.INSTANCE;
                    imageView2.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }
        if (lazy4.isInitialized()) {
            TextView textView = (TextView) lazy4.getValue();
            if (textView.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMarginEnd(MathKt.roundToInt(((y7e.L(lazy2) || y7e.L(lazy3)) ? (float) 4 : (float) 0) * vo4.c().getDisplayMetrics().density));
                    Unit unit2 = Unit.INSTANCE;
                    textView.setLayoutParams(marginLayoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }
        b2b.requestLayout();
        b2b.invalidate();
    }

    public static /* synthetic */ void getTabItem$annotations() {
    }

    private final void setText(CharSequence charSequence) {
        TextView textView = (TextView) this.a.getValue();
        textView.setText(charSequence);
        y7e.c(this, textView, Integer.valueOf(b(textView.getId())));
    }

    public final int b(int i) {
        if (i == dad.v0) {
            return 0;
        }
        if (i == dad.x0) {
            return SequencesKt.count(cjf.x(this)) / 2;
        }
        if (i == dad.w0) {
            return SequencesKt.count(cjf.x(this)) - 1;
        }
        return -1;
    }

    public final void c() {
        qsa qsa;
        Lazy lazy = this.a;
        if (lazy.isInitialized()) {
            ((TextView) lazy.getValue()).setTextColor(this.x.b);
        }
        Lazy lazy2 = this.b;
        if (lazy2.isInitialized()) {
            ((ImageView) lazy2.getValue()).setImageTintList(ColorStateList.valueOf(this.x.a));
        }
        int i = 0;
        if (((Boolean) this.v.getValue(this, y[0])).booleanValue()) {
            bs0 bs0 = getTabItem().d;
            boolean areEqual = Intrinsics.areEqual((Object) bs0, (Object) toa.n);
            Lazy lazy3 = this.o;
            if (!areEqual) {
                boolean z = bs0 instanceof soa;
                Lazy lazy4 = this.c;
                if (z) {
                    boolean z2 = this.x.d && ((soa) bs0).n != 0;
                    if (lazy4.isInitialized()) {
                        wsa wsa = (wsa) lazy4.getValue();
                        if (!z2) {
                            i = 8;
                        }
                        wsa.setVisibility(i);
                        int ordinal = getTabItem().c.ordinal();
                        if (ordinal == 0) {
                            qsa = qsa.a;
                        } else if (ordinal == 1) {
                            qsa = qsa.c;
                        } else if (ordinal == 2) {
                            qsa = qsa.a;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        wsa.setAppearance(qsa);
                        wsa.g(((soa) bs0).n, true);
                    }
                } else if (Intrinsics.areEqual((Object) bs0, (Object) uoa.n)) {
                    if (lazy4.isInitialized()) {
                        ((wsa) lazy4.getValue()).setVisibility(8);
                    }
                    if (lazy3.isInitialized()) {
                        ((ita) lazy3.getValue()).setVisibility(8);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (lazy3.isInitialized()) {
                ita ita = (ita) lazy3.getValue();
                if (!this.x.d) {
                    i = 8;
                }
                ita.setVisibility(i);
            }
        }
    }

    public final woa getTabItem() {
        return (woa) this.w.getValue(this, y[1]);
    }

    public final void onThemeChanged(k2b k2b) {
        this.x = b59.c0(getTabItem().c, k2b);
        c();
        fu4.e(fu4.k.e(getContext()), this);
    }

    public final void setIndicatorVisible(boolean z) {
        this.v.setValue(this, y[0], Boolean.valueOf(z));
    }

    public void setSelected(boolean z) {
        if (z != isSelected()) {
            setTabItem(woa.a(getTabItem(), z ? voa.a : voa.b));
        }
        super.setSelected(z);
    }

    public final void setTabItem(woa woa) {
        this.w.setValue(this, y[1], woa);
    }
}
