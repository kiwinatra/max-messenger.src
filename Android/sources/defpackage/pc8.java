package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;
import one.me.main.MainScreen;

/* renamed from: pc8  reason: default package */
public final class pc8 extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public pc8(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.b = new sxg(this, context, googleMapOptions);
        setClickable(true);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r7) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.view.WindowInsets r6 = super.dispatchApplyWindowInsets(r7)
            return r6
        L_0x000a:
            r0 = 0
            iog r1 = defpackage.iog.g(r0, r7)
            fog r2 = r1.a
            r3 = 7
            wh7 r2 = r2.f(r3)
            r4 = 0
            android.view.View r4 = r6.getChildAt(r4)
            boolean r5 = r4 instanceof android.widget.FrameLayout
            if (r5 == 0) goto L_0x0022
            r0 = r4
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
        L_0x0022:
            if (r0 != 0) goto L_0x0029
            android.view.WindowInsets r7 = super.dispatchApplyWindowInsets(r7)
            goto L_0x006b
        L_0x0029:
            kotlin.reflect.KProperty[] r4 = one.me.main.MainScreen.x
            java.lang.Object r4 = r6.b
            one.me.main.MainScreen r4 = (one.me.main.MainScreen) r4
            one.me.common.bottombar.OneMeBottomBarView r4 = r4.e0()
            r4.dispatchApplyWindowInsets(r7)
            js9 r4 = one.me.common.bottombar.OneMeBottomBarView.b
            r4.getClass()
            int r6 = defpackage.js9.b(r6)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L_0x004b
            yng r4 = new yng
            r4.<init>(r1)
            goto L_0x0050
        L_0x004b:
            xng r4 = new xng
            r4.<init>(r1)
        L_0x0050:
            int r1 = r2.a
            int r5 = r2.d
            int r5 = r5 + r6
            int r6 = r2.b
            int r2 = r2.c
            wh7 r6 = defpackage.wh7.b(r1, r6, r2, r5)
            r4.c(r3, r6)
            iog r6 = r4.b()
            android.view.WindowInsets r6 = r6.f()
            r0.dispatchApplyWindowInsets(r6)
        L_0x006b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc8.dispatchApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pc8(MainScreen mainScreen, Context context) {
        super(context);
        this.b = mainScreen;
    }
}
