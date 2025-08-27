package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: rb8  reason: default package */
public final class rb8 implements roe {
    public final /* synthetic */ int a;
    public final ore b;
    public final FrameLayout c;

    public rb8(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                hoe hoe = new hoe(context);
                this.c = hoe;
                this.b = new ore(hoe);
                return;
            default:
                pb8 pb8 = new pb8(context);
                this.c = pb8;
                this.b = new ore(pb8);
                return;
        }
    }

    private final void c(hb8 hb8) {
    }

    public final void a(gpe gpe) {
        switch (this.a) {
            case 0:
                ore ore = this.b;
                ore.f = gpe;
                ore.b();
                ore.b();
                ((pb8) this.c).a(gpe, Math.max(350, ore.b ? ore.d : ore.c));
                return;
            default:
                ore ore2 = this.b;
                ore2.f = gpe;
                ore2.b();
                ore2.b();
                ((hoe) this.c).a(gpe);
                return;
        }
    }

    public final void b(hb8 hb8) {
        switch (this.a) {
            case 0:
                ((pb8) this.c).b(hb8);
                return;
            default:
                return;
        }
    }

    public final void setParent(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                ore ore = this.b;
                pb8 pb8 = (pb8) this.c;
                pb8.setSizeConfigurator(ore);
                viewGroup.addView(pb8, new ViewGroup.LayoutParams(-1, -1));
                return;
            default:
                ore ore2 = this.b;
                hoe hoe = (hoe) this.c;
                hoe.setSizeConfigurator(ore2);
                viewGroup.addView(hoe, new ViewGroup.LayoutParams(-1, -1));
                return;
        }
    }
}
