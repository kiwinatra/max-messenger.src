package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: imd  reason: default package */
public final class imd extends gh3 {
    public final /* synthetic */ int a;
    public final View b;

    public /* synthetic */ imd(View view, int i) {
        this.a = i;
        this.b = view;
    }

    public final Object E() {
        switch (this.a) {
            case 0:
                gmd gmd = (gmd) this.b;
                return new jmd(gmd, gmd.getQuery(), false);
            default:
                TextView textView = (TextView) this.b;
                return new rgf(textView, textView.getEditableText());
        }
    }

    public final void G(cla cla) {
        switch (this.a) {
            case 0:
                if (iq.v(cla)) {
                    gmd gmd = (gmd) this.b;
                    hmd hmd = new hmd(gmd, cla, 0);
                    cla.c(hmd);
                    gmd.setOnQueryTextListener(hmd);
                    return;
                }
                return;
            default:
                TextView textView = (TextView) this.b;
                sgf sgf = new sgf(textView, cla);
                cla.c(sgf);
                textView.addTextChangedListener(sgf);
                return;
        }
    }
}
