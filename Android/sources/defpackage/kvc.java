package defpackage;

import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import java.util.List;
import java.util.Objects;
import ru.ok.tamtam.stickers.view.RecyclerAutofitGridView;

/* renamed from: kvc  reason: default package */
public final class kvc extends ConstraintLayout implements h15, fv {
    public Group E0;
    public TextView F0;
    public Button G0;
    public RecyclerAutofitGridView H0;
    public lw9 I0;
    public j15 J0;
    public gv K0;
    public fk L0;
    public u25 M0;
    public xoe N0;
    public voe O0;
    public jvc P0;
    public ise Q0;
    public List R0;
    public List S0;

    public final void D(qq7 qq7) {
        jvc jvc = this.P0;
        if (jvc != null) {
            ((t26) jvc).J(qq7, p7b.RECENTS);
        }
    }

    public final void d(e15 e15) {
        i7b i7b;
        bpe bpe;
        jvc jvc = this.P0;
        if (jvc != null && (i7b = (i7b) ((t26) jvc).z) != null && (bpe = ((cpe) i7b).G0) != null) {
            bpe.d(e15);
        }
    }

    public final void f(e15 e15, e15 e152) {
        i7b i7b;
        bpe bpe;
        jvc jvc = this.P0;
        if (jvc != null && (i7b = (i7b) ((t26) jvc).z) != null && (bpe = ((cpe) i7b).G0) != null) {
            bpe.d(e152);
        }
    }

    public final void l(qq7 qq7) {
        bpe bpe;
        jvc jvc = this.P0;
        if (jvc != null) {
            p7b p7b = p7b.RECENTS;
            i7b i7b = (i7b) ((t26) jvc).z;
            if (i7b != null && (bpe = ((cpe) i7b).G0) != null) {
                bpe.D(qq7, p7b);
            }
        }
    }

    public void setAnimojiRepository(fk fkVar) {
        this.L0 = fkVar;
        j15 j15 = this.J0;
        if (j15 != null) {
            j15.X = fkVar;
        }
    }

    public void setEmojiParser(u25 u25) {
        this.M0 = u25;
    }

    public void setListener(jvc jvc) {
        this.P0 = jvc;
    }

    public void setLocalization(voe voe) {
        if (!Objects.equals(voe, this.O0)) {
            this.O0 = voe;
            if (voe != null) {
                this.F0.setText(voe.a);
                this.G0.setText(this.O0.b);
            }
        }
    }

    public void setStickers(ise ise) {
        if (this.Q0 != ise) {
            this.Q0 = ise;
            if (ise != null) {
                boolean I = ld9.I(getContext());
                r3 r3Var = ise.a;
                if (I) {
                    this.H0.setDefaultColumns(r3Var.b * 2);
                } else {
                    this.H0.setDefaultColumns(r3Var.c * 2);
                }
            }
            requestLayout();
        }
    }

    public void setTheme(xoe xoe) {
        if (!Objects.equals(xoe, this.N0)) {
            this.N0 = xoe;
            if (xoe != null) {
                setBackgroundColor(xoe.a);
                this.G0.setBackground(xoe.a(this.N0.d));
                this.J0.F(this.N0);
                this.K0.K(this.N0);
            }
        }
    }

    public final void u() {
        jvc jvc = this.P0;
        if (jvc != null) {
            ((t26) jvc).I();
        }
    }

    public final void w(qq7 qq7) {
        i7b i7b;
        jvc jvc = this.P0;
        if (jvc != null && (i7b = (i7b) ((t26) jvc).z) != null) {
            p7b p7b = p7b.RECENTS;
            cpe cpe = (cpe) i7b;
            bpe bpe = cpe.G0;
            if (bpe != null) {
                bpe.r0(qq7, p7b);
                cpe.G0.f0();
            }
        }
    }
}
