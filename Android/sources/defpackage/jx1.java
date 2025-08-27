package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: jx1  reason: default package */
public final class jx1 {
    public final Object a;
    public final ArrayList b;
    public final ix1 c;
    public t6f d;
    public t6f e;
    public fwd f;
    public final HashMap g;
    public List h;
    public int i;
    public go1 j;
    public do1 k;
    public Map l;
    public final bv1 m;
    public final bv1 n;
    public final jw8 o;
    public final b8d p;
    public final zq0 q;
    public final boolean r;

    public jx1(b8d b8d, ykb ykb, boolean z) {
        this.a = new Object();
        this.b = new ArrayList();
        this.g = new HashMap();
        this.h = Collections.emptyList();
        this.i = 1;
        this.l = new HashMap();
        this.m = new bv1(6);
        this.n = new bv1(8);
        this.i = 2;
        this.p = b8d;
        this.c = new ix1(this);
        this.o = new jw8(ykb.e(CaptureNoResponseQuirk.class));
        this.q = new zq0(ykb, 6);
        this.r = z;
    }

    public static bs1 b(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bt1 bt1 = (bt1) it.next();
            if (bt1 == null) {
                obj = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                vzg.I(bt1, arrayList2);
                obj = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new bs1((List) arrayList2);
            }
            arrayList.add(obj);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new bs1((List) arrayList);
    }

