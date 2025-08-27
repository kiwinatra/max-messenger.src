package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import java.util.Set;

/* renamed from: w3a  reason: default package */
public final class w3a extends q2 implements f2a {
    public final at1 o;
    public ImageView v;
    public View w;
    public boolean x = false;
    public he y;

    public w3a(Context context, View view, at1 at1) {
        super(context);
        this.o = at1;
        J(view);
    }

    public final void M() {
        this.v = (ImageView) ((View) this.c).findViewById(lic.quick_camera_view__iv_flash);
        View findViewById = ((View) this.c).findViewById(lic.quick_camera_view__fl_wrapper_flash);
        this.w = findViewById;
        ImageView imageView = this.v;
        this.y = new he(15, (Object) imageView, (Object) findViewById);
        if (imageView != null) {
            y64.n(findViewById, new b5(28, this));
        }
    }

    public final void Z(String str) {
        at1 at1 = this.o;
        try {
            at1.setFlash(str);
            if (at1.n()) {
                this.v.setImageResource(nad.H0);
            } else if (at1.g()) {
                this.v.setImageResource(nad.I0);
            } else {
                this.v.setImageResource(nad.G0);
            }
        } catch (IllegalArgumentException e) {
            z68.g("w3a", "this flash mode didn't find, error message: %s", e.getMessage());
            for (r1a W : (Set) this.a) {
                W.W("AUTO");
            }
        }
    }
}
