package defpackage;

import android.view.View;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;

/* renamed from: i6  reason: default package */
public final /* synthetic */ class i6 implements vla {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActLocalMedias b;

    public /* synthetic */ i6(ActLocalMedias actLocalMedias, int i) {
        this.a = i;
        this.b = actLocalMedias;
    }

    public final iog z(View view, iog iog) {
        switch (this.a) {
            case 0:
                MediaBarPreviewLayout mediaBarPreviewLayout = this.b.J0;
                int b2 = iog.b();
                int c = iog.c();
                int a2 = iog.a();
                View view2 = mediaBarPreviewLayout.G0;
                iq.N(view2, b2);
                View view3 = mediaBarPreviewLayout.F0;
                iq.N(view3, b2);
                iq.M(view2, c);
                iq.M(view3, c);
                iq.u(mediaBarPreviewLayout, 0);
                iq.q(mediaBarPreviewLayout, a2);
                return iog;
            default:
                iq.L(this.b.I0, iog.a());
                return iog;
        }
    }
}
