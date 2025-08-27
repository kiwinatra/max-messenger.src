package defpackage;

import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* renamed from: aee  reason: default package */
public final class aee {
    public static final /* synthetic */ KProperty[] g;
    public final zde a = new zde(this, 0);
    public final zde b;
    public final zde c;
    public float d;
    public int e;
    public float f;

    static {
        Class<aee> cls = aee.class;
        g = new KProperty[]{rae.s(cls, "from", "getFrom$common_release()F", 0), rae.s(cls, "to", "getTo$common_release()F", 0), rae.s(cls, "stepSize", "getStepSize$common_release()F", 0)};
    }

    public aee() {
        Delegates delegates = Delegates.INSTANCE;
        zde zde = new zde(this, 1);
        this.b = zde;
        this.c = new zde(this, 2);
        this.e = a();
        this.f = RangesKt.coerceIn((this.d - b()) / (((Number) zde.getValue(this, g[1])).floatValue() - b()), (float) c44.DEFAULT_ASPECT_RATIO, 1.0f);
    }

    public final int a() {
        KProperty[] kPropertyArr = g;
        return MathKt.roundToInt((((Number) this.b.getValue(this, kPropertyArr[1])).floatValue() - b()) / ((Number) this.c.getValue(this, kPropertyArr[2])).floatValue()) + 1;
    }

    public final float b() {
        return ((Number) this.a.getValue(this, g[0])).floatValue();
    }

    public final void c(float f2) {
        float b2 = b();
        KProperty[] kPropertyArr = g;
        KProperty kProperty = kPropertyArr[1];
        zde zde = this.b;
        float coerceIn = RangesKt.coerceIn(f2, b2, ((Number) zde.getValue(this, kProperty)).floatValue());
        this.d = coerceIn;
        this.f = RangesKt.coerceIn((coerceIn - b()) / (((Number) zde.getValue(this, kPropertyArr[1])).floatValue() - b()), (float) c44.DEFAULT_ASPECT_RATIO, 1.0f);
    }
}
