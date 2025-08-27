package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.TuplesKt;
import ru.ok.messages.channels.CreateChannelFragment;
import ru.ok.messages.channels.CreateChannelViewModel;
import ru.ok.messages.gallery.GalleryFragment;

/* renamed from: ufb  reason: default package */
public final /* synthetic */ class ufb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wfb b;

    public /* synthetic */ ufb(wfb wfb, int i) {
        this.a = i;
        this.b = wfb;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wfb wfb = this.b;
                CreateChannelFragment createChannelFragment = (CreateChannelFragment) wfb.v0.b;
                createChannelFragment.D1.g().clearFocus();
                hd8.B(createChannelFragment.E2());
                xe0 xe0 = new xe0(createChannelFragment.Q1());
                hd8.T(xe0, kad.b, kad.c);
                int i = createChannelFragment.H0;
                pl6 pl6 = createChannelFragment.i3().y;
                ((ul6) createChannelFragment.C1.getValue()).getClass();
                GalleryFragment galleryFragment = new GalleryFragment();
                pl6.getClass();
                galleryFragment.L2(o54.f(TuplesKt.to("gallery_mode", pl6)));
                xe0.k(i, galleryFragment, (String) null);
                xe0.c((String) null);
                xe0.e(false);
                wfb.j(true);
                return;
            case 1:
                wfb wfb2 = this.b;
                CreateChannelFragment createChannelFragment2 = (CreateChannelFragment) wfb2.v0.b;
                Context O1 = createChannelFragment2.O1();
                String[] strArr = n54.e;
                if (n54.e(O1, strArr)) {
                    createChannelFragment2.i3().k();
                } else {
                    n54.O(createChannelFragment2, strArr, 158, qad.O6);
                }
                wfb2.j(true);
                return;
            case 2:
                wfb wfb3 = this.b;
                CreateChannelFragment createChannelFragment3 = (CreateChannelFragment) wfb3.v0.b;
                CreateChannelViewModel i3 = createChannelFragment3.i3();
                i3.getClass();
                i3.i.setValue(i3, CreateChannelViewModel.G[1], (Object) null);
                createChannelFragment3.l3();
                wfb3.j(true);
                return;
            default:
                this.b.j(true);
                return;
        }
    }
}
