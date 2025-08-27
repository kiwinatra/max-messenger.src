package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import kotlin.KotlinVersion;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.uuid.Uuid;

/* renamed from: r89  reason: default package */
public final class r89 extends Drawable {
    public static final Paint A = new Paint(1);
    public static final ejd y = new Object();
    public static final /* synthetic */ KProperty[] z;
    public boolean a;
    public bt0 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public Drawable f;
    public boolean g;
    public int h;
    public final RectF i;
    public final RectF j;
    public final Path k;
    public Path l;
    public final float m;
    public final float n;
    public final float o;
    public final int p;
    public final float[] q;
    public int r;
    public LinearGradient s;
    public LinearGradient t;
    public final Matrix u;
    public final q89 v;
    public final q89 w;
    public float x;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, ejd] */
    static {
        Class<r89> cls = r89.class;
        z = new KProperty[]{rae.s(cls, "incomingBackgroundColor", "getIncomingBackgroundColor()[I", 0), rae.s(cls, "outgoingBackgroundColor", "getOutgoingBackgroundColor()[I", 0)};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r89(int[] iArr, int[] iArr2, boolean z2, bt0 bt0, boolean z3, boolean z4, int i2) {
        this(iArr, iArr2, z2, bt0, false, (i2 & 32) != 0 ? true : z3, (i2 & 64) != 0 ? true : z4, (Drawable) null, false, 0);
    }

    public static boolean b(r89 r89, boolean z2, bt0 bt0, boolean z3, boolean z4, int i2, boolean z5, int i3) {
        if ((i3 & 32) != 0) {
            i2 = r89.h;
        }
        if ((i3 & Uuid.SIZE_BITS) != 0) {
            z5 = false;
        }
        boolean z6 = (r89.d == z4 && r89.a == z2 && r89.b == bt0 && r89.e == z3 && Intrinsics.areEqual((Object) r89.f, (Object) null) && r89.g == z5) ? false : true;
        r89.c = false;
        r89.d = z4;
        r89.h = i2;
        r89.a = z2;
        r89.b = bt0;
        r89.e = z3;
        r89.f = null;
        r89.g = z5;
        if (z6) {
            r89.c(r89.getBounds());
        }
        return z6;
    }

    public final Path a() {
        Path path = this.l;
        return path == null ? this.k : path;
    }

    public final void c(Rect rect) {
        float f2;
        float[] fArr;
        Path path;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        bt0 bt0 = this.b;
        boolean z2 = this.a;
        boolean z3 = this.e;
        boolean z4 = this.g;
        float[] fArr2 = this.q;
        if (z3) {
            ArraysKt___ArraysJvmKt.fill$default(fArr2, this.n, 0, 0, 6, (Object) null);
            int i2 = bt0 == null ? -1 : s89.$EnumSwitchMapping$0[bt0.ordinal()];
            if (i2 != -1) {
                float f3 = this.m;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            } else if (z2) {
                                fArr2[0] = f3;
                                fArr2[1] = f3;
                            } else {
                                fArr2[3] = f3;
                                fArr2[2] = f3;
                            }
                        } else if (z2) {
                            fArr2[0] = f3;
                            fArr2[1] = f3;
                            fArr2[6] = f3;
                            fArr2[7] = f3;
                        } else {
                            fArr2[2] = f3;
                            fArr2[3] = f3;
                            fArr2[4] = f3;
                            fArr2[5] = f3;
                        }
                    } else if (z2) {
                        fArr2[7] = f3;
                        fArr2[6] = f3;
                    } else {
                        fArr2[5] = f3;
                        fArr2[4] = f3;
                    }
                } else if (z4) {
                    fArr2[4] = f3;
                    fArr2[5] = f3;
                    fArr2[6] = f3;
                    fArr2[7] = f3;
                }
            }
        }
        Path path2 = this.k;
        path2.reset();
        boolean z5 = this.c;
        int i3 = this.p;
        if (z5) {
            fArr = new float[9];
            int length = fArr2.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                fArr[i5] = fArr2[i4] - (vo4.c().getDisplayMetrics().density * 0.5f);
                i4++;
                i5++;
            }
            f2 = (float) i3;
        } else {
            f2 = c44.DEFAULT_ASPECT_RATIO;
            fArr = fArr2;
        }
        RectF rectF = this.i;
        rectF.set(((float) rect.left) + f2, ((float) rect.top) + f2, ((float) rect.right) - f2, (((float) rect.bottom) - f2) - this.x);
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(rectF, fArr, direction);
        if (this.c) {
            path = new Path();
            RectF rectF2 = this.j;
            float f4 = ((float) i3) / 2.0f;
            rectF2.set(((float) getBounds().left) + f4, ((float) getBounds().top) + f4, ((float) getBounds().right) - f4, ((float) getBounds().bottom) - f4);
            path.addRoundRect(rectF2, fArr2, direction);
        } else {
            path = null;
        }
        this.l = path;
        KProperty[] kPropertyArr = z;
        d((int[]) this.v.getValue(this, kPropertyArr[0]), rect);
        e((int[]) this.w.getValue(this, kPropertyArr[1]), rect);
    }

    public final void d(int[] iArr, Rect rect) {
        LinearGradient linearGradient = new LinearGradient(c44.DEFAULT_ASPECT_RATIO, 0.9f, 1.0f, 0.1f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.u;
        matrix.reset();
        matrix.setScale((float) rect.width(), (float) rect.height());
        matrix.postTranslate((float) rect.left, (float) rect.top);
        linearGradient.setLocalMatrix(matrix);
        this.s = linearGradient;
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        if (su4.a(this) == 1) {
            float f2 = (float) 2;
            canvas.scale(-1.0f, 1.0f, ((float) getBounds().width()) / f2, ((float) getBounds().height()) / f2);
        }
        boolean z2 = this.d;
        Path path = this.k;
        Paint paint = A;
        if (z2 && this.f == null) {
            paint.setShader(this.a ? this.s : this.t);
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha(this.r);
            canvas.drawPath(path, paint);
        }
        if (this.f != null) {
            int save = canvas.save();
            canvas.clipPath(path);
            try {
                Drawable drawable = this.f;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
        if (this.c) {
            paint.setShader((Shader) null);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.h);
            paint.setStrokeWidth(this.o);
            paint.setAlpha(this.r);
            Path path2 = this.l;
            if (path2 != null) {
                canvas.drawPath(path2, paint);
            }
        }
        canvas.restore();
    }

    public final void e(int[] iArr, Rect rect) {
        LinearGradient linearGradient = new LinearGradient(c44.DEFAULT_ASPECT_RATIO, 0.9f, 1.0f, 0.1f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.u;
        matrix.reset();
        matrix.setScale((float) rect.width(), (float) rect.height());
        matrix.postTranslate((float) rect.left, (float) rect.top);
        linearGradient.setLocalMatrix(matrix);
        this.t = linearGradient;
    }

    public final int getOpacity() {
        return -1;
    }

    public final void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(a());
            outline.setAlpha(c44.DEFAULT_ASPECT_RATIO);
            return;
        }
        super.getOutline(outline);
    }

    public final void onBoundsChange(Rect rect) {
        c(rect);
    }

    public final void setAlpha(int i2) {
        this.r = i2;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public r89(int[] iArr, int[] iArr2, boolean z2, bt0 bt0, boolean z3, boolean z4, boolean z5, Drawable drawable, boolean z6, int i2) {
        float[] fArr;
        this.a = z2;
        this.b = bt0;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = drawable;
        this.g = z6;
        this.h = i2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Path();
        this.m = vo4.c().getDisplayMetrics().density * 6.0f;
        this.n = vo4.c().getDisplayMetrics().density * 16.0f;
        this.o = vo4.c().getDisplayMetrics().density * 2.0f;
        this.p = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
        if (this.e) {
            fArr = new float[8];
            for (int i3 = 0; i3 < 8; i3++) {
                fArr[i3] = this.n;
            }
        } else {
            fArr = new float[8];
        }
        this.q = fArr;
        this.r = KotlinVersion.MAX_COMPONENT_VALUE;
        this.u = new Matrix();
        Delegates delegates = Delegates.INSTANCE;
        this.v = new q89(iArr, this, 0);
        this.w = new q89(iArr2, this, 1);
    }
}
