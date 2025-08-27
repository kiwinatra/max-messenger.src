package androidx.mediarouter.app;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public final class c extends ArrayAdapter {
    public final float a;
    public final /* synthetic */ d b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = dVar;
        this.a = zw8.d(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            r0 = 0
            androidx.mediarouter.app.d r1 = r7.b
            if (r9 != 0) goto L_0x0014
            android.content.Context r9 = r10.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            int r2 = defpackage.njc.mr_controller_volume_item
            android.view.View r9 = r9.inflate(r2, r10, r0)
            goto L_0x0037
        L_0x0014:
            r1.getClass()
            int r2 = defpackage.ufc.volume_item_container
            android.view.View r2 = r9.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            int r3 = r1.W0
            androidx.mediarouter.app.d.o(r2, r3)
            int r2 = defpackage.ufc.mr_volume_item_icon
            android.view.View r2 = r9.findViewById(r2)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            int r4 = r1.V0
            r3.width = r4
            r3.height = r4
            r2.setLayoutParams(r3)
        L_0x0037:
            java.lang.Object r8 = r7.getItem(r8)
            rw8 r8 = (defpackage.rw8) r8
            if (r8 == 0) goto L_0x010e
            boolean r2 = r8.g
            int r3 = defpackage.ufc.mr_name
            android.view.View r3 = r9.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setEnabled(r2)
            java.lang.String r4 = r8.d
            r3.setText(r4)
            int r3 = defpackage.ufc.mr_volume_slider
            android.view.View r3 = r9.findViewById(r3)
            androidx.mediarouter.app.MediaRouteVolumeSlider r3 = (androidx.mediarouter.app.MediaRouteVolumeSlider) r3
            android.content.Context r10 = r10.getContext()
            androidx.mediarouter.app.OverlayListView r4 = r1.M0
            int r10 = defpackage.zw8.c(r10)
            int r5 = android.graphics.Color.alpha(r10)
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == r6) goto L_0x0079
            java.lang.Object r4 = r4.getTag()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r10 = defpackage.w53.f(r10, r4)
        L_0x0079:
            r3.a(r10, r10)
            r3.setTag(r8)
            java.util.HashMap r10 = r1.Z0
            r10.put(r8, r3)
            r10 = r2 ^ 1
            r3.b(r10)
            r3.setEnabled(r2)
            r10 = 1
            if (r2 == 0) goto L_0x00c5
            boolean r4 = r1.G0
            if (r4 == 0) goto L_0x00ba
            boolean r4 = r8.e()
            if (r4 == 0) goto L_0x00a6
            ow8 r4 = defpackage.sw8.d
            if (r4 != 0) goto L_0x009f
            r4 = r0
            goto L_0x00a8
        L_0x009f:
            ow8 r4 = defpackage.sw8.c()
            r4.getClass()
        L_0x00a6:
            int r4 = r8.n
        L_0x00a8:
            if (r4 != r10) goto L_0x00ba
            int r4 = r8.p
            r3.setMax(r4)
            int r4 = r8.o
            r3.setProgress(r4)
            ks0 r4 = r1.T0
            r3.setOnSeekBarChangeListener(r4)
            goto L_0x00c5
        L_0x00ba:
            r4 = 100
            r3.setMax(r4)
            r3.setProgress(r4)
            r3.setEnabled(r0)
        L_0x00c5:
            int r3 = defpackage.ufc.mr_volume_item_icon
            android.view.View r3 = r9.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r2 == 0) goto L_0x00d0
            goto L_0x00d6
        L_0x00d0:
            r2 = 1132396544(0x437f0000, float:255.0)
            float r7 = r7.a
            float r7 = r7 * r2
            int r6 = (int) r7
        L_0x00d6:
            r3.setAlpha(r6)
            int r7 = defpackage.ufc.volume_item_container
            android.view.View r7 = r9.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            java.util.HashSet r2 = r1.R0
            boolean r2 = r2.contains(r8)
            if (r2 == 0) goto L_0x00ea
            r0 = 4
        L_0x00ea:
            r7.setVisibility(r0)
            java.util.HashSet r7 = r1.P0
            if (r7 == 0) goto L_0x010e
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x010e
            android.view.animation.AlphaAnimation r7 = new android.view.animation.AlphaAnimation
            r8 = 0
            r7.<init>(r8, r8)
            r0 = 0
            r7.setDuration(r0)
            r7.setFillEnabled(r10)
            r7.setFillAfter(r10)
            r9.clearAnimation()
            r9.startAnimation(r7)
        L_0x010e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean isEnabled(int i) {
        return false;
    }
}
