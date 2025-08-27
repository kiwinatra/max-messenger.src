package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: qo3  reason: default package */
public final /* synthetic */ class qo3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qo3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: p1a} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.text.Spanned, android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 0
            java.lang.Object r1 = r4.c
            java.lang.Object r2 = r4.b
            int r4 = r4.a
            switch(r4) {
                case 0: goto L_0x00d6;
                case 1: goto L_0x0089;
                case 2: goto L_0x0037;
                default: goto L_0x000a;
            }
        L_0x000a:
            android.view.View r5 = (android.view.View) r5
            h69 r6 = (defpackage.h69) r6
            ru.ok.messages.suggests.SuggestsViewModel r2 = (ru.ok.messages.suggests.SuggestsViewModel) r2
            xme r4 = r2.r
            java.lang.Object r4 = r4.getValue()
            o85 r4 = (defpackage.o85) r4
            java.lang.Object r4 = r4.a
            b2f r4 = (defpackage.b2f) r4
            r2.u = r4
            r2.z = r6
            z1f r4 = new z1f
            p1a r5 = r2.D
            if (r5 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r5
        L_0x0028:
            android.graphics.Point r5 = r0.Z(r6)
            zuf r1 = (defpackage.zuf) r1
            r4.<init>(r1, r5, r6)
            r2.o(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L_0x0037:
            android.view.View r5 = (android.view.View) r5
            o0f r6 = (defpackage.o0f) r6
            kotlin.reflect.KProperty[] r4 = one.me.sdk.messagewrite.MessageWriteWidget.C0
            v0f r2 = (defpackage.v0f) r2
            i69 r4 = r2.w
            one.me.sdk.messagewrite.MessageWriteWidget r1 = (one.me.sdk.messagewrite.MessageWriteWidget) r1
            dc9 r1 = r1.d0()
            r4.getClass()
            java.lang.CharSequence r4 = r1.getText()
            if (r4 == 0) goto L_0x0054
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r4)
        L_0x0054:
            ome r4 = r1.getMessagePosition()
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r0 == 0) goto L_0x0086
            j0f r4 = defpackage.i69.a(r0, r4, r6)
            if (r4 == 0) goto L_0x0086
            kotlin.reflect.KProperty[] r3 = one.me.sdk.messagewrite.MessageWriteWidget.C0
            i0f r3 = new i0f
            r3.<init>(r5, r6)
            xme r5 = r2.K0
            r5.setValue(r3)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            int r4 = r0.getSpanEnd(r4)
            l40 r5 = new l40
            r6 = 13
            r5.<init>(r1, r4, r6)
            r1.post(r5)
        L_0x0086:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L_0x0089:
            java.util.List r5 = (java.util.List) r5
            java.util.List r6 = (java.util.List) r6
            kotlin.reflect.KProperty[] r4 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            int r4 = r6.size()
            int r0 = r5.size()
            if (r4 <= r0) goto L_0x00a4
            int r4 = r6.size()
            int r4 = r4 + -1
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r2.z0(r4)
        L_0x00a4:
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L_0x00d3
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r4 = r6.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x00d3
            one.me.chatscreen.mediabar.MediaBarWidget r1 = (one.me.chatscreen.mediabar.MediaBarWidget) r1
            android.widget.LinearLayout r4 = r1.h0()
            boolean r5 = r4.isLaidOut()
            if (r5 == 0) goto L_0x00ca
            boolean r5 = r4.isLayoutRequested()
            if (r5 != 0) goto L_0x00ca
            one.me.chatscreen.mediabar.MediaBarWidget.e0(r1)
            goto L_0x00d3
        L_0x00ca:
            em8 r5 = new em8
            r6 = 0
            r5.<init>(r1, r6)
            r4.addOnLayoutChangeListener(r5)
        L_0x00d3:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L_0x00d6:
            java.lang.Long r5 = (java.lang.Long) r5
            long r4 = r5.longValue()
            android.view.View r6 = (android.view.View) r6
            zo3 r2 = (defpackage.zo3) r2
            boolean r0 = r2.Y
            t56 r1 = (defpackage.t56) r1
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r4 = r1.w
            ro3 r4 = (defpackage.ro3) r4
            r4.b1()
            goto L_0x0101
        L_0x00ee:
            java.lang.CharSequence r0 = r2.w
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r6 = r1.w
            ro3 r6 = (defpackage.ro3) r6
            r6.v(r4)
            goto L_0x0101
        L_0x00fa:
            java.lang.Object r0 = r1.w
            ro3 r0 = (defpackage.ro3) r0
            r0.H(r4, r6)
        L_0x0101:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo3.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
