package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: l3b  reason: default package */
public final class l3b extends WebViewClient {
    public final /* synthetic */ m3b a;
    public final /* synthetic */ n3b b;

    public l3b(m3b m3b, n3b n3b) {
        this.a = m3b;
        this.b = n3b;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        hjg hjg = this.a.a;
        hjg.getClass();
        xag.h(hjg.I0, new lig(uri));
        this.b.destroy();
        return true;
    }
}
