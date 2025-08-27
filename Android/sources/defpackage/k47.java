package defpackage;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.http.HttpStatusApiException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonSyntaxException;

/* renamed from: k47  reason: default package */
public final class k47 implements xl {
    public final p9a a;
    public final gm4 b = new gm4();
    public final bk3 c = bk3.v;
    public final dbe d = rz3.a;
    public jm e = jm.a;

    public k47(p9a p9a) {
        this.a = p9a;
    }

    public final Object a(am amVar, yl ylVar) {
        int i;
        String str;
        b57 b57;
        b57 b572;
        bk3 bk3 = this.c;
        try {
            this.e.debugApiRequest(this, amVar, ylVar);
            eud b2 = b(amVar, ylVar);
            c57 c57 = (c57) b2.o;
            this.a.getClass();
            i57 f = p9a.f(b2);
            c57 c572 = (c57) f.c;
            int i2 = f.b;
            if (i2 == 200) {
                try {
                    af6 af6 = (af6) f.o;
                    af6.getClass();
                    tp7 a2 = tp7.a(new BufferedInputStream(((HttpURLConnection) af6.b).getInputStream()));
                    if (c572.b(SM.SET_COOKIE)) {
                        dbe dbe = this.d;
                        rz3.a(dbe, c572);
                        dbe.getClass();
                    }
                    if (c572.b("Invocation-Error") || c572.b("WMF-Invocation-Error")) {
                        throw ((Throwable) amVar.getFailParser().parse(this.e.debugApiResponseFail(this, amVar, a2)));
                    }
                    i = 0;
                    str = null;
                    Object parse = amVar.getOkParser().parse(this.e.debugApiResponseOk(this, amVar, a2));
                    b57[] b57Arr = (b57[]) c57.b;
                    int length = b57Arr.length;
                    while (true) {
                        if (i >= length) {
                            b572 = null;
                            break;
                        }
                        b572 = b57Arr[i];
                        if (StringsKt__StringsJVMKt.equals(b572.a, "Geo-Position", true)) {
                            break;
                        }
                        i++;
                    }
                    if ((b572 != null ? b572.b : null) != null) {
                        bk3.getClass();
                    }
                    CloseableKt.closeFinally(f, (Throwable) null);
                    return parse;
                } catch (JsonSyntaxException e2) {
                    throw new Exception(e2);
                } catch (JsonParseException e3) {
                    throw new Exception(e3);
                } catch (JsonSyntaxException e4) {
                    throw new Exception(e4);
                } catch (JsonParseException e5) {
                    throw new Exception(e5);
                } catch (Throwable th) {
                    CloseableKt.closeFinally(f, th);
                    throw th;
                }
            } else {
                throw new HttpStatusApiException(i2);
            }
        } catch (ApiException e6) {
            this.e.debugApiException(this, amVar, e6);
            throw e6;
        } catch (IOException e7) {
            this.e.debugIoException(this, amVar, e7);
            throw e7;
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [g7a, java.lang.Object] */
    public final eud b(hm hmVar, yl ylVar) {
        String uri;
        Object obj;
        String str;
        ArrayList arrayList = new ArrayList();
        hmVar.getPriority();
        boolean shouldPost = hmVar.shouldPost();
        int i = 1;
        gm4 gm4 = this.b;
        if (shouldPost) {
            uri = gm4.a(hmVar).toString();
            arrayList.add(new b57(HTTP.CONTENT_TYPE, URLEncodedUtils.CONTENT_TYPE));
            if (hmVar.shouldGzip()) {
                arrayList.add(new b57(HTTP.CONTENT_ENCODING, "gzip"));
            }
            if (Intrinsics.areEqual((Object) uri, (Object) "https") || StringsKt__StringsJVMKt.startsWith$default(uri, "https:", false, 2, (Object) null)) {
                i = 2;
            }
            ? obj2 = new Object();
            obj2.d = this;
            obj2.b = hmVar;
            obj2.c = ylVar;
            obj2.a = i;
            str = HttpPost.METHOD_NAME;
            obj = obj2;
        } else {
            uri = gm4.a(hmVar).toString();
            int i2 = 3;
            if (m47.$EnumSwitchMapping$0[tr1.y(3)] == 1) {
                if (Intrinsics.areEqual((Object) uri, (Object) "https") || StringsKt__StringsJVMKt.startsWith$default(uri, "https:", false, 2, (Object) null)) {
                    i = 2;
                }
                i2 = i;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            gm4.f(byteArrayOutputStream, hmVar, ylVar, i2);
            if (byteArrayOutputStream.size() != 0) {
                StringBuilder m = g63.m(uri, StringsKt__StringsKt.indexOf$default((CharSequence) uri, '?', 0, false, 6, (Object) null) < 0 ? "?" : "&");
                m.append(byteArrayOutputStream.toString("UTF-8"));
                uri = m.toString();
            }
            obj = null;
            str = HttpGet.METHOD_NAME;
        }
        String str2 = str;
        String str3 = uri;
        Object obj3 = obj;
        if (hmVar instanceof bm0) {
            String str4 = ((bm0) hmVar).a;
            if (str4 != null) {
                "batch.executeV2-".concat(str4);
            }
        } else {
            Uri uri2 = hmVar.getUri();
            if (!Intrinsics.areEqual((Object) uri2.getScheme(), (Object) "ok") || !Intrinsics.areEqual((Object) uri2.getAuthority(), (Object) "api")) {
                uri2.getPath();
            } else {
                um.b(uri2);
            }
        }
        if (Intrinsics.areEqual((Object) hmVar.getUri().getAuthority(), (Object) "api")) {
            this.c.getClass();
            this.d.getClass();
        }
        arrayList.add(new b57("Accept", "application/json"));
        if (str3 != null) {
            return new eud(7, str2, str3, new c57(0, (b57[]) arrayList.toArray(new b57[0])), obj3);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
