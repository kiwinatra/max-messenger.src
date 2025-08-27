package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;
import one.me.webview.FaqWebViewWidget;

/* renamed from: bh5  reason: default package */
public final class bh5 extends WebViewClient {
    public final /* synthetic */ FaqWebViewWidget a;

    public bh5(FaqWebViewWidget faqWebViewWidget) {
        this.a = faqWebViewWidget;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
            String scheme = url.getScheme();
            FaqWebViewWidget faqWebViewWidget = this.a;
            if (scheme == null || !StringsKt__StringsKt.contains$default((CharSequence) scheme, (CharSequence) "mailto", false, 2, (Object) null)) {
                String scheme2 = url.getScheme();
                if (scheme2 != null && StringsKt__StringsKt.contains$default((CharSequence) scheme2, (CharSequence) ((fz7) ((cm) faqWebViewWidget.o.getValue())).b, false, 2, (Object) null)) {
                    KProperty[] kPropertyArr = FaqWebViewWidget.x;
                    try {
                        faqWebViewWidget.startActivity(new Intent("android.intent.action.VIEW", url));
                    } catch (ActivityNotFoundException e) {
                        String name = FaqWebViewWidget.class.getName();
                        String message = e.getMessage();
                        z68.f(name, "error handleUrl - " + url + ": " + message, e);
                    }
                    return true;
                }
            } else {
                KProperty[] kPropertyArr2 = FaqWebViewWidget.x;
                aje v = ev0.v(faqWebViewWidget.getViewLifecycleScope(), (CoroutineContext) null, f14.b, new dh5(faqWebViewWidget, (Continuation) null), 1);
                faqWebViewWidget.c.setValue(faqWebViewWidget, FaqWebViewWidget.x[1], v);
                return true;
            }
        }
        return false;
    }
}
