package defpackage;

import java.util.Collection;
import java.util.Locale;

/* renamed from: mg6  reason: default package */
public final /* synthetic */ class mg6 implements nsb, qk3 {
    public final /* synthetic */ Collection a;

    public /* synthetic */ mg6(Collection collection) {
        this.a = collection;
    }

    public void accept(Object obj) {
        z68.f("vqe", String.format(Locale.ENGLISH, "storeStickerSetsFromServer: failed for %s", new Object[]{this.a}), (Throwable) obj);
    }

    public boolean test(Object obj) {
        return this.a.contains((Long) obj);
    }
}
