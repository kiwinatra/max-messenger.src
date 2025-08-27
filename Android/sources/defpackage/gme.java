package defpackage;

import android.os.SystemClock;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* renamed from: gme  reason: default package */
public final class gme implements mne {
    public final j09 a;
    public final voc b;
    public c15 c;
    public double d;
    public final lc2 e = new Object();
    public BigInteger f;
    public BigInteger g;
    public final xga h;
    public final CopyOnWriteArrayList i;

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, lc2] */
    public gme(j09 j09, voc voc) {
        this.a = j09;
        this.b = voc;
        BigInteger bigInteger = BigInteger.ZERO;
        this.f = bigInteger;
        this.g = bigInteger;
        this.h = new xga();
        this.i = new CopyOnWriteArrayList();
        j09.c(this, 5, TimeUnit.SECONDS);
    }

    public final void a(xoc xoc) {
        cj8 cj8;
        cj8 cj82;
        BigInteger bigInteger;
        String str;
        Double doubleOrNull;
        xoc xoc2 = xoc;
        double d2 = 0.0d;
        if (this.h.l(xoc2.c)) {
            this.c = null;
            this.d = 0.0d;
            BigInteger bigInteger2 = BigInteger.ZERO;
            this.f = bigInteger2;
            this.g = bigInteger2;
            lc2 lc2 = this.e;
            lc2.a = 0;
            lc2.b = 0;
        }
        uw1 c2 = xoc.c();
        if (!(c2 == null || (str = c2.h) == null || (doubleOrNull = StringsKt.toDoubleOrNull(str)) == null)) {
            double doubleValue = doubleOrNull.doubleValue();
            c15 c15 = this.c;
            if (c15 != null) {
                c15.a(doubleValue);
            } else {
                this.c = new c15(doubleValue);
            }
        }
        List<nie> list = xoc2.c;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        for (nie nie : list) {
            if (nie.b == 2 && nie.a == 2) {
                arrayList.add((mie) nie);
            }
        }
        mie mie = (mie) CollectionsKt.firstOrNull(arrayList);
        if (mie != null) {
            BigInteger bigInteger3 = mie.h;
            voc voc = this.b;
            if (bigInteger3 == null || (bigInteger = mie.i) == null) {
                this.d = 0.0d;
                voc.log("MediaAdaptation", "No packets were sent yet. Reset lost to 0");
            } else {
                if (bigInteger3.compareTo(this.f) < 0) {
                    this.f = bigInteger3;
                }
                if (bigInteger.compareTo(this.g) < 0) {
                    this.g = bigInteger;
                }
                BigInteger subtract = bigInteger.subtract(this.g);
                BigInteger subtract2 = bigInteger3.subtract(this.f);
                voc.log("MediaAdaptation", "Sent stats: sent=" + subtract2 + " (total=" + bigInteger3 + "), lost=" + subtract + " (total=" + bigInteger + ")");
                BigInteger bigInteger4 = BigInteger.ZERO;
                double doubleValue2 = (subtract2.compareTo(bigInteger4) <= 0 || subtract.compareTo(bigInteger4) <= 0) ? 0.0d : subtract.doubleValue() / subtract2.doubleValue();
                this.d = doubleValue2;
                voc.log("MediaAdaptation", "Lost packets fraction updated to " + doubleValue2);
                this.f = bigInteger3;
                this.g = bigInteger;
            }
        }
        if (this.i.isEmpty()) {
            this.b.log("MediaAdaptation", "Ignore network state update because there are no listeners");
            return;
        }
        c15 c152 = this.c;
        if (c152 != null) {
            d2 = c152.b;
        }
        hj8 hj8 = new hj8(d2, this.d);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            jj8 jj8 = (jj8) it.next();
            jj8.getClass();
            double d3 = hj8.b;
            gj8 gj8 = jj8.i;
            ej8 ej8 = gj8.a;
            double d4 = ej8.a;
            double d5 = hj8.a;
            int i2 = (d5 > d4 ? 1 : (d5 == d4 ? 0 : -1));
            rjf rjf = jj8.c;
            voc voc2 = jj8.d;
            rjf rjf2 = rjf;
            if ((i2 > 0 || d3 < ej8.b) && ((d5 <= d4 || d3 < ej8.c) && d5 < ej8.d)) {
                fj8 fj8 = gj8.b;
                if ((d5 >= fj8.a || d3 > fj8.b) && (d5 >= fj8.c || d3 > fj8.d)) {
                    voc2.log("MediaAdaptation", "Ignore inbound state update " + hj8);
                } else {
                    cj8 cj83 = jj8.k;
                    voc2.log("MediaAdaptation", "Good network detected. Current condition is " + cj83 + ", state is " + hj8);
                    ((sjf) rjf2).getClass();
                    if (SystemClock.elapsedRealtime() - jj8.f > gj8.b.e && jj8.k != (cj82 = cj8.a)) {
                        jj8.c(cj82, hj8);
                    }
                }
            } else {
                cj8 cj84 = jj8.k;
                voc2.log("MediaAdaptation", "Bad network detected. Current condition is " + cj84 + ", state is " + hj8);
                ej8 ej82 = gj8.a;
                if (d5 >= ej82.d) {
                    cj8 = cj8.c;
                } else {
                    cj8 cj85 = jj8.k;
                    cj8 = cj85 == cj8.c ? d5 < ej82.e ? cj8.b : cj85 : cj8.b;
                }
                ((sjf) rjf2).getClass();
                jj8.f = SystemClock.elapsedRealtime();
                if (jj8.k != cj8) {
                    jj8.c(cj8, hj8);
                }
            }
        }
    }
}
