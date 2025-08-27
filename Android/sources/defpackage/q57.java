package defpackage;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.HttpStatus;

/* renamed from: q57  reason: default package */
public final class q57 extends kne {
    public final int o;
    public final ExecutorService p = Executors.newFixedThreadPool(3);
    public final ys9 q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q57(int i) {
        super(5);
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.q = realtimeSinceBootClock;
        this.o = i;
    }

    public final void F(lk5 lk5) {
        ((p57) lk5).f = this.q.now();
    }

    public final HttpURLConnection U(Uri uri, int i) {
        URL url;
        String str;
        Uri uri2 = mzf.a;
        Uri uri3 = null;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = new URL(uri.toString());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.o);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return httpURLConnection;
        }
        if (!(responseCode == 307 || responseCode == 308)) {
            switch (responseCode) {
                case HttpStatus.SC_MULTIPLE_CHOICES /*300*/:
                case HttpStatus.SC_MOVED_PERMANENTLY /*301*/:
                case HttpStatus.SC_MOVED_TEMPORARILY /*302*/:
                case HttpStatus.SC_SEE_OTHER /*303*/:
                    break;
                default:
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", new Object[]{uri.toString(), Integer.valueOf(responseCode)}));
            }
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        if (headerField != null) {
            uri3 = Uri.parse(headerField);
        }
        String scheme = uri.getScheme();
        if (i > 0 && uri3 != null && !hsg.k(uri3.getScheme(), scheme)) {
            return U(uri3, i - 1);
        }
        if (i == 0) {
            String uri4 = uri.toString();
            Locale.getDefault();
            str = "URL " + uri4 + " follows too many redirects";
        } else {
            str = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", new Object[]{uri.toString(), Integer.valueOf(responseCode)});
        }
        throw new IOException(str);
    }

    public final lk5 m(zi0 zi0, yvb yvb) {
        return new lk5(zi0, yvb);
    }

    public final void p(lk5 lk5, p7d p7d) {
        p57 p57 = (p57) lk5;
        p57.d = this.q.now();
        ((ik0) p57.b).a(new o57(0, this.p.submit(new ij3(3, this, p57, p7d, false)), p7d));
    }

    public final HashMap v(lk5 lk5, int i) {
        p57 p57 = (p57) lk5;
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(p57.e - p57.d));
        hashMap.put("fetch_time", Long.toString(p57.f - p57.e));
        hashMap.put("total_time", Long.toString(p57.f - p57.d));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }
}
