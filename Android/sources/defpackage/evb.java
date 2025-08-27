package defpackage;

import java.util.Map;
import kotlin.reflect.KProperty;

/* renamed from: evb  reason: default package */
public final class evb {
    public static final /* synthetic */ KProperty[] d;
    public static final String e;
    public final jtb a;
    public final hs7 b;
    public final hs7 c;

    static {
        Class<evb> cls = evb.class;
        d = new KProperty[]{wj6.p(cls, "discardServerDraftUseCase", "getDiscardServerDraftUseCase()Lru/ok/tamtam/draft/DiscardServerDraftUseCase;", 0), wj6.p(cls, "downloadDraftUseCase", "getDownloadDraftUseCase()Lru/ok/tamtam/draft/DownloadDraftUseCase;", 0)};
        e = cls.getName();
    }

    public evb(jtb jtb, hs7 hs7, hs7 hs72) {
        this.a = jtb;
        this.b = hs7;
        this.c = hs72;
    }

    public final void a(ku4 ku4, long j) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        String str = e;
        z68.c(str, "execute: draftsNews=" + ku4 + ", serverTime=" + j + "ms", new Object[0]);
        ltb ltb = (ltb) this.a;
        ltb.a.k("user.draftsLastSync", Long.valueOf(j));
        if (!ltb.b.w()) {
            z68.c(str, "Drafts sync disabled", new Object[0]);
        } else if (ku4 != null) {
            zt4 zt4 = ku4.a;
            Map map5 = zt4 != null ? zt4.a : null;
            hs7 hs7 = this.b;
            KProperty[] kPropertyArr = d;
            if (!(map5 == null || map5.isEmpty() || zt4 == null || (map4 = zt4.a) == null)) {
                for (Map.Entry entry : map4.entrySet()) {
                    KProperty kProperty = kPropertyArr[0];
                    ((hp4) hs7.get()).a(((Number) entry.getValue()).longValue(), (Long) entry.getKey(), (Long) null);
                }
            }
            zt4 zt42 = ku4.b;
            Map map6 = zt42 != null ? zt42.a : null;
            if (!(map6 == null || map6.isEmpty() || zt42 == null || (map3 = zt42.a) == null)) {
                for (Map.Entry entry2 : map3.entrySet()) {
                    KProperty kProperty2 = kPropertyArr[0];
                    ((hp4) hs7.get()).a(((Number) entry2.getValue()).longValue(), (Long) null, (Long) entry2.getKey());
                }
            }
            Map map7 = zt4 != null ? zt4.b : null;
            hs7 hs72 = this.c;
            if (!(map7 == null || map7.isEmpty() || zt4 == null || (map2 = zt4.b) == null)) {
                for (Map.Entry entry3 : map2.entrySet()) {
                    KProperty kProperty3 = kPropertyArr[1];
                    ((ur4) hs72.get()).a((Long) entry3.getKey(), (Long) null, (qtd) entry3.getValue());
                }
            }
            Map map8 = zt42 != null ? zt42.b : null;
            if (map8 != null && !map8.isEmpty() && zt42 != null && (map = zt42.b) != null) {
                for (Map.Entry entry4 : map.entrySet()) {
                    long longValue = ((Number) entry4.getKey()).longValue();
                    KProperty kProperty4 = kPropertyArr[1];
                    ((ur4) hs72.get()).a((Long) null, Long.valueOf(longValue), (qtd) entry4.getValue());
                }
            }
        }
    }
}
