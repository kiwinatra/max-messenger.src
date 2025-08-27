package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.text.style.ClickableSpan;
import android.view.View;
import ru.ok.messages.suggests.SuggestsFragment;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: y0f  reason: default package */
public final /* synthetic */ class y0f implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1f b;
    public final /* synthetic */ zuf c;

    public /* synthetic */ y0f(d1f d1f, zuf zuf, int i) {
        this.a = i;
        this.b = d1f;
        this.c = zuf;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.v.q(this.c);
                return;
            case 1:
                this.b.v.q(this.c);
                return;
            default:
                z3a z3a = this.b.v;
                z3a.getClass();
                Rect rect = rcg.a;
                rcg.d(rect, view);
                SuggestsViewModel V2 = ((SuggestsFragment) z3a.b).V2();
                int i = rect.right;
                int i2 = rect.bottom;
                V2.u = (b2f) ((o85) V2.r.getValue()).a;
                V2.o(new z1f(this.c, new Point(i, i2), (ClickableSpan) null));
                return;
        }
    }
}
