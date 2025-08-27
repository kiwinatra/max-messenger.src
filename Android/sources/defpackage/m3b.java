package defpackage;

import android.net.Uri;
import android.os.Message;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: m3b  reason: default package */
public final class m3b extends WebChromeClient {
    public final hjg a;

    public m3b(hjg hjg) {
        this.a = hjg;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Object obj = null;
        n3b n3b = new n3b(webView.getContext(), (AttributeSet) null, 0, 14);
        n3b.setWebViewClient(new l3b(this, n3b));
        if (message != null) {
            obj = message.obj;
        }
        ((WebView.WebViewTransport) obj).setWebView(n3b);
        message.sendToTarget();
        return true;
    }

    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        n3b n3b = webView instanceof n3b ? (n3b) webView : null;
        if (n3b == null) {
            return false;
        }
        ValueCallback<Uri[]> filePathCallback = n3b.getFilePathCallback();
        if (filePathCallback != null) {
            filePathCallback.onReceiveValue((Object) null);
        }
        n3b.setFilePathCallback(valueCallback);
        hjg hjg = this.a;
        hjg.getClass();
        xag.h(hjg.I0, new pig(fileChooserParams));
        return true;
    }
}
