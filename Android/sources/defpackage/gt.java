package defpackage;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* renamed from: gt  reason: default package */
public final class gt implements Comparator {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public gt(bl2 bl2, bl2 bl22) {
        this.b = bl2;
        this.c = bl22;
    }

    public static float a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    public RectF b(Rational rational) {
        float floatValue = rational.floatValue();
        Rational rational2 = (Rational) this.c;
        return floatValue == rational2.floatValue() ? new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) rational2.getNumerator(), (float) rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) rational2.getNumerator(), (((float) rational.getDenominator()) * ((float) rational2.getNumerator())) / ((float) rational.getNumerator())) : new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (((float) rational.getNumerator()) * ((float) rational2.getDenominator())) / ((float) rational.getDenominator()), (float) rational2.getDenominator());
    }

    public final int compare(Object obj, Object obj2) {
        Long l;
        Long l2;
        switch (this.a) {
            case 0:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                boolean z = false;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF b2 = b(rational);
                RectF b3 = b(rational2);
                RectF rectF = (RectF) this.b;
                boolean z2 = b2.width() >= rectF.width() && b2.height() >= rectF.height();
                if (b3.width() >= rectF.width() && b3.height() >= rectF.height()) {
                    z = true;
                }
                if (z2 && z) {
                    return (int) Math.signum((b2.height() * b2.width()) - (b3.height() * b3.width()));
                } else if (z2) {
                    return -1;
                } else {
                    if (z) {
                        return 1;
                    }
                    return -((int) Math.signum(a(b2, rectF) - a(b3, rectF)));
                }
            default:
                long longValue = ((Number) obj2).longValue();
                bl2 bl2 = (bl2) this.b;
                yk2 yk2 = (yk2) bl2.a.get(Long.valueOf(longValue));
                bl2 bl22 = (bl2) this.c;
                yk2 yk22 = (yk2) bl22.a.get(Long.valueOf(longValue));
                long j = 0;
                if ((yk2 != null ? yk2.l : 0) >= (yk22 != null ? yk22.l : 0)) {
                    l = Long.valueOf(yk2 != null ? yk2.l : 0);
                } else {
                    l = Long.valueOf(yk22 != null ? yk22.l : 0);
                }
                long longValue2 = ((Number) obj).longValue();
                yk2 yk23 = (yk2) bl2.a.get(Long.valueOf(longValue2));
                yk2 yk24 = (yk2) bl22.a.get(Long.valueOf(longValue2));
                if ((yk23 != null ? yk23.l : 0) >= (yk24 != null ? yk24.l : 0)) {
                    if (yk23 != null) {
                        j = yk23.l;
                    }
                    l2 = Long.valueOf(j);
                } else {
                    if (yk24 != null) {
                        j = yk24.l;
                    }
                    l2 = Long.valueOf(j);
                }
                return ComparisonsKt.compareValues(l, l2);
        }
    }

    public gt(Rational rational, Rational rational2) {
        this.c = rational2 == null ? new Rational(4, 3) : rational2;
        this.b = b(rational);
    }
}
