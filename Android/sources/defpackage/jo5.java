package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.MapsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* renamed from: jo5  reason: default package */
public final class jo5 implements a57 {
    public static final f19 d;
    public static final f19 e;
    public static final Pattern f = Pattern.compile("^([0-9]+)-([0-9]+)/([0-9]+)");
    public final Lazy a;
    public final Lazy b;
    public final yqf c;

    static {
        f19 f19;
        Pattern pattern = f19.d;
        f19 f192 = null;
        try {
            f19 = ct.l("application/x-binary; charset=x-user-defined");
        } catch (IllegalArgumentException unused) {
            f19 = null;
        }
        d = f19;
        try {
            f192 = ct.l("application/octet-stream");
        } catch (IllegalArgumentException unused2) {
        }
        e = f192;
        try {
            ct.l("multipart/form-data");
        } catch (IllegalArgumentException unused3) {
        }
    }

    public jo5(Lazy lazy, yqf yqf) {
        this.a = lazy;
        this.c = yqf;
        this.b = LazyKt.lazy(new ur(14, lazy));
    }

    public static void a(jo5 jo5, pwd pwd, boolean z, String str) {
        pwd.d = z;
        pwd.e = str;
        yqf yqf = jo5.c;
        pwd.g = yqf.b();
        yqf.a(pwd.a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long c(defpackage.k4d r5) {
        /*
            r0 = 0
            java.lang.String r1 = "X-Reason"
            lx6 r2 = r5.w     // Catch:{ Exception -> 0x000c }
            java.lang.String r1 = r2.b(r1)     // Catch:{ Exception -> 0x000c }
            if (r1 == 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            int r5 = r5.o
            u47 r5 = defpackage.b59.A(r5, r1)
            u47 r1 = defpackage.b59.b
            boolean r1 = r1.equals(r5)
            r2 = 0
            java.lang.String r3 = "jo5"
            if (r1 != 0) goto L_0x005e
            u47 r1 = defpackage.b59.c
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0027
            goto L_0x005e
        L_0x0027:
            u47 r1 = defpackage.b59.g
            boolean r1 = r1.equals(r5)
            r4 = 1
            if (r1 != 0) goto L_0x0038
            u47 r1 = defpackage.b59.e
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0039
        L_0x0038:
            r2 = r4
        L_0x0039:
            if (r2 == 0) goto L_0x004b
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r1 = "getErrorUploadPositionFromResponse forbidden or bad request"
            defpackage.z68.n(r3, r0, r1, r5)
            r0 = -1
            return r0
        L_0x004b:
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            java.lang.String r2 = "getErrorUploadPositionFromResponse"
            defpackage.z68.n(r3, r0, r2, r1)
            ho5 r0 = new ho5
            r0.<init>(r5)
            throw r0
        L_0x005e:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r2)
            java.lang.String r1 = "getErrorUploadPositionFromResponse not loaded yet, starting upload from 0"
            defpackage.z68.n(r3, r0, r1, r5)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo5.c(k4d):long");
    }

    public static long e(k4d k4d) {
        lx6 lx6 = k4d.w;
        String b2 = lx6.b("X-Last-Known-Byte");
        String str = null;
        if (b2 == null) {
            b2 = null;
        }
        if (b2 == null) {
            return 0;
        }
        String b3 = lx6.b("X-Last-Known-Byte");
        if (b3 != null) {
            str = b3;
        }
        try {
            return Long.parseLong(str) + 1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static void f(k57 k57) {
        if (!k57.y.get()) {
            k57.w.a(new y86(13, (Object) k57));
        }
    }

    public final y2d b(File file, String str, m57 m57, f19 f19, long j, pwd pwd, k57 k57, int i) {
        hr6 hr6 = new hr6();
        hr6.a = m57;
        hr6.A(UUID.randomUUID().toString());
        int i2 = mh3.$EnumSwitchMapping$0[this.c.c().ordinal()];
        io5 io5 = new io5(file, f19, j, pwd, k57, (i2 == 1 || i2 == 2) ? 32768 : i2 != 3 ? ConstantsKt.DEFAULT_BLOCK_SIZE : 16384);
        if (i == 5) {
            String name = TextUtils.isEmpty(str) ? file.getName() : Uri.encode(str);
            String uuid = UUID.randomUUID().toString();
            vw0 vw0 = new vw0(uuid.getBytes(Charsets.UTF_8));
            vw0.b = uuid;
            f19 f192 = px9.j;
            ArrayList arrayList = new ArrayList();
            f19 f193 = px9.j;
            if (Intrinsics.areEqual((Object) f193.b, (Object) "multipart")) {
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                m5a.e(sb, "file");
                if (name != null) {
                    sb.append("; filename=");
                    m5a.e(sb, name);
                }
                String sb2 = sb.toString();
                ArrayList arrayList2 = new ArrayList(20);
                ct.e("Content-Disposition");
                arrayList2.add("Content-Disposition");
                arrayList2.add(StringsKt.trim((CharSequence) sb2).toString());
                Object[] array = arrayList2.toArray(new String[0]);
                if (array != null) {
                    lx6 lx6 = new lx6((String[]) array);
                    if (lx6.b(HTTP.CONTENT_TYPE) != null) {
                        throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                    } else if (lx6.b(HTTP.CONTENT_LEN) == null) {
                        arrayList.add(new ox9(lx6, io5));
                        if (!arrayList.isEmpty()) {
                            px9 px9 = new px9(vw0, f193, u0g.v(arrayList));
                            Locale locale = Locale.ENGLISH;
                            String m = a81.m("attachment; filename=", name);
                            ((e4) hr6.c).k("Content-type", f193.a);
                            ((e4) hr6.c).k("Content-Disposition", m);
                            hr6.r(HttpPost.METHOD_NAME, px9);
                            return hr6.c();
                        }
                        throw new IllegalStateException("Multipart body must have at least one part.".toString());
                    } else {
                        throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new IllegalArgumentException(("multipart != " + f193).toString());
            }
        } else {
            String num = TextUtils.isEmpty(str) ? Integer.toString(file.getName().hashCode()) : Uri.encode(str);
            Locale locale2 = Locale.ENGLISH;
            long length = file.length();
            StringBuilder n = tr1.n(j, "bytes ", "-/");
            n.append(length);
            String sb3 = n.toString();
            String m2 = a81.m("attachment; filename=", num);
            ((e4) hr6.c).k("Content-Range", sb3);
            ((e4) hr6.c).k("Content-Disposition", m2);
            hr6.r(HttpPost.METHOD_NAME, io5);
            return hr6.c();
        }
    }

    public final long d(m57 m57) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList(20);
        String uuid = UUID.randomUUID().toString();
        Class<Object> cls = Object.class;
        if (uuid == null) {
            linkedHashMap.remove(cls);
        } else {
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(cls, cls.cast(uuid));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            lx6 lx6 = new lx6((String[]) array);
            byte[] bArr = u0g.a;
            k4d h = ((rla) this.a.getValue()).b(new y2d(m57, HttpGet.METHOD_NAME, lx6, (hd8) null, linkedHashMap.isEmpty() ? MapsKt.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)))).h();
            ptc ptc = h.x;
            try {
                if (!h.isSuccessful() || ptc == null) {
                    long c2 = c(h);
                    if (ptc != null) {
                        ptc.close();
                    }
                    return c2;
                }
                String V = ptc.V();
                z68.c("jo5", "getUploadPosition body result: ".concat(V), new Object[0]);
                Matcher matcher = f.matcher(V);
                if (matcher.find()) {
                    long parseLong = Long.parseLong(matcher.group(2));
                    z68.c("jo5", "getUploadPosition result: ".concat(V), new Object[0]);
                    ptc.close();
                    return parseLong;
                }
                z68.f("jo5", "getUploadPosition unexpected response from server, range not found: ".concat(V), (Throwable) null);
                this.c.d("unexpected range header: ".concat(V));
                ptc.close();
                return -1;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw th;
    }

    public final long g(m57 m57) {
        hr6 hr6 = new hr6();
        hr6.a = m57;
        hr6.A(UUID.randomUUID().toString());
        hr6.r(HttpPost.METHOD_NAME, new fo5(0));
        k4d h = ((rla) this.a.getValue()).b(hr6.c()).h();
        ptc ptc = h.x;
        try {
            if (h.isSuccessful()) {
                return e(h);
            }
            long c2 = c(h);
            if (ptc != null) {
                ptc.close();
            }
            return c2;
        } finally {
            if (ptc != null) {
                ptc.close();
            }
        }
    }
}
