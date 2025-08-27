package defpackage;

import android.view.View;
import android.widget.ImageView;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: w32  reason: default package */
public final class w32 extends ne2 {
    public final /* synthetic */ int D0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w32(View view, int i) {
        super(view);
        this.D0 = i;
    }

    public final void M(lz7 lz7) {
        switch (this.D0) {
            case 0:
                c29 c29 = (c29) lz7;
                rc2 rc2 = (rc2) this.a;
                rc2.setId((int) c29.a);
                rc2.setupAudio(c29);
                return;
            case 1:
                Q((i29) lz7);
                return;
            default:
                l29 l29 = (l29) lz7;
                pf2 pf2 = (pf2) this.a;
                pf2.setId((int) l29.a);
                pf2.setItem(l29);
                return;
        }
    }

    public void O() {
        switch (this.D0) {
            case 0:
                rc2 rc2 = (rc2) this.a;
                rc2.removeOnAttachStateChangeListener(rc2.I0);
                pm7 pm7 = rc2.J0;
                if (pm7 != null) {
                    pm7.b((CancellationException) null);
                }
                rc2.J0 = null;
                rc2.K0 = null;
                return;
            default:
                return;
        }
    }

    public final void P(m29 m29, Function1 function1, Function2 function2) {
        switch (this.D0) {
            case 0:
                c29 c29 = (c29) m29;
                View view = this.a;
                rc2 rc2 = (rc2) view;
                rc2 rc22 = (rc2) view;
                rc22.setId((int) c29.a);
                rc22.setupAudio(c29);
                ct.G(rc2, 300, new pb(9, function1, c29));
                rc2.setOnLongClickListener(new v32(function2, c29, this, 0));
                return;
            case 1:
                i29 i29 = (i29) m29;
                je2 je2 = (je2) this.a;
                Q(i29);
                ct.G(je2, 300, new pb(11, function1, i29));
                je2.setOnLongClickListener(new v32(function2, i29, this, 1));
                return;
            default:
                l29 l29 = (l29) m29;
                View view2 = this.a;
                pf2 pf2 = (pf2) view2;
                pf2 pf22 = (pf2) view2;
                pf22.setId((int) l29.a);
                pf22.setItem(l29);
                ct.G(pf2, 300, new pb(12, function1, l29));
                pf2.setOnLongClickListener(new v32(function2, l29, this, 2));
                return;
        }
    }

    public void Q(i29 i29) {
        je2 je2 = (je2) this.a;
        je2.setId((int) i29.a);
        OneMeAvatarView oneMeAvatarView = je2.J0;
        String str = i29.o;
        if (str == null || str.length() == 0) {
            oneMeAvatarView.setAvatarUrl((String) null);
            km5 km5 = (km5) je2.I0.getValue();
            km5.a(i29.Z);
            OneMeAvatarView.g(oneMeAvatarView, km5, hoa.a, 4);
        } else {
            OneMeAvatarView.g(oneMeAvatarView, je2.H0, ioa.a, 28);
            oneMeAvatarView.setAvatarUrl(str);
        }
        g29 g29 = i29.Y;
        if (!(g29 instanceof d29) || !((d29) g29).b) {
            je2.setFileDownloadStatus(g29);
        } else {
            ImageView imageView = je2.L0;
            imageView.setAlpha(c44.DEFAULT_ASPECT_RATIO);
            imageView.animate().alpha(1.0f).setDuration(500).withStartAction(new ie2(je2, imageView, 0)).withEndAction(new ie2(imageView, je2));
        }
        je2.setTitle(i29.v);
        CharSequence a = g29.a().a(je2.getContext());
        je2.setFileDescription(i29.w + " · " + a);
    }
}
