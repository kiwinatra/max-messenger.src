package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: yaa  reason: default package */
public final class yaa {
    public final jtb a;
    public final sv0 b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public yaa(jtb jtb, sv0 sv0, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = jtb;
        this.b = sv0;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy3;
    }

    public final void a(ue3 ue3, Set set) {
        z68.c("NotifConfigLogic", "onChatsAndFolders: step 1: chats", new Object[0]);
        Map map = ue3.c;
        ws wsVar = new ws(0);
        if (map != null) {
            ws wsVar2 = new ws(0);
            for (Map.Entry entry : map.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                rp2 rp2 = (rp2) entry.getValue();
                a32 D = ((r62) this.c.getValue()).D(longValue);
                if (D == null) {
                    r62 r62 = (r62) this.c.getValue();
                    r62.getClass();
                    w62 w62 = new w62();
                    w62.b = l72.b;
                    w62.a = longValue;
                    w62.l = longValue;
                    w62.c = k72.o;
                    w62.r0 = 2;
                    long d2 = ((a74) ((s74) r62.l.get())).b.d(new m72(w62));
                    r62.c0(d2, r62.i0(d2));
                    D = r62.r0(d2, false);
                }
                long j = D.a;
                wsVar.add(Long.valueOf(longValue));
                if (!set.contains(Long.valueOf(j))) {
                    r62 r622 = (r62) this.c.getValue();
                    r622.getClass();
                    z68.c("r62", "changeChatConfiguration, chatId = %d, chatSettings = %s", Long.valueOf(j), rp2);
                    r622.i(j, false, new ms1(10, rp2));
                    wsVar2.add(Long.valueOf(j));
                }
            }
            if (!wsVar2.isEmpty()) {
                this.b.c(new xy2(wsVar2, true, false, (bl4) null, (zub) null, 124));
            }
        }
        z68.c("NotifConfigLogic", "onChatsAndFolders: step 2: folders", new Object[0]);
        t82 t82 = ue3.e;
        if (t82 != null) {
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                w78 w78 = w78.o;
                a67.d(w78, "NotifConfigLogic", "onChatsAndFolders: step 2: folders not null " + ((u82) this.d.getValue()), (Throwable) null);
            }
            ((ia2) ((u82) this.d.getValue())).i(t82.b, t82.a);
        }
        if (!wsVar.isEmpty()) {
            ia2 ia2 = (ia2) ((u82) this.d.getValue());
            aje aje = ia2.H0;
            if (aje != null) {
                aje.b((CancellationException) null);
            }
            ia2.H0 = ev0.v(ia2.y, ia2.x, (f14) null, new ea2(ia2, (Continuation) null), 2);
        }
        z68.c("NotifConfigLogic", "onChatsAndFolders: post config event", new Object[0]);
        this.b.c(new ij0());
    }

    public final void b(ue3 ue3, boolean z) {
        z68.c("NotifConfigLogic", "onConfiguration = " + ue3, new Object[0]);
        z68.c("NotifConfigLogic", "onConfiguration: step 1: hash", new Object[0]);
        String str = ue3.a;
        jtb jtb = this.a;
        if (str != null) {
            cud cud = ((ltb) jtb).b;
            cud.getClass();
            zjd zjd = zjd.a;
            cud.l("hash", str);
        }
        z68.c("NotifConfigLogic", "onConfiguration: step 2: serverSettings", new Object[0]);
        sv0 sv0 = this.b;
        p7d p7d = ue3.b;
        if (p7d != null) {
            cud cud2 = ((ltb) jtb).b;
            Map map = (Map) p7d.b;
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            cud2.getClass();
            String a2 = o5a.a(cud2.z(PmsKey.proxy, (String) null));
            PmsKey pmsKey = PmsKey.f93proxydomains;
            List g = cud2.g(pmsKey.name(), CollectionsKt.emptyList());
            SharedPreferences.Editor edit = cud2.g.edit();
            for (Map.Entry entry : map.entrySet()) {
                y2.h(edit, (String) entry.getKey(), entry.getValue());
            }
            ((cn5) edit).apply();
            HashSet hashSet = cud2.i;
            if (a2 != null) {
                String a3 = o5a.a(cud2.z(PmsKey.proxy, (String) null));
                if (!Intrinsics.areEqual((Object) a2, (Object) a3)) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((aud) it.next()).a(a2, a3);
                    }
                }
            }
            if (map.containsKey("debug-mode")) {
                try {
                    ((om0) cud2.j.getValue()).d(Integer.valueOf(((Number) map.get("debug-mode")).intValue()));
                } catch (Throwable th) {
                    z68.o(cud2.e, "could not parse debug mode", th);
                }
            }
            PmsKey pmsKey2 = PmsKey.f93proxydomains;
            List g2 = cud2.g(pmsKey2.name(), CollectionsKt.emptyList());
            if (!Intrinsics.areEqual((Object) g, (Object) g2)) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((aud) it2.next()).b(g, g2);
                }
            }
            Iterator it3 = cud2.n.iterator();
            while (it3.hasNext()) {
                ((ztd) it3.next()).j();
            }
            if (map.containsKey("react-errors")) {
                cud2.k.a();
            }
            sv0.c(new ij0());
        }
        z68.c("NotifConfigLogic", "onConfiguration: step 3: user settings", new Object[0]);
        n0g n0g = ue3.d;
        if (n0g != null) {
            ltb ltb = (ltb) jtb;
            ltb.c.H(n0g);
            if (Intrinsics.areEqual((Object) n0g.u, (Object) Boolean.FALSE)) {
                a33 a33 = ltb.a;
                a33.l("app.pin_" + a33.s(), (String) null);
            }
            qe3 qe3 = (qe3) this.e.getValue();
            qe3.getClass();
            ev0.v(qe3.b, (CoroutineContext) null, (f14) null, new pe3(qe3, (Continuation) null), 3);
        }
        if (!z) {
            z68.c("NotifConfigLogic", "onConfiguration: step 5: chats settings", new Object[0]);
            a(ue3, SetsKt.emptySet());
            return;
        }
        z68.c("NotifConfigLogic", "onConfiguration: post config event", new Object[0]);
        sv0.c(new ij0());
    }
}
