package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.BitSet;
import one.me.sdk.uikit.common.views.EmptySearchView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: b61  reason: default package */
public final class b61 extends kbe {
    public final /* synthetic */ int D0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b61(View view, int i) {
        super(view);
        this.D0 = i;
    }

    private final void P(lz7 lz7) {
    }

    private final void Q(lz7 lz7) {
    }

    private final void R(lz7 lz7) {
    }

    private final void S(lz7 lz7) {
    }

    private final void T(lz7 lz7) {
    }

    public final void M(lz7 lz7) {
        switch (this.D0) {
            case 0:
                ((a61) this.a).setOpponents(((rc1) lz7).b);
                return;
            case 1:
                return;
            case 2:
                tc1 tc1 = (tc1) lz7;
                int i = tc1.b.a() ? 0 : 8;
                View view = this.a;
                view.setVisibility(i);
                ek1 ek1 = (ek1) view;
                boolean z = tc1.b.d;
                if (ek1.F0 != z) {
                    ek1.F0 = z;
                    ek1.G0.setEndView(new d1e(z, true));
                    return;
                }
                return;
            case 3:
                lx2 lx2 = (lx2) lz7;
                View view2 = this.a;
                view2.requestLayout();
                view2.invalidate();
                return;
            case 4:
                x45 x45 = (x45) lz7;
                EmptySearchView emptySearchView = (EmptySearchView) this.a;
                emptySearchView.setTitle(ead.c0);
                emptySearchView.setDescription(ead.b0);
                emptySearchView.setIsButtonVisible(false);
                return;
            case 5:
                y45 y45 = (y45) lz7;
                return;
            case 6:
                e38 e38 = (e38) lz7;
                return;
            case 7:
                wqc wqc = (wqc) lz7;
                return;
            case 8:
                yuc yuc = (yuc) lz7;
                return;
            case 9:
                if (lz7 instanceof zmd) {
                    View view3 = this.a;
                    ((TextView) view3).setText(((zmd) lz7).a.a(((TextView) view3).getContext()));
                    return;
                }
                return;
            case 10:
                return;
            case 11:
                if (lz7 instanceof smd) {
                    View view4 = this.a;
                    ((TextView) view4).setText(((smd) lz7).a.a(((TextView) view4).getContext()));
                    return;
                }
                return;
            case 12:
            case 13:
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                if (lz7 instanceof rmd) {
                    View view5 = this.a;
                    ((TextView) view5).setText(((rmd) lz7).a.a(((TextView) view5).getContext()));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void N(lz7 lz7, Object obj) {
        switch (this.D0) {
            case 0:
                rc1 rc1 = (rc1) lz7;
                qc1 qc1 = obj instanceof qc1 ? (qc1) obj : null;
                View view = this.a;
                if (qc1 == null) {
                    ((a61) view).setOpponents(rc1.b);
                    return;
                } else if (((BitSet) qc1.a).get(0)) {
                    ((a61) view).setOpponents(rc1.b);
                    return;
                } else {
                    return;
                }
            case 2:
                tc1 tc1 = (tc1) lz7;
                sc1 sc1 = obj instanceof sc1 ? (sc1) obj : null;
                View view2 = this.a;
                int i = 8;
                if (sc1 == null) {
                    if (tc1.b.a()) {
                        i = 0;
                    }
                    view2.setVisibility(i);
                    ek1 ek1 = (ek1) view2;
                    boolean z = tc1.b.d;
                    if (ek1.F0 != z) {
                        ek1.F0 = z;
                        ek1.G0.setEndView(new d1e(z, true));
                        return;
                    }
                    return;
                } else if (((BitSet) sc1.a).get(0)) {
                    if (tc1.b.a()) {
                        i = 0;
                    }
                    view2.setVisibility(i);
                    ek1 ek12 = (ek1) view2;
                    boolean z2 = tc1.b.d;
                    if (ek12.F0 != z2) {
                        ek12.F0 = z2;
                        ek12.G0.setEndView(new d1e(z2, true));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                super.N(lz7, obj);
                return;
        }
    }
}
