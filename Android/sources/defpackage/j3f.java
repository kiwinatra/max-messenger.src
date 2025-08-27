package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: j3f  reason: default package */
public final class j3f {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final String i;
    public final zq1 j;
    public final qt1 k;
    public final er7 l;
    public final int m;
    public final boolean n = false;
    public final boolean o = false;
    public final boolean p = false;
    public final boolean q = false;
    public final boolean r = false;
    public pc0 s;
    public final ArrayList t = new ArrayList();
    public final hq4 u;
    public final wc8 v = new Object();
    public final yu9 w = new yu9(5);
    public final he x;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, wc8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j3f(android.content.Context r17, java.lang.String r18, defpackage.vu1 r19, defpackage.zq1 r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = 5
            r3 = 1
            r16.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.a = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.b = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.c = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.d = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0.e = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.f = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.g = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.h = r4
            r4 = 0
            r0.n = r4
            r0.o = r4
            r0.p = r4
            r0.q = r4
            r0.r = r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0.t = r5
            wc8 r5 = new wc8
            r5.<init>()
            r0.v = r5
            yu9 r5 = new yu9
            r5.<init>((int) r2)
            r0.w = r5
            r18.getClass()
            r0.i = r1
            r20.getClass()
            r5 = r20
            r0.j = r5
            er7 r5 = new er7
            r6 = 17
            r5.<init>((int) r6)
            r0.l = r5
            hq4 r5 = defpackage.hq4.b(r17)
            r0.u = r5
            r5 = r19
            qt1 r1 = r5.a(r1)     // Catch:{ CameraAccessExceptionCompat -> 0x0094 }
            r0.k = r1     // Catch:{ CameraAccessExceptionCompat -> 0x0094 }
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ CameraAccessExceptionCompat -> 0x0094 }
            java.lang.Object r5 = r1.a(r5)     // Catch:{ CameraAccessExceptionCompat -> 0x0094 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ CameraAccessExceptionCompat -> 0x0094 }
            r6 = 2
            if (r5 == 0) goto L_0x0097
            int r5 = r5.intValue()     // Catch:{ CameraAccessExceptionCompat -> 0x0094 }
            goto L_0x0098
        L_0x0094:
            r0 = move-exception
            goto L_0x085a
        L_0x0097:
            r5 = r6
        L_0x0098:
            r0.m = r5     // Catch:{ CameraAccessExceptionCompat -> 0x0094 }
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r1 = r1.a(r5)
            int[] r1 = (int[]) r1
            r5 = 3
            if (r1 == 0) goto L_0x00c4
            int r7 = r1.length
            r8 = r4
        L_0x00a7:
            if (r8 >= r7) goto L_0x00c4
            r9 = r1[r8]
            if (r9 != r5) goto L_0x00b0
            r0.n = r3
            goto L_0x00c2
        L_0x00b0:
            r10 = 6
            if (r9 != r10) goto L_0x00b6
            r0.o = r3
            goto L_0x00c2
        L_0x00b6:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 31
            if (r10 < r11) goto L_0x00c2
            r10 = 16
            if (r9 != r10) goto L_0x00c2
            r0.r = r3
        L_0x00c2:
            int r8 = r8 + r3
            goto L_0x00a7
        L_0x00c4:
            he r1 = new he
            qt1 r7 = r0.k
            r1.<init>((defpackage.qt1) r7)
            r0.x = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            k3f r8 = new k3f
            r8.<init>()
            l3f r9 = defpackage.l3f.MAXIMUM
            r10 = 0
            defpackage.rae.t(r3, r9, r10, r8)
            k3f r8 = defpackage.rae.j(r7, r8)
            defpackage.rae.t(r5, r9, r10, r8)
            k3f r8 = defpackage.rae.j(r7, r8)
            defpackage.rae.t(r6, r9, r10, r8)
            k3f r8 = defpackage.rae.j(r7, r8)
            l3f r12 = defpackage.l3f.PREVIEW
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r8.a(r13)
            defpackage.rae.t(r5, r9, r10, r8)
            k3f r8 = defpackage.rae.j(r7, r8)
            jc0 r13 = new jc0
            r13.<init>(r6, r12, r10)
            r8.a(r13)
            defpackage.rae.t(r5, r9, r10, r8)
            k3f r8 = defpackage.rae.j(r7, r8)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r8.a(r13)
            defpackage.rae.t(r3, r12, r10, r8)
            k3f r8 = defpackage.rae.j(r7, r8)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r8.a(r13)
            defpackage.rae.t(r6, r12, r10, r8)
            k3f r8 = defpackage.rae.j(r7, r8)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r8.a(r13)
            jc0 r13 = new jc0
            r13.<init>(r6, r12, r10)
            r8.a(r13)
            defpackage.rae.t(r5, r9, r10, r8)
            r7.add(r8)
            r1.addAll(r7)
            int r7 = r0.m
            l3f r8 = defpackage.l3f.RECORD
            if (r7 == 0) goto L_0x0156
            if (r7 == r3) goto L_0x0156
            if (r7 != r5) goto L_0x01d4
        L_0x0156:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            k3f r14 = new k3f
            r14.<init>()
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r14.a(r15)
            defpackage.rae.t(r3, r8, r10, r14)
            k3f r14 = defpackage.rae.j(r13, r14)
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r14.a(r15)
            defpackage.rae.t(r6, r8, r10, r14)
            k3f r14 = defpackage.rae.j(r13, r14)
            jc0 r15 = new jc0
            r15.<init>(r6, r12, r10)
            r14.a(r15)
            defpackage.rae.t(r6, r8, r10, r14)
            k3f r14 = defpackage.rae.j(r13, r14)
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r14.a(r15)
            jc0 r15 = new jc0
            r15.<init>(r3, r8, r10)
            r14.a(r15)
            defpackage.rae.t(r5, r8, r10, r14)
            k3f r14 = defpackage.rae.j(r13, r14)
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r14.a(r15)
            jc0 r15 = new jc0
            r15.<init>(r6, r8, r10)
            r14.a(r15)
            defpackage.rae.t(r5, r8, r10, r14)
            k3f r14 = defpackage.rae.j(r13, r14)
            jc0 r15 = new jc0
            r15.<init>(r6, r12, r10)
            r14.a(r15)
            jc0 r15 = new jc0
            r15.<init>(r6, r12, r10)
            r14.a(r15)
            defpackage.rae.t(r5, r9, r10, r14)
            r13.add(r14)
            r1.addAll(r13)
        L_0x01d4:
            l3f r13 = defpackage.l3f.VGA
            if (r7 == r3) goto L_0x01da
            if (r7 != r5) goto L_0x0258
        L_0x01da:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            k3f r15 = new k3f
            r15.<init>()
            jc0 r4 = new jc0
            r4.<init>(r3, r12, r10)
            r15.a(r4)
            defpackage.rae.t(r3, r9, r10, r15)
            k3f r4 = defpackage.rae.j(r14, r15)
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r4.a(r15)
            defpackage.rae.t(r6, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r14, r4)
            jc0 r15 = new jc0
            r15.<init>(r6, r12, r10)
            r4.a(r15)
            defpackage.rae.t(r6, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r14, r4)
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r4.a(r15)
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r4.a(r15)
            defpackage.rae.t(r5, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r14, r4)
            jc0 r15 = new jc0
            r15.<init>(r6, r13, r10)
            r4.a(r15)
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r4.a(r15)
            defpackage.rae.t(r6, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r14, r4)
            jc0 r15 = new jc0
            r15.<init>(r6, r13, r10)
            r4.a(r15)
            jc0 r15 = new jc0
            r15.<init>(r6, r12, r10)
            r4.a(r15)
            defpackage.rae.t(r6, r9, r10, r4)
            r14.add(r4)
            r1.addAll(r14)
        L_0x0258:
            boolean r4 = r0.n
            if (r4 == 0) goto L_0x0300
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            k3f r14 = new k3f
            r14.<init>()
            defpackage.rae.t(r2, r9, r10, r14)
            k3f r14 = defpackage.rae.j(r4, r14)
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r14.a(r15)
            defpackage.rae.t(r2, r9, r10, r14)
            k3f r14 = defpackage.rae.j(r4, r14)
            jc0 r15 = new jc0
            r15.<init>(r6, r12, r10)
            r14.a(r15)
            defpackage.rae.t(r2, r9, r10, r14)
            k3f r14 = defpackage.rae.j(r4, r14)
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r14.a(r15)
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r14.a(r15)
            defpackage.rae.t(r2, r9, r10, r14)
            k3f r14 = defpackage.rae.j(r4, r14)
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r14.a(r15)
            jc0 r15 = new jc0
            r15.<init>(r6, r12, r10)
            r14.a(r15)
            defpackage.rae.t(r2, r9, r10, r14)
            k3f r14 = defpackage.rae.j(r4, r14)
            jc0 r15 = new jc0
            r15.<init>(r6, r12, r10)
            r14.a(r15)
            jc0 r15 = new jc0
            r15.<init>(r6, r12, r10)
            r14.a(r15)
            defpackage.rae.t(r2, r9, r10, r14)
            k3f r14 = defpackage.rae.j(r4, r14)
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r14.a(r15)
            jc0 r15 = new jc0
            r15.<init>(r5, r9, r10)
            r14.a(r15)
            defpackage.rae.t(r2, r9, r10, r14)
            k3f r14 = defpackage.rae.j(r4, r14)
            jc0 r15 = new jc0
            r15.<init>(r6, r12, r10)
            r14.a(r15)
            jc0 r15 = new jc0
            r15.<init>(r5, r9, r10)
            r14.a(r15)
            defpackage.rae.t(r2, r9, r10, r14)
            r4.add(r14)
            r1.addAll(r4)
        L_0x0300:
            boolean r4 = r0.o
            if (r4 == 0) goto L_0x033f
            if (r7 != 0) goto L_0x033f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            k3f r14 = new k3f
            r14.<init>()
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r14.a(r15)
            defpackage.rae.t(r3, r9, r10, r14)
            k3f r14 = defpackage.rae.j(r4, r14)
            jc0 r15 = new jc0
            r15.<init>(r3, r12, r10)
            r14.a(r15)
            defpackage.rae.t(r6, r9, r10, r14)
            k3f r14 = defpackage.rae.j(r4, r14)
            jc0 r15 = new jc0
            r15.<init>(r6, r12, r10)
            r14.a(r15)
            defpackage.rae.t(r6, r9, r10, r14)
            r4.add(r14)
            r1.addAll(r4)
        L_0x033f:
            if (r7 != r5) goto L_0x038b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            k3f r7 = new k3f
            r7.<init>()
            jc0 r14 = new jc0
            r14.<init>(r3, r12, r10)
            r7.a(r14)
            jc0 r14 = new jc0
            r14.<init>(r3, r13, r10)
            r7.a(r14)
            jc0 r14 = new jc0
            r14.<init>(r6, r9, r10)
            r7.a(r14)
            defpackage.rae.t(r2, r9, r10, r7)
            k3f r7 = defpackage.rae.j(r4, r7)
            jc0 r14 = new jc0
            r14.<init>(r3, r12, r10)
            r7.a(r14)
            jc0 r14 = new jc0
            r14.<init>(r3, r13, r10)
            r7.a(r14)
            jc0 r13 = new jc0
            r13.<init>(r5, r9, r10)
            r7.a(r13)
            defpackage.rae.t(r2, r9, r10, r7)
            r4.add(r7)
            r1.addAll(r4)
        L_0x038b:
            java.util.ArrayList r4 = r0.a
            r4.addAll(r1)
            er7 r1 = r0.l
            java.lang.Object r1 = r1.b
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk r1 = (androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk) r1
            if (r1 != 0) goto L_0x039e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x03f6
        L_0x039e:
            k3f r1 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.a
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r7 = "heroqltevzw"
            boolean r7 = r7.equalsIgnoreCase(r1)
            if (r7 != 0) goto L_0x03e2
            java.lang.String r7 = "heroqltetmo"
            boolean r1 = r7.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x03b3
            goto L_0x03e2
        L_0x03b3:
            java.lang.String r1 = "google"
            java.lang.String r7 = android.os.Build.BRAND
            boolean r1 = r1.equalsIgnoreCase(r7)
            if (r1 != 0) goto L_0x03bf
            r1 = 0
            goto L_0x03cd
        L_0x03bf:
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r7)
            java.util.HashSet r7 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.c
            boolean r1 = r7.contains(r1)
        L_0x03cd:
            if (r1 != 0) goto L_0x03db
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.e()
            if (r1 == 0) goto L_0x03d6
            goto L_0x03db
        L_0x03d6:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x03f6
        L_0x03db:
            k3f r1 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.b
            java.util.List r1 = java.util.Collections.singletonList(r1)
            goto L_0x03f6
        L_0x03e2:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r7 = "1"
            java.lang.String r13 = r0.i
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L_0x03f6
            k3f r7 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.a
            r1.add(r7)
        L_0x03f6:
            r4.addAll(r1)
            boolean r1 = r0.r
            if (r1 == 0) goto L_0x0521
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            k3f r4 = new k3f
            r4.<init>()
            l3f r7 = defpackage.l3f.ULTRA_MAXIMUM
            jc0 r13 = new jc0
            r13.<init>(r6, r7, r10)
            r4.a(r13)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r4.a(r13)
            defpackage.rae.t(r3, r8, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r5, r7, r10)
            r4.a(r13)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r4.a(r13)
            defpackage.rae.t(r3, r8, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r2, r7, r10)
            r4.a(r13)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r4.a(r13)
            defpackage.rae.t(r3, r8, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r6, r7, r10)
            r4.a(r13)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r4.a(r13)
            defpackage.rae.t(r5, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r5, r7, r10)
            r4.a(r13)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r4.a(r13)
            defpackage.rae.t(r5, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r2, r7, r10)
            r4.a(r13)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r4.a(r13)
            defpackage.rae.t(r5, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r6, r7, r10)
            r4.a(r13)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r4.a(r13)
            defpackage.rae.t(r6, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r5, r7, r10)
            r4.a(r13)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r4.a(r13)
            defpackage.rae.t(r6, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r2, r7, r10)
            r4.a(r13)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r4.a(r13)
            defpackage.rae.t(r6, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r6, r7, r10)
            r4.a(r13)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r4.a(r13)
            defpackage.rae.t(r2, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r5, r7, r10)
            r4.a(r13)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r4.a(r13)
            defpackage.rae.t(r2, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r2, r7, r10)
            r4.a(r13)
            jc0 r7 = new jc0
            r7.<init>(r3, r12, r10)
            r4.a(r7)
            defpackage.rae.t(r2, r9, r10, r4)
            r1.add(r4)
            java.util.ArrayList r2 = r0.b
            r2.addAll(r1)
        L_0x0521:
            android.content.pm.PackageManager r1 = r17.getPackageManager()
            java.lang.String r2 = "android.hardware.camera.concurrent"
            boolean r1 = r1.hasSystemFeature(r2)
            r0.p = r1
            l3f r2 = defpackage.l3f.s1440p
            if (r1 == 0) goto L_0x05b0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            k3f r4 = new k3f
            r4.<init>()
            defpackage.rae.t(r6, r2, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            defpackage.rae.t(r3, r2, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            defpackage.rae.t(r5, r2, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            l3f r7 = defpackage.l3f.s720p
            jc0 r13 = new jc0
            r13.<init>(r6, r7, r10)
            r4.a(r13)
            defpackage.rae.t(r5, r2, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r3, r7, r10)
            r4.a(r13)
            defpackage.rae.t(r5, r2, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r6, r7, r10)
            r4.a(r13)
            defpackage.rae.t(r6, r2, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r6, r7, r10)
            r4.a(r13)
            defpackage.rae.t(r3, r2, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r3, r7, r10)
            r4.a(r13)
            defpackage.rae.t(r6, r2, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r3, r7, r10)
            r4.a(r13)
            defpackage.rae.t(r3, r2, r10, r4)
            r1.add(r4)
            java.util.ArrayList r4 = r0.c
            r4.addAll(r1)
        L_0x05b0:
            he r1 = r0.x
            boolean r1 = r1.b
            if (r1 == 0) goto L_0x063c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            k3f r4 = new k3f
            r4.<init>()
            defpackage.rae.t(r3, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            defpackage.rae.t(r6, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r7 = new jc0
            r7.<init>(r3, r12, r10)
            r4.a(r7)
            defpackage.rae.t(r5, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r7 = new jc0
            r7.<init>(r3, r12, r10)
            r4.a(r7)
            defpackage.rae.t(r6, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r7 = new jc0
            r7.<init>(r6, r12, r10)
            r4.a(r7)
            defpackage.rae.t(r6, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r7 = new jc0
            r7.<init>(r3, r12, r10)
            r4.a(r7)
            defpackage.rae.t(r3, r8, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r7 = new jc0
            r7.<init>(r3, r12, r10)
            r4.a(r7)
            jc0 r7 = new jc0
            r7.<init>(r3, r8, r10)
            r4.a(r7)
            defpackage.rae.t(r6, r8, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r7 = new jc0
            r7.<init>(r3, r12, r10)
            r4.a(r7)
            jc0 r7 = new jc0
            r7.<init>(r3, r8, r10)
            r4.a(r7)
            defpackage.rae.t(r5, r8, r10, r4)
            r1.add(r4)
            java.util.ArrayList r4 = r0.f
            r4.addAll(r1)
        L_0x063c:
            qt1 r1 = r0.k
            tgg r1 = r1.b()
            java.lang.Object r1 = r1.a
            nob r1 = (defpackage.nob) r1
            r1.getClass()
            r4 = 0
            java.lang.Object r1 = r1.a     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0653 }
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0653 }
            int[] r1 = r1.getOutputFormats()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0653 }
            goto L_0x0654
        L_0x0653:
            r1 = r4
        L_0x0654:
            if (r1 != 0) goto L_0x0657
            goto L_0x065e
        L_0x0657:
            java.lang.Object r1 = r1.clone()
            r4 = r1
            int[] r4 = (int[]) r4
        L_0x065e:
            if (r4 != 0) goto L_0x0661
            goto L_0x0693
        L_0x0661:
            int r1 = r4.length
            r7 = 0
        L_0x0663:
            if (r7 >= r1) goto L_0x0693
            r13 = r4[r7]
            r14 = 4101(0x1005, float:5.747E-42)
            if (r13 != r14) goto L_0x0691
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            k3f r4 = new k3f
            r4.<init>()
            r7 = 4
            defpackage.rae.t(r7, r9, r10, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r10)
            r4.a(r13)
            defpackage.rae.t(r7, r9, r10, r4)
            r1.add(r4)
            java.util.ArrayList r4 = r0.g
            r4.addAll(r1)
            goto L_0x0693
        L_0x0691:
            int r7 = r7 + r3
            goto L_0x0663
        L_0x0693:
            qt1 r1 = r0.k
            la0 r4 = defpackage.mxe.a
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r4 >= r7) goto L_0x069f
        L_0x069d:
            r1 = 0
            goto L_0x06b0
        L_0x069f:
            android.hardware.camera2.CameraCharacteristics$Key r13 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            java.lang.Object r1 = r1.a(r13)
            long[] r1 = (long[]) r1
            if (r1 == 0) goto L_0x069d
            int r1 = r1.length
            if (r1 != 0) goto L_0x06af
            goto L_0x069d
        L_0x06af:
            r1 = r3
        L_0x06b0:
            r0.q = r1
            if (r1 == 0) goto L_0x0796
            if (r4 < r7) goto L_0x0796
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            k3f r13 = new k3f
            r13.<init>()
            r14 = 4
            defpackage.rae.t(r3, r2, r14, r13)
            k3f r13 = defpackage.rae.j(r1, r13)
            defpackage.rae.t(r6, r2, r14, r13)
            k3f r13 = defpackage.rae.j(r1, r13)
            r14 = 3
            defpackage.rae.t(r3, r8, r14, r13)
            k3f r13 = defpackage.rae.j(r1, r13)
            defpackage.rae.t(r6, r8, r14, r13)
            k3f r13 = defpackage.rae.j(r1, r13)
            r10 = 2
            defpackage.rae.t(r5, r9, r10, r13)
            k3f r13 = defpackage.rae.j(r1, r13)
            defpackage.rae.t(r6, r9, r10, r13)
            k3f r13 = defpackage.rae.j(r1, r13)
            jc0 r7 = new jc0
            r14 = 1
            r7.<init>(r3, r12, r14)
            r13.a(r7)
            defpackage.rae.t(r5, r9, r10, r13)
            k3f r7 = defpackage.rae.j(r1, r13)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r14)
            r7.a(r13)
            defpackage.rae.t(r6, r9, r10, r7)
            k3f r7 = defpackage.rae.j(r1, r7)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r14)
            r7.a(r13)
            r10 = 3
            defpackage.rae.t(r3, r8, r10, r7)
            k3f r7 = defpackage.rae.j(r1, r7)
            jc0 r13 = new jc0
            r13.<init>(r3, r12, r14)
            r7.a(r13)
            defpackage.rae.t(r6, r8, r10, r7)
            k3f r7 = defpackage.rae.j(r1, r7)
            jc0 r10 = new jc0
            r10.<init>(r3, r12, r14)
            r7.a(r10)
            defpackage.rae.t(r6, r12, r14, r7)
            k3f r7 = defpackage.rae.j(r1, r7)
            jc0 r10 = new jc0
            r10.<init>(r3, r12, r14)
            r7.a(r10)
            jc0 r10 = new jc0
            r14 = 3
            r10.<init>(r3, r8, r14)
            r7.a(r10)
            r10 = 2
            defpackage.rae.t(r5, r8, r10, r7)
            k3f r7 = defpackage.rae.j(r1, r7)
            jc0 r10 = new jc0
            r13 = 1
            r10.<init>(r3, r12, r13)
            r7.a(r10)
            jc0 r10 = new jc0
            r13 = 3
            r10.<init>(r6, r8, r13)
            r7.a(r10)
            r10 = 2
            defpackage.rae.t(r5, r8, r10, r7)
            k3f r7 = defpackage.rae.j(r1, r7)
            jc0 r8 = new jc0
            r10 = 1
            r8.<init>(r3, r12, r10)
            r7.a(r8)
            jc0 r8 = new jc0
            r8.<init>(r6, r12, r10)
            r7.a(r8)
            r10 = 2
            defpackage.rae.t(r5, r9, r10, r7)
            r1.add(r7)
            java.util.ArrayList r7 = r0.h
            r7.addAll(r1)
        L_0x0796:
            qt1 r1 = r0.k
            r7 = 33
            if (r4 >= r7) goto L_0x079e
        L_0x079c:
            r4 = 0
            goto L_0x07b8
        L_0x079e:
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES
            java.lang.Object r1 = r1.a(r4)
            int[] r1 = (int[]) r1
            if (r1 == 0) goto L_0x079c
            int r4 = r1.length
            if (r4 != 0) goto L_0x07ac
            goto L_0x079c
        L_0x07ac:
            int r4 = r1.length
            r7 = 0
        L_0x07ae:
            if (r7 >= r4) goto L_0x079c
            r8 = r1[r7]
            if (r8 != r6) goto L_0x07b6
            r4 = r3
            goto L_0x07b8
        L_0x07b6:
            int r7 = r7 + r3
            goto L_0x07ae
        L_0x07b8:
            if (r4 == 0) goto L_0x0856
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r1 < r4) goto L_0x0856
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            k3f r4 = new k3f
            r4.<init>()
            r7 = 0
            defpackage.rae.t(r3, r2, r7, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            defpackage.rae.t(r6, r2, r7, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r10 = new jc0
            r10.<init>(r3, r2, r7)
            r4.a(r10)
            defpackage.rae.t(r5, r9, r7, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r10 = new jc0
            r10.<init>(r6, r2, r7)
            r4.a(r10)
            defpackage.rae.t(r5, r9, r7, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r5 = new jc0
            r5.<init>(r3, r2, r7)
            r4.a(r5)
            defpackage.rae.t(r6, r9, r7, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r5 = new jc0
            r5.<init>(r6, r2, r7)
            r4.a(r5)
            defpackage.rae.t(r6, r9, r7, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r5 = new jc0
            r5.<init>(r3, r12, r7)
            r4.a(r5)
            defpackage.rae.t(r3, r2, r7, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r5 = new jc0
            r5.<init>(r6, r12, r7)
            r4.a(r5)
            defpackage.rae.t(r3, r2, r7, r4)
            k3f r4 = defpackage.rae.j(r1, r4)
            jc0 r5 = new jc0
            r5.<init>(r3, r12, r7)
            r4.a(r5)
            defpackage.rae.t(r6, r2, r7, r4)
            k3f r3 = defpackage.rae.j(r1, r4)
            jc0 r4 = new jc0
            r4.<init>(r6, r12, r7)
            r3.a(r4)
            defpackage.rae.t(r6, r2, r7, r3)
            r1.add(r3)
            java.util.ArrayList r2 = r0.d
            r2.addAll(r1)
        L_0x0856:
            r16.b()
            return
        L_0x085a:
            androidx.camera.core.CameraUnavailableException r1 = new androidx.camera.core.CameraUnavailableException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3f.<init>(android.content.Context, java.lang.String, vu1, zq1):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.util.Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Size c(android.hardware.camera2.params.StreamConfigurationMap r3, int r4, boolean r5) {
        /*
            r0 = 34
            if (r4 != r0) goto L_0x000b
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            android.util.Size[] r0 = r3.getOutputSizes(r0)
            goto L_0x000f
        L_0x000b:
            android.util.Size[] r0 = r3.getOutputSizes(r4)
        L_0x000f:
            if (r0 == 0) goto L_0x004c
            int r1 = r0.length
            if (r1 != 0) goto L_0x0015
            goto L_0x004c
        L_0x0015:
            v93 r1 = new v93
            r2 = 0
            r1.<init>(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.Object r0 = java.util.Collections.max(r0, r1)
            android.util.Size r0 = (android.util.Size) r0
            android.util.Size r2 = defpackage.pde.a
            if (r5 == 0) goto L_0x003d
            android.util.Size[] r3 = r3.getHighResolutionOutputSizes(r4)
            if (r3 == 0) goto L_0x003d
            int r4 = r3.length
            if (r4 <= 0) goto L_0x003d
            java.util.List r3 = java.util.Arrays.asList(r3)
            java.lang.Object r3 = java.util.Collections.max(r3, r1)
            r2 = r3
            android.util.Size r2 = (android.util.Size) r2
        L_0x003d:
            android.util.Size[] r3 = new android.util.Size[]{r0, r2}
            java.util.List r3 = java.util.Arrays.asList(r3)
            java.lang.Object r3 = java.util.Collections.max(r3, r1)
            android.util.Size r3 = (android.util.Size) r3
            return r3
        L_0x004c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3f.c(android.hardware.camera2.params.StreamConfigurationMap, int, boolean):android.util.Size");
    }

    public static int e(Range range, Range range2) {
        bs0.r("Ranges must not intersect", !range.contains((Integer) range2.getUpper()) && !range.contains((Integer) range2.getLower()));
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(ic0 ic0, List list) {
        List<k3f> list2;
        HashMap hashMap = this.e;
        if (hashMap.containsKey(ic0)) {
            list2 = (List) hashMap.get(ic0);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z = ic0.d;
            int i2 = ic0.a;
            if (!z) {
                int i3 = ic0.b;
                if (i3 == 8) {
                    if (i2 != 1) {
                        ArrayList arrayList2 = this.a;
                        if (i2 != 2) {
                            if (ic0.c) {
                                arrayList2 = this.d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        list2 = this.c;
                        hashMap.put(ic0, list2);
                    }
                } else if (i3 == 10 && i2 == 0) {
                    arrayList.addAll(this.f);
                }
            } else if (i2 == 0) {
                arrayList.addAll(this.g);
            }
            list2 = arrayList;
            hashMap.put(ic0, list2);
        }
        boolean z2 = false;
        for (k3f c2 : list2) {
            if (c2.c(list) != null) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        return z2;
    }

    public final void b() {
        Size size;
        Size size2;
        Size e2 = this.u.e();
        try {
            int parseInt = Integer.parseInt(this.i);
            zq1 zq1 = this.j;
            CamcorderProfile camcorderProfile = null;
            CamcorderProfile c2 = zq1.d(parseInt, 1) ? zq1.c(parseInt, 1) : null;
            if (c2 != null) {
                size = new Size(c2.videoFrameWidth, c2.videoFrameHeight);
                this.s = new pc0(pde.c, new HashMap(), e2, new HashMap(), size, new HashMap(), new HashMap());
            }
            size2 = pde.d;
            if (zq1.d(parseInt, 10)) {
                camcorderProfile = zq1.c(parseInt, 10);
            } else if (zq1.d(parseInt, 8)) {
                camcorderProfile = zq1.c(parseInt, 8);
            } else if (zq1.d(parseInt, 12)) {
                camcorderProfile = zq1.c(parseInt, 12);
            } else if (zq1.d(parseInt, 6)) {
                camcorderProfile = zq1.c(parseInt, 6);
            } else if (zq1.d(parseInt, 5)) {
                camcorderProfile = zq1.c(parseInt, 5);
            } else if (zq1.d(parseInt, 4)) {
                camcorderProfile = zq1.c(parseInt, 4);
            }
            if (camcorderProfile != null) {
                size2 = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            size = size2;
            this.s = new pc0(pde.c, new HashMap(), e2, new HashMap(), size, new HashMap(), new HashMap());
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((nob) this.k.b().a).a).getOutputSizes(MediaRecorder.class);
            if (outputSizes != null) {
                Arrays.sort(outputSizes, new v93(true));
                int length = outputSizes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        size2 = pde.d;
                        break;
                    }
                    Size size3 = outputSizes[i2];
                    int width = size3.getWidth();
                    Size size4 = pde.f;
                    if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                        size2 = size3;
                        break;
                    }
                    i2++;
                }
            } else {
                size2 = pde.d;
            }
        }
    }

    public final List d(ic0 ic0, List list) {
        la0 la0 = mxe.a;
        if (ic0.a == 0 && ic0.b == 8) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                List c2 = ((k3f) it.next()).c(list);
                if (c2 != null) {
                    return c2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: android.util.Range} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: android.util.Range} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: android.util.Range} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: android.util.Range} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v54, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02d6, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x06a7, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x07c2, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0a58, code lost:
        if (r1 < r4) goto L_0x0a85;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0afa, code lost:
        if (f(r6) < f(r11)) goto L_0x0ab3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d0, code lost:
        if (r5.contains(r13) != false) goto L_0x01d2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0ac6  */
    /* JADX WARNING: Removed duplicated region for block: B:645:0x0289 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:673:0x04d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0272  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair g(int r40, java.util.ArrayList r41, java.util.HashMap r42, boolean r43, boolean r44) {
        /*
            r39 = this;
            r9 = r39
            r10 = r40
            r11 = r41
            r0 = r42
            hq4 r1 = r9.u
            android.util.Size r2 = r1.a()
            r1.b = r2
            pc0 r1 = r9.s
            if (r1 != 0) goto L_0x0018
            r39.b()
            goto L_0x0045
        L_0x0018:
            hq4 r1 = r9.u
            android.util.Size r16 = r1.e()
            pc0 r1 = r9.s
            android.util.Size r14 = r1.a
            java.util.Map r2 = r1.b
            java.util.Map r3 = r1.d
            android.util.Size r4 = r1.e
            java.util.Map r5 = r1.f
            java.util.Map r1 = r1.g
            pc0 r6 = new pc0
            r15 = r2
            java.util.HashMap r15 = (java.util.HashMap) r15
            r17 = r3
            java.util.HashMap r17 = (java.util.HashMap) r17
            r19 = r5
            java.util.HashMap r19 = (java.util.HashMap) r19
            r20 = r1
            java.util.HashMap r20 = (java.util.HashMap) r20
            r13 = r6
            r18 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r9.s = r6
        L_0x0045:
            java.util.ArrayList r13 = new java.util.ArrayList
            java.util.Set r1 = r42.keySet()
            r13.<init>(r1)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r13.iterator()
        L_0x005c:
            boolean r3 = r2.hasNext()
            r15 = 0
            if (r3 == 0) goto L_0x0082
            java.lang.Object r3 = r2.next()
            zzf r3 = (defpackage.zzf) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            la0 r5 = defpackage.zzf.n0
            java.lang.Object r3 = r3.k(r5, r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            boolean r4 = r1.contains(r3)
            if (r4 != 0) goto L_0x005c
            r1.add(r3)
            goto L_0x005c
        L_0x0082:
            java.util.Collections.sort(r1)
            java.util.Collections.reverse(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x008c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Iterator r3 = r13.iterator()
        L_0x00a0:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r3.next()
            zzf r4 = (defpackage.zzf) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            la0 r6 = defpackage.zzf.n0
            java.lang.Object r5 = r4.k(r6, r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r2 != r5) goto L_0x00a0
            int r4 = r13.indexOf(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r14.add(r4)
            goto L_0x00a0
        L_0x00ca:
            he r1 = r9.x
            r1.getClass()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r3 = r41.iterator()
        L_0x00d8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00ea
            java.lang.Object r4 = r3.next()
            w90 r4 = (defpackage.w90) r4
            vy4 r4 = r4.d
            r2.add(r4)
            goto L_0x00d8
        L_0x00ea:
            java.lang.Object r3 = r1.o
            b8d r3 = (defpackage.b8d) r3
            java.lang.Object r4 = r3.a
            zy4 r4 = (defpackage.zy4) r4
            java.util.Set r4 = r4.b()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r4)
            java.util.Iterator r6 = r2.iterator()
        L_0x00ff:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x010f
            java.lang.Object r7 = r6.next()
            vy4 r7 = (defpackage.vy4) r7
            defpackage.he.u(r5, r7, r3)
            goto L_0x00ff
        L_0x010f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r16 = r14.iterator()
        L_0x0122:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x0169
            java.lang.Object r17 = r16.next()
            java.lang.Integer r17 = (java.lang.Integer) r17
            int r12 = r17.intValue()
            java.lang.Object r12 = r13.get(r12)
            zzf r12 = (defpackage.zzf) r12
            vy4 r15 = r12.D()
            vy4 r11 = defpackage.vy4.c
            boolean r11 = r15.equals(r11)
            if (r11 == 0) goto L_0x014a
            r8.add(r12)
            r20 = r13
            goto L_0x0163
        L_0x014a:
            int r11 = r15.a
            r20 = r13
            r13 = 2
            if (r11 == r13) goto L_0x0160
            int r13 = r15.b
            if (r11 == 0) goto L_0x0157
            if (r13 == 0) goto L_0x0160
        L_0x0157:
            if (r11 != 0) goto L_0x015c
            if (r13 == 0) goto L_0x015c
            goto L_0x0160
        L_0x015c:
            r6.add(r12)
            goto L_0x0163
        L_0x0160:
            r7.add(r12)
        L_0x0163:
            r11 = r41
            r13 = r20
            r15 = 0
            goto L_0x0122
        L_0x0169:
            r20 = r13
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.addAll(r6)
            r13.addAll(r7)
            r13.addAll(r8)
            java.util.Iterator r6 = r13.iterator()
        L_0x0187:
            boolean r7 = r6.hasNext()
            vy4 r13 = defpackage.vy4.d
            if (r7 == 0) goto L_0x02be
            java.lang.Object r7 = r6.next()
            zzf r7 = (defpackage.zzf) r7
            vy4 r15 = r7.D()
            la0 r8 = defpackage.cdf.g0
            java.lang.Object r8 = r7.n(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r15.b()
            if (r8 == 0) goto L_0x01bf
            boolean r8 = r5.contains(r15)
            if (r8 == 0) goto L_0x01b6
            r16 = r1
            r23 = r6
            r24 = r14
            r13 = r15
            goto L_0x0270
        L_0x01b6:
            r16 = r1
            r23 = r6
            r24 = r14
        L_0x01bc:
            r13 = 0
            goto L_0x0270
        L_0x01bf:
            int r8 = r15.a
            r23 = r6
            int r6 = r15.b
            r24 = r14
            r14 = 1
            if (r8 != r14) goto L_0x01d9
            if (r6 != 0) goto L_0x01d9
            boolean r6 = r5.contains(r13)
            if (r6 == 0) goto L_0x01d6
        L_0x01d2:
            r16 = r1
            goto L_0x0270
        L_0x01d6:
            r16 = r1
            goto L_0x01bc
        L_0x01d9:
            vy4 r14 = defpackage.he.r(r15, r2, r5)
            if (r14 == 0) goto L_0x01ea
            r15.toString()
            r14.toString()
        L_0x01e5:
            r16 = r1
            r13 = r14
            goto L_0x0270
        L_0x01ea:
            vy4 r14 = defpackage.he.r(r15, r12, r5)
            if (r14 == 0) goto L_0x01f7
            r15.toString()
            r14.toString()
            goto L_0x01e5
        L_0x01f7:
            boolean r14 = defpackage.he.l(r15, r13, r5)
            if (r14 == 0) goto L_0x0204
            r15.toString()
            r13.toString()
            goto L_0x01d2
        L_0x0204:
            r14 = 2
            if (r8 != r14) goto L_0x023f
            r8 = 10
            if (r6 == r8) goto L_0x020d
            if (r6 != 0) goto L_0x023f
        L_0x020d:
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            int r8 = android.os.Build.VERSION.SDK_INT
            r14 = 33
            if (r8 < r14) goto L_0x0226
            java.lang.Object r8 = r1.c
            qt1 r8 = (defpackage.qt1) r8
            vy4 r8 = defpackage.xy4.b(r8)
            if (r8 == 0) goto L_0x0227
            r6.add(r8)
            goto L_0x0227
        L_0x0226:
            r8 = 0
        L_0x0227:
            vy4 r14 = defpackage.vy4.e
            r6.add(r14)
            vy4 r6 = defpackage.he.r(r15, r6, r5)
            if (r6 == 0) goto L_0x023f
            r6.equals(r8)
            r15.toString()
            r6.toString()
            r16 = r1
            r13 = r6
            goto L_0x0270
        L_0x023f:
            java.util.Iterator r6 = r5.iterator()
        L_0x0243:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x01d6
            java.lang.Object r8 = r6.next()
            vy4 r8 = (defpackage.vy4) r8
            boolean r14 = r8.b()
            r16 = r1
            java.lang.String r1 = "Candidate dynamic range must be fully specified."
            defpackage.bs0.r(r1, r14)
            boolean r1 = r8.equals(r13)
            if (r1 == 0) goto L_0x0263
        L_0x0260:
            r1 = r16
            goto L_0x0243
        L_0x0263:
            boolean r1 = defpackage.he.j(r15, r8)
            if (r1 == 0) goto L_0x0260
            r15.toString()
            r8.toString()
            r13 = r8
        L_0x0270:
            if (r13 == 0) goto L_0x0289
            defpackage.he.u(r5, r13, r3)
            r11.put(r7, r13)
            boolean r1 = r2.contains(r13)
            if (r1 != 0) goto L_0x0281
            r12.add(r13)
        L_0x0281:
            r1 = r16
            r6 = r23
            r14 = r24
            goto L_0x0187
        L_0x0289:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            la0 r1 = defpackage.cdf.g0
            java.lang.Object r1 = r7.n(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "\n  "
            java.lang.String r3 = android.text.TextUtils.join(r2, r4)
            java.lang.String r2 = android.text.TextUtils.join(r2, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = "\nRequested dynamic range:\n  "
            r4.append(r1)
            r4.append(r15)
            java.lang.String r1 = "\nSupported dynamic ranges:\n  "
            r4.append(r1)
            java.lang.String r1 = "\nConstrained set of concurrent dynamic ranges:\n  "
            java.lang.String r1 = defpackage.rae.q(r4, r3, r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x02be:
            r24 = r14
            java.util.Iterator r1 = r41.iterator()
        L_0x02c4:
            boolean r2 = r1.hasNext()
            r3 = 4101(0x1005, float:5.747E-42)
            if (r2 == 0) goto L_0x02d8
            java.lang.Object r2 = r1.next()
            w90 r2 = (defpackage.w90) r2
            int r2 = r2.b
            if (r2 != r3) goto L_0x02c4
        L_0x02d6:
            r1 = 1
            goto L_0x02f4
        L_0x02d8:
            java.util.Set r1 = r42.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x02e0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02f3
            java.lang.Object r2 = r1.next()
            zzf r2 = (defpackage.zzf) r2
            int r2 = r2.getInputFormat()
            if (r2 != r3) goto L_0x02e0
            goto L_0x02d6
        L_0x02f3:
            r1 = 0
        L_0x02f4:
            java.util.Collection r2 = r11.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x02fc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0311
            java.lang.Object r3 = r2.next()
            vy4 r3 = (defpackage.vy4) r3
            int r3 = r3.b
            r4 = 10
            if (r3 != r4) goto L_0x02fc
            r8 = 10
            goto L_0x0313
        L_0x0311:
            r8 = 8
        L_0x0313:
            java.lang.String r2 = r9.i
            java.lang.String r3 = "CONCURRENT_CAMERA"
            java.lang.String r4 = "ULTRA_HIGH_RESOLUTION_CAMERA"
            java.lang.String r5 = "DEFAULT"
            java.lang.String r6 = " camera mode."
            java.lang.String r7 = "Camera device id is "
            if (r10 == 0) goto L_0x0339
            if (r1 != 0) goto L_0x0324
            goto L_0x0339
        L_0x0324:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            if (r10 == r1) goto L_0x032f
            r1 = 2
            if (r10 == r1) goto L_0x032e
            r3 = r5
            goto L_0x032f
        L_0x032e:
            r3 = r4
        L_0x032f:
            java.lang.String r1 = ". Ultra HDR is not currently supported in "
            java.lang.String r1 = defpackage.rae.p(r7, r2, r1, r3, r6)
            r0.<init>(r1)
            throw r0
        L_0x0339:
            if (r10 == 0) goto L_0x0355
            r12 = 10
            if (r8 == r12) goto L_0x0340
            goto L_0x0355
        L_0x0340:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            if (r10 == r1) goto L_0x034b
            r1 = 2
            if (r10 == r1) goto L_0x034a
            r3 = r5
            goto L_0x034b
        L_0x034a:
            r3 = r4
        L_0x034b:
            java.lang.String r1 = ". 10 bit dynamic range is not currently supported in "
            java.lang.String r1 = defpackage.rae.p(r7, r2, r1, r3, r6)
            r0.<init>(r1)
            throw r0
        L_0x0355:
            ic0 r12 = new ic0
            r2 = r43
            r12.<init>(r10, r8, r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r41.iterator()
        L_0x0365:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0377
            java.lang.Object r3 = r2.next()
            w90 r3 = (defpackage.w90) r3
            jc0 r3 = r3.a
            r1.add(r3)
            goto L_0x0365
        L_0x0377:
            v93 r2 = new v93
            r3 = 0
            r2.<init>(r3)
            java.util.Set r3 = r42.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0385:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03d0
            java.lang.Object r4 = r3.next()
            zzf r4 = (defpackage.zzf) r4
            java.lang.Object r5 = r0.get(r4)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x03a1
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x03a1
            r6 = 1
            goto L_0x03a2
        L_0x03a1:
            r6 = 0
        L_0x03a2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "No available output size is found for "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r8 = "."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            defpackage.bs0.m(r7, r6)
            java.lang.Object r5 = java.util.Collections.min(r5, r2)
            android.util.Size r5 = (android.util.Size) r5
            int r4 = r4.getInputFormat()
            int r6 = r12.a
            pc0 r7 = r9.i(r4)
            jc0 r4 = defpackage.jc0.b(r6, r4, r5, r7)
            r1.add(r4)
            goto L_0x0385
        L_0x03d0:
            boolean r14 = r9.a(r12, r1)
            java.lang.String r15 = ".  May be attempting to bind too many use cases. Existing surfaces: "
            java.lang.String r8 = " New configs: "
            java.lang.String r7 = "No supported surface combination is found for camera device - Id : "
            if (r14 == 0) goto L_0x0efe
            java.util.Iterator r1 = r41.iterator()
            r2 = 0
        L_0x03e1:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x03fa
            java.lang.Object r3 = r1.next()
            w90 r3 = (defpackage.w90) r3
            android.util.Range r3 = r3.g
            if (r2 != 0) goto L_0x03f3
            r2 = r3
            goto L_0x03e1
        L_0x03f3:
            if (r3 == 0) goto L_0x03e1
            android.util.Range r2 = r2.intersect(r3)     // Catch:{ IllegalArgumentException -> 0x03e1 }
            goto L_0x03e1
        L_0x03fa:
            java.util.Iterator r1 = r24.iterator()
            r6 = r2
        L_0x03ff:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x042e
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5 = r20
            java.lang.Object r2 = r5.get(r2)
            zzf r2 = (defpackage.zzf) r2
            la0 r3 = defpackage.zzf.o0
            r4 = 0
            java.lang.Object r2 = r2.k(r3, r4)
            android.util.Range r2 = (android.util.Range) r2
            if (r6 != 0) goto L_0x0424
        L_0x0422:
            r6 = r2
            goto L_0x042b
        L_0x0424:
            if (r2 == 0) goto L_0x042b
            android.util.Range r2 = r6.intersect(r2)     // Catch:{ IllegalArgumentException -> 0x042b }
            goto L_0x0422
        L_0x042b:
            r20 = r5
            goto L_0x03ff
        L_0x042e:
            r5 = r20
            r4 = 0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r2 = r42.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x043e:
            boolean r3 = r2.hasNext()
            r20 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            if (r3 == 0) goto L_0x04fb
            java.lang.Object r3 = r2.next()
            zzf r3 = (defpackage.zzf) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.Object r23 = r0.get(r3)
            java.util.List r23 = (java.util.List) r23
            java.util.Iterator r23 = r23.iterator()
        L_0x0463:
            boolean r25 = r23.hasNext()
            if (r25 == 0) goto L_0x04e5
            java.lang.Object r25 = r23.next()
            r0 = r25
            android.util.Size r0 = (android.util.Size) r0
            r25 = r2
            int r2 = r3.getInputFormat()
            r26 = r7
            int r7 = r12.a
            r27 = r8
            pc0 r8 = r9.i(r2)
            jc0 r7 = defpackage.jc0.b(r7, r2, r0, r8)
            if (r6 == 0) goto L_0x04a6
            qt1 r8 = r9.k
            r28 = r6
            android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Exception -> 0x04a0 }
            java.lang.Object r6 = r8.a(r6)     // Catch:{ Exception -> 0x04a0 }
            android.hardware.camera2.params.StreamConfigurationMap r6 = (android.hardware.camera2.params.StreamConfigurationMap) r6     // Catch:{ Exception -> 0x04a0 }
            r29 = r13
            r30 = r14
            long r13 = r6.getOutputMinFrameDuration(r2, r0)     // Catch:{ Exception -> 0x04a4 }
            double r13 = (double) r13
            double r13 = r20 / r13
            int r2 = (int) r13
            goto L_0x04af
        L_0x04a0:
            r29 = r13
            r30 = r14
        L_0x04a4:
            r2 = 0
            goto L_0x04af
        L_0x04a6:
            r28 = r6
            r29 = r13
            r30 = r14
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x04af:
            l3f r6 = r7.b
            java.lang.Object r7 = r10.get(r6)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 != 0) goto L_0x04c1
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r10.put(r6, r7)
        L_0x04c1:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r6 = r7.contains(r6)
            if (r6 != 0) goto L_0x04d5
            r4.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.add(r0)
        L_0x04d5:
            r0 = r42
            r2 = r25
            r7 = r26
            r8 = r27
            r6 = r28
            r13 = r29
            r14 = r30
            goto L_0x0463
        L_0x04e5:
            r25 = r2
            r28 = r6
            r26 = r7
            r27 = r8
            r29 = r13
            r30 = r14
            r1.put(r3, r4)
            r10 = r40
            r0 = r42
            r4 = 0
            goto L_0x043e
        L_0x04fb:
            r28 = r6
            r26 = r7
            r27 = r8
            r29 = r13
            r30 = r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r24.iterator()
        L_0x050e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x05f4
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r3 = r5.get(r3)
            zzf r3 = (defpackage.zzf) r3
            java.lang.Object r4 = r1.get(r3)
            java.util.List r4 = (java.util.List) r4
            int r3 = r3.getInputFormat()
            wc8 r6 = r9.v
            qt1 r7 = r9.k
            r6.getClass()
            ykb r6 = defpackage.qn4.a
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class
            icc r6 = r6.g(r8)
            androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk r6 = (androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk) r6
            if (r6 == 0) goto L_0x0543
        L_0x0541:
            r13 = 2
            goto L_0x0553
        L_0x0543:
            ykb r6 = defpackage.cjf.w(r7)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk> r7 = androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.class
            icc r6 = r6.g(r7)
            androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk r6 = (androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk) r6
            if (r6 == 0) goto L_0x0552
            goto L_0x0541
        L_0x0552:
            r13 = 3
        L_0x0553:
            if (r13 == 0) goto L_0x0581
            r6 = 1
            if (r13 == r6) goto L_0x057d
            r6 = 2
            if (r13 == r6) goto L_0x055d
            r8 = 0
            goto L_0x0584
        L_0x055d:
            r7 = 256(0x100, float:3.59E-43)
            pc0 r8 = r9.i(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.Map r8 = r8.f
            java.lang.Object r7 = r8.get(r7)
            android.util.Size r7 = (android.util.Size) r7
            android.util.Rational r8 = new android.util.Rational
            int r10 = r7.getWidth()
            int r7 = r7.getHeight()
            r8.<init>(r10, r7)
            goto L_0x0584
        L_0x057d:
            r6 = 2
            android.util.Rational r8 = defpackage.ht.c
            goto L_0x0584
        L_0x0581:
            r6 = 2
            android.util.Rational r8 = defpackage.ht.a
        L_0x0584:
            if (r8 != 0) goto L_0x0587
            goto L_0x05b8
        L_0x0587:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0595:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x05b3
            java.lang.Object r13 = r4.next()
            android.util.Size r13 = (android.util.Size) r13
            android.util.Rational r14 = defpackage.ht.a
            android.util.Size r14 = defpackage.pde.c
            boolean r14 = defpackage.ht.a(r13, r8, r14)
            if (r14 == 0) goto L_0x05af
            r7.add(r13)
            goto L_0x0595
        L_0x05af:
            r10.add(r13)
            goto L_0x0595
        L_0x05b3:
            r13 = 0
            r10.addAll(r13, r7)
            r4 = r10
        L_0x05b8:
            yu9 r7 = r9.w
            int r3 = defpackage.jc0.a(r3)
            java.lang.Object r7 = r7.b
            androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r7 = (androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk) r7
            if (r7 != 0) goto L_0x05c5
            goto L_0x05ef
        L_0x05c5:
            android.util.Size r3 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.e(r3)
            if (r3 != 0) goto L_0x05cc
            goto L_0x05ef
        L_0x05cc:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r3)
            java.util.Iterator r4 = r4.iterator()
        L_0x05d8:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x05ee
            java.lang.Object r8 = r4.next()
            android.util.Size r8 = (android.util.Size) r8
            boolean r10 = r8.equals(r3)
            if (r10 != 0) goto L_0x05d8
            r7.add(r8)
            goto L_0x05d8
        L_0x05ee:
            r4 = r7
        L_0x05ef:
            r0.add(r4)
            goto L_0x050e
        L_0x05f4:
            java.util.Iterator r1 = r0.iterator()
            r2 = 1
        L_0x05f9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x060b
            java.lang.Object r3 = r1.next()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            int r2 = r2 * r3
            goto L_0x05f9
        L_0x060b:
            if (r2 == 0) goto L_0x0ef6
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r1 = 0
        L_0x0613:
            if (r1 >= r2) goto L_0x0620
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10.add(r3)
            r3 = 1
            int r1 = r1 + r3
            goto L_0x0613
        L_0x0620:
            r1 = 0
            java.lang.Object r3 = r0.get(r1)
            java.util.List r3 = (java.util.List) r3
            int r1 = r3.size()
            int r1 = r2 / r1
            r4 = r2
            r3 = 0
        L_0x062f:
            int r6 = r0.size()
            if (r3 >= r6) goto L_0x0670
            java.lang.Object r6 = r0.get(r3)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
        L_0x063c:
            if (r7 >= r2) goto L_0x0653
            java.lang.Object r8 = r10.get(r7)
            java.util.List r8 = (java.util.List) r8
            int r13 = r7 % r4
            int r13 = r13 / r1
            java.lang.Object r13 = r6.get(r13)
            android.util.Size r13 = (android.util.Size) r13
            r8.add(r13)
            r8 = 1
            int r7 = r7 + r8
            goto L_0x063c
        L_0x0653:
            r8 = 1
            int r6 = r0.size()
            int r6 = r6 - r8
            if (r3 >= r6) goto L_0x066e
            int r4 = r3 + 1
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            int r4 = r1 / r4
            r38 = r4
            r4 = r1
            r1 = r38
        L_0x066e:
            int r3 = r3 + r8
            goto L_0x062f
        L_0x0670:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            la0 r0 = defpackage.mxe.a
            java.util.Iterator r0 = r41.iterator()
        L_0x068a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x06a9
            java.lang.Object r1 = r0.next()
            w90 r1 = (defpackage.w90) r1
            java.util.List r2 = r1.e
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            b0g r2 = (defpackage.b0g) r2
            je3 r1 = r1.f
            boolean r1 = defpackage.mxe.c(r1, r2)
            if (r1 == 0) goto L_0x068a
        L_0x06a7:
            r0 = 1
            goto L_0x06c5
        L_0x06a9:
            java.util.Iterator r0 = r5.iterator()
        L_0x06ad:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x06c4
            java.lang.Object r1 = r0.next()
            zzf r1 = (defpackage.zzf) r1
            b0g r2 = r1.O()
            boolean r1 = defpackage.mxe.c(r1, r2)
            if (r1 == 0) goto L_0x06ad
            goto L_0x06a7
        L_0x06c4:
            r0 = 0
        L_0x06c5:
            java.util.Iterator r1 = r41.iterator()
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x06cc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x06f9
            java.lang.Object r2 = r1.next()
            w90 r2 = (defpackage.w90) r2
            int r3 = r2.b
            android.util.Size r2 = r2.c
            qt1 r4 = r9.k
            r42 = r1
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Exception -> 0x06f1 }
            java.lang.Object r1 = r4.a(r1)     // Catch:{ Exception -> 0x06f1 }
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1     // Catch:{ Exception -> 0x06f1 }
            long r1 = r1.getOutputMinFrameDuration(r3, r2)     // Catch:{ Exception -> 0x06f1 }
            double r1 = (double) r1
            double r1 = r20 / r1
            int r3 = (int) r1
            goto L_0x06f2
        L_0x06f1:
            r3 = 0
        L_0x06f2:
            int r6 = java.lang.Math.min(r6, r3)
            r1 = r42
            goto L_0x06cc
        L_0x06f9:
            boolean r1 = r9.q
            java.lang.String r4 = "SurfaceConfig does not map to any use case"
            if (r1 == 0) goto L_0x0880
            if (r0 != 0) goto L_0x0880
            java.util.Iterator r17 = r10.iterator()
            r0 = 0
        L_0x0706:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x083c
            java.lang.Object r0 = r17.next()
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            r0 = r39
            r1 = r40
            r2 = r41
            r42 = r13
            r20 = 0
            r13 = r4
            r4 = r5
            r21 = r14
            r14 = r5
            r5 = r24
            r23 = r6
            r22 = r11
            r11 = r28
            r25 = r7
            r11 = r26
            r7 = r8
            r26 = r10
            r10 = r27
            r27 = r14
            r14 = r8
            r8 = r25
            android.util.Pair r0 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.first
            java.util.List r0 = (java.util.List) r0
            java.util.List r4 = r9.d(r12, r0)
            if (r4 == 0) goto L_0x07d0
            r3 = 0
        L_0x0747:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x07d0
            java.lang.Object r0 = r4.get(r3)
            jc0 r0 = (defpackage.jc0) r0
            long r0 = r0.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r14.containsKey(r2)
            b0g r5 = defpackage.b0g.v
            if (r2 == 0) goto L_0x078c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r14.get(r2)
            w90 r2 = (defpackage.w90) r2
            java.util.List r6 = r2.e
            int r6 = r6.size()
            java.util.List r2 = r2.e
            r7 = 1
            if (r6 != r7) goto L_0x077e
            r8 = 0
            java.lang.Object r5 = r2.get(r8)
            b0g r5 = (defpackage.b0g) r5
            goto L_0x077f
        L_0x077e:
            r8 = 0
        L_0x077f:
            boolean r0 = defpackage.mxe.b(r5, r0, r2)
            if (r0 != 0) goto L_0x0788
            r7 = r25
            goto L_0x07c2
        L_0x0788:
            r7 = r25
        L_0x078a:
            r0 = 1
            goto L_0x07c5
        L_0x078c:
            r8 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r7 = r25
            boolean r2 = r7.containsKey(r2)
            if (r2 == 0) goto L_0x07ca
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r7.get(r2)
            zzf r2 = (defpackage.zzf) r2
            b0g r6 = r2.O()
            b0g r8 = r2.O()
            if (r8 != r5) goto L_0x07b8
            lxe r2 = (defpackage.lxe) r2
            la0 r5 = defpackage.lxe.b
            java.lang.Object r2 = r2.n(r5)
            java.util.List r2 = (java.util.List) r2
            goto L_0x07bc
        L_0x07b8:
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x07bc:
            boolean r0 = defpackage.mxe.b(r6, r0, r2)
            if (r0 != 0) goto L_0x078a
        L_0x07c2:
            r4 = r20
            goto L_0x07d2
        L_0x07c5:
            int r3 = r3 + r0
            r25 = r7
            goto L_0x0747
        L_0x07ca:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r13)
            throw r0
        L_0x07d0:
            r7 = r25
        L_0x07d2:
            if (r4 == 0) goto L_0x0821
            qt1 r0 = r9.k
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 >= r2) goto L_0x07dd
            goto L_0x081e
        L_0x07dd:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            java.lang.Object r0 = r0.a(r1)
            long[] r0 = (long[]) r0
            if (r0 == 0) goto L_0x081e
            int r1 = r0.length
            if (r1 != 0) goto L_0x07ed
            goto L_0x081e
        L_0x07ed:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        L_0x07f4:
            if (r3 >= r2) goto L_0x0802
            r5 = r0[r3]
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r1.add(r5)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x07f4
        L_0x0802:
            java.util.Iterator r0 = r4.iterator()
        L_0x0806:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0851
            java.lang.Object r2 = r0.next()
            jc0 r2 = (defpackage.jc0) r2
            long r2 = r2.c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L_0x0806
        L_0x081e:
            r0 = r20
            goto L_0x0822
        L_0x0821:
            r0 = r4
        L_0x0822:
            r14.clear()
            r7.clear()
            r4 = r13
            r8 = r14
            r14 = r21
            r6 = r23
            r5 = r27
            r13 = r42
            r27 = r10
            r10 = r26
            r26 = r11
            r11 = r22
            goto L_0x0706
        L_0x083c:
            r23 = r6
            r22 = r11
            r42 = r13
            r21 = r14
            r11 = r26
            r20 = 0
            r13 = r4
            r14 = r8
            r26 = r10
            r10 = r27
            r27 = r5
            r4 = r0
        L_0x0851:
            if (r4 != 0) goto L_0x0855
            if (r30 == 0) goto L_0x085a
        L_0x0855:
            r15 = r41
            r8 = r27
            goto L_0x087e
        L_0x085a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r11)
            java.lang.String r2 = r9.i
            r1.append(r2)
            r1.append(r15)
            r15 = r41
            r1.append(r15)
            r1.append(r10)
            r8 = r27
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x087e:
            r6 = r4
            goto L_0x0897
        L_0x0880:
            r15 = r41
            r23 = r6
            r22 = r11
            r42 = r13
            r21 = r14
            r11 = r26
            r20 = 0
            r13 = r4
            r14 = r8
            r26 = r10
            r10 = r27
            r8 = r5
            r6 = r20
        L_0x0897:
            java.util.Iterator r17 = r26.iterator()
            r25 = r20
            r26 = r25
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r27 = 0
            r30 = 0
        L_0x08a9:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0966
            java.lang.Object r0 = r17.next()
            r31 = r0
            java.util.List r31 = (java.util.List) r31
            r32 = 0
            r33 = 0
            r0 = r39
            r1 = r40
            r2 = r41
            r3 = r31
            r34 = r4
            r4 = r8
            r35 = r5
            r5 = r24
            r36 = r6
            r6 = r23
            r37 = r10
            r10 = r7
            r7 = r32
            r32 = r8
            r18 = 0
            r8 = r33
            android.util.Pair r0 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r0.first
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
            if (r28 == 0) goto L_0x08fc
            if (r6 <= r5) goto L_0x08fc
            java.lang.Comparable r0 = r28.getLower()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r5 >= r0) goto L_0x08fc
            r0 = r18
            goto L_0x08fd
        L_0x08fc:
            r0 = 1
        L_0x08fd:
            if (r27 != 0) goto L_0x092b
            boolean r2 = r9.a(r12, r1)
            if (r2 == 0) goto L_0x092b
            r3 = r35
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto L_0x090d
            goto L_0x090f
        L_0x090d:
            if (r3 >= r5) goto L_0x0912
        L_0x090f:
            r3 = r5
            r25 = r31
        L_0x0912:
            if (r0 == 0) goto L_0x0928
            if (r30 == 0) goto L_0x0920
            r1 = r26
            r0 = r31
            r2 = r34
            r4 = r36
            goto L_0x0974
        L_0x0920:
            r3 = r5
            r25 = r31
            r4 = r36
            r27 = 1
            goto L_0x092e
        L_0x0928:
            r4 = r36
            goto L_0x092e
        L_0x092b:
            r3 = r35
            goto L_0x0928
        L_0x092e:
            if (r4 == 0) goto L_0x0955
            if (r30 != 0) goto L_0x0955
            java.util.List r1 = r9.d(r12, r1)
            if (r1 == 0) goto L_0x0955
            r2 = r34
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x0940
            goto L_0x0942
        L_0x0940:
            if (r2 >= r5) goto L_0x0945
        L_0x0942:
            r2 = r5
            r26 = r31
        L_0x0945:
            if (r0 == 0) goto L_0x095a
            r2 = r5
            if (r27 == 0) goto L_0x0950
            r0 = r25
            r1 = r31
            r5 = r3
            goto L_0x0974
        L_0x0950:
            r26 = r31
            r30 = 1
            goto L_0x095a
        L_0x0955:
            r2 = r34
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x095a:
            r5 = r3
            r23 = r6
            r7 = r10
            r8 = r32
            r10 = r37
            r6 = r4
            r4 = r2
            goto L_0x08a9
        L_0x0966:
            r2 = r4
            r3 = r5
            r4 = r6
            r32 = r8
            r37 = r10
            r18 = 0
            r10 = r7
            r0 = r25
            r1 = r26
        L_0x0974:
            if (r0 == 0) goto L_0x0ec5
            if (r28 == 0) goto L_0x0b2f
            android.util.Range r3 = defpackage.hc0.f
            r6 = r28
            boolean r7 = r6.equals(r3)
            if (r7 == 0) goto L_0x0992
        L_0x0982:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r26 = r10
            r23 = r13
            r25 = r14
            goto L_0x0b3f
        L_0x0992:
            qt1 r7 = r9.k
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r7 = r7.a(r8)
            android.util.Range[] r7 = (android.util.Range[]) r7
            if (r7 != 0) goto L_0x099f
            goto L_0x0982
        L_0x099f:
            android.util.Range r8 = new android.util.Range
            java.lang.Comparable r11 = r6.getLower()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            int r11 = java.lang.Math.min(r11, r5)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Comparable r6 = r6.getUpper()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = java.lang.Math.min(r6, r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.<init>(r11, r6)
            int r6 = r7.length
            r11 = r3
            r3 = r18
            r12 = r3
        L_0x09cd:
            if (r3 >= r6) goto L_0x0b23
            r17 = r6
            r6 = r7[r3]
            java.lang.Comparable r20 = r6.getLower()
            java.lang.Integer r20 = (java.lang.Integer) r20
            r40 = r7
            int r7 = r20.intValue()
            if (r5 < r7) goto L_0x0afd
            android.util.Range r7 = defpackage.hc0.f
            boolean r7 = r11.equals(r7)
            if (r7 == 0) goto L_0x09ea
            r11 = r6
        L_0x09ea:
            boolean r7 = r6.equals(r8)
            if (r7 == 0) goto L_0x0a01
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r11 = r6
        L_0x09f9:
            r26 = r10
            r23 = r13
            r25 = r14
            goto L_0x0b2d
        L_0x0a01:
            android.util.Range r7 = r6.intersect(r8)     // Catch:{ IllegalArgumentException -> 0x0ab6 }
            int r7 = f(r7)     // Catch:{ IllegalArgumentException -> 0x0ab6 }
            if (r12 != 0) goto L_0x0a1c
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r12 = r7
            r26 = r10
            r23 = r13
            r25 = r14
            goto L_0x0ab3
        L_0x0a1c:
            if (r7 < r12) goto L_0x0aa4
            android.util.Range r7 = r11.intersect(r8)     // Catch:{ IllegalArgumentException -> 0x0ab6 }
            int r7 = f(r7)     // Catch:{ IllegalArgumentException -> 0x0ab6 }
            r23 = r13
            r25 = r14
            double r13 = (double) r7
            android.util.Range r7 = r6.intersect(r8)     // Catch:{ IllegalArgumentException -> 0x0a99 }
            int r7 = f(r7)     // Catch:{ IllegalArgumentException -> 0x0a99 }
            r26 = r10
            double r9 = (double) r7
            int r7 = f(r6)     // Catch:{ IllegalArgumentException -> 0x0a94 }
            r43 = r1
            r27 = r2
            double r1 = (double) r7
            double r1 = r9 / r1
            int r7 = f(r11)     // Catch:{ IllegalArgumentException -> 0x0a8f }
            r36 = r4
            r28 = r5
            double r4 = (double) r7
            double r4 = r13 / r4
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r7 <= 0) goto L_0x0a5c
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0a5a
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x0a85
        L_0x0a5a:
            r11 = r6
            goto L_0x0a85
        L_0x0a5c:
            if (r7 != 0) goto L_0x0a7c
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0a63
            goto L_0x0a5a
        L_0x0a63:
            if (r1 != 0) goto L_0x0a85
            java.lang.Comparable r1 = r6.getLower()     // Catch:{ IllegalArgumentException -> 0x0ac4 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalArgumentException -> 0x0ac4 }
            int r1 = r1.intValue()     // Catch:{ IllegalArgumentException -> 0x0ac4 }
            java.lang.Comparable r2 = r11.getLower()     // Catch:{ IllegalArgumentException -> 0x0ac4 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IllegalArgumentException -> 0x0ac4 }
            int r2 = r2.intValue()     // Catch:{ IllegalArgumentException -> 0x0ac4 }
            if (r1 <= r2) goto L_0x0a85
            goto L_0x0a5a
        L_0x0a7c:
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0a85
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0a85
            goto L_0x0a5a
        L_0x0a85:
            android.util.Range r1 = r8.intersect(r11)     // Catch:{ IllegalArgumentException -> 0x0ac4 }
            int r12 = f(r1)     // Catch:{ IllegalArgumentException -> 0x0ac4 }
        L_0x0a8d:
            r6 = r11
            goto L_0x0ab3
        L_0x0a8f:
            r36 = r4
            r28 = r5
            goto L_0x0ac4
        L_0x0a94:
            r43 = r1
            r27 = r2
            goto L_0x0a8f
        L_0x0a99:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r26 = r10
            goto L_0x0ac4
        L_0x0aa4:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r26 = r10
            r23 = r13
            r25 = r14
            goto L_0x0a8d
        L_0x0ab3:
            r11 = r6
        L_0x0ab4:
            r1 = 1
            goto L_0x0b0c
        L_0x0ab6:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r26 = r10
            r23 = r13
            r25 = r14
        L_0x0ac4:
            if (r12 != 0) goto L_0x0ab4
            int r1 = e(r6, r8)
            int r2 = e(r11, r8)
            if (r1 >= r2) goto L_0x0ad1
            goto L_0x0afc
        L_0x0ad1:
            int r1 = e(r6, r8)
            int r2 = e(r11, r8)
            if (r1 != r2) goto L_0x0ab4
            java.lang.Comparable r1 = r6.getLower()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Comparable r2 = r11.getUpper()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 <= r2) goto L_0x0af2
            goto L_0x0afc
        L_0x0af2:
            int r1 = f(r6)
            int r2 = f(r11)
            if (r1 >= r2) goto L_0x0ab4
        L_0x0afc:
            goto L_0x0ab3
        L_0x0afd:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r26 = r10
            r23 = r13
            r25 = r14
            goto L_0x0ab4
        L_0x0b0c:
            int r3 = r3 + r1
            r9 = r39
            r7 = r40
            r1 = r43
            r6 = r17
            r13 = r23
            r14 = r25
            r10 = r26
            r2 = r27
            r5 = r28
            r4 = r36
            goto L_0x09cd
        L_0x0b23:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            goto L_0x09f9
        L_0x0b2d:
            r3 = r11
            goto L_0x0b3f
        L_0x0b2f:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r26 = r10
            r23 = r13
            r25 = r14
            r3 = r20
        L_0x0b3f:
            java.util.Iterator r1 = r32.iterator()
        L_0x0b43:
            boolean r2 = r1.hasNext()
            java.lang.String r4 = "Null resolution"
            java.lang.String r5 = "Null expectedFrameRateRange"
            if (r2 == 0) goto L_0x0c09
            java.lang.Object r2 = r1.next()
            zzf r2 = (defpackage.zzf) r2
            r6 = r32
            int r7 = r6.indexOf(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = r24
            int r7 = r8.indexOf(r7)
            java.lang.Object r7 = r0.get(r7)
            android.util.Size r7 = (android.util.Size) r7
            android.util.Range r9 = defpackage.hc0.f
            q13 r9 = new q13
            r9.<init>()
            if (r7 == 0) goto L_0x0c03
            r9.b = r7
            android.util.Range r4 = defpackage.hc0.f
            if (r4 == 0) goto L_0x0bfd
            r9.o = r4
            r7 = r29
            r9.c = r7
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r9.w = r4
            r4 = r22
            java.lang.Object r5 = r4.get(r2)
            vy4 r5 = (defpackage.vy4) r5
            r5.getClass()
            r9.c = r5
            pz9 r5 = defpackage.pz9.c()
            la0 r10 = defpackage.vs1.o
            boolean r11 = r2.u(r10)
            if (r11 == 0) goto L_0x0ba4
            java.lang.Object r11 = r2.n(r10)
            java.lang.Long r11 = (java.lang.Long) r11
            r5.f(r10, r11)
        L_0x0ba4:
            la0 r10 = defpackage.zzf.p0
            boolean r11 = r2.u(r10)
            if (r11 == 0) goto L_0x0bb5
            java.lang.Object r11 = r2.n(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r5.f(r10, r11)
        L_0x0bb5:
            la0 r10 = defpackage.z87.b
            boolean r11 = r2.u(r10)
            if (r11 == 0) goto L_0x0bc6
            java.lang.Object r11 = r2.n(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            r5.f(r10, r11)
        L_0x0bc6:
            la0 r10 = defpackage.m97.D
            boolean r11 = r2.u(r10)
            if (r11 == 0) goto L_0x0bd7
            java.lang.Object r11 = r2.n(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            r5.f(r10, r11)
        L_0x0bd7:
            vs1 r10 = new vs1
            r11 = 9
            r10.<init>((int) r11, (java.lang.Object) r5)
            r9.v = r10
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r44)
            r9.w = r5
            if (r3 == 0) goto L_0x0bea
            r9.o = r3
        L_0x0bea:
            hc0 r5 = r9.h()
            r9 = r21
            r9.put(r2, r5)
            r22 = r4
            r32 = r6
            r29 = r7
            r24 = r8
            goto L_0x0b43
        L_0x0bfd:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x0c03:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0c09:
            r9 = r21
            r7 = r29
            if (r36 == 0) goto L_0x0c39
            r2 = r27
            r3 = r28
            if (r3 != r2) goto L_0x0c39
            int r1 = r0.size()
            int r2 = r43.size()
            if (r1 != r2) goto L_0x0c39
            r3 = r18
        L_0x0c21:
            int r1 = r0.size()
            if (r3 >= r1) goto L_0x0c42
            java.lang.Object r1 = r0.get(r3)
            android.util.Size r1 = (android.util.Size) r1
            r2 = r43
            java.lang.Object r6 = r2.get(r3)
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0c3d
        L_0x0c39:
            r8 = r42
            goto L_0x0ebf
        L_0x0c3d:
            r1 = 1
            int r3 = r3 + r1
            r43 = r2
            goto L_0x0c21
        L_0x0c42:
            r1 = r39
            qt1 r0 = r1.k
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "Null dynamicRange"
            r3 = 33
            if (r1 >= r3) goto L_0x0c52
        L_0x0c4e:
            r8 = r42
            goto L_0x0e07
        L_0x0c52:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r3 = r9.keySet()
            r1.<init>(r3)
            java.util.Iterator r3 = r41.iterator()
        L_0x0c5f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0c71
            java.lang.Object r6 = r3.next()
            w90 r6 = (defpackage.w90) r6
            je3 r6 = r6.f
            r6.getClass()
            goto L_0x0c5f
        L_0x0c71:
            java.util.Iterator r3 = r1.iterator()
        L_0x0c75:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0c90
            java.lang.Object r6 = r3.next()
            zzf r6 = (defpackage.zzf) r6
            java.lang.Object r6 = r9.get(r6)
            hc0 r6 = (defpackage.hc0) r6
            r6.getClass()
            je3 r6 = r6.d
            r6.getClass()
            goto L_0x0c75
        L_0x0c90:
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            java.lang.Object r0 = r0.a(r3)
            long[] r0 = (long[]) r0
            if (r0 == 0) goto L_0x0c4e
            int r3 = r0.length
            if (r3 != 0) goto L_0x0ca0
            goto L_0x0c4e
        L_0x0ca0:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            int r6 = r0.length
            r8 = r18
        L_0x0ca8:
            if (r8 >= r6) goto L_0x0cb6
            r10 = r0[r8]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r3.add(r10)
            r10 = 1
            int r8 = r8 + r10
            goto L_0x0ca8
        L_0x0cb6:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r6 = r41.iterator()
            boolean r8 = r6.hasNext()
            r10 = 0
            if (r8 == 0) goto L_0x0cf0
            java.lang.Object r6 = r6.next()
            w90 r6 = (defpackage.w90) r6
            je3 r8 = r6.f
            la0 r12 = defpackage.vs1.o
            boolean r8 = r8.u(r12)
            if (r8 != 0) goto L_0x0cdb
        L_0x0cd7:
            r14 = r18
            r6 = 1
            goto L_0x0cf3
        L_0x0cdb:
            je3 r6 = r6.f
            java.lang.Object r6 = r6.n(r12)
            java.lang.Long r6 = (java.lang.Long) r6
            long r12 = r6.longValue()
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0cec
            goto L_0x0cd7
        L_0x0cec:
            r6 = r18
            r14 = 1
            goto L_0x0cf3
        L_0x0cf0:
            r6 = r18
            r14 = r6
        L_0x0cf3:
            java.util.Iterator r8 = r1.iterator()
            r38 = r14
            r14 = r6
            r6 = r38
        L_0x0cfc:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x0d47
            java.lang.Object r12 = r8.next()
            zzf r12 = (defpackage.zzf) r12
            la0 r13 = defpackage.vs1.o
            boolean r16 = r12.u(r13)
            java.lang.String r10 = "Either all use cases must have non-default stream use case assigned or none should have it"
            if (r16 != 0) goto L_0x0d1e
            if (r6 != 0) goto L_0x0d18
            r14 = 1
            r16 = 0
            goto L_0x0d3e
        L_0x0d18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x0d1e:
            java.lang.Object r11 = r12.n(r13)
            java.lang.Long r11 = (java.lang.Long) r11
            long r12 = r11.longValue()
            r16 = 0
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x0d38
            if (r6 != 0) goto L_0x0d32
            r14 = 1
            goto L_0x0d3e
        L_0x0d32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x0d38:
            if (r14 != 0) goto L_0x0d41
            r0.add(r11)
            r6 = 1
        L_0x0d3e:
            r10 = r16
            goto L_0x0cfc
        L_0x0d41:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x0d47:
            if (r14 != 0) goto L_0x0c4e
            java.util.Iterator r0 = r0.iterator()
        L_0x0d4d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0d61
            java.lang.Object r6 = r0.next()
            java.lang.Long r6 = (java.lang.Long) r6
            boolean r6 = r3.contains(r6)
            if (r6 != 0) goto L_0x0d4d
            goto L_0x0c4e
        L_0x0d61:
            java.util.Iterator r0 = r41.iterator()
        L_0x0d65:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0dcd
            java.lang.Object r3 = r0.next()
            w90 r3 = (defpackage.w90) r3
            je3 r6 = r3.f
            la0 r8 = defpackage.vs1.o
            java.lang.Object r8 = r6.n(r8)
            java.lang.Long r8 = (java.lang.Long) r8
            long r10 = r8.longValue()
            vs1 r6 = defpackage.mxe.a(r6, r10)
            if (r6 == 0) goto L_0x0dc8
            android.util.Range r8 = defpackage.hc0.f
            q13 r8 = new q13
            r8.<init>()
            android.util.Size r10 = r3.c
            if (r10 == 0) goto L_0x0dc2
            r8.b = r10
            android.util.Range r10 = defpackage.hc0.f
            if (r10 == 0) goto L_0x0dbc
            r8.o = r10
            r8.c = r7
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r8.w = r10
            vy4 r10 = r3.d
            if (r10 == 0) goto L_0x0db6
            r8.c = r10
            r8.v = r6
            android.util.Range r6 = r3.g
            if (r6 == 0) goto L_0x0dac
            r8.o = r6
        L_0x0dac:
            hc0 r6 = r8.h()
            r8 = r42
            r8.put(r3, r6)
            goto L_0x0dca
        L_0x0db6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x0dbc:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x0dc2:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0dc8:
            r8 = r42
        L_0x0dca:
            r42 = r8
            goto L_0x0d65
        L_0x0dcd:
            r8 = r42
            java.util.Iterator r0 = r1.iterator()
        L_0x0dd3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0ebf
            java.lang.Object r1 = r0.next()
            zzf r1 = (defpackage.zzf) r1
            java.lang.Object r2 = r9.get(r1)
            hc0 r2 = (defpackage.hc0) r2
            je3 r3 = r2.d
            la0 r4 = defpackage.vs1.o
            java.lang.Object r4 = r3.n(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            vs1 r3 = defpackage.mxe.a(r3, r4)
            if (r3 == 0) goto L_0x0dd3
            q13 r2 = r2.a()
            r2.v = r3
            hc0 r2 = r2.h()
            r9.put(r1, r2)
            goto L_0x0dd3
        L_0x0e07:
            r15 = r18
        L_0x0e09:
            int r0 = r36.size()
            if (r15 >= r0) goto L_0x0ebf
            r0 = r36
            java.lang.Object r1 = r0.get(r15)
            jc0 r1 = (defpackage.jc0) r1
            long r10 = r1.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r3 = r25
            boolean r1 = r3.containsKey(r1)
            if (r1 == 0) goto L_0x0e7c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            java.lang.Object r1 = r3.get(r1)
            w90 r1 = (defpackage.w90) r1
            je3 r6 = r1.f
            vs1 r6 = defpackage.mxe.a(r6, r10)
            if (r6 == 0) goto L_0x0e78
            android.util.Range r10 = defpackage.hc0.f
            q13 r10 = new q13
            r10.<init>()
            android.util.Size r11 = r1.c
            if (r11 == 0) goto L_0x0e72
            r10.b = r11
            android.util.Range r11 = defpackage.hc0.f
            if (r11 == 0) goto L_0x0e6c
            r10.o = r11
            r10.c = r7
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.w = r11
            vy4 r11 = r1.d
            if (r11 == 0) goto L_0x0e66
            r10.c = r11
            r10.v = r6
            android.util.Range r6 = r1.g
            if (r6 == 0) goto L_0x0e5e
            r10.o = r6
        L_0x0e5e:
            hc0 r6 = r10.h()
            r8.put(r1, r6)
            goto L_0x0e78
        L_0x0e66:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x0e6c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x0e72:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0e78:
            r6 = r26
        L_0x0e7a:
            r1 = 1
            goto L_0x0eae
        L_0x0e7c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r6 = r26
            boolean r1 = r6.containsKey(r1)
            if (r1 == 0) goto L_0x0eb7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            java.lang.Object r1 = r6.get(r1)
            zzf r1 = (defpackage.zzf) r1
            java.lang.Object r12 = r9.get(r1)
            hc0 r12 = (defpackage.hc0) r12
            je3 r13 = r12.d
            vs1 r10 = defpackage.mxe.a(r13, r10)
            if (r10 == 0) goto L_0x0e7a
            q13 r11 = r12.a()
            r11.v = r10
            hc0 r10 = r11.h()
            r9.put(r1, r10)
            goto L_0x0e7a
        L_0x0eae:
            int r15 = r15 + r1
            r36 = r0
            r25 = r3
            r26 = r6
            goto L_0x0e09
        L_0x0eb7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r23
            r0.<init>(r1)
            throw r0
        L_0x0ebf:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r9, r8)
            return r0
        L_0x0ec5:
            r1 = r9
            r6 = r32
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            java.lang.String r3 = r1.i
            r2.append(r3)
            java.lang.String r3 = " and Hardware level: "
            r2.append(r3)
            int r1 = r1.m
            r2.append(r1)
            java.lang.String r1 = ". May be the specified resolution is too large and not supported. Existing surfaces: "
            r2.append(r1)
            r2.append(r15)
            r3 = r37
            r2.append(r3)
            r2.append(r6)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0ef6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to find supported resolutions."
            r0.<init>(r1)
            throw r0
        L_0x0efe:
            r0 = r41
            r11 = r7
            r3 = r8
            r1 = r9
            r6 = r20
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
            java.lang.String r1 = r1.i
            r4.append(r1)
            r4.append(r15)
            r4.append(r0)
            r4.append(r3)
            r4.append(r6)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3f.g(int, java.util.ArrayList, java.util.HashMap, boolean, boolean):android.util.Pair");
    }

    public final Pair h(int i2, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i3, HashMap hashMap, HashMap hashMap2) {
        int i4;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w90 w90 = (w90) it.next();
            arrayList4.add(w90.a);
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(arrayList4.size() - 1), w90);
            }
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            Size size = (Size) list.get(i5);
            zzf zzf = (zzf) arrayList2.get(((Integer) arrayList3.get(i5)).intValue());
            int inputFormat = zzf.getInputFormat();
            arrayList4.add(jc0.b(i2, inputFormat, size, i(inputFormat)));
            if (hashMap2 != null) {
                hashMap2.put(Integer.valueOf(arrayList4.size() - 1), zzf);
            }
            try {
                i4 = (int) (1.0E9d / ((double) ((StreamConfigurationMap) this.k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(zzf.getInputFormat(), size)));
            } catch (Exception unused) {
                i4 = 0;
            }
            i3 = Math.min(i3, i4);
        }
        return new Pair(arrayList4, Integer.valueOf(i3));
    }

    public final pc0 i(int i2) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = this.t;
        if (!arrayList.contains(Integer.valueOf(i2))) {
            j((HashMap) this.s.b, pde.e, i2);
            j((HashMap) this.s.d, pde.g, i2);
            Map map = this.s.f;
            qt1 qt1 = this.k;
            Size c2 = c((StreamConfigurationMap) ((nob) qt1.b().a).a, i2, true);
            if (c2 != null) {
                map.put(Integer.valueOf(i2), c2);
            }
            Map map2 = this.s.g;
            if (Build.VERSION.SDK_INT >= 31 && this.r && (streamConfigurationMap = (StreamConfigurationMap) qt1.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(Integer.valueOf(i2), c(streamConfigurationMap, i2, true));
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return this.s;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.util.Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(java.util.HashMap r2, android.util.Size r3, int r4) {
        /*
            r1 = this;
            boolean r0 = r1.p
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            qt1 r1 = r1.k
            tgg r1 = r1.b()
            java.lang.Object r1 = r1.a
            nob r1 = (defpackage.nob) r1
            java.lang.Object r1 = r1.a
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1
            r0 = 0
            android.util.Size r1 = c(r1, r4, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            if (r1 != 0) goto L_0x001f
            goto L_0x0033
        L_0x001f:
            android.util.Size[] r1 = new android.util.Size[]{r3, r1}
            java.util.List r1 = java.util.Arrays.asList(r1)
            v93 r3 = new v93
            r3.<init>(r0)
            java.lang.Object r1 = java.util.Collections.min(r1, r3)
            r3 = r1
            android.util.Size r3 = (android.util.Size) r3
        L_0x0033:
            r2.put(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3f.j(java.util.HashMap, android.util.Size, int):void");
    }
}
