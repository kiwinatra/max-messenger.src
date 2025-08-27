package defpackage;

import android.view.View;

/* renamed from: cr  reason: default package */
public final class cr implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cr(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r4v7, types: [zx3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            r7 = 4
            r0 = 0
            r1 = 0
            r2 = 1
            java.lang.Object r3 = r6.c
            java.lang.Object r4 = r6.b
            int r6 = r6.a
            switch(r6) {
                case 0: goto L_0x0115;
                case 1: goto L_0x00fd;
                case 2: goto L_0x00cb;
                case 3: goto L_0x0079;
                case 4: goto L_0x0025;
                case 5: goto L_0x0015;
                default: goto L_0x000d;
            }
        L_0x000d:
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ ActivityNotFoundException -> 0x0014 }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ ActivityNotFoundException -> 0x0014 }
            r4.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x0014 }
        L_0x0014:
            return
        L_0x0015:
            omf r3 = (defpackage.omf) r3
            android.view.Window$Callback r6 = r3.k
            if (r6 == 0) goto L_0x0024
            boolean r7 = r3.l
            if (r7 == 0) goto L_0x0024
            q7 r4 = (defpackage.q7) r4
            r6.onMenuItemSelected(r1, r4)
        L_0x0024:
            return
        L_0x0025:
            kotlin.reflect.KProperty[] r6 = one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet.F0
            one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet r4 = (one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet) r4
            kotlin.Lazy r6 = r4.y0
            java.lang.Object r6 = r6.getValue()
            vxc r6 = (defpackage.vxc) r6
            txc r3 = (defpackage.txc) r3
            sxc r7 = r3.c
            long r0 = r7.a
            int r7 = (int) r0
            bz2 r0 = r4.q0()
            boolean r0 = r0.isChecked()
            r6.getClass()
            int r1 = defpackage.qqa.F0
            if (r7 == r1) goto L_0x0075
            int r1 = defpackage.qqa.w0
            if (r7 == r1) goto L_0x0075
            int r1 = defpackage.qqa.E0
            ph1 r6 = r6.c
            if (r7 != r1) goto L_0x0065
            jj1 r6 = (defpackage.jj1) r6
            s85 r7 = r6.K0
            ci1 r1 = new ci1
            r1.<init>(r0)
            defpackage.xag.h(r7, r1)
            qh1 r7 = defpackage.qh1.b
            s85 r6 = r6.K0
            defpackage.xag.h(r6, r7)
            goto L_0x0075
        L_0x0065:
            int r1 = defpackage.qqa.x0
            if (r7 != r1) goto L_0x0075
            jj1 r6 = (defpackage.jj1) r6
            s85 r6 = r6.K0
            ci1 r7 = new ci1
            r7.<init>(r0)
            defpackage.xag.h(r6, r7)
        L_0x0075:
            r4.i0(r2)
            return
        L_0x0079:
            one.me.sdk.permissionhost.PermissionBottomSheet r4 = (one.me.sdk.permissionhost.PermissionBottomSheet) r4
            r4.E0 = r2
            one.me.sdk.permissionhost.PermissionBottomSheet r3 = (one.me.sdk.permissionhost.PermissionBottomSheet) r3
            kotlin.Lazy r6 = r3.w0
            java.lang.Object r6 = r6.getValue()
            edb r6 = (defpackage.edb) r6
            zx3 r4 = r3.getTargetController()
            boolean r5 = r4 instanceof one.me.sdk.arch.Widget
            if (r5 == 0) goto L_0x0092
            r0 = r4
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
        L_0x0092:
            if (r0 == 0) goto L_0x00bf
            eng r4 = new eng
            r4.<init>(r0, r2)
            kotlin.reflect.KProperty[] r0 = one.me.sdk.permissionhost.PermissionBottomSheet.F0
            r7 = r0[r7]
            is r7 = r3.B0
            java.lang.Object r7 = r7.a(r3)
            java.lang.String[] r7 = (java.lang.String[]) r7
            if (r7 != 0) goto L_0x00a9
            java.lang.String[] r7 = new java.lang.String[r1]
        L_0x00a9:
            r1 = 5
            r0 = r0[r1]
            is r0 = r3.C0
            java.lang.Object r0 = r0.a(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r6.f(r4, r7, r0)
            r3.i0(r2)
            return
        L_0x00bf:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x00cb:
            one.me.sdk.permissionhost.PermissionBottomSheet r3 = (one.me.sdk.permissionhost.PermissionBottomSheet) r3
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch:{ all -> 0x00ef }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x00ef }
            java.lang.String r7 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            java.lang.String r1 = "package"
            android.content.Context r4 = r4.getContext()     // Catch:{ all -> 0x00ef }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x00ef }
            android.net.Uri r0 = android.net.Uri.fromParts(r1, r4, r0)     // Catch:{ all -> 0x00ef }
            r6.<init>(r7, r0)     // Catch:{ all -> 0x00ef }
            r3.startActivity(r6)     // Catch:{ all -> 0x00ef }
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00ef }
            kotlin.Result.m23constructorimpl(r6)     // Catch:{ all -> 0x00ef }
            goto L_0x00f9
        L_0x00ef:
            r6 = move-exception
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)
            kotlin.Result.m23constructorimpl(r6)
        L_0x00f9:
            r3.i0(r2)
            return
        L_0x00fd:
            sv8 r3 = (defpackage.sv8) r3
            tv8 r6 = r3.H0
            uv8 r6 = r6.X
            rw8 r4 = (defpackage.rw8) r4
            r6.w0 = r4
            r4.l()
            android.widget.ImageView r6 = r3.E0
            r6.setVisibility(r7)
            android.widget.ProgressBar r6 = r3.F0
            r6.setVisibility(r1)
            return
        L_0x0115:
            ar r3 = (defpackage.ar) r3
            yq r6 = r3.a
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r4.invoke(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr.onClick(android.view.View):void");
    }

    public cr(omf omf) {
        this.a = 5;
        this.c = omf;
        this.b = new q7(omf.a.getContext(), omf.h);
    }

    public cr(sv8 sv8, rw8 rw8) {
        this.a = 1;
        this.c = sv8;
        this.b = rw8;
    }
}
