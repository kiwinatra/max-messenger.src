package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;

/* renamed from: l01  reason: default package */
public final class l01 extends FrameLayout implements bif {
    public j01 a;
    public final TextView b = ((TextView) findViewById(lic.view_call_attach__tv_title));
    public final TextView c = ((TextView) findViewById(lic.view_call_attach__tv_subtitle));
    public final ImageView o = ((ImageView) findViewById(lic.view_call_attach__iv));
    public scf v;

    public l01(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        View.inflate(context, ujc.call_attach_view, this);
        Lazy lazy = scf.b0;
        this.v = j4b.k0(getContext());
        c();
        ct.G(this, 300, new x4(11, (Object) this));
        setOnLongClickListener(new z20(4, this));
    }

    public final void c() {
        if (!isInEditMode()) {
            Lazy lazy = scf.b0;
            scf k0 = j4b.k0(getContext());
            this.v = k0;
            this.b.setTextColor(k0.G);
            this.c.setTextColor(this.v.w);
        }
    }

    public final void setListener(j01 j01) {
        this.a = j01;
    }
}
