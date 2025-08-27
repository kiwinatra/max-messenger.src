package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.arch.Widget;

/* renamed from: uj6  reason: default package */
public final class uj6 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ uj6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        defpackage.ssd.w.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r10.c     // Catch:{ all -> 0x005e }
            ssd r2 = (defpackage.ssd) r2     // Catch:{ all -> 0x005e }
            java.util.ArrayDeque r2 = r2.b     // Catch:{ all -> 0x005e }
            monitor-enter(r2)     // Catch:{ all -> 0x005e }
            r3 = 1
            if (r0 != 0) goto L_0x002c
            java.lang.Object r0 = r10.c     // Catch:{ all -> 0x0020 }
            ssd r0 = (defpackage.ssd) r0     // Catch:{ all -> 0x0020 }
            int r4 = r0.c     // Catch:{ all -> 0x0020 }
            r5 = 4
            if (r4 != r5) goto L_0x0022
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001f
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L_0x001f:
            return
        L_0x0020:
            r10 = move-exception
            goto L_0x0083
        L_0x0022:
            long r6 = r0.o     // Catch:{ all -> 0x0020 }
            r8 = 1
            long r6 = r6 + r8
            r0.o = r6     // Catch:{ all -> 0x0020 }
            r0.c = r5     // Catch:{ all -> 0x0020 }
            r0 = r3
        L_0x002c:
            java.lang.Object r4 = r10.c     // Catch:{ all -> 0x0020 }
            ssd r4 = (defpackage.ssd) r4     // Catch:{ all -> 0x0020 }
            java.util.ArrayDeque r4 = r4.b     // Catch:{ all -> 0x0020 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch:{ all -> 0x0020 }
            r10.b = r4     // Catch:{ all -> 0x0020 }
            if (r4 != 0) goto L_0x004d
            java.lang.Object r10 = r10.c     // Catch:{ all -> 0x0020 }
            ssd r10 = (defpackage.ssd) r10     // Catch:{ all -> 0x0020 }
            r10.c = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x004c
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L_0x004c:
            return
        L_0x004d:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x005e }
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.b     // Catch:{ RuntimeException -> 0x0062 }
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ RuntimeException -> 0x0062 }
            r3.run()     // Catch:{ RuntimeException -> 0x0062 }
        L_0x005b:
            r10.b = r2     // Catch:{ all -> 0x005e }
            goto L_0x0002
        L_0x005e:
            r10 = move-exception
            goto L_0x0085
        L_0x0060:
            r0 = move-exception
            goto L_0x0080
        L_0x0062:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.ssd.w     // Catch:{ all -> 0x0060 }
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r6.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch:{ all -> 0x0060 }
            java.lang.Object r7 = r10.b     // Catch:{ all -> 0x0060 }
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ all -> 0x0060 }
            r6.append(r7)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0060 }
            r4.log(r5, r6, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x005b
        L_0x0080:
            r10.b = r2     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x0083:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r10     // Catch:{ all -> 0x005e }
        L_0x0085:
            if (r1 == 0) goto L_0x008e
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x008e:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj6.a():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r10v0, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r12v0, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r1v72, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x058d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            r0 = 0
            r2 = 1
            r3 = 0
            int r4 = r1.a
            switch(r4) {
                case 0: goto L_0x0566;
                case 1: goto L_0x055a;
                case 2: goto L_0x0531;
                case 3: goto L_0x04f3;
                case 4: goto L_0x0448;
                case 5: goto L_0x041d;
                case 6: goto L_0x0408;
                case 7: goto L_0x03fc;
                case 8: goto L_0x03d7;
                case 9: goto L_0x03c9;
                case 10: goto L_0x0343;
                case 11: goto L_0x0305;
                case 12: goto L_0x02be;
                case 13: goto L_0x029c;
                case 14: goto L_0x0290;
                case 15: goto L_0x0280;
                case 16: goto L_0x0274;
                case 17: goto L_0x0268;
                case 18: goto L_0x023a;
                case 19: goto L_0x0230;
                case 20: goto L_0x01fb;
                case 21: goto L_0x01e3;
                case 22: goto L_0x01a5;
                case 23: goto L_0x0189;
                case 24: goto L_0x013e;
                case 25: goto L_0x010b;
                case 26: goto L_0x00e1;
                case 27: goto L_0x00c2;
                case 28: goto L_0x00aa;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r0 = r1.b
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r1.c
            r1 = r0
            mqg r1 = (defpackage.mqg) r1
            cyd r0 = r1.z0     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.Object r0 = r0.get()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            d08 r0 = (defpackage.d08) r0     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            if (r0 != 0) goto L_0x0043
            h88 r0 = defpackage.h88.x()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r3 = defpackage.mqg.B0     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r4.<init>()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            xpg r5 = r1.v     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r5 = r5.c     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r4.append(r5)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r5 = " returned a null result. Treating it as a failure."
            r4.append(r5)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r4 = r4.toString()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r0.t(r3, r4)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            goto L_0x006b
        L_0x003d:
            r0 = move-exception
            goto L_0x00a6
        L_0x003f:
            r0 = move-exception
            goto L_0x006f
        L_0x0041:
            r0 = move-exception
            goto L_0x008a
        L_0x0043:
            h88 r3 = defpackage.h88.x()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r4 = defpackage.mqg.B0     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r5.<init>()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            xpg r6 = r1.v     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r6 = r6.c     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r5.append(r6)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r6 = " returned a "
            r5.append(r6)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r5.append(r0)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r6 = "."
            r5.append(r6)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            java.lang.String r5 = r5.toString()     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r3.p(r4, r5)     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
            r1.y = r0     // Catch:{ CancellationException -> 0x0041, InterruptedException | ExecutionException -> 0x003f }
        L_0x006b:
            r1.b()
            goto L_0x00a5
        L_0x006f:
            h88 r3 = defpackage.h88.x()     // Catch:{ all -> 0x003d }
            java.lang.String r4 = defpackage.mqg.B0     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r5.<init>()     // Catch:{ all -> 0x003d }
            r5.append(r2)     // Catch:{ all -> 0x003d }
            java.lang.String r2 = " failed because it threw an exception/error"
            r5.append(r2)     // Catch:{ all -> 0x003d }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x003d }
            r3.u(r4, r2, r0)     // Catch:{ all -> 0x003d }
            goto L_0x006b
        L_0x008a:
            h88 r3 = defpackage.h88.x()     // Catch:{ all -> 0x003d }
            java.lang.String r4 = defpackage.mqg.B0     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r4.<init>()     // Catch:{ all -> 0x003d }
            r4.append(r2)     // Catch:{ all -> 0x003d }
            java.lang.String r2 = " was cancelled"
            r4.append(r2)     // Catch:{ all -> 0x003d }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x003d }
            r3.H(r2, r0)     // Catch:{ all -> 0x003d }
            goto L_0x006b
        L_0x00a5:
            return
        L_0x00a6:
            r1.b()
            throw r0
        L_0x00aa:
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x00b9 }
            androidx.work.Worker r0 = (androidx.work.Worker) r0     // Catch:{ all -> 0x00b9 }
            r0.getClass()     // Catch:{ all -> 0x00b9 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`"
            r0.<init>(r2)     // Catch:{ all -> 0x00b9 }
            throw r0     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r0 = move-exception
            java.lang.Object r1 = r1.b
            cyd r1 = (defpackage.cyd) r1
            r1.k(r0)
            return
        L_0x00c2:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.videomsg.VideoMessageWidget.X
            java.lang.Object r0 = r1.b
            one.me.chatscreen.videomsg.VideoMessageWidget r0 = (one.me.chatscreen.videomsg.VideoMessageWidget) r0
            r0.getClass()
            kotlin.reflect.KProperty[] r3 = one.me.chatscreen.videomsg.VideoMessageWidget.X
            r2 = r3[r2]
            kotlin.properties.ReadOnlyProperty r3 = r0.o
            java.lang.Object r0 = r3.getValue(r0, r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.Object r1 = r1.c
            r6g r1 = (defpackage.r6g) r1
            boolean r1 = r1.a
            r0.setClickable(r1)
            return
        L_0x00e1:
            java.lang.Object r0 = r1.c
            vif r0 = (defpackage.vif) r0
            wif r0 = r0.c
            java.lang.Object r1 = r1.b
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            zi0 r2 = (defpackage.zi0) r2
            java.lang.Object r1 = r1.second
            yvb r1 = (defpackage.yvb) r1
            r0.getClass()
            r4 = r1
            ik0 r4 = (defpackage.ik0) r4
            bwb r4 = r4.c
            java.lang.String r5 = "ThrottlingProducer"
            r4.a(r1, r5, r3)
            vif r3 = new vif
            r3.<init>(r0, r2)
            xvb r0 = r0.a
            r0.a(r3, r1)
            return
        L_0x010b:
            java.lang.Object r0 = r1.b
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r0
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            if (r3 == 0) goto L_0x0136
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            kotlin.reflect.KProperty[] r4 = one.me.stickersshowcase.StickersShowcaseScreen.Y
            java.lang.Object r1 = r1.c
            one.me.stickersshowcase.StickersShowcaseScreen r1 = (one.me.stickersshowcase.StickersShowcaseScreen) r1
            r1.getClass()
            kotlin.reflect.KProperty[] r4 = one.me.stickersshowcase.StickersShowcaseScreen.Y
            r2 = r4[r2]
            kotlin.properties.ReadOnlyProperty r4 = r1.v
            java.lang.Object r1 = r4.getValue(r1, r2)
            h3b r1 = (defpackage.h3b) r1
            int r1 = r1.getMeasuredHeight()
            r3.topMargin = r1
            r0.setLayoutParams(r3)
            return
        L_0x0136:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x013e:
            kotlin.reflect.KProperty[] r2 = one.me.stickerssettings.stickersscreen.StickersScreen.Y
            java.lang.Object r2 = r1.c
            one.me.stickerssettings.stickersscreen.StickersScreen r2 = (one.me.stickerssettings.stickersscreen.StickersScreen) r2
            androidx.recyclerview.widget.RecyclerView r2 = r2.c0()
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            if (r4 == 0) goto L_0x0181
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            java.lang.Object r1 = r1.b
            android.view.View r1 = (android.view.View) r1
            int r5 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x0163
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x0164
        L_0x0163:
            r6 = r3
        L_0x0164:
            if (r6 == 0) goto L_0x0169
            int r6 = r6.bottomMargin
            goto L_0x016a
        L_0x0169:
            r6 = r0
        L_0x016a:
            int r5 = r5 + r6
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r6 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0176
            r3 = r1
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
        L_0x0176:
            if (r3 == 0) goto L_0x017a
            int r0 = r3.topMargin
        L_0x017a:
            int r5 = r5 + r0
            r4.bottomMargin = r5
            r2.setLayoutParams(r4)
            return
        L_0x0181:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x0189:
            java.lang.Object r0 = r1.c
            one.me.stickerspreview.set.StickerSetBottomSheet r0 = (one.me.stickerspreview.set.StickerSetBottomSheet) r0
            int r0 = one.me.stickerspreview.set.StickerSetBottomSheet.n0(r0)
            java.lang.Object r1 = r1.b
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            int r2 = r1.getPaddingLeft()
            int r3 = r1.getPaddingTop()
            int r4 = r1.getPaddingRight()
            r1.setPadding(r2, r3, r4, r0)
            return
        L_0x01a5:
            java.lang.Object r4 = r1.b
            java.util.List r4 = (java.util.List) r4
            int r5 = r4.size()
            r6 = r0
        L_0x01ae:
            if (r6 >= r5) goto L_0x01e2
            java.lang.Object r7 = r4.get(r6)
            android.view.View r7 = (android.view.View) r7
            java.util.WeakHashMap r8 = defpackage.gag.a
            java.lang.String r8 = defpackage.v9g.k(r7)
            if (r8 == 0) goto L_0x01e0
            java.lang.Object r9 = r1.c
            j6e r9 = (defpackage.j6e) r9
            ts r9 = r9.x
            int r10 = r9.c
            r11 = r0
        L_0x01c7:
            if (r11 >= r10) goto L_0x01dc
            java.lang.Object r12 = r9.i(r11)
            boolean r12 = r8.equals(r12)
            if (r12 == 0) goto L_0x01da
            java.lang.Object r8 = r9.f(r11)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x01dd
        L_0x01da:
            int r11 = r11 + r2
            goto L_0x01c7
        L_0x01dc:
            r8 = r3
        L_0x01dd:
            defpackage.v9g.v(r7, r8)
        L_0x01e0:
            int r6 = r6 + r2
            goto L_0x01ae
        L_0x01e2:
            return
        L_0x01e3:
            r17.a()     // Catch:{ Error -> 0x01e7 }
            return
        L_0x01e7:
            r0 = move-exception
            r3 = r0
            java.lang.Object r0 = r1.c
            ssd r0 = (defpackage.ssd) r0
            java.util.ArrayDeque r4 = r0.b
            monitor-enter(r4)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x01f8 }
            ssd r0 = (defpackage.ssd) r0     // Catch:{ all -> 0x01f8 }
            r0.c = r2     // Catch:{ all -> 0x01f8 }
            monitor-exit(r4)     // Catch:{ all -> 0x01f8 }
            throw r3
        L_0x01f8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01f8 }
            throw r0
        L_0x01fb:
            java.lang.Object r0 = r1.b
            r2 = r0
            kw1 r2 = (defpackage.kw1) r2
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0212 }
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x0212 }
            zz7 r0 = (defpackage.zz7) r0     // Catch:{ all -> 0x0212 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0212 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0212 }
            r2.resumeWith(r0)     // Catch:{ all -> 0x0212 }
            goto L_0x022f
        L_0x0212:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 != 0) goto L_0x021a
            r1 = r0
        L_0x021a:
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x0222
            r2.q(r1)
            goto L_0x022f
        L_0x0222:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
            r2.resumeWith(r0)
        L_0x022f:
            return
        L_0x0230:
            java.lang.Object r0 = r1.b
            tk3 r0 = (defpackage.tk3) r0
            java.lang.Object r1 = r1.c
            r0.accept(r1)
            return
        L_0x023a:
            kotlin.reflect.KProperty[] r0 = one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.v0
            java.lang.Object r0 = r1.c
            one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget r0 = (one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget) r0
            r0.getClass()
            kotlin.reflect.KProperty[] r2 = one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget.v0
            r3 = 4
            r2 = r2[r3]
            kotlin.properties.ReadOnlyProperty r3 = r0.z
            java.lang.Object r0 = r3.getValue(r0, r2)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.Object r1 = r1.b
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getMeasuredHeight()
            int r2 = r0.getPaddingLeft()
            int r3 = r0.getPaddingRight()
            int r4 = r0.getPaddingBottom()
            r0.setPadding(r2, r1, r3, r4)
            return
        L_0x0268:
            java.lang.Object r0 = r1.b
            e1b r0 = (defpackage.e1b) r0
            java.lang.Object r1 = r1.c
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.removeCallbacks(r1)
            return
        L_0x0274:
            java.lang.Object r0 = r1.b
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r0
            java.lang.Object r1 = r1.c
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            defpackage.uj6.super.invalidateDrawable(r1)
            return
        L_0x0280:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r1.b
            vpd r2 = (defpackage.vpd) r2
            upd r2 = (defpackage.upd) r2
            java.lang.Object r1 = r1.c
            xma r1 = (defpackage.xma) r1
            r2.g(r1, r0)
            return
        L_0x0290:
            java.lang.Object r0 = r1.c
            dia r0 = (defpackage.dia) r0
            cla r0 = r0.a
            java.lang.Object r1 = r1.b
            r0.d(r1)
            return
        L_0x029c:
            java.lang.Object r2 = r1.b
            um8 r2 = (defpackage.um8) r2
            vm8 r2 = (defpackage.vm8) r2
            android.os.Messenger r2 = r2.a
            android.os.IBinder r2 = r2.getBinder()
            java.lang.Object r1 = r1.c
            er7 r1 = (defpackage.er7) r1
            java.lang.Object r1 = r1.b
            sy8 r1 = (defpackage.sy8) r1
            ts r1 = r1.v
            java.lang.Object r1 = r1.remove(r2)
            mm8 r1 = (defpackage.mm8) r1
            if (r1 == 0) goto L_0x02bd
            r2.unlinkToDeath(r1, r0)
        L_0x02bd:
            return
        L_0x02be:
            java.lang.Object r0 = r1.c
            f0 r0 = (defpackage.f0) r0
            java.lang.Object r2 = r0.a
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r3 = r2.isEmpty()
            java.lang.Object r1 = r1.b
            ox8 r1 = (defpackage.ox8) r1
            if (r3 != 0) goto L_0x02f3
            h67 r3 = r1.a()
            if (r3 == 0) goto L_0x02f0
            java.util.Iterator r4 = r2.iterator()
        L_0x02da:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02f0
            java.lang.Object r5 = r4.next()
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r6 = "extra_session_binder"
            android.os.IBinder r7 = r3.asBinder()
            r5.putBinder(r6, r7)
            goto L_0x02da
        L_0x02f0:
            r2.clear()
        L_0x02f3:
            java.lang.Object r0 = r0.b
            om8 r0 = (defpackage.om8) r0
            r0.getClass()
            java.lang.Object r1 = r1.b
            android.media.session.MediaSession$Token r1 = (android.media.session.MediaSession.Token) r1
            r1.getClass()
            r0.setSessionToken(r1)
            return
        L_0x0305:
            java.lang.Object r0 = r1.c
            a18 r0 = (defpackage.a18) r0
            java.lang.Object r2 = r0.c
            monitor-enter(r2)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x032a }
            a18 r0 = (defpackage.a18) r0     // Catch:{ all -> 0x032a }
            bj6 r0 = r0.o     // Catch:{ all -> 0x032a }
            java.lang.Object r3 = r1.b     // Catch:{ all -> 0x032a }
            java.lang.Object r0 = r0.apply(r3)     // Catch:{ all -> 0x032a }
            java.lang.Object r3 = r1.c     // Catch:{ all -> 0x032a }
            a18 r3 = (defpackage.a18) r3     // Catch:{ all -> 0x032a }
            java.lang.Object r4 = r3.a     // Catch:{ all -> 0x032a }
            if (r4 != 0) goto L_0x032c
            if (r0 == 0) goto L_0x032c
            r3.a = r0     // Catch:{ all -> 0x032a }
            q29 r1 = r3.v     // Catch:{ all -> 0x032a }
            r1.i(r0)     // Catch:{ all -> 0x032a }
            goto L_0x033f
        L_0x032a:
            r0 = move-exception
            goto L_0x0341
        L_0x032c:
            if (r4 == 0) goto L_0x033f
            boolean r3 = r4.equals(r0)     // Catch:{ all -> 0x032a }
            if (r3 != 0) goto L_0x033f
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x032a }
            a18 r1 = (defpackage.a18) r1     // Catch:{ all -> 0x032a }
            r1.a = r0     // Catch:{ all -> 0x032a }
            q29 r1 = r1.v     // Catch:{ all -> 0x032a }
            r1.i(r0)     // Catch:{ all -> 0x032a }
        L_0x033f:
            monitor-exit(r2)     // Catch:{ all -> 0x032a }
            return
        L_0x0341:
            monitor-exit(r2)     // Catch:{ all -> 0x032a }
            throw r0
        L_0x0343:
            java.lang.Object r0 = r1.b
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0389
            java.lang.String r2 = "evgeniiJsEvaluatorException"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x0389
            java.lang.Object r0 = r1.c
            nrg r0 = (defpackage.nrg) r0
            java.lang.Object r1 = r1.b
            java.lang.String r1 = (java.lang.String) r1
            r2 = 27
            r1.substring(r2)
            ij3 r1 = r0.a
            java.lang.Object r0 = r1.o
            org r0 = (defpackage.org) r0
            java.util.concurrent.locks.ReentrantLock r0 = r0.e
            r0.lock()
            java.lang.String r0 = defpackage.org.g     // Catch:{ all -> 0x037e }
            java.lang.Object r0 = r1.o     // Catch:{ all -> 0x037e }
            org r0 = (defpackage.org) r0     // Catch:{ all -> 0x037e }
            java.util.concurrent.locks.Condition r0 = r0.f     // Catch:{ all -> 0x037e }
            r0.signal()     // Catch:{ all -> 0x037e }
            java.lang.Object r0 = r1.o
            org r0 = (defpackage.org) r0
            java.util.concurrent.locks.ReentrantLock r0 = r0.e
            r0.unlock()
            goto L_0x03bb
        L_0x037e:
            r0 = move-exception
            java.lang.Object r1 = r1.o
            org r1 = (defpackage.org) r1
            java.util.concurrent.locks.ReentrantLock r1 = r1.e
            r1.unlock()
            throw r0
        L_0x0389:
            java.lang.Object r0 = r1.c
            r2 = r0
            nrg r2 = (defpackage.nrg) r2
            java.lang.Object r0 = r1.b
            java.lang.String r0 = (java.lang.String) r0
            ij3 r1 = r2.a
            java.lang.Object r1 = r1.o
            org r1 = (defpackage.org) r1
            java.util.concurrent.locks.ReentrantLock r1 = r1.e
            r1.lock()
            ij3 r1 = r2.a     // Catch:{ all -> 0x03bc }
            java.lang.Object r1 = r1.o     // Catch:{ all -> 0x03bc }
            org r1 = (defpackage.org) r1     // Catch:{ all -> 0x03bc }
            r1.d = r0     // Catch:{ all -> 0x03bc }
            ij3 r0 = r2.a     // Catch:{ all -> 0x03bc }
            java.lang.Object r0 = r0.o     // Catch:{ all -> 0x03bc }
            org r0 = (defpackage.org) r0     // Catch:{ all -> 0x03bc }
            java.util.concurrent.locks.Condition r0 = r0.f     // Catch:{ all -> 0x03bc }
            r0.signal()     // Catch:{ all -> 0x03bc }
            ij3 r0 = r2.a
            java.lang.Object r0 = r0.o
            org r0 = (defpackage.org) r0
            java.util.concurrent.locks.ReentrantLock r0 = r0.e
            r0.unlock()
        L_0x03bb:
            return
        L_0x03bc:
            r0 = move-exception
            ij3 r1 = r2.a
            java.lang.Object r1 = r1.o
            org r1 = (defpackage.org) r1
            java.util.concurrent.locks.ReentrantLock r1 = r1.e
            r1.unlock()
            throw r0
        L_0x03c9:
            java.lang.Object r0 = r1.c
            bw6 r0 = (defpackage.bw6) r0
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.b
            kw1 r1 = (defpackage.kw1) r1
            r1.i(r0, r2)
            return
        L_0x03d7:
            java.lang.Object r0 = r1.c
            o9e r0 = (defpackage.o9e) r0
            voc r2 = r0.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "<!> send retry -> "
            r3.<init>(r4)
            java.lang.Object r1 = r1.b
            r54 r1 = (defpackage.r54) r1
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "OKSignaling"
            r2.log(r4, r3)
            meg r0 = r0.g
            java.lang.String r1 = r1.a
            r0.f(r1)
            return
        L_0x03fc:
            java.lang.Object r0 = r1.b
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r1 = r1.c
            bq5 r1 = (defpackage.bq5) r1
            defpackage.wgf.c(r0, r1)
            return
        L_0x0408:
            java.lang.Object r0 = r1.b
            z95 r0 = (defpackage.z95) r0
            mw1 r2 = r0.b
            java.lang.Object r1 = r1.c
            ea5 r1 = (defpackage.ea5) r1
            mq4 r0 = r1.c(r0)
            r2.getClass()
            defpackage.qq4.c(r2, r0)
            return
        L_0x041d:
            h88 r0 = defpackage.h88.x()
            java.lang.String r2 = defpackage.gl4.d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Scheduling work "
            r3.<init>(r4)
            java.lang.Object r4 = r1.b
            xpg r4 = (defpackage.xpg) r4
            java.lang.String r5 = r4.a
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.p(r2, r3)
            java.lang.Object r0 = r1.c
            gl4 r0 = (defpackage.gl4) r0
            iu6 r0 = r0.a
            xpg[] r1 = new defpackage.xpg[]{r4}
            r0.e(r1)
            return
        L_0x0448:
            java.lang.Object r0 = r1.b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x0450:
            boolean r4 = r2.hasNext()
            java.lang.Object r5 = r1.c
            mg4 r5 = (defpackage.mg4) r5
            if (r4 == 0) goto L_0x04ea
            java.lang.Object r4 = r2.next()
            kg4 r4 = (defpackage.kg4) r4
            r5.getClass()
            pzc r6 = r4.a
            if (r6 != 0) goto L_0x0469
            r10 = r3
            goto L_0x046c
        L_0x0469:
            android.view.View r6 = r6.a
            r10 = r6
        L_0x046c:
            pzc r6 = r4.b
            if (r6 == 0) goto L_0x0474
            android.view.View r6 = r6.a
            r12 = r6
            goto L_0x0475
        L_0x0474:
            r12 = r3
        L_0x0475:
            java.util.ArrayList r13 = r5.r
            r14 = 0
            if (r10 == 0) goto L_0x04b5
            android.view.ViewPropertyAnimator r6 = r10.animate()
            long r7 = r5.l()
            android.view.ViewPropertyAnimator r9 = r6.setDuration(r7)
            pzc r6 = r4.a
            r13.add(r6)
            int r6 = r4.e
            int r7 = r4.c
            int r6 = r6 - r7
            float r6 = (float) r6
            r9.translationX(r6)
            int r6 = r4.f
            int r7 = r4.d
            int r6 = r6 - r7
            float r6 = (float) r6
            r9.translationY(r6)
            android.view.ViewPropertyAnimator r15 = r9.alpha(r14)
            jg4 r11 = new jg4
            r16 = 0
            r6 = r11
            r7 = r5
            r8 = r4
            r3 = r11
            r11 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            android.view.ViewPropertyAnimator r3 = r15.setListener(r3)
            r3.start()
        L_0x04b5:
            if (r12 == 0) goto L_0x04e7
            android.view.ViewPropertyAnimator r9 = r12.animate()
            pzc r3 = r4.b
            r13.add(r3)
            android.view.ViewPropertyAnimator r3 = r9.translationX(r14)
            android.view.ViewPropertyAnimator r3 = r3.translationY(r14)
            long r6 = r5.l()
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r3 = r3.alpha(r6)
            jg4 r13 = new jg4
            r11 = 1
            r6 = r13
            r7 = r5
            r8 = r4
            r10 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            android.view.ViewPropertyAnimator r3 = r3.setListener(r13)
            r3.start()
        L_0x04e7:
            r3 = 0
            goto L_0x0450
        L_0x04ea:
            r0.clear()
            java.util.ArrayList r1 = r5.n
            r1.remove(r0)
            return
        L_0x04f3:
            java.lang.Object r2 = r1.c     // Catch:{ CancellationException -> 0x051a, ExecutionException -> 0x0509 }
            cz1 r2 = (defpackage.cz1) r2     // Catch:{ CancellationException -> 0x051a, ExecutionException -> 0x0509 }
            java.lang.Object r3 = r1.b     // Catch:{ CancellationException -> 0x051a, ExecutionException -> 0x0509 }
            zz7 r3 = (defpackage.zz7) r3     // Catch:{ CancellationException -> 0x051a, ExecutionException -> 0x0509 }
            java.lang.Object r3 = defpackage.hd8.A(r3)     // Catch:{ CancellationException -> 0x051a, ExecutionException -> 0x0509 }
            do1 r2 = r2.b     // Catch:{ CancellationException -> 0x051a, ExecutionException -> 0x0509 }
            if (r2 == 0) goto L_0x0521
            r2.b(r3)     // Catch:{ CancellationException -> 0x051a, ExecutionException -> 0x0509 }
            goto L_0x0521
        L_0x0507:
            r0 = move-exception
            goto L_0x0529
        L_0x0509:
            r0 = move-exception
            java.lang.Object r2 = r1.c     // Catch:{ all -> 0x0507 }
            cz1 r2 = (defpackage.cz1) r2     // Catch:{ all -> 0x0507 }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x0507 }
            do1 r2 = r2.b     // Catch:{ all -> 0x0507 }
            if (r2 == 0) goto L_0x0521
            r2.d(r0)     // Catch:{ all -> 0x0507 }
            goto L_0x0521
        L_0x051a:
            java.lang.Object r2 = r1.c     // Catch:{ all -> 0x0507 }
            cz1 r2 = (defpackage.cz1) r2     // Catch:{ all -> 0x0507 }
            r2.cancel(r0)     // Catch:{ all -> 0x0507 }
        L_0x0521:
            java.lang.Object r0 = r1.c
            cz1 r0 = (defpackage.cz1) r0
            r1 = 0
            r0.x = r1
            return
        L_0x0529:
            java.lang.Object r1 = r1.c
            cz1 r1 = (defpackage.cz1) r1
            r2 = 0
            r1.x = r2
            throw r0
        L_0x0531:
            java.lang.Object r0 = r1.c
            nv r0 = (defpackage.nv) r0
            ov r2 = r0.v
            int r3 = r2.g
            int r4 = r0.c
            if (r3 != r4) goto L_0x0559
            java.util.List r3 = r2.f
            java.util.List r4 = r0.b
            r2.e = r4
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            r2.f = r4
            java.lang.Object r1 = r1.b
            mo4 r1 = (defpackage.mo4) r1
            vz7 r4 = r2.a
            y35 r4 = (defpackage.y35) r4
            r1.a(r4)
            java.lang.Runnable r0 = r0.o
            r2.a(r3, r0)
        L_0x0559:
            return
        L_0x055a:
            java.lang.Object r0 = r1.b
            r74 r0 = (defpackage.r74) r0
            java.lang.Object r1 = r1.c
            i0 r1 = (defpackage.i0) r1
            r0.b(r1)
            return
        L_0x0566:
            r2 = r3
            java.lang.Object r0 = r1.b
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            boolean r3 = r0 instanceof defpackage.zi7
            java.lang.Object r1 = r1.c
            mj6 r1 = (defpackage.mj6) r1
            if (r3 == 0) goto L_0x0591
            r3 = r0
            zi7 r3 = (defpackage.zi7) r3
            n1 r3 = (defpackage.n1) r3
            r3.getClass()
            boolean r4 = r3 instanceof defpackage.g1
            if (r4 == 0) goto L_0x058a
            java.lang.Object r3 = r3.a
            boolean r4 = r3 instanceof defpackage.w0
            if (r4 == 0) goto L_0x058a
            w0 r3 = (defpackage.w0) r3
            java.lang.Throwable r3 = r3.a
            goto L_0x058b
        L_0x058a:
            r3 = r2
        L_0x058b:
            if (r3 == 0) goto L_0x0591
            r1.g(r3)
            goto L_0x05a8
        L_0x0591:
            java.lang.Object r0 = defpackage.o5a.p(r0)     // Catch:{ ExecutionException -> 0x059f, all -> 0x0599 }
            r1.a(r0)
            goto L_0x05a8
        L_0x0599:
            r0 = move-exception
            r2 = r0
            r1.g(r2)
            goto L_0x05a8
        L_0x059f:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r0 = r2.getCause()
            r1.g(r0)
        L_0x05a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj6.run():void");
    }

    public String toString() {
        switch (this.a) {
            case 0:
                g6d g6d = new g6d(uj6.class.getSimpleName());
                ox0 ox0 = new ox0(17, false);
                ((ox0) g6d.o).b = ox0;
                g6d.o = ox0;
                ox0.c = (mj6) this.c;
                return g6d.toString();
            case 21:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((ssd) this.c).c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ uj6(ViewGroup viewGroup, RecyclerView recyclerView, Widget widget, int i) {
        this.a = i;
        this.b = recyclerView;
        this.c = widget;
    }

    public /* synthetic */ uj6(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public uj6(ssd ssd) {
        this.a = 21;
        this.c = ssd;
    }
}
