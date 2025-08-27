package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: t0a  reason: default package */
public final /* synthetic */ class t0a implements bj6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0a b;

    public /* synthetic */ t0a(z0a z0a, int i) {
        this.a = i;
        this.b = z0a;
    }

    public final Object apply(Object obj) {
        z48 z48 = (z48) obj;
        switch (this.a) {
            case 0:
                dfb dfb = this.b.z;
                z48.o = (dfb == null || dfb.o == null) ? false : true;
                return z48;
            case 1:
                dfb dfb2 = this.b.z;
                z48.n = (dfb2 == null || dfb2.w == null) ? false : true;
                return z48;
            case 2:
                z0a z0a = this.b;
                boolean z = z0a.y0;
                z48.e = z;
                z48.a();
                z48.a = z;
                FrgLocalMedia X = ((ActLocalMedias) z0a.b).X();
                z48.f = X == null ? false : X instanceof FrgLocalVideo;
                return z48;
            case 3:
                boolean z2 = this.b.y0;
                z48.g = z2;
                z48.i = z2;
                z48.h = z2;
                z48.e = false;
                return z48;
            case 4:
                z0a z0a2 = this.b;
                d48 d48 = z0a2.o;
                sqd sqd = z0a2.Y;
                int h = sqd.h(d48);
                z48.k = h > 0 || sqd.d().size() < 100;
                z48.l = h;
                return z48;
            default:
                dfb dfb3 = this.b.z;
                z48.m = (dfb3 == null || dfb3.b == null) ? false : true;
                return z48;
        }
    }
}
