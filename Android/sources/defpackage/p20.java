package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: p20  reason: default package */
public final class p20 extends p6c {
    public final /* synthetic */ int D0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p20(View view, int i) {
        super(view);
        this.D0 = i;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M(defpackage.lz7 r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = ""
            r2 = 0
            android.view.View r3 = r0.a
            int r0 = r0.D0
            switch(r0) {
                case 0: goto L_0x0107;
                case 1: goto L_0x00fb;
                case 2: goto L_0x00ca;
                case 3: goto L_0x00ab;
                case 4: goto L_0x0091;
                case 5: goto L_0x008b;
                case 6: goto L_0x0070;
                case 7: goto L_0x0064;
                case 8: goto L_0x003a;
                case 9: goto L_0x001d;
                default: goto L_0x000c;
            }
        L_0x000c:
            r0 = r18
            j3c r0 = (defpackage.j3c) r0
            e7e r3 = (defpackage.e7e) r3
            g7e r0 = r3.o
            r1 = 1
            r0.c = r1
            f7e r0 = r0.b
            r0.c()
            return
        L_0x001d:
            r0 = r18
            c3c r0 = (defpackage.c3c) r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r1 = r0.a
            r3.setText(r1)
            x2 r1 = new x2
            r4 = 29
            r1.<init>(r0, r2, r4)
            defpackage.b0h.H(r3, r1)
            ogf r1 = defpackage.puf.a
            ogf r0 = r0.c
            r0.b(r3, defpackage.uy4.b)
            return
        L_0x003a:
            r0 = r18
            r3c r0 = (defpackage.r3c) r0
            r1e r3 = (defpackage.r1e) r3
            s1e r1 = new s1e
            int r2 = defpackage.jxa.c1
            long r5 = (long) r2
            java.lang.CharSequence r0 = r0.a
            mgf r8 = new mgf
            r8.<init>(r0)
            int r0 = defpackage.lxa.I
            igf r14 = new igf
            r14.<init>(r0)
            r12 = 0
            r16 = 760(0x2f8, float:1.065E-42)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r4 = r1
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.setModelItem(r1)
            return
        L_0x0064:
            r0 = r18
            a3c r0 = (defpackage.a3c) r0
            iqa r3 = (defpackage.iqa) r3
            java.util.List r0 = r0.a
            r3.setButtonToolDataList(r0)
            return
        L_0x0070:
            r0 = r18
            b3c r0 = (defpackage.b3c) r0
            one.me.sdk.uikit.common.button.OneMeButton r3 = (one.me.sdk.uikit.common.button.OneMeButton) r3
            zpa r1 = r0.c
            r3.setMode(r1)
            aqa r1 = r0.b
            r3.setSize(r1)
            xpa r1 = r0.o
            r3.setAppearance(r1)
            int r0 = r0.a
            r3.setText((int) r0)
            return
        L_0x008b:
            defpackage.rae.w(r18)
            android.widget.TextView r3 = (android.widget.TextView) r3
            throw r2
        L_0x0091:
            r0 = r18
            o3c r0 = (defpackage.o3c) r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            long r0 = r0.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "#id "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.setText(r0)
            return
        L_0x00ab:
            r0 = r18
            n3c r0 = (defpackage.n3c) r0
            wr3 r3 = (defpackage.wr3) r3
            ngf r4 = r0.b
            if (r4 == 0) goto L_0x00bd
            android.content.Context r2 = r3.getContext()
            java.lang.CharSequence r2 = r4.a(r2)
        L_0x00bd:
            if (r2 != 0) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            r1 = r2
        L_0x00c1:
            r3.setTitle(r1)
            java.lang.CharSequence r0 = r0.a
            r3.setDescription(r0)
            return
        L_0x00ca:
            r0 = r18
            l3c r0 = (defpackage.l3c) r0
            kxb r0 = r0.a
            ol3 r3 = (defpackage.ol3) r3
            long r4 = r0.a
            int r2 = java.lang.Long.hashCode(r4)
            r3.setId(r2)
            java.lang.String r2 = r0.d
            if (r2 != 0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r1 = r2
        L_0x00e1:
            java.lang.CharSequence r2 = r0.f
            long r4 = r0.e
            r3.Y(r4, r2, r1)
            java.lang.CharSequence r1 = r0.b
            r3.setName((java.lang.CharSequence) r1)
            android.content.Context r1 = r3.getContext()
            ngf r0 = r0.c
            java.lang.CharSequence r0 = r0.a(r1)
            r3.setMessage(r0)
            return
        L_0x00fb:
            r0 = r18
            g3c r0 = (defpackage.g3c) r0
            fm2 r3 = (defpackage.fm2) r3
            java.lang.CharSequence r0 = r0.a
            r3.setDescription(r0)
            return
        L_0x0107:
            r0 = r18
            e3c r0 = (defpackage.e3c) r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p20.M(lz7):void");
    }

    public void Q(zqa zqa) {
        switch (this.D0) {
            case 1:
                ((fm2) this.a).setLinkClickListener(new v72(zqa, 0));
                return;
            case 3:
                ((wr3) this.a).setLinkClickListener(new v72(zqa, 1));
                return;
            default:
                return;
        }
    }

    public void R(View.OnClickListener onClickListener) {
        switch (this.D0) {
            case 0:
                ct.G(this.a, 300, onClickListener);
                return;
            case 2:
                ct.G(this.a, 300, onClickListener);
                return;
            case 4:
                ct.G((TextView) this.a, 300, onClickListener);
                return;
            case 5:
                ct.G((TextView) this.a, 300, onClickListener);
                return;
            case 6:
                ct.G(this.a, 300, onClickListener);
                return;
            case 7:
                ((iqa) this.a).setListener(new y3a(4, (Object) onClickListener));
                return;
            case 8:
                ct.G(this.a, 300, onClickListener);
                return;
            default:
                return;
        }
    }

    public void S(View.OnLongClickListener onLongClickListener) {
        switch (this.D0) {
            case 2:
                ((ol3) this.a).setOnLongClickListener(onLongClickListener);
                return;
            case 8:
                ((r1e) this.a).setOnLongClickListener(onLongClickListener);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p20(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 9
            r1.D0 = r0
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r1.<init>(r0)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p20.<init>(android.content.Context):void");
    }
}
