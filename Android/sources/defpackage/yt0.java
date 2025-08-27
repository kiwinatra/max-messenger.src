package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* renamed from: yt0  reason: default package */
public final class yt0 {
    public final ynb a;
    public final pv0 b;
    public final ec6 c;
    public final og d;
    public final int e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public volatile int g;
    public volatile boolean h;
    public final jq5 i;
    public int j;
    public Map k;
    public Set l;

    public yt0(ynb ynb, pv0 pv0, ec6 ec6, og ogVar, int i2) {
        this.a = ynb;
        this.b = pv0;
        this.c = ec6;
        this.d = ogVar;
        int coerceAtLeast = RangesKt.coerceAtLeast((d(ogVar) * i2) / 1000, 1);
        this.e = coerceAtLeast;
        this.i = new jq5(ogVar.e(), 5);
        this.j = -1;
        this.k = MapsKt.emptyMap();
        this.l = SetsKt.emptySet();
        a(d(ogVar));
        this.g = (int) (((float) coerceAtLeast) * 0.5f);
    }

    public static int d(og ogVar) {
        return (int) RangesKt.coerceAtLeast(TimeUnit.SECONDS.toMillis(1) / ((long) (ogVar.i() / ogVar.e())), 1);
    }

    public final void a(int i2) {
        og ogVar = this.d;
        int coerceAtLeast = RangesKt.coerceAtLeast(ogVar.t(), 1) * ogVar.i();
        int e2 = ogVar.e();
        int coerceAtMost = RangesKt.coerceAtMost(i2, d(ogVar));
        ec6 ec6 = this.c;
        ec6.getClass();
        float coerceAtLeast2 = RangesKt.coerceAtLeast((((float) coerceAtLeast) / 1000.0f) * ((float) RangesKt.coerceAtMost(RangesKt.coerceAtLeast(coerceAtMost, 1), ec6.a)), (float) c44.DEFAULT_ASPECT_RATIO);
        float f2 = (float) e2;
        float coerceAtMost2 = f2 / RangesKt.coerceAtMost(coerceAtLeast2, f2);
        int i3 = 0;
        IntRange until = RangesKt.until(0, e2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10)), 16));
        for (Object next : until) {
            int intValue = ((Number) next).intValue();
            if (((int) (((float) intValue) % coerceAtMost2)) == 0) {
                i3 = intValue;
            }
            linkedHashMap.put(next, Integer.valueOf(i3));
        }
        this.k = linkedHashMap;
        this.l = CollectionsKt.toSet(linkedHashMap.values());
    }

    public final fg b(int i2) {
        fg fgVar;
        jq5 jq5 = this.i;
        Iterator it = new IntRange(0, jq5.b).iterator();
        do {
            fgVar = null;
            if (!it.hasNext()) {
                break;
            }
            int a2 = jq5.a(i2 - ((IntIterator) it).nextInt());
            xt0 xt0 = (xt0) this.f.get(Integer.valueOf(a2));
            if (xt0 != null) {
                if (xt0.b || !xt0.a.k0()) {
                    xt0 = null;
                }
                if (xt0 != null) {
                    fgVar = new fg(a2, (jd4) xt0.a);
                    continue;
                } else {
                    continue;
                }
            }
        } while (fgVar == null);
        return fgVar;
    }

    public final p7d c(int i2) {
        fg b2 = b(i2);
        if (b2 == null) {
            return new p7d(13, (Object) null, (Object) oe6.c);
        }
        y33 m = b2.b.m();
        this.j = b2.a;
        return new p7d(13, (Object) m, (Object) oe6.b);
    }

    public final void e(int i2, int i3) {
        if (!this.h) {
            this.h = true;
            ExecutorService executorService = rg.a;
            rg.a.execute(new wt0(this, i2, i3, 0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(int r8, defpackage.y33 r9) {
        /*
            r7 = this;
            fg r0 = r7.b(r8)
            pv0 r7 = r7.b
            r1 = 0
            if (r0 == 0) goto L_0x0076
            y33 r2 = r0.b
            if (r2 == 0) goto L_0x0076
            y33 r2 = r2.n()
            if (r2 == 0) goto L_0x0076
            int r0 = r0.a     // Catch:{ all -> 0x0064 }
            r3 = 0
            if (r0 >= r8) goto L_0x006a
            java.lang.Object r4 = r2.e0()     // Catch:{ all -> 0x0064 }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ all -> 0x0064 }
            boolean r5 = r9.k0()     // Catch:{ all -> 0x0064 }
            if (r5 == 0) goto L_0x0042
            java.lang.Object r5 = r9.e0()     // Catch:{ all -> 0x0064 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r4)     // Catch:{ all -> 0x0064 }
            if (r5 != 0) goto L_0x0042
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch:{ all -> 0x0064 }
            java.lang.Object r6 = r9.e0()     // Catch:{ all -> 0x0064 }
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch:{ all -> 0x0064 }
            r5.<init>(r6)     // Catch:{ all -> 0x0064 }
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.CLEAR     // Catch:{ all -> 0x0064 }
            r5.drawColor(r1, r6)     // Catch:{ all -> 0x0064 }
            r1 = 0
            r5.drawBitmap(r4, r1, r1, r3)     // Catch:{ all -> 0x0064 }
        L_0x0042:
            kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange     // Catch:{ all -> 0x0064 }
            int r0 = r0 + 1
            r1.<init>(r0, r8)     // Catch:{ all -> 0x0064 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x0064 }
        L_0x004d:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0066
            r0 = r8
            kotlin.collections.IntIterator r0 = (kotlin.collections.IntIterator) r0     // Catch:{ all -> 0x0064 }
            int r0 = r0.nextInt()     // Catch:{ all -> 0x0064 }
            java.lang.Object r1 = r9.e0()     // Catch:{ all -> 0x0064 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x0064 }
            r7.h(r1, r0)     // Catch:{ all -> 0x0064 }
            goto L_0x004d
        L_0x0064:
            r7 = move-exception
            goto L_0x0070
        L_0x0066:
            kotlin.io.CloseableKt.closeFinally(r2, r3)
            return
        L_0x006a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0064 }
            kotlin.io.CloseableKt.closeFinally(r2, r3)
            goto L_0x0076
        L_0x0070:
            throw r7     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r8 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r7)
            throw r8
        L_0x0076:
            boolean r0 = r9.k0()
            if (r0 == 0) goto L_0x008c
            android.graphics.Canvas r0 = new android.graphics.Canvas
            java.lang.Object r2 = r9.e0()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r0.<init>(r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR
            r0.drawColor(r1, r2)
        L_0x008c:
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r0.<init>(r1, r8)
            java.util.Iterator r8 = r0.iterator()
        L_0x0095:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ac
            r0 = r8
            kotlin.collections.IntIterator r0 = (kotlin.collections.IntIterator) r0
            int r0 = r0.nextInt()
            java.lang.Object r1 = r9.e0()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r7.h(r1, r0)
            goto L_0x0095
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt0.f(int, y33):void");
    }
}
