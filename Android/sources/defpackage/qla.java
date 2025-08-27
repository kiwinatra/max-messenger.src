package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: qla  reason: default package */
public final class qla {
    public int A;
    public long B;
    public d6a C;
    public srd a = new srd(6);
    public u6h b = new u6h();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public syc e = new syc(10);
    public boolean f = true;
    public sq6 g;
    public boolean h;
    public boolean i;
    public ejd j;
    public o9a k;
    public Proxy l;
    public ProxySelector m;
    public sq6 n;
    public SocketFactory o;
    public SSLSocketFactory p;
    public X509TrustManager q;
    public List r;
    public List s;
    public HostnameVerifier t;
    public wy1 u;
    public iq v;
    public int w;
    public int x;
    public int y;
    public int z;

    public qla() {
        sq6 sq6 = sq6.b;
        this.g = sq6;
        this.h = true;
        this.i = true;
        this.j = ejd.c;
        this.k = o9a.c;
        this.n = sq6;
        this.o = SocketFactory.getDefault();
        this.r = rla.N0;
        this.s = rla.M0;
        this.t = pla.a;
        this.u = wy1.c;
        this.x = 10000;
        this.y = 10000;
        this.z = 10000;
        this.B = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }
}
