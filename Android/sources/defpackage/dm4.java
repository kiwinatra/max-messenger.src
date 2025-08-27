package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.camera.core.ProcessingException;
import androidx.fragment.app.a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import one.me.rlottie.network.LottieCacheDirProvider;
import org.webrtc.EncodedImage;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFallback;
import ru.ok.tamtam.nano.Protos;

/* renamed from: dm4  reason: default package */
public final class dm4 implements nj6, ya3, qn5, LottieCacheDirProvider, ReadWriteProperty, is7, Provider, VideoDecoder, gce {
    public static final dm4 o = new dm4(1);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ dm4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void p(Throwable th) {
    }

    public void a(Object obj) {
        switch (this.a) {
            case 6:
                Void voidR = (Void) obj;
                ((xr1) this.c).v0.remove((jx1) this.b);
                int y = tr1.y(((xr1) this.c).Q0);
                if (!(y == 1 || y == 4)) {
                    if (y == 5 || (y == 6 && ((xr1) this.c).Y != 0)) {
                        ((xr1) this.c).toString();
                    } else {
                        return;
                    }
                }
                if (((xr1) this.c).v0.isEmpty()) {
                    xr1 xr1 = (xr1) this.c;
                    if (xr1.X != null) {
                        xr1.toString();
                        ((xr1) this.c).X.close();
                        ((xr1) this.c).X = null;
                        return;
                    }
                    return;
                }
                return;
            case 7:
                Void voidR2 = (Void) obj;
                return;
            case 25:
                gce gce = (gce) this.b;
                try {
                    ((tbe) this.c).c.accept(obj);
                    gce.a(obj);
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    gce.onError(th);
                    return;
                }
            default:
                s3f s3f = (s3f) obj;
                s3f.getClass();
                try {
                    ((t3f) ((g6d) this.c).b).c(s3f);
                    return;
                } catch (ProcessingException unused) {
                    return;
                }
        }
    }

    public void b() {
        ((ya3) this.c).b();
    }

    public void c(mq4 mq4) {
        switch (this.a) {
            case 8:
                qq4.c((AtomicReference) this.b, mq4);
                return;
            default:
                ((gce) this.b).c(mq4);
                return;
        }
    }

    public long createNative(long j) {
        return ((VideoDecoder) this.b).createNative(j);
    }

