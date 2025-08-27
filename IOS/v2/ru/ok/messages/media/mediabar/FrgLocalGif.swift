package ru.ok.messages.media.mediabar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgLocalGif extends FrgLocalMedia implements c58 {
    public SimpleDraweeView I1;

    public final void B1(d48 d48, Uri uri, int i, Uri uri2) {
        knb a = ld9.p.get();
        a.c(o5a.x(uri.toString()));
        a.l = this.I1.getController();
        a.j = true;
        if (!cvg.A(d48.o)) {
            a.f = qa7.a(o5a.x(d48.o));
        }
        this.I1.setController(a.a());
    }

    public final void e() {
        if (h3() != null) {
            h3().c();
        }
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(ujc.frg_local_gif, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) slideOutLayout.findViewById(lic.frg_local_gif__drawee);
        this.I1 = simpleDraweeView;
        ((sp6) simpleDraweeView.getHierarchy()).i(new r20(O1(), -1), 3);
        ct.G(this.I1, 300, new xu3(14, (Object) this));
        SimpleDraweeView simpleDraweeView2 = this.I1;
        if (this.D1) {
            simpleDraweeView2.setTransitionName(this.C1.a());
        }
        return slideOutLayout;
    }

    public final boolean s2(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.o1) {
            return true;
        }
        U2();
        return true;
    }

    public final void w2() {
        super.w2();
        this.E1.b();
    }
}
