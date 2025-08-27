package defpackage;

import java.util.Map;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: o8g  reason: default package */
public final /* synthetic */ class o8g implements ri8, qk3 {
    public final /* synthetic */ p8g a;
    public final /* synthetic */ l20 b;
    public final /* synthetic */ k20 c;

    public /* synthetic */ o8g(p8g p8g, k20 k20, l20 l20) {
        this.a = p8g;
        this.c = k20;
        this.b = l20;
    }

    public void accept(Object obj) {
        p8g p8g = this.a;
        p8g.getClass();
        String str = this.b.q;
        p8g.a.getClass();
        h5g.a.put(str, new g5g((jk5) obj, System.currentTimeMillis()));
        nd ndVar = (nd) p8g.c.get();
        if (ndVar != null) {
            k20 k20 = this.c;
            if (cvg.A(k20.h)) {
                ndVar.e("ACTION_VIDEO_FETCH_OK");
            } else {
                ndVar.f("ACTION_VIDEO_FETCH_OK", k20.h);
            }
        }
    }

    public void e(rh8 rh8) {
        p8g p8g = this.a;
        p8g.getClass();
        k20 k20 = this.c;
        String str = k20.g;
        if (cvg.A(str) || prg.b(str) || !cvg.A(gdg.b(str)) || !cvg.A(ei7.b(str))) {
            if (k20.f) {
                if (k20.j > p8g.g.a.m()) {
                    if (!rh8.f()) {
                        rh8.onError(new FetcherException(7, "live stream not started"));
                        return;
                    }
                    return;
                }
            }
            l20 l20 = this.b;
            String b2 = p8g.b(l20);
            if (cvg.A(b2)) {
                p8g.a.getClass();
                Map map = h5g.a;
                String str2 = l20.q;
                g5g g5g = (g5g) map.get(str2);
                jk5 jk5 = null;
                if (g5g != null) {
                    if (g5g.b + 3600000 > System.currentTimeMillis()) {
                        jk5 = g5g.a;
                    } else {
                        map.remove(str2);
                    }
                }
                if (jk5 == null) {
                    if (!rh8.f()) {
                        rh8.b();
                    }
                } else if (!rh8.f()) {
                    rh8.a(jk5);
                }
            } else {
                z68.c("VideoRipper", "getVideoContent: local path = %s", b2);
                if (!rh8.f()) {
                    rh8.b();
                }
            }
        } else if (!rh8.f()) {
            rh8.onError(new FetcherException(5, "Video hosting in black list"));
        }
    }

    public /* synthetic */ o8g(p8g p8g, l20 l20, k20 k20) {
        this.a = p8g;
        this.b = l20;
        this.c = k20;
    }
}
