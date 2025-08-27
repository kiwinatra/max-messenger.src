package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.LogPrinter;
import android.view.Surface;
import androidx.gridlayout.widget.GridLayout;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o5h  reason: default package */
public final class o5h implements jq, e43, qk3, tt, dnd, h65, rq7, hn8 {
    public static o5h o;
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ o5h(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static final SharedPreferences C(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void E(Context context) {
        SharedPreferences C = C(context);
        if (!C.edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                "Failed to store app set ID last used time for App ".concat(valueOf);
            }
            throw new Exception("Failed to store the app set ID last used time.");
        }
    }

    public static Object[] t(int[] iArr, Object[] objArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        LogPrinter logPrinter = GridLayout.z;
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i + 1);
        for (int i2 = 0; i2 < length; i2++) {
            objArr2[iArr[i2]] = objArr[i2];
        }
        return objArr2;
    }

    public void A(uj3 uj3, int i, int i2, int i3) {
        int i4 = uj3.b0;
        int i5 = uj3.c0;
        uj3.b0 = 0;
        uj3.c0 = 0;
        uj3.O(i2);
        uj3.L(i3);
        if (i4 < 0) {
            uj3.b0 = 0;
        } else {
            uj3.b0 = i4;
        }
        if (i5 < 0) {
            uj3.c0 = 0;
        } else {
            uj3.c0 = i5;
        }
        uj3 uj32 = (uj3) this.c;
        uj32.t0 = i;
        uj32.U();
    }

