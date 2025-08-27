package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;

/* renamed from: l57  reason: default package */
public final class l57 extends jha {
    public static final /* synthetic */ int x = 0;
    public final Lazy a;
    public final int b;
    public final String c;
    public final String o;
    public final String v;
    public final lfd w;

    public l57(Lazy lazy, int i, String str, String str2, String str3, lfd lfd) {
        this.a = lazy;
        this.b = i;
        this.c = str;
        this.o = str2;
        this.v = str3;
        this.w = lfd;
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [java.lang.Object, pwd] */
    /* JADX WARNING: type inference failed for: r14v3, types: [java.lang.Object, go5] */
    public final void w(cla cla) {
        k57 k57;
        String str;
        m57 m57;
        long j;
        String str2;
        go5 go5 = null;
        k57 k572 = new k57(cla, this.a, this.b, this.c, this.o, this.v, this.w.b());
        cla.c(k572);
        if (!k572.y.get()) {
            int i = k572.b;
            String str3 = k572.c;
            String str4 = k572.o;
            String str5 = k572.v;
            jo5 jo5 = (jo5) ((a57) k572.a.getValue());
            jo5.getClass();
            z68.c("jo5", "upload", new Object[0]);
            File file = new File(str3);
            if (!file.exists()) {
                k572.b("file not found", b59.m);
            } else if (file.length() == 0) {
                k572.b("file is zero length", b59.n);
            } else {
                int y = tr1.y(i);
                if (y == 0) {
                    str = "HTTP_UPLOAD_IMAGE";
                } else if (y == 1) {
                    str = "HTTP_UPLOAD_AUDIO";
                } else if (y == 2) {
                    str = "HTTP_UPLOAD_VIDEO";
                } else if (y != 3) {
                    if (i == 1) {
                        str2 = "PHOTO";
                    } else if (i == 2) {
                        str2 = "AUDIO";
                    } else if (i == 3) {
                        str2 = "VIDEO";
                    } else if (i == 4) {
                        str2 = "FILE";
                    } else if (i == 5) {
                        str2 = "STICKER";
                    } else {
                        throw null;
                    }
                    str = "HTTP_UPLOAD_".concat(str2);
                } else {
                    str = "HTTP_UPLOAD_FILE";
                }
                ? obj = new Object();
                obj.f = jo5.c.b();
                obj.a = str;
                int y2 = tr1.y(i);
                f19 f19 = y2 != 0 ? (y2 == 1 || y2 == 2 || y2 == 3 || y2 == 4) ? jo5.d : null : jo5.e;
                try {
                    sd3 sd3 = new sd3();
                    sd3.n((m57) null, str5);
                    m57 = sd3.c();
                } catch (IllegalArgumentException unused) {
                    m57 = null;
                }
                if (m57 == null) {
                    z68.f("jo5", "url is not valid - try to get new url from server", (Throwable) null);
                    jo5.f(k572);
                } else {
                    if (i == 5) {
                        j = 0;
                    } else if (i == 1) {
                        try {
                            j = jo5.g(m57);
                        } catch (ho5 e) {
                            k57 = k572;
                            k57.b("upload failed", e.a);
                        } catch (IOException e2) {
                            k57 = k572;
                            String obj2 = e2.toString();
                            u47 u47 = b59.l;
                            if (obj2 != null) {
                                u47 = new u47(-1, "UNKNOWN_ERROR", obj2);
                            }
                            k57.b("upload failed", u47);
                        }
                    } else {
                        j = jo5.d(m57);
                    }
                    if (j < 0) {
                        z68.f("jo5", "url expired - try to get new url from server", (Throwable) null);
                        jo5.f(k572);
                    } else {
                        pwd pwd = obj;
                        String str6 = str4;
                        long j2 = j;
                        int i2 = i;
                        k57 = k572;
                        y2d b2 = jo5.b(file, str4, m57, f19, j2, pwd, k572, i2);
                        jtc b3 = ((rla) jo5.b.getValue()).b(b2);
                        ? obj3 = new Object();
                        obj3.b = false;
                        obj3.a = b3;
                        eo5 eo5 = r7;
                        go5 go52 = obj3;
                        eo5 eo52 = new eo5(jo5, b2, k57, pwd, file, new AtomicBoolean(), str6, m57, f19, i2, go52);
                        b3.f(eo5);
                        go5 = go52;
                        k57.set(go5);
                    }
                }
            }
            k57 = k572;
            k57.set(go5);
        }
    }
}
