package defpackage;

import android.view.ViewGroup;

/* renamed from: d61  reason: default package */
public final class d61 extends xu6 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ViewGroup d;

    public /* synthetic */ d61(ViewGroup viewGroup, int i) {
        this.c = i;
        this.d = viewGroup;
    }

    public final int c(int i) {
        switch (this.c) {
            case 0:
                t9a t9a = x4b.a;
                f61 f61 = (f61) this.d;
                x4b x4b = f61.J0.b;
                t9a.getClass();
                if (x4b == x4b.c && i == 0) {
                    return 2;
                }
                return (f61.J0.a == 0 && f61.G0.j() <= 2) ? 2 : 1;
            case 1:
                i61 i61 = (i61) this.d;
                if (i61.X1 || i61.a2) {
                    return 1;
                }
                i61.getClass();
                return (i >= 2 && i % 2 == 0 && i == i61.getCount() - 1) ? 2 : 1;
            case 2:
                r25 r25 = (r25) this.d;
                if (r25.M0.l(i) == tic.view_type_smiles_separator) {
                    return r25.J0.getSpanCount();
                }
                return 1;
            default:
                kvc kvc = (kvc) this.d;
                int l = kvc.I0.l(i);
                return l == tic.view_type_recent_separator ? kvc.H0.getSpanCount() : (l == tic.view_type_sticker || l == tic.view_type_more_stickers) ? 2 : 1;
        }
    }
}
