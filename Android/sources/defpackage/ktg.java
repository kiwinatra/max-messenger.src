package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.a;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.my.tracker.campaign.CampaignService;
import com.my.tracker.obfuscated.d;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.text.StringsKt;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.RLottie;
import one.me.rlottie.e;
import one.me.rlottie.g;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import org.webrtc.DumpCallback;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ktg  reason: default package */
public final /* synthetic */ class ktg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ktg(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.o = obj2;
        this.c = obj3;
    }

    private final void a() {
        ((d) this.b).a((ProductInfoReq) this.o, (List) (ArrayList) ((List) this.c));
    }

    private final void b() {
        ((d) this.b).a((ProductInfoResult) this.o, (List) this.c);
    }

    public final void run() {
        g05 g05;
        Iterator it;
        Rect rect;
        AbstractMap.SimpleEntry simpleEntry;
        Iterator it2;
        Iterator it3;
        Rect rect2;
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                c5 c5Var = (c5) this.b;
                c5Var.getClass();
                HashSet hashSet = ActAttachesView.e1;
                c5Var.c.W((a) this.o, (a89) this.c);
                return;
            case 3:
                p7d p7d = (p7d) this.b;
                p7d.getClass();
                int i = v0g.a;
                tc5 tc5 = ((nc5) p7d.c).a;
                tc5.getClass();
                wb4 wb4 = tc5.A0;
                td J = wb4.J();
                wb4.K(J, 1009, new lb4(J, (ea6) this.o, (ea4) this.c, 1));
                return;
            case 4:
                wsb wsb = (wsb) this.b;
                wsb.getClass();
                int i2 = t0g.a;
                mc5 mc5 = (mc5) wsb.b;
                mc5.getClass();
                sc5 sc5 = mc5.a;
                sc5.getClass();
                vb4 vb4 = sc5.z0;
                sd P = vb4.P();
                vb4.Q(P, 1009, new zb2(P, (ca6) this.o, (da4) this.c));
                return;
            case 5:
                m70 m70 = (m70) this.b;
                int y = tr1.y(m70.g);
                if (y == 0) {
                    m70.j = (Executor) this.o;
                    m70.k = (wsb) this.c;
                    return;
                } else if (y == 1 || y == 2) {
                    throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                } else {
                    return;
                }
            case 6:
                ((iu0) this.b).g.a((b8d) this.o, (tsd) ((Executor) this.c));
                return;
            case 7:
                qx0 qx0 = (qx0) this.o;
                j55 j55 = (j55) this.c;
                vu0 vu0 = (vu0) this.b;
                try {
                    vu0.f(qx0, j55);
                    vu0.g.n0(qx0, j55);
                    j55.b(j55);
                    return;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    vu0.g.n0(qx0, j55);
                    j55.b(j55);
                    throw th2;
                }
            case 8:
                hz0 hz0 = (hz0) this.b;
                t6e t6e = (t6e) this.o;
                String str = (String) this.c;
                hz0.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = t6e.d;
                    if (peerConnectionFactory != null) {
                        peerConnectionFactory.submitDumpRequest(str, IntCompanionObject.MAX_VALUE, (DumpCallback) null);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    hz0.T0.logException("OKRTCCall", "Error starting local audio dump", th3);
                    return;
                }
            case 9:
                b51 b51 = (b51) this.o;
                Object obj = this.c;
                hz0 hz02 = (hz0) this.b;
                Iterator it4 = hz02.K0.iterator();
                while (it4.hasNext()) {
                    try {
                        ((ez0) it4.next()).onEvent(hz02, b51, obj);
                    } catch (Throwable th4) {
                        Throwable th5 = th4;
                        hz02.T0.logException("OKRTCCall", "Error on dispatch event " + b51, th5);
                    }
                }
                return;
            case 10:
                ue1 ue1 = (ue1) this.o;
                JSONObject jSONObject = (JSONObject) this.c;
                dz0 dz0 = ((hz0) this.b).u1;
                if (dz0 != null) {
                    dz0.onCustomData(ue1, jSONObject);
                    return;
                }
                return;
            case 11:
                ld1 ld1 = (ld1) this.b;
                voc voc = ld1.a;
                String str2 = ld1.j;
                voc.log(str2, "Initialize OpenGL context on openGL thread");
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    ld1.a.log(str2, "No default display found, will not initialize");
                    return;
                }
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    if (!EGL14.eglChooseConfig(eglGetDisplay, (int[]) this.o, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                        throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "getEglConfig()");
                    } else if (iArr2[0] > 0) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        if (eGLConfig != null) {
                            EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, (EGLContext) this.c, new int[]{12440, EglBase.getOpenGlesVersionFromConfig(EglBase.CONFIG_PLAIN), 12344}, 0);
                            if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                                ld1.d = eglCreateContext;
                                ld1.e = eglGetDisplay;
                                ld1.f = eGLConfig;
                                return;
                            }
                            throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "Failed to create EGL context");
                        }
                        throw new RuntimeException("Returned matching OpenGL context is null");
                    } else {
                        throw new RuntimeException("No valid OpenGL context present, can not continue");
                    }
                } else {
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "Unable to initialize EGL14");
                }
            case 12:
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.b;
                CharSequence charSequence = (CharSequence) this.o;
                appCompatTextView.setText(charSequence);
                appCompatTextView.setVisibility((charSequence == null || StringsKt.isBlank(charSequence)) ^ true ? 0 : 8);
                ((jk1) this.c).M();
                return;
            case 13:
                CallsAudioManagerV3Impl.reportAudioDeviceOnMainThread$lambda$9((CallsAudioManagerV3Impl) this.b, (CallsAudioDeviceInfo) this.o, (CallsAudioManager.OnAudioDeviceInfoChangeListener) this.c);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                hr1 hr1 = ((lr1) this.b).z;
                bt1 bt1 = (bt1) this.c;
                ((HashSet) hr1.b).add(bt1);
                ((ArrayMap) hr1.c).put(bt1, (Executor) this.o);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                qs1 qs1 = (qs1) this.b;
                qs1.getClass();
                qs1.d.a(TimeUnit.SECONDS.toMillis(3) + System.currentTimeMillis(), (ps1) ((AtomicReference) this.o).get());
                ((do1) this.c).b((Object) null);
                return;
            case 16:
                ((CampaignService) this.b).a((String) this.o, (pr1) ((Runnable) this.c));
                return;
            case LangUtils.HASH_SEED /*17*/:
                r62 r62 = (r62) this.b;
                r62.getClass();
                bl4 bl4 = (bl4) this.o;
                String name = bl4.name();
                Collection<Long> collection = (Collection) this.c;
                z68.c("r62", "syncMessages, itemType = %s, chatIds size = %d", name, Integer.valueOf(collection.size()));
                for (Long l : collection) {
                    z68.c("r62", "syncMessages, itemType = %s, chatId = %d", bl4.name(), l);
                    ((eef) r62.t.get()).g(new qvd(((ltb) r62.n).a.n(), l.longValue(), 0, bl4), 0, 0);
                }
                rvd.A((jqg) r62.w.get());
                return;
            case 18:
                ed3 ed3 = (ed3) this.b;
                ed3.getClass();
                ea6 ea6 = ed3.f;
                n79.o(ea6);
                ((t8g) this.o).k(new VideoSink$VideoSinkException((VideoFrameProcessingException) this.c, ea6));
                return;
            case 19:
                ejd ejd = ((c24) this.b).f;
                List listOf = CollectionsKt.listOf((a24) this.o);
                ejd.getClass();
                ejd.e(listOf);
                ((CountDownLatch) this.c).countDown();
                return;
            case 20:
                ((ViewGroup) this.b).endViewTransition((View) this.o);
                ii4 ii4 = (ii4) this.c;
                ((qge) ii4.c.a).c(ii4);
                return;
            case 21:
                if (((ti4) this.b).X) {
                    ((Runnable) this.o).run();
                    return;
                } else {
                    ((Runnable) this.c).run();
                    return;
                }
            case 22:
                e eVar = (e) this.b;
                eVar.getClass();
                ((Runnable) this.o).run();
                one.me.rlottie.a.d(new bk4(4, eVar, (one.me.rlottie.d) this.c));
                return;
            case 23:
                g gVar = (g) this.b;
                gVar.getClass();
                ((Runnable) this.o).run();
                RLottie.config.workQueue.post(new bk4(5, gVar, (one.me.rlottie.d) this.c));
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                fw4 fw4 = (fw4) this.b;
                ((hw4) this.o).g(fw4.a, fw4.b, (Exception) this.c);
                return;
            case 25:
                gw4 gw4 = (gw4) this.b;
                ((iw4) this.o).u(gw4.a, gw4.b, (Exception) this.c);
                return;
            case 26:
                if (((px4) this.b).w) {
                    ((Runnable) this.o).run();
                    return;
                } else {
                    ((Runnable) this.c).run();
                    return;
                }
            case 27:
                j05 j05 = (j05) this.b;
                j05.getClass();
                Rect rect3 = new Rect();
                h05 h05 = (h05) this.o;
                if0 if0 = (if0) this.c;
                n05 n05 = j05.a;
                if (h05 != null && h05.o) {
                    int width = n05.getWidth();
                    int height = n05.getHeight();
                    if0.c = width;
                    if0.d = height;
                } else if (if0.c == -1 && if0.d == -1) {
                    if (h05 != null) {
                        Rect rect4 = h05.c;
                        int width2 = rect4.width();
                        int height2 = rect4.height();
                        if0.c = width2;
                        if0.d = height2;
                    } else {
                        int width3 = n05.getWidth();
                        int measuredHeight = n05.getMeasuredHeight();
                        if0.c = width3;
                        if0.d = measuredHeight;
                    }
                }
                if0.a(if0, n05.getMeasuredWidth(), n05.getMeasuredHeight(), rect3);
                n05.setBounds(rect3);
                if (h05 != null) {
                    Rect bounds = n05.getBounds();
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    Iterator it5 = h05.a.iterator();
                    while (it5.hasNext()) {
                        bs7 bs7 = (bs7) it5.next();
                        if (tr1.y(bs7.b) != 0) {
                            rect = bounds;
                            it = it5;
                            simpleEntry = null;
                        } else {
                            Rect rect5 = h05.c;
                            float width4 = ((float) bounds.width()) / ((float) rect5.width());
                            float height3 = ((float) bounds.height()) / ((float) rect5.height());
                            List<sv4> list = bs7.v;
                            for (sv4 sv4 : list) {
                                float[] fArr = sv4.b;
                                if (fArr != null) {
                                    for (int i3 = 0; i3 < fArr.length; i3++) {
                                        if (i3 % 2 == 0) {
                                            float f = fArr[i3] - ((float) rect5.left);
                                            fArr[i3] = f;
                                            float f2 = f * width4;
                                            fArr[i3] = f2;
                                            fArr[i3] = f2 + ((float) bounds.left);
                                        } else {
                                            float f3 = fArr[i3] - ((float) rect5.top);
                                            fArr[i3] = f3;
                                            float f4 = f3 * height3;
                                            fArr[i3] = f4;
                                            fArr[i3] = f4 + ((float) bounds.top);
                                        }
                                    }
                                }
                            }
                            rv4 rv4 = new rv4(bs7.c, (((float) bounds.width()) / ((float) rect5.width())) * bs7.o);
                            Iterator it6 = list.iterator();
                            while (it6.hasNext()) {
                                sv4 sv42 = (sv4) it6.next();
                                float[] fArr2 = sv42.b;
                                int y2 = tr1.y(sv42.a);
                                Path path = rv4.b;
                                ArrayList arrayList2 = rv4.a;
                                if (y2 == 0) {
                                    rect2 = bounds;
                                    float f5 = fArr2[0];
                                    float f6 = fArr2[1];
                                    float f7 = fArr2[2];
                                    float f8 = fArr2[3];
                                    it3 = it6;
                                    it2 = it5;
                                    arrayList2.add(new sv4(new float[]{f5, f6, f7, f8}, 1));
                                    path.moveTo(f5, f6);
                                    path.lineTo(f7, f8);
                                } else if (y2 != 1) {
                                    rect2 = bounds;
                                    it3 = it6;
                                    it2 = it5;
                                } else {
                                    float f9 = fArr2[0];
                                    float f10 = fArr2[1];
                                    float f11 = fArr2[2];
                                    float f12 = fArr2[3];
                                    float f13 = fArr2[4];
                                    float f14 = fArr2[5];
                                    float f15 = fArr2[6];
                                    float f16 = fArr2[7];
                                    rect2 = bounds;
                                    arrayList2.add(new sv4(new float[]{f9, f10, f11, f12, f13, f14, f15, f16}, 2));
                                    path.moveTo(f9, f10);
                                    path.cubicTo(f11, f12, f13, f14, f15, f16);
                                    it3 = it6;
                                    it2 = it5;
                                }
                                bounds = rect2;
                                it6 = it3;
                                it5 = it2;
                            }
                            rect = bounds;
                            it = it5;
                            simpleEntry = new AbstractMap.SimpleEntry(Integer.valueOf(bs7.a), rv4);
                        }
                        if (simpleEntry != null) {
                            arrayList.add((g05) simpleEntry.getValue());
                            hashMap.put((Integer) simpleEntry.getKey(), (g05) simpleEntry.getValue());
                        }
                        bounds = rect;
                        it5 = it;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (h63 h63 : h05.b) {
                        pa paVar = (tr1.y(h63.a) == 0 && (g05 = (g05) hashMap.get(Integer.valueOf(h63.b))) != null) ? new pa(g05) : null;
                        if (paVar != null) {
                            arrayList3.add(paVar);
                        }
                    }
                    Iterator it7 = arrayList.iterator();
                    while (it7.hasNext()) {
                        n05.a.add((g05) it7.next());
                        n05.invalidate();
                    }
                    j05.d.addAll(arrayList3);
                    n05.setDrawStickerEnabled(h05.o);
                }
                j05.b();
                return;
            case 28:
                ((EglRenderer) this.b).lambda$removeFrameListener$2((CountDownLatch) this.o, (EglRenderer.FrameListener) this.c);
                return;
            default:
                xv1 xv1 = (xv1) this.b;
                kv0 kv0 = (kv0) this.o;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.c;
                xv1.getClass();
                try {
                    a96 r = n79.r((Context) xv1.b);
                    if (r != null) {
                        z86 z86 = (z86) r.a;
                        synchronized (z86.o) {
                            z86.w = threadPoolExecutor;
                        }
                        r.a.h(new v15(kv0, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th6) {
                    kv0.U(th6);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
