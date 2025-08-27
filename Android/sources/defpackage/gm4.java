package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* renamed from: gm4  reason: default package */
public final class gm4 implements ee5, is7 {
    public static xxe c;
    public static xxe o;
    public volatile Object a;
    public final Object b;

    public /* synthetic */ gm4(Object obj) {
        this.b = obj;
    }

    public Uri a(hm hmVar) {
        Uri uri = hmVar.getUri();
        if (!Intrinsics.areEqual((Object) uri.getScheme(), (Object) "ok")) {
            return uri;
        }
        Uri u = ((l47) this.a).u(uri.getAuthority());
        Uri.Builder encodedAuthority = uri.buildUpon().scheme(u.getScheme()).encodedAuthority(u.getEncodedAuthority());
        String encodedPath = u.getEncodedPath();
        String encodedPath2 = uri.getEncodedPath();
        if (encodedPath == null || encodedPath.length() == 0 || Intrinsics.areEqual((Object) encodedPath, (Object) "/")) {
            encodedPath = encodedPath2;
        } else if (!(encodedPath2 == null || encodedPath2.length() == 0 || Intrinsics.areEqual((Object) encodedPath2, (Object) "/"))) {
            if (encodedPath.charAt(encodedPath.length() - 1) == '/') {
                encodedPath = encodedPath.substring(0, encodedPath.length() - 1);
            }
            encodedPath = tr1.j(encodedPath, encodedPath2);
        }
        Uri.Builder encodedPath3 = encodedAuthority.encodedPath(encodedPath);
        String encodedQuery = u.getEncodedQuery();
        String encodedQuery2 = uri.getEncodedQuery();
        if (!(encodedQuery == null || encodedQuery.length() == 0)) {
            if (!(encodedQuery2 == null || encodedQuery.length() == 0)) {
                encodedQuery = encodedQuery + Typography.amp + encodedQuery2;
            }
            encodedQuery2 = encodedQuery;
        }
        return encodedPath3.encodedQuery(encodedQuery2).build();
    }

    public void b() {
        ((cf3) this.b).setSessionInfo((bf3) null);
        this.a = null;
    }

    public oid c() {
        String str;
        String str2;
        if (((oid) this.a) == null) {
            bf3 sessionInfo = ((cf3) this.b).getSessionInfo();
            oid d = oid.c.b(((cf3) this.b).getAppKey()).d(Uri.parse(((cf3) this.b).getBaseEndpoint()));
            if (!(sessionInfo == null || (str = sessionInfo.a) == null || (str2 = sessionInfo.b) == null)) {
                d = d.c(str, str2);
            }
            this.a = d;
        }
        return (oid) this.a;
    }

    public void d(oid oid) {
        this.a = oid;
        Uri a2 = ((oid) this.a).a();
        ((cf3) this.b).setSessionInfo(new bf3(((oid) this.a).a.d, ((oid) this.a).a.e, a2 == null ? null : a2.toString(), ((oid) this.a).a.c));
    }

