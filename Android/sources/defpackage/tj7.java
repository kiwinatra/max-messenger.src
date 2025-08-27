package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.view.View;
import androidx.preference.PreferenceGroup;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;

/* renamed from: tj7  reason: default package */
public final class tj7 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ tj7(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b() {
        synchronized (this) {
            ((PreferenceGroup) this.b).W0.clear();
        }
    }

    private final void c() {
        try {
            d();
        } catch (Error e) {
            synchronized (((tsd) this.b).a) {
                ((tsd) this.b).o = 1;
                throw e;
            }
        }
    }

    public Set a() {
        Set createSetBuilder = SetsKt.createSetBuilder();
        Cursor o = ((uj7) this.b).a.o(new er4("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), (CancellationSignal) null);
        while (o.moveToNext()) {
            try {
                createSetBuilder.add(Integer.valueOf(o.getInt(0)));
            } catch (Throwable th) {
                CloseableKt.closeFinally(o, th);
                throw th;
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(o, (Throwable) null);
        Set build = SetsKt.build(createSetBuilder);
        if (!build.isEmpty()) {
            if (((uj7) this.b).h != null) {
                gf6 gf6 = ((uj7) this.b).h;
                if (gf6 != null) {
                    gf6.n();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return build;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r10.b     // Catch:{ all -> 0x0055 }
            tsd r2 = (defpackage.tsd) r2     // Catch:{ all -> 0x0055 }
            java.util.ArrayDeque r2 = r2.a     // Catch:{ all -> 0x0055 }
            monitor-enter(r2)     // Catch:{ all -> 0x0055 }
            r3 = 1
            if (r0 != 0) goto L_0x002c
            java.lang.Object r0 = r10.b     // Catch:{ all -> 0x0020 }
            tsd r0 = (defpackage.tsd) r0     // Catch:{ all -> 0x0020 }
            int r4 = r0.o     // Catch:{ all -> 0x0020 }
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
            goto L_0x005b
        L_0x0022:
            long r6 = r0.v     // Catch:{ all -> 0x0020 }
            r8 = 1
            long r6 = r6 + r8
            r0.v = r6     // Catch:{ all -> 0x0020 }
            r0.o = r5     // Catch:{ all -> 0x0020 }
            r0 = r3
        L_0x002c:
            java.lang.Object r4 = r10.b     // Catch:{ all -> 0x0020 }
            tsd r4 = (defpackage.tsd) r4     // Catch:{ all -> 0x0020 }
            java.util.ArrayDeque r4 = r4.a     // Catch:{ all -> 0x0020 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch:{ all -> 0x0020 }
            if (r4 != 0) goto L_0x004b
            java.lang.Object r10 = r10.b     // Catch:{ all -> 0x0020 }
            tsd r10 = (defpackage.tsd) r10     // Catch:{ all -> 0x0020 }
            r10.o = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x004a
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L_0x004a:
            return
        L_0x004b:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0055 }
            r1 = r1 | r2
            r4.run()     // Catch:{ RuntimeException -> 0x0057 }
            goto L_0x0002
        L_0x0055:
            r10 = move-exception
            goto L_0x005d
        L_0x0057:
            r4.toString()     // Catch:{ all -> 0x0055 }
            goto L_0x0002
        L_0x005b:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r10     // Catch:{ all -> 0x0055 }
        L_0x005d:
            if (r1 == 0) goto L_0x0066
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0066:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj7.d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x027e, code lost:
        if (r11 < 0) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02a1, code lost:
        if (r11 > 0) goto L_0x02a5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:174:0x03d4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            int r3 = r15.a
            switch(r3) {
                case 0: goto L_0x0368;
                case 1: goto L_0x0348;
                case 2: goto L_0x022b;
                case 3: goto L_0x0207;
                case 4: goto L_0x01fe;
                case 5: goto L_0x01dd;
                case 6: goto L_0x01d5;
                case 7: goto L_0x01cd;
                case 8: goto L_0x01b4;
                case 9: goto L_0x0198;
                case 10: goto L_0x0180;
                case 11: goto L_0x0178;
                case 12: goto L_0x0161;
                case 13: goto L_0x012f;
                case 14: goto L_0x0119;
                case 15: goto L_0x010f;
                case 16: goto L_0x0105;
                case 17: goto L_0x00fd;
                case 18: goto L_0x00b0;
                case 19: goto L_0x00a6;
                case 20: goto L_0x00a2;
                case 21: goto L_0x009a;
                case 22: goto L_0x0092;
                case 23: goto L_0x008a;
                case 24: goto L_0x0080;
                case 25: goto L_0x0066;
                case 26: goto L_0x0062;
                case 27: goto L_0x0041;
                case 28: goto L_0x0039;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r15 = r15.b
            ru.ok.messages.stickers.widgets.StickerView r15 = (ru.ok.messages.stickers.widgets.StickerView) r15
            com.facebook.drawee.view.SimpleDraweeView r15 = r15.z
            lv4 r15 = r15.getHierarchy()
            sp6 r15 = (defpackage.sp6) r15
            int r0 = defpackage.sad.b
            ydd r3 = defpackage.ydd.n
            android.content.res.Resources r4 = r15.b
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            r15.i(r0, r2)
            vdd r15 = r15.f(r2)
            xdd r0 = r15.v
            boolean r0 = defpackage.hsg.k(r0, r3)
            if (r0 == 0) goto L_0x002e
            goto L_0x0038
        L_0x002e:
            r15.v = r3
            r15.w = r1
            r15.p()
            r15.invalidateSelf()
        L_0x0038:
            return
        L_0x0039:
            java.lang.Object r15 = r15.b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r15 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r15
            r15.L0()
            return
        L_0x0041:
            java.lang.Object r15 = r15.b
            lee r15 = (defpackage.lee) r15
            boolean r0 = r15.y
            if (r0 != 0) goto L_0x004a
            goto L_0x0061
        L_0x004a:
            float r0 = r15.z
            r1 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r0 + r1
            r15.z = r0
            r15.invalidateSelf()
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 3
            long r0 = r0 + r2
            tj7 r2 = r15.x
            r15.scheduleSelf(r2, r0)
        L_0x0061:
            return
        L_0x0062:
            r15.c()
            return
        L_0x0066:
            java.lang.Object r15 = r15.b
            androidx.appcompat.widget.SearchView$SearchAutoComplete r15 = (androidx.appcompat.widget.SearchView$SearchAutoComplete) r15
            boolean r1 = r15.x
            if (r1 == 0) goto L_0x007f
            android.content.Context r1 = r15.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r1.showSoftInput(r15, r0)
            r15.x = r0
        L_0x007f:
            return
        L_0x0080:
            java.lang.Object r15 = r15.b
            e9d r15 = (defpackage.e9d) r15
            r15.g = r2
            r15.A()
            return
        L_0x008a:
            java.lang.Object r15 = r15.b
            cy3 r15 = (defpackage.cy3) r15
            r15.q()
            return
        L_0x0092:
            java.lang.Object r15 = r15.b
            yrc r15 = (defpackage.yrc) r15
            r15.g(r2)
            return
        L_0x009a:
            java.lang.Object r15 = r15.b
            btb r15 = (defpackage.btb) r15
            r15.J()
            return
        L_0x00a2:
            r15.b()
            return
        L_0x00a6:
            java.lang.Object r15 = r15.b
            androidx.preference.PreferenceFragmentCompat r15 = (androidx.preference.PreferenceFragmentCompat) r15
            androidx.recyclerview.widget.RecyclerView r15 = r15.n1
            r15.focusableViewAvailable(r15)
            return
        L_0x00b0:
            java.lang.Object r2 = r15.b
            csb r2 = (defpackage.csb) r2
            monitor-enter(r2)
            java.lang.Object r3 = r15.b     // Catch:{ all -> 0x00fa }
            csb r3 = (defpackage.csb) r3     // Catch:{ all -> 0x00fa }
            y33 r4 = r3.g     // Catch:{ all -> 0x00fa }
            int r5 = r3.h     // Catch:{ all -> 0x00fa }
            r3.g = r1     // Catch:{ all -> 0x00fa }
            r3.i = r0     // Catch:{ all -> 0x00fa }
            monitor-exit(r2)     // Catch:{ all -> 0x00fa }
            boolean r1 = defpackage.y33.m0(r4)
            if (r1 == 0) goto L_0x00d8
            java.lang.Object r1 = r15.b     // Catch:{ all -> 0x00d3 }
            csb r1 = (defpackage.csb) r1     // Catch:{ all -> 0x00d3 }
            defpackage.csb.m(r1, r4, r5)     // Catch:{ all -> 0x00d3 }
            defpackage.y33.U(r4)
            goto L_0x00d8
        L_0x00d3:
            r15 = move-exception
            defpackage.y33.U(r4)
            throw r15
        L_0x00d8:
            java.lang.Object r15 = r15.b
            csb r15 = (defpackage.csb) r15
            monitor-enter(r15)
            r15.j = r0     // Catch:{ all -> 0x00f7 }
            boolean r0 = r15.q()     // Catch:{ all -> 0x00f7 }
            monitor-exit(r15)     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00f6
            u6a r0 = r15.k
            java.lang.Object r0 = r0.d
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            tj7 r1 = new tj7
            r2 = 18
            r1.<init>(r2, r15)
            r0.execute(r1)
        L_0x00f6:
            return
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00f7 }
            throw r0
        L_0x00fa:
            r15 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00fa }
            throw r15
        L_0x00fd:
            java.lang.Object r15 = r15.b
            f6f r15 = (defpackage.f6f) r15
            r15.d()
            return
        L_0x0105:
            kotlin.reflect.KProperty[] r0 = one.me.sdk.uikit.common.button.OneMeButton.z0
            java.lang.Object r15 = r15.b
            one.me.sdk.uikit.common.button.OneMeButton r15 = (one.me.sdk.uikit.common.button.OneMeButton) r15
            r15.j()
            return
        L_0x010f:
            java.lang.Object r15 = r15.b
            bla r15 = (defpackage.bla) r15
            mq4 r15 = r15.c
            r15.dispose()
            return
        L_0x0119:
            java.lang.Object r15 = r15.b
            dia r15 = (defpackage.dia) r15
            cla r0 = r15.a     // Catch:{ all -> 0x0128 }
            r0.b()     // Catch:{ all -> 0x0128 }
            jfd r15 = r15.o
            r15.dispose()
            return
        L_0x0128:
            r0 = move-exception
            jfd r15 = r15.o
            r15.dispose()
            throw r0
        L_0x012f:
            java.lang.Object r15 = r15.b
            gk9 r15 = (defpackage.gk9) r15
            kotlin.jvm.functions.Function0 r0 = r15.b
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0160
            vi9 r0 = defpackage.vi9.a
            q4 r0 = r0.getAccessor()
            java.lang.Class<ec8> r1 = defpackage.ec8.class
            java.lang.Object r0 = r0.g(r1)
            ec8 r0 = (defpackage.ec8) r0
            zbb r1 = new zbb
            r1.<init>(r2)
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            r0.a(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r15.a
            r0.s0(r15)
        L_0x0160:
            return
        L_0x0161:
            kotlin.reflect.KProperty[] r0 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.X0
            java.lang.Object r15 = r15.b
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r15 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r15
            android.view.ViewGroup r0 = r15.r0()
            android.view.ViewGroup r15 = r15.r0()
            int r15 = r15.getHeight()
            float r15 = (float) r15
            r0.setTranslationY(r15)
            return
        L_0x0178:
            java.lang.Object r15 = r15.b
            ow8 r15 = (defpackage.ow8) r15
            r15.j()
            return
        L_0x0180:
            java.lang.Object r15 = r15.b
            ks0 r15 = (defpackage.ks0) r15
            java.lang.Object r15 = r15.c
            androidx.mediarouter.app.d r15 = (androidx.mediarouter.app.d) r15
            rw8 r0 = r15.U0
            if (r0 == 0) goto L_0x0197
            r15.U0 = r1
            boolean r0 = r15.k1
            if (r0 == 0) goto L_0x0197
            boolean r0 = r15.l1
            r15.q(r0)
        L_0x0197:
            return
        L_0x0198:
            java.lang.Object r15 = r15.b
            androidx.mediarouter.app.d r15 = (androidx.mediarouter.app.d) r15
            r15.j(r2)
            androidx.mediarouter.app.OverlayListView r0 = r15.M0
            r0.requestLayout()
            androidx.mediarouter.app.OverlayListView r0 = r15.M0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            ro r1 = new ro
            r2 = 3
            r1.<init>(r2, r15)
            r0.addOnGlobalLayoutListener(r1)
            return
        L_0x01b4:
            java.lang.Object r15 = r15.b
            mm8 r15 = (defpackage.mm8) r15
            sy8 r0 = r15.g
            ts r0 = r0.v
            um8 r15 = r15.e
            r15.getClass()
            vm8 r15 = (defpackage.vm8) r15
            android.os.Messenger r15 = r15.a
            android.os.IBinder r15 = r15.getBinder()
            r0.remove(r15)
            return
        L_0x01cd:
            java.lang.Object r15 = r15.b
            v28 r15 = (defpackage.v28) r15
            r15.a()
            return
        L_0x01d5:
            java.lang.Object r15 = r15.b
            u28 r15 = (defpackage.u28) r15
            r15.a()
            return
        L_0x01dd:
            java.lang.Object r0 = r15.b
            u08 r0 = (defpackage.u08) r0
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            java.lang.Object r1 = r15.b     // Catch:{ all -> 0x01fb }
            u08 r1 = (defpackage.u08) r1     // Catch:{ all -> 0x01fb }
            java.lang.Object r1 = r1.f     // Catch:{ all -> 0x01fb }
            java.lang.Object r2 = r15.b     // Catch:{ all -> 0x01fb }
            u08 r2 = (defpackage.u08) r2     // Catch:{ all -> 0x01fb }
            java.lang.Object r3 = defpackage.u08.k     // Catch:{ all -> 0x01fb }
            r2.f = r3     // Catch:{ all -> 0x01fb }
            monitor-exit(r0)     // Catch:{ all -> 0x01fb }
            java.lang.Object r15 = r15.b
            u08 r15 = (defpackage.u08) r15
            r15.k(r1)
            return
        L_0x01fb:
            r15 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01fb }
            throw r15
        L_0x01fe:
            java.lang.Object r15 = r15.b
            kz7 r15 = (defpackage.kz7) r15
            r15.b = r1
            r15.a = r1
            return
        L_0x0207:
            int r0 = defpackage.dad.x0
            java.lang.Object r15 = r15.b
            dr7 r15 = (defpackage.dr7) r15
            android.view.View r0 = r15.findViewById(r0)
            android.graphics.drawable.GradientDrawable r1 = r15.getIndicatorDrawable()
            int r0 = r0.getMeasuredWidth()
            int r2 = r15.getMeasuredHeight()
            int r3 = r15.getPaddingTop()
            int r2 = r2 - r3
            int r15 = r15.getPaddingBottom()
            int r2 = r2 - r15
            r1.setSize(r0, r2)
            return
        L_0x022b:
            java.lang.Object r1 = r15.b
            yl7 r1 = (defpackage.yl7) r1
            pzc r2 = r1.c
            if (r2 == 0) goto L_0x0347
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.K0
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0242
            r4 = 0
            goto L_0x0244
        L_0x0242:
            long r4 = r2 - r4
        L_0x0244:
            androidx.recyclerview.widget.RecyclerView r8 = r1.A0
            androidx.recyclerview.widget.a r8 = r8.getLayoutManager()
            android.graphics.Rect r9 = r1.J0
            if (r9 != 0) goto L_0x0255
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r1.J0 = r9
        L_0x0255:
            pzc r9 = r1.c
            android.view.View r9 = r9.a
            android.graphics.Rect r10 = r1.J0
            r8.d(r10, r9)
            boolean r9 = r8.e()
            r10 = 0
            if (r9 == 0) goto L_0x02a4
            float r9 = r1.X
            float r11 = r1.y
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r1.J0
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r1.A0
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r1.y
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0281
            if (r11 >= 0) goto L_0x0281
            goto L_0x02a5
        L_0x0281:
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x02a4
            pzc r11 = r1.c
            android.view.View r11 = r11.a
            int r11 = r11.getWidth()
            int r11 = r11 + r9
            android.graphics.Rect r9 = r1.J0
            int r9 = r9.right
            int r11 = r11 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r1.A0
            int r9 = r9.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r1.A0
            int r12 = r12.getPaddingRight()
            int r9 = r9 - r12
            int r11 = r11 - r9
            if (r11 <= 0) goto L_0x02a4
            goto L_0x02a5
        L_0x02a4:
            r11 = r0
        L_0x02a5:
            boolean r8 = r8.f()
            if (r8 == 0) goto L_0x02eb
            float r8 = r1.Y
            float r9 = r1.z
            float r8 = r8 + r9
            int r8 = (int) r8
            android.graphics.Rect r9 = r1.J0
            int r9 = r9.top
            int r9 = r8 - r9
            androidx.recyclerview.widget.RecyclerView r12 = r1.A0
            int r12 = r12.getPaddingTop()
            int r9 = r9 - r12
            float r12 = r1.z
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x02c8
            if (r9 >= 0) goto L_0x02c8
        L_0x02c6:
            r0 = r9
            goto L_0x02eb
        L_0x02c8:
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x02eb
            pzc r9 = r1.c
            android.view.View r9 = r9.a
            int r9 = r9.getHeight()
            int r9 = r9 + r8
            android.graphics.Rect r8 = r1.J0
            int r8 = r8.bottom
            int r9 = r9 + r8
            androidx.recyclerview.widget.RecyclerView r8 = r1.A0
            int r8 = r8.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r1.A0
            int r10 = r10.getPaddingBottom()
            int r8 = r8 - r10
            int r9 = r9 - r8
            if (r9 <= 0) goto L_0x02eb
            goto L_0x02c6
        L_0x02eb:
            if (r11 == 0) goto L_0x0303
            androidx.recyclerview.widget.RecyclerView r9 = r1.A0
            pzc r8 = r1.c
            android.view.View r8 = r8.a
            int r10 = r8.getWidth()
            androidx.recyclerview.widget.RecyclerView r8 = r1.A0
            r8.getWidth()
            xl7 r8 = r1.v0
            r12 = r4
            int r11 = r8.f(r9, r10, r11, r12)
        L_0x0303:
            r14 = r11
            if (r0 == 0) goto L_0x031d
            androidx.recyclerview.widget.RecyclerView r9 = r1.A0
            pzc r8 = r1.c
            android.view.View r8 = r8.a
            int r10 = r8.getHeight()
            androidx.recyclerview.widget.RecyclerView r8 = r1.A0
            r8.getHeight()
            xl7 r8 = r1.v0
            r11 = r0
            r12 = r4
            int r0 = r8.f(r9, r10, r11, r12)
        L_0x031d:
            if (r14 != 0) goto L_0x0325
            if (r0 == 0) goto L_0x0322
            goto L_0x0325
        L_0x0322:
            r1.K0 = r6
            goto L_0x0347
        L_0x0325:
            long r4 = r1.K0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x032d
            r1.K0 = r2
        L_0x032d:
            androidx.recyclerview.widget.RecyclerView r2 = r1.A0
            r2.scrollBy(r14, r0)
            pzc r0 = r1.c
            if (r0 == 0) goto L_0x0339
            r1.q(r0)
        L_0x0339:
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0
            tj7 r2 = r1.B0
            r0.removeCallbacks(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0
            java.util.WeakHashMap r1 = defpackage.gag.a
            r0.postOnAnimation(r15)
        L_0x0347:
            return
        L_0x0348:
            java.lang.Object r15 = r15.b
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen r15 = (one.me.inviteactions.invitebyphone.InviteByPhoneScreen) r15
            android.view.View r0 = r15.getView()
            if (r0 == 0) goto L_0x0367
            kotlin.reflect.KProperty[] r0 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.z0
            zwa r15 = r15.e0()
            android.widget.EditText r0 = r15.z
            r0.requestFocus()
            sx8 r1 = new sx8
            r2 = 15
            r1.<init>(r2, r15, r0)
            r0.post(r1)
        L_0x0367:
            return
        L_0x0368:
            java.lang.Object r1 = r15.b
            uj7 r1 = (defpackage.uj7) r1
            i6d r1 = r1.a
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.i
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.lock()
            java.lang.Object r3 = r15.b     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            uj7 r3 = (defpackage.uj7) r3     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            boolean r3 = r3.b()     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            if (r3 != 0) goto L_0x038d
        L_0x0381:
            r1.unlock()
            java.lang.Object r15 = r15.b
            uj7 r15 = (defpackage.uj7) r15
            r15.getClass()
            goto L_0x0410
        L_0x038d:
            java.lang.Object r3 = r15.b     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            uj7 r3 = (defpackage.uj7) r3     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.f     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            boolean r0 = r3.compareAndSet(r2, r0)     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            if (r0 != 0) goto L_0x039a
            goto L_0x0381
        L_0x039a:
            java.lang.Object r0 = r15.b     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            uj7 r0 = (defpackage.uj7) r0     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            i6d r0 = r0.a     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            boolean r0 = r0.k()     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            if (r0 == 0) goto L_0x03a7
            goto L_0x0381
        L_0x03a7:
            java.lang.Object r0 = r15.b     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            uj7 r0 = (defpackage.uj7) r0     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            i6d r0 = r0.a     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            f3f r0 = r0.h()     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            af6 r0 = r0.getWritableDatabase()     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            r0.n()     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            java.util.Set r3 = r15.a()     // Catch:{ all -> 0x03cf }
            r0.s0()     // Catch:{ all -> 0x03cf }
            r0.U()     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
        L_0x03c2:
            r1.unlock()
            java.lang.Object r0 = r15.b
            uj7 r0 = (defpackage.uj7) r0
            r0.getClass()
            goto L_0x03de
        L_0x03cd:
            r0 = move-exception
            goto L_0x0411
        L_0x03cf:
            r3 = move-exception
            r0.U()     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
            throw r3     // Catch:{ IllegalStateException -> 0x03d9, SQLiteException -> 0x03d4 }
        L_0x03d4:
            java.util.Set r3 = kotlin.collections.SetsKt.emptySet()     // Catch:{ all -> 0x03cd }
            goto L_0x03c2
        L_0x03d9:
            java.util.Set r3 = kotlin.collections.SetsKt.emptySet()     // Catch:{ all -> 0x03cd }
            goto L_0x03c2
        L_0x03de:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0410
            java.lang.Object r15 = r15.b
            uj7 r15 = (defpackage.uj7) r15
            xbd r0 = r15.k
            monitor-enter(r0)
            xbd r15 = r15.k     // Catch:{ all -> 0x0408 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x0408 }
        L_0x03f2:
            boolean r1 = r15.hasNext()     // Catch:{ all -> 0x0408 }
            if (r1 == 0) goto L_0x040a
            java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x0408 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0408 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0408 }
            rj7 r1 = (defpackage.rj7) r1     // Catch:{ all -> 0x0408 }
            r1.a(r3)     // Catch:{ all -> 0x0408 }
            goto L_0x03f2
        L_0x0408:
            r15 = move-exception
            goto L_0x040e
        L_0x040a:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0408 }
            monitor-exit(r0)
            goto L_0x0410
        L_0x040e:
            monitor-exit(r0)
            throw r15
        L_0x0410:
            return
        L_0x0411:
            r1.unlock()
            java.lang.Object r15 = r15.b
            uj7 r15 = (defpackage.uj7) r15
            r15.getClass()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj7.run():void");
    }

    public /* synthetic */ tj7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
