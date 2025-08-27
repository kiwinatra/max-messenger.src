package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* renamed from: dg6  reason: default package */
public final class dg6 implements sk3 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ FrgAttachVideo b;

    public dg6(FrgAttachVideo frgAttachVideo, HashMap hashMap) {
        this.b = frgAttachVideo;
        this.a = hashMap;
    }

    public final void accept(Object obj) {
        int intValue;
        qac qac = (qac) obj;
        z68.c("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "onQualitySelected %s", qac);
        for (Map.Entry entry : this.a.entrySet()) {
            if (((rac) entry.getValue()).a == qac) {
                npf npf = (npf) entry.getKey();
                j0a j0a = this.b.N1;
                if (j0a != null) {
                    z68.c("j0a", "selectTrackContainer %s", npf);
                    if (j0a.Y()) {
                        m48 m48 = (m48) j0a.b;
                        if (m48.f != null) {
                            sb5 sb5 = m48.b;
                            sb5.getClass();
                            z68.c("sb5", "selectTrackContainer: %s", npf);
                            sb5.u();
                            ic3 ic3 = sb5.b;
                            ic3.getClass();
                            ((a33) ic3.v).j(npf.a.v, "app.video.play.quality");
                            if (npf == npf.c) {
                                rj4 rj4 = (rj4) ic3.a;
                                me8 me8 = rj4.c;
                                if (me8 != null && (intValue = ((Integer) ic3.r(me8).first).intValue()) >= 0) {
                                    fj4 b2 = rj4.b();
                                    SparseArray sparseArray = b2.M;
                                    Map map = (Map) sparseArray.get(intValue);
                                    if (map != null && !map.isEmpty()) {
                                        sparseArray.remove(intValue);
                                    }
                                    rj4.h(b2);
                                }
                            } else {
                                ic3.A(npf.a.v);
                            }
                        }
                        ys7 ys7 = j0a.v;
                        if (ys7.get() != null) {
                            ((nd) ys7.get()).c(npf.a.v, "VIDEO_QUALITY_SELECTED");
                        }
                    }
                }
            }
        }
    }
}
