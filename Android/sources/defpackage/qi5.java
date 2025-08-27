package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: qi5  reason: default package */
public final class qi5 {
    public static final /* synthetic */ int h = 0;
    public final rl a;
    public final gcf b;
    public final lfd c;
    public final lfd d;
    public final eef e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final kc3 g = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, kc3] */
    public qi5(rl rlVar, gcf gcf, lfd lfd, lfd lfd2, sv0 sv0, eef eef) {
        this.a = rlVar;
        this.b = gcf;
        this.c = lfd;
        this.d = lfd2;
        this.e = eef;
        sv0.d(this);
    }

    @oye
    public void onEvent(au auVar) {
        ade ade = (ade) this.f.get(Long.valueOf(auVar.a));
        if (ade != null) {
            ade.a(auVar);
        }
    }

    @oye
    public void onEvent(ou ouVar) {
        ade ade = (ade) this.f.get(Long.valueOf(ouVar.a));
        if (ade != null) {
            ade.a(ouVar);
        }
    }

    @oye
    public void onEvent(iu iuVar) {
        ade ade = (ade) this.f.get(Long.valueOf(iuVar.a));
        if (ade != null) {
            ade.a(iuVar);
        }
    }

    @oye
    public void onEvent(lu luVar) {
        ade ade = (ade) this.f.get(Long.valueOf(luVar.a));
        if (ade != null) {
            ade.a(luVar);
        }
    }

    @oye
    public void onEvent(hj0 hj0) {
        ade ade = (ade) this.f.get(Long.valueOf(hj0.a));
        if (ade != null) {
            ade.onError(new TamErrorException(hj0.b));
        }
    }
}
