package defpackage;

import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* renamed from: wq0  reason: default package */
public final /* synthetic */ class wq0 extends AdaptedFunctionReference implements Function2, SuspendFunction {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wq0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: fwb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: fwb} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v3, types: [e9d] */
    /* JADX WARNING: type inference failed for: r12v5, types: [e9d] */
    /* JADX WARNING: type inference failed for: r12v7, types: [e9d] */
    /* JADX WARNING: type inference failed for: r12v9, types: [e9d] */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r24, java.lang.Object r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = 7
            go4 r2 = defpackage.go4.a
            r3 = 67
            r4 = 14
            t0b r5 = defpackage.t0b.a
            r0b r6 = defpackage.r0b.a
            r7 = 3
            r8 = 5
            java.lang.String r9 = "BottomSheetWidget"
            r10 = 4
            r11 = 2
            r12 = 0
            r13 = 1
            r14 = 0
            int r15 = r0.a
            switch(r15) {
                case 0: goto L_0x0bef;
                case 1: goto L_0x0b9d;
                case 2: goto L_0x0b87;
                case 3: goto L_0x0abf;
                case 4: goto L_0x09ee;
                case 5: goto L_0x0927;
                case 6: goto L_0x0915;
                case 7: goto L_0x07fd;
                case 8: goto L_0x07aa;
                case 9: goto L_0x06a5;
                case 10: goto L_0x0693;
                case 11: goto L_0x0681;
                case 12: goto L_0x0639;
                case 13: goto L_0x0606;
                case 14: goto L_0x05f4;
                case 15: goto L_0x05e0;
                case 16: goto L_0x05ce;
                case 17: goto L_0x04e1;
                case 18: goto L_0x04a8;
                case 19: goto L_0x048c;
                case 20: goto L_0x0335;
                case 21: goto L_0x0321;
                case 22: goto L_0x028e;
                case 23: goto L_0x0208;
                case 24: goto L_0x014f;
                case 25: goto L_0x0118;
                case 26: goto L_0x00d5;
                case 27: goto L_0x0092;
                case 28: goto L_0x002f;
                default: goto L_0x001b;
            }
        L_0x001b:
            r1 = r24
            java.util.List r1 = (java.util.List) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            m2c r0 = (defpackage.m2c) r0
            kotlin.reflect.KProperty[] r2 = one.me.profile.screens.invite.ProfileInviteScreen.w
            r0.G(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x002f:
            r1 = r24
            a32 r1 = (defpackage.a32) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            zlb r0 = (defpackage.zlb) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicReference r2 = r1.Z
            y22 r3 = new y22
            r3.<init>(r1, r14)
            java.lang.Object r2 = r2.updateAndGet(r3)
            v7b r2 = (defpackage.v7b) r2
            if (r2 == 0) goto L_0x0052
            java.lang.Object r2 = r2.b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L_0x0053
        L_0x0052:
            r2 = r12
        L_0x0053:
            boolean r3 = r1.K()
            if (r3 == 0) goto L_0x005d
            boolean r13 = r1.x()
        L_0x005d:
            if (r2 == 0) goto L_0x0085
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0066
            goto L_0x0085
        L_0x0066:
            dmb r3 = new dmb
            a89 r1 = r1.v
            if (r1 == 0) goto L_0x0079
            ha9 r1 = r1.a
            long r4 = r1.b
            mgf r1 = new mgf
            r1.<init>(r2)
            r3.<init>(r4, r1, r13)
            goto L_0x0087
        L_0x0079:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0085:
            cmb r3 = defpackage.cmb.a
        L_0x0087:
            xme r0 = r0.h
            r0.getClass()
            r0.m(r12, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0092:
            r1 = r24
            java.lang.String r1 = (java.lang.String) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            skb r0 = (defpackage.skb) r0
            kotlin.reflect.KProperty[] r2 = one.me.chats.picker.members.PickerMembersListWidget.v0
            if (r1 == 0) goto L_0x00c1
            r0.getClass()
            int r2 = r1.length()
            if (r2 != 0) goto L_0x00ac
            goto L_0x00c1
        L_0x00ac:
            f14 r2 = defpackage.f14.b
            qkb r3 = new qkb
            r3.<init>(r0, r1, r12)
            aje r1 = defpackage.xag.g(r0, r12, r2, r3, r13)
            kotlin.reflect.KProperty[] r2 = defpackage.skb.y
            r2 = r2[r14]
            wie r3 = r0.x
            r3.setValue(r0, r2, r1)
            goto L_0x00d2
        L_0x00c1:
            r0.getClass()
            kotlin.reflect.KProperty[] r1 = defpackage.skb.y
            r1 = r1[r14]
            wie r2 = r0.x
            r2.setValue(r0, r1, r12)
            xme r0 = r0.w
            r0.setValue(r12)
        L_0x00d2:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00d5:
            r1 = r24
            java.lang.String r1 = (java.lang.String) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            akb r0 = (defpackage.akb) r0
            kotlin.reflect.KProperty[] r2 = one.me.chats.picker.contacts.PickerContactsListWidget.x0
            if (r1 == 0) goto L_0x0104
            r0.getClass()
            int r2 = r1.length()
            if (r2 != 0) goto L_0x00ef
            goto L_0x0104
        L_0x00ef:
            f14 r2 = defpackage.f14.b
            xjb r3 = new xjb
            r3.<init>(r0, r1, r12)
            aje r1 = defpackage.xag.g(r0, r12, r2, r3, r13)
            kotlin.reflect.KProperty[] r2 = defpackage.akb.w
            r2 = r2[r14]
            wie r3 = r0.v
            r3.setValue(r0, r2, r1)
            goto L_0x0115
        L_0x0104:
            r0.getClass()
            kotlin.reflect.KProperty[] r1 = defpackage.akb.w
            r1 = r1[r14]
            wie r2 = r0.v
            r2.setValue(r0, r1, r12)
            ju3 r0 = r0.c
            r0.b()
        L_0x0115:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0118:
            r1 = r24
            java.lang.String r1 = (java.lang.String) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            jib r0 = (defpackage.jib) r0
            kotlin.reflect.KProperty[] r2 = one.me.chats.picker.chats.PickerChatsListWidget2.w0
            if (r1 == 0) goto L_0x0147
            r0.getClass()
            boolean r2 = kotlin.text.StringsKt.isBlank(r1)
            if (r2 == 0) goto L_0x0132
            goto L_0x0147
        L_0x0132:
            f14 r2 = defpackage.f14.b
            cib r3 = new cib
            r3.<init>(r0, r1, r12)
            aje r1 = defpackage.xag.g(r0, r12, r2, r3, r13)
            kotlin.reflect.KProperty[] r2 = defpackage.jib.D0
            r2 = r2[r14]
            wie r3 = r0.Z
            r3.setValue(r0, r2, r1)
            goto L_0x014c
        L_0x0147:
            xme r0 = r0.y0
            r0.setValue(r12)
        L_0x014c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x014f:
            r1 = r24
            pg9 r1 = (defpackage.pg9) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.chats.picker.PickerChatController r0 = (one.me.chats.picker.PickerChatController) r0
            e9d r2 = r0.w0
            if (r2 != 0) goto L_0x0161
            goto L_0x0205
        L_0x0161:
            og9 r1 = r1.a
            int r1 = r1.ordinal()
            sn0 r3 = r0.X
            if (r1 == 0) goto L_0x01e8
            if (r1 == r13) goto L_0x01b2
            if (r1 == r11) goto L_0x0171
            goto L_0x0205
        L_0x0171:
            fb6 r1 = r0.x0
            one.me.sdk.arch.Widget r1 = r1.b
            one.me.chats.picker.PickerChatController r1 = (one.me.chats.picker.PickerChatController) r1
            sn0 r1 = r1.X
            boolean r2 = r1.isInitialized()
            if (r2 == 0) goto L_0x0188
            java.lang.Object r1 = r1.getValue()
            dc9 r1 = (defpackage.dc9) r1
            r1.e(r13)
        L_0x0188:
            java.lang.Object r1 = r3.getValue()
            dc9 r1 = (defpackage.dc9) r1
            int r2 = defpackage.cad.c1
            r1.setLeftIcon(r2)
            xme r1 = defpackage.pq7.f
            ql8 r2 = new ql8
            r3 = 21
            r2.<init>(r1, r3)
            eu5 r1 = defpackage.bs0.Y(r2, r13)
            ahb r2 = new ahb
            r2.<init>(r0, r12)
            ps5 r3 = new ps5
            r3.<init>(r1, r2, r8)
            tu7 r0 = r0.getViewLifecycleScope()
            defpackage.bs0.K(r3, r0)
            goto L_0x0205
        L_0x01b2:
            boolean r1 = r2.n()
            if (r1 != 0) goto L_0x01cc
            one.me.keyboardmedia.MediaKeyboardWidget r1 = new one.me.keyboardmedia.MediaKeyboardWidget
            r6 = 0
            r8 = 1
            java.lang.String r5 = r0.a
            r9 = 2
            r10 = 0
            r4 = r1
            r4.<init>(r5, r6, r8, r9, r10)
            i9d r1 = defpackage.iq.n(r1, r12, r12)
            r2.R(r1)
        L_0x01cc:
            android.view.View r1 = r0.e0()
            java.util.WeakHashMap r2 = defpackage.gag.a
            defpackage.v9g.u(r1, r12)
            xr8 r0 = r0.y0
            if (r0 == 0) goto L_0x01dc
            r0.f()
        L_0x01dc:
            java.lang.Object r0 = r3.getValue()
            dc9 r0 = (defpackage.dc9) r0
            int r1 = defpackage.cad.g1
            r0.setLeftIcon(r1)
            goto L_0x0205
        L_0x01e8:
            xr8 r1 = r0.y0
            if (r1 == 0) goto L_0x01f1
            kotlin.reflect.KProperty[] r2 = defpackage.xr8.m
            r1.e(r13)
        L_0x01f1:
            java.lang.Object r1 = r3.getValue()
            dc9 r1 = (defpackage.dc9) r1
            int r2 = defpackage.cad.c1
            r1.setLeftIcon(r2)
            android.view.View r0 = r0.e0()
            yh7 r1 = one.me.chats.picker.PickerChatController.A0
            defpackage.h88.f(r0, r1, r12)
        L_0x0205:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0208:
            r1 = r24
            ww9 r1 = (defpackage.ww9) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            ix9 r0 = (defpackage.ix9) r0
            r0.getClass()
            java.util.Set r2 = r1.a
            boolean r2 = r2.isEmpty()
            rk9 r3 = r0.d
            androidx.recyclerview.widget.RecyclerView r5 = r0.a
            if (r2 == 0) goto L_0x0247
            fz2 r1 = r0.e
            if (r1 == 0) goto L_0x022a
            r5.r0(r1)
        L_0x022a:
            r0.e = r12
            ia4 r1 = r0.f
            if (r1 == 0) goto L_0x0233
            r5.t0(r1)
        L_0x0233:
            r0.f = r12
            dx9 r0 = new dx9
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r0.<init>(r14, r1)
            xme r1 = r3.w
            r1.getClass()
            r1.m(r12, r0)
            goto L_0x028b
        L_0x0247:
            fz2 r2 = r0.e
            if (r2 != 0) goto L_0x0273
            fz2 r2 = new fz2
            c28 r6 = new c28
            r6.<init>(r4, r0)
            gx9 r4 = new gx9
            r4.<init>(r0, r14)
            gx9 r7 = new gx9
            r7.<init>(r0, r13)
            gx9 r8 = new gx9
            r8.<init>(r0, r11)
            r2.<init>(r6, r4, r7, r8)
            r5.j(r2)
            r0.e = r2
            ia4 r2 = new ia4
            r2.<init>(r5)
            r5.l(r2)
            r0.f = r2
        L_0x0273:
            dx9 r0 = new dx9
            java.util.Set r2 = r1.a
            int r2 = r2.size()
            java.util.List r1 = r1.b
            r0.<init>(r2, r1)
            xme r1 = r3.w
            r1.getClass()
            r1.m(r12, r0)
            r5.a0()
        L_0x028b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x028e:
            r1 = r24
            vw9 r1 = (defpackage.vw9) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            hx9 r0 = (defpackage.hx9) r0
            r0.getClass()
            boolean r2 = r1.a
            ird r3 = r0.d
            androidx.recyclerview.widget.RecyclerView r4 = r0.a
            if (r2 != 0) goto L_0x02c1
            vo3 r1 = r0.e
            if (r1 == 0) goto L_0x02ac
            r4.r0(r1)
        L_0x02ac:
            r0.e = r12
            ia4 r1 = r0.f
            if (r1 == 0) goto L_0x02b5
            r4.t0(r1)
        L_0x02b5:
            r0.f = r12
            boolean r0 = r3.c()
            if (r0 == 0) goto L_0x031e
            r3.b()
            goto L_0x031e
        L_0x02c1:
            vo3 r2 = r0.e
            if (r2 != 0) goto L_0x02e3
            vo3 r2 = new vo3
            ex9 r5 = new ex9
            r5.<init>(r0, r13)
            fx9 r6 = new fx9
            r6.<init>(r0, r13)
            r2.<init>(r5, r6)
            r4.j(r2)
            r0.e = r2
            ia4 r2 = new ia4
            r2.<init>(r4)
            r4.l(r2)
            r0.f = r2
        L_0x02e3:
            java.util.Set r2 = r1.b
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x02f6
            android.content.Context r2 = r4.getContext()
            int r5 = defpackage.n1b.H
            java.lang.String r2 = r2.getString(r5)
            goto L_0x030c
        L_0x02f6:
            android.content.Context r5 = r4.getContext()
            int r6 = defpackage.n1b.I
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r5.getString(r6, r2)
        L_0x030c:
            ex9 r5 = new ex9
            r5.<init>(r0, r14)
            fx9 r6 = new fx9
            r6.<init>(r0, r14)
            java.util.List r0 = r1.c
            r3.a(r2, r0, r5, r6)
            r4.a0()
        L_0x031e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0321:
            r1 = r24
            java.util.List r1 = (java.util.List) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            k1e r0 = (defpackage.k1e) r0
            kotlin.reflect.KProperty[] r2 = one.me.messages.settings.MessagesSettingsScreen.w
            r0.G(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0335:
            r1 = r24
            v5a r1 = (defpackage.v5a) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.messages.list.ui.MessagesListWidget r0 = (one.me.messages.list.ui.MessagesListWidget) r0
            kotlin.reflect.KProperty[] r2 = one.me.messages.list.ui.MessagesListWidget.R0
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.pa4
            if (r2 == 0) goto L_0x0353
            fk9 r0 = defpackage.fk9.b
            pa4 r1 = (defpackage.pa4) r1
            r0.Y0(r1)
            goto L_0x0489
        L_0x0353:
            boolean r2 = r1 instanceof defpackage.l4b
            kotlin.Lazy r3 = r0.y
            if (r2 == 0) goto L_0x0370
            java.lang.Object r0 = r3.getValue()
            lf1 r0 = (defpackage.lf1) r0
            r2 = r1
            l4b r2 = (defpackage.l4b) r2
            long r3 = r2.b
            x99 r5 = new x99
            r5.<init>((defpackage.v5a) r1, (int) r13)
            boolean r1 = r2.c
            r0.j(r3, r1, r5)
            goto L_0x0489
        L_0x0370:
            boolean r2 = r1 instanceof defpackage.z3b
            if (r2 == 0) goto L_0x038e
            java.lang.Object r0 = r3.getValue()
            r2 = r0
            lf1 r2 = (defpackage.lf1) r2
            r0 = r1
            z3b r0 = (defpackage.z3b) r0
            java.lang.String r3 = r0.d
            x99 r7 = new x99
            r7.<init>((defpackage.v5a) r1, (int) r11)
            r6 = 0
            r4 = 1
            boolean r5 = r0.c
            r2.i(r3, r4, r5, r6, r7)
            goto L_0x0489
        L_0x038e:
            boolean r2 = r1 instanceof defpackage.m4b
            if (r2 == 0) goto L_0x03d1
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.INSERT"
            r2.<init>(r3)
            java.lang.String r3 = "vnd.android.cursor.dir/raw_contact"
            r2.setType(r3)
            m4b r1 = (defpackage.m4b) r1
            java.lang.String r3 = r1.c
            java.lang.String r4 = "name"
            r2.putExtra(r4, r3)
            java.lang.String r3 = "phone"
            java.lang.String r4 = r1.d
            r2.putExtra(r3, r4)
            android.content.Context r0 = r0.getContext()     // Catch:{ ActivityNotFoundException -> 0x03b7 }
            r0.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x03b7 }
            goto L_0x0489
        L_0x03b7:
            java.lang.Class<one.me.messages.list.ui.MessagesListWidget> r0 = one.me.messages.list.ui.MessagesListWidget.class
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error creating a new contact #"
            r2.<init>(r3)
            long r3 = r1.b
            java.lang.String r1 = " in phonebook"
            java.lang.String r1 = defpackage.wj6.m(r2, r3, r1)
            defpackage.z68.f(r0, r1, r12)
            goto L_0x0489
        L_0x03d1:
            boolean r2 = r1 instanceof defpackage.c4b
            if (r2 == 0) goto L_0x03e2
            android.content.Context r0 = r0.getContext()
            c4b r1 = (defpackage.c4b) r1
            java.lang.String r1 = r1.b
            defpackage.kw3.b(r0, r1)
            goto L_0x0489
        L_0x03e2:
            boolean r2 = r1 instanceof defpackage.d4b
            if (r2 == 0) goto L_0x0403
            d4b r1 = (defpackage.d4b) r1
            android.content.Intent r2 = r1.b
            android.content.Context r3 = r0.getContext()     // Catch:{ Exception -> 0x03f3 }
            r3.startActivity(r2)     // Catch:{ Exception -> 0x03f3 }
            goto L_0x0489
        L_0x03f3:
            java.lang.String r3 = "*/*"
            android.net.Uri r1 = r1.c
            r2.setDataAndType(r1, r3)
            android.content.Context r0 = r0.getContext()
            r0.startActivity(r2)
            goto L_0x0489
        L_0x0403:
            boolean r2 = r1 instanceof defpackage.i4b
            if (r2 == 0) goto L_0x0436
            fk9 r0 = defpackage.fk9.b
            i4b r1 = (defpackage.i4b) r1
            android.os.Parcelable r2 = r1.b
            r0.getClass()
            java.lang.String r3 = "message"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r3, r2)
            kotlin.Pair[] r2 = new kotlin.Pair[]{r2}
            android.os.Bundle r2 = defpackage.o54.f(r2)
            ta4 r0 = r0.W0()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ":attach/fullscreen?attachment_id="
            r3.<init>(r4)
            java.lang.String r1 = r1.c
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.b(r1, r2)
            goto L_0x0489
        L_0x0436:
            boolean r2 = r1 instanceof defpackage.cj7
            if (r2 == 0) goto L_0x0454
            vi9 r0 = defpackage.vi9.a
            q4 r0 = r0.getAccessor()
            java.lang.Class<ta4> r2 = defpackage.ta4.class
            java.lang.Object r0 = r0.g(r2)
            ta4 r0 = (defpackage.ta4) r0
            cj7 r1 = (defpackage.cj7) r1
            java.lang.Object r1 = r1.a
            bb4 r1 = (defpackage.bb4) r1
            android.net.Uri r1 = r1.a
            r0.c(r1, r12)
            goto L_0x0489
        L_0x0454:
            boolean r2 = r1 instanceof defpackage.ne5
            if (r2 == 0) goto L_0x0476
            fk9 r0 = defpackage.fk9.b
            ne5 r1 = (defpackage.ne5) r1
            java.lang.String r1 = r1.b
            ta4 r0 = r0.W0()
            java.lang.String r2 = "params"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r2, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1}
            android.os.Bundle r1 = defpackage.o54.f(r1)
            java.lang.String r2 = ":external_callback"
            r0.b(r2, r1)
            goto L_0x0489
        L_0x0476:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown navigation event "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = r0.a
            defpackage.z68.f(r0, r1, r12)
        L_0x0489:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x048c:
            r1 = r24
            java.lang.String r1 = (java.lang.String) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            r49 r0 = (defpackage.r49) r0
            kotlin.reflect.KProperty[] r2 = one.me.members.list.MembersListWidget.B0
            kotlin.Lazy r0 = r0.z
            java.lang.Object r0 = r0.getValue()
            z49 r0 = (defpackage.z49) r0
            r0.a(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x04a8:
            r1 = r24
            n85 r1 = (defpackage.n85) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            qr8 r0 = (defpackage.qr8) r0
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.pr8
            if (r2 != 0) goto L_0x04bc
            goto L_0x04de
        L_0x04bc:
            r2 = r1
            pr8 r2 = (defpackage.pr8) r2
            boolean r4 = r2 instanceof defpackage.lr8
            dc9 r0 = r0.b
            if (r4 == 0) goto L_0x04cd
            lr8 r1 = (defpackage.lr8) r1
            java.lang.CharSequence r1 = r1.a
            r0.f(r1)
            goto L_0x04de
        L_0x04cd:
            boolean r1 = r2 instanceof defpackage.kr8
            if (r1 == 0) goto L_0x04de
            r0.getClass()
            android.view.KeyEvent r1 = new android.view.KeyEvent
            r1.<init>(r14, r3)
            bc9 r0 = r0.c
            r0.dispatchKeyEvent(r1)
        L_0x04de:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x04e1:
            r1 = r24
            pg9 r1 = (defpackage.pg9) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.chatscreen.mediabar.MediaBarWidget r0 = (one.me.chatscreen.mediabar.MediaBarWidget) r0
            kotlin.reflect.KProperty[] r2 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            r0.getClass()
            og9 r1 = r1.a
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x05b0
            if (r1 == r13) goto L_0x0537
            if (r1 == r11) goto L_0x0500
            goto L_0x05cb
        L_0x0500:
            fb6 r1 = r0.Z0
            r1.getClass()
            one.me.sdk.arch.Widget r1 = r1.b
            one.me.chatscreen.mediabar.MediaBarWidget r1 = (one.me.chatscreen.mediabar.MediaBarWidget) r1
            dc9 r1 = r1.m0()
            r1.e(r13)
            dc9 r1 = r0.m0()
            int r2 = defpackage.cad.c1
            r1.setLeftIcon(r2)
            xme r1 = defpackage.pq7.f
            ql8 r2 = new ql8
            r2.<init>(r1, r14)
            eu5 r1 = defpackage.bs0.Y(r2, r13)
            rl8 r2 = new rl8
            r2.<init>(r12, r0)
            ps5 r3 = new ps5
            r3.<init>(r1, r2, r8)
            tu7 r0 = r0.getViewLifecycleScope()
            defpackage.bs0.K(r3, r0)
            goto L_0x05cb
        L_0x0537:
            e9d r1 = r0.l0()
            boolean r1 = r1.n()
            if (r1 != 0) goto L_0x058f
            e9d r1 = r0.l0()
            one.me.keyboardmedia.MediaKeyboardWidget r8 = new one.me.keyboardmedia.MediaKeyboardWidget
            android.os.Bundle r2 = r0.getArgs()
            java.lang.String r3 = "scope_id"
            java.lang.Class<egd> r4 = defpackage.egd.class
            java.lang.Object r2 = defpackage.n54.k(r2, r3, r4)
            if (r2 == 0) goto L_0x0579
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            egd r2 = (defpackage.egd) r2
            kotlin.reflect.KProperty[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            r3 = r3[r14]
            is r3 = r0.b
            java.lang.Object r3 = r3.a(r0)
            java.lang.Number r3 = (java.lang.Number) r3
            long r4 = r3.longValue()
            java.lang.String r3 = r2.a
            r6 = 1
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r6, r7)
            i9d r2 = defpackage.iq.n(r8, r12, r12)
            r1.R(r2)
            goto L_0x058f
        L_0x0579:
            java.lang.String r0 = r4.getSimpleName()
            java.lang.String r1 = "No value passed for key scope_id of type "
            java.lang.String r2 = " in bundle"
            java.lang.String r0 = defpackage.wj6.k(r1, r0, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x058f:
            android.widget.LinearLayout r1 = r0.h0()
            java.util.WeakHashMap r2 = defpackage.gag.a
            defpackage.v9g.u(r1, r12)
            orb r1 = r0.n0()
            r1.k()
            xr8 r1 = r0.a1
            if (r1 == 0) goto L_0x05a6
            r1.f()
        L_0x05a6:
            dc9 r0 = r0.m0()
            int r1 = defpackage.cad.g1
            r0.setLeftIcon(r1)
            goto L_0x05cb
        L_0x05b0:
            xr8 r1 = r0.a1
            if (r1 == 0) goto L_0x05b9
            kotlin.reflect.KProperty[] r2 = defpackage.xr8.m
            r1.e(r13)
        L_0x05b9:
            dc9 r1 = r0.m0()
            int r2 = defpackage.cad.c1
            r1.setLeftIcon(r2)
            android.widget.LinearLayout r0 = r0.h0()
            yh7 r1 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            defpackage.h88.f(r0, r1, r12)
        L_0x05cb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x05ce:
            r1 = r24
            java.lang.String r1 = (java.lang.String) r1
            r2 = r25
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.receiver
            z68 r0 = (defpackage.z68) r0
            defpackage.z68.c(r1, r2, new java.lang.Object[0])
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x05e0:
            r1 = r24
            java.util.List r1 = (java.util.List) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            ny5 r0 = (defpackage.ny5) r0
            kotlin.reflect.KProperty[] r2 = one.me.folders.edit.FolderEditScreen.y
            r0.G(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x05f4:
            r1 = r24
            k2b r1 = (defpackage.k2b) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            hd4 r0 = (defpackage.hd4) r0
            r0.onThemeChanged(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0606:
            r1 = r24
            java.lang.String r1 = (java.lang.String) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            ju3 r0 = (defpackage.ju3) r0
            kotlin.Lazy r2 = r0.d
            java.lang.Object r2 = r2.getValue()
            gaf r2 = (defpackage.gaf) r2
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            f14 r3 = defpackage.f14.b
            iu3 r4 = new iu3
            r4.<init>(r0, r1, r12)
            d14 r1 = r0.a
            aje r1 = defpackage.ev0.u(r1, r2, r3, r4)
            kotlin.reflect.KProperty[] r2 = defpackage.ju3.j
            r2 = r2[r14]
            wie r3 = r0.f
            r3.setValue(r0, r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0639:
            r1 = r24
            go4 r1 = (defpackage.go4) r1
            r3 = r25
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r0.receiver
            vr3 r0 = (defpackage.vr3) r0
            r0.getClass()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x067b
            vk3 r1 = r0.F()
            if (r1 != 0) goto L_0x0655
            goto L_0x0678
        L_0x0655:
            kotlin.Pair r1 = r0.E(r1)
            etc r2 = r0.e
            ome r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            fwb r2 = (defpackage.fwb) r2
            if (r2 == 0) goto L_0x0675
            java.lang.Object r3 = r1.getFirst()
            owb r3 = (defpackage.owb) r3
            java.lang.Object r1 = r1.getSecond()
            java.util.List r1 = (java.util.List) r1
            fwb r12 = defpackage.fwb.a(r2, r3, r1, r10)
        L_0x0675:
            r0.f(r12)
        L_0x0678:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x067b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0681:
            r1 = r24
            fwb r1 = (defpackage.fwb) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            vr3 r0 = (defpackage.vr3) r0
            r0.f(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0693:
            r1 = r24
            qz1 r1 = (defpackage.qz1) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            cm3 r0 = (defpackage.cm3) r0
            r0.d(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x06a5:
            r9 = r24
            java.lang.String r9 = (java.lang.String) r9
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            ov2 r0 = (defpackage.ov2) r0
            r0.getClass()
            if (r9 == 0) goto L_0x07a7
            boolean r2 = kotlin.text.StringsKt.isBlank(r9)
            if (r2 == 0) goto L_0x06be
            goto L_0x07a7
        L_0x06be:
            fd8 r0 = r0.o
            r0.getClass()
            long r3 = java.lang.System.nanoTime()
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.String r5 = "fd8"
            java.lang.String r6 = "searchChatsAndMessages start"
            defpackage.z68.j(r5, r6, r2)
            r0.a()
            r0.q = r9
            java.lang.String r2 = r0.r
            boolean r2 = defpackage.cvg.A(r2)
            if (r2 != 0) goto L_0x06e0
            java.lang.String r2 = r0.r
            goto L_0x06e1
        L_0x06e0:
            r2 = r12
        L_0x06e1:
            z52 r5 = new z52
            r5.<init>(r1, r0, r9)
            mka r1 = new mka
            r1.<init>(r11, r5)
            zc8 r5 = new zc8
            r5.<init>(r11)
            hce r6 = new hce
            r6.<init>(r1, r5, r12)
            zc8 r1 = new zc8
            r1.<init>(r7)
            wbe r1 = r6.i(r1)
            lfd r5 = r0.c
            fce r1 = r1.n(r5)
            xc8 r6 = new xc8
            r6.<init>(r0, r14)
            tbe r15 = new tbe
            r15.<init>(r1, r6, r14)
            fce r1 = r0.e(r9)
            zc8 r6 = new zc8
            r6.<init>(r10)
            wbe r1 = r1.i(r6)
            r0.c()
            yt r6 = new yt
            r10 = 29
            r6.<init>(r9, r2, r10)
            pbf r2 = r0.d
            wbf r2 = (defpackage.wbf) r2
            r2.getClass()
            pbb r10 = new pbb
            r8 = 20
            r10.<init>(r8, r2, r6)
            mka r2 = new mka
            r2.<init>(r13, r10)
            fce r2 = r2.j(r5)
            xc8 r6 = new xc8
            r6.<init>(r0, r7)
            wbe r2 = r2.i(r6)
            zc8 r6 = new zc8
            r6.<init>(r14)
            hce r8 = new hce
            r8.<init>(r2, r6, r12)
            zc8 r2 = new zc8
            r2.<init>(r13)
            wbe r2 = r8.i(r2)
            fce r2 = r2.n(r5)
            lbe[] r6 = new defpackage.lbe[r7]
            r6[r14] = r15
            r6[r13] = r1
            r6[r11] = r2
            wv5 r1 = defpackage.wv5.a(r6)
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r6 = "maxConcurrency"
            defpackage.iq.h0(r2, r6)
            lw5 r2 = new lw5
            r2.<init>(r1)
            cd8 r1 = new cd8
            r1.<init>()
            zc8 r6 = new zc8
            r7 = 5
            r6.<init>(r7)
            fj6 r7 = new fj6
            r7.<init>(r1)
            yv5 r1 = new yv5
            r1.<init>(r2, r7, r6, r11)
            cx5 r7 = new cx5
            r7.<init>(r1, r5, r13)
            ad8 r8 = new ad8
            r6 = 0
            r1 = r8
            r2 = r0
            r5 = r9
            r1.<init>(r2, r3, r5, r6)
            yc8 r1 = new yc8
            r1.<init>(r0, r9, r13)
            pr7 r2 = new pr7
            r2.<init>(r8, r1)
            r7.c(r2)
            r0.i = r2
        L_0x07a7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x07aa:
            r1 = r24
            ta r1 = (defpackage.ta) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.chatscreen.ChatScreen r0 = (one.me.chatscreen.ChatScreen) r0
            kotlin.reflect.KProperty[] r2 = one.me.chatscreen.ChatScreen.d1
            r0.getClass()
            kotlin.reflect.KProperty[] r2 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            one.me.sdk.messagewrite.markdown.AddLinkBottomSheet r2 = new one.me.sdk.messagewrite.markdown.AddLinkBottomSheet
            java.lang.String r3 = r0.F0
            r2.<init>(r3, r1, r12)
            r2.setTargetController(r0)
        L_0x07c7:
            zx3 r1 = r0.getParentController()
            if (r1 == 0) goto L_0x07d2
            zx3 r0 = r0.getParentController()
            goto L_0x07c7
        L_0x07d2:
            boolean r1 = r0 instanceof defpackage.l9d
            if (r1 == 0) goto L_0x07d9
            l9d r0 = (defpackage.l9d) r0
            goto L_0x07da
        L_0x07d9:
            r0 = r12
        L_0x07da:
            if (r0 == 0) goto L_0x07e0
            e9d r12 = r0.K()
        L_0x07e0:
            if (r12 == 0) goto L_0x07fa
            i9d r0 = new i9d
            r18 = 0
            r21 = -1
            r17 = 0
            r19 = 0
            r20 = 0
            r15 = r0
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            defpackage.a81.t(r14, r0, r13, r9)
            r12.G(r0)
        L_0x07fa:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x07fd:
            r2 = r24
            n85 r2 = (defpackage.n85) r2
            r4 = r25
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            java.lang.Object r0 = r0.receiver
            one.me.chatscreen.ChatScreen r0 = (one.me.chatscreen.ChatScreen) r0
            kotlin.reflect.KProperty[] r4 = one.me.chatscreen.ChatScreen.d1
            r0.getClass()
            boolean r4 = r2 instanceof defpackage.pr8
            if (r4 == 0) goto L_0x0912
            kotlin.reflect.KProperty[] r4 = one.me.chatscreen.ChatScreen.d1
            r1 = r4[r1]
            kotlin.properties.ReadOnlyProperty r4 = r0.K0
            java.lang.Object r1 = r4.getValue(r0, r1)
            oz1 r1 = (defpackage.oz1) r1
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0826
            goto L_0x0912
        L_0x0826:
            r1 = r2
            pr8 r1 = (defpackage.pr8) r1
            boolean r4 = r1 instanceof defpackage.lr8
            if (r4 == 0) goto L_0x0840
            one.me.sdk.messagewrite.MessageWriteWidget r0 = r0.r0()
            if (r0 == 0) goto L_0x0912
            lr8 r2 = (defpackage.lr8) r2
            java.lang.CharSequence r1 = r2.a
            dc9 r0 = r0.d0()
            r0.f(r1)
            goto L_0x0912
        L_0x0840:
            boolean r4 = r1 instanceof defpackage.mr8
            if (r4 == 0) goto L_0x085c
            mr8 r2 = (defpackage.mr8) r2
            ar7 r1 = r2.a
            ar7 r2 = defpackage.ar7.EMOJI
            if (r1 != r2) goto L_0x084f
            tb9 r1 = defpackage.tb9.a
            goto L_0x0851
        L_0x084f:
            tb9 r1 = defpackage.tb9.c
        L_0x0851:
            mh9 r0 = r0.q0()
            lg9 r2 = defpackage.lg9.o
            r0.q(r2, r1)
            goto L_0x0912
        L_0x085c:
            boolean r4 = r1 instanceof defpackage.kr8
            if (r4 == 0) goto L_0x0879
            one.me.sdk.messagewrite.MessageWriteWidget r0 = r0.r0()
            if (r0 == 0) goto L_0x0912
            dc9 r0 = r0.d0()
            r0.getClass()
            android.view.KeyEvent r1 = new android.view.KeyEvent
            r1.<init>(r14, r3)
            bc9 r0 = r0.c
            r0.dispatchKeyEvent(r1)
            goto L_0x0912
        L_0x0879:
            boolean r3 = r1 instanceof defpackage.or8
            if (r3 == 0) goto L_0x08e3
            lp2 r1 = r0.B0()
            or8 r2 = (defpackage.or8) r2
            long r7 = r2.a
            mh9 r2 = r0.q0()
            java.lang.Long r6 = r2.l()
            gaf r2 = r1.l()
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            f14 r3 = defpackage.f14.b
            yo2 r10 = new yo2
            r9 = 0
            r4 = r10
            r5 = r1
            r4.<init>(r5, r6, r7, r9)
            jx3 r4 = r1.a
            aje r2 = defpackage.ev0.u(r4, r2, r3, r10)
            kotlin.reflect.KProperty[] r3 = defpackage.lp2.X0
            r3 = r3[r13]
            wie r4 = r1.E0
            r4.setValue(r1, r3, r2)
            mh9 r0 = r0.q0()
            r0.u(r12)
            un2 r0 = defpackage.un2.a
            q4 r0 = r0.getAccessor()
            java.lang.Class<qc7> r1 = defpackage.qc7.class
            java.lang.Object r0 = r0.j(r1)
            qc7 r0 = (defpackage.qc7) r0
            if (r0 == 0) goto L_0x0912
            pc7 r1 = new pc7
            nc7 r2 = defpackage.nc7.SEND_3_STICKERS
            r1.<init>(r2, r13)
            pc7 r2 = new pc7
            nc7 r3 = defpackage.nc7.SEND_5_MESSAGES
            r2.<init>(r3, r13)
            pc7[] r1 = new defpackage.pc7[]{r1, r2}
            java.util.Set r1 = kotlin.collections.SetsKt.setOf(r1)
            jgd r2 = defpackage.jgd.CHAT
            r0.f(r1, r2)
            goto L_0x0912
        L_0x08e3:
            boolean r1 = r1 instanceof defpackage.nr8
            if (r1 == 0) goto L_0x090c
            lp2 r0 = r0.B0()
            gaf r1 = r0.l()
            osa r1 = (defpackage.osa) r1
            q04 r1 = r1.a()
            f14 r2 = defpackage.f14.b
            zo2 r3 = new zo2
            r3.<init>(r0, r12)
            jx3 r4 = r0.a
            aje r1 = defpackage.ev0.u(r4, r1, r2, r3)
            kotlin.reflect.KProperty[] r2 = defpackage.lp2.X0
            r2 = r2[r11]
            wie r3 = r0.F0
            r3.setValue(r0, r2, r1)
            goto L_0x0912
        L_0x090c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0912:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0915:
            r1 = r24
            fwb r1 = (defpackage.fwb) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            em2 r0 = (defpackage.em2) r0
            r0.f(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0927:
            r1 = r24
            x3c r1 = (defpackage.x3c) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.profile.screens.members.ChatMembersScreen r0 = (one.me.profile.screens.members.ChatMembersScreen) r0
            kotlin.reflect.KProperty[] r2 = one.me.profile.screens.members.ChatMembersScreen.X
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.v3c
            if (r2 == 0) goto L_0x095e
            e0b r2 = new e0b
            r2.<init>((one.me.sdk.arch.Widget) r0)
            r2.f(r6)
            v3c r1 = (defpackage.v3c) r1
            ngf r1 = r1.a
            r2.h(r1)
            r2.g(r5)
            ms1 r1 = new ms1
            r1.<init>(r4, r0)
            r2.d(r1)
            z3a r1 = r2.j()
            r0.z = r1
            goto L_0x09e5
        L_0x095e:
            boolean r2 = r1 instanceof defpackage.u3c
            if (r2 == 0) goto L_0x09c8
            kotlin.reflect.KProperty[] r2 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            u3c r1 = (defpackage.u3c) r1
            ngf r2 = r1.a
            android.os.Bundle r3 = r1.d
            ng3 r2 = defpackage.b0h.a(r2, r3, r10)
            ngf r3 = r1.b
            r2.f(r3)
            java.util.List r1 = r1.c
            java.util.Collection r1 = (java.util.Collection) r1
            pg3[] r3 = new defpackage.pg3[r14]
            java.lang.Object[] r1 = r1.toArray(r3)
            pg3[] r1 = (defpackage.pg3[]) r1
            int r3 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            pg3[] r1 = (defpackage.pg3[]) r1
            r2.a(r1)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r1 = r2.e()
            r1.setTargetController(r0)
            r2 = r0
        L_0x0991:
            zx3 r3 = r2.getParentController()
            if (r3 == 0) goto L_0x099c
            zx3 r2 = r2.getParentController()
            goto L_0x0991
        L_0x099c:
            boolean r3 = r2 instanceof defpackage.l9d
            if (r3 == 0) goto L_0x09a3
            l9d r2 = (defpackage.l9d) r2
            goto L_0x09a4
        L_0x09a3:
            r2 = r12
        L_0x09a4:
            if (r2 == 0) goto L_0x09aa
            e9d r12 = r2.K()
        L_0x09aa:
            r1.p0(r0)
            if (r12 == 0) goto L_0x09e5
            i9d r0 = new i9d
            r18 = 0
            r21 = -1
            r17 = 0
            r19 = 0
            r20 = 0
            r15 = r0
            r16 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21)
            defpackage.a81.t(r14, r0, r13, r9)
            r12.G(r0)
            goto L_0x09e5
        L_0x09c8:
            boolean r2 = r1 instanceof defpackage.w3c
            if (r2 == 0) goto L_0x09e8
            e0b r2 = new e0b
            r2.<init>((one.me.sdk.arch.Widget) r0)
            o0b r0 = new o0b
            int r3 = defpackage.cad.o
            r0.<init>(r3)
            r2.f(r0)
            w3c r1 = (defpackage.w3c) r1
            ngf r0 = r1.a
            r2.h(r0)
            r2.j()
        L_0x09e5:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x09e8:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x09ee:
            r1 = r24
            x3c r1 = (defpackage.x3c) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.profile.screens.members.compact.ChatMembersCompactWidget r0 = (one.me.profile.screens.members.compact.ChatMembersCompactWidget) r0
            kotlin.reflect.KProperty[] r2 = one.me.profile.screens.members.compact.ChatMembersCompactWidget.x
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.v3c
            if (r2 == 0) goto L_0x0a27
            e0b r2 = new e0b
            r2.<init>((one.me.sdk.arch.Widget) r0)
            r2.f(r6)
            v3c r1 = (defpackage.v3c) r1
            ngf r1 = r1.a
            r2.h(r1)
            r2.g(r5)
            ms1 r1 = new ms1
            r3 = 12
            r1.<init>(r3, r0)
            r2.d(r1)
            z3a r1 = r2.j()
            r0.o = r1
            goto L_0x0ab6
        L_0x0a27:
            boolean r2 = r1 instanceof defpackage.u3c
            if (r2 == 0) goto L_0x0a99
            kotlin.reflect.KProperty[] r2 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            u3c r1 = (defpackage.u3c) r1
            ngf r2 = r1.a
            android.os.Bundle r3 = r1.d
            ng3 r2 = defpackage.b0h.a(r2, r3, r10)
            ngf r3 = r1.b
            r2.f(r3)
            nj2 r3 = new nj2
            java.lang.String r20 = "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;"
            r21 = 8
            r16 = 1
            java.lang.Class<ng3> r18 = defpackage.ng3.class
            java.lang.String r19 = "addButton"
            r22 = 0
            r15 = r3
            r17 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            lj2 r4 = new lj2
            r4.<init>(r3, r14)
            java.util.List r1 = r1.c
            r1.forEach(r4)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r1 = r2.e()
            r1.setTargetController(r0)
            r2 = r0
        L_0x0a62:
            zx3 r3 = r2.getParentController()
            if (r3 == 0) goto L_0x0a6d
            zx3 r2 = r2.getParentController()
            goto L_0x0a62
        L_0x0a6d:
            boolean r3 = r2 instanceof defpackage.l9d
            if (r3 == 0) goto L_0x0a74
            l9d r2 = (defpackage.l9d) r2
            goto L_0x0a75
        L_0x0a74:
            r2 = r12
        L_0x0a75:
            if (r2 == 0) goto L_0x0a7b
            e9d r12 = r2.K()
        L_0x0a7b:
            r1.p0(r0)
            if (r12 == 0) goto L_0x0ab6
            i9d r0 = new i9d
            r18 = 0
            r21 = -1
            r17 = 0
            r19 = 0
            r20 = 0
            r15 = r0
            r16 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21)
            defpackage.a81.t(r14, r0, r13, r9)
            r12.G(r0)
            goto L_0x0ab6
        L_0x0a99:
            boolean r2 = r1 instanceof defpackage.w3c
            if (r2 == 0) goto L_0x0ab9
            e0b r2 = new e0b
            r2.<init>((one.me.sdk.arch.Widget) r0)
            o0b r0 = new o0b
            int r3 = defpackage.cad.o
            r0.<init>(r3)
            r2.f(r0)
            w3c r1 = (defpackage.w3c) r1
            ngf r0 = r1.a
            r2.h(r0)
            r2.j()
        L_0x0ab6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0ab9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0abf:
            r1 = r24
            x3c r1 = (defpackage.x3c) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.profile.screens.members.ChatAdminsScreen r0 = (one.me.profile.screens.members.ChatAdminsScreen) r0
            kotlin.reflect.KProperty[] r2 = one.me.profile.screens.members.ChatAdminsScreen.Z
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.v3c
            if (r2 == 0) goto L_0x0af7
            e0b r2 = new e0b
            r2.<init>((one.me.sdk.arch.Widget) r0)
            r2.f(r6)
            v3c r1 = (defpackage.v3c) r1
            ngf r1 = r1.a
            r2.h(r1)
            r2.g(r5)
            ms1 r1 = new ms1
            r3 = 6
            r1.<init>(r3, r0)
            r2.d(r1)
            z3a r1 = r2.j()
            r0.X = r1
            goto L_0x0b7e
        L_0x0af7:
            boolean r2 = r1 instanceof defpackage.u3c
            if (r2 == 0) goto L_0x0b61
            kotlin.reflect.KProperty[] r2 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            u3c r1 = (defpackage.u3c) r1
            ngf r2 = r1.a
            android.os.Bundle r3 = r1.d
            ng3 r2 = defpackage.b0h.a(r2, r3, r10)
            ngf r3 = r1.b
            r2.f(r3)
            java.util.List r1 = r1.c
            java.util.Collection r1 = (java.util.Collection) r1
            pg3[] r3 = new defpackage.pg3[r14]
            java.lang.Object[] r1 = r1.toArray(r3)
            pg3[] r1 = (defpackage.pg3[]) r1
            int r3 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            pg3[] r1 = (defpackage.pg3[]) r1
            r2.a(r1)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r1 = r2.e()
            r1.setTargetController(r0)
            r2 = r0
        L_0x0b2a:
            zx3 r3 = r2.getParentController()
            if (r3 == 0) goto L_0x0b35
            zx3 r2 = r2.getParentController()
            goto L_0x0b2a
        L_0x0b35:
            boolean r3 = r2 instanceof defpackage.l9d
            if (r3 == 0) goto L_0x0b3c
            l9d r2 = (defpackage.l9d) r2
            goto L_0x0b3d
        L_0x0b3c:
            r2 = r12
        L_0x0b3d:
            if (r2 == 0) goto L_0x0b43
            e9d r12 = r2.K()
        L_0x0b43:
            r1.p0(r0)
            if (r12 == 0) goto L_0x0b7e
            i9d r0 = new i9d
            r18 = 0
            r21 = -1
            r17 = 0
            r19 = 0
            r20 = 0
            r15 = r0
            r16 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21)
            defpackage.a81.t(r14, r0, r13, r9)
            r12.G(r0)
            goto L_0x0b7e
        L_0x0b61:
            boolean r2 = r1 instanceof defpackage.w3c
            if (r2 == 0) goto L_0x0b81
            e0b r2 = new e0b
            r2.<init>((one.me.sdk.arch.Widget) r0)
            o0b r0 = new o0b
            int r3 = defpackage.cad.o
            r0.<init>(r3)
            r2.f(r0)
            w3c r1 = (defpackage.w3c) r1
            ngf r0 = r1.a
            r2.h(r0)
            r2.j()
        L_0x0b7e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0b81:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0b87:
            r1 = r24
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            b11 r0 = (defpackage.b11) r0
            r0.setVolumeMicrophone(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0b9d:
            r1 = r24
            go4 r1 = (defpackage.go4) r1
            r3 = r25
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r0.receiver
            yq0 r0 = (defpackage.yq0) r0
            r0.getClass()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0be9
            kotlin.Lazy r1 = r0.f
            java.lang.Object r1 = r1.getValue()
            eu3 r1 = (defpackage.eu3) r1
            long r2 = r0.a
            etc r1 = r1.c(r2)
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            vk3 r1 = (defpackage.vk3) r1
            if (r1 != 0) goto L_0x0bcb
            goto L_0x0be6
        L_0x0bcb:
            fwb r1 = r0.E(r1)
            etc r2 = r0.e
            ome r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            fwb r2 = (defpackage.fwb) r2
            if (r2 == 0) goto L_0x0be3
            owb r3 = r1.a
            java.util.List r1 = r1.b
            fwb r12 = defpackage.fwb.a(r2, r3, r1, r10)
        L_0x0be3:
            r0.f(r12)
        L_0x0be6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0be9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0bef:
            r1 = r24
            fwb r1 = (defpackage.fwb) r1
            r2 = r25
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            yq0 r0 = (defpackage.yq0) r0
            r0.f(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
