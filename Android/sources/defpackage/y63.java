package defpackage;

import android.widget.TextView;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: y63  reason: default package */
public final class y63 extends a73 implements wcf {
    public final TamAvatarView D0;
    public final TextView E0;
    public final TextView F0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y63(android.view.ViewGroup r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = defpackage.ujc.row_common_chat
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            r3.<init>(r4)
            int r0 = defpackage.lic.row_common_chat_avatar
            android.view.View r0 = r4.findViewById(r0)
            ru.ok.messages.views.widgets.TamAvatarView r0 = (ru.ok.messages.views.widgets.TamAvatarView) r0
            r3.D0 = r0
            int r0 = defpackage.lic.row_common_chat_title
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.E0 = r0
            int r0 = defpackage.lic.row_common_chat_subtitle
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.F0 = r0
            boolean r0 = r4.isInEditMode()
            if (r0 == 0) goto L_0x0039
            vi4 r4 = defpackage.vi4.f0
            goto L_0x0043
        L_0x0039:
            android.content.Context r4 = r4.getContext()
            kotlin.Lazy r0 = defpackage.scf.b0
            scf r4 = defpackage.j4b.k0(r4)
        L_0x0043:
            r3.L0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y63.<init>(android.view.ViewGroup):void");
    }

    public final void L0(scf scf) {
        this.a.setBackground(i8b.H(0, scf.j));
        this.D0.L0(scf);
        this.E0.setTextColor(scf.G);
        this.F0.setTextColor(scf.N);
    }
}
