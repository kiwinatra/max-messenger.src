package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: hh1  reason: default package */
public final class hh1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hh1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.b = callScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hh1 hh1 = new hh1(continuation, this.b);
        hh1.a = obj;
        return hh1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hh1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.media.projection.MediaProjectionManager} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [e9d] */
    /* JADX WARNING: type inference failed for: r3v3, types: [e9d] */
    /* JADX WARNING: type inference failed for: r3v5, types: [e9d] */
    /* JADX WARNING: type inference failed for: r3v7, types: [e9d] */
    /* JADX WARNING: type inference failed for: r3v9, types: [e9d] */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.a
            v5a r14 = (defpackage.v5a) r14
            boolean r0 = r14 instanceof defpackage.ji1
            if (r0 == 0) goto L_0x03f2
            ji1 r14 = (defpackage.ji1) r14
            gga r0 = one.me.calls.ui.ui.call.CallScreen.J0
            one.me.calls.ui.ui.call.CallScreen r13 = r13.b
            r13.getClass()
            boolean r0 = r14 instanceof defpackage.xh1
            if (r0 != 0) goto L_0x03fd
            boolean r0 = r14 instanceof defpackage.ii1
            if (r0 == 0) goto L_0x0055
            ii1 r14 = (defpackage.ii1) r14
            u21 r14 = r14.b
            ix3 r0 = defpackage.ix3.a
            lw3 r0 = defpackage.m58.b(r0)
            lw3 r0 = r0.f()
            android.os.Bundle r1 = r14.a
            lw3 r0 = r0.m(r1)
            lw3 r0 = r0.d()
            android.graphics.Point r1 = r14.c
            if (r1 == 0) goto L_0x0044
            int r2 = r1.x
            float r2 = (float) r2
            int r1 = r1.y
            float r1 = (float) r1
            r0.i(r2, r1)
        L_0x0044:
            java.util.List r14 = r14.b
            java.util.Collection r14 = (java.util.Collection) r14
            lw3 r14 = r0.h(r14)
            mw3 r14 = r14.build()
            r14.o(r13)
            goto L_0x03fd
        L_0x0055:
            boolean r0 = r14 instanceof defpackage.gi1
            r1 = 3
            r2 = 0
            if (r0 == 0) goto L_0x008a
            gi1 r14 = (defpackage.gi1) r14
            ngf r14 = r14.b
            android.content.Context r0 = r13.getContext()
            java.lang.CharSequence r14 = r14.a(r0)
            if (r14 != 0) goto L_0x006b
            java.lang.String r14 = ""
        L_0x006b:
            zy3 r0 = r13.l0()
            ty3 r0 = r0.k
            int r0 = r0.b()
            e0b r3 = new e0b
            r3.<init>((one.me.sdk.arch.Widget) r13)
            r3.i(r14)
            n0b r13 = new n0b
            r13.<init>(r2, r0, r1)
            r3.c(r13)
            r3.j()
            goto L_0x03fd
        L_0x008a:
            boolean r0 = r14 instanceof defpackage.wh1
            r3 = 0
            if (r0 == 0) goto L_0x00e0
            jj1 r14 = r13.p0()
            k91 r14 = r14.l()
            l21 r14 = r14.f
            if (r14 == 0) goto L_0x009e
            java.lang.Long r14 = r14.a
            goto L_0x009f
        L_0x009e:
            r14 = r3
        L_0x009f:
            if (r14 == 0) goto L_0x03fd
            tq1 r4 = r13.k0()
            jj1 r0 = r13.p0()
            k91 r0 = r0.l()
            java.lang.String r6 = r0.a
            jj1 r13 = r13.p0()
            k91 r13 = r13.l()
            boolean r11 = r13.g
            r4.getClass()
            r9 = 0
            r10 = 0
            java.lang.String r5 = "PROFILE_OPENED"
            r7 = 0
            r8 = 0
            r12 = 60
            defpackage.tq1.a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            id1 r13 = defpackage.id1.b
            long r0 = r14.longValue()
            hd1[] r14 = defpackage.hd1.a
            ta4 r13 = r13.W0()
            java.lang.String r14 = ":profile?id="
            java.lang.String r2 = "&type=local_chat"
            java.lang.String r14 = defpackage.wj6.j(r0, r14, r2)
            r13.b(r14, r3)
            goto L_0x03fd
        L_0x00e0:
            boolean r0 = r14 instanceof defpackage.vh1
            if (r0 == 0) goto L_0x0128
            jj1 r13 = r13.p0()
            k91 r14 = r13.l()
            l21 r14 = r14.f
            if (r14 == 0) goto L_0x03fd
            java.lang.Long r14 = r14.a
            if (r14 == 0) goto L_0x03fd
            long r0 = r14.longValue()
            kotlin.Lazy r14 = r13.Z
            java.lang.Object r14 = r14.getValue()
            r2 = r14
            tq1 r2 = (defpackage.tq1) r2
            k91 r14 = r13.l()
            java.lang.String r4 = r14.a
            k91 r14 = r13.l()
            boolean r9 = r14.g
            r2.getClass()
            r6 = 0
            r10 = 60
            java.lang.String r3 = "CHAT_OPENED"
            r5 = 0
            r7 = 0
            r8 = 0
            defpackage.tq1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            id1 r14 = defpackage.id1.b
            pa4 r14 = r14.o1(r0)
            s85 r13 = r13.K0
            defpackage.xag.h(r13, r14)
            goto L_0x03fd
        L_0x0128:
            boolean r0 = r14 instanceof defpackage.qh1
            r4 = 1
            if (r0 == 0) goto L_0x0132
            r13.g0(r4)
            goto L_0x03fd
        L_0x0132:
            boolean r0 = r14 instanceof defpackage.fi1
            if (r0 == 0) goto L_0x0196
            fi1 r14 = (defpackage.fi1) r14
            boolean r14 = r14.b
            jj1 r0 = r13.p0()
            k91 r0 = r0.l()
            ni1 r0 = r0.i
            boolean r0 = r0.a()
            if (r14 != 0) goto L_0x0155
            if (r0 == 0) goto L_0x0155
            jj1 r13 = r13.p0()
            r13.q(r2, r3)
            goto L_0x03fd
        L_0x0155:
            if (r14 == 0) goto L_0x015b
            if (r0 == 0) goto L_0x015b
            goto L_0x03fd
        L_0x015b:
            hn r14 = r13.requireActivity()
            java.lang.String r0 = "media_projection"
            java.lang.Object r14 = r14.getSystemService(r0)
            boolean r0 = r14 instanceof android.media.projection.MediaProjectionManager
            if (r0 == 0) goto L_0x016c
            r3 = r14
            android.media.projection.MediaProjectionManager r3 = (android.media.projection.MediaProjectionManager) r3
        L_0x016c:
            if (r3 != 0) goto L_0x018d
            android.content.Context r14 = r13.getContext()
            int r0 = defpackage.ykc.call_start_screen_sharing_error
            java.lang.String r14 = r14.getString(r0)
            e0b r0 = new e0b
            r0.<init>((one.me.sdk.arch.Widget) r13)
            r0.i(r14)
            n0b r13 = new n0b
            r13.<init>(r2, r2, r1)
            r0.c(r13)
            r0.j()
            goto L_0x03fd
        L_0x018d:
            android.content.Intent r14 = r3.createScreenCaptureIntent()
            r13.startActivityForResult(r14, r4)
            goto L_0x03fd
        L_0x0196:
            boolean r0 = r14 instanceof defpackage.zh1
            if (r0 == 0) goto L_0x020b
            jj1 r13 = r13.p0()
            zh1 r14 = (defpackage.zh1) r14
            java.lang.CharSequence r14 = r14.b
            ap1 r13 = r13.c
            r13.getClass()
            ru.ok.android.externcalls.sdk.record.RecordManager$StartParams$Builder r0 = new ru.ok.android.externcalls.sdk.record.RecordManager$StartParams$Builder
            r0.<init>()
            r3 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            ru.ok.android.externcalls.sdk.record.RecordManager$StartParams$Builder r0 = r0.withMovieId(r1)
            ru.ok.android.externcalls.sdk.record.RecordManager$StartParams$Builder r0 = r0.isStream(r2)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            ru.ok.android.externcalls.sdk.record.RecordManager$StartParams$Builder r14 = r0.withName(r14)
            ru.ok.android.externcalls.sdk.record.RecordManager$StartParams r1 = r14.build()
            ahd r13 = r13.i
            chd r13 = (defpackage.chd) r13
            r13.getClass()
            java.lang.String r14 = "startRecordBroadcast"
            java.lang.String r0 = "ScreenRecordControllerTag"
            defpackage.z68.l(r0, r14, new java.lang.Object[0])
            java.util.concurrent.locks.ReentrantLock r14 = r13.c
            r14.lock()
            xme r2 = r13.v     // Catch:{ all -> 0x01f1 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x01f1 }
            dhd r2 = (defpackage.dhd) r2     // Catch:{ all -> 0x01f1 }
            ehd r2 = r2.a     // Catch:{ all -> 0x01f1 }
            ehd r3 = defpackage.ehd.a     // Catch:{ all -> 0x01f1 }
            if (r2 != r3) goto L_0x01f3
            java.lang.String r13 = "startRecordBroadcast already started"
            defpackage.z68.l(r0, r13, new java.lang.Object[0])     // Catch:{ all -> 0x01f1 }
            r14.unlock()
            goto L_0x03fd
        L_0x01f1:
            r13 = move-exception
            goto L_0x0207
        L_0x01f3:
            ru.ok.android.externcalls.sdk.record.RecordManager r0 = r13.a()     // Catch:{ all -> 0x01f1 }
            if (r0 == 0) goto L_0x0202
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            ru.ok.android.externcalls.sdk.record.RecordManager.startRecord$default(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x01f1 }
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01f1 }
        L_0x0202:
            r14.unlock()
            goto L_0x03fd
        L_0x0207:
            r14.unlock()
            throw r13
        L_0x020b:
            boolean r0 = r14 instanceof defpackage.ci1
            if (r0 == 0) goto L_0x021e
            jj1 r13 = r13.p0()
            ap1 r13 = r13.c
            ahd r13 = r13.i
            chd r13 = (defpackage.chd) r13
            r13.d()
            goto L_0x03fd
        L_0x021e:
            boolean r0 = r14 instanceof defpackage.sh1
            if (r0 == 0) goto L_0x0227
            r13.g0(r2)
            goto L_0x03fd
        L_0x0227:
            boolean r0 = r14 instanceof defpackage.rh1
            if (r0 == 0) goto L_0x023a
            jj1 r13 = r13.p0()
            rh1 r14 = (defpackage.rh1) r14
            vag r14 = r14.b
            ap1 r13 = r13.c
            r13.a(r14)
            goto L_0x03fd
        L_0x023a:
            boolean r0 = r14 instanceof defpackage.hi1
            java.lang.String r5 = r13.x
            if (r0 == 0) goto L_0x0259
            id1 r13 = defpackage.id1.b
            ta4 r13 = r13.W0()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = ":call-opponents-list?arg_key_scope_id="
            r14.<init>(r0)
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            r13.b(r14, r3)
            goto L_0x03fd
        L_0x0259:
            boolean r0 = r14 instanceof defpackage.th1
            if (r0 == 0) goto L_0x028d
            th1 r14 = (defpackage.th1) r14
            java.lang.String r14 = r14.b
            android.content.Context r0 = r13.getContext()
            defpackage.b59.k(r0, r14)
            boolean r14 = defpackage.b59.C()
            if (r14 == 0) goto L_0x03fd
            android.content.Context r14 = r13.getContext()
            int r0 = defpackage.ykc.call_link_share_dialog_share_link_copy
            java.lang.String r14 = r14.getString(r0)
            e0b r0 = new e0b
            r0.<init>((one.me.sdk.arch.Widget) r13)
            r0.i(r14)
            n0b r13 = new n0b
            r13.<init>(r2, r2, r1)
            r0.c(r13)
            r0.j()
            goto L_0x03fd
        L_0x028d:
            boolean r0 = r14 instanceof defpackage.bi1
            java.lang.String r1 = "BottomSheetWidget"
            if (r0 == 0) goto L_0x02cd
            kotlin.reflect.KProperty[] r14 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet r7 = new one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet
            cd1 r14 = defpackage.cd1.b
            r7.<init>(r5, r14, r3)
            r7.setTargetController(r13)
        L_0x029f:
            zx3 r14 = r13.getParentController()
            if (r14 == 0) goto L_0x02aa
            zx3 r13 = r13.getParentController()
            goto L_0x029f
        L_0x02aa:
            boolean r14 = r13 instanceof defpackage.l9d
            if (r14 == 0) goto L_0x02b1
            l9d r13 = (defpackage.l9d) r13
            goto L_0x02b2
        L_0x02b1:
            r13 = r3
        L_0x02b2:
            if (r13 == 0) goto L_0x02b8
            e9d r3 = r13.K()
        L_0x02b8:
            if (r3 == 0) goto L_0x03fd
            i9d r13 = new i9d
            r9 = 0
            r12 = -1
            r8 = 0
            r10 = 0
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            defpackage.a81.t(r2, r13, r4, r1)
            r3.G(r13)
            goto L_0x03fd
        L_0x02cd:
            boolean r0 = r14 instanceof defpackage.ai1
            if (r0 == 0) goto L_0x030d
            kotlin.reflect.KProperty[] r14 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet r7 = new one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet
            r7.<init>(r5, r3)
            r7.setTargetController(r13)
            r14 = r13
        L_0x02dc:
            zx3 r0 = r14.getParentController()
            if (r0 == 0) goto L_0x02e7
            zx3 r14 = r14.getParentController()
            goto L_0x02dc
        L_0x02e7:
            boolean r0 = r14 instanceof defpackage.l9d
            if (r0 == 0) goto L_0x02ee
            l9d r14 = (defpackage.l9d) r14
            goto L_0x02ef
        L_0x02ee:
            r14 = r3
        L_0x02ef:
            if (r14 == 0) goto L_0x02f5
            e9d r3 = r14.K()
        L_0x02f5:
            r7.p0(r13)
            if (r3 == 0) goto L_0x03fd
            i9d r13 = new i9d
            r9 = 0
            r12 = -1
            r8 = 0
            r10 = 0
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            defpackage.a81.t(r2, r13, r4, r1)
            r3.G(r13)
            goto L_0x03fd
        L_0x030d:
            boolean r0 = r14 instanceof defpackage.di1
            if (r0 == 0) goto L_0x034f
            kotlin.reflect.KProperty[] r14 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet r7 = new one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet
            pxc r14 = defpackage.pxc.b
            r7.<init>(r5, r14, r3)
            r7.setTargetController(r13)
            r14 = r13
        L_0x031e:
            zx3 r0 = r14.getParentController()
            if (r0 == 0) goto L_0x0329
            zx3 r14 = r14.getParentController()
            goto L_0x031e
        L_0x0329:
            boolean r0 = r14 instanceof defpackage.l9d
            if (r0 == 0) goto L_0x0330
            l9d r14 = (defpackage.l9d) r14
            goto L_0x0331
        L_0x0330:
            r14 = r3
        L_0x0331:
            if (r14 == 0) goto L_0x0337
            e9d r3 = r14.K()
        L_0x0337:
            r7.p0(r13)
            if (r3 == 0) goto L_0x03fd
            i9d r13 = new i9d
            r9 = 0
            r12 = -1
            r8 = 0
            r10 = 0
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            defpackage.a81.t(r2, r13, r4, r1)
            r3.G(r13)
            goto L_0x03fd
        L_0x034f:
            boolean r0 = r14 instanceof defpackage.uh1
            if (r0 == 0) goto L_0x0391
            kotlin.reflect.KProperty[] r14 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet r7 = new one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet
            pxc r14 = defpackage.pxc.a
            r7.<init>(r5, r14, r3)
            r7.setTargetController(r13)
            r14 = r13
        L_0x0360:
            zx3 r0 = r14.getParentController()
            if (r0 == 0) goto L_0x036b
            zx3 r14 = r14.getParentController()
            goto L_0x0360
        L_0x036b:
            boolean r0 = r14 instanceof defpackage.l9d
            if (r0 == 0) goto L_0x0372
            l9d r14 = (defpackage.l9d) r14
            goto L_0x0373
        L_0x0372:
            r14 = r3
        L_0x0373:
            if (r14 == 0) goto L_0x0379
            e9d r3 = r14.K()
        L_0x0379:
            r7.p0(r13)
            if (r3 == 0) goto L_0x03fd
            i9d r13 = new i9d
            r9 = 0
            r12 = -1
            r8 = 0
            r10 = 0
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            defpackage.a81.t(r2, r13, r4, r1)
            r3.G(r13)
            goto L_0x03fd
        L_0x0391:
            boolean r0 = r14 instanceof defpackage.yh1
            if (r0 == 0) goto L_0x03ce
            kotlin.reflect.KProperty[] r14 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet r7 = new one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet
            cd1 r14 = defpackage.cd1.a
            r7.<init>(r5, r14, r3)
            r7.setTargetController(r13)
        L_0x03a1:
            zx3 r14 = r13.getParentController()
            if (r14 == 0) goto L_0x03ac
            zx3 r13 = r13.getParentController()
            goto L_0x03a1
        L_0x03ac:
            boolean r14 = r13 instanceof defpackage.l9d
            if (r14 == 0) goto L_0x03b3
            l9d r13 = (defpackage.l9d) r13
            goto L_0x03b4
        L_0x03b3:
            r13 = r3
        L_0x03b4:
            if (r13 == 0) goto L_0x03ba
            e9d r3 = r13.K()
        L_0x03ba:
            if (r3 == 0) goto L_0x03fd
            i9d r13 = new i9d
            r9 = 0
            r12 = -1
            r8 = 0
            r10 = 0
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            defpackage.a81.t(r2, r13, r4, r1)
            r3.G(r13)
            goto L_0x03fd
        L_0x03ce:
            boolean r0 = r14 instanceof defpackage.ei1
            if (r0 == 0) goto L_0x03ec
            id1 r0 = defpackage.id1.b
            android.content.Context r13 = r13.getContext()
            int r1 = defpackage.sqa.D0
            java.lang.String r13 = r13.getString(r1)
            ei1 r14 = (defpackage.ei1) r14
            java.lang.String r14 = r14.b
            java.lang.Class<one.me.calls.ui.ui.call.CallScreen> r1 = one.me.calls.ui.ui.call.CallScreen.class
            java.lang.String r1 = r1.getName()
            r0.n1(r14, r13, r1)
            goto L_0x03fd
        L_0x03ec:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x03f2:
            boolean r13 = r14 instanceof defpackage.pa4
            if (r13 == 0) goto L_0x03fd
            id1 r13 = defpackage.id1.b
            pa4 r14 = (defpackage.pa4) r14
            r13.Y0(r14)
        L_0x03fd:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
