package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import java.util.concurrent.CancellationException;
import one.me.chats.tab.ChatsTabWidget;
import one.me.rlottie.RLottieDrawable;
import one.me.sdk.arch.Widget;

/* renamed from: el  reason: default package */
public final class el implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ el(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    /* JADX WARNING: type inference failed for: r8v21, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r8v27, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewAttachedToWindow(android.view.View r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            int r3 = r7.a
            switch(r3) {
                case 0: goto L_0x0114;
                case 1: goto L_0x0113;
                case 2: goto L_0x00a0;
                case 3: goto L_0x0096;
                case 4: goto L_0x006e;
                case 5: goto L_0x004f;
                case 6: goto L_0x004e;
                case 7: goto L_0x0018;
                case 8: goto L_0x0017;
                case 9: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return
        L_0x0009:
            java.util.WeakHashMap r0 = defpackage.gag.a
            defpackage.t9g.c(r8)
            rz9 r8 = defpackage.zh7.a
            java.lang.Object r7 = r7.b
            hne r7 = (defpackage.hne) r7
            r8.a(r7)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r7 = r7.b
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.graphics.drawable.Drawable r8 = r7.getDrawable()
            boolean r0 = r8 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L_0x0027
            android.graphics.drawable.Animatable r8 = (android.graphics.drawable.Animatable) r8
            goto L_0x0028
        L_0x0027:
            r8 = r2
        L_0x0028:
            if (r8 == 0) goto L_0x002d
            r8.start()
        L_0x002d:
            android.graphics.drawable.Drawable r8 = r7.getDrawable()
            boolean r0 = r8 instanceof defpackage.cl
            if (r0 == 0) goto L_0x0038
            r2 = r8
            cl r2 = (defpackage.cl) r2
        L_0x0038:
            if (r2 == 0) goto L_0x004e
            android.graphics.drawable.Drawable r8 = r2.b()
            one.me.rlottie.RLottieDrawable r0 = r2.v0
            if (r8 != r0) goto L_0x004e
            if (r0 == 0) goto L_0x0047
            r0.setMasterParent(r7)
        L_0x0047:
            one.me.rlottie.RLottieDrawable r7 = r2.v0
            if (r7 == 0) goto L_0x004e
            r7.setAllowDecodeSingleFrame(r1)
        L_0x004e:
            return
        L_0x004f:
            java.lang.Object r7 = r7.b
            o65 r7 = (defpackage.o65) r7
            rt3 r8 = r7.G0
            if (r8 == 0) goto L_0x006d
            android.view.accessibility.AccessibilityManager r8 = r7.F0
            if (r8 == 0) goto L_0x006d
            java.util.WeakHashMap r0 = defpackage.gag.a
            boolean r0 = r7.isAttachedToWindow()
            if (r0 == 0) goto L_0x006d
            rt3 r7 = r7.G0
            w3 r0 = new w3
            r0.<init>(r7)
            r8.addTouchExplorationStateChangeListener(r0)
        L_0x006d:
            return
        L_0x006e:
            java.lang.Object r7 = r7.b
            g15 r7 = (defpackage.g15) r7
            android.view.View r8 = r7.a
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.graphics.drawable.Drawable r8 = r8.getDrawable()
            boolean r0 = r8 instanceof defpackage.cl
            if (r0 == 0) goto L_0x0081
            r2 = r8
            cl r2 = (defpackage.cl) r2
        L_0x0081:
            if (r2 == 0) goto L_0x0095
            android.graphics.drawable.Drawable r8 = r2.b()
            one.me.rlottie.RLottieDrawable r0 = r2.v0
            if (r8 != r0) goto L_0x0092
            if (r0 == 0) goto L_0x0092
            bj r7 = r7.E0
            r0.addParentView(r7)
        L_0x0092:
            r2.start()
        L_0x0095:
            return
        L_0x0096:
            java.lang.Object r7 = r7.b
            q43 r7 = (defpackage.q43) r7
            qr0 r7 = r7.e
            r7.p()
            return
        L_0x00a0:
            java.lang.Object r8 = r7.b
            one.me.chats.tab.ChatsTabWidget r8 = (one.me.chats.tab.ChatsTabWidget) r8
            java.lang.String r1 = r8.b
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x00ab
            goto L_0x00c4
        L_0x00ab:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x00c4
            w78 r4 = defpackage.w78.o
            tu7 r8 = r8.getLifecycleScope()
            boolean r8 = defpackage.e14.f(r8)
            java.lang.String r5 = "ONEME-6453|chats_list_lf | tabs view attached to window. Scope isActive: "
            java.lang.String r8 = defpackage.i2a.i(r5, r8)
            r3.d(r4, r1, r8, r2)
        L_0x00c4:
            java.lang.Object r8 = r7.b
            one.me.chats.tab.ChatsTabWidget r8 = (one.me.chats.tab.ChatsTabWidget) r8
            w86 r1 = r8.f0()
            etc r1 = r1.v0
            vy2 r3 = new vy2
            java.lang.Object r4 = r7.b
            one.me.chats.tab.ChatsTabWidget r4 = (one.me.chats.tab.ChatsTabWidget) r4
            r3.<init>(r2, r4)
            ps5 r2 = new ps5
            r4 = 5
            r2.<init>(r1, r3, r4)
            java.lang.Object r1 = r7.b
            one.me.chats.tab.ChatsTabWidget r1 = (one.me.chats.tab.ChatsTabWidget) r1
            tu7 r1 = r1.getViewLifecycleScope()
            pm7 r1 = defpackage.bs0.K(r2, r1)
            r8.y0 = r1
            java.lang.Object r7 = r7.b
            one.me.chats.tab.ChatsTabWidget r7 = (one.me.chats.tab.ChatsTabWidget) r7
            w86 r8 = r7.f0()
            etc r8 = r8.Z
            ome r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            int r2 = r8.intValue()
            androidx.viewpager2.widget.ViewPager2 r8 = r7.d0()
            r8.e(r2, r0)
            c2b r1 = r7.c0()
            r3 = 0
            r6 = 1
            r4 = 1
            r5 = 1
            r1.o(r2, r3, r4, r5, r6)
        L_0x0113:
            return
        L_0x0114:
            java.lang.Object r7 = r7.b
            fl r7 = (defpackage.fl) r7
            hk r8 = r7.e
            if (r8 != 0) goto L_0x012c
            boolean r8 = r7.f
            if (r8 == 0) goto L_0x012c
            hk r8 = new hk
            android.view.View r2 = r7.a
            r8.<init>(r2, r0)
            r7.e = r8
            r8.a()
        L_0x012c:
            hk r8 = r7.e
            if (r8 == 0) goto L_0x013b
            boolean r8 = r8.c
            if (r8 != r1) goto L_0x013b
            hk r7 = r7.e
            if (r7 == 0) goto L_0x013b
            r7.a()
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el.onViewAttachedToWindow(android.view.View):void");
    }

    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        RLottieDrawable rLottieDrawable;
        switch (this.a) {
            case 0:
                fl flVar = (fl) this.b;
                hk hkVar = flVar.e;
                if (hkVar != null) {
                    hkVar.c = true;
                    hk.o.removeCallbacks(hkVar);
                }
                flVar.e = null;
                return;
            case 1:
                rx1 rx1 = (rx1) this.b;
                ViewTreeObserver viewTreeObserver = rx1.H0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        rx1.H0 = view.getViewTreeObserver();
                    }
                    rx1.H0.removeGlobalOnLayoutListener(rx1.X);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
                String str = chatsTabWidget.b;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, str, i2a.i("ONEME-6453|chats_list_lf | tabs view detached from window. Scope isActive: ", e14.f(chatsTabWidget.getLifecycleScope())), (Throwable) null);
                }
                pm7 pm7 = ((ChatsTabWidget) this.b).y0;
                if (pm7 != null) {
                    pm7.b((CancellationException) null);
                }
                ((ChatsTabWidget) this.b).y0 = null;
                return;
            case 3:
                ((q43) this.b).e.q();
                return;
            case 4:
                ((g15) this.b).P(false);
                return;
            case 5:
                o65 o65 = (o65) this.b;
                rt3 rt3 = o65.G0;
                if (rt3 != null && (accessibilityManager = o65.F0) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new w3(rt3));
                    return;
                }
                return;
            case 6:
                Handler handler = l0b.a;
                l0b.b((h0b) ((j50) this.b).y, g0b.o);
                return;
            case 7:
                ImageView imageView = (ImageView) this.b;
                Drawable drawable = imageView.getDrawable();
                Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
                if (animatable != null) {
                    animatable.stop();
                }
                Drawable drawable2 = imageView.getDrawable();
                cl clVar = drawable2 instanceof cl ? (cl) drawable2 : null;
                if (clVar != null && clVar.b() == (rLottieDrawable = clVar.v0)) {
                    if (rLottieDrawable != null) {
                        rLottieDrawable.setMasterParent((View) null);
                    }
                    RLottieDrawable rLottieDrawable2 = clVar.v0;
                    if (rLottieDrawable2 != null) {
                        rLottieDrawable2.setAllowDecodeSingleFrame(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                dje dje = (dje) this.b;
                ViewTreeObserver viewTreeObserver2 = dje.y0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        dje.y0 = view.getViewTreeObserver();
                    }
                    dje.y0.removeGlobalOnLayoutListener(dje.X);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 9:
                zh7.a.f((hne) this.b);
                return;
            default:
                Widget widget = (Widget) this.b;
                z68.c(ev0.y(widget), "lifecycle: preAttach invoke onViewDetachedFromWindow", new Object[0]);
                view.removeOnAttachStateChangeListener(this);
                widget.finalizeCleanActions(widget);
                return;
        }
    }
}
