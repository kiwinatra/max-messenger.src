package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Collections;
import java.util.List;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: wq3  reason: default package */
public final class wq3 extends tyc {
    public final km3 o;
    public List v = Collections.emptyList();
    public long w;
    public uq3 x;

    public wq3(km3 km3) {
        this.o = km3;
    }

    public final int j() {
        return this.v.size();
    }

    public final long k(int i) {
        return ((pf8) this.v.get(i)).c;
    }

    public final void s(pzc pzc, int i) {
        vq3 vq3 = (vq3) pzc;
        pf8 pf8 = (pf8) this.v.get(i);
        boolean z = pf8.h;
        ImageView imageView = vq3.D0;
        TamAvatarView tamAvatarView = vq3.E0;
        wq3 wq3 = vq3.H0;
        long j = pf8.b;
        if (z) {
            imageView.setVisibility(4);
            tamAvatarView.setVisibility(0);
            tamAvatarView.b(wq3.o.p(j, false), false);
            if (pf8.k) {
                tamAvatarView.setAlpha(1.0f);
            } else {
                tamAvatarView.setAlpha(0.5f);
            }
        } else {
            imageView.setVisibility(0);
            tamAvatarView.setVisibility(8);
            tamAvatarView.b(wq3.o.p(j, false), false);
        }
        int i2 = (pf8.c > wq3.w ? 1 : (pf8.c == wq3.w ? 0 : -1));
        View view = vq3.F0;
        if (i2 == 0) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        vq3.G0 = pf8;
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        return new vq3(this, LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_contact_location, viewGroup, false));
    }
}
