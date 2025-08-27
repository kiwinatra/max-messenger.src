package defpackage;

import android.util.Range;
import java.util.HashMap;

/* renamed from: vac  reason: default package */
public final class vac {
    public static final HashMap b;
    public static final HashMap c;
    public final HashMap a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(yb0.g, Range.create(2160, 4319));
        hashMap.put(yb0.f, Range.create(1080, 1439));
        hashMap.put(yb0.e, Range.create(720, 1079));
        hashMap.put(yb0.d, Range.create(241, 719));
        HashMap hashMap2 = new HashMap();
        c = hashMap2;
        hashMap2.put(0, ht.a);
        hashMap2.put(1, ht.c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vac(java.util.List r10, java.util.HashMap r11) {
        /*
            r9 = this;
            r9.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.a = r0
            java.util.HashMap r0 = b
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0014:
            boolean r2 = r1.hasNext()
            java.util.HashMap r3 = c
            r4 = -1
            if (r2 == 0) goto L_0x005a
            java.lang.Object r2 = r1.next()
            yb0 r2 = (defpackage.yb0) r2
            java.util.HashMap r5 = r9.a
            xb0 r6 = new xb0
            r6.<init>(r2, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5.put(r6, r4)
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x003a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0014
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.util.HashMap r5 = r9.a
            int r4 = r4.intValue()
            xb0 r6 = new xb0
            r6.<init>(r2, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5.put(r6, r4)
            goto L_0x003a
        L_0x005a:
            java.util.Set r1 = r11.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0062:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0090
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r5 = r2.getKey()
            yb0 r5 = (defpackage.yb0) r5
            xb0 r6 = new xb0
            r6.<init>(r5, r4)
            java.util.HashMap r5 = r9.a
            java.lang.Object r5 = r5.get(r6)
            java.util.List r5 = (java.util.List) r5
            java.util.Objects.requireNonNull(r5)
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r2 = r2.getValue()
            android.util.Size r2 = (android.util.Size) r2
            r5.add(r2)
            goto L_0x0062
        L_0x0090:
            java.util.Iterator r10 = r10.iterator()
        L_0x0094:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x011b
            java.lang.Object r1 = r10.next()
            android.util.Size r1 = (android.util.Size) r1
            java.util.Set r2 = r0.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x00a8:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x00d0
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r6 = r4.getValue()
            android.util.Range r6 = (android.util.Range) r6
            int r7 = r1.getHeight()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x00a8
            java.lang.Object r2 = r4.getKey()
            yb0 r2 = (defpackage.yb0) r2
            goto L_0x00d1
        L_0x00d0:
            r2 = r5
        L_0x00d1:
            if (r2 != 0) goto L_0x00d4
            goto L_0x0094
        L_0x00d4:
            java.util.Set r4 = r3.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x00dc:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00fd
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            android.util.Rational r7 = (android.util.Rational) r7
            android.util.Size r8 = defpackage.pde.b
            boolean r7 = defpackage.ht.a(r1, r7, r8)
            if (r7 == 0) goto L_0x00dc
            java.lang.Object r4 = r6.getKey()
            r5 = r4
            java.lang.Integer r5 = (java.lang.Integer) r5
        L_0x00fd:
            if (r5 != 0) goto L_0x0100
            goto L_0x0094
        L_0x0100:
            int r4 = r5.intValue()
            xb0 r5 = new xb0
            r5.<init>(r2, r4)
            java.util.HashMap r2 = r9.a
            java.lang.Object r2 = r2.get(r5)
            java.util.List r2 = (java.util.List) r2
            java.util.Objects.requireNonNull(r2)
            java.util.List r2 = (java.util.List) r2
            r2.add(r1)
            goto L_0x0094
        L_0x011b:
            java.util.HashMap r9 = r9.a
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0125:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x015d
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r0 = r10.getKey()
            xb0 r0 = (defpackage.xb0) r0
            yb0 r0 = r0.a
            java.lang.Object r0 = r11.get(r0)
            android.util.Size r0 = (android.util.Size) r0
            if (r0 != 0) goto L_0x0142
            goto L_0x0125
        L_0x0142:
            android.util.Size r1 = defpackage.pde.a
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            int r0 = r0 * r1
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            z30 r1 = new z30
            r2 = 1
            r1.<init>(r0, r2)
            java.util.Collections.sort(r10, r1)
            goto L_0x0125
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vac.<init>(java.util.List, java.util.HashMap):void");
    }
}
