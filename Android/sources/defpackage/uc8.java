package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: uc8  reason: default package */
public final class uc8 extends xag {
    public static final spa X = new spa(olc.oneme_main_calls_title, new qpa(lva.a), mva.c, ":call-list", mva.b);
    public static final spa Y = new spa(olc.oneme_main_chats_title, new ppa(new z36(1), new wg7(11)), mva.e, ":chat-list", mva.d);
    public static final spa Z = new spa(olc.oneme_main_settings_title, new ppa(new z36(2), new wg7(12)), mva.j, ":settings", mva.i);
    public static final spa z = new spa(nva.a, new qpa(lva.c), mva.g, ":contact-list", mva.f);
    public final fq b;
    public final List c;
    public spa o;
    public final xme v;
    public final etc w;
    public final lc5 x = new lc5(28, (Object) this);
    public final bs5 y;

    public uc8(hq hqVar, hr0 hr0, String str) {
        Object obj;
        this.b = hqVar;
        spa spa = z;
        spa spa2 = X;
        spa spa3 = Y;
        List listOf = CollectionsKt.listOf(spa, spa2, spa3, Z);
        this.c = listOf;
        this.o = spa3;
        xme a = f6e.a(Boolean.valueOf(hqVar.c("app.messages.calls.menu.item", true)));
        this.v = a;
        this.w = new etc(a);
        this.y = hr0.c;
        Iterator it = listOf.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((spa) obj).d, (Object) str)) {
                break;
            }
        }
        spa spa4 = (spa) obj;
        this.o = spa4 != null ? spa4 : spa3;
        fq fqVar = this.b;
        lc5 lc5 = this.x;
        hq hqVar2 = (hq) fqVar;
        hqVar2.getClass();
        gq gqVar = new gq(hqVar2, lc5);
        hqVar2.l.put(lc5, gqVar);
        hqVar2.g.registerOnSharedPreferenceChangeListener(gqVar);
    }

    public final void i() {
        hq hqVar = (hq) this.b;
        ls7 ls7 = hqVar.g;
        WeakHashMap weakHashMap = hqVar.l;
        lc5 lc5 = this.x;
        ls7.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) weakHashMap.get(lc5));
        weakHashMap.remove(lc5);
    }
}
