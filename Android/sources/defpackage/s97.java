package defpackage;

import android.text.TextUtils;
import kotlin.Lazy;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: s97  reason: default package */
public final class s97 {
    public static final /* synthetic */ int c = 0;
    public final Lazy a;
    public final Lazy b;

    public s97(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    public final void a(String str, r97 r97) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty((CharSequence) null)) {
            b(r97);
        } else {
            ((osa) ((gaf) this.b.getValue())).b().p0(EmptyCoroutineContext.INSTANCE, new jh3(this, str, r97));
        }
    }

    public final void b(r97 r97) {
        if (r97 != null) {
            c(new p97(r97, 0));
        }
    }

    public final void c(Runnable runnable) {
        ((osa) ((gaf) this.b.getValue())).c().t0().p0(EmptyCoroutineContext.INSTANCE, runnable);
    }
}
