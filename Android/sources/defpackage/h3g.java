package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import one.me.messages.list.loader.MessageModel;

/* renamed from: h3g  reason: default package */
public final class h3g extends fzc {
    public final xj9 a;
    public final Function1 b;
    public final Function2 c;
    public final String d = h3g.class.getName();
    public final Lazy e;
    public final Lazy f;
    public final Rect g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final float k;
    public final sb2 l;

    public h3g(Lazy lazy, Lazy lazy2, h90 h90, xj9 xj9, hn9 hn9, zw zwVar) {
        this.a = xj9;
        this.b = hn9;
        this.c = zwVar;
        this.e = lazy;
        this.f = lazy2;
        this.g = new Rect();
        this.h = h90.a();
        boolean z = true;
        this.i = ((ltb) ((jtb) h90.b.getValue())).c.g.getBoolean("app.media.autoplay.gif", true);
        Lazy lazy3 = h90.c;
        z = ((Number) lazy3.getValue()).intValue() != 1 ? false : z;
        this.j = z;
        this.k = z ? 1.0f : 0.6f;
        this.l = new sb2(((Number) lazy3.getValue()).intValue(), this, 2);
    }

    public final void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            d(recyclerView, false);
        }
    }

    public final void c(i9g i9g, g3g g3g, t87 t87, MessageModel messageModel, n7g n7g, g4g g4g) {
        i9g.m(g3g, t87, messageModel.a, (messageModel.Z == null && messageModel.v0 == null && (messageModel.C0 == null || (messageModel.F0 & -2080374787) == 0)) ? false : true);
        i9g.setVideoClickListener(new e3g(g3g, n7g, g4g, this));
        i9g.setVideoLongClickListener(new r6(24, this));
        n7g.K0(true);
        n7g.g(c44.DEFAULT_ASPECT_RATIO);
        n7g.H0(g4g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:96:0x02c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(androidx.recyclerview.widget.RecyclerView r37, boolean r38) {
        /*
            r36 = this;
            r7 = r36
            androidx.recyclerview.widget.LinearLayoutManager r0 = defpackage.y7e.v(r37)
            r1 = -1
            if (r0 == 0) goto L_0x000f
            int r2 = r0.V0()
            r8 = r2
            goto L_0x0010
        L_0x000f:
            r8 = r1
        L_0x0010:
            if (r0 == 0) goto L_0x0018
            int r0 = r0.X0()
            r9 = r0
            goto L_0x0019
        L_0x0018:
            r9 = r1
        L_0x0019:
            r10 = 0
            if (r8 == r1) goto L_0x001e
            if (r9 != r1) goto L_0x0024
        L_0x001e:
            r0 = r7
            r16 = r8
            r1 = r9
            goto L_0x04d1
        L_0x0024:
            if (r8 > r9) goto L_0x04d0
            r11 = r37
            r12 = r8
        L_0x0029:
            pzc r0 = r11.M(r12)
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = r7.d
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x0036
            goto L_0x0052
        L_0x0036:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0052
            w78 r2 = defpackage.w78.o
            java.lang.String r3 = "Player autoplay. Can't find viewHolder, pos:"
            java.lang.String r4 = ", firstPos:"
            java.lang.String r5 = "|lastPos:"
            java.lang.StringBuilder r3 = defpackage.a81.n(r3, r12, r4, r8, r5)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r1.d(r2, r0, r3, r10)
        L_0x0052:
            r0 = r7
            r16 = r8
            r1 = r9
            r8 = r12
            goto L_0x04c3
        L_0x0059:
            boolean r1 = r0 instanceof defpackage.d99
            if (r1 == 0) goto L_0x0065
            d99 r0 = (defpackage.d99) r0
            android.view.View r1 = r0.G0
            boolean r2 = r1 instanceof defpackage.i9g
            if (r2 != 0) goto L_0x006d
        L_0x0065:
            r0 = r7
            r16 = r8
            r17 = r9
            r8 = r12
            goto L_0x04c1
        L_0x006d:
            if (r38 != 0) goto L_0x0096
            i9g r1 = (defpackage.i9g) r1
            android.view.View r1 = r1.getPreviewView()
            if (r1 != 0) goto L_0x0079
            android.view.View r1 = r0.G0
        L_0x0079:
            android.graphics.Rect r2 = r7.g
            boolean r3 = r1.getLocalVisibleRect(r2)
            if (r3 == 0) goto L_0x0093
            int r2 = r2.height()
            float r2 = (float) r2
            int r1 = r1.getMeasuredHeight()
            float r1 = (float) r1
            float r3 = r7.k
            float r1 = r1 * r3
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0093
            goto L_0x0096
        L_0x0093:
            r1 = 0
        L_0x0094:
            r13 = r1
            goto L_0x0098
        L_0x0096:
            r1 = 1
            goto L_0x0094
        L_0x0098:
            android.view.View r1 = r0.G0
            i9g r1 = (defpackage.i9g) r1
            boolean r1 = r1.k()
            java.lang.String r2 = "\n                                |playing:"
            java.lang.String r3 = "\n                                |isVisible:"
            java.lang.String r4 = "\n                                |hasPreview:"
            java.lang.String r5 = "Player autoplay. State already exist, \n                                |msgId:"
            java.lang.String r6 = "\n                                |states count:"
            java.lang.String r14 = "Player autoplay. State doesn't exist, \n                                |msgId:"
            java.lang.String r15 = ", \n                                |attachId:"
            java.lang.String r10 = "\n                                |previewUrl:"
            java.lang.String r11 = "\n                                |attachId:"
            r16 = r8
            java.lang.String r8 = ",\n                                |previewUrl:"
            r17 = r9
            java.lang.String r9 = "Player autoplay. Can't find video content, \n                                |msgId:"
            r18 = r12
            if (r13 == 0) goto L_0x02b9
            boolean r12 = r7.h
            if (r12 == 0) goto L_0x02b9
            if (r1 != 0) goto L_0x02b9
            android.view.View r1 = r0.G0
            i9g r1 = (defpackage.i9g) r1
            xj9 r12 = r7.a
            r19 = r2
            r20 = r3
            long r2 = r0.H0
            one.me.messages.list.loader.MessageModel r12 = r12.d(r2)
            if (r12 == 0) goto L_0x00dd
            xz r2 = r12.X
            if (r2 == 0) goto L_0x00dd
            o00 r2 = r2.d
            goto L_0x00de
        L_0x00dd:
            r2 = 0
        L_0x00de:
            boolean r3 = r2 instanceof defpackage.ede
            if (r3 == 0) goto L_0x00e6
            ede r2 = (defpackage.ede) r2
            r3 = r2
            goto L_0x00e7
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            if (r3 != 0) goto L_0x0118
            java.lang.String r0 = r7.d
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x00f0
            goto L_0x0114
        L_0x00f0:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0114
            w78 r2 = defpackage.w78.o
            if (r12 == 0) goto L_0x0101
            long r3 = r12.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0102
        L_0x0101:
            r3 = 0
        L_0x0102:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Player autoplay. Can't find videoAttach, msgId:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            r1.d(r2, r0, r3, r4)
        L_0x0114:
            r21 = r13
            goto L_0x02b1
        L_0x0118:
            kotlin.Lazy r2 = r7.f
            java.lang.Object r2 = r2.getValue()
            n5g r2 = (defpackage.n5g) r2
            r21 = r13
            java.lang.String r13 = r3.b
            i4g r2 = r2.f
            r2.getClass()
            g4g r13 = defpackage.i4g.a(r13)
            if (r13 != 0) goto L_0x0169
            java.lang.String r0 = r7.d
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x0137
            goto L_0x02b1
        L_0x0137:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x02b1
            w78 r2 = defpackage.w78.o
            long r4 = r3.a
            b3g r6 = r3.c
            android.net.Uri r6 = r6.b
            java.lang.String r3 = r3.b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r10.append(r4)
            r10.append(r8)
            r10.append(r6)
            r10.append(r11)
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            java.lang.String r3 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r3, (java.lang.String) null, 1, (java.lang.Object) null)
            r4 = 0
            r1.d(r2, r0, r3, r4)
            goto L_0x02b1
        L_0x0169:
            sb2 r2 = r7.l
            java.lang.String r8 = r3.b
            java.lang.Object r2 = r2.c(r8)
            g3g r2 = (defpackage.g3g) r2
            java.lang.String r8 = "\n                                |videoPos:"
            if (r2 != 0) goto L_0x0217
            java.lang.String r2 = r7.d
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x0186
        L_0x017d:
            r32 = r1
            r33 = r3
            r31 = r12
            r34 = r13
            goto L_0x01ce
        L_0x0186:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x017d
            w78 r5 = defpackage.w78.o
            r31 = r12
            long r11 = r3.a
            java.lang.String r9 = r3.b
            r32 = r1
            b3g r1 = r3.c
            android.net.Uri r1 = r1.b
            r19 = r2
            r33 = r3
            long r2 = r13.d()
            r34 = r13
            sb2 r13 = r7.l
            int r13 = r13.g()
            java.lang.StringBuilder r9 = defpackage.i2a.k(r14, r11, r15, r9)
            r9.append(r10)
            r9.append(r1)
            r9.append(r8)
            r9.append(r2)
            r9.append(r6)
            r9.append(r13)
            java.lang.String r1 = r9.toString()
            java.lang.String r1 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r1, (java.lang.String) null, 1, (java.lang.Object) null)
            r3 = r19
            r2 = 0
            r4.d(r5, r3, r1, r2)
        L_0x01ce:
            kotlin.Lazy r1 = r7.e
            java.lang.Object r1 = r1.getValue()
            ipb r1 = (defpackage.ipb) r1
            n7g r5 = r1.get()
            g3g r2 = new g3g
            r3 = r33
            java.lang.String r1 = r3.b
            long r8 = r0.H0
            kotlin.Lazy r0 = r7.e
            java.lang.Object r0 = r0.getValue()
            r27 = r0
            ipb r27 = (defpackage.ipb) r27
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r6 = r32
            r0.<init>(r6)
            sb2 r4 = r7.l
            r22 = r2
            r23 = r1
            r24 = r8
            r26 = r5
            r28 = r34
            r29 = r0
            r30 = r4
            r22.<init>(r23, r24, r26, r27, r28, r29, r30)
            java.lang.String r0 = r3.b
            r4.d(r0, r2)
            r0 = r36
            r1 = r6
            r4 = r31
            r6 = r34
            r0.c(r1, r2, r3, r4, r5, r6)
            goto L_0x02b1
        L_0x0217:
            r6 = r1
            r31 = r12
            r34 = r13
            n7g r9 = r2.c
            java.lang.String r0 = r7.d
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x022b
        L_0x0224:
            r22 = r2
            r33 = r3
            r32 = r6
            goto L_0x028b
        L_0x022b:
            boolean r11 = r1.c()
            if (r11 == 0) goto L_0x0224
            w78 r11 = defpackage.w78.o
            long r12 = r2.b
            java.lang.String r14 = r2.a
            b3g r7 = r3.c
            android.net.Uri r7 = r7.b
            r22 = r2
            r33 = r3
            long r2 = r34.d()
            r23 = r0
            boolean r0 = r6.r()
            r24 = r1
            boolean r1 = r6.o()
            r32 = r6
            boolean r6 = r9.a()
            java.lang.StringBuilder r5 = defpackage.i2a.k(r5, r12, r15, r14)
            r5.append(r10)
            r5.append(r7)
            r5.append(r8)
            r5.append(r2)
            r5.append(r4)
            r5.append(r0)
            r2 = r20
            r5.append(r2)
            r5.append(r1)
            r3 = r19
            r5.append(r3)
            r5.append(r6)
            java.lang.String r0 = r5.toString()
            java.lang.String r0 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r0, (java.lang.String) null, 1, (java.lang.Object) null)
            r2 = r23
            r3 = r24
            r1 = 0
            r3.d(r11, r2, r0, r1)
        L_0x028b:
            boolean r0 = r9.a()
            r2 = r22
            if (r0 == 0) goto L_0x02a3
            java.lang.ref.WeakReference r0 = r2.w
            java.lang.Object r0 = r0.get()
            i9g r0 = (defpackage.i9g) r0
            if (r0 == 0) goto L_0x02b1
            boolean r0 = r0.r()
            if (r0 != 0) goto L_0x02b1
        L_0x02a3:
            r0 = r36
            r1 = r32
            r3 = r33
            r4 = r31
            r5 = r9
            r6 = r34
            r0.c(r1, r2, r3, r4, r5, r6)
        L_0x02b1:
            r0 = r36
        L_0x02b3:
            r8 = r18
            r5 = r21
            goto L_0x04b0
        L_0x02b9:
            r21 = r13
            r35 = r3
            r3 = r2
            r2 = r35
            if (r21 == 0) goto L_0x0480
            r7 = r36
            boolean r12 = r7.i
            if (r12 == 0) goto L_0x0480
            if (r1 == 0) goto L_0x0480
            android.view.View r1 = r0.G0
            i9g r1 = (defpackage.i9g) r1
            xj9 r12 = r7.a
            r20 = r2
            r19 = r3
            long r2 = r0.H0
            one.me.messages.list.loader.MessageModel r12 = r12.d(r2)
            if (r12 == 0) goto L_0x02e3
            xz r2 = r12.X
            if (r2 == 0) goto L_0x02e3
            o00 r2 = r2.d
            goto L_0x02e4
        L_0x02e3:
            r2 = 0
        L_0x02e4:
            boolean r3 = r2 instanceof defpackage.ybe
            if (r3 == 0) goto L_0x02ec
            ybe r2 = (defpackage.ybe) r2
            r3 = r2
            goto L_0x02ed
        L_0x02ec:
            r3 = 0
        L_0x02ed:
            if (r3 != 0) goto L_0x031b
            java.lang.String r0 = r7.d
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x02f6
            goto L_0x02b1
        L_0x02f6:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x02b1
            w78 r2 = defpackage.w78.o
            if (r12 == 0) goto L_0x0307
            long r3 = r12.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0308
        L_0x0307:
            r3 = 0
        L_0x0308:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Player autoplay. Can't find imageAttach, msgId:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            r1.d(r2, r0, r3, r4)
            goto L_0x02b1
        L_0x031b:
            p87 r2 = r3.c
            android.net.Uri r13 = r2.l
            r22 = r4
            if (r13 == 0) goto L_0x0330
            tr6 r4 = new tr6
            r23 = r5
            int r5 = r2.c
            int r2 = r2.d
            r4.<init>(r13, r5, r2)
            r13 = r4
            goto L_0x0333
        L_0x0330:
            r23 = r5
            r13 = 0
        L_0x0333:
            if (r13 != 0) goto L_0x036f
            java.lang.String r0 = r7.d
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x033d
            goto L_0x02b1
        L_0x033d:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x02b1
            w78 r2 = defpackage.w78.o
            long r4 = r3.a
            p87 r6 = r3.c
            android.net.Uri r6 = r6.b
            java.lang.String r3 = r3.b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r10.append(r4)
            r10.append(r8)
            r10.append(r6)
            r10.append(r11)
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            java.lang.String r3 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r3, (java.lang.String) null, 1, (java.lang.Object) null)
            r4 = 0
            r1.d(r2, r0, r3, r4)
            goto L_0x02b1
        L_0x036f:
            sb2 r2 = r7.l
            java.lang.String r4 = r3.b
            java.lang.Object r2 = r2.c(r4)
            g3g r2 = (defpackage.g3g) r2
            if (r2 != 0) goto L_0x0400
            java.lang.String r2 = r7.d
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x0386
        L_0x0381:
            r33 = r12
            r34 = r13
            goto L_0x03bc
        L_0x0386:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x0381
            w78 r5 = defpackage.w78.o
            long r8 = r3.a
            java.lang.String r11 = r3.b
            r33 = r12
            p87 r12 = r3.c
            android.net.Uri r12 = r12.b
            r34 = r13
            sb2 r13 = r7.l
            int r13 = r13.g()
            java.lang.StringBuilder r8 = defpackage.i2a.k(r14, r8, r15, r11)
            r8.append(r10)
            r8.append(r12)
            r8.append(r6)
            r8.append(r13)
            java.lang.String r6 = r8.toString()
            java.lang.String r6 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r6, (java.lang.String) null, 1, (java.lang.Object) null)
            r8 = 0
            r4.d(r5, r2, r6, r8)
        L_0x03bc:
            kotlin.Lazy r2 = r7.e
            java.lang.Object r2 = r2.getValue()
            ipb r2 = (defpackage.ipb) r2
            n7g r5 = r2.get()
            g3g r2 = new g3g
            java.lang.String r4 = r3.b
            long r8 = r0.H0
            kotlin.Lazy r0 = r7.e
            java.lang.Object r0 = r0.getValue()
            r29 = r0
            ipb r29 = (defpackage.ipb) r29
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            sb2 r6 = r7.l
            r24 = r2
            r25 = r4
            r26 = r8
            r28 = r5
            r30 = r34
            r31 = r0
            r32 = r6
            r24.<init>(r25, r26, r28, r29, r30, r31, r32)
            java.lang.String r0 = r3.b
            r6.d(r0, r2)
            r0 = r36
            r4 = r33
            r6 = r34
            r0.c(r1, r2, r3, r4, r5, r6)
            goto L_0x02b1
        L_0x0400:
            r33 = r12
            r34 = r13
            n7g r5 = r2.c
            java.lang.String r0 = r7.d
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x040f
        L_0x040c:
            r24 = r3
            goto L_0x045d
        L_0x040f:
            boolean r6 = r4.c()
            if (r6 == 0) goto L_0x040c
            w78 r6 = defpackage.w78.o
            long r8 = r2.b
            java.lang.String r11 = r2.a
            p87 r12 = r3.c
            android.net.Uri r12 = r12.b
            boolean r13 = r1.r()
            boolean r14 = r1.o()
            boolean r7 = r5.a()
            r24 = r3
            r3 = r23
            java.lang.StringBuilder r3 = defpackage.i2a.k(r3, r8, r15, r11)
            r3.append(r10)
            r3.append(r12)
            r8 = r22
            r3.append(r8)
            r3.append(r13)
            r8 = r20
            r3.append(r8)
            r3.append(r14)
            r8 = r19
            r3.append(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r3, (java.lang.String) null, 1, (java.lang.Object) null)
            r7 = 0
            r4.d(r6, r0, r3, r7)
        L_0x045d:
            boolean r0 = r5.a()
            if (r0 == 0) goto L_0x0473
            java.lang.ref.WeakReference r0 = r2.w
            java.lang.Object r0 = r0.get()
            i9g r0 = (defpackage.i9g) r0
            if (r0 == 0) goto L_0x02b1
            boolean r0 = r0.r()
            if (r0 != 0) goto L_0x02b1
        L_0x0473:
            r0 = r36
            r3 = r24
            r4 = r33
            r6 = r34
            r0.c(r1, r2, r3, r4, r5, r6)
            goto L_0x02b1
        L_0x0480:
            r0 = r36
            java.lang.String r1 = r0.d
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x048a
            goto L_0x02b3
        L_0x048a:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x02b3
            w78 r3 = defpackage.w78.o
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Player autoplay. Don't find visible videoViewParent by this pos:"
            r4.<init>(r5)
            r8 = r18
            r4.append(r8)
            java.lang.String r5 = ", inVisibleArea:"
            r4.append(r5)
            r5 = r21
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r6 = 0
            r2.d(r3, r1, r4, r6)
        L_0x04b0:
            boolean r1 = r0.j
            if (r1 == 0) goto L_0x04c1
            sb2 r1 = r0.l
            int r1 = r1.g()
            if (r1 <= 0) goto L_0x04c1
            if (r5 == 0) goto L_0x04c1
            if (r38 != 0) goto L_0x04c1
            return
        L_0x04c1:
            r1 = r17
        L_0x04c3:
            if (r8 == r1) goto L_0x04d0
            int r12 = r8 + 1
            r11 = r37
            r7 = r0
            r9 = r1
            r8 = r16
            r10 = 0
            goto L_0x0029
        L_0x04d0:
            return
        L_0x04d1:
            java.lang.String r0 = r0.d
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x04d8
            goto L_0x04f0
        L_0x04d8:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x04f0
            w78 r3 = defpackage.w78.o
            java.lang.String r4 = "Player autoplay. Can't start autoplay because invalid positions, first:"
            java.lang.String r5 = ", last:"
            java.lang.String r6 = "."
            r7 = r16
            java.lang.String r1 = defpackage.a81.l(r4, r7, r5, r1, r6)
            r4 = 0
            r2.d(r3, r0, r1, r4)
        L_0x04f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h3g.d(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }
}
