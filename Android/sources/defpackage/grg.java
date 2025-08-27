package defpackage;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraDevice;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import androidx.media3.transformer.ExportException;
import androidx.work.WorkRequest;
import com.facebook.animated.gif.GifImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import org.apache.http.util.LangUtils;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.http.NoHttpApiEndpointException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* renamed from: grg  reason: default package */
public class grg implements og, bq9, op7, y01, t69, l47, k9c, y28, qk3, b69, mj6, eo1, lg8, t8g, JavaAudioDeviceModule.AudioRecordSampleHook, j99 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ grg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void A(long j) {
        KProperty[] kPropertyArr = CallMoreBottomSheet.v0;
        CallMoreBottomSheet callMoreBottomSheet = (CallMoreBottomSheet) this.b;
        gd1 gd1 = (gd1) callMoreBottomSheet.z.getValue();
        gd1.getClass();
        int i = (j > ((long) qqa.k) ? 1 : (j == ((long) qqa.k) ? 0 : -1));
        ph1 ph1 = gd1.c;
        if (i == 0) {
            xag.h(((jj1) ph1).K0, new fi1(true));
        } else if (j == ((long) qqa.m)) {
            xag.h(((jj1) ph1).K0, new fi1(false));
        } else if (j == ((long) qqa.g)) {
            xag.h(((jj1) ph1).K0, ai1.b);
        } else if (j == ((long) qqa.i)) {
            xag.h(((jj1) ph1).K0, di1.b);
        } else if (j == ((long) qqa.f)) {
            xag.h(((jj1) ph1).K0, wh1.b);
        } else if (j == ((long) qqa.s)) {
            xag.h(((jj1) ph1).K0, vh1.b);
        } else if (j == ((long) qqa.r0)) {
            xag.h(((jj1) ph1).K0, new rh1(vag.o));
        } else if (j == ((long) qqa.s0)) {
            xag.h(((jj1) ph1).K0, new rh1(vag.b));
        }
        callMoreBottomSheet.i0(true);
    }

    public void B() {
        KProperty[] kPropertyArr = CallBottomPanelWidget.y;
        i11 e0 = ((CallBottomPanelWidget) this.b).e0();
        ap1 k = e0.k();
        ahd ahd = k.i;
        ahd.getClass();
        zgd zgd = ((dhd) ((chd) ahd).v.getValue()).b;
        boolean areEqual = Intrinsics.areEqual((Object) zgd != null ? zgd.c : null, (Object) ((v9b) k.d).c().a.getId());
        ph1 ph1 = e0.c;
        if (areEqual) {
            xag.h(((jj1) ph1).K0, uh1.b);
        } else {
            xag.h(((jj1) ph1).K0, qh1.b);
        }
    }

    public void C(View view) {
        KProperty[] kPropertyArr = CallBottomPanelWidget.y;
        CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) this.b;
        if (((jj1) callBottomPanelWidget.d0()).n()) {
            if (callBottomPanelWidget.e0().m()) {
                lw3 d = m58.b(ix3.a).f().o(view).d();
                ArrayList j = callBottomPanelWidget.e0().j();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(j, 10));
                Iterator it = j.iterator();
                while (it.hasNext()) {
                    u41 u41 = (u41) it.next();
                    arrayList.add(new ow3(u41.getId(), u41.getTitle(), Integer.valueOf(jya.K), Integer.valueOf(u41.getIcon()), Integer.valueOf(jya.F)));
                }
                mw3 build = d.h(arrayList).build();
                callBottomPanelWidget.w = build;
                build.o(callBottomPanelWidget);
            }
        } else if (callBottomPanelWidget.e0().m()) {
            callBottomPanelWidget.c0().d(callBottomPanelWidget.e0().j());
        }
    }

    public void D(boolean z) {
        KProperty[] kPropertyArr = CallBottomPanelWidget.y;
        xag.h(((jj1) ((CallBottomPanelWidget) this.b).e0().c).K0, new fi1(z));
    }

    public boolean E(int i, int i2, Bundle bundle) {
        return false;
    }

    public int F() {
        return ((GifImage) ((ef) this.b).e).k();
    }

    public void G(Object obj) {
        qx0 qx0 = (qx0) obj;
        ((t9a) this.b).getClass();
    }

    public void J(Object obj) {
        qx0 qx0 = (qx0) obj;
        ((t9a) this.b).getClass();
    }

    public void U(Object obj) {
        qx0 qx0 = (qx0) obj;
        ((t9a) this.b).getClass();
    }

    public void a(Object obj) {
        ea6 ea6;
        Bitmap bitmap = (Bitmap) obj;
        ((o87) this.b).h = 50;
        ba6 ba6 = new ba6();
        ba6.t = bitmap.getHeight();
        ba6.s = bitmap.getWidth();
        ba6.m = vq9.l("image/raw");
        ba6.z = m53.i;
        ea6 ea62 = new ea6(ba6);
        if (!((o87) this.b).a || v0g.a < 34 || !bitmap.hasGainmap()) {
            ea6 = ea62;
        } else {
            ba6 a2 = ea62.a();
            a2.m = vq9.l("image/jpeg_r");
            ea6 = new ea6(a2);
        }
        try {
            ((o87) this.b).d.g(2, ea62);
            ((o87) this.b).e.submit(new x55((Object) this, (Object) bitmap, (Object) ea6, 10));
        } catch (RuntimeException e) {
            ((o87) this.b).d.d(ExportException.a(e, 1000));
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                List<au4> list = (List) obj;
                bu4 bu4 = (bu4) this.b;
                bu4.getClass();
                z68.c(bu4.g, wj6.h(list.size(), "startUploads: count = "), new Object[0]);
                for (au4 au4 : list) {
                    KProperty kProperty = bu4.f[1];
                    gl5 gl5 = (gl5) bu4.c.get();
                    gl5.getClass();
                    st4 st4 = au4.a;
                    StringBuilder n = tr1.n(st4.a, "UploadDraftMediaWorker/", ":");
                    n.append(st4.b);
                    String sb = n.toString();
                    v3b v3b = (v3b) ((v3b) ((v3b) new v3b(UploadDraftMediaWorker.class).setConstraints(new wj3(2, false, false, false, false, -1, -1, CollectionsKt.toSet(new LinkedHashSet())))).setExpedited(t5b.a)).setBackoffCriteria(ag0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
                    HashMap hashMap = new HashMap();
                    hashMap.put("workName", sb);
                    st4 st42 = au4.a;
                    hashMap.put(ApiProtocol.PARAM_CHAT_ID, Long.valueOf(st42.a));
                    hashMap.put("attachLocalId", st42.b);
                    hashMap.put("draft.path", au4.b);
                    hashMap.put("draft.lastModified", Long.valueOf(au4.c));
                    hashMap.put("draft.uploadType", au4.d.name());
                    p4g p4g = au4.e;
                    if (p4g != null) {
                        hashMap.put("draft.videoConvertOptions", true);
                        hashMap.put("draft.videoConvertOptions.quality", p4g.a.name());
                        hashMap.put("draft.videoConvertOptions.startTrimPosition", Float.valueOf(p4g.b));
                        hashMap.put("draft.videoConvertOptions.endTrimPosition", Float.valueOf(p4g.c));
                        hashMap.put("draft.videoConvertOptions.mute", Boolean.valueOf(p4g.d));
                    }
                    t64 t64 = new t64((Map) hashMap);
                    t64.f(t64);
                    fb5 fb5 = fb5.b;
                    KProperty[] kPropertyArr = ipg.n;
                    gl5.a.b(sb, fb5, (w3b) ((v3b) v3b.setInputData(t64)).build(), false).v();
                }
                return;
            default:
                Throwable th = (Throwable) obj;
                Objects.requireNonNull(th, "error is null");
                ((qk3) this.b).accept(new eca(new jea(th)));
                return;
        }
    }

    public void b() {
        o64 o64 = (o64) this.b;
        o64.A.b();
        DashManifestStaleException dashManifestStaleException = o64.C;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }

    public InputStream c(String str) {
        try {
            return ((AssetManager) this.b).open(str.substring(1));
        } catch (IOException unused) {
            return null;
        }
    }

    public int e() {
        return ((GifImage) ((ef) this.b).e).e();
    }

    public void f(m69 m69, u69 u69) {
        ((rx1) this.b).x.removeCallbacksAndMessages(m69);
    }

    public void g(Throwable th) {
        ((o87) this.b).d.d(ExportException.a(th, 2000));
    }

    public Object get() {
        s54 s54 = (s54) this.b;
        s54.b.getClass();
        return new j16((yva) s54.c.a);
    }

    public int i() {
        return ((ef) this.b).a;
    }

    public int j(int i) {
        return ((int[]) ((ef) this.b).g)[i];
    }

    public void k(VideoSink$VideoSinkException videoSink$VideoSinkException) {
        jo8 jo8 = (jo8) this.b;
        jo8.I1 = jo8.g(videoSink$VideoSinkException, videoSink$VideoSinkException.a, false, 7001);
    }

    public void m() {
        ((jo8) this.b).L0(0, 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: qx1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(defpackage.m69 r10, defpackage.u69 r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            rx1 r0 = (defpackage.rx1) r0
            android.os.Handler r1 = r0.x
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            java.util.ArrayList r1 = r0.z
            int r3 = r1.size()
            r4 = 0
        L_0x0011:
            r5 = -1
            if (r4 >= r3) goto L_0x0022
            java.lang.Object r6 = r1.get(r4)
            qx1 r6 = (defpackage.qx1) r6
            m69 r6 = r6.b
            if (r10 != r6) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0022:
            r4 = r5
        L_0x0023:
            if (r4 != r5) goto L_0x0026
            return
        L_0x0026:
            int r4 = r4 + 1
            int r3 = r1.size()
            if (r4 >= r3) goto L_0x0035
            java.lang.Object r1 = r1.get(r4)
            r2 = r1
            qx1 r2 = (defpackage.qx1) r2
        L_0x0035:
            r6 = r2
            iqg r1 = new iqg
            r4 = 1
            r3 = r1
            r5 = r9
            r7 = r11
            r8 = r10
            r3.<init>((int) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 200(0xc8, double:9.9E-322)
            long r2 = r2 + r4
            android.os.Handler r9 = r0.x
            r9.postAtTime(r1, r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grg.n(m69, u69):void");
    }

    public void onFirstFrameRendered() {
        jo8 jo8 = (jo8) this.b;
        n79.o(jo8.b2);
        Surface surface = jo8.b2;
        m8g m8g = jo8.Q1;
        Handler handler = (Handler) m8g.a;
        if (handler != null) {
            handler.post(new ca2((Object) m8g, (Object) surface, SystemClock.elapsedRealtime(), 8));
        }
        jo8.e2 = true;
    }

    public void onWebRtcAudioRecordSamplesReady(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        z6b z6b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (i == 2) {
            z6b = new x6b(i5 >> 1, i4, 0, bArr);
        } else if (i == 3) {
            z6b = new x6b(i5, i4, 1, bArr);
        } else if (i == 4) {
            z6b = new y6b(bArr, i4, i5);
        } else {
            throw new IllegalArgumentException(a81.j(i, "Audio format ", " is not supported. Please, use PCM 8 bit / 16 bit / float"));
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            ksg ksg = (ksg) it.next();
            if (ksg.c < elapsedRealtime) {
                ksg.c = ksg.b + elapsedRealtime;
                ksg.a.onSample(i, i2, i3, z6b);
            }
        }
    }

    public Object parse(sp7 sp7) {
        ata ata;
        km[] kmVarArr = (km[]) this.b;
        ata[] ataArr = new ata[kmVarArr.length];
        sp7.v();
        int length = kmVarArr.length;
        for (int i = 0; i < length; i++) {
            km kmVar = kmVarArr[i];
            sp7.t();
            String name = sp7.name();
            int hashCode = name.hashCode();
            if (hashCode != 3548) {
                if (hashCode == 3135262 && name.equals("fail")) {
                    ApiInvocationException apiInvocationException = (ApiInvocationException) kmVar.b.getFailParser().parse(sp7);
                    ata = new ata(kmVar, new Object());
                    sp7.r();
                    ataArr[i] = ata;
                }
            } else if (name.equals("ok")) {
                ata = new ata(kmVar, kmVar.b.getOkParser().parse(new lz2(sp7)));
                sp7.r();
                ataArr[i] = ata;
            }
            sp7.A();
            ata = new ata(kmVar, (Object) null);
            sp7.r();
            ataArr[i] = ata;
        }
        sp7.u();
        return new cm0(ataArr);
    }

    public Object r(do1 do1) {
        kz7 kz7 = (kz7) this.b;
        bs0.r("The result can only set once!", kz7.w == null);
        kz7.w = do1;
        return "ListFuture[" + this + "]";
    }

    public int t() {
        return ((GifImage) ((ef) this.b).e).i();
    }

    public Uri u(String str) {
        str.getClass();
        if (str.equals("api")) {
            return ((ee5) this.b).c().a();
        }
        throw new NoHttpApiEndpointException(str);
    }

    public an5 v() {
        l15 l15 = (l15) this.b;
        String str = ((Long) l15.a) == null ? " fileSizeLimit" : "";
        if (((Long) l15.b) == null) {
            str = str.concat(" durationLimitMillis");
        }
        if (((File) l15.c) == null) {
            str = tr1.j(str, " file");
        }
        if (str.isEmpty()) {
            return new an5(new xa0(((Long) l15.a).longValue(), ((Long) l15.b).longValue(), (File) l15.c));
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public g4 w(int i) {
        return null;
    }

    public g4 x(int i) {
        return null;
    }

    public int y() {
        return ((GifImage) ((ef) this.b).e).h();
    }

    public boolean z() {
        fw8 fw8 = (fw8) this.b;
        return fw8 != null && fw8.d;
    }

    public grg(ykb ykb) {
        this.a = 20;
        this.b = (CaptureSessionOnClosedNotCalledQuirk) ykb.g(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    public grg(CameraDevice cameraDevice) {
        this.a = 7;
        cameraDevice.getClass();
        this.b = new fbf(cameraDevice, (h88) null);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [l15, java.lang.Object] */
    public grg(File file) {
        this.a = 19;
        ? obj = new Object();
        obj.a = 0L;
        obj.b = 0L;
        this.b = obj;
        obj.c = file;
    }

    public grg(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = CollectionsKt.toList(eg2.o);
                return;
            case 16:
                this.b = Handler.createAsync(Looper.getMainLooper());
                return;
            case 22:
                return;
            case 28:
                this.b = new CopyOnWriteArraySet();
                return;
            default:
                this.b = new h4(this);
                return;
        }
    }
}