    public static HashMap c(HashMap hashMap, HashMap hashMap2) {
        HashMap hashMap3 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (dc0 dc0 : (List) hashMap.get(num)) {
                r3 a2 = SurfaceUtil.a((Surface) hashMap2.get(dc0.a));
                if (i2 == 0) {
                    i2 = a2.a;
                }
                n30.q();
                int i3 = a2.b;
                int i4 = a2.c;
                String str = dc0.c;
                Objects.requireNonNull(str);
                arrayList.add(n30.c(i3, i4, str));
            }
            if (i2 == 0 || arrayList.isEmpty()) {
                arrayList.size();
            } else {
                List list = null;
                try {
                    list = (List) OutputConfiguration.class.getMethod("createInstancesForMultiResolutionOutput", new Class[]{Collection.class, Integer.TYPE}).invoke((Object) null, new Object[]{arrayList, Integer.valueOf(i2)});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    e2.getMessage();
                }
                if (list != null) {
                    for (dc0 dc02 : (List) hashMap.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) list.remove(0);
                        outputConfiguration.addSurface((Surface) hashMap2.get(dc02.a));
                        hashMap3.put(dc02, new e6b(outputConfiguration));
                    }
                }
            }
        }
        return hashMap3;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e6b e6b = (e6b) it.next();
            if (!arrayList2.contains(e6b.a.d())) {
                arrayList2.add(e6b.a.d());
                arrayList3.add(e6b);
            }
        }
        return arrayList3;
    }

    public static HashMap g(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dc0 dc0 = (dc0) it.next();
            if (dc0.e > 0 && dc0.b.isEmpty()) {
                int i2 = dc0.e;
                List list = (List) hashMap.get(Integer.valueOf(i2));
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(Integer.valueOf(i2), list);
                }
                list.add(dc0);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.getClass();
            if (((List) hashMap.get(num)).size() >= 2) {
                hashMap2.put(num, (List) hashMap.get(num));
            }
        }
        return hashMap2;
    }

    public final void a() {
        synchronized (this.a) {
            try {
                int y = tr1.y(this.i);
                if (y != 0) {
                    if (y != 1) {
                        if (y == 2) {
                            bs0.q(this.d, "The Opener shouldn't null in state:".concat(a81.A(this.i)));
                            this.d.p();
                        } else if (y == 3 || y == 4) {
                            bs0.q(this.d, "The Opener shouldn't null in state:".concat(a81.A(this.i)));
                            this.d.p();
                            this.i = 6;
                            this.o.d();
                            this.f = null;
                        }
                    }
                    this.i = 8;
                } else {
                    throw new IllegalStateException("close() should not be possible in state: ".concat(a81.A(this.i)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.i != 8) {
            this.i = 8;
            this.e = null;
            do1 do1 = this.k;
            if (do1 != null) {
                do1.b((Object) null);
                this.k = null;
            }
        }
    }

    public final e6b e(dc0 dc0, HashMap hashMap, String str) {
        long j2;
        Surface surface = (Surface) hashMap.get(dc0.a);
        bs0.q(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        e6b e6b = new e6b(dc0.e, surface);
        g6b g6b = e6b.a;
        if (str != null) {
            g6b.g(str);
        } else {
            g6b.g(dc0.c);
        }
        boolean z = true;
        int i2 = dc0.d;
        if (i2 == 0) {
            g6b.f(1);
        } else if (i2 == 1) {
            g6b.f(2);
        }
        List<lk4> list = dc0.b;
        if (!list.isEmpty()) {
            g6b.b();
            for (lk4 lk4 : list) {
                Surface surface2 = (Surface) hashMap.get(lk4);
                bs0.q(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                g6b.a(surface2);
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            b8d b8d = this.p;
            b8d.getClass();
            if (i3 < 33) {
                z = false;
            }
            bs0.r("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", z);
            DynamicRangeProfiles a2 = ((zy4) b8d.a).a();
            if (a2 != null) {
                vy4 vy4 = dc0.f;
                Long a3 = wy4.a(vy4, a2);
                if (a3 == null) {
                    Objects.toString(vy4);
                } else {
                    j2 = a3.longValue();
                    g6b.e(j2);
                    return e6b;
                }
            }
        }
        j2 = 1;
        g6b.e(j2);
        return e6b;
    }

    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            int i2 = this.i;
            if (i2 != 5) {
                if (i2 != 4) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r6.c != 2) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r7 = new defpackage.u40(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r6.c != 5) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        r8 = r6.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r8 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        r7.h = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        r8 = r11.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        if (r8 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
        r7.c(r8.g.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        r7.c(r6.b);
        r7 = r7.d();
        r8 = r11.e;
        r8.f.getClass();
        r7 = defpackage.j4b.h(r7, ((android.hardware.camera2.CameraCaptureSession) ((defpackage.ata) r8.f.b).b).getDevice(), r11.g, false, r11.q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
        if (r7 != null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r8 = new java.util.ArrayList();
        r6 = r6.e.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00be, code lost:
        if (r6.hasNext() == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
        defpackage.vzg.I((defpackage.bt1) r6.next(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ca, code lost:
        r1.a(r7, r8);
        r3.add(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.util.List r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.a
            monitor-enter(r0)
            int r1 = r11.i     // Catch:{ all -> 0x000a }
            r2 = 5
            if (r1 == r2) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x000a:
            r11 = move-exception
            goto L_0x012b
        L_0x000d:
            boolean r1 = r12.isEmpty()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0015:
            jr1 r1 = new jr1     // Catch:{ CameraAccessException -> 0x0062 }
            r3 = 1
            r1.<init>((int) r3)     // Catch:{ CameraAccessException -> 0x0062 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0062 }
            r3.<init>()     // Catch:{ CameraAccessException -> 0x0062 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ CameraAccessException -> 0x0062 }
            r4 = 0
            r5 = r4
        L_0x0026:
            boolean r6 = r12.hasNext()     // Catch:{ CameraAccessException -> 0x0062 }
            r7 = 1
            if (r6 == 0) goto L_0x00d2
            java.lang.Object r6 = r12.next()     // Catch:{ CameraAccessException -> 0x0062 }
            bx1 r6 = (defpackage.bx1) r6     // Catch:{ CameraAccessException -> 0x0062 }
            java.util.List r8 = r6.a     // Catch:{ CameraAccessException -> 0x0062 }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ CameraAccessException -> 0x0062 }
            boolean r8 = r8.isEmpty()     // Catch:{ CameraAccessException -> 0x0062 }
            if (r8 == 0) goto L_0x0040
            goto L_0x0026
        L_0x0040:
            java.util.List r8 = r6.a     // Catch:{ CameraAccessException -> 0x0062 }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ CameraAccessException -> 0x0062 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ CameraAccessException -> 0x0062 }
        L_0x004a:
            boolean r9 = r8.hasNext()     // Catch:{ CameraAccessException -> 0x0062 }
            if (r9 == 0) goto L_0x0065
            java.lang.Object r9 = r8.next()     // Catch:{ CameraAccessException -> 0x0062 }
            lk4 r9 = (defpackage.lk4) r9     // Catch:{ CameraAccessException -> 0x0062 }
            java.util.HashMap r10 = r11.g     // Catch:{ CameraAccessException -> 0x0062 }
            boolean r10 = r10.containsKey(r9)     // Catch:{ CameraAccessException -> 0x0062 }
            if (r10 != 0) goto L_0x004a
            java.util.Objects.toString(r9)     // Catch:{ CameraAccessException -> 0x0062 }
            goto L_0x0026
        L_0x0062:
            r11 = move-exception
            goto L_0x0123
        L_0x0065:
            int r8 = r6.c     // Catch:{ CameraAccessException -> 0x0062 }
            r9 = 2
            if (r8 != r9) goto L_0x006b
            r5 = r7
        L_0x006b:
            u40 r7 = new u40     // Catch:{ CameraAccessException -> 0x0062 }
            r7.<init>(r6)     // Catch:{ CameraAccessException -> 0x0062 }
            int r8 = r6.c     // Catch:{ CameraAccessException -> 0x0062 }
            if (r8 != r2) goto L_0x007a
            it1 r8 = r6.h     // Catch:{ CameraAccessException -> 0x0062 }
            if (r8 == 0) goto L_0x007a
            r7.h = r8     // Catch:{ CameraAccessException -> 0x0062 }
        L_0x007a:
            fwd r8 = r11.f     // Catch:{ CameraAccessException -> 0x0062 }
            if (r8 == 0) goto L_0x0085
            bx1 r8 = r8.g     // Catch:{ CameraAccessException -> 0x0062 }
            je3 r8 = r8.b     // Catch:{ CameraAccessException -> 0x0062 }
            r7.c(r8)     // Catch:{ CameraAccessException -> 0x0062 }
        L_0x0085:
            je3 r8 = r6.b     // Catch:{ CameraAccessException -> 0x0062 }
            r7.c(r8)     // Catch:{ CameraAccessException -> 0x0062 }
            bx1 r7 = r7.d()     // Catch:{ CameraAccessException -> 0x0062 }
            t6f r8 = r11.e     // Catch:{ CameraAccessException -> 0x0062 }
            rt6 r9 = r8.f     // Catch:{ CameraAccessException -> 0x0062 }
            r9.getClass()     // Catch:{ CameraAccessException -> 0x0062 }
            rt6 r8 = r8.f     // Catch:{ CameraAccessException -> 0x0062 }
            java.lang.Object r8 = r8.b     // Catch:{ CameraAccessException -> 0x0062 }
            ata r8 = (defpackage.ata) r8     // Catch:{ CameraAccessException -> 0x0062 }
            java.lang.Object r8 = r8.b     // Catch:{ CameraAccessException -> 0x0062 }
            android.hardware.camera2.CameraCaptureSession r8 = (android.hardware.camera2.CameraCaptureSession) r8     // Catch:{ CameraAccessException -> 0x0062 }
            android.hardware.camera2.CameraDevice r8 = r8.getDevice()     // Catch:{ CameraAccessException -> 0x0062 }
            java.util.HashMap r9 = r11.g     // Catch:{ CameraAccessException -> 0x0062 }
            zq0 r10 = r11.q     // Catch:{ CameraAccessException -> 0x0062 }
            android.hardware.camera2.CaptureRequest r7 = defpackage.j4b.h(r7, r8, r9, r4, r10)     // Catch:{ CameraAccessException -> 0x0062 }
            if (r7 != 0) goto L_0x00af
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x00af:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0062 }
            r8.<init>()     // Catch:{ CameraAccessException -> 0x0062 }
            java.util.List r6 = r6.e     // Catch:{ CameraAccessException -> 0x0062 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ CameraAccessException -> 0x0062 }
        L_0x00ba:
            boolean r9 = r6.hasNext()     // Catch:{ CameraAccessException -> 0x0062 }
            if (r9 == 0) goto L_0x00ca
            java.lang.Object r9 = r6.next()     // Catch:{ CameraAccessException -> 0x0062 }
            bt1 r9 = (defpackage.bt1) r9     // Catch:{ CameraAccessException -> 0x0062 }
            defpackage.vzg.I(r9, r8)     // Catch:{ CameraAccessException -> 0x0062 }
            goto L_0x00ba
        L_0x00ca:
            r1.a(r7, r8)     // Catch:{ CameraAccessException -> 0x0062 }
            r3.add(r7)     // Catch:{ CameraAccessException -> 0x0062 }
            goto L_0x0026
        L_0x00d2:
            boolean r12 = r3.isEmpty()     // Catch:{ CameraAccessException -> 0x0062 }
            if (r12 != 0) goto L_0x0129
            bv1 r12 = r11.m     // Catch:{ CameraAccessException -> 0x0062 }
            boolean r12 = r12.i(r3, r5)     // Catch:{ CameraAccessException -> 0x0062 }
            if (r12 == 0) goto L_0x00fd
            t6f r12 = r11.e     // Catch:{ CameraAccessException -> 0x0062 }
            rt6 r2 = r12.f     // Catch:{ CameraAccessException -> 0x0062 }
            java.lang.String r4 = "Need to call openCaptureSession before using this API."
            defpackage.bs0.q(r2, r4)     // Catch:{ CameraAccessException -> 0x0062 }
            rt6 r12 = r12.f     // Catch:{ CameraAccessException -> 0x0062 }
            java.lang.Object r12 = r12.b     // Catch:{ CameraAccessException -> 0x0062 }
            ata r12 = (defpackage.ata) r12     // Catch:{ CameraAccessException -> 0x0062 }
            java.lang.Object r12 = r12.b     // Catch:{ CameraAccessException -> 0x0062 }
            android.hardware.camera2.CameraCaptureSession r12 = (android.hardware.camera2.CameraCaptureSession) r12     // Catch:{ CameraAccessException -> 0x0062 }
            r12.stopRepeating()     // Catch:{ CameraAccessException -> 0x0062 }
            hx1 r12 = new hx1     // Catch:{ CameraAccessException -> 0x0062 }
            r12.<init>(r11)     // Catch:{ CameraAccessException -> 0x0062 }
            r1.c = r12     // Catch:{ CameraAccessException -> 0x0062 }
        L_0x00fd:
            bv1 r12 = r11.n     // Catch:{ CameraAccessException -> 0x0062 }
            boolean r12 = r12.f(r3, r5)     // Catch:{ CameraAccessException -> 0x0062 }
            if (r12 == 0) goto L_0x011c
            int r12 = r3.size()     // Catch:{ CameraAccessException -> 0x0062 }
            int r12 = r12 - r7
            java.lang.Object r12 = r3.get(r12)     // Catch:{ CameraAccessException -> 0x0062 }
            android.hardware.camera2.CaptureRequest r12 = (android.hardware.camera2.CaptureRequest) r12     // Catch:{ CameraAccessException -> 0x0062 }
            bs1 r2 = new bs1     // Catch:{ CameraAccessException -> 0x0062 }
            r2.<init>((defpackage.jx1) r11)     // Catch:{ CameraAccessException -> 0x0062 }
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch:{ CameraAccessException -> 0x0062 }
            r1.a(r12, r2)     // Catch:{ CameraAccessException -> 0x0062 }
        L_0x011c:
            t6f r11 = r11.e     // Catch:{ CameraAccessException -> 0x0062 }
            r11.i(r3, r1)     // Catch:{ CameraAccessException -> 0x0062 }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0123:
            r11.getMessage()     // Catch:{ all -> 0x000a }
            java.lang.Thread.dumpStack()     // Catch:{ all -> 0x000a }
        L_0x0129:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x012b:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx1.i(java.util.List):void");
    }

    public final void j(List list) {
        synchronized (this.a) {
            try {
                switch (tr1.y(this.i)) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: ".concat(a81.A(this.i)));
                    case 1:
                    case 2:
                    case 3:
                        this.b.addAll(list);
                        break;
                    case 4:
                        this.b.addAll(list);
                        this.o.c().d(new pr1(9, this), ryg.j());
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.getMessage();
        java.lang.Thread.dumpStack();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0007, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:3:0x0005, B:14:0x001e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(defpackage.fwd r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            if (r6 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r5 = move-exception
            goto L_0x007f
        L_0x0009:
            int r1 = r5.i     // Catch:{ all -> 0x0007 }
            r2 = 5
            if (r1 == r2) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0010:
            bx1 r6 = r6.g     // Catch:{ all -> 0x0007 }
            java.util.List r1 = r6.a     // Catch:{ all -> 0x0007 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x0007 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0007 }
            if (r1 == 0) goto L_0x003e
            t6f r5 = r5.e     // Catch:{ CameraAccessException -> 0x0035 }
            rt6 r6 = r5.f     // Catch:{ CameraAccessException -> 0x0035 }
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            defpackage.bs0.q(r6, r1)     // Catch:{ CameraAccessException -> 0x0035 }
            rt6 r5 = r5.f     // Catch:{ CameraAccessException -> 0x0035 }
            java.lang.Object r5 = r5.b     // Catch:{ CameraAccessException -> 0x0035 }
            ata r5 = (defpackage.ata) r5     // Catch:{ CameraAccessException -> 0x0035 }
            java.lang.Object r5 = r5.b     // Catch:{ CameraAccessException -> 0x0035 }
            android.hardware.camera2.CameraCaptureSession r5 = (android.hardware.camera2.CameraCaptureSession) r5     // Catch:{ CameraAccessException -> 0x0035 }
            r5.stopRepeating()     // Catch:{ CameraAccessException -> 0x0035 }
            goto L_0x003c
        L_0x0035:
            r5 = move-exception
            r5.getMessage()     // Catch:{ all -> 0x0007 }
            java.lang.Thread.dumpStack()     // Catch:{ all -> 0x0007 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x003e:
            t6f r1 = r5.e     // Catch:{ CameraAccessException -> 0x0076 }
            rt6 r2 = r1.f     // Catch:{ CameraAccessException -> 0x0076 }
            r2.getClass()     // Catch:{ CameraAccessException -> 0x0076 }
            rt6 r1 = r1.f     // Catch:{ CameraAccessException -> 0x0076 }
            java.lang.Object r1 = r1.b     // Catch:{ CameraAccessException -> 0x0076 }
            ata r1 = (defpackage.ata) r1     // Catch:{ CameraAccessException -> 0x0076 }
            java.lang.Object r1 = r1.b     // Catch:{ CameraAccessException -> 0x0076 }
            android.hardware.camera2.CameraCaptureSession r1 = (android.hardware.camera2.CameraCaptureSession) r1     // Catch:{ CameraAccessException -> 0x0076 }
            android.hardware.camera2.CameraDevice r1 = r1.getDevice()     // Catch:{ CameraAccessException -> 0x0076 }
            java.util.HashMap r2 = r5.g     // Catch:{ CameraAccessException -> 0x0076 }
            zq0 r3 = r5.q     // Catch:{ CameraAccessException -> 0x0076 }
            r4 = 1
            android.hardware.camera2.CaptureRequest r1 = defpackage.j4b.h(r6, r1, r2, r4, r3)     // Catch:{ CameraAccessException -> 0x0076 }
            if (r1 != 0) goto L_0x0060
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0060:
            jw8 r2 = r5.o     // Catch:{ CameraAccessException -> 0x0076 }
            java.util.List r6 = r6.e     // Catch:{ CameraAccessException -> 0x0076 }
            r3 = 0
            android.hardware.camera2.CameraCaptureSession$CaptureCallback[] r3 = new android.hardware.camera2.CameraCaptureSession.CaptureCallback[r3]     // Catch:{ CameraAccessException -> 0x0076 }
            bs1 r6 = b(r6, r3)     // Catch:{ CameraAccessException -> 0x0076 }
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r6 = r2.a(r6)     // Catch:{ CameraAccessException -> 0x0076 }
            t6f r5 = r5.e     // Catch:{ CameraAccessException -> 0x0076 }
            r5.n(r1, r6)     // Catch:{ CameraAccessException -> 0x0076 }
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0076:
            r5 = move-exception
            r5.getMessage()     // Catch:{ all -> 0x0007 }
            java.lang.Thread.dumpStack()     // Catch:{ all -> 0x0007 }
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x007f:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx1.k(fwd):void");
    }

    public final zz7 l(fwd fwd, CameraDevice cameraDevice, t6f t6f) {
        synchronized (this.a) {
            try {
                if (tr1.y(this.i) != 1) {
                    xa7 xa7 = new xa7(1, new IllegalStateException("open() should not allow the state: ".concat(a81.A(this.i))));
                    return xa7;
                }
                this.i = 3;
                ArrayList arrayList = new ArrayList(fwd.b());
                this.h = arrayList;
                this.d = t6f;
                oj6 a2 = oj6.a(t6f.o(arrayList));
                u00 u00 = new u00((Object) this, (Object) fwd, (Object) cameraDevice, 2);
                Executor executor = this.d.c;
                a2.getClass();
                cz1 b0 = hd8.b0(a2, u00, executor);
                hd8.a(b0, new e4(8, (Object) this), this.d.c);
                zz7 J = hd8.J(b0);
                return J;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r5.i = 7;
        r5.o.d();
        defpackage.bs0.q(r5.d, "The Opener shouldn't null in state:".concat(defpackage.a81.A(r5.i)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r5.d.p() == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r5.j != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        r5.j = defpackage.m5a.F(new defpackage.hx1(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r5 = r5.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r5.i = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        return defpackage.xa7.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.zz7 m() {
        /*
            r5 = this;
            java.lang.String r0 = "release() should not be possible in state: "
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.Object r3 = r5.a
            monitor-enter(r3)
            int r4 = r5.i     // Catch:{ all -> 0x001b }
            int r4 = defpackage.tr1.y(r4)     // Catch:{ all -> 0x001b }
            switch(r4) {
                case 0: goto L_0x006f;
                case 1: goto L_0x0067;
                case 2: goto L_0x0053;
                case 3: goto L_0x001d;
                case 4: goto L_0x0013;
                case 5: goto L_0x0013;
                case 6: goto L_0x0040;
                default: goto L_0x0012;
            }     // Catch:{ all -> 0x001b }
        L_0x0012:
            goto L_0x006b
        L_0x0013:
            t6f r0 = r5.e     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x001d
            r0.j()     // Catch:{ all -> 0x001b }
            goto L_0x001d
        L_0x001b:
            r5 = move-exception
            goto L_0x007f
        L_0x001d:
            r0 = 7
            r5.i = r0     // Catch:{ all -> 0x001b }
            jw8 r0 = r5.o     // Catch:{ all -> 0x001b }
            r0.d()     // Catch:{ all -> 0x001b }
            t6f r0 = r5.d     // Catch:{ all -> 0x001b }
            int r1 = r5.i     // Catch:{ all -> 0x001b }
            java.lang.String r1 = defpackage.a81.A(r1)     // Catch:{ all -> 0x001b }
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x001b }
            defpackage.bs0.q(r0, r1)     // Catch:{ all -> 0x001b }
            t6f r0 = r5.d     // Catch:{ all -> 0x001b }
            boolean r0 = r0.p()     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0040
            r5.d()     // Catch:{ all -> 0x001b }
            goto L_0x006b
        L_0x0040:
            go1 r0 = r5.j     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x004f
            hx1 r0 = new hx1     // Catch:{ all -> 0x001b }
            r0.<init>(r5)     // Catch:{ all -> 0x001b }
            go1 r0 = defpackage.m5a.F(r0)     // Catch:{ all -> 0x001b }
            r5.j = r0     // Catch:{ all -> 0x001b }
        L_0x004f:
            go1 r5 = r5.j     // Catch:{ all -> 0x001b }
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            return r5
        L_0x0053:
            t6f r0 = r5.d     // Catch:{ all -> 0x001b }
            int r2 = r5.i     // Catch:{ all -> 0x001b }
            java.lang.String r2 = defpackage.a81.A(r2)     // Catch:{ all -> 0x001b }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x001b }
            defpackage.bs0.q(r0, r1)     // Catch:{ all -> 0x001b }
            t6f r0 = r5.d     // Catch:{ all -> 0x001b }
            r0.p()     // Catch:{ all -> 0x001b }
        L_0x0067:
            r0 = 8
            r5.i = r0     // Catch:{ all -> 0x001b }
        L_0x006b:
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            xa7 r5 = defpackage.xa7.c
            return r5
        L_0x006f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001b }
            int r5 = r5.i     // Catch:{ all -> 0x001b }
            java.lang.String r5 = defpackage.a81.A(r5)     // Catch:{ all -> 0x001b }
            java.lang.String r5 = r0.concat(r5)     // Catch:{ all -> 0x001b }
            r1.<init>(r5)     // Catch:{ all -> 0x001b }
            throw r1     // Catch:{ all -> 0x001b }
        L_0x007f:
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx1.m():zz7");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(defpackage.fwd r4) {
        /*
            r3 = this;
            java.lang.String r0 = "setSessionConfig() should not be possible in state: "
            java.lang.Object r1 = r3.a
            monitor-enter(r1)
            int r2 = r3.i     // Catch:{ all -> 0x0017 }
            int r2 = defpackage.tr1.y(r2)     // Catch:{ all -> 0x0017 }
            switch(r2) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0037;
                case 2: goto L_0x0037;
                case 3: goto L_0x0037;
                case 4: goto L_0x0019;
                case 5: goto L_0x000f;
                case 6: goto L_0x000f;
                case 7: goto L_0x000f;
                default: goto L_0x000e;
            }     // Catch:{ all -> 0x0017 }
        L_0x000e:
            goto L_0x0039
        L_0x000f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0017 }
            java.lang.String r4 = "Session configuration cannot be set on a closed/released session."
            r3.<init>(r4)     // Catch:{ all -> 0x0017 }
            throw r3     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r3 = move-exception
            goto L_0x004b
        L_0x0019:
            r3.f = r4     // Catch:{ all -> 0x0017 }
            if (r4 != 0) goto L_0x001f
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return
        L_0x001f:
            java.util.HashMap r0 = r3.g     // Catch:{ all -> 0x0017 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0017 }
            java.util.List r4 = r4.b()     // Catch:{ all -> 0x0017 }
            boolean r4 = r0.containsAll(r4)     // Catch:{ all -> 0x0017 }
            if (r4 != 0) goto L_0x0031
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return
        L_0x0031:
            fwd r4 = r3.f     // Catch:{ all -> 0x0017 }
            r3.k(r4)     // Catch:{ all -> 0x0017 }
            goto L_0x0039
        L_0x0037:
            r3.f = r4     // Catch:{ all -> 0x0017 }
        L_0x0039:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return
        L_0x003b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0017 }
            int r3 = r3.i     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = defpackage.a81.A(r3)     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = r0.concat(r3)     // Catch:{ all -> 0x0017 }
            r4.<init>(r3)     // Catch:{ all -> 0x0017 }
            throw r4     // Catch:{ all -> 0x0017 }
        L_0x004b:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx1.n(fwd):void");
    }
}
