package defpackage;

import android.content.Context;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ok.messages.channels.CreateChannelFragment;
import ru.ok.messages.gallery.GalleryFragment;

/* renamed from: q24  reason: default package */
public final /* synthetic */ class q24 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreateChannelFragment b;

    public /* synthetic */ q24(CreateChannelFragment createChannelFragment, int i) {
        this.a = i;
        this.b = createChannelFragment;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                CreateChannelFragment createChannelFragment = this.b;
                Context O1 = createChannelFragment.O1();
                String[] strArr = n54.e;
                if (n54.e(O1, strArr)) {
                    createChannelFragment.i3().k();
                } else {
                    n54.O(createChannelFragment, strArr, 158, qad.O6);
                }
                return Unit.INSTANCE;
            case 1:
                CreateChannelFragment createChannelFragment2 = this.b;
                createChannelFragment2.D1.g().clearFocus();
                hd8.B(createChannelFragment2.E2());
                xe0 xe0 = new xe0(createChannelFragment2.Q1());
                hd8.T(xe0, kad.b, kad.c);
                int i = createChannelFragment2.H0;
                pl6 pl6 = createChannelFragment2.i3().y;
                ((ul6) createChannelFragment2.C1.getValue()).getClass();
                GalleryFragment galleryFragment = new GalleryFragment();
                pl6.getClass();
                galleryFragment.L2(o54.f(TuplesKt.to("gallery_mode", pl6)));
                xe0.k(i, galleryFragment, (String) null);
                xe0.c((String) null);
                xe0.e(false);
                return Unit.INSTANCE;
            default:
                CreateChannelFragment createChannelFragment3 = this.b;
                return new p34(createChannelFragment3.E2().getApplication(), createChannelFragment3, ((qra) ((id3) createChannelFragment3.p1.b)).p(), ((qra) ((id3) createChannelFragment3.p1.b)).o(), ((qra) ((id3) createChannelFragment3.p1.b)).y().b, ((qra) ((id3) createChannelFragment3.p1.b)).G());
        }
    }
}
