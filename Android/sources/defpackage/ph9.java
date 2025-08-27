package defpackage;

import kotlin.jvm.functions.Function1;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: ph9  reason: default package */
public final /* synthetic */ class ph9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ ph9(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    /* JADX WARNING: type inference failed for: r1v21, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r2 = 3
            r3 = 2
            r4 = -1
            r5 = 5
            r6 = 0
            one.me.sdk.messagewrite.MessageWriteWidget r7 = r0.b
            r8 = 1
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x0186;
                case 1: goto L_0x0171;
                case 2: goto L_0x0143;
                case 3: goto L_0x012b;
                case 4: goto L_0x0111;
                default: goto L_0x000f;
            }
        L_0x000f:
            r0 = r20
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            kotlin.reflect.KProperty[] r9 = one.me.sdk.messagewrite.MessageWriteWidget.C0
            r7.getClass()
            dc9 r9 = new dc9
            android.content.Context r10 = r0.getContext()
            r9.<init>(r10)
            android.content.Context r10 = r9.getContext()
            sh9 r15 = new sh9
            mh9 r13 = r7.h0()
            java.lang.Class<mh9> r14 = defpackage.mh9.class
            java.lang.String r16 = "onEmojiClick"
            r12 = 0
            java.lang.String r17 = "onEmojiClick(ZZ)V"
            r18 = 0
            r11 = r15
            r1 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17)
            cq6 r11 = new cq6
            r11.<init>(r8, r1)
            android.view.GestureDetector r1 = new android.view.GestureDetector
            r1.<init>(r10, r11)
            r1.setIsLongpressEnabled(r6)
            pg6 r10 = new pg6
            r10.<init>(r1, r5)
            r9.setLeftInnerIconTouchListener(r10)
            r9.setRightInnerIconVisible(r8)
            android.content.Context r1 = r9.getContext()
            rh9 r10 = new rh9
            r10.<init>((int) r8, (java.lang.Object) r7)
            cq6 r11 = new cq6
            r11.<init>(r8, r10)
            android.view.GestureDetector r10 = new android.view.GestureDetector
            r10.<init>(r1, r11)
            r10.setIsLongpressEnabled(r6)
            pg6 r1 = new pg6
            r1.<init>(r10, r5)
            r9.setRightInnerIconTouchListener(r1)
            android.content.Context r1 = r9.getContext()
            rh9 r5 = new rh9
            r5.<init>((int) r3, (java.lang.Object) r7)
            rh9 r3 = new rh9
            r3.<init>((int) r2, (java.lang.Object) r7)
            hq7 r10 = new hq7
            r11 = 6
            r10.<init>((int) r11, (java.lang.Object) r7)
            t53 r11 = new t53
            r11.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r3)
            android.view.GestureDetector r2 = new android.view.GestureDetector
            r2.<init>(r1, r11)
            ke1 r1 = new ke1
            r1.<init>(r8, r10, r2)
            r9.setRightOuterIconTouchListener(r1)
            kotlin.Lazy r1 = r7.x
            java.lang.Object r1 = r1.getValue()
            uj5 r1 = (defpackage.uj5) r1
            vj5 r1 = (defpackage.vj5) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f117videomsgenabled
            boolean r1 = r1.m(r2, r6)
            r9.setVideoMessageEnabled(r1)
            ng1 r1 = new ng1
            r2 = 9
            r1.<init>(r2, r7)
            r9.setVideoMessageTouchListener(r1)
            kotlin.Lazy r1 = r7.z
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00da
            ph9 r1 = new ph9
            r1.<init>(r7, r6)
            ne1 r2 = new ne1
            r3 = 8
            r2.<init>(r3, r1, r9)
            bc9 r1 = r9.c
            r1.addTextChangedListener(r2)
        L_0x00da:
            qh9 r1 = new qh9
            r1.<init>(r6, r7)
            r9.setInputKeyListener(r1)
            ph9 r1 = new ph9
            r1.<init>(r7, r8)
            r9.setCustomSelectionActionModeCallback(r1)
            r0.addView(r9)
            oz1 r1 = new oz1
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            int r2 = defpackage.xya.x
            r1.setId(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r2.<init>(r4, r3)
            r3 = 80
            r2.gravity = r3
            r1.setLayoutParams(r2)
            r1.setBackgroundColor(r6)
            r0.addView(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0111:
            r0 = r20
            android.net.Uri r0 = (android.net.Uri) r0
            kotlin.reflect.KProperty[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.C0
            mh9 r1 = r7.h0()
            r1.getClass()
            zg9 r2 = new zg9
            r2.<init>(r0)
            s85 r0 = r1.Z
            defpackage.xag.h(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x012b:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            kotlin.reflect.KProperty[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.C0
            if (r0 == 0) goto L_0x0140
            mh9 r0 = r7.h0()
            lg9 r1 = defpackage.lg9.b
            defpackage.mh9.o(r0, r1, r3)
        L_0x0140:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0143:
            r0 = r20
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            kotlin.reflect.KProperty[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.C0
            ph9 r1 = new ph9
            r1.<init>(r7, r5)
            r7.getClass()
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            android.content.Context r3 = r0.getContext()
            r2.<init>(r3)
            int r3 = defpackage.xya.w
            r2.setId(r3)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r5 = -2
            r3.<init>(r4, r5)
            r2.setLayoutParams(r3)
            r1.invoke(r2)
            r0.addView(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0171:
            r0 = r20
            android.widget.EditText r0 = (android.widget.EditText) r0
            kotlin.reflect.KProperty[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.C0
            hf8 r1 = new hf8
            ch2 r2 = new ch2
            r3 = 16
            r2.<init>(r3, r7)
            r1.<init>(r0, r2)
            r7.y0 = r1
            return r1
        L_0x0186:
            r0 = r20
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            kotlin.reflect.KProperty[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.C0
            if (r0 == 0) goto L_0x01be
            int r1 = r0.length()
            int r1 = r1 - r8
            r2 = r6
            r3 = r2
        L_0x0195:
            if (r2 > r1) goto L_0x01b8
            if (r3 != 0) goto L_0x019b
            r5 = r2
            goto L_0x019c
        L_0x019b:
            r5 = r1
        L_0x019c:
            char r5 = r0.charAt(r5)
            r9 = 32
            int r5 = kotlin.jvm.internal.Intrinsics.compare((int) r5, (int) r9)
            if (r5 > 0) goto L_0x01aa
            r5 = r8
            goto L_0x01ab
        L_0x01aa:
            r5 = r6
        L_0x01ab:
            if (r3 != 0) goto L_0x01b3
            if (r5 != 0) goto L_0x01b1
            r3 = r8
            goto L_0x0195
        L_0x01b1:
            int r2 = r2 + r8
            goto L_0x0195
        L_0x01b3:
            if (r5 != 0) goto L_0x01b6
            goto L_0x01b8
        L_0x01b6:
            int r1 = r1 + r4
            goto L_0x0195
        L_0x01b8:
            int r1 = r1 + r8
            java.lang.CharSequence r1 = r0.subSequence(r2, r1)
            goto L_0x01bf
        L_0x01be:
            r1 = 0
        L_0x01bf:
            if (r1 == 0) goto L_0x01c7
            int r1 = r1.length()
            if (r1 != 0) goto L_0x01c8
        L_0x01c7:
            r6 = r8
        L_0x01c8:
            r1 = r6 ^ 1
            if (r1 == 0) goto L_0x01d9
            if (r0 == 0) goto L_0x01d9
            char r0 = kotlin.text.StringsKt.last(r0)
            r1 = 10
            if (r0 != r1) goto L_0x01d9
            r7.l0()
        L_0x01d9:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ph9.invoke(java.lang.Object):java.lang.Object");
    }
}
