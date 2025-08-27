package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.IntCompanionObject;
import org.webrtc.HardwareVideoEncoderFactory;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* renamed from: j50  reason: default package */
public final class j50 implements iz8 {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object o;
    public Object v;
    public Object w;
    public Object x;
    public Object y;

    public /* synthetic */ j50(asf asf, ViewGroup viewGroup, Object obj, View view, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.y = asf;
        this.c = viewGroup;
        this.o = obj;
        this.v = view;
        this.w = obj2;
        this.b = z;
        this.x = obj3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0120 A[Catch:{ IllegalArgumentException -> 0x0140 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.mt1 a(defpackage.dv1 r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            java.lang.String r2 = "OKRTCSvcFactory"
            java.lang.Object r3 = r1.o
            voc r3 = (defpackage.voc) r3
            java.lang.String r4 = "requested initial facing is "
            java.lang.String r5 = "creating camera capturer adapter using camera api "
            java.lang.Object r6 = r1.y
            android.content.Context r6 = (android.content.Context) r6
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0140 }
            r8.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x0140 }
            boolean r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x0140 }
            r9 = 1
            if (r5 == 0) goto L_0x001f
            r5 = 2
            goto L_0x0020
        L_0x001f:
            r5 = r9
        L_0x0020:
            r8.append(r5)     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.lang.String r5 = r8.toString()     // Catch:{ IllegalArgumentException -> 0x0140 }
            r3.log(r2, r5)     // Catch:{ IllegalArgumentException -> 0x0140 }
            if (r0 == 0) goto L_0x0041
            cv1 r5 = defpackage.cv1.c     // Catch:{ IllegalArgumentException -> 0x0140 }
            cv1 r8 = r0.a
            if (r8 == r5) goto L_0x0041
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0140 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0140 }
            r5.append(r8)     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.lang.String r4 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x0140 }
            r3.log(r2, r4)     // Catch:{ IllegalArgumentException -> 0x0140 }
        L_0x0041:
            boolean r4 = r1.b     // Catch:{ IllegalArgumentException -> 0x0140 }
            if (r4 == 0) goto L_0x004e
            if (r6 == 0) goto L_0x004e
            ar1 r4 = new ar1     // Catch:{ IllegalArgumentException -> 0x0140 }
            r4.<init>((android.content.Context) r6, (defpackage.voc) r3)     // Catch:{ IllegalArgumentException -> 0x0140 }
        L_0x004c:
            r13 = r4
            goto L_0x0057
        L_0x004e:
            ar1 r4 = new ar1     // Catch:{ IllegalArgumentException -> 0x0140 }
            boolean r5 = defpackage.ur9.a     // Catch:{ IllegalArgumentException -> 0x0140 }
            r5 = r5 ^ r9
            r4.<init>((defpackage.voc) r3, (boolean) r5)     // Catch:{ IllegalArgumentException -> 0x0140 }
            goto L_0x004c
        L_0x0057:
            java.util.ArrayList r4 = r13.F()     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IllegalArgumentException -> 0x0140 }
            r5 = r7
            r6 = r5
            r8 = r6
            r10 = r8
        L_0x0063:
            boolean r11 = r4.hasNext()     // Catch:{ IllegalArgumentException -> 0x0140 }
            if (r11 == 0) goto L_0x0090
            java.lang.Object r11 = r4.next()     // Catch:{ IllegalArgumentException -> 0x0140 }
            ou1 r11 = (defpackage.ou1) r11     // Catch:{ IllegalArgumentException -> 0x0140 }
            boolean r12 = r11 instanceof defpackage.mu1     // Catch:{ IllegalArgumentException -> 0x0140 }
            if (r12 == 0) goto L_0x00a0
            if (r5 != 0) goto L_0x0063
            r12 = r11
            mu1 r12 = (defpackage.mu1) r12     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.util.List r12 = r12.c     // Catch:{ IllegalArgumentException -> 0x0140 }
            boolean r12 = r12.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0140 }
            if (r12 != 0) goto L_0x0093
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0140 }
            r10 = r11
            mu1 r10 = (defpackage.mu1) r10     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.util.List r10 = r10.c     // Catch:{ IllegalArgumentException -> 0x0140 }
            r5.<init>(r10)     // Catch:{ IllegalArgumentException -> 0x0140 }
            mu1 r11 = (defpackage.mu1) r11     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.lang.String r10 = r11.b     // Catch:{ IllegalArgumentException -> 0x0140 }
            if (r6 == 0) goto L_0x0063
        L_0x0090:
            r14 = r5
            r15 = r6
            goto L_0x00cf
        L_0x0093:
            java.lang.String r11 = "camera.enumerator.npe.front"
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.lang.String r14 = "No supported formats for front camera"
            r12.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x0140 }
            r3.reportException(r2, r11, r12)     // Catch:{ IllegalArgumentException -> 0x0140 }
            goto L_0x0063
        L_0x00a0:
            boolean r12 = r11 instanceof defpackage.lu1     // Catch:{ IllegalArgumentException -> 0x0140 }
            if (r12 == 0) goto L_0x0063
            if (r6 != 0) goto L_0x0063
            r12 = r11
            lu1 r12 = (defpackage.lu1) r12     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.util.List r12 = r12.c     // Catch:{ IllegalArgumentException -> 0x0140 }
            boolean r12 = r12.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0140 }
            if (r12 != 0) goto L_0x00c2
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0140 }
            r8 = r11
            lu1 r8 = (defpackage.lu1) r8     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.util.List r8 = r8.c     // Catch:{ IllegalArgumentException -> 0x0140 }
            r6.<init>(r8)     // Catch:{ IllegalArgumentException -> 0x0140 }
            lu1 r11 = (defpackage.lu1) r11     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.lang.String r8 = r11.b     // Catch:{ IllegalArgumentException -> 0x0140 }
            if (r5 == 0) goto L_0x0063
            goto L_0x0090
        L_0x00c2:
            java.lang.String r11 = "camera.enumeratore.npe.back"
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.lang.String r14 = "No supported formats for back camera"
            r12.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x0140 }
            r3.reportException(r2, r11, r12)     // Catch:{ IllegalArgumentException -> 0x0140 }
            goto L_0x0063
        L_0x00cf:
            if (r0 == 0) goto L_0x00d9
            cv1 r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x0140 }
            cv1 r4 = defpackage.cv1.a     // Catch:{ IllegalArgumentException -> 0x0140 }
            if (r0 != r4) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r9 = 0
        L_0x00d9:
            r16 = r9
            if (r16 == 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            r10 = r8
        L_0x00df:
            java.lang.Object r0 = r1.x
            r4 = r0
            cx1 r4 = (defpackage.cx1) r4
            java.lang.Object r0 = r1.w
            r5 = r0
            bad r5 = (defpackage.bad) r5
            if (r10 == 0) goto L_0x00ff
            org.webrtc.CameraVideoCapturer r0 = r13.createCapturer(r10, r5, r4)     // Catch:{ Exception -> 0x00f1 }
            r12 = r0
            goto L_0x0100
        L_0x00f1:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "camera.enumerator.create"
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.lang.String r10 = "Cant create front camera capturer"
            r9.<init>(r10, r6)     // Catch:{ IllegalArgumentException -> 0x0140 }
            r3.reportException(r2, r0, r9)     // Catch:{ IllegalArgumentException -> 0x0140 }
        L_0x00ff:
            r12 = r7
        L_0x0100:
            if (r12 == 0) goto L_0x011e
            if (r14 == 0) goto L_0x011e
            if (r15 != 0) goto L_0x010c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0140 }
            r0.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x0140 }
            r15 = r0
        L_0x010c:
            mt1 r0 = new mt1     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.lang.Object r4 = r1.c     // Catch:{ IllegalArgumentException -> 0x0140 }
            r11 = r4
            wga r11 = (defpackage.wga) r11     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.lang.Object r1 = r1.o     // Catch:{ IllegalArgumentException -> 0x0140 }
            r17 = r1
            voc r17 = (defpackage.voc) r17     // Catch:{ IllegalArgumentException -> 0x0140 }
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IllegalArgumentException -> 0x0140 }
            return r0
        L_0x011e:
            if (r15 == 0) goto L_0x0145
            if (r14 != 0) goto L_0x0128
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0140 }
            r0.<init>(r15)     // Catch:{ IllegalArgumentException -> 0x0140 }
            r14 = r0
        L_0x0128:
            mt1 r0 = new mt1     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.lang.Object r6 = r1.c     // Catch:{ IllegalArgumentException -> 0x0140 }
            r11 = r6
            wga r11 = (defpackage.wga) r11     // Catch:{ IllegalArgumentException -> 0x0140 }
            org.webrtc.CameraVideoCapturer r12 = r13.createCapturer(r8, r5, r4)     // Catch:{ IllegalArgumentException -> 0x0140 }
            java.lang.Object r1 = r1.o     // Catch:{ IllegalArgumentException -> 0x0140 }
            r17 = r1
            voc r17 = (defpackage.voc) r17     // Catch:{ IllegalArgumentException -> 0x0140 }
            r16 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IllegalArgumentException -> 0x0140 }
            return r0
        L_0x0140:
            java.lang.String r0 = "IAE @ camera enumeration"
            r3.log(r2, r0)
        L_0x0145:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cant find camera capturer"
            r0.<init>(r1)
            java.lang.String r1 = "camera.enumerator.null"
            r3.reportException(r2, r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j50.a(dv1):mt1");
    }

    public void b(aae aae) {
        o9e o9e;
        aae aae2 = (aae) this.y;
        if (aae2 != null) {
            if (!aae2.equals(aae) || this.b) {
                boolean z = true;
                if (((hz0) ((nob) this.o).a).I1) {
                    this.b = true;
                    return;
                }
                hz0 hz0 = (hz0) ((nob) this.o).a;
                if (hz0.L0) {
                    if ((hz0.z0 || hz0.s()) && (o9e = ((hz0) ((bpa) this.c).b).x) != null) {
                        te1 te1 = (te1) this.w;
                        boolean z2 = te1 != null && te1.u;
                        if (te1 == null || !te1.v) {
                            z = false;
                        }
                        o9e.d(new t9e(aae, z2, z), false, (n9e) null, (bz0) this.x);
                        this.y = aae;
                        this.b = false;
                    }
                }
            }
        }
    }

    public void c(aae aae) {
        this.y = aae;
    }

    public void d(g0b g0b) {
        e6f e6f;
        e6f callback;
        f0b f0b = (f0b) this.w;
        if (f0b != null) {
            f0b.l(g0b);
        }
        int ordinal = g0b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            f6f f6f = (f6f) this.v;
            if (f6f != null && (callback = f6f.getCallback()) != null) {
                ((i0b) callback).c();
                return;
            }
            return;
        }
        f6f f6f2 = (f6f) this.v;
        if (f6f2 != null && (e6f = f6f2.o) != null) {
            i0b i0b = (i0b) e6f;
            if (i0b.b.getHeight() > 0) {
                f6f f6f3 = f6f2;
                f6f3.c(i0b.a(), i0b.b(), new rh9(16, (Object) e6f), new dle(15), new d6f(f6f2, 0));
            }
            f6f2.invalidate();
        }
    }

    public void e() {
        if (!this.b) {
            if (((Long) this.x) != null) {
                ((voc) this.v).log((String) this.w, "Duplicate accept event");
            }
            ((sjf) ((rjf) this.c)).getClass();
            this.x = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    public void f() {
        if (!this.b) {
            Long l = (Long) this.x;
            if (l == null) {
                ((voc) this.v).log((String) this.w, "Data is received but accept event wasn't triggered");
                return;
            }
            ((sjf) ((rjf) this.c)).getClass();
            ((d51) ((c51) this.o)).c("first_media_received", EventItemValueKt.toEventItemValue(SystemClock.elapsedRealtime() - l.longValue()), new EventItemsMap(MapsKt.mapOf(TuplesKt.to("call_type", EventItemValueKt.toEventItemValue((String) this.y)))));
            this.b = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r3v13, types: [qae, ts] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0237  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g() {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.a
            switch(r1) {
                case 4: goto L_0x0040;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.y
            asf r1 = (defpackage.asf) r1
            boolean r1 = r1.o
            if (r1 != 0) goto L_0x003f
            java.lang.Object r1 = r0.o
            yrf r1 = (defpackage.yrf) r1
            java.lang.Object r2 = r0.c
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            defpackage.esf.a(r2, r1)
            java.lang.Object r1 = r0.o
            r7 = r1
            yrf r7 = (defpackage.yrf) r7
            boolean r8 = r0.b
            java.lang.Object r1 = r0.y
            r3 = r1
            asf r3 = (defpackage.asf) r3
            java.lang.Object r1 = r0.c
            r4 = r1
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r1 = r0.v
            r5 = r1
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r1 = r0.w
            r6 = r1
            android.view.View r6 = (android.view.View) r6
            r3.k(r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.x
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r2.post(r0)
        L_0x003f:
            return
        L_0x0040:
            java.lang.Object r1 = r0.y
            j6e r1 = (defpackage.j6e) r1
            r1.getClass()
            android.view.View r10 = new android.view.View
            java.lang.Object r2 = r0.c
            r11 = r2
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            android.content.Context r2 = r11.getContext()
            r10.<init>(r2)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.Object r2 = r0.o
            r14 = r2
            android.view.View r14 = (android.view.View) r14
            java.lang.Object r2 = r0.v
            r15 = r2
            android.view.View r15 = (android.view.View) r15
            r9 = 0
            if (r15 == 0) goto L_0x00bb
            if (r14 != 0) goto L_0x006f
            goto L_0x00bb
        L_0x006f:
            ts r2 = r1.x
            boolean r3 = r2.isEmpty()
            r4 = 0
            if (r3 != 0) goto L_0x0099
            yrf r3 = r1.Z
            if (r3 != 0) goto L_0x007d
            goto L_0x0099
        L_0x007d:
            ts r3 = new ts
            r3.<init>(r4)
            defpackage.kne.r(r3, r14)
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.Set r6 = r2.keySet()
            r5.<init>(r6)
            r3.l(r5)
            java.util.Set r5 = r3.keySet()
            r2.l(r5)
            goto L_0x009d
        L_0x0099:
            r2.clear()
            r3 = r9
        L_0x009d:
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x00a6
            r1.Z = r9
            goto L_0x00af
        L_0x00a6:
            if (r3 == 0) goto L_0x00af
            java.util.Collection r5 = r3.values()
            r12.addAll(r5)
        L_0x00af:
            yrf r5 = r1.Y
            if (r5 != 0) goto L_0x00c3
            yrf r5 = r1.X
            if (r5 != 0) goto L_0x00c3
            yrf r5 = r1.Z
            if (r5 != 0) goto L_0x00c3
        L_0x00bb:
            r19 = r13
            r17 = r14
            r13 = r9
            r9 = r11
            goto L_0x0207
        L_0x00c3:
            yrf r5 = r1.Z
            if (r5 == 0) goto L_0x01ec
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            yrf r6 = r1.Z
            java.util.ArrayList r7 = r6.w
            r7.clear()
            int r8 = r12.size()
            r9 = r4
        L_0x00d8:
            if (r9 >= r8) goto L_0x0161
            java.lang.Object r16 = r12.get(r9)
            r4 = r16
            android.view.View r4 = (android.view.View) r4
            r16 = r8
            int r8 = r7.size()
            r17 = r14
            r14 = 0
        L_0x00eb:
            if (r14 >= r8) goto L_0x00fe
            r18 = r11
            java.lang.Object r11 = r7.get(r14)
            if (r11 != r4) goto L_0x00f9
        L_0x00f5:
            r19 = r13
            goto L_0x0154
        L_0x00f9:
            int r14 = r14 + 1
            r11 = r18
            goto L_0x00eb
        L_0x00fe:
            r18 = r11
            r7.add(r4)
            r4 = r8
        L_0x0104:
            int r11 = r7.size()
            if (r4 >= r11) goto L_0x00f5
            java.lang.Object r11 = r7.get(r4)
            android.view.View r11 = (android.view.View) r11
            boolean r14 = r11 instanceof android.view.ViewGroup
            if (r14 == 0) goto L_0x0149
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            int r14 = r11.getChildCount()
            r19 = r13
            r13 = 0
        L_0x011d:
            if (r13 >= r14) goto L_0x0146
            r20 = r14
            android.view.View r14 = r11.getChildAt(r13)
            r21 = r11
            r11 = 0
        L_0x0128:
            if (r11 >= r8) goto L_0x0138
            r22 = r8
            java.lang.Object r8 = r7.get(r11)
            if (r8 != r14) goto L_0x0133
            goto L_0x013d
        L_0x0133:
            int r11 = r11 + 1
            r8 = r22
            goto L_0x0128
        L_0x0138:
            r22 = r8
            r7.add(r14)
        L_0x013d:
            int r13 = r13 + 1
            r14 = r20
            r11 = r21
            r8 = r22
            goto L_0x011d
        L_0x0146:
            r22 = r8
            goto L_0x014d
        L_0x0149:
            r22 = r8
            r19 = r13
        L_0x014d:
            int r4 = r4 + 1
            r13 = r19
            r8 = r22
            goto L_0x0104
        L_0x0154:
            int r9 = r9 + 1
            r8 = r16
            r14 = r17
            r11 = r18
            r13 = r19
            r4 = 0
            goto L_0x00d8
        L_0x0161:
            r18 = r11
            r19 = r13
            r17 = r14
            r7.add(r10)
            r12.add(r10)
            defpackage.kne.c(r6, r12)
            int r4 = r2.c
            if (r4 <= 0) goto L_0x01dd
            if (r3 == 0) goto L_0x01dd
            r4 = 0
            java.lang.Object r2 = r2.f(r4)
            java.lang.Object r2 = r3.get(r2)
            android.view.View r2 = (android.view.View) r2
            yrf r3 = r1.Z
            r4 = 2
            r6 = 1
            if (r3 == 0) goto L_0x01b0
            if (r2 == 0) goto L_0x01b0
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            int[] r8 = new int[r4]
            r2.getLocationOnScreen(r8)
            r9 = 0
            r11 = r8[r9]
            r9 = r8[r6]
            int r13 = r2.getWidth()
            int r13 = r13 + r11
            r8 = r8[r6]
            int r14 = r2.getHeight()
            int r14 = r14 + r8
            r7.set(r11, r9, r13, r14)
            f6e r8 = new f6e
            r9 = 1
            r8.<init>(r9, r7)
            r3.J(r8)
        L_0x01b0:
            yrf r3 = r1.X
            if (r3 == 0) goto L_0x01dd
            if (r2 == 0) goto L_0x01dd
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            int[] r4 = new int[r4]
            r2.getLocationOnScreen(r4)
            r8 = 0
            r8 = r4[r8]
            r9 = r4[r6]
            int r11 = r2.getWidth()
            int r11 = r11 + r8
            r4 = r4[r6]
            int r2 = r2.getHeight()
            int r2 = r2 + r4
            r7.set(r8, r9, r11, r2)
            f6e r2 = new f6e
            r4 = 1
            r2.<init>(r4, r7)
            r3.J(r2)
        L_0x01dd:
            yrf r2 = r1.Y
            if (r2 == 0) goto L_0x01ea
            f6e r3 = new f6e
            r4 = 0
            r3.<init>(r4, r5)
            r2.J(r3)
        L_0x01ea:
            r9 = r5
            goto L_0x01f3
        L_0x01ec:
            r18 = r11
            r19 = r13
            r17 = r14
            r9 = 0
        L_0x01f3:
            e6e r11 = new e6e
            boolean r5 = r0.b
            r2 = r11
            r3 = r1
            r4 = r15
            r6 = r19
            r7 = r10
            r8 = r12
            r13 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r9 = r18
            defpackage.h6e.a(r9, r11)
        L_0x0207:
            yrf r2 = r1.X
            if (r2 == 0) goto L_0x0228
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r17 == 0) goto L_0x0217
            r4 = r17
            defpackage.j6e.n(r3, r4)
        L_0x0217:
            r3.removeAll(r12)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0226
            r3.add(r10)
            defpackage.kne.c(r2, r3)
        L_0x0226:
            r11 = r3
            goto L_0x0229
        L_0x0228:
            r11 = r13
        L_0x0229:
            if (r11 == 0) goto L_0x0231
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x0233
        L_0x0231:
            r1.X = r13
        L_0x0233:
            yrf r2 = r1.Y
            if (r2 == 0) goto L_0x023a
            r2.c(r10)
        L_0x023a:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            yrf r3 = r1.Y
            yrf r5 = r1.X
            yrf r7 = r1.Z
            g6e r13 = new g6e
            r2 = r13
            r4 = r12
            r6 = r11
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.Object r2 = r0.w
            yrf r2 = (defpackage.yrf) r2
            r2.a(r13)
            e6e r13 = new e6e
            r2 = r13
            r3 = r1
            r4 = r10
            r5 = r15
            r6 = r19
            r7 = r12
            r8 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            defpackage.h6e.a(r9, r13)
            uj6 r2 = new uj6
            r3 = 22
            r4 = 0
            r5 = r19
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r5, (boolean) r4, (int) r3)
            defpackage.h6e.a(r9, r2)
            vj6 r2 = new vj6
            r3 = 20
            r4 = 0
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r5, (boolean) r4, (int) r3)
            defpackage.h6e.a(r9, r2)
            java.lang.Object r0 = r0.x
            j50 r0 = (defpackage.j50) r0
            r0.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j50.g():void");
    }

    public void h() {
        if (((Long) this.x) != null && !this.b) {
            this.b = true;
            ((a33) ((x23) ((Lazy) this.w).getValue())).i("app.audio_onboarding_ended", true);
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return ur9.c(this);
            default:
                return super.toString();
        }
    }

    public j50(ce ceVar) {
        this.a = 5;
        this.v = (l48) ceVar.v;
        voc voc = (voc) ceVar.c;
        this.o = voc;
        this.c = (wga) ceVar.b;
        voc.log("OKRTCSvcFactory", "Is VIDEO HW acceleration enabled ? ".concat(ur9.a ^ true ? "yes" : "no"));
        voc.log("OKRTCSvcFactory", "Is Camera2 API enabled ? " + ceVar.a);
        this.b = ceVar.a;
        this.y = (Context) ceVar.w;
        this.w = new bad(voc);
        this.x = new cx1(voc);
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.clear();
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.addAll((List) ceVar.o);
    }

    public j50(bpa bpa, nob nob, voc voc, te1 te1) {
        this.a = 1;
        this.y = null;
        this.b = false;
        this.c = bpa;
        this.o = nob;
        this.v = voc;
        this.x = new bz0(1, this);
        this.w = te1;
    }

    public j50(sjf sjf, c51 c51, voc voc, String str, String str2) {
        this.a = 3;
        this.c = sjf;
        this.o = c51;
        this.v = voc;
        this.w = str;
        this.y = str2;
    }

    public j50(dy9 dy9, d14 d14, Lazy lazy) {
        this.a = 0;
        this.c = dy9;
        n6e b2 = m5a.b(0, IntCompanionObject.MAX_VALUE, (cu0) null, 5);
        this.o = b2;
        this.v = new dtc(b2);
        this.w = lazy;
        boolean z = ((a33) ((x23) lazy.getValue())).g.getBoolean("app.audio_onboarding_ended", false);
        this.b = z;
        er7 er7 = new er7(4, (Object) this);
        this.y = er7;
        if (!z) {
            ((xy9) dy9).e(er7);
            kv0.B(d14.U()).V(new l(13, this));
        }
    }

    public j50(WeakReference weakReference) {
        this.a = 2;
        this.c = weakReference;
        this.o = z0b.w;
        this.x = new el(6, this);
        this.y = new h0b(this);
    }
}
