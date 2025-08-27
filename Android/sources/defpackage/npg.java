package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.hardware.camera2.CaptureResult;
import android.media.MediaCodec;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.SystemClock;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import android.widget.Chronometer;
import androidx.work.WorkRequest;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CapturerObserver;
import org.webrtc.Size;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: npg  reason: default package */
public final class npg implements nj6, it1, yr6, o8b, ja7, CapturerObserver, JavaAudioDeviceModule.AudioRecordErrorCallback, gce {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ npg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static float G(Float f, boolean z) {
        return z ? f.floatValue() : 1.0f - f.floatValue();
    }

    public static ValueAnimator I(View view, int i, int i2) {
        RippleDrawable rippleDrawable = (RippleDrawable) view.getBackground();
        if (rippleDrawable.getNumberOfLayers() == 0) {
            return null;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ofObject.addUpdateListener(new z00(18, (Object) (GradientDrawable) rippleDrawable.getDrawable(0).getCurrent()));
        ofObject.addListener(new n33(1));
        return ofObject;
    }

    public static yz0 P(JSONObject jSONObject) {
        ue1 b2 = ue1.b(jSONObject.optString("initiatorId"));
        Long l = null;
        if (b2 == null) {
            return null;
        }
        if (jSONObject.has("movieId")) {
            l = Long.valueOf(jSONObject.optLong("movieId"));
        }
        return new yz0(b2, l);
    }

    public static void t(float f, float f2, he heVar, View... viewArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new z00(17, (Object) viewArr));
        ofFloat.addListener(new ebc(ofFloat, 0));
        animatorSet.setDuration(200);
        if (heVar != null) {
            View view = (View) heVar.c;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{view.getRotation(), f2});
            ofFloat2.addUpdateListener(new hg(view, 4));
            ofFloat2.addListener(new ebc(ofFloat2, 1));
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        } else {
            animatorSet.play(ofFloat);
        }
        animatorSet.start();
    }

    public void A(int i) {
        int[] iArr = (int[]) this.b;
        if (iArr == null) {
            int[] iArr2 = new int[(Math.max(i, 10) + 1)];
            this.b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public CaptureResult B() {
        return (CaptureResult) this.c;
    }

    public ft1 C() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AF_STATE);
        ft1 ft1 = ft1.a;
        if (num == null) {
            return ft1;
        }
        switch (num.intValue()) {
            case 0:
                return ft1.b;
            case 1:
            case 3:
                return ft1.c;
            case 2:
                return ft1.o;
            case 4:
                return ft1.w;
            case 5:
                return ft1.x;
            case 6:
                return ft1.v;
            default:
                return ft1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.datatransport.cct.CctBackendFactory D(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "."
            java.lang.String r1 = "Could not instantiate "
            java.lang.Object r2 = r12.c
            java.util.Map r2 = (java.util.Map) r2
            r3 = 0
            if (r2 != 0) goto L_0x0082
            java.lang.Object r2 = r12.b
            android.content.Context r2 = (android.content.Context) r2
            android.content.pm.PackageManager r4 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r4 != 0) goto L_0x0017
        L_0x0015:
            r2 = r3
            goto L_0x0029
        L_0x0017:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0015 }
            java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r6 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
            r5.<init>(r2, r6)     // Catch:{ NameNotFoundException -> 0x0015 }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r2 = r4.getServiceInfo(r5, r2)     // Catch:{ NameNotFoundException -> 0x0015 }
            if (r2 != 0) goto L_0x0027
            goto L_0x0015
        L_0x0027:
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0015 }
        L_0x0029:
            if (r2 != 0) goto L_0x0030
            java.util.Map r2 = java.util.Collections.emptyMap()
            goto L_0x0080
        L_0x0030:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x003d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x007f
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.get(r6)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x003d
            java.lang.String r8 = "backend:"
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L_0x003d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = ","
            r9 = -1
            java.lang.String[] r7 = r7.split(r8, r9)
            int r8 = r7.length
            r9 = 0
        L_0x0064:
            if (r9 >= r8) goto L_0x003d
            r10 = r7[r9]
            java.lang.String r10 = r10.trim()
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0073
            goto L_0x007c
        L_0x0073:
            r11 = 8
            java.lang.String r11 = r6.substring(r11)
            r4.put(r10, r11)
        L_0x007c:
            int r9 = r9 + 1
            goto L_0x0064
        L_0x007f:
            r2 = r4
        L_0x0080:
            r12.c = r2
        L_0x0082:
            java.lang.Object r12 = r12.c
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r12 = r12.get(r13)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x008f
            return r3
        L_0x008f:
            java.lang.Class r13 = java.lang.Class.forName(r12)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            java.lang.Class<com.google.android.datatransport.cct.CctBackendFactory> r2 = com.google.android.datatransport.cct.CctBackendFactory.class
            java.lang.Class r13 = r13.asSubclass(r2)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            java.lang.reflect.Constructor r13 = r13.getDeclaredConstructor(r3)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            java.lang.Object r13 = r13.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            com.google.android.datatransport.cct.CctBackendFactory r13 = (com.google.android.datatransport.cct.CctBackendFactory) r13     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00b8, InstantiationException -> 0x00ac, NoSuchMethodException -> 0x00a8, InvocationTargetException -> 0x00a4 }
            return r13
        L_0x00a4:
            r1.concat(r12)
            goto L_0x00d3
        L_0x00a8:
            r1.concat(r12)
            goto L_0x00d3
        L_0x00ac:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r13.append(r12)
            r13.append(r0)
            goto L_0x00d3
        L_0x00b8:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r13.append(r12)
            r13.append(r0)
            goto L_0x00d3
        L_0x00c4:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Class "
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = " is not found."
            r13.append(r12)
        L_0x00d3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npg.D(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public int E() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return 2;
        }
        if (intValue == 1) {
            return 3;
        }
        if (intValue == 2) {
            return 4;
        }
        if (intValue == 3) {
            return 5;
        }
        if (intValue != 4) {
            return intValue != 5 ? 1 : 7;
        }
        return 6;
    }

    public int F() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return 3;
            }
            if (intValue == 3 || intValue == 4) {
                return 4;
            }
            if (intValue != 5) {
                return 1;
            }
        }
        return 2;
    }

    public int H() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return 1;
        }
        switch (num.intValue()) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            default:
                return 1;
        }
    }

    public void J(String str) {
        lq8 lq8;
        boolean z;
        if (str != null && !StringsKt.isBlank(str)) {
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject("commands");
                if (optJSONObject != null && (lq8 = (lq8) this.c) != null) {
                    long optLong = optJSONObject.optLong("globalShutdownMs");
                    Long valueOf = Long.valueOf(optJSONObject.optLong("featureShutdownMs"));
                    String str2 = (String) this.b;
                    if (str2 == null) {
                        valueOf = null;
                    }
                    optJSONObject.optLong("tagShutdownMs");
                    SharedPreferences.Editor edit = lq8.b().edit();
                    boolean z2 = true;
                    if (optLong > 0) {
                        edit.putLong("system.shutdown.until.ts", System.currentTimeMillis() + optLong);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (str2 == null || valueOf == null || valueOf.longValue() <= 0) {
                        z2 = z;
                    } else {
                        edit.putLong(wj6.k("system.", str2, ".shutdown.until.ts"), valueOf.longValue() + System.currentTimeMillis());
                    }
                    if (z2) {
                        edit.apply();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int K(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r0.length
            if (r6 < r0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            r0 = r1
            goto L_0x006f
        L_0x0014:
            r2 = 0
            if (r0 != 0) goto L_0x0018
            goto L_0x0033
        L_0x0018:
            int r0 = r0.size()
            int r0 = r0 + -1
        L_0x001e:
            if (r0 < 0) goto L_0x0033
            java.lang.Object r3 = r5.c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            tie r3 = (defpackage.tie) r3
            int r4 = r3.a
            if (r4 != r6) goto L_0x0030
            r2 = r3
            goto L_0x0033
        L_0x0030:
            int r0 = r0 + -1
            goto L_0x001e
        L_0x0033:
            if (r2 == 0) goto L_0x003c
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L_0x003c:
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L_0x0045:
            if (r2 >= r0) goto L_0x0059
            java.lang.Object r3 = r5.c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            tie r3 = (defpackage.tie) r3
            int r3 = r3.a
            if (r3 < r6) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0059:
            r2 = r1
        L_0x005a:
            if (r2 == r1) goto L_0x0012
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            tie r0 = (defpackage.tie) r0
            java.lang.Object r3 = r5.c
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.a
        L_0x006f:
            if (r0 != r1) goto L_0x007f
            java.lang.Object r0 = r5.b
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r5 = r5.b
            int[] r5 = (int[]) r5
            int r5 = r5.length
            return r5
        L_0x007f:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.b
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r5 = r5.b
            int[] r5 = (int[]) r5
            java.util.Arrays.fill(r5, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npg.K(int):int");
    }

    public void L(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            A(i3);
            int[] iArr2 = (int[]) this.b;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.b, i, i3, -1);
            List list = (List) this.c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    tie tie = (tie) ((List) this.c).get(size);
                    int i4 = tie.a;
                    if (i4 >= i) {
                        tie.a = i4 + i2;
                    }
                }
            }
        }
    }

    public void M(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            A(i3);
            int[] iArr2 = (int[]) this.b;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.b;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List list = (List) this.c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    tie tie = (tie) ((List) this.c).get(size);
                    int i4 = tie.a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((List) this.c).remove(size);
                        } else {
                            tie.a = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    public void N() {
        pbe pbe = (pbe) ((ube) this.b);
        if (!pbe.f()) {
            pbe.onError(new FetcherException(4, "Failed to fetch Vimeo video"));
        }
    }

    public void O(JSONObject jSONObject) {
        e7d e7d;
        dm4 dm4 = (dm4) this.c;
        dm4.getClass();
        gae gae = null;
        try {
            ue1 a2 = ue1.a(jSONObject.getString("initiatorId"));
            String C = ct.C(jSONObject, "sharedUrl");
            ((nfd) dm4.c).getClass();
            e7d = new e7d(a2, C, nfd.s(jSONObject));
        } catch (JSONException e) {
            ((voc) dm4.b).logException("UrlSharingParser", "Can't parse url sharing", e);
            e7d = null;
        }
        if (e7d != null) {
            String str = e7d.b;
            if (str != null) {
                gae = new gae(e7d.a, str);
            }
            ((rzf) this.b).onUrlSharingInfoUpdated(new hm1(e7d.c, gae));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: jae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: iu0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: jae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: jae} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.a
            switch(r2) {
                case 3: goto L_0x004c;
                case 11: goto L_0x003a;
                case 13: goto L_0x0025;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r0.b
            gce r2 = (defpackage.gce) r2
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x001d }
            hb3 r0 = (defpackage.hb3) r0     // Catch:{ all -> 0x001d }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x001d }
            rm0 r0 = (defpackage.rm0) r0     // Catch:{ all -> 0x001d }
            r3 = 0
            r0.accept(r1, r3)     // Catch:{ all -> 0x001d }
            r2.a(r1)
            goto L_0x0024
        L_0x001d:
            r0 = move-exception
            defpackage.hd8.Z(r0)
            r2.onError(r0)
        L_0x0024:
            return
        L_0x0025:
            java.lang.Object r2 = r0.b
            do1 r2 = (defpackage.do1) r2
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x0035 }
            bj6 r0 = (defpackage.bj6) r0     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r0.apply(r1)     // Catch:{ all -> 0x0035 }
            r2.b(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            r2.d(r0)
        L_0x0039:
            return
        L_0x003a:
            java.lang.Void r1 = (java.lang.Void) r1
            java.lang.Object r1 = r0.c
            e65 r1 = (defpackage.e65) r1
            g65 r1 = r1.k
            java.util.HashSet r1 = r1.n
            java.lang.Object r0 = r0.b
            h55 r0 = (defpackage.h55) r0
            r1.remove(r0)
            return
        L_0x004c:
            eg7 r1 = (defpackage.eg7) r1
            java.lang.Object r2 = r0.c
            m70 r2 = (defpackage.m70) r2
            boolean r3 = r2.i
            if (r3 == 0) goto L_0x0158
            c65 r3 = r2.l
            java.lang.Object r0 = r0.b
            c65 r0 = (defpackage.c65) r0
            if (r3 == r0) goto L_0x0060
            goto L_0x0158
        L_0x0060:
            boolean r0 = r2.o
            r4 = 0
            r6 = 0
            jae r7 = r2.e
            iu0 r8 = r2.d
            if (r0 == 0) goto L_0x0099
            long r9 = r2.p
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0073
            r0 = 1
            goto L_0x0074
        L_0x0073:
            r0 = r6
        L_0x0074:
            r9 = 0
            defpackage.bs0.r(r9, r0)
            long r10 = java.lang.System.nanoTime()
            long r12 = r2.p
            long r10 = r10 - r12
            long r12 = r2.f
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0099
            boolean r0 = r2.o
            defpackage.bs0.r(r9, r0)
            r8.start()     // Catch:{ AudioStream$AudioStreamException -> 0x0093 }
            r7.stop()     // Catch:{ AudioStream$AudioStreamException -> 0x0093 }
            r2.o = r6     // Catch:{ AudioStream$AudioStreamException -> 0x0093 }
            goto L_0x0099
        L_0x0093:
            long r9 = java.lang.System.nanoTime()
            r2.p = r9
        L_0x0099:
            boolean r0 = r2.o
            if (r0 == 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r7 = r8
        L_0x009f:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f
            boolean r0 = r0.get()
            java.lang.String r8 = "The buffer is submitted or canceled."
            if (r0 != 0) goto L_0x0152
            java.nio.ByteBuffer r0 = r1.c
            ba0 r7 = r7.read(r0)
            int r9 = r7.a
            if (r9 <= 0) goto L_0x014b
            boolean r10 = r2.r
            if (r10 == 0) goto L_0x00d6
            byte[] r10 = r2.s
            if (r10 == 0) goto L_0x00be
            int r10 = r10.length
            if (r10 >= r9) goto L_0x00c2
        L_0x00be:
            byte[] r10 = new byte[r9]
            r2.s = r10
        L_0x00c2:
            int r10 = r0.position()
            byte[] r11 = r2.s
            r0.put(r11, r6, r9)
            int r11 = r0.position()
            java.nio.Buffer r11 = r0.limit(r11)
            r11.position(r10)
        L_0x00d6:
            java.util.concurrent.Executor r10 = r2.j
            long r11 = r7.b
            if (r10 == 0) goto L_0x011f
            long r13 = r2.u
            long r13 = r11 - r13
            r15 = 200(0xc8, double:9.9E-322)
            int r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r7 < 0) goto L_0x011f
            r2.u = r11
            wsb r7 = r2.k
            int r13 = r2.v
            r14 = 2
            if (r13 != r14) goto L_0x011f
            java.nio.ShortBuffer r13 = r0.asShortBuffer()
            r14 = 0
        L_0x00f5:
            boolean r16 = r13.hasRemaining()
            if (r16 == 0) goto L_0x010b
            short r16 = r13.get()
            int r3 = java.lang.Math.abs(r16)
            double r4 = (double) r3
            double r14 = java.lang.Math.max(r14, r4)
            r4 = 0
            goto L_0x00f5
        L_0x010b:
            r3 = 4674736138332667904(0x40dfffc000000000, double:32767.0)
            double r14 = r14 / r3
            r2.t = r14
            if (r7 == 0) goto L_0x011f
            c r3 = new c
            r4 = 12
            r3.<init>(r4, r2, r7)
            r10.execute(r3)
        L_0x011f:
            int r3 = r0.position()
            int r3 = r3 + r9
            r0.limit(r3)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r3 = r0.toMicros(r11)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0145
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x013c
            r6 = 1
        L_0x013c:
            defpackage.bs0.n(r6)
            r1.g = r3
            r1.b()
            goto L_0x014e
        L_0x0145:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x014b:
            r1.a()
        L_0x014e:
            r2.c()
            goto L_0x015b
        L_0x0152:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0158:
            r1.a()
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npg.a(java.lang.Object):void");
    }

    public void b(ra5 ra5) {
        CaptureResult captureResult = (CaptureResult) this.c;
        super.b(ra5);
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                ra5.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
        }
        Long l = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        ArrayList arrayList = ra5.a;
        if (l != null) {
            ra5.c("ExposureTime", String.valueOf(((double) l.longValue()) / ((double) TimeUnit.SECONDS.toNanos(1))), arrayList);
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            ra5.c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num3 != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (((float) num3.intValue()) / 100.0f)));
            }
            int intValue = num2.intValue();
            ra5.c("SensitivityType", String.valueOf(3), arrayList);
            ra5.c("PhotographicSensitivity", String.valueOf(Math.min(65535, intValue)), arrayList);
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            long floatValue = (long) (f2.floatValue() * 1000.0f);
            ra5.c("FocalLength", floatValue + "/1000", arrayList);
        }
        Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            int y = tr1.y(num4.intValue() == 0 ? 2 : 1);
            ra5.c("WhiteBalance", y != 0 ? y != 1 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
        }
    }

    public void c(mq4 mq4) {
        ((gce) this.b).c(mq4);
    }

    public void close() {
        ((ja7) this.b).close();
    }

    public a9f d() {
        return (a9f) this.b;
    }

    public ha7 e() {
        return y(((ja7) this.b).e());
    }

    public int f() {
        return ((ja7) this.b).f();
    }

    public void g(Throwable th) {
        switch (this.a) {
            case 3:
                m70 m70 = (m70) this.c;
                if (m70.l == ((c65) this.b) && !(th instanceof IllegalStateException)) {
                    Executor executor = m70.j;
                    wsb wsb = m70.k;
                    if (executor != null && wsb != null) {
                        executor.execute(new c(9, wsb, th));
                        return;
                    }
                    return;
                }
                return;
            case 11:
                e65 e65 = (e65) this.c;
                e65.k.n.remove((h55) this.b);
                boolean z = th instanceof MediaCodec.CodecException;
                g65 g65 = e65.k;
                if (z) {
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                    g65.getClass();
                    g65.b(1, codecException.getMessage(), codecException);
                    return;
                }
                g65.b(0, th.getMessage(), th);
                return;
            default:
                ((do1) this.b).d(th);
                return;
        }
    }

    public int getHeight() {
        return ((ja7) this.b).getHeight();
    }

    public Surface getSurface() {
        return ((ja7) this.b).getSurface();
    }

    public long getTimestamp() {
        Long l = (Long) ((CaptureResult) this.c).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    public int getWidth() {
        return ((ja7) this.b).getWidth();
    }

    public EGLContext h(EGLDisplay eGLDisplay, int i, int[] iArr) {
        EGLContext r = ld8.r((EGLContext) this.b, eGLDisplay, i, iArr);
        ((ArrayList) this.c).add(r);
        return r;
    }

    public void i() {
        ((ja7) this.b).i();
    }

    public Object j(Uri uri, l74 l74) {
        to5 to5 = (to5) ((o8b) this.b).j(uri, l74);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? to5 : (to5) to5.a(list);
    }

    public void k(ia7 ia7, Executor executor) {
        ((ja7) this.b).k(new g18(27, this, ia7), executor);
    }

    public gt1 l() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AWB_STATE);
        gt1 gt1 = gt1.a;
        if (num == null) {
            return gt1;
        }
        int intValue = num.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? gt1 : gt1.v : gt1.o : gt1.c : gt1.b;
    }

    public EGLSurface m(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        int[] iArr;
        int[] iArr2 = ld8.x;
        if (i == 3 || i == 10) {
            iArr = ld8.c;
        } else if (i == 7 || i == 6) {
            iArr = ld8.o;
            if (!z) {
                if (i == 6) {
                    if (v0g.a < 33 || !ld8.V("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        throw new Exception("BT.2020 PQ OpenGL output isn't supported.");
                    }
                    iArr2 = ld8.v;
                } else if (ld8.V("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                    iArr2 = ld8.w;
                } else {
                    throw new Exception("BT.2020 HLG OpenGL output isn't supported.");
                }
            }
        } else {
            throw new IllegalArgumentException(wj6.h(i, "Unsupported color transfer: "));
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, ld8.I(eGLDisplay, iArr), obj, iArr2, 0);
        ld8.g("Error creating a new EGL surface");
        return eglCreateWindowSurface;
    }

    public int n() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return 2;
        }
        if (intValue != 2) {
            return (intValue == 3 || intValue == 4) ? 4 : 1;
        }
        return 3;
    }

    public int o() {
        return ((ja7) this.b).o();
    }

    public void onCapturerStarted(boolean z) {
        cab cab = (cab) this.c;
        cab.c.log("PatchedVideoCapturer", "onCapturerStarted");
        CapturerObserver capturerObserver = (CapturerObserver) this.b;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStarted(z);
        }
        cab.getClass();
    }

    public void onCapturerStopped() {
        cab cab = (cab) this.c;
        cab.c.log("PatchedVideoCapturer", "onCapturerStopped");
        CapturerObserver capturerObserver = (CapturerObserver) this.b;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStopped();
        }
        cab.getClass();
    }

    public void onError(Throwable th) {
        try {
            ((rm0) ((hb3) this.c).c).accept((Object) null, th);
        } catch (Throwable th2) {
            hd8.Z(th2);
            th = new CompositeException(th, th2);
        }
        ((gce) this.b).onError(th);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        kv1 kv1 = ((cab) this.c).b;
        kv1.b.a();
        kv1.c = new Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        if (SystemClock.elapsedRealtime() - kv1.d >= WorkRequest.MIN_BACKOFF_MILLIS) {
            kv1.a.log("CameraStatCollector", kv1.toString());
            kv1.d = SystemClock.elapsedRealtime();
        }
        if (((CapturerObserver) this.b) != null) {
            VideoSink videoSink = ((cab) this.c).w;
            ((cab) this.c).getClass();
            if (StringsKt__StringsJVMKt.equals(Build.MANUFACTURER, "xiaomi", true) || !(videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer)) {
                if (videoSink != null) {
                    videoSink.onFrame(videoFrame);
                }
                ((CapturerObserver) this.b).onFrameCaptured(videoFrame);
                return;
            }
            VideoFrame videoFrame2 = new VideoFrame(new d8d((VideoFrame.TextureBuffer) videoFrame.getBuffer(), videoFrame.getRotation(), ((cab) this.c).v.getHandler(), ((cab) this.c).o), 0, videoFrame.getTimestampNs());
            if (videoSink != null) {
                videoSink.onFrame(videoFrame2);
            }
            ((CapturerObserver) this.b).onFrameCaptured(videoFrame2);
        }
    }

    public void onWebRtcAudioRecordError(String str) {
        ((o60) this.b).onWebRtcAudioRecordError(str);
        voc voc = (voc) this.c;
        voc.log("SharedPeerConnectionFac", "onWebRtcAudioRecordError: " + str);
        voc.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordError", new Exception(a81.m("onWebRtcAudioRecordError ", str)));
    }

    public void onWebRtcAudioRecordInitError(String str) {
        ((o60) this.b).onWebRtcAudioRecordInitError(str);
        voc voc = (voc) this.c;
        voc.log("SharedPeerConnectionFac", "onWebRtcAudioRecordInitError: " + str);
        voc.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordInitError", new Exception(a81.m("onWebRtcAudioRecordInitError ", str)));
    }

    public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        ((o60) this.b).onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        voc voc = (voc) this.c;
        voc.log("SharedPeerConnectionFac", "onWebRtcAudioRecordStartError: . " + str);
        voc.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordStartError", new Exception(a81.m("onWebRtcAudioRecordStartError ", str)));
    }

    public ha7 p() {
        return y(((ja7) this.b).p());
    }

    public gs6 q(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        ld8.h();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        ld8.h();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        ld8.h();
        return new gs6(i, iArr[0], i2, i3);
    }

    public EGLSurface r(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        return ld8.s(eGLContext, eGLDisplay);
    }

    public void s(View view, boolean z) {
        int i;
        int i2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 40});
        ofInt.addUpdateListener(new bn(6, this, atomicBoolean));
        if (z) {
            i = fw3.a(ym.v, lad.p);
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            i = j4b.k0(context).J;
        }
        if (!z) {
            i2 = fw3.a(ym.v, lad.p);
        } else {
            Context context2 = view.getContext();
            Lazy lazy2 = scf.b0;
            i2 = j4b.k0(context2).J;
        }
        ValueAnimator I = I(view, i, i2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300);
        animatorSet.playTogether(new Animator[]{ofInt, I});
        animatorSet.addListener(new n33(2));
        animatorSet.start();
    }

    public String toString() {
        switch (this.a) {
            case 25:
                Throwable th = (Throwable) this.c;
                String stackTraceToString = th != null ? ExceptionsKt.stackTraceToString(th) : null;
                return "ThreadDump(threadsCount=" + ((Map) this.b) + ", allStackTraces=" + stackTraceToString + ")";
            default:
                return super.toString();
        }
    }

    public void u(int i, int i2, int i3, int i4, boolean z, he heVar, View view, View view2, View view3, Chronometer chronometer, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        IntEvaluator intEvaluator = new IntEvaluator();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        View view4 = view3;
        ofFloat.addUpdateListener(new dbc(z2, view, intEvaluator, i, i2, view2, i3, i4, view4, chronometer, z));
        ofFloat.addListener(new th(this, z, chronometer, view2, view4, view));
        heVar.getClass();
        IntEvaluator intEvaluator2 = new IntEvaluator();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        ofFloat2.addUpdateListener(new kbc(heVar, z2, intEvaluator2, i, i2, z));
        ofFloat2.addListener(new dg5(heVar, z, ofFloat2, 2));
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.setDuration(300);
        animatorSet.start();
    }

    public void v(Object obj, String str) {
        obj.getClass();
        ((HashMap) this.b).put(str, obj);
        ((ArrayList) this.c).remove(str);
    }

    public void w() {
        int[] iArr = (int[]) this.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.c = null;
    }

    public et1 x() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AE_STATE);
        et1 et1 = et1.a;
        if (num == null) {
            return et1;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return et1.b;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return et1.v;
            }
            if (intValue == 3) {
                return et1.w;
            }
            if (intValue == 4) {
                return et1.o;
            }
            if (intValue != 5) {
                return et1;
            }
        }
        return et1.c;
    }

    public dyd y(ha7 ha7) {
        a9f a9f;
        if (ha7 == null) {
            return null;
        }
        if (((qvb) this.c) == null) {
            a9f = a9f.b;
        } else {
            qvb qvb = (qvb) this.c;
            Pair pair = new Pair(qvb.g, qvb.h.get(0));
            a9f a9f2 = a9f.b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            a9f = new a9f(arrayMap);
        }
        this.c = null;
        return new dyd(ha7, new android.util.Size(ha7.getWidth(), ha7.getHeight()), new jt1(new no5(ha7.getImageInfo().getTimestamp(), (Object) null, a9f)));
    }

    public void z(EGLDisplay eGLDisplay) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.c;
            if (i < arrayList.size()) {
                ld8.v((EGLContext) arrayList.get(i), eGLDisplay);
                i++;
            } else {
                return;
            }
        }
    }

    public /* synthetic */ npg(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ npg(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ npg(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public npg(zqd zqd) {
        this.a = 7;
        this.b = (String) zqd.b;
        this.c = (lq8) zqd.c;
    }

    public npg(i6d i6d, int i) {
        this.a = i;
        switch (i) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                this.b = i6d;
                this.c = Collections.newSetFromMap(new IdentityHashMap());
                return;
            default:
                this.b = i6d;
                this.c = new mpg(i6d, 0);
                return;
        }
    }

    public npg(Context context, int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = context;
                this.c = LazyKt.lazy(LazyThreadSafetyMode.NONE, new j6(23, this));
                return;
            case 16:
                this.c = null;
                this.b = context;
                return;
            default:
                this.b = context.getApplicationContext();
                this.c = "ActivityThemer";
                return;
        }
    }

    public npg(ov1 ov1) {
        this.a = 6;
        this.b = ov1;
        u08 u08 = new u08();
        this.c = u08;
        u08.i(new fa0(5, (ga0) null));
    }

    public npg(int i) {
        this.a = i;
        switch (i) {
            case 10:
                this.b = EGL14.EGL_NO_CONTEXT;
                this.c = new ArrayList();
                return;
            case 19:
                Lazy lazy = rjd.N;
                this.b = LazyKt.lazy(new ur());
                this.c = lazy;
                return;
            default:
                this.b = new HashMap();
                this.c = new ArrayList();
                return;
        }
    }

    public npg(do1 do1) {
        this.a = 13;
        tj6 tj6 = hd8.d;
        this.b = do1;
        this.c = tj6;
    }

    public npg(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 14;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public npg(int i, int i2) {
        this.a = 14;
        this.b = new int[]{i, i2};
        this.c = new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f};
    }

    public npg(int i, int i2, int i3) {
        this.a = 14;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{c44.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};
    }
}
