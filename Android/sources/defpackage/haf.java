package defpackage;

/* renamed from: haf  reason: default package */
public final class haf implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ haf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        reg reg = (reg) this.b;
        synchronized (reg.a) {
            try {
                if (reg.b()) {
                    String.valueOf(reg.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                    reg.d();
                    if (reg.b()) {
                        reg.c = 1;
                        reg.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (((d4h) this.b).c) {
            try {
                hma hma = (hma) ((d4h) this.b).o;
                if (hma != null) {
                    hma.r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0193  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            r2 = -1
            r0 = 0
            r4 = 0
            int r5 = r1.a
            switch(r5) {
                case 0: goto L_0x0250;
                case 1: goto L_0x0246;
                case 2: goto L_0x01c1;
                case 3: goto L_0x01b2;
                case 4: goto L_0x01a5;
                case 5: goto L_0x019d;
                case 6: goto L_0x0164;
                case 7: goto L_0x015c;
                case 8: goto L_0x0143;
                case 9: goto L_0x013b;
                case 10: goto L_0x0130;
                case 11: goto L_0x011a;
                case 12: goto L_0x00f9;
                case 13: goto L_0x00d4;
                case 14: goto L_0x00cc;
                case 15: goto L_0x00b0;
                case 16: goto L_0x00a0;
                case 17: goto L_0x009f;
                case 18: goto L_0x009b;
                case 19: goto L_0x008c;
                case 20: goto L_0x0088;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r1.b
            o5h r0 = (defpackage.o5h) r0
            java.lang.Object r1 = r0.a
            android.content.Context r1 = (android.content.Context) r1
            android.content.SharedPreferences r1 = defpackage.o5h.C(r1)
            java.lang.String r5 = "app_set_id_last_used_time"
            long r6 = r1.getLong(r5, r2)
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0028
            r8 = 33696000000(0x7d8702800, double:1.66480360023E-313)
            long r6 = r6 + r8
            goto L_0x0029
        L_0x0028:
            r6 = r2
        L_0x0029:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0087
            long r1 = java.lang.System.currentTimeMillis()
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0087
            java.lang.Object r0 = r0.a
            android.content.Context r0 = (android.content.Context) r0
            android.content.SharedPreferences r1 = defpackage.o5h.C(r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "app_set_id"
            android.content.SharedPreferences$Editor r1 = r1.remove(r2)
            boolean r1 = r1.commit()
            if (r1 != 0) goto L_0x0060
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x0060
            java.lang.String r2 = "Failed to clear app set ID generated for App "
            r2.concat(r1)
        L_0x0060:
            java.lang.String r1 = "app_set_id_storage"
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r4)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.remove(r5)
            boolean r1 = r1.commit()
            if (r1 != 0) goto L_0x0087
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0087
            java.lang.String r1 = "Failed to clear app set ID last used time for App "
            r1.concat(r0)
        L_0x0087:
            return
        L_0x0088:
            r17.b()
            return
        L_0x008c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TIMEOUT"
            r0.<init>(r2)
            java.lang.Object r1 = r1.b
            qdf r1 = (defpackage.qdf) r1
            r1.c(r0)
            return
        L_0x009b:
            r17.a()
            return
        L_0x009f:
            throw r0
        L_0x00a0:
            java.lang.Object r0 = r1.b
            yvg r0 = (defpackage.yvg) r0
            ce r0 = r0.j
            bi3 r1 = new bi3
            r2 = 4
            r1.<init>(r2)
            r0.t(r1)
            return
        L_0x00b0:
            java.lang.Object r0 = r1.b
            z3a r0 = (defpackage.z3a) r0
            java.lang.Object r0 = r0.b
            kvg r0 = (defpackage.kvg) r0
            ql r0 = r0.d
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = " disconnecting because it was signed out."
            java.lang.String r1 = r1.concat(r2)
            r0.b(r1)
            return
        L_0x00cc:
            java.lang.Object r0 = r1.b
            kvg r0 = (defpackage.kvg) r0
            r0.e()
            return
        L_0x00d4:
            java.lang.Object r0 = r1.b
            r2 = r0
            qpg r2 = (defpackage.qpg) r2
            java.lang.Object r0 = r2.o     // Catch:{ all -> 0x00ea }
            v48 r0 = (defpackage.v48) r0     // Catch:{ all -> 0x00ea }
            java.util.concurrent.Executor r0 = r0.g     // Catch:{ all -> 0x00ea }
            qof r3 = new qof     // Catch:{ all -> 0x00ea }
            r4 = 19
            r3.<init>(r4, r1)     // Catch:{ all -> 0x00ea }
            r0.execute(r3)     // Catch:{ all -> 0x00ea }
            goto L_0x00f8
        L_0x00ea:
            r0 = move-exception
            java.lang.Object r1 = r2.o
            v48 r1 = (defpackage.v48) r1
            voc r1 = r1.n
            java.lang.String r2 = "OKRTCLmsAdapter"
            java.lang.String r3 = "Unexpected executor usage error"
            r1.logException(r2, r3, r0)
        L_0x00f8:
            return
        L_0x00f9:
            java.lang.Object r1 = r1.b
            hz0 r1 = (defpackage.hz0) r1
            voc r2 = r1.T0
            java.lang.String r3 = "OKRTCCall"
            java.lang.String r4 = "💀 pc.timeout"
            r2.log(r3, r4)
            nw6 r2 = defpackage.nw6.a
            r1.d(r2)
            r1.O0 = r2
            zqd r2 = r1.i2
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$PeerConnectionTimeout r3 = ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.PeerConnectionTimeout.INSTANCE
            r2.B(r3)
            b51 r2 = defpackage.b51.c
            r1.k(r2, r0)
            return
        L_0x011a:
            java.lang.Object r0 = r1.b
            r1 = r0
            androidx.work.Worker r1 = (androidx.work.Worker) r1
            d08 r0 = r1.b()     // Catch:{ all -> 0x0129 }
            cyd r2 = r1.a     // Catch:{ all -> 0x0129 }
            r2.j(r0)     // Catch:{ all -> 0x0129 }
            goto L_0x012f
        L_0x0129:
            r0 = move-exception
            cyd r1 = r1.a
            r1.k(r0)
        L_0x012f:
            return
        L_0x0130:
            java.lang.Object r0 = r1.b
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r0.setScrollState(r4)
            r0.q()
            return
        L_0x013b:
            java.lang.Object r0 = r1.b
            kag r0 = (defpackage.kag) r0
            r0.o(r4)
            return
        L_0x0143:
            java.lang.Object r0 = r1.b
            muf r0 = (defpackage.muf) r0
            boolean r1 = r0.v0
            if (r1 != 0) goto L_0x014c
            goto L_0x015b
        L_0x014c:
            r0.invalidateSelf()
            long r1 = android.os.SystemClock.uptimeMillis()
            r3 = 8
            long r1 = r1 + r3
            haf r3 = r0.Z
            r0.scheduleSelf(r3, r1)
        L_0x015b:
            return
        L_0x015c:
            java.lang.Object r0 = r1.b
            cy3 r0 = (defpackage.cy3) r0
            r0.n()
            return
        L_0x0164:
            java.lang.Object r1 = r1.b
            jmf r1 = (defpackage.jmf) r1
            android.view.Window$Callback r2 = r1.x
            android.view.Menu r1 = r1.h0()
            boolean r3 = r1 instanceof defpackage.m69
            if (r3 == 0) goto L_0x0176
            r3 = r1
            m69 r3 = (defpackage.m69) r3
            goto L_0x0177
        L_0x0176:
            r3 = r0
        L_0x0177:
            if (r3 == 0) goto L_0x017c
            r3.w()
        L_0x017c:
            r1.clear()     // Catch:{ all -> 0x018c }
            boolean r5 = r2.onCreatePanelMenu(r4, r1)     // Catch:{ all -> 0x018c }
            if (r5 == 0) goto L_0x018e
            boolean r0 = r2.onPreparePanel(r4, r0, r1)     // Catch:{ all -> 0x018c }
            if (r0 != 0) goto L_0x0191
            goto L_0x018e
        L_0x018c:
            r0 = move-exception
            goto L_0x0197
        L_0x018e:
            r1.clear()     // Catch:{ all -> 0x018c }
        L_0x0191:
            if (r3 == 0) goto L_0x0196
            r3.v()
        L_0x0196:
            return
        L_0x0197:
            if (r3 == 0) goto L_0x019c
            r3.v()
        L_0x019c:
            throw r0
        L_0x019d:
            java.lang.Object r0 = r1.b
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r0.w()
            return
        L_0x01a5:
            int r0 = ru.ok.messages.calls.views.TextureViewRenderer.A0
            java.lang.Object r0 = r1.b
            ru.ok.messages.calls.views.TextureViewRenderer r0 = (ru.ok.messages.calls.views.TextureViewRenderer) r0
            r0.b()
            r0.requestLayout()
            return
        L_0x01b2:
            java.lang.Object r0 = r1.b
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            o65 r0 = r0.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.x
            r0.performClick()
            r0.jumpDrawablesToCurrentState()
            return
        L_0x01c1:
            java.lang.Object r0 = r1.b
            r4 = r0
            fef r4 = (defpackage.fef) r4
            monitor-enter(r4)
            java.lang.Object r0 = r1.b     // Catch:{ all -> 0x0243 }
            fef r0 = (defpackage.fef) r0     // Catch:{ all -> 0x0243 }
            mdf r5 = r0.c()     // Catch:{ all -> 0x0243 }
            monitor-exit(r4)
            if (r5 == 0) goto L_0x0242
            cef r4 = r5.a
            java.util.logging.Logger r0 = defpackage.fef.i
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r0.isLoggable(r6)
            if (r6 == 0) goto L_0x01ef
            fef r0 = r4.e
            ykb r0 = r0.g
            r0.getClass()
            long r7 = java.lang.System.nanoTime()
            java.lang.String r0 = "starting"
            defpackage.cjf.c(r5, r4, r0)
            goto L_0x01f0
        L_0x01ef:
            r7 = r2
        L_0x01f0:
            java.lang.Object r0 = r1.b     // Catch:{ all -> 0x0217 }
            fef r0 = (defpackage.fef) r0     // Catch:{ all -> 0x0217 }
            defpackage.fef.a(r0, r5)     // Catch:{ all -> 0x0217 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0215 }
            if (r6 == 0) goto L_0x01c1
            fef r0 = r4.e
            ykb r0 = r0.g
            r0.getClass()
            long r9 = java.lang.System.nanoTime()
            long r9 = r9 - r7
            java.lang.String r0 = defpackage.cjf.v(r9)
            java.lang.String r6 = "finished run in "
            java.lang.String r0 = r6.concat(r0)
            defpackage.cjf.c(r5, r4, r0)
            goto L_0x01c1
        L_0x0215:
            r0 = move-exception
            goto L_0x0226
        L_0x0217:
            r0 = move-exception
            java.lang.Object r2 = r1.b     // Catch:{ all -> 0x0215 }
            fef r2 = (defpackage.fef) r2     // Catch:{ all -> 0x0215 }
            ykb r2 = r2.g     // Catch:{ all -> 0x0215 }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x0215 }
            java.util.concurrent.ThreadPoolExecutor r2 = (java.util.concurrent.ThreadPoolExecutor) r2     // Catch:{ all -> 0x0215 }
            r2.execute(r1)     // Catch:{ all -> 0x0215 }
            throw r0     // Catch:{ all -> 0x0215 }
        L_0x0226:
            if (r6 == 0) goto L_0x0241
            fef r1 = r4.e
            ykb r1 = r1.g
            r1.getClass()
            long r1 = java.lang.System.nanoTime()
            long r1 = r1 - r7
            java.lang.String r1 = defpackage.cjf.v(r1)
            java.lang.String r2 = "failed a run in "
            java.lang.String r1 = r2.concat(r1)
            defpackage.cjf.c(r5, r4, r1)
        L_0x0241:
            throw r0
        L_0x0242:
            return
        L_0x0243:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0246:
            java.lang.Object r1 = r1.b
            rdf r1 = (defpackage.rdf) r1
            bolts.Task r1 = r1.a
            r1.trySetResult(r0)
            return
        L_0x0250:
            java.lang.String r0 = ". Dropped: 0. Rendered: 0. Render fps: "
            java.lang.Object r2 = r1.b
            laf r2 = (defpackage.laf) r2
            r2.getClass()
            java.lang.String r3 = "Duration: "
            long r5 = java.lang.System.nanoTime()
            java.lang.Object r7 = r2.x
            monitor-enter(r7)
            long r8 = r2.z     // Catch:{ all -> 0x026e }
            long r8 = r5 - r8
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x0271
            monitor-exit(r7)     // Catch:{ all -> 0x026e }
            goto L_0x02d4
        L_0x026e:
            r0 = move-exception
            goto L_0x02ea
        L_0x0271:
            long r12 = (long) r4     // Catch:{ all -> 0x026e }
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x026e }
            r15 = r5
            r4 = 1
            long r4 = r14.toNanos(r4)     // Catch:{ all -> 0x026e }
            long r12 = r12 * r4
            float r4 = (float) r12     // Catch:{ all -> 0x026e }
            float r5 = (float) r8     // Catch:{ all -> 0x026e }
            float r4 = r4 / r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x026e }
            r5.<init>(r3)     // Catch:{ all -> 0x026e }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x026e }
            long r8 = r3.toMillis(r8)     // Catch:{ all -> 0x026e }
            r5.append(r8)     // Catch:{ all -> 0x026e }
            java.lang.String r3 = " ms. Frames received: "
            r5.append(r3)     // Catch:{ all -> 0x026e }
            int r3 = r2.y     // Catch:{ all -> 0x026e }
            r5.append(r3)     // Catch:{ all -> 0x026e }
            r5.append(r0)     // Catch:{ all -> 0x026e }
            java.text.DecimalFormat r0 = r2.X     // Catch:{ all -> 0x026e }
            double r3 = (double) r4     // Catch:{ all -> 0x026e }
            java.lang.String r0 = r0.format(r3)     // Catch:{ all -> 0x026e }
            r5.append(r0)     // Catch:{ all -> 0x026e }
            java.lang.String r0 = ". Average render time: "
            r5.append(r0)     // Catch:{ all -> 0x026e }
            r0 = 0
            java.lang.String r3 = defpackage.laf.a(r0, r10)     // Catch:{ all -> 0x026e }
            r5.append(r3)     // Catch:{ all -> 0x026e }
            java.lang.String r3 = ". Average swapBuffer time: "
            r5.append(r3)     // Catch:{ all -> 0x026e }
            java.lang.String r3 = defpackage.laf.a(r0, r10)     // Catch:{ all -> 0x026e }
            r5.append(r3)     // Catch:{ all -> 0x026e }
            java.lang.String r0 = "."
            r5.append(r0)     // Catch:{ all -> 0x026e }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x026e }
            r2.b(r0)     // Catch:{ all -> 0x026e }
            java.lang.Object r3 = r2.x     // Catch:{ all -> 0x026e }
            monitor-enter(r3)     // Catch:{ all -> 0x026e }
            r4 = r15
            r2.z = r4     // Catch:{ all -> 0x02e7 }
            r0 = 0
            r2.y = r0     // Catch:{ all -> 0x02e7 }
            monitor-exit(r3)     // Catch:{ all -> 0x02e7 }
            monitor-exit(r7)     // Catch:{ all -> 0x026e }
        L_0x02d4:
            java.lang.Object r0 = r1.b
            laf r0 = (defpackage.laf) r0
            java.lang.Object r2 = r0.b
            monitor-enter(r2)
            java.lang.Object r0 = r1.b     // Catch:{ all -> 0x02e4 }
            laf r0 = (defpackage.laf) r0     // Catch:{ all -> 0x02e4 }
            r0.getClass()     // Catch:{ all -> 0x02e4 }
            monitor-exit(r2)     // Catch:{ all -> 0x02e4 }
            return
        L_0x02e4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02e4 }
            throw r0
        L_0x02e7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02e7 }
            throw r0     // Catch:{ all -> 0x026e }
        L_0x02ea:
            monitor-exit(r7)     // Catch:{ all -> 0x026e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.haf.run():void");
    }

    public haf(fvg fvg, ni0 ni0) {
        this.a = 17;
        this.b = ni0;
    }
}
