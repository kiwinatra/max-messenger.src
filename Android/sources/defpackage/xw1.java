package defpackage;

import android.util.Size;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* renamed from: xw1  reason: default package */
public final class xw1 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final TreeMap b = new TreeMap(new v93(false));
    public final zc0 c;
    public final zc0 d;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: zc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: zc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: zc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: qa0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: zc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: zc0} */
    /* JADX WARNING: type inference failed for: r3v5, types: [qa0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xw1(defpackage.d19 r14) {
        /*
            r13 = this;
            r13.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r13.a = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            v93 r1 = new v93
            r2 = 0
            r1.<init>(r2)
            r0.<init>(r1)
            r13.b = r0
            yb0 r0 = defpackage.yb0.d
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = defpackage.yb0.l
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r1 = r0.hasNext()
            r3 = 0
            if (r1 == 0) goto L_0x00b3
            java.lang.Object r1 = r0.next()
            yb0 r1 = (defpackage.yb0) r1
            boolean r4 = r1 instanceof defpackage.yb0
            java.lang.String r5 = "Currently only support ConstantQuality"
            defpackage.bs0.r(r5, r4)
            int r4 = r1.a
            i65 r4 = r14.u(r4)
            if (r4 != 0) goto L_0x0041
            goto L_0x0024
        L_0x0041:
            r4.toString()
            java.util.List r5 = r4.d()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x004f
            goto L_0x0096
        L_0x004f:
            int r7 = r4.a()
            int r8 = r4.b()
            java.util.List r5 = r4.c()
            java.util.List r4 = r4.d()
            boolean r6 = r4.isEmpty()
            r6 = r6 ^ 1
            java.lang.String r9 = "Should contain at least one VideoProfile."
            defpackage.bs0.m(r9, r6)
            java.lang.Object r6 = r4.get(r2)
            r12 = r6
            sa0 r12 = (defpackage.sa0) r12
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x007d
            java.lang.Object r3 = r5.get(r2)
            qa0 r3 = (defpackage.qa0) r3
        L_0x007d:
            r11 = r3
            zc0 r3 = new zc0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            java.util.List r9 = java.util.Collections.unmodifiableList(r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            java.util.List r10 = java.util.Collections.unmodifiableList(r5)
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0096:
            if (r3 != 0) goto L_0x009c
            java.util.Objects.toString(r1)
            goto L_0x0024
        L_0x009c:
            android.util.Size r4 = new android.util.Size
            sa0 r5 = r3.f
            int r6 = r5.e
            int r5 = r5.f
            r4.<init>(r6, r5)
            java.util.TreeMap r5 = r13.b
            r5.put(r4, r1)
            java.util.LinkedHashMap r4 = r13.a
            r4.put(r1, r3)
            goto L_0x0024
        L_0x00b3:
            java.util.LinkedHashMap r14 = r13.a
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x00c0
            r13.d = r3
            r13.c = r3
            goto L_0x00db
        L_0x00c0:
            java.util.ArrayDeque r14 = new java.util.ArrayDeque
            java.util.LinkedHashMap r0 = r13.a
            java.util.Collection r0 = r0.values()
            r14.<init>(r0)
            java.lang.Object r0 = r14.peekFirst()
            zc0 r0 = (defpackage.zc0) r0
            r13.c = r0
            java.lang.Object r14 = r14.peekLast()
            zc0 r14 = (defpackage.zc0) r14
            r13.d = r14
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw1.<init>(d19):void");
    }

    public final zc0 a(Size size) {
        Object obj;
        TreeMap treeMap = this.b;
        Size size2 = pde.a;
        Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
        zc0 zc0 = null;
        if (ceilingEntry != null) {
            obj = ceilingEntry.getValue();
        } else {
            Map.Entry floorEntry = treeMap.floorEntry(size);
            obj = floorEntry != null ? floorEntry.getValue() : null;
        }
        yb0 yb0 = (yb0) obj;
        if (yb0 == null) {
            yb0 = yb0.j;
        }
        Objects.toString(yb0);
        Objects.toString(size);
        if (yb0 == yb0.j || (zc0 = b(yb0)) != null) {
            return zc0;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    public final zc0 b(yb0 yb0) {
        boolean contains = yb0.k.contains(yb0);
        bs0.m("Unknown quality: " + yb0, contains);
        return yb0 == yb0.i ? this.c : yb0 == yb0.h ? this.d : (zc0) this.a.get(yb0);
    }
}
