package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* renamed from: q43  reason: default package */
public final class q43 {
    public static final /* synthetic */ KProperty[] k = {rae.s(q43.class, "imageAttaches", "getImageAttaches()Ljava/util/List;", 0)};
    public final Context a;
    public final View b;
    public int c;
    public int d;
    public final qr0 e = new qr0();
    public final bl f;
    public Function1 g;
    public float[] h;
    public final int i;
    public final ts j;

    /* JADX WARNING: type inference failed for: r3v12, types: [qae, ts] */
    public q43(Context context, View view) {
        this.a = context;
        this.b = view;
        Delegates delegates = Delegates.INSTANCE;
        this.f = new bl(6, CollectionsKt.emptyList(), this);
        this.g = new gl1(27);
        this.h = ld8.b;
        this.i = MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density);
        view.addOnAttachStateChangeListener(new el(3, this));
        this.j = new qae(0);
    }

    public static int d(int i2) {
        return (int) ((float) Math.rint((double) (((float) i2) * 0.4f)));
    }

    public final l43 a(int i2, int i3) {
        z7d e2;
        int length = this.h.length;
        int i4 = 0;
        while (i4 < length) {
            mv4 c2 = this.e.c(i4);
            q87 q87 = c2 instanceof q87 ? (q87) c2 : null;
            if (q87 == null || (e2 = q87.e()) == null || !e2.getBounds().contains(i2, i3)) {
                i4++;
            } else {
                l43 l43 = (l43) CollectionsKt.getOrNull((List) this.f.getValue(this, k[0]), i4);
                if (l43 == null) {
                    return null;
                }
                return l43;
            }
        }
        return null;
    }

    public final void b(int i2) {
        z7d e2;
        int length = this.h.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            qr0 qr0 = this.e;
            mv4 c2 = qr0.c(i4);
            q87 q87 = c2 instanceof q87 ? (q87) c2 : null;
            if (!(q87 == null || (e2 = q87.e()) == null)) {
                int i5 = q87.x + i3;
                int i6 = this.c;
                int i7 = this.i;
                if (i5 > i6) {
                    i2 += ((q87) qr0.c(i4 - 1)).y + i7;
                    i3 = 0;
                }
                e2.setBounds(i3, i2, q87.x + i3, q87.y + i2);
                i3 += q87.x + i7;
            }
        }
    }

    public final void c(int i2) {
        double d2;
        int i3;
        qr0 qr0;
        int i4;
        int i5;
        int i6;
        int i7 = i2;
        if (this.h.length != 0) {
            qr0 qr02 = this.e;
            if (((ArrayList) qr02.b).size() > 0) {
                this.d = 0;
                float f2 = (float) i7;
                double d3 = (double) (0.45f * f2);
                double d4 = (double) (f2 * 0.6f);
                int coerceIn = RangesKt.coerceIn((int) ((float) Math.rint((double) (((float) ((int) ((float) Math.rint(d3)))) / ArraysKt.first(this.h)))), (int) ((float) Math.rint(d3)), (int) ((float) Math.rint(d4)));
                int length = this.h.length;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int i11 = this.i;
                    if (i8 < length) {
                        mv4 c2 = qr02.c(i8);
                        q87 q87 = c2 instanceof q87 ? (q87) c2 : null;
                        if (q87 == null) {
                            qr0 = qr02;
                            i3 = length;
                            d2 = d3;
                        } else {
                            float f3 = (float) coerceIn;
                            qr0 = qr02;
                            int rint = (int) ((float) Math.rint((double) (this.h[i8] * f3)));
                            int i12 = coerceIn;
                            boolean z = ArraysKt.first(this.h) > 1.0f && i8 == 0;
                            i3 = length;
                            boolean z2 = i8 == ArraysKt.getLastIndex(this.h);
                            float[] fArr = this.h;
                            d2 = d3;
                            boolean z3 = i8 < fArr.length - 1 && Float.compare(fArr[i8], fArr[i8 + 1]) == 0;
                            if (z || z2) {
                                coerceIn = (!z || this.h.length <= 3) ? i12 : (int) ((float) Math.rint(d4));
                                i6 = i7 - i9;
                                i5 = 1;
                                i4 = 1;
                            } else {
                                if (z3 && i10 == 0) {
                                    i6 = i7 / 2;
                                } else if (i10 == 1) {
                                    i6 = i7 - i9;
                                } else {
                                    int i13 = i7 - i9;
                                    i6 = i13 - rint < d(i2) ? i13 - d(i2) < d(i2) ? i13 : i13 - d(i2) : rint < d(i2) ? d(i2) : (int) ((float) Math.rint((double) (f3 * this.h[i8])));
                                }
                                coerceIn = i12;
                                i5 = 1;
                                i4 = 0;
                            }
                            if (!(i10 == i5 && i4 == 0)) {
                                i5 = i4;
                            }
                            q87.y = coerceIn;
                            q87.x = i6;
                            i10++;
                            i9 += i6 + i11;
                            if (i5 != 0) {
                                this.d = coerceIn + i11 + this.d;
                                coerceIn = RangesKt.coerceIn((int) ((float) Math.rint((double) (((float) ((int) ((float) Math.rint(d2)))) / this.h[i8]))), (int) ((float) Math.rint(d2)), (int) ((float) Math.rint(d4)));
                                i9 = 0;
                                i10 = 0;
                            }
                        }
                        i8++;
                        qr02 = qr0;
                        length = i3;
                        d3 = d2;
                    } else {
                        this.d -= i11;
                        this.c = i7;
                        return;
                    }
                }
            }
        }
    }

    public final void e(int[] iArr, int i2, int i3) {
        cob cob;
        z7d e2;
        int length = this.h.length;
        int i4 = 0;
        while (i4 < length) {
            mv4 c2 = this.e.c(i4);
            q87 q87 = c2 instanceof q87 ? (q87) c2 : null;
            if (q87 == null || (cob = (cob) this.j.get(q87)) == null || (e2 = q87.e()) == null || !e2.getBounds().contains(i2, i3)) {
                i4++;
            } else {
                cob.setHotspot((float) cob.getBounds().centerX(), (float) cob.getBounds().centerY());
                cob.setState(iArr);
                return;
            }
        }
    }

    public final void f() {
        for (Map.Entry value : this.j.entrySet()) {
            ((cob) value.getValue()).onThemeChanged(fu4.k.e(this.a).f());
        }
    }

    public final boolean g(Drawable drawable) {
        int i2 = 0;
        while (true) {
            qr0 qr0 = this.e;
            if (i2 >= ((ArrayList) qr0.b).size()) {
                return CollectionsKt.contains(this.j.values(), drawable);
            }
            if (drawable == qr0.c(i2).e()) {
                break;
            }
            i2++;
        }
    }
}
