package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Pair;
import android.util.Size;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.text.Charsets;

/* renamed from: tgg  reason: default package */
public final class tgg implements urg, hgd {
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ tgg(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public static void y(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public boolean A(int i) {
        return ((mrf) ((ArrayList) this.a).get(i)).a.size() > 1;
    }

    public void a(TotalCaptureResult totalCaptureResult) {
        if (((do1) this.c) != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = (Rect) this.o;
            if (rect2 != null && rect2.equals(rect)) {
                ((do1) this.c).b((Object) null);
                this.c = null;
                this.o = null;
            }
        }
    }

    public sq9 b() {
        return (sq9) this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0039, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003a, code lost:
        kotlin.io.CloseableKt.closeFinally(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            r2 = this;
            java.lang.String r0 = "w"
            java.io.OutputStream r3 = r3.openOutputStream(r4, r0)
            if (r3 == 0) goto L_0x003e
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0030 }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x0030 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0030 }
            r4.<init>(r2)     // Catch:{ all -> 0x0030 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0024 }
            int r0 = r4.read(r2)     // Catch:{ all -> 0x0024 }
        L_0x0019:
            if (r0 <= 0) goto L_0x0026
            r1 = 0
            r3.write(r2, r1, r0)     // Catch:{ all -> 0x0024 }
            int r0 = r4.read(r2)     // Catch:{ all -> 0x0024 }
            goto L_0x0019
        L_0x0024:
            r2 = move-exception
            goto L_0x0032
        L_0x0026:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0024 }
            r2 = 0
            kotlin.io.CloseableKt.closeFinally(r4, r2)     // Catch:{ all -> 0x0030 }
            kotlin.io.CloseableKt.closeFinally(r3, r2)
            goto L_0x003e
        L_0x0030:
            r2 = move-exception
            goto L_0x0038
        L_0x0032:
            throw r2     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r4, r2)     // Catch:{ all -> 0x0030 }
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0038:
            throw r2     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r4 = move-exception
            kotlin.io.CloseableKt.closeFinally(r3, r2)
            throw r4
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgg.c(android.content.ContentResolver, android.net.Uri):void");
    }

    public void d(vs6 vs6) {
        Rect rect = (Rect) this.b;
        if (rect != null) {
            vs6.w(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    public float e() {
        Float f = (Float) ((qt1) this.a).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public float f() {
        return 1.0f;
    }

    public Uri g() {
        return (Uri) this.o;
    }

    public Integer getHeight() {
        return null;
    }

    public Integer getWidth() {
        return null;
    }

    public Rect h() {
        Rect rect = (Rect) this.b;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) ((qt1) this.a).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    public String i() {
        return (String) this.a;
    }

    public Integer j() {
        return null;
    }

    public void k(float f, do1 do1) {
        Rect rect = (Rect) ((qt1) this.a).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        float width = ((float) rect.width()) / f;
        float height = ((float) rect.height()) / f;
        float width2 = (((float) rect.width()) - width) / 2.0f;
        float height2 = (((float) rect.height()) - height) / 2.0f;
        this.b = new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
        do1 do12 = (do1) this.c;
        if (do12 != null) {
            do12.d(new Exception("There is a new zoomRatio being set"));
        }
        this.o = (Rect) this.b;
        this.c = do1;
    }

    public void l() {
        this.o = null;
        this.b = null;
        do1 do1 = (do1) this.c;
        if (do1 != null) {
            do1.d(new Exception("Camera is not active."));
            this.c = null;
        }
    }

    public void m(File file) {
        FilesKt__UtilsKt.copyTo$default((File) this.b, file, true, 0, 4, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        if (r1 != null) goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.mqf n(org.json.JSONObject r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            nfd r0 = (defpackage.nfd) r0
            r0.getClass()
            zwd r2 = defpackage.nfd.s(r14)
            java.lang.String r0 = "participantCount"
            r1 = 0
            int r3 = r14.optInt(r0, r1)
            java.lang.String r0 = "addedParticipantIds"
            org.json.JSONArray r0 = r14.optJSONArray(r0)
            java.lang.Object r4 = r13.c
            o60 r4 = (defpackage.o60) r4
            if (r0 == 0) goto L_0x0023
            java.util.ArrayList r0 = r4.b(r0)
            goto L_0x0027
        L_0x0023:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0027:
            java.lang.String r5 = "removedParticipantMarkers"
            org.json.JSONArray r5 = r14.optJSONArray(r5)
            r6 = 0
            if (r5 == 0) goto L_0x007e
            r4.getClass()
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            int r8 = r5.length()
        L_0x003c:
            if (r1 >= r8) goto L_0x0076
            org.json.JSONObject r9 = r5.getJSONObject(r1)
            java.lang.String r10 = "GRID"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ JSONException -> 0x0057 }
            if (r10 != 0) goto L_0x004c
        L_0x004a:
            r9 = r6
            goto L_0x006e
        L_0x004c:
            java.lang.String r11 = "id"
            java.lang.String r10 = r10.getString(r11)     // Catch:{ JSONException -> 0x0057 }
            ue1 r9 = defpackage.ue1.a(r10)     // Catch:{ JSONException -> 0x0057 }
            goto L_0x006e
        L_0x0057:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Can't parse id from "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            java.lang.String r11 = "ParticipantParser"
            voc r12 = r4.a
            r12.logException(r11, r9, r10)
            goto L_0x004a
        L_0x006e:
            if (r9 == 0) goto L_0x0073
            r7.add(r9)
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x003c
        L_0x0076:
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r7)
            if (r1 == 0) goto L_0x007e
        L_0x007c:
            r7 = r1
            goto L_0x0083
        L_0x007e:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x007c
        L_0x0083:
            java.lang.String r1 = "addedParticipants"
            org.json.JSONArray r14 = r14.optJSONArray(r1)
            if (r14 == 0) goto L_0x0095
            java.lang.Object r13 = r13.o
            qpg r13 = (defpackage.qpg) r13
            w8b r13 = r13.q(r14, r2)
            r5 = r13
            goto L_0x0096
        L_0x0095:
            r5 = r6
        L_0x0096:
            mqf r13 = new mqf
            r1 = r13
            r4 = r0
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgg.n(org.json.JSONObject):mqf");
    }

    public void o(qca qca) {
        IconCompat a2 = qca.a();
        Icon icon = null;
        if (a2 != null) {
            icon = v67.d(a2, (Context) null);
        }
        Notification.Action.Builder a3 = zda.a(icon, qca.i, qca.j);
        a1d[] a1dArr = qca.c;
        if (a1dArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[a1dArr.length];
            for (int i = 0; i < a1dArr.length; i++) {
                remoteInputArr[i] = a1d.a(a1dArr[i]);
            }
            for (RemoteInput c2 : remoteInputArr) {
                xda.c(a3, c2);
            }
        }
        Bundle bundle = qca.a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z = qca.d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        int i2 = Build.VERSION.SDK_INT;
        aea.a(a3, z);
        int i3 = qca.f;
        bundle2.putInt("android.support.action.semanticAction", i3);
        cea.b(a3, i3);
        dea.c(a3, qca.g);
        if (i2 >= 31) {
            eea.a(a3, qca.k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", qca.e);
        xda.b(a3, bundle2);
        xda.a((Notification.Builder) this.b, xda.d(a3));
    }

    public ArrayList p(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        y(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        y(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ll0 ll0 = (ll0) list.get(i);
            if (!hashMap.containsKey(ll0.b) && !hashMap2.containsKey(Integer.valueOf(ll0.c))) {
                arrayList.add(ll0);
            }
        }
        return arrayList;
    }

    public m7f q() {
        try {
            return new m7f(this);
        } finally {
            y33.U((y33) this.c);
            this.c = null;
            y33.V((ArrayList) this.o);
            this.o = null;
        }
    }

    public String r(String str) {
        byte[] decode = Base64.decode(str, 0);
        t().init(2, u(), new IvParameterSpec(ArraysKt.copyOfRange(decode, 0, t().getBlockSize())));
        return new String(t().doFinal(ArraysKt.copyOfRange(decode, t().getBlockSize(), decode.length)), Charsets.UTF_8);
    }

    public String s(String str) {
        t().init(1, u());
        byte[] doFinal = t().doFinal(str.getBytes(Charsets.UTF_8));
        byte[] iv = t().getIV();
        byte[] bArr = new byte[(iv.length + doFinal.length)];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(doFinal, 0, bArr, iv.length, doFinal.length);
        return Base64.encodeToString(bArr, 0);
    }

    public Cipher t() {
        return (Cipher) ((Lazy) this.o).getValue();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.security.KeyStore$Entry] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public javax.crypto.SecretKey u() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            java.security.KeyStore r0 = (java.security.KeyStore) r0
            java.lang.Object r3 = r3.a
            java.lang.String r3 = (java.lang.String) r3
            r1 = 0
            java.security.KeyStore$Entry r0 = r0.getEntry(r3, r1)
            boolean r2 = r0 instanceof java.security.KeyStore.SecretKeyEntry
            if (r2 == 0) goto L_0x001a
            r1 = r0
            java.security.KeyStore$SecretKeyEntry r1 = (java.security.KeyStore.SecretKeyEntry) r1
        L_0x001a:
            if (r1 == 0) goto L_0x0022
            javax.crypto.SecretKey r0 = r1.getSecretKey()
            if (r0 != 0) goto L_0x0059
        L_0x0022:
            android.security.keystore.KeyGenParameterSpec$Builder r0 = new android.security.keystore.KeyGenParameterSpec$Builder
            r1 = 3
            r0.<init>(r3, r1)
            java.lang.String r3 = "CBC"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r0.setBlockModes(r3)
            java.lang.String r0 = "PKCS7Padding"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setEncryptionPaddings(r0)
            r0 = 0
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setUserAuthenticationRequired(r0)
            r0 = 1
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setRandomizedEncryptionRequired(r0)
            android.security.keystore.KeyGenParameterSpec r3 = r3.build()
            java.lang.String r0 = "AES"
            java.lang.String r1 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0, r1)
            r0.init(r3)
            javax.crypto.SecretKey r0 = r0.generateKey()
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgg.u():javax.crypto.SecretKey");
    }

    public Size[] v(int i) {
        HashMap hashMap = (HashMap) this.c;
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            Size[] outputSizes = ((StreamConfigurationMap) ((nob) this.a).a).getOutputSizes(i);
            if (outputSizes == null || outputSizes.length == 0) {
                return outputSizes;
            }
            Size[] H = ((wsb) this.b).H(outputSizes, i);
            hashMap.put(Integer.valueOf(i), H);
            return (Size[]) H.clone();
        } else if (((Size[]) hashMap.get(Integer.valueOf(i))) == null) {
            return null;
        } else {
            return (Size[]) ((Size[]) hashMap.get(Integer.valueOf(i))).clone();
        }
    }

    public boolean w() {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.a;
            if (i >= arrayList.size()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    mrf mrf = (mrf) arrayList.get(i2);
                    if (mrf.b != mrf.a.size()) {
                        return false;
                    }
                }
                return true;
            } else if (((mrf) arrayList.get(i)).b == -1) {
                return false;
            } else {
                i++;
            }
        }
    }

    public void x(int i, dcd dcd) {
        SparseArray sparseArray = (SparseArray) this.b;
        n79.m("Exactly one SampleExporter can be added for each track type.", !v0g.l(sparseArray, i));
        sparseArray.put(i, dcd);
    }

    public ll0 z(List list) {
        ArrayList p = p(list);
        if (p.size() < 2) {
            return (ll0) b0h.v(p, (Object) null);
        }
        Collections.sort(p, new v00(3));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((ll0) p.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= p.size()) {
                break;
            }
            ll0 ll0 = (ll0) p.get(i3);
            if (i2 == ll0.c) {
                arrayList.add(new Pair(ll0.b, Integer.valueOf(ll0.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (ll0) p.get(0);
            }
        }
        HashMap hashMap = (HashMap) this.c;
        ll0 ll02 = (ll0) hashMap.get(arrayList);
        if (ll02 == null) {
            List subList = p.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < subList.size(); i5++) {
                i4 += ((ll0) subList.get(i5)).d;
            }
            int nextInt = ((Random) this.o).nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i >= subList.size()) {
                    ll02 = (ll0) b0h.w(subList);
                    break;
                }
                ll0 ll03 = (ll0) subList.get(i);
                i6 += ll03.d;
                if (nextInt < i6) {
                    ll02 = ll03;
                    break;
                }
                i++;
            }
            hashMap.put(arrayList, ll02);
        }
        return ll02;
    }

    public tgg(int i) {
        switch (i) {
            case 4:
                this.b = null;
                this.c = new ArrayList();
                this.o = null;
                this.a = "";
                return;
            default:
                Random random = new Random();
                this.c = new HashMap();
                this.o = random;
                this.a = new HashMap();
                this.b = new HashMap();
                return;
        }
    }
}
