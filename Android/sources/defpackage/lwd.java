package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: lwd  reason: default package */
public final class lwd extends qm implements lcf {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lwd(long j, int i) {
        super(j);
        this.o = i;
    }

    private final void t(qaf qaf) {
    }

    public final void e(ibf ibf) {
        long j = this.a;
        switch (this.o) {
            case 0:
                nwd nwd = (nwd) ibf;
                cud cud = ((ltb) q()).b;
                int i = nwd.v;
                cud.getClass();
                zjd zjd = zjd.a;
                cud.k("app-update-type", Long.valueOf((long) i));
                rm rmVar = null;
                if (nwd.v == 1) {
                    rm rmVar2 = this.c;
                    if (rmVar2 == null) {
                        rmVar2 = null;
                    }
                    opa opa = (opa) rmVar2.k.getValue();
                    opa.d.getClass();
                    ((a33) opa.b).l("version.force.update.received", "25.6.4");
                    rm rmVar3 = this.c;
                    if (rmVar3 != null) {
                        rmVar = rmVar3;
                    }
                    ((opa) rmVar.k.getValue()).b();
                    return;
                }
                if (nwd.c != null) {
                    cud cud2 = ((ltb) q()).b;
                    String str = nwd.c;
                    cud2.getClass();
                    String a = o5a.a(str);
                    PmsKey pmsKey = PmsKey.proxy;
                    String a2 = o5a.a(cud2.z(pmsKey, (String) null));
                    if (!Intrinsics.areEqual((Object) a, (Object) a2)) {
                        cud2.l(pmsKey.name(), a);
                        Iterator it = cud2.i.iterator();
                        while (it.hasNext()) {
                            ((aud) it.next()).a(a2, a);
                        }
                    }
                }
                if (nwd.o != null) {
                    ((ltb) q()).a.l("app.location.country.code", nwd.o);
                }
                cud cud3 = ((ltb) q()).b;
                List emptyList = nwd.w == null ? Collections.emptyList() : new ArrayList(nwd.w);
                cud3.getClass();
                PmsKey pmsKey2 = PmsKey.f93proxydomains;
                List g = cud3.g(pmsKey2.name(), CollectionsKt.emptyList());
                if (!Intrinsics.areEqual((Object) g, (Object) emptyList)) {
                    SharedPreferences.Editor edit = cud3.g.edit();
                    y2.h(edit, pmsKey2.name(), emptyList);
                    ((cn5) edit).apply();
                    Iterator it2 = cud3.i.iterator();
                    while (it2.hasNext()) {
                        ((aud) it2.next()).b(g, emptyList);
                    }
                }
                k().c(new js3(j, 7));
                String g2 = j().g();
                if (g2 != null && g2.length() != 0 && !j().f()) {
                    rm rmVar4 = this.c;
                    if (rmVar4 != null) {
                        rmVar = rmVar4;
                    }
                    ((e98) rmVar.l.getValue()).p();
                    return;
                }
                return;
            default:
                k().c(new vxd(j, ((uxd) ibf).c));
                return;
        }
    }

    public final fbf g() {
        switch (this.o) {
            case 0:
                rm rmVar = this.c;
                if (rmVar == null) {
                    rmVar = null;
                }
                e0g h = ((fn4) rmVar.b.getValue()).h();
                rm rmVar2 = this.c;
                if (rmVar2 == null) {
                    rmVar2 = null;
                }
                String a = ((fn4) rmVar2.b.getValue()).a();
                long B = ((ltb) q()).a.B();
                rm rmVar3 = this.c;
                if (rmVar3 == null) {
                    rmVar3 = null;
                }
                String str = (String) ((hn4) ((fn4) rmVar3.b.getValue())).l.get();
                fbf fbf = new fbf((x3b) null);
                HashMap hashMap = new HashMap();
                hashMap.put("deviceType", h.a);
                hashMap.put("pushDeviceType", i2a.e(h.j));
                hashMap.put("appVersion", h.b);
                hashMap.put("buildNumber", Integer.valueOf(h.c));
                String str2 = h.d;
                if (!(str2 == null || str2.length() == 0)) {
                    hashMap.put("appKey", str2);
                }
                hashMap.put("osVersion", h.e);
                hashMap.put("locale", h.f);
                hashMap.put("deviceLocale", h.g);
                hashMap.put("deviceName", h.h);
                hashMap.put("screen", h.i);
                hashMap.put("timezone", h.k.getID());
                fbf.s("userAgent", hashMap);
                fbf.t("deviceId", a);
                fbf.p(B, "clientSessionId");
                if (cvg.D(str)) {
                    fbf.t("mt_instanceid", str);
                }
                return fbf;
            default:
                return new jw9((x3b) null, 11);
        }
    }

    public final void h(qaf qaf) {
        switch (this.o) {
            case 0:
                rm rmVar = this.c;
                if (rmVar == null) {
                    rmVar = null;
                }
                owd owd = (owd) rmVar.j.getValue();
                owd.getClass();
                String str = owd.f;
                z68.c(str, "onSessionInitFail, error = " + qaf, new Object[0]);
                if (Intrinsics.areEqual((Object) "session.state", (Object) qaf.b)) {
                    String str2 = qaf.c;
                    z68.c(str, "session state error: " + str2 + " do nothing", new Object[0]);
                    return;
                } else if (!(qaf instanceof aaf)) {
                    if (Intrinsics.areEqual((Object) "proto.state", (Object) qaf.b)) {
                        KProperty kProperty = owd.e[0];
                        ((uta) ((m95) owd.a.get())).c(new TamErrorException(qaf), true);
                    }
                    KProperty kProperty2 = owd.e[3];
                    ((zbf) owd.d.get()).g();
                    return;
                } else {
                    KProperty[] kPropertyArr = owd.e;
                    KProperty kProperty3 = kPropertyArr[1];
                    if (((jxd) ((hxd) owd.b.get())).h == 2) {
                        KProperty kProperty4 = kPropertyArr[2];
                        jna jna = (jna) ((rl) owd.c.get());
                        jna.z(jna, new lwd(((ltb) jna.D()).a.n(), 0));
                        return;
                    }
                    return;
                }
            default:
                return;
        }
    }
}
