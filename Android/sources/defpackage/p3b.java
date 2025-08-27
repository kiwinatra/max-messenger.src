package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.InputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.apache.http.HttpHost;

/* renamed from: p3b  reason: default package */
public final class p3b extends WebViewClient {
    public static final /* synthetic */ int d = 0;
    public final hjg a;
    public final u13 b;
    public final Lazy c = LazyKt.lazy(new pna(27));

    public p3b(hjg hjg, u13 u13) {
        this.a = hjg;
        this.b = u13;
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        Object obj;
        if (webView != null) {
            wpc wpc = (wpc) this.c.getValue();
            Context context = webView.getContext();
            int i = r3b.a;
            ThreadLocal threadLocal = wpc.a;
            byte[] bArr = (byte[]) threadLocal.get();
            if (bArr == null) {
                bArr = new byte[65536];
                threadLocal.set(bArr);
            }
            String str2 = null;
            try {
                Result.Companion companion = Result.Companion;
                InputStream openRawResource = context.getResources().openRawResource(i);
                ThreadLocal threadLocal2 = wpc.b;
                byte[] bArr2 = (byte[]) threadLocal2.get();
                if (bArr2 == null) {
                    bArr2 = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
                    threadLocal2.set(bArr2);
                }
                int i2 = 0;
                while (true) {
                    try {
                        int read = openRawResource.read(bArr2, 0, bArr2.length);
                        if (read < 0) {
                            break;
                        }
                        int i3 = i2 + read;
                        if (bArr.length < i3) {
                            byte[] bArr3 = new byte[(bArr.length * 2)];
                            System.arraycopy(bArr, 0, bArr3, 0, i2);
                            threadLocal.set(bArr3);
                            bArr = bArr3;
                        }
                        if (read > 0) {
                            System.arraycopy(bArr2, 0, bArr, i2, read);
                            i2 = i3;
                        }
                    } catch (Throwable th) {
                        CloseableKt.closeFinally(openRawResource, th);
                        throw th;
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(openRawResource, (Throwable) null);
                obj = Result.m23constructorimpl(new String(bArr, 0, i2, Charsets.UTF_8));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m23constructorimpl(ResultKt.createFailure(th2));
            }
            if (!Result.m29isFailureimpl(obj)) {
                str2 = obj;
            }
            String str3 = str2;
            if (str3 != null) {
                webView.evaluateJavascript(str3, new o3b(0));
            }
        }
        super.onPageCommitVisible(webView, str);
    }

    public final void onPageFinished(WebView webView, String str) {
        this.a.B0.b(h7b.a, h7b.b);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        hjg hjg = this.a;
        hjg.getClass();
        h7b h7b = h7b.a;
        xme xme = hjg.B0;
        xme.getClass();
        xme.m((Object) null, h7b);
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        hjg hjg = this.a;
        hjg.getClass();
        h7b h7b = h7b.o;
        xme xme = hjg.B0;
        xme.getClass();
        xme.m((Object) null, h7b);
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        hjg hjg = this.a;
        if (((a33) hjg.x).g.getBoolean("web_app:ssl_check", false)) {
            sslErrorHandler.proceed();
            return;
        }
        h7b h7b = h7b.o;
        xme xme = hjg.B0;
        xme.getClass();
        xme.m((Object) null, h7b);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        u13 u13 = this.b;
        u13.getClass();
        if (!Intrinsics.areEqual((Object) url.getScheme(), (Object) HttpHost.DEFAULT_SCHEME_NAME) && !Intrinsics.areEqual((Object) url.getScheme(), (Object) "https")) {
            try {
                u13.a.startActivity(new Intent("android.intent.action.VIEW", url));
                return true;
            } catch (ActivityNotFoundException unused) {
                return true;
            } catch (Exception e) {
                z68.f("WebAppUrlInterceptor", "Unexpected exception when try to open activity by link", e);
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
