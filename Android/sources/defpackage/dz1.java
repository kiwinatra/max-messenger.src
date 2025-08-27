package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinVersion;

/* renamed from: dz1  reason: default package */
public final class dz1 extends Property {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dz1(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                gz1 gz1 = (gz1) obj;
                return null;
            case 1:
                gz1 gz12 = (gz1) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case 5:
                return Float.valueOf(((d13) obj).X);
            case 6:
                return Float.valueOf(((d13) obj).Y);
            case 7:
                return Float.valueOf(((av4) obj).b());
            case 8:
                return Float.valueOf(((uv7) obj).X);
            case 9:
                return Float.valueOf(((wv7) obj).Y);
            case 10:
                return Float.valueOf(((SwitchCompat) obj).L0);
            case 11:
                return Float.valueOf(((View) obj).getTransitionAlpha());
            default:
                return ((View) obj).getClipBounds();
        }
    }

    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                gz1 gz1 = (gz1) obj;
                PointF pointF = (PointF) obj2;
                gz1.getClass();
                gz1.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                gz1.b = round;
                int i = gz1.f + 1;
                gz1.f = i;
                if (i == gz1.g) {
                    int i2 = gz1.a;
                    int i3 = gz1.c;
                    int i4 = gz1.d;
                    dz1 dz1 = tcg.a;
                    gz1.e.setLeftTopRightBottom(i2, round, i3, i4);
                    gz1.f = 0;
                    gz1.g = 0;
                    return;
                }
                return;
            case 1:
                gz1 gz12 = (gz1) obj;
                PointF pointF2 = (PointF) obj2;
                gz12.getClass();
                gz12.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                gz12.d = round2;
                int i5 = gz12.g + 1;
                gz12.g = i5;
                if (gz12.f == i5) {
                    int i6 = gz12.a;
                    int i7 = gz12.b;
                    int i8 = gz12.c;
                    dz1 dz12 = tcg.a;
                    gz12.e.setLeftTopRightBottom(i6, i7, i8, round2);
                    gz12.f = 0;
                    gz12.g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                int left = view.getLeft();
                int top = view.getTop();
                int round3 = Math.round(pointF3.x);
                int round4 = Math.round(pointF3.y);
                dz1 dz13 = tcg.a;
                view.setLeftTopRightBottom(left, top, round3, round4);
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                int round5 = Math.round(pointF4.x);
                int round6 = Math.round(pointF4.y);
                int right = view2.getRight();
                int bottom = view2.getBottom();
                dz1 dz14 = tcg.a;
                view2.setLeftTopRightBottom(round5, round6, right, bottom);
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round7 = Math.round(pointF5.x);
                int round8 = Math.round(pointF5.y);
                dz1 dz15 = tcg.a;
                view3.setLeftTopRightBottom(round7, round8, view3.getWidth() + round7, view3.getHeight() + round8);
                return;
            case 5:
                d13 d13 = (d13) obj;
                float floatValue = ((Float) obj2).floatValue();
                d13.X = floatValue;
                int i9 = (int) (floatValue * 5400.0f);
                ArrayList arrayList = (ArrayList) d13.c;
                pv4 pv4 = (pv4) arrayList.get(0);
                float f = d13.X * 1520.0f;
                pv4.a = -20.0f + f;
                pv4.b = f;
                int i10 = 0;
                while (true) {
                    gh5 gh5 = d13.x;
                    if (i10 < 4) {
                        pv4.b = (gh5.getInterpolation(fbf.J(i9, d13.v0[i10], 667)) * 250.0f) + pv4.b;
                        pv4.a = (gh5.getInterpolation(fbf.J(i9, d13.w0[i10], 667)) * 250.0f) + pv4.a;
                        i10++;
                    } else {
                        float f2 = pv4.a;
                        float f3 = pv4.b;
                        pv4.a = (((f3 - f2) * d13.Y) + f2) / 360.0f;
                        pv4.b = f3 / 360.0f;
                        int i11 = 0;
                        while (true) {
                            if (i11 < 4) {
                                float J = fbf.J(i9, d13.x0[i11], 333);
                                if (J < c44.DEFAULT_ASPECT_RATIO || J > 1.0f) {
                                    i11++;
                                } else {
                                    int i12 = i11 + d13.z;
                                    int[] iArr = d13.y.c;
                                    int length = i12 % iArr.length;
                                    int i13 = iArr[length];
                                    int i14 = iArr[(1 + length) % iArr.length];
                                    float interpolation = gh5.getInterpolation(J);
                                    Integer valueOf = Integer.valueOf(i13);
                                    Integer valueOf2 = Integer.valueOf(i14);
                                    int intValue = valueOf.intValue();
                                    float f4 = ((float) ((intValue >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f;
                                    int intValue2 = valueOf2.intValue();
                                    float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f), 2.2d);
                                    float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f), 2.2d);
                                    float pow3 = (float) Math.pow((double) (((float) (intValue & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f), 2.2d);
                                    float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f), 2.2d);
                                    float f5 = i2a.f(((float) ((intValue2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f, f4, interpolation, f4);
                                    float f6 = i2a.f(pow4, pow, interpolation, pow);
                                    float f7 = i2a.f((float) Math.pow((double) (((float) ((intValue2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f), 2.2d), pow2, interpolation, pow2);
                                    ((pv4) arrayList.get(0)).c = Integer.valueOf(Math.round(((float) Math.pow((double) i2a.f((float) Math.pow((double) (((float) (intValue2 & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f), 2.2d), pow3, interpolation, pow3), 0.45454545454545453d)) * 255.0f) | (Math.round(((float) Math.pow((double) f6, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f5 * 255.0f) << 24) | (Math.round(((float) Math.pow((double) f7, 0.45454545454545453d)) * 255.0f) << 8)).intValue();
                                }
                            }
                        }
                        ((ue7) d13.b).invalidateSelf();
                        return;
                    }
                }
                break;
            case 6:
                ((d13) obj).Y = ((Float) obj2).floatValue();
                return;
            case 7:
                av4 av4 = (av4) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                if (av4.y != floatValue2) {
                    av4.y = floatValue2;
                    av4.invalidateSelf();
                    return;
                }
                return;
            case 8:
                uv7 uv7 = (uv7) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                uv7.X = floatValue3;
                ArrayList arrayList2 = (ArrayList) uv7.c;
                ((pv4) arrayList2.get(0)).a = c44.DEFAULT_ASPECT_RATIO;
                float J2 = fbf.J((int) (floatValue3 * 333.0f), 0, 667);
                gh5 gh52 = uv7.w;
                float interpolation2 = gh52.getInterpolation(J2);
                ((pv4) arrayList2.get(1)).a = interpolation2;
                ((pv4) arrayList2.get(0)).b = interpolation2;
                float interpolation3 = gh52.getInterpolation(J2 + 0.49925038f);
                ((pv4) arrayList2.get(2)).a = interpolation3;
                ((pv4) arrayList2.get(1)).b = interpolation3;
                ((pv4) arrayList2.get(2)).b = 1.0f;
                if (uv7.z && ((pv4) arrayList2.get(1)).b < 1.0f) {
                    ((pv4) arrayList2.get(2)).c = ((pv4) arrayList2.get(1)).c;
                    ((pv4) arrayList2.get(1)).c = ((pv4) arrayList2.get(0)).c;
                    ((pv4) arrayList2.get(0)).c = uv7.x.c[uv7.y];
                    uv7.z = false;
                }
                ((ue7) uv7.b).invalidateSelf();
                return;
            case 9:
                wv7 wv7 = (wv7) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                wv7.Y = floatValue4;
                int i15 = (int) (floatValue4 * 1800.0f);
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = (ArrayList) wv7.c;
                    if (i16 < arrayList3.size()) {
                        pv4 pv42 = (pv4) arrayList3.get(i16);
                        int[] iArr2 = wv7.w0;
                        int i17 = i16 * 2;
                        int i18 = iArr2[i17];
                        int[] iArr3 = wv7.v0;
                        float J3 = fbf.J(i15, i18, iArr3[i17]);
                        Interpolator[] interpolatorArr = wv7.x;
                        pv42.a = h88.k(interpolatorArr[i17].getInterpolation(J3), c44.DEFAULT_ASPECT_RATIO, 1.0f);
                        int i19 = i17 + 1;
                        pv42.b = h88.k(interpolatorArr[i19].getInterpolation(fbf.J(i15, iArr2[i19], iArr3[i19])), c44.DEFAULT_ASPECT_RATIO, 1.0f);
                        i16++;
                    } else {
                        if (wv7.X) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                ((pv4) it.next()).c = wv7.y.c[wv7.z];
                            }
                            wv7.X = false;
                        }
                        ((ue7) wv7.b).invalidateSelf();
                        return;
                    }
                }
            case 10:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
            case 11:
                ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
