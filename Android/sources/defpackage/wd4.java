package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: wd4  reason: default package */
public final class wd4 implements j74 {
    public zpc X;
    public j74 Y;
    public final Context a;
    public final ArrayList b;
    public final j74 c;
    public xl5 o;
    public rt v;
    public fv3 w;
    public j74 x;
    public uuf y;
    public e74 z;

    public wd4(Context context) {
        this(context, new bg4((String) null, 8000, 8000, false, new fj(12, (byte) 0)));
    }

    public static void b(j74 j74, brf brf) {
        if (j74 != null) {
            j74.H(brf);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [xl5, j74, dj0] */
    /* JADX WARNING: type inference failed for: r0v18, types: [e74, j74, dj0] */
    public final long G(q74 q74) {
        n79.n(this.Y == null);
        String scheme = q74.a.getScheme();
        int i = v0g.a;
        Uri uri = q74.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.o == null) {
                    ? dj0 = new dj0(false);
                    this.o = dj0;
                    a(dj0);
                }
                this.Y = this.o;
            } else {
                if (this.v == null) {
                    rt rtVar = new rt(context);
                    this.v = rtVar;
                    a(rtVar);
                }
                this.Y = this.v;
            }
        } else if ("asset".equals(scheme)) {
            if (this.v == null) {
                rt rtVar2 = new rt(context);
                this.v = rtVar2;
                a(rtVar2);
            }
            this.Y = this.v;
        } else if ("content".equals(scheme)) {
            if (this.w == null) {
                fv3 fv3 = new fv3(context);
                this.w = fv3;
                a(fv3);
            }
            this.Y = this.w;
        } else {
            boolean equals = "rtmp".equals(scheme);
            j74 j74 = this.c;
            if (equals) {
                if (this.x == null) {
                    try {
                        j74 j742 = (j74) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor((Class[]) null).newInstance((Object[]) null);
                        this.x = j742;
                        a(j742);
                    } catch (ClassNotFoundException unused) {
                        i8b.V("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.x == null) {
                        this.x = j74;
                    }
                }
                this.Y = this.x;
            } else if ("udp".equals(scheme)) {
                if (this.y == null) {
                    uuf uuf = new uuf();
                    this.y = uuf;
                    a(uuf);
                }
                this.Y = this.y;
            } else if ("data".equals(scheme)) {
                if (this.z == null) {
                    ? dj02 = new dj0(false);
                    this.z = dj02;
                    a(dj02);
                }
                this.Y = this.z;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.X == null) {
                    zpc zpc = new zpc(context);
                    this.X = zpc;
                    a(zpc);
                }
                this.Y = this.X;
            } else {
                this.Y = j74;
            }
        }
        return this.Y.G(q74);
    }

    public final void H(brf brf) {
        brf.getClass();
        this.c.H(brf);
        this.b.add(brf);
        b(this.o, brf);
        b(this.v, brf);
        b(this.w, brf);
        b(this.x, brf);
        b(this.y, brf);
        b(this.z, brf);
        b(this.X, brf);
    }

    public final void a(j74 j74) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                j74.H((brf) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final void close() {
        j74 j74 = this.Y;
        if (j74 != null) {
            try {
                j74.close();
            } finally {
                this.Y = null;
            }
        }
    }

    public final Uri getUri() {
        j74 j74 = this.Y;
        if (j74 == null) {
            return null;
        }
        return j74.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        j74 j74 = this.Y;
        j74.getClass();
        return j74.read(bArr, i, i2);
    }

    public final Map x() {
        j74 j74 = this.Y;
        return j74 == null ? Collections.emptyMap() : j74.x();
    }

    public wd4(Context context, j74 j74) {
        this.a = context.getApplicationContext();
        j74.getClass();
        this.c = j74;
        this.b = new ArrayList();
    }
}
