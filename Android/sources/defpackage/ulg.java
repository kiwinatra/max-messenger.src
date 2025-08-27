package defpackage;

import android.webkit.JavascriptInterface;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: ulg  reason: default package */
public final class ulg {
    public final hjg a;

    public ulg(hjg hjg) {
        this.a = hjg;
    }

    @JavascriptInterface
    public final void postEvent(String str, String str2) {
        tgg tgg = this.a.A0;
        ev0.v((d14) tgg.a, ((osa) ((gaf) tgg.b)).a(), (f14) null, new ro7(str, str2, tgg, (Continuation) null), 2);
    }

    @JavascriptInterface
    public final void resolveShare(String str, byte[] bArr, String str2, String str3) {
        hjg hjg = this.a;
        hjg.getClass();
        xag.g(hjg, (CoroutineContext) null, (f14) null, new ajg(hjg, str, bArr, str2, str3, (Continuation) null), 3);
    }
}
