package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* renamed from: nqc  reason: default package */
public final class nqc extends ViewGroup implements phf {
    public static final /* synthetic */ KProperty[] A0;
    public static final Lazy B0 = LazyKt.lazy(new mxb(14));
    public static final ece z0 = new ece(17);
    public boolean a;
    public ValueAnimator b;
    public final Paint c = new Paint(1);
    public float o = -1.0f;
    public int v;
    public final wsa v0;
    public int w;
    public final mqc w0;
    public int x;
    public final mqc x0;
    public int y;
    public final mqc y0;
    public final TextView z;

    static {
        Class<nqc> cls = nqc.class;
        A0 = new KProperty[]{rae.s(cls, "isOwn", "isOwn()Z", 0), rae.s(cls, "reaction", "getReaction()Lru/ok/tamtam/models/message/reactions/Reaction;", 0), rae.s(cls, NewHtcHomeBadger.COUNT, "getCount()I", 0)};
    }

    public nqc(Context context) {
        super(context);
        TextView textView = new TextView(context);
        ogf ogf = puf.a;
        tr2.a.b(textView, uy4.b);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setTextColor(-1);
        this.z = textView;
        wsa wsa = new wsa(context);
        wsa.setHasBackground(false);
        z0.getClass();
        wsa.setReplaceInterpolator((PathInterpolator) B0.getValue());
        wsa.setTypography(tr2.h);
        this.v0 = wsa;
        Delegates delegates = Delegates.INSTANCE;
        this.w0 = new mqc(this, 0);
        this.x0 = new mqc(new hqc(""), this);
        this.y0 = new mqc(this, 2);
        setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 48.0f));
        addView(textView);
        addView(wsa);
    }

    private final float getEmojiCenterX() {
        TextView textView = this.z;
        return (((float) textView.getWidth()) / 2.0f) + ((float) textView.getLeft());
    }

    public final void a(boolean z2) {
        float f;
        long j;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        float measuredWidth = ((float) getMeasuredWidth()) - getEmojiCenterX();
        int i = (this.o > -1.0f ? 1 : (this.o == -1.0f ? 0 : -1));
        float f2 = c44.DEFAULT_ASPECT_RATIO;
        if (i == 0) {
            this.o = z2 ? measuredWidth : 0.0f;
        }
        float f3 = this.o;
        Float valueOf = Float.valueOf(f3);
        if (!(!(f3 == c44.DEFAULT_ASPECT_RATIO))) {
            valueOf = null;
        }
        float floatValue = valueOf != null ? valueOf.floatValue() : measuredWidth;
        if (!z2) {
            floatValue = this.o;
        }
        if (!z2) {
            f2 = measuredWidth;
        }
        Pair pair = TuplesKt.to(Float.valueOf(floatValue), Float.valueOf(f2));
        float floatValue2 = ((Number) pair.component1()).floatValue();
        float floatValue3 = ((Number) pair.component2()).floatValue();
        if (z2) {
            f = this.o / measuredWidth;
            j = 350;
        } else {
            f = ((float) 1) - (this.o / measuredWidth);
            j = 500;
        }
        long j2 = (long) (f * ((float) j));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue2, floatValue3});
        ofFloat.setDuration(j2);
        this.v0.setReplaceDuration(j2);
        z0.getClass();
        ofFloat.setInterpolator((PathInterpolator) B0.getValue());
        ofFloat.addUpdateListener(new z00(19, (Object) this));
        ofFloat.addListener(new lqc(this, floatValue2, 0));
        ofFloat.addListener(new uf(6, this));
        ofFloat.start();
        this.b = ofFloat;
    }

    public final boolean b() {
        return ((Boolean) this.w0.getValue(this, A0[0])).booleanValue();
    }

    public final void dispatchDraw(Canvas canvas) {
        boolean z2 = this.a;
        Paint paint = this.c;
        wsa wsa = this.v0;
        if (z2) {
            paint.setColor(this.w);
            canvas.drawRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getMeasuredWidth(), (float) getMeasuredHeight(), paint);
            float emojiCenterX = getEmojiCenterX();
            if (((float) ((int) this.o)) + emojiCenterX > ((float) wsa.getRight())) {
                wsa.setTextColor(this.x);
            } else {
                wsa.setTextColor(this.y);
            }
            paint.setColor(this.v);
            TextView textView = this.z;
            canvas.drawCircle(emojiCenterX, (((float) textView.getHeight()) / 2.0f) + ((float) textView.getTop()), this.o, paint);
        } else {
            paint.setColor(b() ? this.v : this.w);
            canvas.drawRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getMeasuredWidth(), (float) getMeasuredHeight(), paint);
            wsa.setTextColor(b() ? this.x : this.y);
        }
        super.dispatchDraw(canvas);
    }

    public final int getCount() {
        return ((Number) this.y0.getValue(this, A0[2])).intValue();
    }

    public final hqc getReaction() {
        return (hqc) this.x0.getValue(this, A0[1]);
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int roundToInt = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        TextView textView = this.z;
        ev0.x(textView, roundToInt, (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2), 0, 12);
        int e = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, textView.getMeasuredWidth(), roundToInt);
        wsa wsa = this.v0;
        ev0.x(wsa, e, (getMeasuredHeight() / 2) - (wsa.getMeasuredHeight() / 2), 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density), 1073741824);
        TextView textView = this.z;
        textView.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = textView.getMeasuredWidth();
        int e = tr1.e((float) 4, vo4.c().getDisplayMetrics().density, measuredWidth, MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density) * 2);
        wsa wsa = this.v0;
        wsa.measure(0, 0);
        setMeasuredDimension(wsa.getMeasuredWidth() + e, Math.max(MathKt.roundToInt(((float) 28) * vo4.c().getDisplayMetrics().density), wsa.getMeasuredHeight()));
    }

    public final void onThemeChanged(k2b k2b) {
    }

    public final void setCount(int i) {
        this.y0.setValue(this, A0[2], Integer.valueOf(i));
    }

    public final void setOnChipClickListener(Function1<? super hqc, Unit> function1) {
        ct.G(this, 300, new kqc(0, (Object) this, (Object) function1));
    }

    public final void setOwn(boolean z2) {
        this.w0.setValue(this, A0[0], Boolean.valueOf(z2));
    }

    public final void setReaction(hqc hqc) {
        this.x0.setValue(this, A0[1], hqc);
    }
}
