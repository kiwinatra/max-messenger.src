package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: n6  reason: default package */
public final class n6 implements sk3 {
    public final /* synthetic */ ActLocalMedias a;

    public n6(ActLocalMedias actLocalMedias) {
        this.a = actLocalMedias;
    }

    public final void accept(Object obj) {
        qac qac = (qac) obj;
        z0a z0a = this.a.M0;
        z0a.getClass();
        z68.c("z0a", "onQualitySelected: %s", qac.toString());
        i20 a2 = z0a.y.a();
        a2.a = qac;
        z0a.y = new p4g(a2);
        z0a.b0();
        z0a.c0(new bu1(1, qac));
        z0a.c0(new t0a(z0a, 4));
        z0a.X.f("VIDEO_UPLOAD_QUALITY_SELECTED", z0a.y.a.name());
    }
}
