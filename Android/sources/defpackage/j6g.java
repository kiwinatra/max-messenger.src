package defpackage;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.webrtc.Size;

/* renamed from: j6g  reason: default package */
public final class j6g {
    public final boolean a;
    public final Function1 b;
    public final int c;
    public volatile Integer d;
    public volatile Integer e;
    public odb f;
    public Integer g;
    public Integer h;
    public Integer i;

    public j6g(boolean z, int i2, hq7 hq7) {
        this.a = z;
        this.b = hq7;
        this.c = RangesKt.coerceIn(i2 - (i2 % 16), 320, (int) ConstantsKt.DEFAULT_BLOCK_SIZE);
    }

    public final odb a(int i2, int i3) {
        boolean z;
        float f2;
        Pair pair;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i2;
        int i11 = i3;
        Integer num = this.d;
        Integer num2 = this.e;
        int i12 = this.c;
        if (num != null && num2 != null) {
            i12 = Math.min(num.intValue(), num2.intValue());
        } else if (num != null) {
            i12 = num.intValue();
        } else if (num2 != null) {
            i12 = num2.intValue();
        }
        int max = Math.max(i2, i3);
        if (max > i12) {
            f2 = ((float) i12) / ((float) max);
            int min = Math.min(i2, i3);
            if (min > 0) {
                float f3 = (float) min;
                int roundToInt = MathKt.roundToInt(f2 * f3);
                int i13 = roundToInt % 16;
                if (i13 > 0) {
                    int i14 = (roundToInt - i13) + 16;
                    if (i13 > i14 - roundToInt) {
                        f2 = ((float) i14) / f3;
                    }
                }
            }
            pair = TuplesKt.to(Integer.valueOf(MathKt.roundToInt(((float) i10) * f2)), Integer.valueOf(MathKt.roundToInt(((float) i11) * f2)));
            z = true;
        } else {
            pair = TuplesKt.to(Integer.valueOf(i2), Integer.valueOf(i3));
            f2 = 1.0f;
            z = false;
        }
        int intValue = ((Number) pair.component1()).intValue();
        int intValue2 = ((Number) pair.component2()).intValue();
        int max2 = Math.max(intValue, intValue2);
        int max3 = max2 < 320 ? Math.max(320 / max2, 2) : 1;
        int i15 = max3 == 1 ? max2 : max2 * max3;
        int min2 = Math.min(intValue, intValue2);
        int i16 = max3 == 1 ? min2 : min2 * max3;
        if (i15 < i12) {
            i12 = i15 - (i15 % 16);
        }
        int i17 = i12 / 16;
        int i18 = i17 * 9;
        int a2 = i18 > i16 ? hsg.a(i16, i17, 0) : hsg.a(i18, i17, i16);
        if (max3 == 1) {
            max2 = i12;
        } else if (i12 != i15) {
            max2 = MathKt.roundToInt(((float) i12) / ((float) max3));
        }
        if (z) {
            max2 = MathKt.roundToInt(((float) max2) / f2);
        }
        if (max3 == 1) {
            min2 = a2;
        } else if (a2 != i16) {
            min2 = MathKt.roundToInt(((float) a2) / ((float) max3));
        }
        if (z) {
            min2 = MathKt.roundToInt(((float) min2) / f2);
        }
        if (i10 >= i11) {
            i9 = (i10 - max2) / 2;
            i8 = (i11 - min2) / 2;
            i6 = min2;
            i5 = i12;
            i4 = a2;
            i7 = max2;
        } else {
            i9 = (i10 - min2) / 2;
            i8 = (i11 - max2) / 2;
            i7 = min2;
            i4 = i12;
            i5 = a2;
            i6 = max2;
        }
        return new odb(i9, i8, i7, i6, i5, i4, this.a);
    }

    public final Size b(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            this.b.invoke(g63.h("Wrong frame size: ", i2, i3, "x"));
            return null;
        }
        odb a2 = a(i2, i3);
        return new Size(a2.g, a2.h);
    }
}
