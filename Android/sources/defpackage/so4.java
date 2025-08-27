package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import kotlin.jvm.internal.FloatCompanionObject;

/* renamed from: so4  reason: default package */
public final class so4 {
    public final long a;

    public /* synthetic */ so4(long j) {
        this.a = j;
    }

    public static final /* synthetic */ so4 a(long j) {
        return new so4(j);
    }

    public static long b(float f, int i) {
        return ((long) Float.floatToIntBits(f)) + (((long) i) << 32);
    }

    public static final float c(long j, Context context) {
        return d(j, context.getResources().getDisplayMetrics());
    }

    public static final float d(long j, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension((int) (j >> 32), e(j), displayMetrics);
    }

    public static final float e(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof so4)) {
            return false;
        }
        return this.a == ((so4) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("Dimension(encodedValue="), this.a, ")");
    }
}
