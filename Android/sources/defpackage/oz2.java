package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* renamed from: oz2  reason: default package */
public final class oz2 extends ryg {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oz2(int i, Object obj) {
        super(20);
        this.j = i;
        this.k = obj;
    }

    private final void o0(int i) {
    }

    public final void M(int i) {
        switch (this.j) {
            case 0:
                return;
            default:
                dff dff = (dff) this.k;
                dff.e = true;
                cff cff = (cff) dff.f.get();
                if (cff != null) {
                    cff.a();
                    return;
                }
                return;
        }
    }

    public final void N(Typeface typeface, boolean z) {
        switch (this.j) {
            case 0:
                Chip chip = (Chip) this.k;
                rz2 rz2 = chip.v;
                chip.setText(rz2.N1 ? rz2.O0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z) {
                    dff dff = (dff) this.k;
                    dff.e = true;
                    cff cff = (cff) dff.f.get();
                    if (cff != null) {
                        cff.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
