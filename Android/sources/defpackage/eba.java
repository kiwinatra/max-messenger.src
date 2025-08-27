package defpackage;

import kotlin.reflect.KProperty;

/* renamed from: eba  reason: default package */
public final class eba {
    public static final /* synthetic */ KProperty[] d;
    public static final String e;
    public final hs7 a;
    public final hs7 b;
    public final hs7 c;

    static {
        Class<eba> cls = eba.class;
        d = new KProperty[]{wj6.p(cls, "prefs", "getPrefs()Lru/ok/tamtam/Prefs;", 0), wj6.p(cls, "discardServerDraftUseCase", "getDiscardServerDraftUseCase()Lru/ok/tamtam/draft/DiscardServerDraftUseCase;", 0), wj6.p(cls, "downloadDraftUseCase", "getDownloadDraftUseCase()Lru/ok/tamtam/draft/DownloadDraftUseCase;", 0)};
        e = cls.getName();
    }

    public eba(hs7 hs7, hs7 hs72, hs7 hs73) {
        this.a = hs7;
        this.b = hs72;
        this.c = hs73;
    }

    public final jtb a() {
        KProperty kProperty = d[0];
        return (jtb) this.a.get();
    }
}