    public Logger e() {
        Logger logger = (Logger) this.a;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = (Logger) this.a;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.b);
                this.a = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) ((defpackage.l47) r10.a).u(r1).getScheme(), (java.lang.Object) "https") == false) goto L_0x00d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.io.OutputStream r11, defpackage.hm r12, defpackage.yl r13, int r14) {
        /*
            r10 = this;
            mm r0 = r12.getScope()
            android.net.Uri r1 = r12.getUri()
            java.lang.String r1 = r1.getAuthority()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.lang.Object r3 = r10.b
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            r4 = 2
            int r3 = r3 + r4
            r2.<init>(r3)
            java.lang.Object r3 = r10.b
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0023:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0036
            java.lang.Object r5 = r3.next()
            xxe r5 = (defpackage.xxe) r5
            r5.getClass()
            r2.add(r5)
            goto L_0x0023
        L_0x0036:
            int r3 = r0.ordinal()
            r5 = 1
            r6 = 3
            r7 = 0
            if (r3 == r5) goto L_0x0045
            if (r3 == r4) goto L_0x0045
            if (r3 == r6) goto L_0x0045
            r3 = r7
            goto L_0x0049
        L_0x0045:
            java.lang.String r3 = r13.a
            if (r3 == 0) goto L_0x01ca
        L_0x0049:
            if (r3 == 0) goto L_0x0064
            xxe r8 = c
            if (r8 == 0) goto L_0x0058
            java.lang.String r9 = r8.b
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r3)
            if (r9 == 0) goto L_0x0058
            goto L_0x0061
        L_0x0058:
            xxe r8 = new xxe
            java.lang.String r9 = "application_key"
            r8.<init>(r9, r3)
            c = r8
        L_0x0061:
            r2.add(r8)
        L_0x0064:
            int r3 = r0.ordinal()
            if (r3 == r4) goto L_0x006e
            if (r3 == r6) goto L_0x006e
            r3 = r7
            goto L_0x0072
        L_0x006e:
            java.lang.String r3 = r13.d
            if (r3 == 0) goto L_0x01c2
        L_0x0072:
            int r8 = r0.ordinal()
            if (r8 == r4) goto L_0x007c
            if (r8 == r6) goto L_0x007c
            r6 = r7
            goto L_0x007e
        L_0x007c:
            java.lang.String r6 = r13.e
        L_0x007e:
            int[] r8 = defpackage.m47.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r8[r0]
            if (r0 != r5) goto L_0x0095
            java.lang.String r13 = r13.b
            if (r13 == 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            ru.ok.android.api.core.ApiScopeException r10 = new ru.ok.android.api.core.ApiScopeException
            java.lang.String r11 = "No user"
            r10.<init>(r11)
            throw r10
        L_0x0095:
            if (r3 == 0) goto L_0x00b0
            xxe r13 = o
            if (r13 == 0) goto L_0x00a4
            java.lang.String r0 = r13.b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            if (r0 == 0) goto L_0x00a4
            goto L_0x00ad
        L_0x00a4:
            xxe r13 = new xxe
            java.lang.String r0 = "session_key"
            r13.<init>(r0, r3)
            o = r13
        L_0x00ad:
            r2.add(r13)
        L_0x00b0:
            int r13 = defpackage.tr1.y(r14)
            if (r13 == 0) goto L_0x00d5
            if (r13 == r5) goto L_0x00d6
            if (r13 != r4) goto L_0x00cf
            java.lang.Object r10 = r10.a
            l47 r10 = (defpackage.l47) r10
            android.net.Uri r10 = r10.u(r1)
            java.lang.String r10 = r10.getScheme()
            java.lang.String r13 = "https"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r13)
            if (r10 != 0) goto L_0x00d6
            goto L_0x00d5
        L_0x00cf:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x00d5:
            r7 = r6
        L_0x00d6:
            if (r7 == 0) goto L_0x00e8
            int r10 = r2.size()
            if (r10 <= r5) goto L_0x00e8
            cx4 r10 = new cx4
            r13 = 28
            r10.<init>(r13)
            kotlin.collections.CollectionsKt.sortWith(r2, r10)
        L_0x00e8:
            f57 r10 = new f57
            r10.<init>(r11, r2, r7)
            ni0 r11 = r10.o
            int r13 = r11.b
            r14 = 0
            if (r13 != 0) goto L_0x00f6
            r13 = r5
            goto L_0x00f7
        L_0x00f6:
            r13 = r14
        L_0x00f7:
            java.lang.String r0 = "Nesting problem: "
            if (r13 == 0) goto L_0x01ac
            if (r7 == 0) goto L_0x00ff
            r13 = r5
            goto L_0x0100
        L_0x00ff:
            r13 = r14
        L_0x0100:
            r10.y = r13
            r1 = -1
            if (r13 == 0) goto L_0x0107
            r13 = r14
            goto L_0x0108
        L_0x0107:
            r13 = r1
        L_0x0108:
            r10.x = r13
            java.security.MessageDigest r13 = r10.v
            r13.reset()
            r11.G(r14)
            boolean r11 = r10.y
            if (r11 != 0) goto L_0x012a
            java.util.Iterator r11 = r2.iterator()
        L_0x011a:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x012a
            java.lang.Object r13 = r11.next()
            xxe r13 = (defpackage.xxe) r13
            r13.a(r10)
            goto L_0x011a
        L_0x012a:
            r12.writeParams(r10)     // Catch:{ JsonSerializeException -> 0x01a5 }
            ni0 r11 = r10.o
            int r12 = r11.b
            if (r12 != r5) goto L_0x018f
            int r12 = r10.x
            if (r12 < 0) goto L_0x014d
            r10.x = r1
        L_0x0139:
            java.util.List r13 = r10.b
            int r0 = r13.size()
            if (r12 >= r0) goto L_0x014d
            java.lang.Object r13 = r13.get(r12)
            xxe r13 = (defpackage.xxe) r13
            r13.a(r10)
            int r12 = r12 + 1
            goto L_0x0139
        L_0x014d:
            boolean r12 = r10.y
            if (r12 == 0) goto L_0x018b
            java.nio.charset.Charset r12 = kotlin.text.Charsets.UTF_8
            java.lang.String r13 = r10.c
            byte[] r12 = r13.getBytes(r12)
            java.security.MessageDigest r13 = r10.v
            r13.update(r12)
            byte[] r12 = r13.digest()
            java.lang.String r13 = "sig"
            r10.n(r13)
            r10.m()
            int r13 = r12.length
            r0 = r14
        L_0x016c:
            if (r0 >= r13) goto L_0x0189
            byte r1 = r12[r0]
            int r2 = r1 >> 4
            r2 = r2 & 15
            int r2 = defpackage.bs0.I(r2)
            java.io.OutputStream r3 = r10.a
            r3.write(r2)
            r1 = r1 & 15
            int r1 = defpackage.bs0.I(r1)
            r3.write(r1)
            int r0 = r0 + 1
            goto L_0x016c
        L_0x0189:
            r10.y = r14
        L_0x018b:
            r11.D()
            return
        L_0x018f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r0)
            java.lang.String r11 = defpackage.mz4.b(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            ru.ok.android.api.json.JsonStateException r11 = new ru.ok.android.api.json.JsonStateException
            r11.<init>(r10)
            throw r11
        L_0x01a5:
            r10 = move-exception
            ru.ok.android.api.core.ApiRequestException r11 = new ru.ok.android.api.core.ApiRequestException
            r11.<init>(r10)
            throw r11
        L_0x01ac:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r0)
            java.lang.String r11 = defpackage.mz4.b(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            ru.ok.android.api.json.JsonStateException r11 = new ru.ok.android.api.json.JsonStateException
            r11.<init>(r10)
            throw r11
        L_0x01c2:
            ru.ok.android.api.core.ApiScopeException r10 = new ru.ok.android.api.core.ApiScopeException
            java.lang.String r11 = "No session key"
            r10.<init>(r11)
            throw r10
        L_0x01ca:
            ru.ok.android.api.core.ApiScopeException r10 = new ru.ok.android.api.core.ApiScopeException
            java.lang.String r11 = "No app key"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm4.f(java.io.OutputStream, hm, yl, int):void");
    }

    public Object get() {
        Object obj = this.a;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == null) {
                        obj = ((u2f) this.b).get();
                        this.a = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }

    public gm4() {
        this.a = l47.B;
        this.b = new ArrayList();
    }

    public gm4(Class cls) {
        this.b = cls.getName();
    }
}
