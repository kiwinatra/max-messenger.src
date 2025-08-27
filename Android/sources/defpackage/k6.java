package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalGif;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalPhoto;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: k6  reason: default package */
public final class k6 extends xbg {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActLocalMedias b;

    public /* synthetic */ k6(ActLocalMedias actLocalMedias, int i) {
        this.a = i;
        this.b = actLocalMedias;
    }

    private final void d(int i) {
    }

    private final void e(int i, float f, int i2) {
    }

    public void a(int i) {
        int i2 = this.a;
    }

    public void b(int i, float f, int i2) {
        int i3 = this.a;
    }

    public final void c(int i) {
        boolean z = false;
        ActLocalMedias actLocalMedias = this.b;
        switch (this.a) {
            case 0:
                if (actLocalMedias.D0 != null) {
                    d48 d48 = (d48) actLocalMedias.z0.get(actLocalMedias.A0);
                    if (d48 != null) {
                        FrgLocalMedia H = actLocalMedias.D0.H(d48.b);
                        if (H instanceof FrgLocalVideo) {
                            FrgLocalVideo frgLocalVideo = (FrgLocalVideo) H;
                            View view = (View) frgLocalVideo.J1.c;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                            frgLocalVideo.m3();
                        }
                    }
                    d48 d482 = (d48) actLocalMedias.z0.get(i);
                    if (d482 != null) {
                        FrgLocalMedia H2 = actLocalMedias.D0.H(d482.b);
                        if (H2 instanceof FrgLocalVideo) {
                            ((FrgLocalVideo) H2).l3();
                        }
                    }
                }
                actLocalMedias.A0 = i;
                actLocalMedias.j0(i);
                String str = null;
                if (actLocalMedias.z0.size() - i < 6) {
                    h48 Z = actLocalMedias.Z();
                    String str2 = actLocalMedias.B0;
                    if (str2 == null) {
                        Z.getClass();
                    } else {
                        wk6 wk6 = (wk6) Z.g.get(str2);
                        if (wk6 != null) {
                            z = ((yd7) Z.c).b(wk6);
                        }
                    }
                    if (z) {
                        h48 Z2 = actLocalMedias.Z();
                        ev0.v(Z2.e, ((osa) Z2.d).a().plus(Z2.b), (f14) null, new g48(Z2, actLocalMedias.B0, (Continuation) null), 2);
                    }
                }
                FrgLocalMedia X = actLocalMedias.X();
                if (X != null) {
                    if (X instanceof FrgLocalPhoto) {
                        str = "LOCAL_PHOTO";
                    } else if (X instanceof FrgLocalVideo) {
                        str = "LOCAL_VIDEO";
                    } else if (X instanceof FrgLocalGif) {
                        str = "LOCAL_GIF";
                    }
                    if (!cvg.A(str)) {
                        z68.c("ru.ok.messages.media.mediabar.ActLocalMedias", "sendFragmentStats: " + str, new Object[0]);
                        ((qra) ((id3) actLocalMedias.x.b)).c().e(str);
                    }
                }
                actLocalMedias.M0.X((d48) actLocalMedias.z0.get(actLocalMedias.A0));
                return;
            default:
                int i2 = ActLocalMedias.W0;
                List d = actLocalMedias.Z().f.d();
                int h = actLocalMedias.Z().f.h((d48) actLocalMedias.z0.get(i)) - 1;
                if (h == -1) {
                    for (int i3 = 0; i3 < d.size(); i3++) {
                        ((uqd) d.get(i3)).e = false;
                    }
                    actLocalMedias.i0();
                    return;
                }
                int i4 = 0;
                while (i4 < d.size()) {
                    ((uqd) d.get(i4)).e = h == i4;
                    i4++;
                }
                actLocalMedias.i0();
                actLocalMedias.J0.N(i);
                return;
        }
    }
}
