package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: ita  reason: default package */
public final class ita extends View {
    public static final /* synthetic */ KProperty[] o = {rae.s(ita.class, "appearance", "getAppearance()Lone/me/common/dot/OneMeDot$Appearance;", 0)};
    public final int a = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
    public final bl b;
    public final Paint c;

    public ita(Context context) {
        super(context, (AttributeSet) null);
        int i;
        Delegates delegates = Delegates.INSTANCE;
        hta hta = hta.a;
        this.b = new bl(this);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        hta appearance = getAppearance();
        k2b f = fu4.k.e(getContext()).f();
        int ordinal = appearance.ordinal();
        if (ordinal == 0) {
            f.c().a.getClass();
            i = -16745729;
        } else if (ordinal == 1) {
            i = f.c().a.c;
        } else if (ordinal == 2) {
            i = f.c().a.g;
        } else if (ordinal == 3) {
            i = f.c().a.e;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        paint.setColor(i);
        this.c = paint;
    }

    public final hta getAppearance() {
        return (hta) this.b.getValue(this, o[0]);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = (float) getMeasuredWidth();
        float measuredHeight = (float) getMeasuredHeight();
        int i = this.a;
        canvas.drawRoundRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, measuredWidth, measuredHeight, ((float) i) / 2.0f, ((float) i) / 2.0f, this.c);
    }

    public final void onMeasure(int i, int i2) {
        int i3 = this.a;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public final void setAppearance(hta hta) {
        this.b.setValue(this, o[0], hta);
    }
}
