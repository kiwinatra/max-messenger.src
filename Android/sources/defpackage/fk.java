package defpackage;

import android.text.Spanned;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;

/* renamed from: fk  reason: default package */
public final class fk {
    public static final /* synthetic */ int f = 0;
    public final AtomicReference a = new AtomicReference(wi.b);
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public y35 d = new y35(MapsKt.emptyMap());
    public HashMap e = new HashMap();

    static {
        Reflection.getOrCreateKotlinClass(fk.class).getSimpleName();
    }

    public fk() {
        xi.a.getClass();
    }

    public final RLottieDrawable a(String str, String str2) {
        String str3 = str;
        ConcurrentHashMap concurrentHashMap = this.c;
        RLottieDrawable rLottieDrawable = (RLottieDrawable) concurrentHashMap.get(str3);
        if (rLottieDrawable != null) {
            return rLottieDrawable;
        }
        int a2 = ((xi) this.a.get()).a();
        RLottieDrawable create = RLottieFactory.create(new RLottieFactory.Config(new RLottieFactory.Way.Url(str2, true, a2, a2, false, 16, (DefaultConstructorMarker) null), false, true, true, false, 18, (DefaultConstructorMarker) null));
        create.setCallback(qu4.a);
        concurrentHashMap.put(str3, create);
        return create;
    }

    public final List b(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned) || charSequence.length() == 0 || this.e.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        Object[] objArr = null;
        try {
            Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
            if (spanned != null) {
                objArr = spanned.getSpans(0, length, kuf.class);
            }
        } catch (Throwable unused) {
        }
        kuf[] kufArr = (kuf[]) objArr;
        if (kufArr != null) {
            for (kuf kuf : kufArr) {
                try {
                    int spanStart = ((Spanned) charSequence).getSpanStart(kuf);
                    int spanEnd = ((Spanned) charSequence).getSpanEnd(kuf);
                    k15 k15 = (k15) this.e.get(charSequence.subSequence(spanStart, spanEnd).toString());
                    if (k15 != null) {
                        arrayList.add(new qi(charSequence.subSequence(spanStart, spanEnd).toString(), k15, spanStart, spanEnd));
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        return CollectionsKt.sortedWith(arrayList, new cx4(7));
    }
}
