package defpackage;

import android.view.View;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: mnb  reason: default package */
public final class mnb extends y0c {
    public final /* synthetic */ int D0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mnb(View view) {
        super(view);
        this.D0 = 0;
    }

    public final void M(lz7 lz7) {
        CharSequence charSequence = "";
        View view = this.a;
        switch (this.D0) {
            case 0:
                TextView textView = (TextView) view;
                CharSequence a = ((tnb) lz7).a.a(textView.getContext());
                if (a != null) {
                    charSequence = a;
                }
                textView.setText(charSequence);
                b0h.H(textView, new ra(3, (Continuation) null, 20));
                return;
            case 1:
                nmd nmd = (nmd) lz7;
                TextView textView2 = (TextView) view;
                CharSequence a2 = nmd.a.a(textView2.getContext());
                if (a2 != null) {
                    charSequence = a2;
                }
                textView2.setText(charSequence);
                b0h.H(textView2, new x2(nmd, (Continuation) null, 28));
                ogf ogf = puf.a;
                nmd.c.b(textView2, uy4.b);
                return;
            default:
                q7e q7e = (q7e) lz7;
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mnb(android.content.Context r14, int r15) {
        /*
            r13 = this;
            r13.D0 = r15
            switch(r15) {
                case 2: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r14)
            r13.<init>(r15)
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r14 = -2
            r13.<init>(r14, r14)
            r15.setLayoutParams(r13)
            return
        L_0x0017:
            r1e r15 = new r1e
            r0 = 0
            r15.<init>(r14, r0)
            r13.<init>(r15)
            r13 = 8
            long r1 = (long) r13
            int r13 = defpackage.ixa.C0
            igf r4 = new igf
            r4.<init>(r13)
            int r13 = defpackage.ixa.z0
            igf r6 = new igf
            r6.<init>(r13)
            s1e r13 = new s1e
            r10 = 0
            r11 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 840(0x348, float:1.177E-42)
            r0 = r13
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.setModelItem(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnb.<init>(android.content.Context, int):void");
    }
}
