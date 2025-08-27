package defpackage;

import android.view.View;

/* renamed from: wld  reason: default package */
public final class wld implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wld(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.os.Message} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: u69} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r10v14, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.lang.String r0 = "There is no currently selected dynamic group route."
            java.lang.String r1 = "route must not be null"
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 1
            java.lang.Object r6 = r9.b
            int r9 = r9.a
            switch(r9) {
                case 0: goto L_0x03ef;
                case 1: goto L_0x03e9;
                case 2: goto L_0x03b0;
                case 3: goto L_0x037e;
                case 4: goto L_0x032c;
                case 5: goto L_0x031c;
                case 6: goto L_0x0316;
                case 7: goto L_0x02cd;
                case 8: goto L_0x027a;
                case 9: goto L_0x00fa;
                case 10: goto L_0x00f4;
                case 11: goto L_0x00ee;
                case 12: goto L_0x0070;
                case 13: goto L_0x006a;
                case 14: goto L_0x0058;
                case 15: goto L_0x0049;
                default: goto L_0x000f;
            }
        L_0x000f:
            com.google.android.exoplayer2.ui.TrackSelectionView r6 = (com.google.android.exoplayer2.ui.TrackSelectionView) r6
            android.widget.CheckedTextView r9 = r6.a
            android.util.SparseArray r0 = r6.c
            android.widget.CheckedTextView r1 = r6.b
            if (r10 != r9) goto L_0x001f
            r6.w = r5
            r0.clear()
            goto L_0x0026
        L_0x001f:
            if (r10 != r1) goto L_0x003c
            r6.w = r4
            r0.clear()
        L_0x0026:
            android.widget.CheckedTextView r9 = r6.a
            boolean r10 = r6.w
            r9.setChecked(r10)
            boolean r9 = r6.w
            if (r9 != 0) goto L_0x0038
            int r9 = r0.size()
            if (r9 != 0) goto L_0x0038
            r4 = r5
        L_0x0038:
            r1.setChecked(r4)
            throw r3
        L_0x003c:
            r6.w = r4
            java.lang.Object r9 = r10.getTag()
            r9.getClass()
            defpackage.wj6.t(r9)
            throw r3
        L_0x0049:
            androidx.appcompat.widget.Toolbar r6 = (androidx.appcompat.widget.Toolbar) r6
            fmf r9 = r6.Y0
            if (r9 != 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            u69 r3 = r9.b
        L_0x0052:
            if (r3 == 0) goto L_0x0057
            r3.collapseActionView()
        L_0x0057:
            return
        L_0x0058:
            int r9 = defpackage.agc.selection_type
            java.lang.Object r9 = r10.getTag(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            com.google.android.material.timepicker.g r6 = (com.google.android.material.timepicker.g) r6
            r6.c(r9)
            return
        L_0x006a:
            one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet r6 = (one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet) r6
            r6.i0(r5)
            return
        L_0x0070:
            kotlin.reflect.KProperty[] r9 = one.me.profile.ProfileScreen.D0
            one.me.profile.ProfileScreen r6 = (one.me.profile.ProfileScreen) r6
            k7c r9 = r6.g0()
            xme r10 = r9.G0
            java.lang.Object r10 = r10.getValue()
            owb r10 = (defpackage.owb) r10
            if (r10 == 0) goto L_0x0085
            java.util.List r10 = r10.c
            goto L_0x0086
        L_0x0085:
            r10 = r3
        L_0x0086:
            gwb r0 = r9.I0
            if (r10 != 0) goto L_0x00e2
            boolean r10 = r0.b()
            if (r10 == 0) goto L_0x00ed
            kotlin.Lazy r10 = r9.B0
            java.lang.Object r10 = r10.getValue()
            swb r10 = (defpackage.swb) r10
            r10.getClass()
            int r0 = defpackage.lxa.a0
            igf r1 = new igf
            r1.<init>(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            pg3 r2 = new pg3
            int r4 = defpackage.jxa.o
            int r5 = defpackage.lxa.c0
            igf r6 = new igf
            r6.<init>(r5)
            og3 r5 = defpackage.og3.c
            r2.<init>(r4, r6, r5)
            r0.add(r2)
            pg3 r2 = new pg3
            int r4 = defpackage.jxa.n
            int r6 = defpackage.lxa.b0
            igf r7 = new igf
            r7.<init>(r6)
            r2.<init>(r4, r7, r5)
            r0.add(r2)
            pg3 r10 = r10.b()
            r0.add(r10)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            java.util.List r10 = kotlin.collections.CollectionsKt.build(r0)
            c6c r0 = new c6c
            r0.<init>(r1, r3, r10, r3)
            s85 r9 = r9.w0
            defpackage.xag.h(r9, r0)
            goto L_0x00ed
        L_0x00e2:
            pa4 r10 = r0.x()
            if (r10 == 0) goto L_0x00ed
            s85 r9 = r9.x0
            defpackage.xag.h(r9, r10)
        L_0x00ed:
            return
        L_0x00ee:
            androidx.preference.Preference r6 = (androidx.preference.Preference) r6
            r6.s(r10)
            return
        L_0x00f4:
            one.me.sdk.permissionhost.PermissionBottomSheet r6 = (one.me.sdk.permissionhost.PermissionBottomSheet) r6
            r6.i0(r5)
            return
        L_0x00fa:
            androidx.mediarouter.app.g r6 = (androidx.mediarouter.app.g) r6
            rw8 r9 = r6.D0
            boolean r9 = r6.O(r9)
            r9 = r9 ^ r5
            rw8 r10 = r6.D0
            boolean r10 = r10.e()
            bw8 r3 = r6.Q0
            if (r9 == 0) goto L_0x015c
            dw8 r7 = r3.v0
            sw8 r7 = r7.w
            rw8 r8 = r6.D0
            r7.getClass()
            if (r8 == 0) goto L_0x0156
            defpackage.sw8.b()
            ow8 r1 = defpackage.sw8.c()
            hw8 r7 = r1.s
            boolean r7 = r7 instanceof defpackage.gw8
            if (r7 == 0) goto L_0x0150
            rw8 r0 = r1.r
            grg r0 = r0.b(r8)
            rw8 r7 = r1.r
            java.util.ArrayList r7 = r7.u
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x014c
            if (r0 == 0) goto L_0x014c
            boolean r0 = r0.z()
            if (r0 != 0) goto L_0x0142
            goto L_0x014c
        L_0x0142:
            hw8 r0 = r1.s
            gw8 r0 = (defpackage.gw8) r0
            java.lang.String r1 = r8.b
            r0.m(r1)
            goto L_0x01b0
        L_0x014c:
            r8.toString()
            goto L_0x01b0
        L_0x0150:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r0)
            throw r9
        L_0x0156:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r1)
            throw r9
        L_0x015c:
            dw8 r7 = r3.v0
            sw8 r7 = r7.w
            rw8 r8 = r6.D0
            r7.getClass()
            if (r8 == 0) goto L_0x0274
            defpackage.sw8.b()
            ow8 r1 = defpackage.sw8.c()
            hw8 r7 = r1.s
            boolean r7 = r7 instanceof defpackage.gw8
            if (r7 == 0) goto L_0x026e
            rw8 r0 = r1.r
            grg r0 = r0.b(r8)
            rw8 r7 = r1.r
            java.util.ArrayList r7 = r7.u
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x01ad
            if (r0 == 0) goto L_0x01ad
            java.lang.Object r0 = r0.b
            fw8 r0 = (defpackage.fw8) r0
            if (r0 == 0) goto L_0x0194
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x01ad
        L_0x0194:
            rw8 r0 = r1.r
            java.util.ArrayList r0 = r0.u
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            int r0 = r0.size()
            if (r0 > r5) goto L_0x01a3
            goto L_0x01b0
        L_0x01a3:
            hw8 r0 = r1.s
            gw8 r0 = (defpackage.gw8) r0
            java.lang.String r1 = r8.b
            r0.n(r1)
            goto L_0x01b0
        L_0x01ad:
            r8.toString()
        L_0x01b0:
            r0 = r10 ^ 1
            r6.P(r9, r0)
            if (r10 == 0) goto L_0x01f5
            dw8 r10 = r3.v0
            rw8 r10 = r10.z
            java.util.ArrayList r10 = r10.u
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            rw8 r0 = r6.D0
            java.util.ArrayList r0 = r0.u
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x01cd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01f5
            java.lang.Object r1 = r0.next()
            rw8 r1 = (defpackage.rw8) r1
            boolean r7 = r10.contains(r1)
            if (r7 == r9) goto L_0x01cd
            dw8 r7 = r3.v0
            java.util.HashMap r7 = r7.E0
            java.lang.String r1 = r1.c
            java.lang.Object r1 = r7.get(r1)
            androidx.mediarouter.app.e r1 = (androidx.mediarouter.app.e) r1
            boolean r7 = r1 instanceof androidx.mediarouter.app.g
            if (r7 == 0) goto L_0x01cd
            androidx.mediarouter.app.g r1 = (androidx.mediarouter.app.g) r1
            r1.P(r9, r5)
            goto L_0x01cd
        L_0x01f5:
            rw8 r10 = r6.D0
            dw8 r0 = r3.v0
            rw8 r1 = r0.z
            java.util.ArrayList r1 = r1.u
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            int r6 = r1.size()
            int r6 = java.lang.Math.max(r5, r6)
            boolean r7 = r10.e()
            r8 = -1
            if (r7 == 0) goto L_0x0233
            java.util.ArrayList r10 = r10.u
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            java.util.Iterator r10 = r10.iterator()
        L_0x021a:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x0237
            java.lang.Object r7 = r10.next()
            rw8 r7 = (defpackage.rw8) r7
            boolean r7 = r1.contains(r7)
            if (r7 == r9) goto L_0x021a
            if (r9 == 0) goto L_0x0230
            r7 = r5
            goto L_0x0231
        L_0x0230:
            r7 = r8
        L_0x0231:
            int r6 = r6 + r7
            goto L_0x021a
        L_0x0233:
            if (r9 == 0) goto L_0x0236
            r8 = r5
        L_0x0236:
            int r6 = r6 + r8
        L_0x0237:
            dw8 r9 = r3.v0
            boolean r10 = r9.b1
            if (r10 == 0) goto L_0x024d
            rw8 r9 = r9.z
            java.util.ArrayList r9 = r9.u
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            int r9 = r9.size()
            if (r9 <= r5) goto L_0x024d
            r9 = r5
            goto L_0x024e
        L_0x024d:
            r9 = r4
        L_0x024e:
            boolean r10 = r0.b1
            if (r10 == 0) goto L_0x0255
            if (r6 < r2) goto L_0x0255
            goto L_0x0256
        L_0x0255:
            r5 = r4
        L_0x0256:
            if (r9 == r5) goto L_0x026d
            androidx.recyclerview.widget.RecyclerView r9 = r0.B0
            pzc r9 = r9.M(r4)
            boolean r10 = r9 instanceof androidx.mediarouter.app.f
            if (r10 == 0) goto L_0x026d
            androidx.mediarouter.app.f r9 = (androidx.mediarouter.app.f) r9
            android.view.View r10 = r9.a
            if (r5 == 0) goto L_0x026a
            int r4 = r9.I0
        L_0x026a:
            r3.E(r10, r4)
        L_0x026d:
            return
        L_0x026e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r0)
            throw r9
        L_0x0274:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r1)
            throw r9
        L_0x027a:
            yv8 r6 = (defpackage.yv8) r6
            bw8 r9 = r6.J0
            dw8 r9 = r9.v0
            sw8 r9 = r9.w
            rw8 r10 = r6.I0
            r9.getClass()
            if (r10 == 0) goto L_0x02c7
            defpackage.sw8.b()
            ow8 r9 = defpackage.sw8.c()
            hw8 r1 = r9.s
            boolean r1 = r1 instanceof defpackage.gw8
            if (r1 == 0) goto L_0x02c1
            rw8 r0 = r9.r
            grg r0 = r0.b(r10)
            if (r0 == 0) goto L_0x02b5
            java.lang.Object r0 = r0.b
            fw8 r0 = (defpackage.fw8) r0
            if (r0 == 0) goto L_0x02b5
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x02b5
            hw8 r9 = r9.s
            gw8 r9 = (defpackage.gw8) r9
            java.lang.String r10 = r10.b
            java.util.List r10 = java.util.Collections.singletonList(r10)
            r9.o(r10)
        L_0x02b5:
            android.widget.ImageView r9 = r6.E0
            r10 = 4
            r9.setVisibility(r10)
            android.widget.ProgressBar r9 = r6.F0
            r9.setVisibility(r4)
            return
        L_0x02c1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r0)
            throw r9
        L_0x02c7:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r1)
            throw r9
        L_0x02cd:
            androidx.mediarouter.app.e r6 = (androidx.mediarouter.app.e) r6
            dw8 r9 = r6.G0
            rw8 r0 = r9.F0
            if (r0 == 0) goto L_0x02da
            hy r9 = r9.A0
            r9.removeMessages(r2)
        L_0x02da:
            rw8 r9 = r6.D0
            dw8 r0 = r6.G0
            r0.F0 = r9
            boolean r9 = r10.isActivated()
            r9 = r9 ^ r5
            if (r9 == 0) goto L_0x02e8
            goto L_0x0301
        L_0x02e8:
            java.util.HashMap r10 = r0.G0
            rw8 r1 = r6.D0
            java.lang.String r1 = r1.c
            java.lang.Object r10 = r10.get(r1)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L_0x02f8
            r4 = r5
            goto L_0x0301
        L_0x02f8:
            int r10 = r10.intValue()
            int r10 = java.lang.Math.max(r5, r10)
            r4 = r10
        L_0x0301:
            r6.N(r9)
            androidx.mediarouter.app.MediaRouteVolumeSlider r9 = r6.F0
            r9.setProgress(r4)
            rw8 r9 = r6.D0
            r9.j(r4)
            hy r9 = r0.A0
            r0 = 500(0x1f4, double:2.47E-321)
            r9.sendEmptyMessageDelayed(r2, r0)
            return
        L_0x0316:
            uv8 r6 = (defpackage.uv8) r6
            r6.dismiss()
            return
        L_0x031c:
            com.google.android.material.datepicker.MaterialCalendar r6 = (com.google.android.material.datepicker.MaterialCalendar) r6
            int r9 = r6.p1
            if (r9 != r2) goto L_0x0326
            r6.U2(r5)
            goto L_0x032b
        L_0x0326:
            if (r9 != r5) goto L_0x032b
            r6.U2(r2)
        L_0x032b:
            return
        L_0x032c:
            kotlin.reflect.KProperty[] r9 = one.me.chats.forward.ForwardPickerScreen.I0
            r9 = r6
            one.me.chats.forward.ForwardPickerScreen r9 = (one.me.chats.forward.ForwardPickerScreen) r9
            vhb r10 = r9.l0()
            ukb r10 = r10.c
            ya6 r10 = (defpackage.ya6) r10
            xme r10 = r10.r
        L_0x033b:
            java.lang.Object r0 = r10.getValue()
            r1 = r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r10.b(r0, r1)
            if (r0 == 0) goto L_0x033b
            occ r10 = r9.p0()
            vhb r0 = r9.l0()
            ukb r0 = r0.c
            ya6 r0 = (defpackage.ya6) r0
            xme r0 = r0.r
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0373
            int r0 = defpackage.blc.forward_author_invisible
            igf r1 = new igf
            r1.<init>(r0)
            goto L_0x037a
        L_0x0373:
            int r0 = defpackage.blc.forward_author_visible
            igf r1 = new igf
            r1.<init>(r0)
        L_0x037a:
            one.me.chats.forward.ForwardPickerScreen.n0(r9, r10, r1, r4)
            return
        L_0x037e:
            xr0 r6 = (defpackage.xr0) r6
            boolean r9 = r6.Y
            if (r9 == 0) goto L_0x03af
            boolean r9 = r6.isShowing()
            if (r9 == 0) goto L_0x03af
            boolean r9 = r6.v0
            if (r9 != 0) goto L_0x03a8
            android.content.Context r9 = r6.getContext()
            r10 = 16843611(0x101035b, float:2.3695965E-38)
            int[] r10 = new int[]{r10}
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10)
            boolean r10 = r9.getBoolean(r4, r5)
            r6.Z = r10
            r9.recycle()
            r6.v0 = r5
        L_0x03a8:
            boolean r9 = r6.Z
            if (r9 == 0) goto L_0x03af
            r6.cancel()
        L_0x03af:
            return
        L_0x03b0:
            cd r6 = (defpackage.cd) r6
            android.widget.Button r9 = r6.k
            if (r10 != r9) goto L_0x03bf
            android.os.Message r9 = r6.m
            if (r9 == 0) goto L_0x03bf
            android.os.Message r3 = android.os.Message.obtain(r9)
            goto L_0x03d8
        L_0x03bf:
            android.widget.Button r9 = r6.o
            if (r10 != r9) goto L_0x03cc
            android.os.Message r9 = r6.q
            if (r9 == 0) goto L_0x03cc
            android.os.Message r3 = android.os.Message.obtain(r9)
            goto L_0x03d8
        L_0x03cc:
            android.widget.Button r9 = r6.s
            if (r10 != r9) goto L_0x03d8
            android.os.Message r9 = r6.u
            if (r9 == 0) goto L_0x03d8
            android.os.Message r3 = android.os.Message.obtain(r9)
        L_0x03d8:
            if (r3 == 0) goto L_0x03dd
            r3.sendToTarget()
        L_0x03dd:
            ad r9 = r6.L
            go r10 = r6.b
            android.os.Message r9 = r9.obtainMessage(r5, r10)
            r9.sendToTarget()
            return
        L_0x03e9:
            b8 r6 = (defpackage.b8) r6
            r6.a()
            return
        L_0x03ef:
            gmd r6 = (defpackage.gmd) r6
            android.widget.ImageView r9 = r6.mSearchButton
            if (r10 != r9) goto L_0x03f9
            r6.onSearchClicked()
            goto L_0x0418
        L_0x03f9:
            android.widget.ImageView r9 = r6.mCloseButton
            if (r10 != r9) goto L_0x0401
            r6.onCloseClicked()
            goto L_0x0418
        L_0x0401:
            android.widget.ImageView r9 = r6.mGoButton
            if (r10 != r9) goto L_0x0409
            r6.onSubmitQuery()
            goto L_0x0418
        L_0x0409:
            android.widget.ImageView r9 = r6.mVoiceButton
            if (r10 != r9) goto L_0x0411
            r6.onVoiceClicked()
            goto L_0x0418
        L_0x0411:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r9 = r6.mSearchSrcTextView
            if (r10 != r9) goto L_0x0418
            r6.forceSuggestionQuery()
        L_0x0418:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wld.onClick(android.view.View):void");
    }
}
