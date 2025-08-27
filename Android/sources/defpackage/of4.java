package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: of4  reason: default package */
public final /* synthetic */ class of4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf4 b;

    public /* synthetic */ of4(pf4 pf4, int i) {
        this.a = i;
        this.b = pf4;
    }

    public final Object call() {
        Base64OutputStream base64OutputStream;
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        switch (this.a) {
            case 0:
                pf4 pf4 = this.b;
                synchronized (pf4) {
                    try {
                        vx6 vx6 = (vx6) pf4.a.get();
                        ArrayList c = vx6.c();
                        vx6.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < c.size(); i++) {
                            za0 za0 = (za0) c.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", (Object) za0.a);
                            jSONObject.put("dates", (Object) new JSONArray((Collection<?>) za0.b));
                            jSONArray.put((Object) jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", (Object) jSONArray);
                        jSONObject2.put(ClientCookie.VERSION_ATTR, (Object) "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                pf4 pf42 = this.b;
                synchronized (pf42) {
                    ((vx6) pf42.a.get()).h(System.currentTimeMillis(), ((tj4) pf42.c.get()).a());
                }
                return null;
        }
        throw th;
        throw th;
    }
}