    public void d(File file) {
        zd4 g = be4.g((be4) this.c, file);
        if (g != null && g.b == ".cnt") {
            ((ArrayList) this.b).add(new yd4(file, g.c));
        }
    }

    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, long j) {
        return ((VideoDecoder) this.b).decode(encodedImage, decodeInfo, j);
    }

    public synchronized void e(r38 r38) {
        ((Executor) this.b).execute(r38);
    }

    public void f() {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            return;
        }
        Animation animation = (Animation) this.c;
        if (animation != null) {
            animation.cancel();
        }
    }

    public void g(Throwable th) {
        switch (this.a) {
            case 6:
                return;
            case 7:
                ev0.g();
                pk4 pk4 = (pk4) this.c;
                qvb qvb = (qvb) pk4.a;
                if (((qvb) this.b) == qvb) {
                    int i = qvb.a;
                    npg npg = (npg) pk4.e;
                    if (npg != null) {
                        npg.c = null;
                    }
                    pk4.a = null;
                    return;
                }
                return;
            default:
                int i2 = ((q3f) this.b).f;
                if (i2 != 2 || !(th instanceof CancellationException)) {
                    f6e.q(i2);
                    return;
                }
                return;
        }
    }

    public Object get() {
        switch (this.a) {
            case 16:
                Object obj = this.c;
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((u2f) this.b).get();
                this.c = obj2;
                return obj2;
            default:
                return new tp9((Context) ((Provider) this.b).get(), (v34) ((Provider) this.c).get());
        }
    }

    public File getCacheDir() {
        return (File) ((Lazy) this.c).getValue();
    }

    public String getImplementationName() {
        VideoDecoder videoDecoder = (VideoDecoder) this.b;
        return videoDecoder instanceof VideoDecoderFallback ? "VideoDecoderFallback" : videoDecoder.getImplementationName();
    }

    public Object getValue(Object obj, KProperty kProperty) {
        Object b2 = ((hdd) this.b).b("chat-mode");
        return b2 == null ? this.c : b2;
    }

    public void h(Object obj, String str) {
        obj.getClass();
        ((HashMap) this.b).put(str, obj);
        ((ArrayList) this.c).remove(str);
    }

    public void i(File file) {
    }

    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        ((voc) this.c).log("VideoDecoderLifecycleLogger", "initDecode(cores=" + settings.numberOfCores + ", size=" + settings.width + "x" + settings.height + ")");
        return ((VideoDecoder) this.b).initDecode(settings, callback);
    }

    public void j(File file) {
    }

    public boolean k(int i) {
        return ((xq5) this.b).a.get(i);
    }

    public byte[] l(b95 b95) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        try {
            dataOutputStream.writeBytes(b95.a);
            dataOutputStream.writeByte(0);
            String str = b95.b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(b95.c);
            dataOutputStream.writeLong(b95.o);
            dataOutputStream.write(b95.v);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList m(String str) {
        d7d a2 = d7d.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            a2.X(1);
        } else {
            a2.h(1, str);
        }
        i6d i6d = (i6d) this.b;
        i6d.b();
        Cursor o2 = i6d.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o2.getCount());
            while (o2.moveToNext()) {
                arrayList.add(o2.isNull(0) ? null : o2.getString(0));
            }
            return arrayList;
        } finally {
            o2.close();
            a2.o();
        }
    }

    public synchronized Map n() {
        try {
            if (((Map) this.c) == null) {
                this.c = Collections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (Map) this.c;
    }

    public boolean o(String str) {
        boolean z = true;
        d7d a2 = d7d.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            a2.X(1);
        } else {
            a2.h(1, str);
        }
        i6d i6d = (i6d) this.b;
        i6d.b();
        Cursor o2 = i6d.o(a2, (CancellationSignal) null);
        try {
            boolean z2 = false;
            if (o2.moveToFirst()) {
                if (o2.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            o2.close();
            a2.o();
        }
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 8:
                ((ya3) this.c).onError(th);
                return;
            default:
                ((gce) this.b).onError(th);
                return;
        }
    }

    public void q(int i, String[] strArr, int[] iArr) {
        if (i == 171) {
            if (n54.X((a) this.b, strArr, iArr, n54.f, qad.w6, qad.u6)) {
                b4a b4a = (b4a) this.c;
                if (b4a != null) {
                    b4a.k0(false);
                    b4a.W0.s(b4a.E0, false);
                    return;
                }
                z68.n("dm4", (IOException) null, "Listener is null", Arrays.copyOf(new Object[0], 0));
            }
        } else if (i == 170) {
            if (n54.X((a) this.b, strArr, iArr, n54.e, qad.P6, qad.N6)) {
                b4a b4a2 = (b4a) this.c;
                if (b4a2 != null) {
                    b4a2.p0();
                } else {
                    z68.n("dm4", (IOException) null, "Listener is null", Arrays.copyOf(new Object[0], 0));
                }
            }
        }
    }

    public bme r(wog wog) {
        bme bme;
        synchronized (this.b) {
            bme = (bme) ((LinkedHashMap) this.c).remove(wog);
        }
        return bme;
    }

    public VideoCodecStatus release() {
        ((voc) this.c).log("VideoDecoderLifecycleLogger", "release()");
        return ((VideoDecoder) this.b).release();
    }

    public List s(String str) {
        List list;
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
                    if (Intrinsics.areEqual((Object) ((wog) entry.getKey()).a, (Object) str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (wog remove : linkedHashMap.keySet()) {
                    ((LinkedHashMap) this.c).remove(remove);
                }
                list = CollectionsKt.toList(linkedHashMap.values());
            } finally {
            }
        }
        return list;
    }

    public void setValue(Object obj, KProperty kProperty, Object obj2) {
        getValue(obj, kProperty);
        ((hdd) this.b).c(obj2, "chat-mode");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void t(defpackage.r38 r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x000c }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x000c }
            r0.remove(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r1)
            return
        L_0x000a:
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            throw r2
        L_0x000c:
            r2 = move-exception
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm4.t(r38):void");
    }

    public void u(int i, Bundle bundle, Messenger messenger) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 1;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        obtain.replyTo = messenger;
        ((Messenger) this.b).send(obtain);
    }

    public void v(fqc fqc) {
        if (this != o || fqc == null) {
            ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.b;
            if (viewPropertyAnimator == null) {
                Animation animation = (Animation) this.c;
                if (animation == null) {
                    return;
                }
                if (fqc == null) {
                    animation.setAnimationListener((Animation.AnimationListener) null);
                } else {
                    animation.setAnimationListener(new tg(0, fqc));
                }
            } else if (fqc == null) {
                viewPropertyAnimator.withStartAction((Runnable) null);
                viewPropertyAnimator.withEndAction((Runnable) null);
            } else {
                viewPropertyAnimator.withStartAction(new sg(fqc, 0));
                viewPropertyAnimator.withEndAction(new sg(fqc, 1));
            }
        } else {
            fqc.E();
            fqc.D();
        }
    }

    public bme w(wog wog) {
        bme bme;
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                Object obj = linkedHashMap.get(wog);
                if (obj == null) {
                    obj = new bme(wog);
                    linkedHashMap.put(wog, obj);
                }
                bme = (bme) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bme;
    }

    public /* synthetic */ dm4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ dm4(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public dm4(VideoDecoder videoDecoder, VideoCodecInfo videoCodecInfo, voc voc) {
        this.a = 19;
        this.b = videoDecoder;
        this.c = voc;
        try {
            if (videoDecoder instanceof VideoDecoderFallback) {
                voc.log("VideoDecoderLifecycleLogger", "createDecoder(VideoDecoderFallback), codec: " + videoCodecInfo);
                return;
            }
            voc.log("VideoDecoderLifecycleLogger", "createDecoder(" + videoDecoder.getImplementationName() + "), codec: " + videoCodecInfo);
        } catch (Throwable th) {
            voc.logException("VideoDecoderLifecycleLogger", "createDecoder failed to read implementation name from " + videoDecoder.getClass().getName() + ", codec: " + videoCodecInfo, th);
        }
    }

    public dm4(Context context) {
        this.a = 11;
        this.b = context;
        this.c = LazyKt.lazy(new nm1(25, this));
    }

    public dm4(id3 id3) {
        this.a = 21;
        this.b = id3;
        this.c = ro4.b();
    }

    public dm4(Executor executor) {
        this.a = 28;
        this.b = executor;
        this.c = new ArrayDeque();
    }

    public dm4(ViewPropertyAnimator viewPropertyAnimator) {
        this.a = 1;
        this.b = viewPropertyAnimator;
        this.c = null;
    }

    public dm4(i6d i6d) {
        this.a = 0;
        this.b = i6d;
        this.c = new li(i6d, 7);
    }

    public dm4(TranslateAnimation translateAnimation) {
        this.a = 1;
        this.b = null;
        this.c = translateAnimation;
    }

    public dm4(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new HashMap();
                this.c = new ArrayList();
                return;
            case 12:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(ConstantsKt.MINIMUM_BLOCK_SIZE);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                this.b = new HashMap();
                return;
            case 23:
                return;
            case 26:
                this.b = new Object();
                this.c = new LinkedHashMap();
                return;
            default:
                this.b = null;
                this.c = null;
                return;
        }
    }

    public dm4(xq5 xq5, SparseArray sparseArray) {
        this.a = 2;
        this.b = xq5;
        SparseBooleanArray sparseBooleanArray = xq5.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int b2 = xq5.b(i);
            td tdVar = (td) sparseArray.get(b2);
            tdVar.getClass();
            sparseArray2.append(b2, tdVar);
        }
        this.c = sparseArray2;
    }

    public dm4(be4 be4) {
        this.a = 10;
        this.c = be4;
        this.b = new ArrayList();
    }

    public dm4(IBinder iBinder, Bundle bundle) {
        this.a = 17;
        this.b = new Messenger(iBinder);
        this.c = bundle;
    }
}