    public void B(uj3 uj3) {
        ArrayList arrayList = (ArrayList) this.a;
        arrayList.clear();
        int size = uj3.q0.size();
        for (int i = 0; i < size; i++) {
            tj3 tj3 = (tj3) uj3.q0.get(i);
            int[] iArr = tj3.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(tj3);
            }
        }
        uj3.s0.a = true;
    }

    public void D(qq7 qq7) {
        boe a2 = ((tq7) this.c).a(qq7);
        if (a2 == null) {
            z68.g("o5h", "onStickerLongClick: failed to get sticker mapped to keyboard sticker=%s", qq7);
            return;
        }
        b0 b0Var = ((nse) ((gnd) this.b)).x;
        if (b0Var != null) {
            Parcelable.Creator<goe> creator = goe.CREATOR;
            b0Var.t(a2, (String) this.a);
        }
    }

    public void F() {
        ((gnd) this.b).getClass();
    }

    public void a(int i, int i2, int i3, long j) {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    public void accept(Object obj) {
        fu fuVar = (fu) obj;
        z68.c(ur4.i, "MsgGetCmd success", new Object[0]);
        ((ur4) this.a).c((a32) this.b, (qtd) this.c);
    }

    public vt b(e05 e05, Looper looper, ut utVar, qd3 qd3) {
        jf4 jf4 = new jf4();
        if (e05.d) {
            synchronized (jf4) {
                jf4.c = 4;
            }
        }
        return new f7a((Context) this.a, e05, new fh4((Context) this.a, jf4), (m7h) ((e43) this.b), qd3.b, looper, utVar, (c7f) this.c);
    }

    public void c(int i, long j) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, j);
    }

    public void d(rkf rkf, xf5 xf5, qtf qtf) {
        this.b = rkf;
        qtf.a();
        qtf.b();
        zpf B = xf5.B(qtf.e, 5);
        this.c = B;
        B.e((ea6) this.a);
    }

    public int e() {
        return ((MediaCodec) this.a).dequeueInputBuffer(0);
    }

    public void f(l8b l8b) {
        long d;
        long j;
        n79.o((rkf) this.b);
        int i = v0g.a;
        rkf rkf = (rkf) this.b;
        synchronized (rkf) {
            try {
                long j2 = rkf.c;
                d = j2 != -9223372036854775807L ? j2 + rkf.b : rkf.d();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        rkf rkf2 = (rkf) this.b;
        synchronized (rkf2) {
            j = rkf2.b;
        }
        if (d != -9223372036854775807L && j != -9223372036854775807L) {
            ea6 ea6 = (ea6) this.a;
            if (j != ea6.s) {
                ba6 a2 = ea6.a();
                a2.r = j;
                ea6 ea62 = new ea6(a2);
                this.a = ea62;
                ((zpf) this.c).e(ea62);
            }
            int a3 = l8b.a();
            ((zpf) this.c).b(l8b, a3, 0);
            ((zpf) this.c).a(d, 1, a3, 0, (xpf) null);
        }
    }

    public void flush() {
        ((MediaCodec) this.a).flush();
    }

    public int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && t0g.a < 21) {
                this.c = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public ByteBuffer getInputBuffer(int i) {
        return t0g.a >= 21 ? ((MediaCodec) this.a).getInputBuffer(i) : ((ByteBuffer[]) this.b)[i];
    }

    public ByteBuffer getOutputBuffer(int i) {
        return t0g.a >= 21 ? ((MediaCodec) this.a).getOutputBuffer(i) : ((ByteBuffer[]) this.c)[i];
    }

    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.a).getOutputFormat();
    }

    public void h(int i) {
        ((MediaCodec) this.a).setVideoScalingMode(i);
    }

    public void i() {
        ((gnd) this.b).getClass();
    }

    public void j(Surface surface) {
        ((MediaCodec) this.a).setOutputSurface(surface);
    }

    public md4 k(ea6 ea6, Surface surface, boolean z) {
        md4 k = ((e43) this.a).k(ea6, surface, z);
        this.c = k.b();
        return k;
    }

    public void l(qq7 qq7) {
        boe a2 = ((tq7) this.c).a(qq7);
        if (a2 == null) {
            z68.g("o5h", "onStickerClick: failed to get sticker mapped to keyboard sticker=%s", qq7);
            return;
        }
        goe goe = goe.a;
        nse nse = (nse) ((gnd) this.b);
        b0 b0Var = nse.x;
        if (b0Var != null) {
            b0Var.z(a2, (String) this.a, goe);
            nse.a.requestDisallowInterceptTouchEvent(true);
        }
    }

    public boolean m(int i) {
        return ((h65) this.a).m(i) && v(i) != null;
    }

    public void n(int i, h44 h44, long j) {
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) h44.i, j, 0);
    }

    public i65 o(int i) {
        return v(i);
    }

    public md4 p(ea6 ea6) {
        md4 p = ((e43) this.a).p(ea6);
        this.b = p.b();
        return p;
    }

    public void q(ho8 ho8, Handler handler) {
        ((MediaCodec) this.a).setOnFrameRenderedListener(new dy(this, ho8, 2), handler);
    }

    public void r(n9d n9d) {
        ((Handler) this.c).post(new ysg(this, n9d, 1));
    }

    public void release() {
        this.b = null;
        this.c = null;
        ((MediaCodec) this.a).release();
    }

    public void releaseOutputBuffer(int i, boolean z) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, z);
    }

    public void s(int[] iArr, ValueAnimator valueAnimator) {
        s9a s9a = new s9a(19, iArr, valueAnimator);
        valueAnimator.addListener((z6) this.c);
        ((ArrayList) this.a).add(s9a);
    }

    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    public void u() {
        ((gnd) this.b).getClass();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.i65 v(int r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.Object r2 = r0.c
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L_0x001d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r0 = r2.get(r0)
            i65 r0 = (defpackage.i65) r0
            return r0
        L_0x001d:
            java.lang.Object r3 = r0.a
            h65 r3 = (defpackage.h65) r3
            boolean r4 = r3.m(r1)
            if (r4 == 0) goto L_0x00db
            i65 r3 = r3.o(r1)
            java.util.Objects.requireNonNull(r3)
            java.lang.Object r0 = r0.b
            ykb r0 = (defpackage.ykb) r0
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk> r4 = androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class
            java.util.ArrayList r0 = r0.h(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x003c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0072
            java.lang.Object r4 = r0.next()
            androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk r4 = (androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk) r4
            if (r4 == 0) goto L_0x003c
            r0 = 4
            if (r1 == r0) goto L_0x0068
            r0 = 5
            if (r1 == r0) goto L_0x005e
            r0 = 6
            if (r1 == r0) goto L_0x0054
            goto L_0x0072
        L_0x0054:
            android.util.Size r0 = new android.util.Size
            r4 = 1440(0x5a0, float:2.018E-42)
            r6 = 1080(0x438, float:1.513E-42)
            r0.<init>(r4, r6)
            goto L_0x0073
        L_0x005e:
            android.util.Size r0 = new android.util.Size
            r4 = 960(0x3c0, float:1.345E-42)
            r6 = 720(0x2d0, float:1.009E-42)
            r0.<init>(r4, r6)
            goto L_0x0073
        L_0x0068:
            android.util.Size r0 = new android.util.Size
            r4 = 640(0x280, float:8.97E-43)
            r6 = 480(0x1e0, float:6.73E-43)
            r0.<init>(r4, r6)
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 != 0) goto L_0x0077
            r5 = r3
            goto L_0x00dc
        L_0x0077:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r6 = r3.d()
            java.util.Iterator r6 = r6.iterator()
        L_0x0084:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00c3
            java.lang.Object r7 = r6.next()
            sa0 r7 = (defpackage.sa0) r7
            int r9 = r7.a
            int r13 = r0.getWidth()
            int r14 = r0.getHeight()
            sa0 r15 = new sa0
            int r12 = r7.i
            int r11 = r7.j
            java.lang.String r10 = r7.b
            int r8 = r7.c
            int r5 = r7.d
            r19 = r0
            int r0 = r7.g
            int r7 = r7.h
            r16 = r8
            r8 = r15
            r18 = r11
            r11 = r16
            r17 = r12
            r12 = r5
            r5 = r15
            r15 = r0
            r16 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.add(r5)
            r0 = r19
            goto L_0x0084
        L_0x00c3:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00ca
            goto L_0x00db
        L_0x00ca:
            int r0 = r3.a()
            int r5 = r3.b()
            java.util.List r3 = r3.c()
            ra0 r5 = defpackage.ra0.e(r0, r5, r3, r4)
            goto L_0x00dc
        L_0x00db:
            r5 = 0
        L_0x00dc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r2.put(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5h.v(int):i65");
    }

    public void w(qq7 qq7) {
        boe a2 = ((tq7) this.c).a(qq7);
        if (a2 == null) {
            z68.g("o5h", "onStickerClick: failed to get sticker mapped to keyboard sticker=%s", qq7);
            return;
        }
        goe goe = goe.b;
        nse nse = (nse) ((gnd) this.b);
        b0 b0Var = nse.x;
        if (b0Var != null) {
            b0Var.z(a2, (String) this.a, goe);
            nse.a.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4 = r3.b(kotlin.jvm.JvmClassMappingKt.getJavaClass(r5), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r4 = r3.a(kotlin.jvm.JvmClassMappingKt.getJavaClass(r5));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.yag x(kotlin.reflect.KClass r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.a
            gbg r0 = (defpackage.gbg) r0
            java.util.LinkedHashMap r1 = r0.a
            java.lang.Object r1 = r1.get(r6)
            yag r1 = (defpackage.yag) r1
            boolean r2 = r5.isInstance(r1)
            java.lang.Object r3 = r4.b
            dbg r3 = (defpackage.dbg) r3
            if (r2 == 0) goto L_0x0020
            boolean r4 = r3 instanceof defpackage.fbg
            if (r4 == 0) goto L_0x001f
            fbg r3 = (defpackage.fbg) r3
            r3.d(r1)
        L_0x001f:
            return r1
        L_0x0020:
            zy9 r1 = new zy9
            java.lang.Object r4 = r4.c
            y34 r4 = (defpackage.y34) r4
            r1.<init>((defpackage.y34) r4)
            u9a r4 = defpackage.u9a.y
            r1.a(r4, r6)
            yag r4 = r3.c(r5, r1)     // Catch:{ AbstractMethodError -> 0x0033 }
            goto L_0x0044
        L_0x0033:
            java.lang.Class r4 = kotlin.jvm.JvmClassMappingKt.getJavaClass(r5)     // Catch:{ AbstractMethodError -> 0x003c }
            yag r4 = r3.b(r4, r1)     // Catch:{ AbstractMethodError -> 0x003c }
            goto L_0x0044
        L_0x003c:
            java.lang.Class r4 = kotlin.jvm.JvmClassMappingKt.getJavaClass(r5)
            yag r4 = r3.a(r4)
        L_0x0044:
            java.util.LinkedHashMap r5 = r0.a
            java.lang.Object r5 = r5.put(r6, r4)
            yag r5 = (defpackage.yag) r5
            if (r5 == 0) goto L_0x0051
            r5.g()
        L_0x0051:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5h.x(kotlin.reflect.KClass, java.lang.String):yag");
    }

    public boolean y(int i, tj3 tj3, l8c l8c) {
        int[] iArr = tj3.p0;
        int i2 = iArr[0];
        xl0 xl0 = (xl0) this.b;
        xl0.b = i2;
        xl0.d = iArr[1];
        xl0.e = tj3.q();
        xl0.f = tj3.k();
        xl0.k = false;
        xl0.j = i;
        boolean z = xl0.b == 3;
        boolean z2 = xl0.d == 3;
        boolean z3 = z && tj3.W > c44.DEFAULT_ASPECT_RATIO;
        boolean z4 = z2 && tj3.W > c44.DEFAULT_ASPECT_RATIO;
        int[] iArr2 = tj3.t;
        if (z3 && iArr2[0] == 4) {
            xl0.b = 1;
        }
        if (z4 && iArr2[1] == 4) {
            xl0.d = 1;
        }
        l8c.c(tj3, xl0);
        tj3.O(xl0.g);
        tj3.L(xl0.h);
        tj3.E = xl0.c;
        tj3.I(xl0.i);
        xl0.j = 0;
        return xl0.k;
    }

    public void z(JSONObject jSONObject) {
        e51 e51;
        b8d b8d = (b8d) this.b;
        b8d.getClass();
        fj fjVar = null;
        try {
            e51 m = jSONObject.has("decorativeExternalParticipantId") ? tf6.m(jSONObject) : null;
            ue1 a2 = ue1.a(jSONObject.getString("participantId"));
            String C = ct.C(jSONObject, "decorativeParticipantId");
            if (C != null) {
                ue1.a(C);
            }
            fjVar = new fj(21, (Object) a2, (Object) m);
        } catch (JSONException e) {
            ((voc) b8d.a).logException("ContactCallParser", "Can't parse decorative-id-changed info", e);
        }
        if (fjVar != null && (e51 = (e51) fjVar.c) != null) {
            ef1 ef1 = (ef1) this.a;
            ue1 ue1 = (ue1) fjVar.b;
            if (ef1.j(ue1) != null) {
                ue1 ue12 = (ue1) fjVar.b;
                if (ef1.j(ue12) != null) {
                    zwd c2 = ef1.c(ue12);
                    List listOf = CollectionsKt.listOf((ye1) ef1.a(new v8b(ue12, new v9a(16), new v9a(16), new v9a(16), new v9a(16), new xga(1, e51), new v9a(16)), c2).c);
                    boolean areEqual = Intrinsics.areEqual((Object) c2, (Object) ef1.k);
                    jc1 jc1 = ef1.b;
                    if (areEqual) {
                        jc1.a.onActiveParticipantsDeAnonimized(new oz0(listOf, ef1.d(ef1.k).values()));
                    }
                    jc1.c.onCallParticipantsDeAnonimized(new hf1(listOf));
                }
                ((r21) this.c).onDecorativeParticipantIdChanged(new p21(ue1));
            }
        }
    }

    public o5h(Context context, int i) {
        switch (i) {
            case 1:
                hv hvVar = new hv(0, this);
                this.a = new iv(context);
                this.b = new Handler(hvVar);
                this.c = kv.c;
                return;
            default:
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.b = newSingleThreadScheduledExecutor;
                this.c = Executors.newSingleThreadExecutor();
                this.a = context;
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(new haf(21, (Object) this), 0, 86400, TimeUnit.SECONDS);
                return;
        }
    }

    public o5h(String str) {
        ba6 ba6 = new ba6();
        ba6.m = vq9.l(str);
        this.a = new ea6(ba6);
    }
}
