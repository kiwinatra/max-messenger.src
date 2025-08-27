package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* renamed from: d77  reason: default package */
public final class d77 extends View {
    public final Function1 a;
    public Drawable b = ew3.b(getContext(), cad.e2);
    public float c;
    public final Rect o = new Rect();
    public final int v = 3;
    public final float w = 0.9f;
    public final Paint x;
    public final Matrix y;
    public final int[] z;

    public d77(Context context, Function1 function1) {
        super(context, (AttributeSet) null);
        this.a = function1;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.x = paint;
        this.y = new Matrix();
        this.z = new int[]{i8b.Y(0.75f, 0), -16777216};
    }

    public final void a(Canvas canvas, float f, float f2, float f3, int i, b77 b77) {
        List list;
        Drawable.ConstantState constantState;
        int i2 = i;
        b77 b772 = b77;
        if (i2 < this.v) {
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i3 * 45;
                double radians = Math.toRadians((double) i4);
                b77 b773 = b77.o;
                if (b772 == b773 || b772.a.contains(Double.valueOf(radians))) {
                    float cos = (((float) Math.cos(radians)) * f3) + f;
                    float sin = (((float) Math.sin(radians)) * f3) + f2;
                    float roundToInt = (float) (MathKt.roundToInt(((float) ((Number) this.a.invoke((b772 != b773 || i4 % 90 == 0) ? Integer.valueOf(i) : Integer.valueOf(i2 + 1))).intValue()) * vo4.c().getDisplayMetrics().density) / 2);
                    int i5 = (int) (sin + roundToInt);
                    Rect rect = this.o;
                    rect.set((int) (cos - roundToInt), (int) (sin - roundToInt), (int) (cos + roundToInt), i5);
                    Drawable drawable = this.b;
                    Drawable newDrawable = (drawable == null || (constantState = drawable.getConstantState()) == null) ? null : constantState.newDrawable();
                    if (newDrawable != null) {
                        newDrawable.setBounds(rect);
                    }
                    Canvas canvas2 = canvas;
                    if (newDrawable != null) {
                        newDrawable.draw(canvas);
                    }
                    rect.setEmpty();
                } else {
                    Canvas canvas3 = canvas;
                }
            }
            Canvas canvas4 = canvas;
            int i6 = c77.$EnumSwitchMapping$0[b77.ordinal()];
            if (i6 == 1) {
                list = CollectionsKt.listOf(Double.valueOf(Math.toRadians(180.0d)));
            } else if (i6 == 2) {
                list = CollectionsKt.listOf(Double.valueOf(Math.toRadians(0.0d)));
            } else if (i6 == 3) {
                list = CollectionsKt.listOf(Double.valueOf(Math.toRadians(180.0d)), Double.valueOf(Math.toRadians(0.0d)));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Iterable<Number> iterable = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (Number doubleValue : iterable) {
                double doubleValue2 = doubleValue.doubleValue();
                arrayList.add(new Pair(Float.valueOf((((float) Math.cos(doubleValue2)) * f3) + f), Float.valueOf((((float) Math.sin(doubleValue2)) * f3) + f2)));
            }
            int ordinal = b77.ordinal();
            float f4 = this.w;
            if (ordinal == 0) {
                Pair pair = (Pair) arrayList.get(0);
                a(canvas, ((Number) pair.component1()).floatValue(), ((Number) pair.component2()).floatValue(), f3 * f4, i2 + 1, b77.b);
            } else if (ordinal == 1) {
                Pair pair2 = (Pair) arrayList.get(0);
                a(canvas, ((Number) pair2.component1()).floatValue(), ((Number) pair2.component2()).floatValue(), f3 * f4, i2 + 1, b77.c);
            } else if (ordinal == 2) {
                Pair pair3 = (Pair) arrayList.get(0);
                float floatValue = ((Number) pair3.component1()).floatValue();
                float floatValue2 = ((Number) pair3.component2()).floatValue();
                Pair pair4 = (Pair) arrayList.get(1);
                float floatValue3 = ((Number) pair4.component1()).floatValue();
                float floatValue4 = ((Number) pair4.component2()).floatValue();
                float f5 = f3 * f4;
                int i7 = i2 + 1;
                Canvas canvas5 = canvas;
                float f6 = floatValue2;
                float f7 = f5;
                int i8 = i7;
                a(canvas5, floatValue, f6, f7, i8, b77.b);
                a(canvas5, floatValue3, floatValue4, f7, i8, b77.c);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        float f = width;
        float f2 = height;
        RadialGradient radialGradient = new RadialGradient(f, f2, Math.max(width, height), this.z, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.y;
        matrix.reset();
        matrix.setScale(1.0f, 0.4f, width, height);
        radialGradient.setLocalMatrix(matrix);
        Paint paint = this.x;
        paint.setShader(radialGradient);
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        a(canvas2, width, height, this.c, 0, b77.o);
        canvas2.drawRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getWidth(), (float) getHeight(), paint);
        canvas.drawBitmap(createBitmap, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (Paint) null);
    }

    public final void setIcon$common_release(Drawable drawable) {
        this.b = drawable;
        invalidate();
    }

    public final void setInitialRadius$common_release(float f) {
        this.c = f;
        invalidate();
    }

    public final void setIcon$common_release(int i) {
        this.b = ew3.b(getContext(), i);
        invalidate();
    }
}
