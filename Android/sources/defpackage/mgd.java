package defpackage;

/* renamed from: mgd  reason: default package */
public final /* synthetic */ class mgd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mgd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 2
            r3 = 1
            int r4 = r7.a
            switch(r4) {
                case 0: goto L_0x039b;
                case 1: goto L_0x0393;
                case 2: goto L_0x038b;
                case 3: goto L_0x037d;
                case 4: goto L_0x0308;
                case 5: goto L_0x0300;
                case 6: goto L_0x02b7;
                case 7: goto L_0x0293;
                case 8: goto L_0x028b;
                case 9: goto L_0x0279;
                case 10: goto L_0x0190;
                case 11: goto L_0x0180;
                case 12: goto L_0x014f;
                case 13: goto L_0x0145;
                case 14: goto L_0x013d;
                case 15: goto L_0x0131;
                case 16: goto L_0x0129;
                case 17: goto L_0x0121;
                case 18: goto L_0x00fe;
                case 19: goto L_0x00f6;
                case 20: goto L_0x00ee;
                case 21: goto L_0x00b9;
                case 22: goto L_0x0061;
                case 23: goto L_0x0057;
                case 24: goto L_0x004f;
                case 25: goto L_0x0035;
                case 26: goto L_0x0025;
                case 27: goto L_0x001d;
                case 28: goto L_0x0013;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r7 = r7.b
            ymf r7 = (defpackage.ymf) r7
            r7.Z = r1
            r7.a()
            return
        L_0x0013:
            java.lang.Object r7 = r7.b
            com.google.android.material.textfield.TextInputLayout r7 = (com.google.android.material.textfield.TextInputLayout) r7
            android.widget.EditText r7 = r7.o
            r7.requestLayout()
            return
        L_0x001d:
            java.lang.Object r7 = r7.b
            tcf r7 = (defpackage.tcf) r7
            r7.b(r3)
            return
        L_0x0025:
            java.lang.Object r7 = r7.b
            ybf r7 = (defpackage.ybf) r7
            kotlin.Lazy r7 = r7.n
            java.lang.Object r7 = r7.getValue()
            doa r7 = (defpackage.doa) r7
            r7.h(r3)
            return
        L_0x0035:
            java.lang.Object r7 = r7.b
            wbf r7 = (defpackage.wbf) r7
            r7.getClass()
            java.lang.String r0 = defpackage.wbf.q
            java.lang.String r1 = "handleIntent: close and re-create session"
            defpackage.z68.a(r0, r1)
            kotlin.Lazy r7 = r7.m
            java.lang.Object r7 = r7.getValue()
            zbf r7 = (defpackage.zbf) r7
            r7.g()
            return
        L_0x004f:
            java.lang.Object r7 = r7.b
            jtc r7 = (defpackage.jtc) r7
            r7.e()
            return
        L_0x0057:
            java.lang.Object r7 = r7.b
            zaf r7 = (defpackage.zaf) r7
            ag r7 = r7.a
            r7.start()
            return
        L_0x0061:
            java.lang.Object r7 = r7.b
            c9f r7 = (defpackage.c9f) r7
            r7.a(r2)
            android.content.Context r0 = r7.a     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r1 = defpackage.o54.r()     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ Exception -> 0x00b8 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ Exception -> 0x00b8 }
            if (r2 == 0) goto L_0x007b
            java.lang.String r1 = "tracer"
            goto L_0x0095
        L_0x007b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r3 = "tracer-"
            r2.<init>(r3)     // Catch:{ Exception -> 0x00b8 }
            r3 = 58
            r4 = 45
            java.lang.String r1 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r1, (char) r3, (char) r4, false, 4, (java.lang.Object) null)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r1 = android.net.Uri.encode(r1)     // Catch:{ Exception -> 0x00b8 }
            r2.append(r1)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x00b8 }
        L_0x0095:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00b8 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ Exception -> 0x00b8 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x00b8 }
            defpackage.f6e.y(r2)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r0 = "tags"
            java.io.File r0 = kotlin.io.FilesKt.resolve((java.io.File) r2, (java.lang.String) r0)     // Catch:{ Exception -> 0x00b8 }
            java.util.ArrayList r1 = r7.e     // Catch:{ Exception -> 0x00b8 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x00b8 }
            java.util.ArrayList r7 = r7.e     // Catch:{ all -> 0x00b5 }
            java.util.List r7 = kotlin.collections.CollectionsKt.toList(r7)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x00b8 }
            defpackage.ld9.d(r0, r7)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00b8
        L_0x00b5:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x00b8 }
            throw r7     // Catch:{ Exception -> 0x00b8 }
        L_0x00b8:
            return
        L_0x00b9:
            java.lang.Object r7 = r7.b
            u6f r7 = (defpackage.u6f) r7
            rt6 r0 = r7.f
            java.lang.String r1 = "Need to call openCaptureSession before using this API."
            defpackage.bs0.q(r0, r1)
            kq9 r0 = r7.b
            java.lang.Object r1 = r0.b
            monitor-enter(r1)
            java.lang.Object r0 = r0.o     // Catch:{ all -> 0x00eb }
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0     // Catch:{ all -> 0x00eb }
            r0.add(r7)     // Catch:{ all -> 0x00eb }
            monitor-exit(r1)     // Catch:{ all -> 0x00eb }
            rt6 r0 = r7.f
            java.lang.Object r0 = r0.b
            ata r0 = (defpackage.ata) r0
            java.lang.Object r0 = r0.b
            android.hardware.camera2.CameraCaptureSession r0 = (android.hardware.camera2.CameraCaptureSession) r0
            r0.close()
            java.util.concurrent.Executor r0 = r7.c
            mgd r1 = new mgd
            r2 = 20
            r1.<init>(r2, r7)
            r0.execute(r1)
            return
        L_0x00eb:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00eb }
            throw r7
        L_0x00ee:
            java.lang.Object r7 = r7.b
            t6f r7 = (defpackage.t6f) r7
            r7.g(r7)
            return
        L_0x00f6:
            java.lang.Object r7 = r7.b
            u00 r7 = (defpackage.u00) r7
            r7.j()
            return
        L_0x00fe:
            java.lang.Object r7 = r7.b
            g6d r7 = (defpackage.g6d) r7
            java.lang.Object r7 = r7.o
            rx4 r7 = (defpackage.rx4) r7
            if (r7 == 0) goto L_0x0120
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x0110:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r7.next()
            q3f r0 = (defpackage.q3f) r0
            r0.c()
            goto L_0x0110
        L_0x0120:
            return
        L_0x0121:
            java.lang.Object r7 = r7.b
            java.util.concurrent.CountDownLatch r7 = (java.util.concurrent.CountDownLatch) r7
            r7.countDown()
            return
        L_0x0129:
            java.lang.Object r7 = r7.b
            nxe r7 = (defpackage.nxe) r7
            r7.b()
            return
        L_0x0131:
            java.lang.Object r7 = r7.b
            nse r7 = (defpackage.nse) r7
            ru.ok.messages.views.widgets.RecyclerAutofitGridView r0 = r7.a
            mg4 r7 = r7.x0
            r0.setItemAnimator(r7)
            return
        L_0x013d:
            java.lang.Object r7 = r7.b
            lw9 r7 = (defpackage.lw9) r7
            r7.m()
            return
        L_0x0145:
            java.lang.Object r7 = r7.b
            yqe r7 = (defpackage.yqe) r7
            hre r7 = r7.z
            r7.m()
            return
        L_0x014f:
            java.lang.Object r7 = r7.b
            wge r7 = (defpackage.wge) r7
            android.view.Surface r0 = r7.y
            if (r0 == 0) goto L_0x016f
            java.util.concurrent.CopyOnWriteArrayList r2 = r7.a
            java.util.Iterator r2 = r2.iterator()
        L_0x015d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x016f
            java.lang.Object r3 = r2.next()
            mc5 r3 = (defpackage.mc5) r3
            sc5 r3 = r3.a
            r3.A1(r1)
            goto L_0x015d
        L_0x016f:
            android.graphics.SurfaceTexture r2 = r7.x
            if (r2 == 0) goto L_0x0176
            r2.release()
        L_0x0176:
            if (r0 == 0) goto L_0x017b
            r0.release()
        L_0x017b:
            r7.x = r1
            r7.y = r1
            return
        L_0x0180:
            java.lang.Object r7 = r7.b
            jz2 r7 = (defpackage.jz2) r7
            java.lang.Object r0 = r7.c
            cce r0 = (defpackage.cce) r0
            k6g r0 = r0.o
            long r1 = r7.b
            r0.e(r1)
            return
        L_0x0190:
            java.lang.Object r7 = r7.b
            abe r7 = (defpackage.abe) r7
            r7.getClass()
            kotlin.Lazy r0 = r7.b     // Catch:{ Exception -> 0x0278 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x0278 }
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch:{ Exception -> 0x0278 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0278 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x0278 }
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r0)     // Catch:{ Exception -> 0x0278 }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0278 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0278 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0278 }
            kotlin.jvm.functions.Function0 r7 = r7.a     // Catch:{ Exception -> 0x0278 }
            java.lang.Object r7 = r7.invoke()     // Catch:{ Exception -> 0x0278 }
            java.io.File r7 = (java.io.File) r7     // Catch:{ Exception -> 0x0278 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0278 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0278 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0278 }
            r4.writeInt(r3)     // Catch:{ all -> 0x01fc }
            int r7 = r0.size()     // Catch:{ all -> 0x01fc }
            r4.writeInt(r7)     // Catch:{ all -> 0x01fc }
            java.util.Set r7 = r0.entrySet()     // Catch:{ all -> 0x01fc }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x01fc }
        L_0x01d2:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x026c
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x01fc }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01fc }
            java.lang.Object r5 = r0.getKey()     // Catch:{ all -> 0x01fc }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01fc }
            r4.writeUTF(r5)     // Catch:{ all -> 0x01fc }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01fc }
            boolean r5 = r0 instanceof java.lang.Boolean     // Catch:{ all -> 0x01fc }
            if (r5 == 0) goto L_0x01ff
            r4.writeInt(r2)     // Catch:{ all -> 0x01fc }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01fc }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01fc }
            r4.writeBoolean(r0)     // Catch:{ all -> 0x01fc }
            goto L_0x01d2
        L_0x01fc:
            r7 = move-exception
            goto L_0x0272
        L_0x01ff:
            boolean r5 = r0 instanceof java.lang.Integer     // Catch:{ all -> 0x01fc }
            if (r5 == 0) goto L_0x0211
            r5 = 3
            r4.writeInt(r5)     // Catch:{ all -> 0x01fc }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01fc }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01fc }
            r4.writeInt(r0)     // Catch:{ all -> 0x01fc }
            goto L_0x01d2
        L_0x0211:
            boolean r5 = r0 instanceof java.lang.Long     // Catch:{ all -> 0x01fc }
            if (r5 == 0) goto L_0x0223
            r5 = 4
            r4.writeInt(r5)     // Catch:{ all -> 0x01fc }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01fc }
            long r5 = r0.longValue()     // Catch:{ all -> 0x01fc }
            r4.writeLong(r5)     // Catch:{ all -> 0x01fc }
            goto L_0x01d2
        L_0x0223:
            boolean r5 = r0 instanceof java.lang.Float     // Catch:{ all -> 0x01fc }
            if (r5 == 0) goto L_0x0235
            r5 = 5
            r4.writeInt(r5)     // Catch:{ all -> 0x01fc }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01fc }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x01fc }
            r4.writeFloat(r0)     // Catch:{ all -> 0x01fc }
            goto L_0x01d2
        L_0x0235:
            boolean r5 = r0 instanceof java.lang.Double     // Catch:{ all -> 0x01fc }
            if (r5 == 0) goto L_0x0247
            r5 = 6
            r4.writeInt(r5)     // Catch:{ all -> 0x01fc }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01fc }
            double r5 = r0.doubleValue()     // Catch:{ all -> 0x01fc }
            r4.writeDouble(r5)     // Catch:{ all -> 0x01fc }
            goto L_0x01d2
        L_0x0247:
            boolean r5 = r0 instanceof java.lang.String     // Catch:{ all -> 0x01fc }
            if (r5 == 0) goto L_0x0255
            r4.writeInt(r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01fc }
            r4.writeUTF(r0)     // Catch:{ all -> 0x01fc }
            goto L_0x01d2
        L_0x0255:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01fc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fc }
            r1.<init>()     // Catch:{ all -> 0x01fc }
            java.lang.String r2 = "Write unknown type of value "
            r1.append(r2)     // Catch:{ all -> 0x01fc }
            r1.append(r0)     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01fc }
            r7.<init>(r0)     // Catch:{ all -> 0x01fc }
            throw r7     // Catch:{ all -> 0x01fc }
        L_0x026c:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01fc }
            kotlin.io.CloseableKt.closeFinally(r4, r1)     // Catch:{ Exception -> 0x0278 }
            goto L_0x0278
        L_0x0272:
            throw r7     // Catch:{ all -> 0x0273 }
        L_0x0273:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r4, r7)     // Catch:{ Exception -> 0x0278 }
            throw r0     // Catch:{ Exception -> 0x0278 }
        L_0x0278:
            return
        L_0x0279:
            java.lang.Object r7 = r7.b
            b8d r7 = (defpackage.b8d) r7
            java.lang.Object r7 = r7.a
            m70 r7 = (defpackage.m70) r7
            r7.q = r3
            int r0 = r7.g
            if (r0 != r2) goto L_0x028a
            r7.a()
        L_0x028a:
            return
        L_0x028b:
            java.lang.Object r7 = r7.b
            o9e r7 = (defpackage.o9e) r7
            r7.g()
            return
        L_0x0293:
            java.lang.Object r7 = r7.b
            ur0 r7 = (defpackage.ur0) r7
            r7.c = r0
            java.lang.Object r0 = r7.e
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            kag r1 = r0.i
            if (r1 == 0) goto L_0x02ad
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x02ad
            int r0 = r7.b
            r7.b(r0)
            goto L_0x02b6
        L_0x02ad:
            int r1 = r0.h
            if (r1 != r2) goto L_0x02b6
            int r7 = r7.b
            r0.x(r7)
        L_0x02b6:
            return
        L_0x02b7:
            java.lang.Object r7 = r7.b
            soc r7 = (defpackage.soc) r7
            java.lang.Object r0 = r7.v
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            monitor-enter(r0)
            java.lang.Object r1 = r7.b     // Catch:{ all -> 0x02fd }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x02fd }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x02fd }
            java.lang.Object r2 = r7.c     // Catch:{ all -> 0x02fd }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x02fd }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fd }
            r3.<init>()     // Catch:{ all -> 0x02fd }
            java.lang.Object r4 = r7.v     // Catch:{ all -> 0x02fd }
            java.util.ArrayDeque r4 = (java.util.ArrayDeque) r4     // Catch:{ all -> 0x02fd }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x02fd }
        L_0x02d9:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x02fd }
            if (r5 == 0) goto L_0x02f0
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x02fd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x02fd }
            r3.append(r5)     // Catch:{ all -> 0x02fd }
            java.lang.Object r5 = r7.o     // Catch:{ all -> 0x02fd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x02fd }
            r3.append(r5)     // Catch:{ all -> 0x02fd }
            goto L_0x02d9
        L_0x02f0:
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x02fd }
            android.content.SharedPreferences$Editor r7 = r1.putString(r2, r7)     // Catch:{ all -> 0x02fd }
            r7.commit()     // Catch:{ all -> 0x02fd }
            monitor-exit(r0)     // Catch:{ all -> 0x02fd }
            return
        L_0x02fd:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02fd }
            throw r7
        L_0x0300:
            java.lang.Object r7 = r7.b
            bs6 r7 = (defpackage.bs6) r7
            r7.h()
            return
        L_0x0308:
            java.lang.Object r7 = r7.b
            lsd r7 = (defpackage.lsd) r7
            r7.getClass()
            msd r1 = r7.f     // Catch:{ RuntimeException -> 0x0346 }
            boolean r1 = r1.u     // Catch:{ RuntimeException -> 0x0346 }
            if (r1 == 0) goto L_0x0316
            goto L_0x037c
        L_0x0316:
            msd r1 = r7.f     // Catch:{ RuntimeException -> 0x0346 }
            r1.h()     // Catch:{ RuntimeException -> 0x0346 }
            long r1 = r7.c     // Catch:{ RuntimeException -> 0x0346 }
            msd r4 = r7.f     // Catch:{ RuntimeException -> 0x0346 }
            long r4 = r4.w     // Catch:{ RuntimeException -> 0x0346 }
            long r1 = r1 + r4
            r7.c = r1     // Catch:{ RuntimeException -> 0x0346 }
            msd r1 = r7.f     // Catch:{ RuntimeException -> 0x0346 }
            vt r1 = r1.o     // Catch:{ RuntimeException -> 0x0346 }
            r1.release()     // Catch:{ RuntimeException -> 0x0346 }
            msd r1 = r7.f     // Catch:{ RuntimeException -> 0x0346 }
            r1.m = r0     // Catch:{ RuntimeException -> 0x0346 }
            int r2 = r1.n     // Catch:{ RuntimeException -> 0x0346 }
            int r2 = r2 + r3
            r1.n = r2     // Catch:{ RuntimeException -> 0x0346 }
            tb7 r1 = r1.a     // Catch:{ RuntimeException -> 0x0346 }
            int r1 = r1.size()     // Catch:{ RuntimeException -> 0x0346 }
            if (r2 != r1) goto L_0x0348
            msd r1 = r7.f     // Catch:{ RuntimeException -> 0x0346 }
            r1.n = r0     // Catch:{ RuntimeException -> 0x0346 }
            int r0 = r1.s     // Catch:{ RuntimeException -> 0x0346 }
            int r0 = r0 + r3
            r1.s = r0     // Catch:{ RuntimeException -> 0x0346 }
            goto L_0x0348
        L_0x0346:
            r0 = move-exception
            goto L_0x0371
        L_0x0348:
            msd r0 = r7.f     // Catch:{ RuntimeException -> 0x0346 }
            tb7 r1 = r0.a     // Catch:{ RuntimeException -> 0x0346 }
            int r0 = r0.n     // Catch:{ RuntimeException -> 0x0346 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ RuntimeException -> 0x0346 }
            e05 r0 = (defpackage.e05) r0     // Catch:{ RuntimeException -> 0x0346 }
            msd r1 = r7.f     // Catch:{ RuntimeException -> 0x0346 }
            tt r2 = r1.d     // Catch:{ RuntimeException -> 0x0346 }
            android.os.Looper r3 = android.os.Looper.myLooper()     // Catch:{ RuntimeException -> 0x0346 }
            r3.getClass()     // Catch:{ RuntimeException -> 0x0346 }
            msd r4 = r7.f     // Catch:{ RuntimeException -> 0x0346 }
            qd3 r5 = r4.e     // Catch:{ RuntimeException -> 0x0346 }
            vt r0 = r2.b(r0, r3, r4, r5)     // Catch:{ RuntimeException -> 0x0346 }
            r1.o = r0     // Catch:{ RuntimeException -> 0x0346 }
            msd r0 = r7.f     // Catch:{ RuntimeException -> 0x0346 }
            vt r0 = r0.o     // Catch:{ RuntimeException -> 0x0346 }
            r0.start()     // Catch:{ RuntimeException -> 0x0346 }
            goto L_0x037c
        L_0x0371:
            msd r7 = r7.f
            r1 = 1000(0x3e8, float:1.401E-42)
            androidx.media3.transformer.ExportException r0 = androidx.media3.transformer.ExportException.a(r0, r1)
            r7.d(r0)
        L_0x037c:
            return
        L_0x037d:
            kotlin.reflect.KProperty[] r0 = one.me.sdk.gallery.selectalbum.SelectAlbumWidget.w
            java.lang.Object r7 = r7.b
            one.me.sdk.gallery.selectalbum.SelectAlbumWidget r7 = (one.me.sdk.gallery.selectalbum.SelectAlbumWidget) r7
            orb r7 = r7.d0()
            r7.k()
            return
        L_0x038b:
            java.lang.Object r7 = r7.b
            ru.ok.tamtam.workmanager.SdkCoroutineWorker r7 = (ru.ok.tamtam.workmanager.SdkCoroutineWorker) r7
            ru.ok.tamtam.workmanager.SdkCoroutineWorker.b(r7)
            return
        L_0x0393:
            java.lang.Object r7 = r7.b
            ps1 r7 = (defpackage.ps1) r7
            r7.a()
            return
        L_0x039b:
            java.lang.Object r7 = r7.b
            ngd r7 = (defpackage.ngd) r7
            r7.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgd.run():void");
    }
}
