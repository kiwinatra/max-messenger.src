package defpackage;

/* renamed from: ji4  reason: default package */
public final class ji4 extends j3h {
    public final boolean b;
    public boolean c;
    public ata o;

    public ji4(qge qge, boolean z) {
        super((Object) qge);
        this.b = z;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x00db */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e1 A[Catch:{ RuntimeException -> 0x00e7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ata n1(android.content.Context r9) {
        /*
            r8 = this;
            boolean r0 = r8.c
            if (r0 == 0) goto L_0x0008
            ata r8 = r8.o
            goto L_0x00fd
        L_0x0008:
            java.lang.Object r0 = r8.a
            qge r0 = (defpackage.qge) r0
            androidx.fragment.app.a r1 = r0.c
            int r0 = r0.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 != r3) goto L_0x0017
            r0 = r4
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            kc6 r3 = r1.V0
            if (r3 != 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            int r5 = r3.f
        L_0x0020:
            boolean r6 = r8.b
            if (r6 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x002d
            if (r3 != 0) goto L_0x002a
        L_0x0028:
            r3 = r2
            goto L_0x0040
        L_0x002a:
            int r3 = r3.d
            goto L_0x0040
        L_0x002d:
            if (r3 != 0) goto L_0x0030
            goto L_0x0028
        L_0x0030:
            int r3 = r3.e
            goto L_0x0040
        L_0x0033:
            if (r0 == 0) goto L_0x003b
            if (r3 != 0) goto L_0x0038
            goto L_0x0028
        L_0x0038:
            int r3 = r3.b
            goto L_0x0040
        L_0x003b:
            if (r3 != 0) goto L_0x003e
            goto L_0x0028
        L_0x003e:
            int r3 = r3.c
        L_0x0040:
            r1.K2(r2, r2, r2, r2)
            android.view.ViewGroup r2 = r1.R0
            r6 = 0
            if (r2 == 0) goto L_0x0057
            int r7 = defpackage.whc.visible_removing_fragment_view_tag
            java.lang.Object r2 = r2.getTag(r7)
            if (r2 == 0) goto L_0x0057
            android.view.ViewGroup r2 = r1.R0
            int r7 = defpackage.whc.visible_removing_fragment_view_tag
            r2.setTag(r7, r6)
        L_0x0057:
            android.view.ViewGroup r1 = r1.R0
            if (r1 == 0) goto L_0x0064
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L_0x0064
        L_0x0061:
            r2 = r6
            goto L_0x00f8
        L_0x0064:
            if (r3 != 0) goto L_0x00bb
            if (r5 == 0) goto L_0x00bb
            r1 = 4097(0x1001, float:5.741E-42)
            if (r5 == r1) goto L_0x00b3
            r1 = 8194(0x2002, float:1.1482E-41)
            if (r5 == r1) goto L_0x00ab
            r1 = 8197(0x2005, float:1.1486E-41)
            if (r5 == r1) goto L_0x0099
            r1 = 4099(0x1003, float:5.744E-42)
            if (r5 == r1) goto L_0x0091
            r1 = 4100(0x1004, float:5.745E-42)
            if (r5 == r1) goto L_0x007f
            r0 = -1
        L_0x007d:
            r3 = r0
            goto L_0x00bb
        L_0x007f:
            if (r0 == 0) goto L_0x0089
            r0 = 16842936(0x10100b8, float:2.3694074E-38)
            int r0 = defpackage.m58.K(r0, r9)
            goto L_0x007d
        L_0x0089:
            r0 = 16842937(0x10100b9, float:2.3694076E-38)
            int r0 = defpackage.m58.K(r0, r9)
            goto L_0x007d
        L_0x0091:
            if (r0 == 0) goto L_0x0096
            int r0 = defpackage.vcc.fragment_fade_enter
            goto L_0x007d
        L_0x0096:
            int r0 = defpackage.vcc.fragment_fade_exit
            goto L_0x007d
        L_0x0099:
            if (r0 == 0) goto L_0x00a3
            r0 = 16842938(0x10100ba, float:2.369408E-38)
            int r0 = defpackage.m58.K(r0, r9)
            goto L_0x007d
        L_0x00a3:
            r0 = 16842939(0x10100bb, float:2.3694082E-38)
            int r0 = defpackage.m58.K(r0, r9)
            goto L_0x007d
        L_0x00ab:
            if (r0 == 0) goto L_0x00b0
            int r0 = defpackage.vcc.fragment_close_enter
            goto L_0x007d
        L_0x00b0:
            int r0 = defpackage.vcc.fragment_close_exit
            goto L_0x007d
        L_0x00b3:
            if (r0 == 0) goto L_0x00b8
            int r0 = defpackage.vcc.fragment_open_enter
            goto L_0x007d
        L_0x00b8:
            int r0 = defpackage.vcc.fragment_open_exit
            goto L_0x007d
        L_0x00bb:
            if (r3 == 0) goto L_0x0061
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String r0 = r0.getResourceTypeName(r3)
            java.lang.String r1 = "anim"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00db
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r9, r3)     // Catch:{ NotFoundException -> 0x00d9, RuntimeException -> 0x00db }
            if (r1 == 0) goto L_0x0061
            ata r2 = new ata     // Catch:{ NotFoundException -> 0x00d9, RuntimeException -> 0x00db }
            r2.<init>((android.view.animation.Animation) r1)     // Catch:{ NotFoundException -> 0x00d9, RuntimeException -> 0x00db }
            goto L_0x00f8
        L_0x00d9:
            r8 = move-exception
            throw r8
        L_0x00db:
            android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r9, r3)     // Catch:{ RuntimeException -> 0x00e7 }
            if (r1 == 0) goto L_0x0061
            ata r2 = new ata     // Catch:{ RuntimeException -> 0x00e7 }
            r2.<init>((android.animation.Animator) r1)     // Catch:{ RuntimeException -> 0x00e7 }
            goto L_0x00f8
        L_0x00e7:
            r1 = move-exception
            if (r0 != 0) goto L_0x00f7
            android.view.animation.Animation r9 = android.view.animation.AnimationUtils.loadAnimation(r9, r3)
            if (r9 == 0) goto L_0x0061
            ata r0 = new ata
            r0.<init>((android.view.animation.Animation) r9)
            r2 = r0
            goto L_0x00f8
        L_0x00f7:
            throw r1
        L_0x00f8:
            r8.o = r2
            r8.c = r4
            r8 = r2
        L_0x00fd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ji4.n1(android.content.Context):ata");
    }
}
