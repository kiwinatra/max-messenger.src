package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.security.keystore.KeyGenParameterSpec;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncodeException;
import com.facebook.common.file.FileUtils$ParentDirNotFoundException;
import com.facebook.common.file.FileUtils$RenameException;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* renamed from: w28  reason: default package */
public final class w28 implements x28, f43, qk3, ReadWriteProperty, eo1, r55, pgd, in8, ima {
    public static final p01 v = new p01(-9223372036854775807L, 0, 4, false);
    public static final p01 w = new p01(-9223372036854775807L, 2, 4, false);
    public static final p01 x = new p01(-9223372036854775807L, 3, 4, false);
    public static volatile w28 y;
    public static final Object z = new Object();
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object o;

    public /* synthetic */ w28(int i, Object obj, Object obj2, Object obj3, boolean z2) {
        this.a = i;
        this.o = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static p01 C(long j, boolean z2) {
        return new p01(j, z2 ? 1 : 0, 4, false);
    }

    public static w28 J(Context context) {
        if (y == null) {
            synchronized (z) {
                try {
                    if (y == null) {
                        y = new w28(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return y;
    }

    public void A() {
        r28 r28 = (r28) this.c;
        y64.k(r28);
        r28.a(false);
    }

    public ml5 B() {
        be4 be4 = (be4) this.o;
        be4.e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        File h = be4.h((String) this.b);
        try {
            kne.H((File) this.c, h);
            if (h.exists()) {
                h.setLastModified(currentTimeMillis);
            }
            return new ml5(h);
        } catch (FileUtils$RenameException e) {
            Throwable cause = e.getCause();
            if (cause != null && !(cause instanceof FileUtils$ParentDirNotFoundException)) {
                boolean z2 = cause instanceof FileNotFoundException;
            }
            int i = be4.g;
            be4.d.getClass();
            throw e;
        }
    }

    public void D(Bundle bundle) {
        HashSet hashSet;
        String string = ((Context) this.o).getString(smc.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = (HashSet) this.c;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (xf7.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    E((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Object E(Class cls, HashSet hashSet) {
        Object obj;
        if (hof.a()) {
            try {
                Trace.beginSection(ld9.T(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = (HashMap) this.b;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                xf7 xf7 = (xf7) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> a2 = xf7.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            E(cls2, hashSet);
                        }
                    }
                }
                obj = xf7.b((Context) this.o);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }

    public l20 F(int i) {
        if (i < 0) {
            return null;
        }
        List list = (List) this.b;
        if (i >= list.size()) {
            return null;
        }
        return (l20) list.get(i);
    }

    public int G() {
        List list = (List) this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public l20 H(String str) {
        for (l20 l20 : (List) this.b) {
            if (cvg.c(str, l20.q)) {
                return l20;
            }
        }
        return null;
    }

    public l20 I(g20 g20) {
        for (l20 l20 : (List) this.b) {
            if (l20.a == g20) {
                return l20;
            }
        }
        return null;
    }

    public v3d K(int i, int i2, boolean z2) {
        int i3;
        int intValue = ((Number) ((Lazy) this.c).getValue()).intValue();
        int intValue2 = ((Number) ((Lazy) this.b).getValue()).intValue();
        if (!z2) {
            intValue = intValue2;
        }
        if (i2 * i < intValue * intValue) {
            return null;
        }
        if (i2 <= intValue && i <= intValue) {
            return null;
        }
        if (i2 > i) {
            int i4 = intValue;
            intValue = (int) ((((float) i) / ((float) i2)) * ((float) intValue));
            i3 = i4;
        } else {
            i3 = (int) ((((float) i2) / ((float) i)) * ((float) intValue));
        }
        return new v3d(c44.DEFAULT_ASPECT_RATIO, intValue, i3, 12);
    }

    public boolean L() {
        return ((IOException) this.o) != null;
    }

    public boolean M() {
        return ((r28) this.c) != null;
    }

    public void N(hu7 hu7) {
        vr1 vr1 = (vr1) this.o;
        if (vr1 != null) {
            vr1.run();
        }
        vr1 vr12 = new vr1((lv7) this.b, hu7);
        this.o = vr12;
        ((Handler) this.c).postAtFrontOfQueue(vr12);
    }

    public void O(u28 u28) {
        r28 r28 = (r28) this.c;
        if (r28 != null) {
            r28.a(true);
        }
        ExecutorService executorService = (ExecutorService) this.b;
        if (u28 != null) {
            executorService.execute(new tj7(6, u28));
        }
        executorService.shutdown();
    }

    public long P(s28 s28, p28 p28, int i) {
        Looper myLooper = Looper.myLooper();
        y64.k(myLooper);
        this.o = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r28 r28 = new r28(this, myLooper, s28, p28, i, elapsedRealtime, 0);
        y64.j(((r28) this.c) == null);
        this.c = r28;
        r28.o = null;
        ((ExecutorService) this.b).execute(r28);
        return elapsedRealtime;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, m20] */
    public m20 Q() {
        ? obj = new Object();
        obj.a = new ArrayList((List) this.b);
        obj.b = (zf7) this.c;
        return obj;
    }

    public ArrayList R(Context context, List list, Set set) {
        CharSequence charSequence;
        Context context2 = context;
        Iterable<vk3> iterable = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (vk3 vk3 : iterable) {
            Boolean valueOf = Boolean.valueOf(set.contains(Long.valueOf(vk3.r())));
            int i = ((ptb) ((Function0) this.c).invoke()).b(vk3.r()).a;
            boolean z2 = i == 10 || i == 20 || i == 40;
            String t = vk3.t(kl0.b);
            if (vk3.y()) {
                charSequence = null;
            } else {
                charSequence = vk3.w ? context2.getString(jad.I) : (!vk3.x() || !vk3.A()) ? vk3.x() ? context2.getString(qad.J) : ((rtb) ((Function0) this.o).invoke()).d(vk3, true) : context2.getString(qad.T8);
            }
            long r = vk3.r();
            String f = vk3.f();
            if (f != null) {
                arrayList.add(new zo3(r, (CharSequence) f, hhf.b(vk3.j()), CollectionsKt.listOf(Long.valueOf(vk3.s())), charSequence, (CharSequence) null, t != null ? Uri.parse(t) : null, z2, vk3.z(), vk3.q(), false, (qdb) null, valueOf, 0, vk3.x(), 27648));
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.io.OutputStream, u14, java.io.FilterOutputStream] */
    public void S(ba baVar) {
        File file = (File) this.c;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ? filterOutputStream = new FilterOutputStream(fileOutputStream);
                filterOutputStream.a = 0;
                InputStream n = ((j55) baVar.b).n();
                if (n != null) {
                    ((vu0) baVar.c).c.l(n, filterOutputStream);
                    filterOutputStream.flush();
                    long j = filterOutputStream.a;
                    fileOutputStream.close();
                    if (file.length() != j) {
                        long length = file.length();
                        StringBuilder n2 = tr1.n(j, "File was not written completely. Expected: ", ", found: ");
                        n2.append(length);
                        throw new IOException(n2.toString());
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            o9a o9a = ((be4) this.o).d;
            int i = be4.g;
            o9a.getClass();
            throw e;
        }
    }

    public void a(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    public void accept(Object obj) {
        z68.f(ur4.i, "MsgGetCmd failed", (Throwable) obj);
        ((ur4) this.b).c((a32) this.c, (qtd) this.o);
    }

    public void b() {
        IOException iOException;
        IOException iOException2 = (IOException) this.o;
        if (iOException2 == null) {
            r28 r28 = (r28) this.c;
            if (r28 != null && (iOException = r28.o) != null && r28.v > r28.b) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public void c(int i, long j) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, j);
    }

    public void d(EncodeException encodeException) {
        ((do1) this.b).d(encodeException);
    }

    public int e() {
        return ((MediaCodec) this.b).dequeueInputBuffer(0);
    }

    public void f() {
        jgd jgd = (jgd) ((Function0) this.b).invoke();
        if (jgd != null) {
            ((z5a) ((Lazy) this.o).getValue()).f(jgd, (h8b) ((Function0) this.c).invoke());
        }
    }

    public void flush() {
        ((MediaCodec) this.b).flush();
    }

    public int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.b;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && v0g.a < 21) {
                this.o = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public ByteBuffer getInputBuffer(int i) {
        return v0g.a >= 21 ? ((MediaCodec) this.b).getInputBuffer(i) : ((ByteBuffer[]) this.c)[i];
    }

    public ByteBuffer getOutputBuffer(int i) {
        return v0g.a >= 21 ? ((MediaCodec) this.b).getOutputBuffer(i) : ((ByteBuffer[]) this.o)[i];
    }

    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.b).getOutputFormat();
    }

    public Object getValue(Object obj, KProperty kProperty) {
        Object obj2 = this.c;
        if (obj2 != null) {
            return obj2;
        }
        try {
            Object invoke = ((Function0) this.b).invoke();
            this.c = invoke;
            ((qf5) this.o).b.add(new pf5(invoke, new u75(1, this)));
            return invoke;
        } catch (Throwable th) {
            throw new RuntimeException(a81.m("could not extract value for name ", kProperty.getName()), th);
        }
    }

    public void h(int i) {
        ((MediaCodec) this.b).setVideoScalingMode(i);
    }

    public void i(int i, h44 h44, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) h44.i, j, i2);
    }

    public void j(Surface surface) {
        ((MediaCodec) this.b).setOutputSurface(surface);
    }

    public boolean l() {
        return ((f43) this.b).l();
    }

    public md4 m(ea6 ea6) {
        md4 m = ((f43) this.b).m(ea6);
        this.c = m.b();
        return m;
    }

    public void n() {
        ((do1) this.b).b((Object) null);
    }

    public void o(g55 g55) {
        lyc lyc = (lyc) this.o;
        MediaMuxer mediaMuxer = lyc.C;
        zb0 zb0 = (zb0) this.c;
        if (mediaMuxer != null) {
            try {
                lyc.K(g55, zb0);
                g55.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else if (!lyc.r) {
            g55 g552 = lyc.U;
            if (g552 != null) {
                g552.close();
                lyc.U = null;
            }
            if (g55.J()) {
                lyc.U = g55;
                if (!lyc.n() || !lyc.V.f()) {
                    lyc.C(zb0);
                    return;
                }
                return;
            }
            g65 g65 = (g65) lyc.F;
            g65.h.execute(new u55(g65, 3));
            g55.close();
            return;
        } else {
            g55.close();
            return;
        }
        throw th;
    }

    public boolean p() {
        return ((f43) this.b).p();
    }

    public void q(Task task) {
        m9d m9d = (m9d) this.b;
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.o;
        synchronized (m9d.a) {
            m9d.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public Object r(do1 do1) {
        do1.a(new cf(28, this), ryg.j());
        ((dw6) this.o).a.set(do1);
        return "HandlerScheduledFuture-" + ((Callable) this.c).toString();
    }

    public void release() {
        MediaCodec mediaCodec = (MediaCodec) this.b;
        this.c = null;
        this.o = null;
        try {
            int i = v0g.a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    public void releaseOutputBuffer(int i, boolean z2) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, z2);
    }

    public void s(rt3 rt3) {
        ((lyc) this.o).G = rt3;
    }

    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    public void setValue(Object obj, KProperty kProperty, Object obj2) {
        if (obj2 == null) {
            this.c = null;
        }
    }

    public void t(ho8 ho8, Handler handler) {
        ((MediaCodec) this.b).setOnFrameRenderedListener(new dy(this, ho8, 3), handler);
    }

    public String toString() {
        switch (this.a) {
            case 12:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                o5h o5h = (o5h) ((o5h) this.c).c;
                String str = "";
                while (o5h != null) {
                    Object obj = o5h.b;
                    sb.append(str);
                    String str2 = (String) o5h.a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    o5h = (o5h) o5h.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public md4 u(ea6 ea6) {
        md4 u = ((f43) this.b).u(ea6);
        this.o = u.b();
        return u;
    }

    public void v(int i, String str) {
        x(String.valueOf(i), str);
    }

    public void w(String str, boolean z2) {
        x(String.valueOf(z2), str);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o5h, java.lang.Object] */
    public void x(Object obj, String str) {
        ? obj2 = new Object();
        ((o5h) this.o).c = obj2;
        this.o = obj2;
        obj2.b = obj;
        obj2.a = str;
    }

    public int y(int i) {
        b8d b8d;
        Cipher cipher;
        int i2 = Build.VERSION.SDK_INT;
        BiometricManager biometricManager = (BiometricManager) this.c;
        int i3 = 1;
        if (i2 >= 30) {
            if (biometricManager == null) {
                return 1;
            }
            return un0.a(biometricManager, i);
        } else if (!o5a.N(i)) {
            return -2;
        } else {
            if (i != 0) {
                u6h u6h = (u6h) this.b;
                if (ir7.a((Context) u6h.b) != null) {
                    if (i2 != 29) {
                        return z();
                    }
                    if ((i & KotlinVersion.MAX_COMPONENT_VALUE) != 255) {
                        Method c2 = tn0.c();
                        if (c2 != null) {
                            BiometricPrompt.CryptoObject cryptoObject = null;
                            try {
                                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                                instance.load((KeyStore.LoadStoreParameter) null);
                                KeyGenParameterSpec.Builder b2 = i44.b("androidxBiometric", 3);
                                i44.d(b2);
                                i44.e(b2);
                                KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                i44.c(instance2, i44.a(b2));
                                instance2.generateKey();
                                Cipher instance3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
                                instance3.init(1, (SecretKey) instance.getKey("androidxBiometric", (char[]) null));
                                b8d = new b8d((Object) instance3);
                            } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException unused) {
                                b8d = null;
                            }
                            if (!(b8d == null || (cipher = (Cipher) b8d.a) == null)) {
                                cryptoObject = j44.a(cipher);
                            }
                            if (cryptoObject != null) {
                                try {
                                    Object invoke = c2.invoke(biometricManager, new Object[]{cryptoObject});
                                    if (invoke instanceof Integer) {
                                        return ((Integer) invoke).intValue();
                                    }
                                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                                }
                            }
                        }
                        if (biometricManager != null) {
                            i3 = tn0.a(biometricManager);
                        }
                        String str = Build.MODEL;
                        int i4 = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            int i5 = xcc.assume_strong_biometrics_models;
                            if (str != null) {
                                String[] stringArray = ((Context) u6h.b).getResources().getStringArray(i5);
                                int length = stringArray.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length) {
                                        break;
                                    } else if (str.equals(stringArray[i6])) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                        }
                        if (i3 == 0) {
                            KeyguardManager a2 = ir7.a((Context) u6h.b);
                            if (!(a2 == null ? false : ir7.b(a2))) {
                                return z();
                            }
                            if (z() != 0) {
                                i4 = -1;
                            }
                            return i4;
                        }
                    } else if (biometricManager != null) {
                        i3 = tn0.a(biometricManager);
                    }
                    return i3;
                }
            }
            return 12;
        }
    }

    public int z() {
        t54 t54 = (t54) this.o;
        if (t54 == null) {
            return 1;
        }
        FingerprintManager c2 = zo5.c(t54.a);
        if (c2 == null || !zo5.e(c2)) {
            return 12;
        }
        FingerprintManager c3 = zo5.c(t54.a);
        return (c3 == null || !zo5.d(c3)) ? 11 : 0;
    }

    public /* synthetic */ w28(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public w28(voc voc, yoc yoc) {
        this.a = 4;
        this.b = voc;
        this.c = yoc;
        this.o = new Object();
    }

    public w28(Context context, Lazy lazy) {
        this.a = 13;
        this.b = LazyKt.lazy(new ae(lazy, context, 1));
        this.c = LazyKt.lazy(new ae(lazy, context, 2));
        this.o = LazyKt.lazy(new ifb(0, this));
    }

    public w28(Function0 function0, Function0 function02, int i) {
        this.a = 16;
        function02 = (i & 2) != 0 ? new dle(4) : function02;
        Lazy h = lne.a.getAccessor().h(z5a.class);
        this.b = function0;
        this.c = function02;
        this.o = h;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public w28(jgd jgd) {
        this(new lce(4, jgd), (Function0) null, 6);
        this.a = 16;
    }

    public w28(jv7 jv7) {
        this.a = 15;
        this.b = new lv7(jv7);
        this.c = new Handler();
    }

    public w28(m20 m20) {
        this.a = 2;
        this.b = m20.a;
        this.c = m20.b;
        this.o = m20.c;
    }

    public w28(f43 f43) {
        this.a = 5;
        this.b = f43;
    }

    public w28(qf5 qf5, Function0 function0) {
        this.a = 9;
        this.o = qf5;
        this.b = function0;
    }

    public w28(Context context) {
        this.a = 1;
        this.o = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public w28(int i, String str, ArrayList arrayList, byte[] bArr) {
        List list;
        this.a = 18;
        this.b = str;
        if (arrayList == null) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(arrayList);
        }
        this.c = list;
        this.o = bArr;
    }

    public w28(MediaCodec mediaCodec) {
        this.a = 17;
        this.b = mediaCodec;
        if (v0g.a < 21) {
            this.c = mediaCodec.getInputBuffers();
            this.o = mediaCodec.getOutputBuffers();
        }
    }

    public w28(String str, int i) {
        this.a = i;
        switch (i) {
            case 12:
                Object obj = new Object();
                this.c = obj;
                this.o = obj;
                this.b = str;
                return;
            default:
                String concat = str.length() != 0 ? "ExoPlayer:Loader:".concat(str) : new String("ExoPlayer:Loader:");
                int i2 = t0g.a;
                this.b = Executors.newSingleThreadExecutor(new td3(1, concat));
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [t54, java.lang.Object] */
    public w28(u6h u6h) {
        Object obj;
        this.a = 3;
        this.b = u6h;
        int i = Build.VERSION.SDK_INT;
        Context context = (Context) u6h.b;
        this.c = tn0.b(context);
        if (i <= 29) {
            ? obj2 = new Object();
            obj2.a = context;
            obj = obj2;
        } else {
            obj = null;
        }
        this.o = obj;
    }

    public w28(tp8 tp8) {
        this.a = 11;
        this.o = tp8;
        this.b = new im8(this);
    }
}
