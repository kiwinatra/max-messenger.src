package defpackage;

import android.content.Context;
import android.net.Uri;
import com.my.tracker.obfuscated.b2;
import com.my.tracker.obfuscated.p2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.externcalls.sdk.waiting_room.ConversationWaitingParticipantId;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* renamed from: hzf  reason: default package */
public final /* synthetic */ class hzf implements za3, eo1, ice, qk3, vu, b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hzf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public Object a() {
        return p2.a((String) this.c, (Context) this.b);
    }

    public void accept(Object obj) {
        Object obj2 = this.c;
        Object obj3 = this.b;
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 6:
                t4g t4g = (t4g) obj3;
                t4g.getClass();
                Locale locale = Locale.ENGLISH;
                StringBuilder sb = new StringBuilder("onError: conversionData=");
                k4g k4g = (k4g) obj2;
                sb.append(k4g);
                z68.f("t4g", sb.toString(), th);
                t4g.a(k4g);
                return;
            default:
                p8g p8g = (p8g) obj3;
                if (!p8g.a(th)) {
                    nd ndVar = (nd) p8g.c.get();
                    k20 k20 = (k20) obj2;
                    if (ndVar != null) {
                        if (cvg.A(k20.h)) {
                            ndVar.e("ACTION_VIDEO_FETCH_FAILURE");
                        } else {
                            ndVar.f("ACTION_VIDEO_FETCH_FAILURE", k20.h);
                        }
                    }
                    z68.f("VideoRipper", "ripVideo: failed to fetch " + k20.g, th);
                    return;
                }
                return;
        }
    }

    public zz7 apply(Object obj) {
        Void voidR = (Void) obj;
        o4d o4d = (o4d) this.b;
        o4d.getClass();
        List list = (List) this.c;
        Integer num = (Integer) ((bx1) list.get(0)).b.k(bx1.j, 100);
        Objects.requireNonNull(num);
        int intValue = num.intValue();
        Integer num2 = (Integer) ((bx1) list.get(0)).b.k(bx1.i, 0);
        Objects.requireNonNull(num2);
        int intValue2 = num2.intValue();
        g6d g6d = ((kxe) ((nqd) o4d.d).b).s;
        return g6d != null ? ((t3f) g6d.b).b(intValue, intValue2) : new xa7(1, new Exception("Failed to take picture: pipeline is not ready."));
    }

    public void b(pa3 pa3) {
        switch (this.a) {
            case 0:
                izf izf = (izf) this.b;
                String str = (String) this.c;
                izf.getClass();
                z68.c("izf", "removeUploadWithPhotoToken: token=" + str, new Object[0]);
                synchronized (izf) {
                    izf.a.e(str).f(((fzf) izf.b.getValue()).e(str)).a();
                }
                if (!pa3.f()) {
                    pa3.b();
                    return;
                }
                return;
            case 1:
                izf izf2 = (izf) this.b;
                bxf bxf = (bxf) this.c;
                izf2.getClass();
                z68.c("izf", "putUpload: upload=" + bxf, new Object[0]);
                synchronized (izf2) {
                    izf2.a.a(bxf).f(((fzf) izf2.b.getValue()).a(bxf)).a();
                }
                if (!pa3.f()) {
                    pa3.b();
                    return;
                }
                return;
            case 2:
                kzf kzf = (kzf) this.b;
                kzf.getClass();
                bxf bxf2 = (bxf) this.c;
                ((Map) kzf.b).put(bxf2.a, bxf2);
                pa3.b();
                return;
            default:
                kzf kzf2 = (kzf) this.b;
                nsb nsb = (nsb) this.c;
                synchronized (((Map) kzf2.b)) {
                    try {
                        Iterator it = ((Map) kzf2.b).entrySet().iterator();
                        while (it.hasNext()) {
                            vyf vyf = ((bxf) ((Map.Entry) it.next()).getValue()).h;
                            if (vyf != null) {
                                if (nsb.test(vyf)) {
                                    it.remove();
                                }
                            }
                        }
                    } finally {
                        while (true) {
                            break;
                        }
                    }
                }
                if (!pa3.f()) {
                    pa3.b();
                    return;
                }
                return;
        }
    }

    public void h(pbe pbe) {
        ArrayList arrayList;
        boolean z;
        pbe pbe2 = pbe;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 5:
                t4g t4g = (t4g) obj2;
                t4g.getClass();
                j4g j4g = (j4g) obj;
                k4g k4g = j4g.a;
                ou8 ou8 = t4g.a;
                wj0 wj0 = (wj0) ou8;
                String str = j4g.c;
                wj0.getClass();
                rac rac = null;
                try {
                    arrayList = sac.a(Uri.parse(str), wj0.a, wj0);
                } catch (Throwable th) {
                    z68.f("wj0", "getAvailableQualitiesForVideo: failed", th);
                    arrayList = null;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    qac qac = k4g.b.a;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        rac rac2 = rac;
                        while (true) {
                            if (it.hasNext()) {
                                rac = (rac) it.next();
                                if (rac.a == qac) {
                                }
                            } else if (rac2 != null) {
                                boolean z2 = rac2.f;
                                p4g p4g = k4g.b;
                                if (!z2 || p4g.b != c44.DEFAULT_ASPECT_RATIO || p4g.c != 1.0f || p4g.d) {
                                    wc8.s(j4g.d);
                                    try {
                                        z = ((qva) ou8).e(j4g.c, j4g.d, p4g.b, p4g.c, rac2, p4g.d, new hxf(10));
                                        nd ndVar = t4g.d;
                                        if (z) {
                                            ndVar.e("VIDEO_CONVERT_SUCCESS");
                                        } else {
                                            ndVar.e("VIDEO_CONVERT_ERROR");
                                        }
                                    } catch (InterruptedException e) {
                                        if (!pbe.f()) {
                                            pbe2.onError(e);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    lf6 a2 = j4g.a();
                                    a2.v = str;
                                    j4g = new j4g(a2);
                                    z = true;
                                }
                                if (pbe.f()) {
                                    return;
                                }
                                if (z) {
                                    lf6 a3 = j4g.a();
                                    a3.b = true;
                                    pbe2.a(new j4g(a3));
                                    return;
                                }
                                pbe2.onError(new RuntimeException("failed to convert video"));
                                return;
                            } else if (!pbe.f()) {
                                pbe2.onError(new RuntimeException("no available quality found for video"));
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (!pbe.f()) {
                    pbe2.onError(new RuntimeException("no available qualities for video"));
                    return;
                } else {
                    return;
                }
                break;
            default:
                WaitingRoomParticipants.resolveInternalIdSingle$lambda$1((WaitingRoomParticipants) obj2, (ConversationWaitingParticipantId) obj, pbe2);
                return;
        }
    }

    public Object r(do1 do1) {
        ((r3g) this.b).getClass();
        Integer valueOf = Integer.valueOf(do1.hashCode());
        bwd bwd = (bwd) this.c;
        ((uz9) bwd.b.g).a.put("androidx.camera.video.VideoCapture.streamUpdate", valueOf);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        n3g n3g = new n3g(atomicBoolean, do1, bwd);
        do1.a(new o6d((Object) atomicBoolean, (Object) bwd, (Object) n3g, 14), ryg.j());
        bwd.b.b(n3g);
        return String.format("%s[0x%x]", new Object[]{"androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(do1.hashCode())});
    }

    public /* synthetic */ hzf(Context context, String str) {
        this.a = 10;
        this.c = str;
        this.b = context;
    }
}
