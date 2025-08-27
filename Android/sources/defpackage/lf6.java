package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.MediaDrmCallbackException;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.uuid.Uuid;
import org.apache.http.protocol.HTTP;

/* renamed from: lf6  reason: default package */
public final class lf6 implements do0, cla {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object o;
    public Object v;

    public lf6(String str, boolean z, Function0 function0, Function0 function02) {
        this.a = 7;
        this.c = str;
        this.b = z;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = LazyKt.lazy(lazyThreadSafetyMode, function0);
        this.v = LazyKt.lazy(lazyThreadSafetyMode, function02);
    }

    public static void e(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f * f)));
        float f3 = fArr2[10] / sqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] h(defpackage.g74 r17, java.lang.String r18, byte[] r19, java.util.Map r20) {
        /*
            tne r1 = new tne
            j74 r0 = r17.a()
            r1.<init>(r0)
            java.util.Collections.emptyMap()
            android.net.Uri r3 = android.net.Uri.parse(r18)
            java.lang.String r0 = "The uri must be set."
            defpackage.n79.p(r3, r0)
            q74 r16 = new q74
            r14 = 1
            r15 = 0
            r4 = 0
            r6 = 2
            r9 = 0
            r11 = -1
            r13 = 0
            r2 = r16
            r7 = r19
            r8 = r20
            r2.<init>(r3, r4, r6, r7, r8, r9, r11, r13, r14, r15)
            r2 = 0
            r4 = r2
            r3 = r16
        L_0x002e:
            l74 r5 = new l74     // Catch:{ Exception -> 0x003b }
            r5.<init>((defpackage.j74) r1, (defpackage.q74) r3)     // Catch:{ Exception -> 0x003b }
            byte[] r0 = defpackage.uw0.b(r5)     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x0040 }
            defpackage.v0g.h(r5)     // Catch:{ Exception -> 0x003b }
            return r0
        L_0x003b:
            r0 = move-exception
            r10 = r0
            goto L_0x0086
        L_0x003e:
            r0 = move-exception
            goto L_0x0082
        L_0x0040:
            r0 = move-exception
            r6 = r0
            int r0 = r6.o     // Catch:{ all -> 0x003e }
            r7 = 307(0x133, float:4.3E-43)
            r8 = 0
            if (r0 == r7) goto L_0x004d
            r7 = 308(0x134, float:4.32E-43)
            if (r0 != r7) goto L_0x006b
        L_0x004d:
            r0 = 5
            if (r4 >= r0) goto L_0x006b
            java.util.Map r0 = r6.v     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x006b
            java.lang.String r7 = "Location"
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x003e }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x006b
            boolean r7 = r0.isEmpty()     // Catch:{ all -> 0x003e }
            if (r7 != 0) goto L_0x006b
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x003e }
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x003e }
        L_0x006b:
            if (r8 == 0) goto L_0x0081
            int r4 = r4 + 1
            o74 r0 = r3.a()     // Catch:{ all -> 0x003e }
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch:{ all -> 0x003e }
            r0.b = r3     // Catch:{ all -> 0x003e }
            q74 r3 = r0.b()     // Catch:{ all -> 0x003e }
            defpackage.v0g.h(r5)     // Catch:{ Exception -> 0x003b }
            goto L_0x002e
        L_0x0081:
            throw r6     // Catch:{ all -> 0x003e }
        L_0x0082:
            defpackage.v0g.h(r5)     // Catch:{ Exception -> 0x003b }
            throw r0     // Catch:{ Exception -> 0x003b }
        L_0x0086:
            androidx.media3.exoplayer.drm.MediaDrmCallbackException r0 = new androidx.media3.exoplayer.drm.MediaDrmCallbackException
            android.net.Uri r6 = r1.c
            r6.getClass()
            j74 r2 = r1.a
            java.util.Map r7 = r2.x()
            long r8 = r1.b
            r4 = r0
            r5 = r16
            r4.<init>(r5, r6, r7, r8, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf6.h(g74, java.lang.String, byte[], java.util.Map):byte[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        r0 = r6.toByteArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        defpackage.t0g.h(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        r7 = r5.read(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (r7 == -1) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        r6.write(r0, 0, r7);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] i(defpackage.n47 r17, java.lang.String r18, byte[] r19, java.util.Map r20) {
        /*
            sne r1 = new sne
            o47 r0 = r17.a()
            r1.<init>(r0)
            java.util.Collections.emptyMap()
            android.net.Uri r3 = android.net.Uri.parse(r18)
            if (r3 == 0) goto L_0x00ae
            p74 r16 = new p74
            r14 = 1
            r15 = 0
            r4 = 0
            r6 = 2
            r9 = 0
            r11 = -1
            r13 = 0
            r2 = r16
            r7 = r19
            r8 = r20
            r2.<init>(r3, r4, r6, r7, r8, r9, r11, r13, r14, r15)
            r2 = 0
            r4 = r2
            r3 = r16
        L_0x002b:
            l74 r5 = new l74     // Catch:{ Exception -> 0x004e }
            r5.<init>((defpackage.h74) r1, (defpackage.p74) r3)     // Catch:{ Exception -> 0x004e }
            int r0 = defpackage.t0g.a     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x0051 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x0051 }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x0051 }
            r6.<init>()     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x0051 }
        L_0x003b:
            int r7 = r5.read(r0)     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x0051 }
            r8 = -1
            if (r7 == r8) goto L_0x0046
            r6.write(r0, r2, r7)     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x0051 }
            goto L_0x003b
        L_0x0046:
            byte[] r0 = r6.toByteArray()     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x0051 }
            defpackage.t0g.h(r5)     // Catch:{ Exception -> 0x004e }
            return r0
        L_0x004e:
            r0 = move-exception
            r10 = r0
            goto L_0x0098
        L_0x0051:
            r0 = move-exception
            int r6 = r0.c     // Catch:{ all -> 0x0091 }
            r7 = 307(0x133, float:4.3E-43)
            r8 = 0
            if (r6 == r7) goto L_0x005d
            r7 = 308(0x134, float:4.32E-43)
            if (r6 != r7) goto L_0x007b
        L_0x005d:
            r6 = 5
            if (r4 >= r6) goto L_0x007b
            java.util.Map r6 = r0.o     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x007b
            java.lang.String r7 = "Location"
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0091 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x007b
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r7 != 0) goto L_0x007b
            java.lang.Object r6 = r6.get(r2)     // Catch:{ all -> 0x0091 }
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0091 }
        L_0x007b:
            if (r8 == 0) goto L_0x0093
            int r4 = r4 + 1
            o74 r0 = r3.a()     // Catch:{ all -> 0x0091 }
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch:{ all -> 0x0091 }
            r0.b = r3     // Catch:{ all -> 0x0091 }
            p74 r3 = r0.a()     // Catch:{ all -> 0x0091 }
            defpackage.t0g.h(r5)     // Catch:{ Exception -> 0x004e }
            goto L_0x002b
        L_0x0091:
            r0 = move-exception
            goto L_0x0094
        L_0x0093:
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0094:
            defpackage.t0g.h(r5)     // Catch:{ Exception -> 0x004e }
            throw r0     // Catch:{ Exception -> 0x004e }
        L_0x0098:
            com.google.android.exoplayer2.drm.MediaDrmCallbackException r0 = new com.google.android.exoplayer2.drm.MediaDrmCallbackException
            android.net.Uri r6 = r1.c
            r6.getClass()
            h74 r2 = r1.a
            java.util.Map r7 = r2.x()
            long r8 = r1.b
            r4 = r0
            r5 = r16
            r4.<init>(r5, r6, r7, r8, r10)
            throw r0
        L_0x00ae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The uri must be set."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf6.i(n47, java.lang.String, byte[], java.util.Map):byte[]");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.y33 A(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = r3.c     // Catch:{ all -> 0x0020 }
            eud r0 = (defpackage.eud) r0     // Catch:{ all -> 0x0020 }
            kf r1 = new kf     // Catch:{ all -> 0x0020 }
            java.lang.Object r2 = r0.b     // Catch:{ all -> 0x0020 }
            qx0 r2 = (defpackage.qx0) r2     // Catch:{ all -> 0x0020 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0020 }
            java.lang.Object r4 = r0.c     // Catch:{ all -> 0x0020 }
            t14 r4 = (defpackage.t14) r4     // Catch:{ all -> 0x0020 }
            ub8 r4 = (defpackage.ub8) r4     // Catch:{ all -> 0x0020 }
            y33 r4 = r4.get(r1)     // Catch:{ all -> 0x0020 }
            y33 r4 = defpackage.t9a.b(r4)     // Catch:{ all -> 0x0020 }
            monitor-exit(r3)
            return r4
        L_0x001e:
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            throw r4
        L_0x0020:
            r4 = move-exception
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf6.A(int):y33");
    }

    public boolean a(i30 i30, ea6 ea6) {
        boolean equals = "audio/eac3-joc".equals(ea6.n);
        int i = ea6.B;
        if (equals && i == 16) {
            i = 12;
        }
        int t = v0g.t(i);
        if (t == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t);
        int i2 = ea6.C;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return ((Spatializer) this.c).canBeSpatialized((AudioAttributes) i30.b().b, channelMask.build());
    }

    public void b() {
        if (this.b) {
            this.b = false;
            ((oka) this.o).a(this);
            return;
        }
        ((cla) this.c).b();
    }

    public void c(mq4 mq4) {
        mw1 mw1 = (mw1) this.v;
        mw1.getClass();
        qq4.d(mw1, mq4);
    }

    public synchronized void clear() {
        try {
            y33.U((jd4) this.v);
            this.v = null;
            int size = ((SparseArray) this.o).size();
            for (int i = 0; i < size; i++) {
                y33.U((y33) ((SparseArray) this.o).valueAt(i));
            }
            ((SparseArray) this.o).clear();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void d(Object obj) {
        if (this.b) {
            this.b = false;
        }
        ((cla) this.c).d(obj);
    }

    public byte[] f(UUID uuid, mb5 mb5) {
        UUID uuid2 = uuid;
        mb5 mb52 = mb5;
        String str = mb52.b;
        if (this.b || TextUtils.isEmpty(str)) {
            str = (String) this.o;
        }
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            UUID uuid3 = ww0.e;
            hashMap.put(HTTP.CONTENT_TYPE, uuid3.equals(uuid2) ? "text/xml" : ww0.c.equals(uuid2) ? "application/json" : "application/octet-stream");
            if (uuid3.equals(uuid2)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((HashMap) this.v)) {
                hashMap.putAll((HashMap) this.v);
            }
            return i((n47) this.c, str, mb52.a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            throw new MediaDrmCallbackException(new p74(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 0, (Object) null), uri, p0d.y, 0, new IllegalStateException("No license URL"));
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public byte[] g(UUID uuid, nb5 nb5) {
        UUID uuid2 = uuid;
        nb5 nb52 = nb5;
        String str = nb52.b;
        if (this.b || TextUtils.isEmpty(str)) {
            str = (String) this.o;
        }
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            UUID uuid3 = zw0.e;
            hashMap.put(HTTP.CONTENT_TYPE, uuid3.equals(uuid2) ? "text/xml" : zw0.c.equals(uuid2) ? "application/json" : "application/octet-stream");
            if (uuid3.equals(uuid2)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((HashMap) this.v)) {
                hashMap.putAll((HashMap) this.v);
            }
            return h((g74) this.c, str, nb52.a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        n79.p(uri, "The uri must be set.");
        throw new androidx.media3.exoplayer.drm.MediaDrmCallbackException(new q74(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 0, (Object) null), uri, p0d.y, 0, new IllegalStateException("No license URL"));
    }

    public byte[] j(ob5 ob5) {
        String n = t0g.n(ob5.a);
        String str = ob5.b;
        StringBuilder sb = new StringBuilder(n.length() + g63.f(15, str));
        sb.append(str);
        sb.append("&signedRequest=");
        sb.append(n);
        return i((n47) this.c, sb.toString(), (byte[]) null, Collections.emptyMap());
    }

    public byte[] k(pb5 pb5) {
        return h((g74) this.c, pb5.b + "&signedRequest=" + v0g.q(pb5.a), (byte[]) null, Collections.emptyMap());
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [ts1, java.lang.Object] */
    public synchronized void l() {
        try {
            if (!this.b) {
                Boolean r = r();
                this.o = r;
                if (r == null) {
                    ((r85) ((qye) this.c)).a(new Object());
                }
                this.b = true;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized boolean m() {
        boolean z;
        boolean z2;
        try {
            l();
            Boolean bool = (Boolean) this.o;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                hp5 hp5 = ((FirebaseMessaging) this.v).a;
                hp5.a();
                x64 x64 = (x64) hp5.g.get();
                synchronized (x64) {
                    z2 = x64.a;
                }
                z = z2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r2 = ((android.graphics.Rect) r2.f).height();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean n(defpackage.ff r3) {
        /*
            r2 = this;
            int r0 = r3.a
            if (r0 != 0) goto L_0x0026
            int r0 = r3.b
            if (r0 != 0) goto L_0x0026
            java.lang.Object r2 = r2.c
            ef r2 = (defpackage.ef) r2
            java.lang.Object r0 = r2.f
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r0 = r0.width()
            int r1 = r3.c
            if (r1 != r0) goto L_0x0026
            java.lang.Object r2 = r2.f
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            int r2 = r2.height()
            int r3 = r3.d
            if (r3 != r2) goto L_0x0026
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf6.n(ff):boolean");
    }

    public synchronized boolean o(int i) {
        boolean containsKey;
        eud eud = (eud) this.c;
        kf kfVar = new kf((qx0) eud.b, i);
        ub8 ub8 = (ub8) ((t14) eud.c);
        synchronized (ub8) {
            cs csVar = ub8.c;
            synchronized (csVar) {
                containsKey = ((LinkedHashMap) csVar.o).containsKey(kfVar);
            }
        }
        return containsKey;
    }

    public void onError(Throwable th) {
        ((cla) this.c).onError(th);
    }

    public boolean p(int i) {
        if (i == 0) {
            return true;
        }
        ff[] ffVarArr = (ff[]) ((ef) this.c).h;
        ff ffVar = ffVarArr[i];
        ff ffVar2 = ffVarArr[i - 1];
        ffVar.getClass();
        return ffVar2.e == 2 && n(ffVar2);
    }

    public synchronized y33 q() {
        return t9a.b(y33.o((jd4) this.v));
    }

    public Boolean r() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        hp5 hp5 = ((FirebaseMessaging) this.v).a;
        hp5.a();
        Context context = hp5.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), Uuid.SIZE_BITS)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0041=Splitter:B:16:0x0041, B:9:0x0038=Splitter:B:9:0x0038} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void s(int r4, defpackage.y33 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.t(r4)     // Catch:{ all -> 0x003d }
            bc7 r0 = defpackage.bc7.d     // Catch:{ all -> 0x003f }
            r1 = 0
            com.facebook.imagepipeline.image.CloseableStaticBitmap r5 = com.facebook.imagepipeline.image.CloseableStaticBitmap.of(r5, r0, r1)     // Catch:{ all -> 0x003f }
            jd4 r5 = defpackage.y33.p0(r5)     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0038
            java.lang.Object r0 = r3.v     // Catch:{ all -> 0x0036 }
            jd4 r0 = (defpackage.jd4) r0     // Catch:{ all -> 0x0036 }
            defpackage.y33.U(r0)     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r3.c     // Catch:{ all -> 0x0036 }
            eud r0 = (defpackage.eud) r0     // Catch:{ all -> 0x0036 }
            kf r1 = new kf     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = r0.b     // Catch:{ all -> 0x0036 }
            qx0 r2 = (defpackage.qx0) r2     // Catch:{ all -> 0x0036 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0036 }
            java.lang.Object r4 = r0.c     // Catch:{ all -> 0x0036 }
            t14 r4 = (defpackage.t14) r4     // Catch:{ all -> 0x0036 }
            ub8 r4 = (defpackage.ub8) r4     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.o     // Catch:{ all -> 0x0036 }
            xv1 r0 = (defpackage.xv1) r0     // Catch:{ all -> 0x0036 }
            jd4 r4 = r4.a(r1, r5, r0)     // Catch:{ all -> 0x0036 }
            r3.v = r4     // Catch:{ all -> 0x0036 }
            goto L_0x0038
        L_0x0036:
            r4 = move-exception
            goto L_0x0041
        L_0x0038:
            defpackage.y33.U(r5)     // Catch:{ all -> 0x003d }
            monitor-exit(r3)
            return
        L_0x003d:
            r4 = move-exception
            goto L_0x0045
        L_0x003f:
            r4 = move-exception
            r5 = 0
        L_0x0041:
            defpackage.y33.U(r5)     // Catch:{ all -> 0x003d }
            throw r4     // Catch:{ all -> 0x003d }
        L_0x0045:
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf6.s(int, y33):void");
    }

    public synchronized void t(int i) {
        y33 y33 = (y33) ((SparseArray) this.o).get(i);
        if (y33 != null) {
            ((SparseArray) this.o).delete(i);
            y33.U(y33);
            bg5.g(lf6.class, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), (SparseArray) this.o);
        }
    }

    public String toString() {
        switch (this.a) {
            case 7:
                dbe.w.getClass();
                StringBuilder sb = new StringBuilder("MessageText(text='");
                sb.append("***");
                sb.append("', bundled=");
                return tr1.m(sb, this.b, ")");
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0063=Splitter:B:20:0x0063, B:14:0x005c=Splitter:B:14:0x005c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void u(int r4, defpackage.y33 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            bc7 r0 = defpackage.bc7.d     // Catch:{ all -> 0x0061 }
            r1 = 0
            com.facebook.imagepipeline.image.CloseableStaticBitmap r5 = com.facebook.imagepipeline.image.CloseableStaticBitmap.of(r5, r0, r1)     // Catch:{ all -> 0x0061 }
            jd4 r5 = defpackage.y33.p0(r5)     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0015
            defpackage.y33.U(r5)     // Catch:{ all -> 0x0013 }
            monitor-exit(r3)
            return
        L_0x0013:
            r4 = move-exception
            goto L_0x0067
        L_0x0015:
            java.lang.Object r0 = r3.c     // Catch:{ all -> 0x005a }
            eud r0 = (defpackage.eud) r0     // Catch:{ all -> 0x005a }
            kf r1 = new kf     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r0.b     // Catch:{ all -> 0x005a }
            qx0 r2 = (defpackage.qx0) r2     // Catch:{ all -> 0x005a }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r0.c     // Catch:{ all -> 0x005a }
            t14 r2 = (defpackage.t14) r2     // Catch:{ all -> 0x005a }
            ub8 r2 = (defpackage.ub8) r2     // Catch:{ all -> 0x005a }
            java.lang.Object r0 = r0.o     // Catch:{ all -> 0x005a }
            xv1 r0 = (defpackage.xv1) r0     // Catch:{ all -> 0x005a }
            jd4 r0 = r2.a(r1, r5, r0)     // Catch:{ all -> 0x005a }
            boolean r1 = defpackage.y33.m0(r0)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r3.o     // Catch:{ all -> 0x005a }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x005a }
            y33 r1 = (defpackage.y33) r1     // Catch:{ all -> 0x005a }
            defpackage.y33.U(r1)     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r3.o     // Catch:{ all -> 0x005a }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x005a }
            r1.put(r4, r0)     // Catch:{ all -> 0x005a }
            java.lang.Class<lf6> r0 = defpackage.lf6.class
            java.lang.String r1 = "cachePreparedFrame(%d) cached. Pending frames: %s"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r3.o     // Catch:{ all -> 0x005a }
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ all -> 0x005a }
            defpackage.bg5.g(r0, r1, r4, r2)     // Catch:{ all -> 0x005a }
            goto L_0x005c
        L_0x005a:
            r4 = move-exception
            goto L_0x0063
        L_0x005c:
            defpackage.y33.U(r5)     // Catch:{ all -> 0x0013 }
            monitor-exit(r3)
            return
        L_0x0061:
            r4 = move-exception
            r5 = 0
        L_0x0063:
            defpackage.y33.U(r5)     // Catch:{ all -> 0x0013 }
            throw r4     // Catch:{ all -> 0x0013 }
        L_0x0067:
            monitor-exit(r3)     // Catch:{ all -> 0x0013 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf6.u(int, y33):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        r17 = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(android.graphics.Bitmap r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 0
            r4 = 1
            java.lang.Object r5 = r0.c
            ef r5 = (defpackage.ef) r5
            boolean r6 = r0.b
            if (r6 == 0) goto L_0x0044
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            java.lang.Object r1 = r5.e
            com.facebook.animated.gif.GifImage r1 = (com.facebook.animated.gif.GifImage) r1
            com.facebook.animated.gif.GifFrame r6 = r1.d(r2)
            ff r7 = r1.g(r2)
            if (r2 != 0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            int r2 = r2 - r4
            ff r3 = r1.g(r2)
        L_0x0029:
            int r1 = r6.d()     // Catch:{ all -> 0x003a }
            if (r1 <= 0) goto L_0x003c
            int r1 = r6.c()     // Catch:{ all -> 0x003a }
            if (r1 > 0) goto L_0x0036
            goto L_0x003c
        L_0x0036:
            r5.h(r0, r6, r7, r3)     // Catch:{ all -> 0x003a }
            goto L_0x003c
        L_0x003a:
            r0 = move-exception
            goto L_0x0040
        L_0x003c:
            r6.a()
            return
        L_0x0040:
            r6.a()
            throw r0
        L_0x0044:
            android.graphics.Canvas r13 = new android.graphics.Canvas
            r13.<init>(r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC
            r7 = 0
            r13.drawColor(r7, r1)
            boolean r1 = r0.p(r2)
            java.lang.Object r8 = r0.v
            r14 = r8
            android.graphics.Paint r14 = (android.graphics.Paint) r14
            r15 = 2
            r12 = 3
            java.lang.Object r8 = r0.o
            r11 = r8
            u6h r11 = (defpackage.u6h) r11
            if (r1 != 0) goto L_0x00eb
            int r1 = r2 + -1
        L_0x0063:
            if (r1 < 0) goto L_0x008e
            java.lang.Cloneable r8 = r5.h
            ff[] r8 = (defpackage.ff[]) r8
            r8 = r8[r1]
            int r9 = r8.e
            if (r9 != r4) goto L_0x0071
        L_0x006f:
            r8 = r4
            goto L_0x0080
        L_0x0071:
            if (r9 != r15) goto L_0x007b
            boolean r8 = r0.n(r8)
            if (r8 == 0) goto L_0x006f
            r8 = r15
            goto L_0x0080
        L_0x007b:
            if (r9 != r12) goto L_0x007f
            r8 = r12
            goto L_0x0080
        L_0x007f:
            r8 = 4
        L_0x0080:
            int r8 = defpackage.tr1.y(r8)
            if (r8 == 0) goto L_0x0095
            if (r8 == r4) goto L_0x0092
            if (r8 == r12) goto L_0x008d
            r17 = r11
            goto L_0x00e5
        L_0x008d:
            r7 = r1
        L_0x008e:
            r17 = r11
            goto L_0x00ee
        L_0x0092:
            int r7 = r1 + 1
            goto L_0x008e
        L_0x0095:
            java.lang.Cloneable r8 = r5.h
            ff[] r8 = (defpackage.ff[]) r8
            r8 = r8[r1]
            y33 r16 = r11.i(r1)
            if (r16 == 0) goto L_0x00db
            java.lang.Object r0 = r16.e0()     // Catch:{ all -> 0x00d4 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x00d4 }
            r4 = 0
            r13.drawBitmap(r0, r4, r4, r3)     // Catch:{ all -> 0x00d4 }
            int r0 = r8.e     // Catch:{ all -> 0x00d4 }
            if (r0 != r15) goto L_0x00c8
            int r0 = r8.a     // Catch:{ all -> 0x00d4 }
            float r3 = (float) r0     // Catch:{ all -> 0x00d4 }
            int r4 = r8.b     // Catch:{ all -> 0x00d4 }
            float r9 = (float) r4     // Catch:{ all -> 0x00d4 }
            int r7 = r8.c     // Catch:{ all -> 0x00d4 }
            int r0 = r0 + r7
            float r10 = (float) r0     // Catch:{ all -> 0x00d4 }
            int r0 = r8.d     // Catch:{ all -> 0x00d4 }
            int r4 = r4 + r0
            float r0 = (float) r4     // Catch:{ all -> 0x00d4 }
            r7 = r13
            r8 = r3
            r17 = r11
            r11 = r0
            r0 = r12
            r12 = r14
            r7.drawRect(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00d4 }
            goto L_0x00cb
        L_0x00c8:
            r17 = r11
            r0 = r12
        L_0x00cb:
            int r7 = r1 + 1
            if (r6 != 0) goto L_0x00d2
            r16.close()
        L_0x00d2:
            r12 = r0
            goto L_0x00ee
        L_0x00d4:
            r0 = move-exception
            if (r6 != 0) goto L_0x00da
            r16.close()
        L_0x00da:
            throw r0
        L_0x00db:
            r17 = r11
            boolean r8 = r0.p(r1)
            if (r8 == 0) goto L_0x00e5
            r7 = r1
            goto L_0x00ee
        L_0x00e5:
            int r1 = r1 + -1
            r11 = r17
            goto L_0x0063
        L_0x00eb:
            r17 = r11
            r7 = r2
        L_0x00ee:
            r0 = r7
        L_0x00ef:
            if (r0 >= r2) goto L_0x011d
            java.lang.Cloneable r1 = r5.h
            ff[] r1 = (defpackage.ff[]) r1
            r1 = r1[r0]
            int r3 = r1.e
            if (r3 != r12) goto L_0x00fd
        L_0x00fb:
            r1 = r12
            goto L_0x0119
        L_0x00fd:
            r5.f(r13, r0)
            r17.getClass()
            if (r3 != r15) goto L_0x00fb
            int r3 = r1.a
            float r8 = (float) r3
            int r4 = r1.b
            float r9 = (float) r4
            int r6 = r1.c
            int r3 = r3 + r6
            float r10 = (float) r3
            int r1 = r1.d
            int r4 = r4 + r1
            float r11 = (float) r4
            r7 = r13
            r1 = r12
            r12 = r14
            r7.drawRect(r8, r9, r10, r11, r12)
        L_0x0119:
            int r0 = r0 + 1
            r12 = r1
            goto L_0x00ef
        L_0x011d:
            java.lang.Cloneable r0 = r5.h
            ff[] r0 = (defpackage.ff[]) r0
            r0 = r0[r2]
            r0.getClass()
            r5.f(r13, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf6.v(android.graphics.Bitmap, int):void");
    }

    public synchronized y33 y() {
        if (!this.b) {
            return null;
        }
        return t9a.b(((eud) this.c).i());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf6(String str, boolean z) {
        this(str, z, new c28(7, str), new c28(7, str));
        this.a = 7;
    }

    public lf6(eud eud, boolean z) {
        this.a = 0;
        this.c = eud;
        this.b = z;
        this.o = new SparseArray();
    }

    public lf6(int i) {
        this.a = i;
        switch (i) {
            case 9:
                return;
            default:
                this.c = new float[16];
                this.o = new float[16];
                this.v = new akf(0);
                return;
        }
    }

    public lf6(cla cla) {
        this.a = 8;
        jja jja = jja.a;
        this.c = cla;
        this.o = jja;
        this.b = true;
        this.v = new mw1(2);
    }

    public lf6(String str, boolean z, wf4 wf4) {
        this.a = 5;
        y64.g(!z || !TextUtils.isEmpty(str));
        this.c = wf4;
        this.o = str;
        this.b = z;
        this.v = new HashMap();
    }

    public lf6(ef efVar, boolean z, u6h u6h) {
        this.a = 1;
        this.c = efVar;
        this.o = u6h;
        this.b = z;
        Paint paint = new Paint();
        this.v = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public lf6(String str, boolean z, xf4 xf4) {
        this.a = 6;
        n79.g(!z || !TextUtils.isEmpty(str));
        this.c = xf4;
        this.o = str;
        this.b = z;
        this.v = new HashMap();
    }

    public lf6(FirebaseMessaging firebaseMessaging, qye qye) {
        this.a = 3;
        this.v = firebaseMessaging;
        this.c = qye;
    }

    public lf6(Spatializer spatializer) {
        this.a = 2;
        this.c = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
    }
}
