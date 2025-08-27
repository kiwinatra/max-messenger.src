package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: vd4  reason: default package */
public final class vd4 implements h74 {
    public ypc X;
    public h74 Y;
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final h74 c;
    public wl5 o;
    public qt v;
    public ev3 w;
    public h74 x;
    public tuf y;
    public d74 z;

    public vd4(Context context, h74 h74) {
        this.a = context.getApplicationContext();
        h74.getClass();
        this.c = h74;
    }

    public static void b(h74 h74, arf arf) {
        if (h74 != null) {
            h74.O(arf);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [wl5, h74, cj0] */
    /* JADX WARNING: type inference failed for: r0v18, types: [d74, h74, cj0] */
    public final long N(p74 p74) {
        y64.j(this.Y == null);
        String scheme = p74.a.getScheme();
        int i = t0g.a;
        Uri uri = p74.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.o == null) {
                    ? cj0 = new cj0(false);
                    this.o = cj0;
                    a(cj0);
                }
                this.Y = this.o;
            } else {
                if (this.v == null) {
                    qt qtVar = new qt(context);
                    this.v = qtVar;
                    a(qtVar);
                }
                this.Y = this.v;
            }
        } else if ("asset".equals(scheme)) {
            if (this.v == null) {
                qt qtVar2 = new qt(context);
                this.v = qtVar2;
                a(qtVar2);
            }
            this.Y = this.v;
        } else if ("content".equals(scheme)) {
            if (this.w == null) {
                ev3 ev3 = new ev3(context);
                this.w = ev3;
                a(ev3);
            }
            this.Y = this.w;
        } else {
            boolean equals = "rtmp".equals(scheme);
            h74 h74 = this.c;
            if (equals) {
                if (this.x == null) {
                    try {
                        h74 h742 = (h74) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor((Class[]) null).newInstance((Object[]) null);
                        this.x = h742;
                        a(h742);
                    } catch (ClassNotFoundException unused) {
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.x == null) {
                        this.x = h74;
                    }
                }
                this.Y = this.x;
            } else if ("udp".equals(scheme)) {
                if (this.y == null) {
                    tuf tuf = new tuf();
                    this.y = tuf;
                    a(tuf);
                }
                this.Y = this.y;
            } else if ("data".equals(scheme)) {
                if (this.z == null) {
                    ? cj02 = new cj0(false);
                    this.z = cj02;
                    a(cj02);
                }
                this.Y = this.z;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.X == null) {
                    ypc ypc = new ypc(context);
                    this.X = ypc;
                    a(ypc);
                }
                this.Y = this.X;
            } else {
                this.Y = h74;
            }
        }
        return this.Y.N(p74);
    }

    public final void O(arf arf) {
        arf.getClass();
        this.c.O(arf);
        this.b.add(arf);
        b(this.o, arf);
        b(this.v, arf);
        b(this.w, arf);
        b(this.x, arf);
        b(this.y, arf);
        b(this.z, arf);
        b(this.X, arf);
    }

    public final void a(h74 h74) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                h74.O((arf) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final void close() {
        h74 h74 = this.Y;
        if (h74 != null) {
            try {
                h74.close();
            } finally {
                this.Y = null;
            }
        }
    }

    public final Uri getUri() {
        h74 h74 = this.Y;
        if (h74 == null) {
            return null;
        }
        return h74.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        h74 h74 = this.Y;
        h74.getClass();
        return h74.read(bArr, i, i2);
    }

    public final Map x() {
        h74 h74 = this.Y;
        return h74 == null ? Collections.emptyMap() : h74.x();
    }
}
