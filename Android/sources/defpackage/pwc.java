package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: pwc  reason: default package */
public final class pwc extends xag implements hxc {
    public static final /* synthetic */ KProperty[] H0;
    public final s85 A0;
    public final s85 B0;
    public final Lazy C0;
    public volatile AudioFocusRequest D0;
    public volatile aje E0;
    public final wie F0;
    public final wie G0;
    public final Lazy X;
    public final Lazy Y;
    public final xme Z;
    public final qvc b;
    public final yvc c;
    public final m01 o;
    public long v;
    public final etc v0;
    public long w;
    public final xme w0;
    public final Lazy x;
    public final etc x0;
    public final Lazy y;
    public final etc y0;
    public final Lazy z;
    public final bs5 z0;

    static {
        Class<pwc> cls = pwc.class;
        H0 = new KProperty[]{rae.s(cls, "longClickJob", "getLongClickJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "startRecordJob", "getStartRecordJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public pwc(qvc qvc, yvc yvc, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        wqg wqg = wqg.a;
        Lazy h = wqg.getAccessor().h(gaf.class);
        Lazy h2 = wqg.getAccessor().h(Context.class);
        this.b = qvc;
        this.c = yvc;
        this.o = (m01) wqg.getAccessor().g(m01.class);
        this.x = h;
        this.y = h2;
        this.z = lazy;
        this.X = lazy2;
        this.Y = lazy3;
        xme a = f6e.a((Object) null);
        this.Z = a;
        etc etc = new etc(a);
        this.v0 = etc;
        xme a2 = f6e.a((Object) null);
        this.w0 = a2;
        this.x0 = new etc(a2);
        a80 a80 = (a80) lazy3.getValue();
        this.y0 = a80 != null ? a80.c : null;
        this.z0 = ((c50) ((yz7) lazy2.getValue())).h;
        this.A0 = new s85(0);
        this.B0 = new s85(0);
        this.C0 = LazyKt.lazy(new ifb(14, this));
        this.F0 = o5a.U();
        this.G0 = o5a.U();
        bs0.K(bs0.F(new ps5(new on2(etc, 28), new zvc(this, (Continuation) null), 5), ((osa) ((gaf) h.getValue())).a()), this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.pwc r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.hwc
            if (r0 == 0) goto L_0x0013
            r0 = r6
            hwc r0 = (defpackage.hwc) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            hwc r0 = new hwc
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            pwc r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0055
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Lazy r6 = r5.x
            java.lang.Object r6 = r6.getValue()
            gaf r6 = (defpackage.gaf) r6
            osa r6 = (defpackage.osa) r6
            gc8 r6 = r6.c()
            iwc r2 = new iwc
            r2.<init>(r5, r4)
            r0.a = r5
            r0.o = r3
            java.lang.Object r6 = defpackage.ev0.I(r6, r2, r0)
            if (r6 != r1) goto L_0x0055
            goto L_0x0069
        L_0x0055:
            r5.w()
            fwc r6 = new fwc
            r0 = 3
            r1 = 0
            r6.<init>(r0, r1, r1)
            xme r5 = r5.Z
            r5.getClass()
            r5.m(r4, r6)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwc.j(pwc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(defpackage.pwc r5, defpackage.qvc r6, long r7, byte[] r9, kotlin.coroutines.Continuation r10) {
        /*
            r5.getClass()
            java.lang.String r0 = "Media for "
            boolean r1 = r10 instanceof defpackage.kwc
            if (r1 == 0) goto L_0x0018
            r1 = r10
            kwc r1 = (defpackage.kwc) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.v = r2
            goto L_0x001d
        L_0x0018:
            kwc r1 = new kwc
            r1.<init>(r5, r10)
        L_0x001d:
            java.lang.Object r10 = r1.c
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            qvc r6 = r1.b
            pwc r5 = r1.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0032 }
            goto L_0x0067
        L_0x0032:
            r6 = move-exception
            goto L_0x00ac
        L_0x0035:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r10)
            int r10 = r6.ordinal()     // Catch:{ all -> 0x0032 }
            if (r10 == 0) goto L_0x0054
            if (r10 != r4) goto L_0x004e
            ixc r10 = new ixc     // Catch:{ all -> 0x0032 }
            r10.<init>(r7, r9)     // Catch:{ all -> 0x0032 }
            goto L_0x0056
        L_0x004e:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0032 }
            r6.<init>()     // Catch:{ all -> 0x0032 }
            throw r6     // Catch:{ all -> 0x0032 }
        L_0x0054:
            jxc r10 = defpackage.jxc.a     // Catch:{ all -> 0x0032 }
        L_0x0056:
            lxc r7 = r5.o()     // Catch:{ all -> 0x0032 }
            r1.a = r5     // Catch:{ all -> 0x0032 }
            r1.b = r6     // Catch:{ all -> 0x0032 }
            r1.v = r4     // Catch:{ all -> 0x0032 }
            java.lang.Object r10 = r7.f(r10, r1)     // Catch:{ all -> 0x0032 }
            if (r10 != r2) goto L_0x0067
            goto L_0x00cb
        L_0x0067:
            n2 r10 = (defpackage.n2) r10     // Catch:{ all -> 0x0032 }
            if (r10 != 0) goto L_0x009c
            java.lang.Class r7 = r5.getClass()     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x0032 }
            a67 r8 = defpackage.z68.b     // Catch:{ all -> 0x0032 }
            if (r8 != 0) goto L_0x0078
            goto L_0x0099
        L_0x0078:
            boolean r9 = r8.c()     // Catch:{ all -> 0x0032 }
            if (r9 == 0) goto L_0x0099
            w78 r9 = defpackage.w78.x     // Catch:{ all -> 0x0032 }
            java.lang.String r6 = r6.name()     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r10.<init>(r0)     // Catch:{ all -> 0x0032 }
            r10.append(r6)     // Catch:{ all -> 0x0032 }
            java.lang.String r6 = " wasn't prepared, we cannot send message"
            r10.append(r6)     // Catch:{ all -> 0x0032 }
            java.lang.String r6 = r10.toString()     // Catch:{ all -> 0x0032 }
            r10 = 0
            r8.d(r9, r7, r6, r10)     // Catch:{ all -> 0x0032 }
        L_0x0099:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0032 }
            goto L_0x00cb
        L_0x009c:
            yvc r6 = r5.c     // Catch:{ all -> 0x0032 }
            r6.getClass()     // Catch:{ all -> 0x0032 }
            svc r7 = new svc     // Catch:{ all -> 0x0032 }
            r7.<init>(r10)     // Catch:{ all -> 0x0032 }
            s85 r6 = r6.b     // Catch:{ all -> 0x0032 }
            defpackage.xag.h(r6, r7)     // Catch:{ all -> 0x0032 }
            goto L_0x00c9
        L_0x00ac:
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r7 = r6.getLocalizedMessage()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "We couldn't send record due to "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            defpackage.z68.f(r5, r7, r6)
        L_0x00c9:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L_0x00cb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwc.k(pwc, qvc, long, byte[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fd A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fe A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012f A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130 A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015f A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0167 A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l(defpackage.pwc r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            java.lang.String r0 = "Recoding of "
            boolean r1 = r15 instanceof defpackage.mwc
            if (r1 == 0) goto L_0x0015
            r1 = r15
            mwc r1 = (defpackage.mwc) r1
            int r2 = r1.o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.o = r2
            goto L_0x001a
        L_0x0015:
            mwc r1 = new mwc
            r1.<init>(r12, r15)
        L_0x001a:
            java.lang.Object r15 = r1.b
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.o
            r4 = 1
            r5 = 0
            java.lang.Class<pwc> r6 = defpackage.pwc.class
            r7 = 0
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            pwc r12 = r1.a
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x0032 }
            goto L_0x00ee
        L_0x0032:
            r13 = move-exception
            goto L_0x016c
        L_0x0035:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r15)
            kotlin.reflect.KProperty[] r15 = H0
            r15 = r15[r4]
            wie r3 = r12.G0
            java.lang.Object r15 = r3.getValue(r12, r15)
            pm7 r15 = (defpackage.pm7) r15
            if (r15 == 0) goto L_0x005a
            boolean r15 = r15.isCancelled()
            if (r15 != r4) goto L_0x005a
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            goto L_0x0195
        L_0x005a:
            java.lang.String r15 = r6.getName()
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x0063
            goto L_0x007c
        L_0x0063:
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x007c
            w78 r8 = defpackage.w78.o
            qvc r9 = r12.b
            java.lang.String r9 = r9.name()
            java.lang.String r10 = "Start recording of "
            java.lang.String r11 = " "
            java.lang.String r9 = defpackage.wj6.k(r10, r9, r11)
            r3.d(r8, r15, r9, r5)
        L_0x007c:
            yz7 r15 = r12.n()
            c50 r15 = (defpackage.c50) r15
            dy9 r3 = r15.b()
            xy9 r3 = (defpackage.xy9) r3
            boolean r3 = r3.z
            if (r3 == 0) goto L_0x0095
            dy9 r15 = r15.b()
            xy9 r15 = (defpackage.xy9) r15
            r15.w()
        L_0x0095:
            android.media.AudioFocusRequest$Builder r15 = new android.media.AudioFocusRequest$Builder
            r15.<init>(r4)
            android.media.AudioAttributes$Builder r3 = new android.media.AudioAttributes$Builder
            r3.<init>()
            android.media.AudioAttributes$Builder r3 = r3.setUsage(r4)
            r8 = 2
            android.media.AudioAttributes$Builder r3 = r3.setContentType(r8)
            android.media.AudioAttributes r3 = r3.build()
            android.media.AudioFocusRequest$Builder r15 = r15.setAudioAttributes(r3)
            android.media.AudioFocusRequest r15 = r15.build()
            kotlin.Lazy r3 = r12.C0
            java.lang.Object r3 = r3.getValue()
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            int r3 = r3.requestAudioFocus(r15)
            if (r3 != r4) goto L_0x00c4
            r12.D0 = r15
        L_0x00c4:
            lxc r15 = r12.o()
            boolean r15 = r15.b()
            if (r15 == 0) goto L_0x00d1
            r12.w()
        L_0x00d1:
            xme r15 = r12.Z     // Catch:{ all -> 0x0032 }
            ewc r3 = new ewc     // Catch:{ all -> 0x0032 }
            r3.<init>(r7, r7)     // Catch:{ all -> 0x0032 }
            r15.getClass()     // Catch:{ all -> 0x0032 }
            r15.m(r5, r3)     // Catch:{ all -> 0x0032 }
            lxc r15 = r12.o()     // Catch:{ all -> 0x0032 }
            r1.a = r12     // Catch:{ all -> 0x0032 }
            r1.o = r4     // Catch:{ all -> 0x0032 }
            java.lang.Object r13 = r15.e(r13, r1)     // Catch:{ all -> 0x0032 }
            if (r13 != r2) goto L_0x00ee
            goto L_0x0195
        L_0x00ee:
            lxc r13 = r12.o()     // Catch:{ all -> 0x0032 }
            r13.i(r12)     // Catch:{ all -> 0x0032 }
            java.lang.String r13 = r6.getName()     // Catch:{ all -> 0x0032 }
            a67 r14 = defpackage.z68.b     // Catch:{ all -> 0x0032 }
            if (r14 != 0) goto L_0x00fe
            goto L_0x0120
        L_0x00fe:
            boolean r15 = r14.c()     // Catch:{ all -> 0x0032 }
            if (r15 == 0) goto L_0x0120
            w78 r15 = defpackage.w78.o     // Catch:{ all -> 0x0032 }
            qvc r1 = r12.b     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = r1.name()     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r2.<init>(r0)     // Catch:{ all -> 0x0032 }
            r2.append(r1)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = " started successfully "
            r2.append(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0032 }
            r14.d(r15, r13, r0, r5)     // Catch:{ all -> 0x0032 }
        L_0x0120:
            xme r13 = r12.w0     // Catch:{ all -> 0x0032 }
            r14 = 0
            java.lang.Long r14 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r14)     // Catch:{ all -> 0x0032 }
            r13.setValue(r14)     // Catch:{ all -> 0x0032 }
            aje r13 = r12.E0     // Catch:{ all -> 0x0032 }
            if (r13 == 0) goto L_0x0130
            goto L_0x0144
        L_0x0130:
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0032 }
            r12.w = r13     // Catch:{ all -> 0x0032 }
            jx3 r13 = r12.a     // Catch:{ all -> 0x0032 }
            nwc r14 = new nwc     // Catch:{ all -> 0x0032 }
            r14.<init>(r12, r5)     // Catch:{ all -> 0x0032 }
            r15 = 3
            aje r13 = defpackage.ev0.v(r13, r5, r5, r14, r15)     // Catch:{ all -> 0x0032 }
            r12.E0 = r13     // Catch:{ all -> 0x0032 }
        L_0x0144:
            m01 r13 = r12.o     // Catch:{ all -> 0x0032 }
            o01 r13 = (defpackage.o01) r13     // Catch:{ all -> 0x0032 }
            r13.e(r7)     // Catch:{ all -> 0x0032 }
            kotlin.reflect.KProperty[] r13 = H0     // Catch:{ all -> 0x0032 }
            r13 = r13[r4]     // Catch:{ all -> 0x0032 }
            wie r14 = r12.G0     // Catch:{ all -> 0x0032 }
            java.lang.Object r13 = r14.getValue(r12, r13)     // Catch:{ all -> 0x0032 }
            pm7 r13 = (defpackage.pm7) r13     // Catch:{ all -> 0x0032 }
            if (r13 == 0) goto L_0x0167
            boolean r13 = r13.isCancelled()     // Catch:{ all -> 0x0032 }
            if (r13 != r4) goto L_0x0167
            r12.v(r7)     // Catch:{ all -> 0x0032 }
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)     // Catch:{ all -> 0x0032 }
            goto L_0x0195
        L_0x0167:
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)     // Catch:{ all -> 0x0032 }
            goto L_0x0195
        L_0x016c:
            java.lang.Class r14 = r12.getClass()
            java.lang.String r14 = r14.getName()
            java.lang.String r15 = r13.getLocalizedMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Recoding was failed due to '"
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r15 = "'"
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            defpackage.z68.f(r14, r15, r13)
            r12.w()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
        L_0x0195:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwc.l(pwc, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void i() {
        c50 c50 = (c50) n();
        e14.c(c50.c, (CancellationException) null);
        ((xy9) c50.b()).u(c50.e);
        w();
    }

    public final void m() {
        xme xme = this.Z;
        gwc gwc = (gwc) xme.getValue();
        if (gwc instanceof ewc) {
            try {
                o().g();
                u();
                dwc dwc = new dwc(true);
                xme.getClass();
                xme.m((Object) null, dwc);
            } catch (RuntimeException unused) {
                w();
                fwc fwc = new fwc(3, false, false);
                xme.getClass();
                xme.m((Object) null, fwc);
                return;
            }
        }
        if (gwc instanceof dwc) {
            dwc dwc2 = new dwc(true);
            xme.getClass();
            xme.m((Object) null, dwc2);
        }
    }

    public final yz7 n() {
        return (yz7) this.X.getValue();
    }

    public final lxc o() {
        return (lxc) this.z.getValue();
    }

    public final boolean q() {
        gwc gwc = (gwc) this.Z.getValue();
        return gwc instanceof ewc ? ((ewc) gwc).b : gwc instanceof dwc;
    }

    public final void r() {
        xme xme = this.Z;
        if (((gwc) xme.getValue()) instanceof ewc) {
            try {
                o().g();
                u();
                dwc dwc = new dwc(false);
                xme.getClass();
                xme.m((Object) null, dwc);
            } catch (RuntimeException unused) {
                w();
                fwc fwc = new fwc(3, false, false);
                xme.getClass();
                xme.m((Object) null, fwc);
            }
        }
    }

    public final void t() {
        xme xme = this.Z;
        if (((gwc) xme.getValue()) instanceof dwc) {
            try {
                o().d();
                if (this.E0 == null) {
                    this.w = System.currentTimeMillis();
                    this.E0 = ev0.v(this.a, (CoroutineContext) null, (f14) null, new nwc(this, (Continuation) null), 3);
                }
                c50 c50 = (c50) n();
                if (((xy9) c50.b()).z) {
                    ((xy9) c50.b()).w();
                }
                xme.m((Object) null, new ewc(true, true));
                xme xme2 = ((c50) n()).g;
                ((xz7) xme2.getValue()).getClass();
                xme2.m((Object) null, new xz7((Float) null, false));
            } catch (RuntimeException unused) {
                w();
                xme.m((Object) null, new fwc(3, false, false));
            }
        }
    }

    public final void u() {
        aje aje = this.E0;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        this.E0 = null;
        Long l = (Long) this.w0.getValue();
        this.v = l != null ? l.longValue() : 0;
    }

    public final void v(boolean z2) {
        byte[] bArr;
        if ((this.v0.a.getValue() instanceof ewc) || (this.v0.a.getValue() instanceof dwc)) {
            Long l = (Long) this.w0.getValue();
            long longValue = l != null ? l.longValue() : 0;
            AudioFocusRequest audioFocusRequest = this.D0;
            if (audioFocusRequest != null) {
                ((AudioManager) this.C0.getValue()).abandonAudioFocusRequest(audioFocusRequest);
            }
            if (!z2) {
                xme xme = this.Z;
                fwc fwc = new fwc(false, false);
                xme.getClass();
                xme.m((Object) null, fwc);
                w();
            } else if (longValue < 1000) {
                yvc yvc = this.c;
                qvc qvc = this.b;
                igf igf = new igf(yya.g);
                yvc.getClass();
                xag.h(yvc.b, new wvc(qvc, igf));
                xme xme2 = this.Z;
                fwc fwc2 = new fwc(q(), false);
                xme2.getClass();
                xme2.m((Object) null, fwc2);
                w();
            } else {
                etc etc = this.y0;
                if (etc == null || (bArr = (byte[]) etc.a.getValue()) == null) {
                    bArr = new byte[0];
                }
                byte[] bArr2 = bArr;
                w();
                ev0.v(this.a, caa.a, (f14) null, new owc(this, longValue, bArr2, (Continuation) null), 2);
                xme xme3 = this.Z;
                fwc fwc3 = new fwc(2, q(), false);
                xme3.getClass();
                xme3.m((Object) null, fwc3);
            }
        }
    }

    public final void w() {
        aje aje = this.E0;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        this.E0 = null;
        this.v = 0;
        yvc yvc = this.c;
        yvc.getClass();
        xag.h(yvc.b, new tvc(false));
        o().c();
        o().i((pwc) null);
        a80 a80 = (a80) this.Y.getValue();
        if (a80 != null) {
            a80.a.clear();
            a80.b.setValue((Object) null);
        }
        ((c50) n()).f = null;
        this.w0.setValue((Object) null);
    }
}
