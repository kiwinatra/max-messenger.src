package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Lazy;

/* renamed from: qmd  reason: default package */
public final class qmd extends tyc {
    public final mmd o;
    public final tyc v;
    public final boolean w;
    public final boolean x;

    public qmd(vte vte, sq7 sq7, boolean z, boolean z2) {
        this.o = vte;
        this.v = sq7;
        this.x = z;
        this.w = z2;
    }

    public final int j() {
        return this.v.j() + (this.x ? 1 : 0) + (this.w ? 1 : 0);
    }

    public final long k(int i) {
        int l = l(i);
        if (l == lic.view_type_sticker_section_header || l == lic.view_type_sticker_section_footer) {
            return (long) (this.o.b.hashCode() ^ l);
        }
        return this.v.k(i - (this.x ? 1 : 0));
    }

    public final int l(int i) {
        if (i == j() - 1 && this.w) {
            return lic.view_type_sticker_section_footer;
        }
        boolean z = this.x;
        if (z && i == 0) {
            return lic.view_type_sticker_section_header;
        }
        return this.v.l(i - (z ? 1 : 0));
    }

    public final void s(pzc pzc, int i) {
        int l = l(i);
        if (l == lic.view_type_sticker_section_header) {
            mmd mmd = this.o;
            int i2 = mmd.a;
            TextView textView = ((pmd) pzc).D0;
            if (i2 == 2) {
                textView.setText(((vte) mmd).c);
            } else if (i2 == 3) {
                textView.setText(((fre) mmd).c);
            } else {
                textView.setText((CharSequence) null);
            }
        } else if (l != lic.view_type_sticker_section_footer) {
            this.v.s(pzc, i - (this.x ? 1 : 0));
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        if (i == lic.view_type_sticker_section_header) {
            return new pmd(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_sticker_section_header, viewGroup, false));
        }
        if (i != lic.view_type_sticker_section_footer) {
            return this.v.u(viewGroup, i);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_sticker_section_footer, viewGroup, false);
        pzc pzc = new pzc(inflate);
        Context context = inflate.getContext();
        Lazy lazy = scf.b0;
        inflate.setBackgroundColor(j4b.k0(context).I);
        return pzc;
    }
}
