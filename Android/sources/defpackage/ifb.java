package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: ifb  reason: default package */
public final /* synthetic */ class ifb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ifb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: int} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v8, types: [int] */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r28 = this;
            r0 = r28
            r1 = 3
            r2 = 8
            r3 = 5
            r4 = 10
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 1
            java.lang.Object r9 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x055a;
                case 1: goto L_0x0546;
                case 2: goto L_0x0524;
                case 3: goto L_0x04a2;
                case 4: goto L_0x0488;
                case 5: goto L_0x0476;
                case 6: goto L_0x044c;
                case 7: goto L_0x03e9;
                case 8: goto L_0x03cf;
                case 9: goto L_0x03b3;
                case 10: goto L_0x031f;
                case 11: goto L_0x0313;
                case 12: goto L_0x02bd;
                case 13: goto L_0x01f4;
                case 14: goto L_0x01e1;
                case 15: goto L_0x01d0;
                case 16: goto L_0x016d;
                case 17: goto L_0x015e;
                case 18: goto L_0x014f;
                case 19: goto L_0x0140;
                case 20: goto L_0x012f;
                case 21: goto L_0x0120;
                case 22: goto L_0x0119;
                case 23: goto L_0x00d9;
                case 24: goto L_0x006a;
                case 25: goto L_0x005d;
                case 26: goto L_0x004a;
                case 27: goto L_0x0034;
                case 28: goto L_0x0027;
                default: goto L_0x0013;
            }
        L_0x0013:
            p7d r9 = (defpackage.p7d) r9
            java.lang.Object r0 = r9.b
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "chats-list-promo-link-info"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.util.Map
            if (r1 == 0) goto L_0x0026
            r6 = r0
            java.util.Map r6 = (java.util.Map) r6
        L_0x0026:
            return r6
        L_0x0027:
            wsd r9 = (defpackage.wsd) r9
            usd[] r0 = r9.k
            int r0 = defpackage.hsg.v(r9, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0034:
            csd r0 = new csd
            esd r9 = (defpackage.esd) r9
            android.view.ViewGroup r1 = r9.a
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            int r1 = defpackage.cwa.O
            r0.setId(r1)
            r0.setWillNotDraw(r7)
            return r0
        L_0x004a:
            bsd r9 = (defpackage.bsd) r9
            kotlin.Lazy r0 = r9.e
            java.lang.Object r0 = r0.getValue()
            rta r0 = (defpackage.rta) r0
            ome r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            uy4 r0 = (defpackage.uy4) r0
            return r0
        L_0x005d:
            java.lang.String r0 = "request_id"
            qjd r9 = (defpackage.qjd) r9
            int r0 = r9.d(r0, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x006a:
            ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel r9 = (ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel) r9
            kotlin.Lazy r0 = r9.h
            java.lang.Object r0 = r0.getValue()
            rq6 r0 = (defpackage.rq6) r0
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0.getClass()
            int r12 = r1.get(r8)
            int r10 = r1.get(r3)
            int r11 = r1.get(r5)
            n84 r4 = new n84
            r13 = 0
            java.lang.String r15 = r0.a
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r15)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r6 = "d MMMM"
            r0.<init>(r6, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r6 = 366(0x16e, float:5.13E-43)
            r2.<init>(r6)
            r2.add(r4)
        L_0x00a6:
            r1.add(r3, r8)
            int r6 = r2.size()
            long r13 = (long) r6
            int r12 = r1.get(r8)
            int r6 = r1.get(r3)
            int r7 = r1.get(r5)
            java.util.Date r9 = r1.getTime()
            java.lang.String r15 = r0.format(r9)
            n84 r11 = new n84
            r9 = r11
            r10 = r6
            r5 = r11
            r11 = r7
            r9.<init>(r10, r11, r12, r13, r15)
            int r9 = r4.b
            if (r6 != r9) goto L_0x00d4
            int r6 = r4.c
            if (r7 != r6) goto L_0x00d4
            return r2
        L_0x00d4:
            r2.add(r5)
            r5 = 2
            goto L_0x00a6
        L_0x00d9:
            kotlin.reflect.KProperty[] r0 = ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel.q
            int r0 = defpackage.jad.q
            android.app.Application r9 = (android.app.Application) r9
            java.lang.String r0 = r9.getString(r0)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0113
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char r2 = r0.charAt(r7)
            boolean r3 = java.lang.Character.isLowerCase(r2)
            if (r3 == 0) goto L_0x0101
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r2 = kotlin.text.CharsKt.titlecase(r2, r3)
            goto L_0x0105
        L_0x0101:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L_0x0105:
            r1.append(r2)
            java.lang.String r0 = r0.substring(r8)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0113:
            rq6 r1 = new rq6
            r1.<init>(r0)
            return r1
        L_0x0119:
            p8d r9 = (defpackage.p8d) r9
            android.graphics.drawable.ShapeDrawable r0 = defpackage.p8d.L(r9)
            return r0
        L_0x0120:
            q7d r9 = (defpackage.q7d) r9
            j6d r0 = r9.a
            i6d r0 = r0.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r0 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r0
            hef r0 = r0.U()
            return r0
        L_0x012f:
            p7d r9 = (defpackage.p7d) r9
            java.lang.Object r0 = r9.b
            j6d r0 = (defpackage.j6d) r0
            i6d r0 = r0.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r0 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r0
            kse r0 = r0.T()
            return r0
        L_0x0140:
            o7d r9 = (defpackage.o7d) r9
            j6d r0 = r9.b
            i6d r0 = r0.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r0 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r0
            rne r0 = r0.R()
            return r0
        L_0x014f:
            c7d r9 = (defpackage.c7d) r9
            j6d r0 = r9.a
            i6d r0 = r0.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r0 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r0
            ueb r0 = r0.L()
            return r0
        L_0x015e:
            z6d r9 = (defpackage.z6d) r9
            j6d r0 = r9.a
            i6d r0 = r0.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r0 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r0
            aj9 r0 = r0.H()
            return r0
        L_0x016d:
            j6d r9 = (defpackage.j6d) r9
            java.lang.Class r0 = r9.b
            java.lang.String r5 = r9.c
            android.content.Context r6 = r9.a
            h6d r0 = defpackage.b0h.o(r6, r5, r0)
            r5 = r9
            cya r5 = (defpackage.cya) r5
            rq9 r6 = new rq9
            ru.ok.tamtam.logout.a r10 = r5.x
            xt4 r5 = r5.y
            r6.<init>(r10, r5)
            qq9 r5 = new qq9
            r10 = 4
            r11 = 9
            r5.<init>(r10, r3, r11)
            qq9 r3 = new qq9
            r10 = 7
            r3.<init>(r10, r2, r4)
            pq9[] r2 = new defpackage.pq9[r1]
            r2[r7] = r6
            r2[r8] = r5
            r4 = 2
            r2[r4] = r3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            pq9[] r1 = (defpackage.pq9[]) r1
            r0.a(r1)
            aua r1 = r9.o
            java.util.concurrent.ExecutorService r2 = r1.a()
            r0.g = r2
            java.util.concurrent.ExecutorService r1 = r1.b()
            r0.h = r1
            java.lang.Object[] r1 = r9.v
            int r2 = r1.length
        L_0x01b6:
            if (r7 >= r2) goto L_0x01c1
            r3 = r1[r7]
            java.util.ArrayList r4 = r0.e
            r4.add(r3)
            int r7 = r7 + r8
            goto L_0x01b6
        L_0x01c1:
            o13 r1 = new o13
            r1.<init>(r8)
            java.util.ArrayList r2 = r0.d
            r2.add(r1)
            i6d r0 = r0.b()
            return r0
        L_0x01d0:
            g6d r9 = (defpackage.g6d) r9
            java.lang.Object r0 = r9.b
            j6d r0 = (defpackage.j6d) r0
            i6d r0 = r0.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r0 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r0
            ht3 r0 = r0.z()
            return r0
        L_0x01e1:
            pwc r9 = (defpackage.pwc) r9
            kotlin.Lazy r0 = r9.y
            java.lang.Object r0 = r0.getValue()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            return r0
        L_0x01f4:
            vsc r9 = (defpackage.vsc) r9
            long r11 = r9.b
            vi9 r0 = defpackage.vi9.a
            q4 r1 = r0.getAccessor()
            java.lang.Class<qx2> r2 = defpackage.qx2.class
            java.lang.Object r1 = r1.g(r2)
            r13 = r1
            qx2 r13 = (defpackage.qx2) r13
            mxb r1 = new mxb
            r2 = 17
            r1.<init>(r2)
            kotlin.Lazy r17 = kotlin.LazyKt.lazy(r1)
            q4 r1 = r0.getAccessor()
            java.lang.Class<fa9> r2 = defpackage.fa9.class
            java.lang.Object r1 = r1.g(r2)
            fa9 r1 = (defpackage.fa9) r1
            q4 r1 = r0.getAccessor()
            java.lang.Class<bud> r2 = defpackage.bud.class
            java.lang.Object r1 = r1.g(r2)
            r14 = r1
            bud r14 = (defpackage.bud) r14
            q4 r1 = r0.getAccessor()
            java.lang.Class<fq> r2 = defpackage.fq.class
            java.lang.Object r1 = r1.g(r2)
            fq r1 = (defpackage.fq) r1
            q4 r1 = r0.getAccessor()
            java.lang.Class<sv0> r2 = defpackage.sv0.class
            java.lang.Object r1 = r1.g(r2)
            r15 = r1
            sv0 r15 = (defpackage.sv0) r15
            q4 r1 = r0.getAccessor()
            java.lang.Class<zqc> r2 = defpackage.zqc.class
            java.lang.Object r1 = r1.g(r2)
            r16 = r1
            zqc r16 = (defpackage.zqc) r16
            q4 r1 = r0.getAccessor()
            java.lang.Class<ce4> r2 = defpackage.ce4.class
            kotlin.Lazy r18 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            java.lang.Class<sbe> r2 = defpackage.sbe.class
            kotlin.Lazy r19 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            java.lang.Class<rl> r2 = defpackage.rl.class
            kotlin.Lazy r20 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            java.lang.Class<dw1> r2 = defpackage.dw1.class
            kotlin.Lazy r21 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            java.lang.Class<xrd> r2 = defpackage.xrd.class
            kotlin.Lazy r22 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            java.lang.Class<hcf> r2 = defpackage.hcf.class
            kotlin.Lazy r23 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            java.lang.Class<br6> r2 = defpackage.br6.class
            kotlin.Lazy r24 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            java.lang.Class<ve8> r2 = defpackage.ve8.class
            kotlin.Lazy r25 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            java.lang.Class<yd9> r2 = defpackage.yd9.class
            kotlin.Lazy r26 = r1.h(r2)
            q4 r0 = r0.getAccessor()
            java.lang.Class<gk> r1 = defpackage.gk.class
            kotlin.Lazy r27 = r0.h(r1)
            ru.ok.onechat.reactions.ReactionsViewModel r0 = new ru.ok.onechat.reactions.ReactionsViewModel
            r10 = r0
            r10.<init>(r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        L_0x02bd:
            urc r9 = (defpackage.urc) r9
            trc r0 = r9.b
            if (r0 == 0) goto L_0x0310
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r0 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r0
            urc r1 = r0.N0
            if (r1 != 0) goto L_0x02ca
            goto L_0x0310
        L_0x02ca:
            kotlin.Lazy r2 = r0.O0
            java.lang.Object r2 = r2.getValue()
            vsc r2 = (defpackage.vsc) r2
            ru.ok.onechat.reactions.ReactionsViewModel r2 = r2.j()
            one.me.messages.list.loader.MessageModel r3 = r0.s0()
            if (r3 == 0) goto L_0x02de
            xd9 r6 = r3.y0
        L_0x02de:
            java.util.List r2 = r2.n(r6, r7)
            android.view.View r3 = r0.requireView()
            int r3 = r3.getMeasuredHeight()
            orb r4 = r0.a
            if (r4 == 0) goto L_0x02f8
            frb r4 = r4.getCallback()
            if (r4 == 0) goto L_0x02f8
            int r7 = r4.c()
        L_0x02f8:
            int r3 = r3 - r7
            int r4 = r0.W0
            int r3 = r3 - r4
            r1.a(r3, r2)
            androidx.recyclerview.widget.RecyclerView r1 = r1.d
            qw6 r2 = defpackage.qw6.KEYBOARD_TAP
            defpackage.b0h.K(r1, r2)
            tj7 r2 = new tj7
            r3 = 12
            r2.<init>(r3, r1, r0)
            defpackage.u3b.a(r1, r2)
        L_0x0310:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0313:
            lue r9 = (defpackage.lue) r9
            kotlin.Function r0 = r9.y
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x031f:
            float[] r0 = new float[r2]
            r1 = r7
        L_0x0322:
            if (r1 >= r2) goto L_0x0335
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r4 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r4
            r0[r1] = r3
            int r1 = r1 + r8
            goto L_0x0322
        L_0x0335:
            android.graphics.drawable.shapes.RoundRectShape r1 = new android.graphics.drawable.shapes.RoundRectShape
            r1.<init>(r0, r6, r6)
            android.graphics.drawable.ShapeDrawable r0 = new android.graphics.drawable.ShapeDrawable
            r0.<init>(r1)
            js9 r1 = defpackage.fu4.k
            occ r9 = (defpackage.occ) r9
            k2b r2 = r1.f(r9)
            df0 r2 = r2.c()
            int r2 = r2.d
            defpackage.iq.a0(r0, r2)
            int r2 = defpackage.cad.k1
            android.content.Context r3 = r9.getContext()
            fu4 r1 = r1.e(r3)
            k2b r1 = r1.f()
            u67 r1 = r1.getIcon()
            int r1 = r1.b
            android.content.Context r3 = r9.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ew3.b(r3, r2)
            defpackage.iq.a0(r2, r1)
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r3 = 2
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r3]
            r4[r7] = r0
            r4[r8] = r2
            r1.<init>(r4)
            r0 = 40
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            r1.setLayerSize(r7, r0, r0)
            r2 = 24
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            r1.setLayerSize(r8, r2, r2)
            r3 = 2
            int r0 = r0 / r3
            int r2 = r2 / r3
            int r12 = r0 - r2
            r13 = 0
            r14 = 0
            r10 = 1
            r9 = r1
            r11 = r12
            r9.setLayerInset(r10, r11, r12, r13, r14)
            return r1
        L_0x03b3:
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            aqg r9 = (defpackage.aqg) r9
            java.lang.Object r1 = r9.b
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r1 = r1.getValue()
            x23 r1 = (defpackage.x23) r1
            qjd r1 = (defpackage.qjd) r1
            ls7 r1 = r1.g
            java.lang.String r2 = "app.pushProxyList"
            java.lang.String r1 = r1.getString(r2, r6)
            r0.<init>(r1)
            return r0
        L_0x03cf:
            qwf r0 = new qwf
            ru.ok.messages.views.ProfileFragment r9 = (ru.ok.messages.views.ProfileFragment) r9
            androidx.fragment.app.b r1 = r9.E2()
            android.app.Application r1 = r1.getApplication()
            id3 r2 = defpackage.ryg.x(r9)
            qra r2 = (defpackage.qra) r2
            ltb r2 = r2.y()
            r0.<init>(r1, r2)
            return r0
        L_0x03e9:
            t56 r9 = (defpackage.t56) r9
            java.lang.Object r0 = r9.w
            zxb r0 = (defpackage.zxb) r0
            one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget r0 = (one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget) r0
            syb r0 = r0.e0()
            r0.getClass()
            wxb r1 = new wxb
            int r2 = defpackage.ixa.Y0
            vk3 r3 = r0.m()
            if (r3 == 0) goto L_0x0407
            java.lang.String r3 = r3.f()
            goto L_0x0408
        L_0x0407:
            r3 = r6
        L_0x0408:
            if (r3 != 0) goto L_0x040c
            java.lang.String r3 = ""
        L_0x040c:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            kgf r4 = new kgf
            java.util.List r3 = kotlin.collections.ArraysKt.toList((T[]) r3)
            r4.<init>(r2, r3)
            pg3 r2 = new pg3
            int r3 = defpackage.fxa.K
            int r5 = defpackage.ixa.X0
            igf r7 = new igf
            r7.<init>(r5)
            og3 r5 = defpackage.og3.a
            r2.<init>(r3, r7, r5)
            pg3 r3 = new pg3
            int r5 = defpackage.fxa.J
            int r7 = defpackage.ixa.W0
            igf r8 = new igf
            r8.<init>(r7)
            og3 r7 = defpackage.og3.b
            r3.<init>(r5, r8, r7)
            pg3[] r2 = new defpackage.pg3[]{r2, r3}
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            r1.<init>(r4, r6, r2)
            s85 r0 = r0.y0
            defpackage.xag.h(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x044c:
            kotlin.reflect.KProperty[] r0 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.Y
            one.me.profileedit.screens.changelink.ProfileChangeLinkScreen r9 = (one.me.profileedit.screens.changelink.ProfileChangeLinkScreen) r9
            r9.getClass()
            kotlin.reflect.KProperty[] r0 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.Y
            r0 = r0[r8]
            is r0 = r9.b
            java.lang.Object r0 = r0.a(r9)
            gzb r0 = (defpackage.gzb) r0
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0473
            if (r0 == r8) goto L_0x0473
            r1 = 2
            if (r0 != r1) goto L_0x046d
            jgd r0 = defpackage.jgd.SETTINGS_SHORTNAME_CHANGE
            goto L_0x0475
        L_0x046d:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0473:
            jgd r0 = defpackage.jgd.CHAT_LINK_EDITING
        L_0x0475:
            return r0
        L_0x0476:
            ru.ok.messages.services.PipWorker r9 = (ru.ok.messages.services.PipWorker) r9
            r9.getApplicationContext()
            id3 r0 = defpackage.ym.e()
            qra r0 = (defpackage.qra) r0
            mu8 r0 = r0.t()
            smb r0 = r0.X
            return r0
        L_0x0488:
            lg3 r9 = (defpackage.lg3) r9
            ig3 r0 = r9.getState()
            ig3 r1 = defpackage.ig3.ERROR
            if (r0 == r1) goto L_0x049d
            int r0 = defpackage.pq7.a
            int r0 = defpackage.pq7.c
            boolean r0 = defpackage.pq7.b(r0)
            if (r0 == 0) goto L_0x049d
            r7 = r8
        L_0x049d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L_0x04a2:
            int r0 = one.me.pinbars.PinBarsWidget.x
            zkb r0 = defpackage.zkb.a
            q4 r1 = r0.getAccessor()
            java.lang.Class<gaf> r2 = defpackage.gaf.class
            java.lang.Object r1 = r1.g(r2)
            r11 = r1
            gaf r11 = (defpackage.gaf) r11
            q4 r1 = r0.getAccessor()
            java.lang.Class<fq2> r2 = defpackage.fq2.class
            kotlin.Lazy r12 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            java.lang.Class<rl2> r2 = defpackage.rl2.class
            kotlin.Lazy r13 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            java.lang.Class<ur2> r2 = defpackage.ur2.class
            kotlin.Lazy r14 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            java.lang.Class<dy9> r2 = defpackage.dy9.class
            java.lang.Object r1 = r1.g(r2)
            r19 = r1
            dy9 r19 = (defpackage.dy9) r19
            q4 r1 = r0.getAccessor()
            java.lang.Class<e0b> r2 = defpackage.e0b.class
            kotlin.Lazy r20 = r1.h(r2)
            one.me.pinbars.PinBarsWidget r9 = (one.me.pinbars.PinBarsWidget) r9
            kotlin.Lazy r1 = r9.b
            java.lang.Object r1 = r1.getValue()
            r21 = r1
            alb r21 = (defpackage.alb) r21
            q4 r1 = r0.getAccessor()
            java.lang.Class<eu3> r2 = defpackage.eu3.class
            kotlin.Lazy r15 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            java.lang.Class<hl3> r2 = defpackage.hl3.class
            kotlin.Lazy r16 = r1.h(r2)
            q4 r1 = r0.getAccessor()
            java.lang.Class<zk3> r2 = defpackage.zk3.class
            kotlin.Lazy r17 = r1.h(r2)
            q4 r0 = r0.getAccessor()
            java.lang.Class<x23> r1 = defpackage.x23.class
            kotlin.Lazy r18 = r0.h(r1)
            blb r0 = new blb
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        L_0x0524:
            kotlin.reflect.KProperty[] r0 = one.me.chats.picker.PickerChatsListWidget.Z
            kib r0 = new kib
            cs2 r1 = defpackage.cs2.a
            q4 r2 = r1.getAccessor()
            java.lang.Class<xs2> r3 = defpackage.xs2.class
            java.lang.Object r2 = r2.g(r3)
            xs2 r2 = (defpackage.xs2) r2
            one.me.chats.picker.PickerChatsListWidget r9 = (one.me.chats.picker.PickerChatsListWidget) r9
            java.lang.String r3 = r9.b
            wt2 r2 = r2.a(r3)
            gaf r1 = r1.e()
            r0.<init>(r2, r1)
            return r0
        L_0x0546:
            kotlin.reflect.KProperty[] r0 = one.me.startconversation.chat.PickChatMembers.Z
            int r0 = defpackage.pq7.a
            int r0 = defpackage.pq7.c
            boolean r0 = defpackage.pq7.b(r0)
            if (r0 == 0) goto L_0x0557
            one.me.startconversation.chat.PickChatMembers r9 = (one.me.startconversation.chat.PickChatMembers) r9
            defpackage.kr7.z(r9)
        L_0x0557:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x055a:
            w28 r9 = (defpackage.w28) r9
            java.lang.Object r0 = r9.b
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            r1 = 1053609165(0x3ecccccd, float:0.4)
            float r1 = r1 * r0
            float r0 = r0 - r1
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ifb.invoke():java.lang.Object");
    }
}
