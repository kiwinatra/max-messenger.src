package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Lazy;

/* renamed from: v2a  reason: default package */
public final class v2a extends q2 implements bif {
    public final ch o;
    public TextView v;
    public View w;
    public boolean x;

    public v2a(Context context, ch chVar) {
        super(context);
        this.o = chVar;
        L((ViewGroup) null, ujc.view_floating_video_trash);
    }

    public final void M() {
        this.v = (TextView) ((View) this.c).findViewById(lic.view_floating_video_trash__tv_tip);
        this.w = ((View) this.c).findViewById(lic.view_floating_video_trash__v_background);
        c();
    }

    public final void c() {
        if (this.x) {
            Context context = ((View) this.c).getContext();
            Lazy lazy = scf.b0;
            this.v.setTextColor(j4b.k0(context).l);
            return;
        }
        this.v.setTextColor(-1);
    }
}
