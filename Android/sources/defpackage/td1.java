package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: td1  reason: default package */
public final class td1 extends kbe {
    public final /* synthetic */ int D0 = 1;
    public final Object E0;
    public final ViewGroup F0;

    public td1(tqa tqa, f fVar) {
        super(tqa);
        this.E0 = fVar;
        this.F0 = tqa;
    }

    public final void M(lz7 lz7) {
        switch (this.D0) {
            case 0:
                ba1 ba1 = (ba1) lz7;
                ((aa1) this.F0).setListener((z91) this.E0);
                return;
            case 1:
                ma1 ma1 = (ma1) lz7;
                ((bk1) this.F0).setListener((ak1) this.E0);
                return;
            default:
                oae oae = lz7 instanceof oae ? (oae) lz7 : null;
                if (oae != null) {
                    tqa tqa = (tqa) this.F0;
                    CharSequence a = oae.a.a(tqa.getContext());
                    CharSequence charSequence = "";
                    if (a == null) {
                        a = charSequence;
                    }
                    tqa.setTextTitle(a);
                    CharSequence a2 = oae.b.a(tqa.getContext());
                    if (a2 != null) {
                        charSequence = a2;
                    }
                    tqa.setTextSubtitle(charSequence);
                    ct.G(tqa, 300, new pb(7, this, charSequence));
                    return;
                }
                return;
        }
    }

    public td1(FrameLayout frameLayout, z91 z91) {
        super(frameLayout);
        this.E0 = z91;
        this.F0 = (aa1) frameLayout.findViewById(kgc.call_invite_opponent_preview);
    }

    public td1(FrameLayout frameLayout, ak1 ak1) {
        super(frameLayout);
        this.E0 = ak1;
        this.F0 = (bk1) frameLayout.findViewById(kgc.call_copy_link_preview);
    }
}
