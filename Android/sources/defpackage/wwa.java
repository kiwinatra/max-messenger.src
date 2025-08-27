package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: wwa  reason: default package */
public final class wwa extends FrameLayout implements phf {
    public static final /* synthetic */ KProperty[] w;
    public final vwa a = new vwa(this, 0);
    public final vwa b;
    public final yza c;
    public final ShapeDrawable o;
    public final RippleDrawable v;

    static {
        Class<wwa> cls = wwa.class;
        w = new KProperty[]{rae.s(cls, "size", "getSize()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton$Size;", 0), rae.s(cls, "mode", "getMode()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton$Mode;", 0)};
    }

    public wwa(Context context) {
        super(context, (AttributeSet) null);
        Delegates delegates = Delegates.INSTANCE;
        uwa uwa = uwa.a;
        twa twa = twa.a;
        this.b = new vwa(this, 1);
        yza yza = new yza(context, (AttributeSet) null);
        yza.setId(dad.i);
        this.c = yza;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.o = shapeDrawable;
        int i = fu4.k.e(getContext()).f().b().a.c;
        this.v = new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, new ColorDrawable(-65536));
        addView(yza);
        b();
        c();
    }

    public final void a(float f, int i, String str) {
        Drawable D = iq.D(getContext(), i);
        if (D != null) {
            yza yza = this.c;
            yza.setImageDrawable(D);
            yza.b = b59.p(str);
            yza.a = f;
            yza.invalidate();
        }
    }

    public final void b() {
        int i;
        js9 js9 = fu4.k;
        js9.e(getContext()).f().getIcon().getClass();
        this.c.setImageTintList(ColorStateList.valueOf(-1));
        int ordinal = getMode().ordinal();
        if (ordinal == 0) {
            i = js9.e(getContext()).f().c().e;
        } else if (ordinal == 1) {
            i = 0;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.o.getPaint().setColor(i);
        js9.e(getContext()).f().c().getClass();
        ColorStateList valueOf = ColorStateList.valueOf(-1728053248);
        RippleDrawable rippleDrawable = this.v;
        rippleDrawable.setColor(valueOf);
        setBackground(rippleDrawable);
        invalidate();
    }

    public final void c() {
        int i;
        int i2;
        int ordinal = getSize().ordinal();
        if (ordinal == 0) {
            i = 24;
        } else if (ordinal == 1) {
            i = 32;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int roundToInt = MathKt.roundToInt(((float) i) * vo4.c().getDisplayMetrics().density);
        this.c.setLayoutParams(new FrameLayout.LayoutParams(roundToInt, roundToInt));
        int ordinal2 = getSize().ordinal();
        if (ordinal2 == 0) {
            i2 = 8;
        } else if (ordinal2 == 1) {
            i2 = 10;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int roundToInt2 = MathKt.roundToInt(((float) i2) * vo4.c().getDisplayMetrics().density);
        setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
        setOutlineProvider(new n04((float) roundToInt));
        requestLayout();
        invalidate();
    }

    public final twa getMode() {
        return (twa) this.b.getValue(this, w[1]);
    }

    public final uwa getSize() {
        return (uwa) this.a.getValue(this, w[0]);
    }

    public final void onThemeChanged(k2b k2b) {
        b();
    }

    public final void setMode(twa twa) {
        this.b.setValue(this, w[1], twa);
    }

    public final void setSize(uwa uwa) {
        this.a.setValue(this, w[0], uwa);
    }
}
