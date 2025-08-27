package defpackage;

import android.widget.FrameLayout;
import java.util.Objects;
import ru.ok.tamtam.stickers.view.RecyclerAutofitGridView;

/* renamed from: jpe  reason: default package */
public final class jpe extends FrameLayout implements fv {
    public RecyclerAutofitGridView a;
    public gv b;
    public ipe c;
    public xoe o;
    public ise v;
    public p7b w;

    public final void D(qq7 qq7) {
        p7b p7b;
        ipe ipe = this.c;
        if (ipe != null && (p7b = this.w) != null) {
            ((t26) ipe).J(qq7, p7b);
        }
    }

    public final void a(ise ise, p7b p7b) {
        if (!Objects.equals(ise, this.v)) {
            this.v = ise;
            this.w = p7b;
            if (ise != null) {
                boolean I = ld9.I(getContext());
                r3 r3Var = ise.a;
                if (I) {
                    this.a.setDefaultColumns(r3Var.b);
                } else {
                    this.a.setDefaultColumns(r3Var.c);
                }
            }
            requestLayout();
        }
    }

    public final void l(qq7 qq7) {
        p7b p7b;
        i7b i7b;
        bpe bpe;
        ipe ipe = this.c;
        if (ipe != null && (p7b = this.w) != null && (i7b = (i7b) ((t26) ipe).z) != null && (bpe = ((cpe) i7b).G0) != null) {
            bpe.D(qq7, p7b);
        }
    }

    public void setListener(ipe ipe) {
        this.c = ipe;
    }

    public void setTheme(xoe xoe) {
        if (!Objects.equals(xoe, this.o)) {
            this.o = xoe;
            if (xoe != null) {
                setBackgroundColor(xoe.a);
                this.b.K(this.o);
            }
        }
    }

    public final void u() {
        ipe ipe = this.c;
        if (ipe != null) {
            ((t26) ipe).I();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r0 = (defpackage.cpe) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(defpackage.qq7 r3) {
        /*
            r2 = this;
            ipe r0 = r2.c
            if (r0 == 0) goto L_0x001e
            p7b r2 = r2.w
            if (r2 == 0) goto L_0x001e
            t26 r0 = (defpackage.t26) r0
            java.lang.Object r0 = r0.z
            i7b r0 = (defpackage.i7b) r0
            if (r0 == 0) goto L_0x001e
            cpe r0 = (defpackage.cpe) r0
            bpe r1 = r0.G0
            if (r1 == 0) goto L_0x001e
            r1.r0(r3, r2)
            bpe r2 = r0.G0
            r2.f0()
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpe.w(qq7):void");
    }
}
