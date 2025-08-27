package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: o7e  reason: default package */
public final class o7e extends Drawable implements Animatable, phf {
    public static final float[] A0 = {c44.DEFAULT_ASPECT_RATIO, 359.0f};
    public static final /* synthetic */ KProperty[] y0;
    public static final float[] z0 = {1.0f, 0.33f, 1.0f};
    public final n7e X;
    public final n7e Y;
    public final n7e Z;
    public final Context a;
    public final ShapeDrawable[] b;
    public final Pair[] c;
    public final o8c o;
    public final o8c v;
    public final n7e v0;
    public final ObjectAnimator w;
    public final n7e w0;
    public final ObjectAnimator x;
    public final n7e x0;
    public final n7e y;
    public final n7e z;

    static {
        Class<o7e> cls = o7e.class;
        y0 = new KProperty[]{rae.s(cls, "colorState", "getColorState()Lone/me/sdk/uikit/common/emptyview/ShineAnimatedDrawable$Companion$ColorState;", 0), rae.s(cls, "rotationValues", "getRotationValues()[F", 0), rae.s(cls, "rotationDirection", "getRotationDirection()Lone/me/sdk/uikit/common/emptyview/ShineAnimatedDrawable$Companion$RotateDirection;", 0), rae.s(cls, "rotationDuration", "getRotationDuration()J", 0), rae.s(cls, "scaleValues", "getScaleValues()[F", 0), rae.s(cls, "scaleDuration", "getScaleDuration()J", 0), rae.s(cls, "shapeHeight", "getShapeHeight()Ljava/lang/Integer;", 0), rae.s(cls, "isScaleAnimationEnabled", "isScaleAnimationEnabled()Z", 0)};
    }

    public o7e(Context context) {
        this.a = context;
        js9 js9 = fu4.k;
        this.b = new ShapeDrawable[]{n54.a(js9.e(context).f().f().a.a), n54.a(js9.e(context).f().f().a.b), n54.a(js9.e(context).f().f().a.c), n54.a(js9.e(context).f().f().a.d)};
        Pair[] pairArr = new Pair[4];
        for (int i = 0; i < 4; i++) {
            pairArr[i] = TuplesKt.to(new o8c("x"), new o8c("y"));
        }
        this.c = pairArr;
        o8c o8c = new o8c("scaleXY", 1.0f);
        this.o = o8c;
        o8c o8c2 = new o8c("rotation", c44.DEFAULT_ASPECT_RATIO);
        this.v = o8c2;
        float[] fArr = z0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, o8c, Arrays.copyOf(fArr, fArr.length));
        ofFloat.setDuration(8000);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new k7e(this, 0));
        this.w = ofFloat;
        float[] fArr2 = A0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, o8c2, Arrays.copyOf(fArr2, fArr2.length));
        ofFloat2.setDuration(8000);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new k7e(this, 1));
        this.x = ofFloat2;
        Delegates delegates = Delegates.INSTANCE;
        l7e l7e = l7e.a;
        this.y = new n7e(this, 0);
        this.z = new n7e(fArr2, this, 1);
        m7e m7e = m7e.a;
        this.X = new n7e(this, 2);
        this.Y = new n7e(this, 3);
        this.Z = new n7e(fArr, this, 4);
        this.v0 = new n7e(this, 5);
        this.w0 = new n7e(this, 6);
        this.x0 = new n7e(this, 7);
    }

    public final void a(k2b k2b) {
        int[] iArr;
        int i = 0;
        int ordinal = ((l7e) this.y.getValue(this, y0[0])).ordinal();
        if (ordinal == 0) {
            iArr = new int[]{k2b.f().a.a, k2b.f().a.b, k2b.f().a.c, k2b.f().a.d};
        } else if (ordinal == 1) {
            iArr = new int[]{-12940805, -10285313, -5616385, -16745729};
        } else if (ordinal == 2) {
            iArr = new int[]{-16745729, -13908427, -14904446, -15024573};
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int length = iArr.length;
        int i2 = 0;
        while (i < length) {
            this.b[i2].getPaint().setColor(iArr[i]);
            i++;
            i2++;
        }
    }

    public final void b() {
        if (((Boolean) this.x0.getValue(this, y0[7])).booleanValue()) {
            ObjectAnimator objectAnimator = this.w;
            if (!objectAnimator.isRunning()) {
                objectAnimator.start();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void draw(Canvas canvas) {
        canvas.save();
        float centerX = (float) getBounds().centerX();
        float centerY = (float) getBounds().centerY();
        canvas.rotate(this.v.a, centerX, centerY);
        float f = this.o.a;
        canvas.scale(f, f, centerX, centerY);
        ShapeDrawable[] shapeDrawableArr = this.b;
        int length = shapeDrawableArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            ShapeDrawable shapeDrawable = shapeDrawableArr[i];
            int i3 = i2 + 1;
            Pair pair = this.c[i2];
            float f2 = ((o8c) pair.component1()).a;
            float f3 = ((o8c) pair.component2()).a;
            int save = canvas.save();
            canvas.translate(f2, f3);
            try {
                shapeDrawable.draw(canvas);
                canvas.restoreToCount(save);
                i++;
                i2 = i3;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.x.isRunning() || this.w.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        Integer num = (Integer) this.w0.getValue(this, y0[6]);
        int intValue = num != null ? num.intValue() : Math.min(rect.width() / 2, rect.height() / 2);
        int i = intValue / 2;
        int i2 = 0;
        for (ShapeDrawable shapeDrawable : this.b) {
            float f = (float) intValue;
            shapeDrawable.getShape().resize(f, f);
            shapeDrawable.setBounds(0, 0, intValue, intValue);
        }
        Pair[] pairArr = this.c;
        int length = pairArr.length;
        int i3 = 0;
        while (i2 < length) {
            Pair pair = pairArr[i2];
            int i4 = i3 + 1;
            float f2 = (float) i;
            double d = (double) (((float) i3) * 1.5707964f);
            float cos = (((float) Math.cos(d)) * f2) + ((float) (rect.left + i));
            float sin = (f2 * ((float) Math.sin(d))) + ((float) (rect.top + i));
            ((o8c) pair.getFirst()).a = cos;
            ((o8c) pair.getSecond()).a = sin;
            i2++;
            i3 = i4;
        }
    }

    public final void onThemeChanged(k2b k2b) {
        a(k2b);
    }

    public final void setAlpha(int i) {
        for (ShapeDrawable alpha : this.b) {
            alpha.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        for (ShapeDrawable paint : this.b) {
            paint.getPaint().setColorFilter(colorFilter);
        }
    }

    public final void start() {
        z68.c("ShineAnimatedDrawable", "start()", new Object[0]);
        b();
        this.x.start();
    }

    public final void stop() {
        z68.c("ShineAnimatedDrawable", "stop()", new Object[0]);
        ObjectAnimator objectAnimator = this.w;
        if (objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        this.x.cancel();
    }
}
