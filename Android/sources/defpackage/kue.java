package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: kue  reason: default package */
public final class kue extends kbe implements ymd {
    public wmd D0;
    public Function1 E0;

    public kue(Context context) {
        super(new r1e(context, (AttributeSet) null));
    }

    public final void M(lz7 lz7) {
        if (lz7 instanceof vmd) {
            this.D0 = (wmd) lz7;
            ((r1e) this.a).setModelItem(((vmd) lz7).a);
        }
    }

    public final void e(Function1 function1) {
        this.E0 = function1;
        View view = this.a;
        if (function1 != null) {
            ct.G(view, 300, new kqc(18, (Object) this, (Object) function1));
        } else {
            ((r1e) view).setOnClickListener((View.OnClickListener) null);
        }
    }
}
