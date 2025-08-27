package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: q2a  reason: default package */
public final class q2a extends q2 implements o2a, bif, uq3 {
    public static final int B0 = ujc.layout_contact_location;
    public wq3 A0;
    public TextView X;
    public ImageView Y;
    public ProgressBar Z;
    public final yva o;
    public final km3 v;
    public TextView v0;
    public final jtb w;
    public TextView w0;
    public final ViewStub x;
    public TextView x0;
    public final fn4 y;
    public RecyclerView y0;
    public Group z;
    public View z0;

    public q2a(Context context, yva yva, km3 km3, jtb jtb, fn4 fn4, ViewStub viewStub) {
        super(context);
        this.o = yva;
        this.v = km3;
        this.w = jtb;
        this.y = fn4;
        this.x = viewStub;
    }

    public final void M() {
        this.z = (Group) ((View) this.c).findViewById(lic.layout_contact_location__current_group);
        TextView textView = (TextView) ((View) this.c).findViewById(lic.layout_contact_location__tv_name);
        this.X = textView;
        puf.l.b(textView, uy4.b);
        this.Y = (ImageView) ((View) this.c).findViewById(lic.layout_contact_location__iv_live);
        this.Z = (ProgressBar) ((View) this.c).findViewById(lic.layout_contact_location__pb_request_location);
        this.v0 = (TextView) ((View) this.c).findViewById(lic.layout_contact_location__iv_update);
        TextView textView2 = this.X;
        ogf ogf = puf.o;
        ogf.b(textView2, uy4.b);
        this.w0 = (TextView) ((View) this.c).findViewById(lic.layout_contact_location__tv_address);
        ogf.b(this.X, uy4.b);
        this.x0 = (TextView) ((View) this.c).findViewById(lic.layout_contact_location__tv_route);
        puf.B.b(this.X, uy4.b);
        this.y0 = (RecyclerView) ((View) this.c).findViewById(lic.layout_contact_location__rv_markers);
        this.z0 = ((View) this.c).findViewById(lic.layout_contact_location__separator);
        c();
        wq3 wq3 = new wq3(this.v);
        this.A0 = wq3;
        wq3.x = this;
        wq3.C(true);
        this.y0.setAdapter(this.A0);
        this.y0.setLayoutManager(new LinearLayoutManager(0, false));
        y64.n(this.x0, new p2a(this, 0));
        y64.n((View) this.c, new p2a(this, 1));
    }

    public final void c() {
        View view = (View) this.c;
        if (view != null) {
            k2b f = fu4.k.e(view.getContext()).f();
            ((View) this.c).setBackgroundColor(f.c().j);
            this.X.setTextColor(f.getText().g);
            this.w0.setTextColor(f.getText().f);
            this.v0.setTextColor(f.getText().f);
            TextView textView = this.x0;
            f.getText().getClass();
            textView.setTextColor(-16745729);
            int i = nad.r1;
            f.getIcon().getClass();
            hsg.D((Drawable) null, (Drawable) null, iq.E(i, -16745729, (Context) this.b), (Drawable) null, this.x0);
        }
    }
}
