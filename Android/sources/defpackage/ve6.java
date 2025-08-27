package defpackage;

import android.media.MediaDrm;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ve6  reason: default package */
public final class ve6 implements qb5, rb5 {
    public static final ts1 v = new Object();
    public static final ts1 w = new Object();
    public final /* synthetic */ int a;
    public final UUID b;
    public final MediaDrm c;
    public int o;

    public ve6(UUID uuid, int i) {
        UUID uuid2;
        UUID uuid3;
        this.a = i;
        switch (i) {
            case 1:
                uuid.getClass();
                n79.f("Use C.CLEARKEY_UUID instead", !zw0.b.equals(uuid));
                this.b = uuid;
                MediaDrm mediaDrm = new MediaDrm((v0g.a >= 27 || !zw0.c.equals(uuid)) ? uuid : uuid2);
                this.c = mediaDrm;
                this.o = 1;
                if (zw0.d.equals(uuid) && "ASUS_Z00AD".equals(v0g.d)) {
                    mediaDrm.setPropertyString("securityLevel", "L3");
                    return;
                }
                return;
            default:
                uuid.getClass();
                y64.f("Use C.CLEARKEY_UUID instead", !ww0.b.equals(uuid));
                this.b = uuid;
                MediaDrm mediaDrm2 = new MediaDrm((t0g.a >= 27 || !ww0.c.equals(uuid)) ? uuid : uuid3);
                this.c = mediaDrm2;
                this.o = 1;
                if (ww0.d.equals(uuid) && "ASUS_Z00AD".equals(t0g.d)) {
                    mediaDrm2.setPropertyString("securityLevel", "L3");
                    return;
                }
                return;
        }
    }

    public final Map a(byte[] bArr) {
        switch (this.a) {
            case 0:
                return this.c.queryKeyStatus(bArr);
            default:
                return this.c.queryKeyStatus(bArr);
        }
    }

    public boolean b() {
        return v0g.a < 21 && zw0.d.equals(this.b) && "L3".equals(this.c.getPropertyString("securityLevel"));
    }

    public ob5 c() {
        MediaDrm.ProvisionRequest provisionRequest = this.c.getProvisionRequest();
        return new ob5(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public f44 d(byte[] bArr) {
        int i = t0g.a;
        UUID uuid = this.b;
        boolean z = i < 21 && ww0.d.equals(uuid) && "L3".equals(this.c.getPropertyString("securityLevel"));
        if (i < 27 && ww0.c.equals(uuid)) {
            uuid = ww0.b;
        }
        return new qe6(uuid, bArr, z);
    }

    public final byte[] e() {
        switch (this.a) {
            case 0:
                return this.c.openSession();
            default:
                return this.c.openSession();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(byte[] r7, java.lang.String r8) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x007a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = defpackage.v0g.a
            r1 = 31
            r2 = 0
            java.util.UUID r3 = r6.b
            r4 = 1
            if (r0 < r1) goto L_0x0050
            java.util.UUID r0 = defpackage.zw0.d
            boolean r0 = r3.equals(r0)
            android.media.MediaDrm r1 = r6.c
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "version"
            java.lang.String r0 = r1.getPropertyString(r0)
            java.lang.String r5 = "v5."
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x0041
            java.lang.String r5 = "14."
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x0041
            java.lang.String r5 = "15."
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x0041
            java.lang.String r5 = "16.0"
            boolean r0 = r0.startsWith(r5)
            if (r0 != 0) goto L_0x0041
            r0 = r4
            goto L_0x0049
        L_0x0041:
            r0 = r2
            goto L_0x0049
        L_0x0043:
            java.util.UUID r0 = defpackage.zw0.c
            boolean r0 = r3.equals(r0)
        L_0x0049:
            if (r0 == 0) goto L_0x0050
            boolean r7 = defpackage.ue6.a(r1, r8)
            goto L_0x0070
        L_0x0050:
            r0 = 0
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch:{ MediaCryptoException -> 0x006a, all -> 0x0063 }
            r1.<init>(r3, r7)     // Catch:{ MediaCryptoException -> 0x006a, all -> 0x0063 }
            boolean r7 = r1.requiresSecureDecoderComponent(r8)     // Catch:{ MediaCryptoException -> 0x0061, all -> 0x005e }
            r1.release()
            goto L_0x0070
        L_0x005e:
            r6 = move-exception
            r0 = r1
            goto L_0x0064
        L_0x0061:
            r0 = r1
            goto L_0x006a
        L_0x0063:
            r6 = move-exception
        L_0x0064:
            if (r0 == 0) goto L_0x0069
            r0.release()
        L_0x0069:
            throw r6
        L_0x006a:
            if (r0 == 0) goto L_0x006f
            r0.release()
        L_0x006f:
            r7 = r4
        L_0x0070:
            if (r7 == 0) goto L_0x0079
            boolean r6 = r6.b()
            if (r6 != 0) goto L_0x0079
            r2 = r4
        L_0x0079:
            return r2
        L_0x007a:
            int r0 = defpackage.t0g.a
            r1 = 31
            if (r0 < r1) goto L_0x0087
            android.media.MediaDrm r6 = r6.c
            boolean r6 = defpackage.te6.a(r6, r8)
            goto L_0x009c
        L_0x0087:
            android.media.MediaCrypto r0 = new android.media.MediaCrypto     // Catch:{ MediaCryptoException -> 0x009b }
            java.util.UUID r6 = r6.b     // Catch:{ MediaCryptoException -> 0x009b }
            r0.<init>(r6, r7)     // Catch:{ MediaCryptoException -> 0x009b }
            boolean r6 = r0.requiresSecureDecoderComponent(r8)     // Catch:{ all -> 0x0096 }
            r0.release()
            goto L_0x009c
        L_0x0096:
            r6 = move-exception
            r0.release()
            throw r6
        L_0x009b:
            r6 = 1
        L_0x009c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve6.f(byte[], java.lang.String):boolean");
    }

    public final void g(byte[] bArr, byte[] bArr2) {
        switch (this.a) {
            case 0:
                this.c.restoreKeys(bArr, bArr2);
                return;
            default:
                this.c.restoreKeys(bArr, bArr2);
                return;
        }
    }

    public final void h(byte[] bArr) {
        switch (this.a) {
            case 0:
                this.c.closeSession(bArr);
                return;
            default:
                this.c.closeSession(bArr);
                return;
        }
    }

    public final byte[] i(byte[] bArr, byte[] bArr2) {
        switch (this.a) {
            case 0:
                if (ww0.c.equals(this.b) && t0g.a < 27) {
                    try {
                        JSONObject jSONObject = new JSONObject(t0g.n(bArr2));
                        StringBuilder sb = new StringBuilder("{\"keys\":[");
                        JSONArray jSONArray = jSONObject.getJSONArray("keys");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            if (i != 0) {
                                sb.append(",");
                            }
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            sb.append("{\"k\":\"");
                            sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                            sb.append("\",\"kid\":\"");
                            sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                            sb.append("\",\"kty\":\"");
                            sb.append(jSONObject2.getString("kty"));
                            sb.append("\"}");
                        }
                        sb.append("]}");
                        bArr2 = sb.toString().getBytes(x22.c);
                    } catch (JSONException e) {
                        String n = t0g.n(bArr2);
                        iq.a(n.length() != 0 ? "Failed to adjust response data: ".concat(n) : new String("Failed to adjust response data: "), e);
                    }
                }
                return this.c.provideKeyResponse(bArr, bArr2);
            default:
                if (zw0.c.equals(this.b) && v0g.a < 27) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(v0g.q(bArr2));
                        StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("keys");
                        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                            if (i2 != 0) {
                                sb2.append(",");
                            }
                            JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                            sb2.append("{\"k\":\"");
                            sb2.append(jSONObject4.getString("k").replace('-', '+').replace('_', '/'));
                            sb2.append("\",\"kid\":\"");
                            sb2.append(jSONObject4.getString("kid").replace('-', '+').replace('_', '/'));
                            sb2.append("\",\"kty\":\"");
                            sb2.append(jSONObject4.getString("kty"));
                            sb2.append("\"}");
                        }
                        sb2.append("]}");
                        bArr2 = sb2.toString().getBytes(x22.c);
                    } catch (JSONException e2) {
                        i8b.p("Failed to adjust response data: ".concat(v0g.q(bArr2)), e2);
                    }
                }
                return this.c.provideKeyResponse(bArr, bArr2);
        }
    }

    public final void j(byte[] bArr) {
        switch (this.a) {
            case 0:
                this.c.provideProvisionResponse(bArr);
                return;
            default:
                this.c.provideProvisionResponse(bArr);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0190, code lost:
        if ("AFTT".equals(r6) == false) goto L_0x0199;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.mb5 k(byte[] r16, java.util.List r17, int r18, java.util.HashMap r19) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            r2 = 23
            java.util.UUID r3 = r0.b
            r4 = 0
            if (r1 == 0) goto L_0x01bd
            java.util.UUID r5 = defpackage.ww0.d
            boolean r5 = r5.equals(r3)
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x001c
            java.lang.Object r1 = r1.get(r7)
            vv4 r1 = (defpackage.vv4) r1
            goto L_0x00bb
        L_0x001c:
            int r5 = defpackage.t0g.a
            r8 = 28
            if (r5 < r8) goto L_0x0089
            int r5 = r17.size()
            if (r5 <= r6) goto L_0x0089
            java.lang.Object r5 = r1.get(r7)
            vv4 r5 = (defpackage.vv4) r5
            r8 = r7
            r9 = r8
        L_0x0030:
            int r10 = r17.size()
            if (r8 >= r10) goto L_0x0060
            java.lang.Object r10 = r1.get(r8)
            vv4 r10 = (defpackage.vv4) r10
            byte[] r11 = r10.v
            r11.getClass()
            java.lang.String r12 = r5.o
            java.lang.String r13 = r10.o
            boolean r12 = defpackage.t0g.a(r13, r12)
            if (r12 == 0) goto L_0x0089
            java.lang.String r10 = r10.c
            java.lang.String r12 = r5.c
            boolean r10 = defpackage.t0g.a(r10, r12)
            if (r10 == 0) goto L_0x0089
            z9c r10 = defpackage.ld9.O(r11)
            if (r10 == 0) goto L_0x0089
            int r10 = r11.length
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x0030
        L_0x0060:
            byte[] r8 = new byte[r9]
            r9 = r7
            r10 = r9
        L_0x0064:
            int r11 = r17.size()
            if (r9 >= r11) goto L_0x007d
            java.lang.Object r11 = r1.get(r9)
            vv4 r11 = (defpackage.vv4) r11
            byte[] r11 = r11.v
            r11.getClass()
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r7, r8, r10, r12)
            int r10 = r10 + r12
            int r9 = r9 + 1
            goto L_0x0064
        L_0x007d:
            vv4 r1 = new vv4
            java.lang.String r9 = r5.c
            java.lang.String r10 = r5.o
            java.util.UUID r5 = r5.b
            r1.<init>(r5, r9, r10, r8)
            goto L_0x00bb
        L_0x0089:
            r5 = r7
        L_0x008a:
            int r8 = r17.size()
            if (r5 >= r8) goto L_0x00b5
            java.lang.Object r8 = r1.get(r5)
            vv4 r8 = (defpackage.vv4) r8
            byte[] r9 = r8.v
            r9.getClass()
            z9c r9 = defpackage.ld9.O(r9)
            if (r9 != 0) goto L_0x00a3
            r9 = -1
            goto L_0x00a5
        L_0x00a3:
            int r9 = r9.b
        L_0x00a5:
            int r10 = defpackage.t0g.a
            if (r10 >= r2) goto L_0x00ad
            if (r9 != 0) goto L_0x00ad
        L_0x00ab:
            r1 = r8
            goto L_0x00bb
        L_0x00ad:
            if (r10 < r2) goto L_0x00b2
            if (r9 != r6) goto L_0x00b2
            goto L_0x00ab
        L_0x00b2:
            int r5 = r5 + 1
            goto L_0x008a
        L_0x00b5:
            java.lang.Object r1 = r1.get(r7)
            vv4 r1 = (defpackage.vv4) r1
        L_0x00bb:
            byte[] r5 = r1.v
            r5.getClass()
            java.util.UUID r8 = defpackage.ww0.e
            boolean r9 = r8.equals(r3)
            r10 = 26
            if (r9 == 0) goto L_0x0154
            byte[] r9 = defpackage.ld9.P(r3, r5)
            if (r9 != 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r5 = r9
        L_0x00d2:
            g1g r9 = new g1g
            r9.<init>((byte[]) r5)
            int r11 = r9.j()
            short r12 = r9.l()
            short r13 = r9.l()
            if (r12 != r6) goto L_0x0150
            if (r13 == r6) goto L_0x00e8
            goto L_0x0150
        L_0x00e8:
            short r6 = r9.l()
            java.nio.charset.Charset r14 = defpackage.x22.e
            java.lang.String r6 = r9.t(r6, r14)
            java.lang.String r9 = "<LA_URL>"
            boolean r9 = r6.contains(r9)
            if (r9 == 0) goto L_0x00fb
            goto L_0x0150
        L_0x00fb:
            java.lang.String r5 = "</DATA>"
            int r5 = r6.indexOf(r5)
            java.lang.String r7 = r6.substring(r7, r5)
            java.lang.String r5 = r6.substring(r5)
            int r6 = defpackage.g63.f(r10, r7)
            int r6 = defpackage.g63.f(r6, r5)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            r9.append(r7)
            java.lang.String r6 = "<LA_URL>https://x</LA_URL>"
            r9.append(r6)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            int r11 = r11 + 52
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r11)
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.order(r7)
            r6.putInt(r11)
            short r7 = (short) r12
            r6.putShort(r7)
            short r7 = (short) r13
            r6.putShort(r7)
            int r7 = r5.length()
            int r7 = r7 * 2
            short r7 = (short) r7
            r6.putShort(r7)
            byte[] r5 = r5.getBytes(r14)
            r6.put(r5)
            byte[] r5 = r6.array()
        L_0x0150:
            byte[] r5 = defpackage.ld9.j(r8, r4, r5)
        L_0x0154:
            int r4 = defpackage.t0g.a
            if (r4 >= r2) goto L_0x0160
            java.util.UUID r6 = defpackage.ww0.d
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x0192
        L_0x0160:
            boolean r6 = r8.equals(r3)
            if (r6 == 0) goto L_0x0199
            java.lang.String r6 = "Amazon"
            java.lang.String r7 = defpackage.t0g.c
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0199
            java.lang.String r6 = defpackage.t0g.d
            java.lang.String r7 = "AFTB"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x0192
            java.lang.String r7 = "AFTS"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x0192
            java.lang.String r7 = "AFTM"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x0192
            java.lang.String r7 = "AFTT"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0199
        L_0x0192:
            byte[] r6 = defpackage.ld9.P(r3, r5)
            if (r6 == 0) goto L_0x0199
            r5 = r6
        L_0x0199:
            java.lang.String r6 = r1.o
            if (r4 >= r10) goto L_0x01b8
            java.util.UUID r4 = defpackage.ww0.c
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x01b8
            java.lang.String r4 = "video/mp4"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x01b5
            java.lang.String r4 = "audio/mp4"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x01b8
        L_0x01b5:
            java.lang.String r4 = "cenc"
            goto L_0x01b9
        L_0x01b8:
            r4 = r6
        L_0x01b9:
            r9 = r4
            r8 = r5
            r4 = r1
            goto L_0x01bf
        L_0x01bd:
            r8 = r4
            r9 = r8
        L_0x01bf:
            android.media.MediaDrm r6 = r0.c
            r7 = r16
            r10 = r18
            r11 = r19
            android.media.MediaDrm$KeyRequest r0 = r6.getKeyRequest(r7, r8, r9, r10, r11)
            byte[] r1 = r0.getData()
            java.util.UUID r5 = defpackage.ww0.c
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x01f8
            int r3 = defpackage.t0g.a
            r5 = 27
            if (r3 < r5) goto L_0x01de
            goto L_0x01f8
        L_0x01de:
            java.lang.String r1 = defpackage.t0g.n(r1)
            r3 = 43
            r5 = 45
            java.lang.String r1 = r1.replace(r3, r5)
            r3 = 47
            r5 = 95
            java.lang.String r1 = r1.replace(r3, r5)
            java.nio.charset.Charset r3 = defpackage.x22.c
            byte[] r1 = r1.getBytes(r3)
        L_0x01f8:
            java.lang.String r3 = r0.getDefaultUrl()
            java.lang.String r5 = "https://x"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0206
            java.lang.String r3 = ""
        L_0x0206:
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x0217
            if (r4 == 0) goto L_0x0217
            java.lang.String r4 = r4.c
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x0217
            r3 = r4
        L_0x0217:
            int r4 = defpackage.t0g.a
            if (r4 < r2) goto L_0x021e
            r0.getRequestType()
        L_0x021e:
            mb5 r0 = new mb5
            r0.<init>(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve6.k(byte[], java.util.List, int, java.util.HashMap):mb5");
    }

    public final int l() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 2;
        }
    }

    public void n(b8d b8d) {
        this.c.setOnEventListener(new se6(1, this, b8d));
    }

    public void o(byte[] bArr, lpb lpb) {
        if (t0g.a >= 31) {
            te6.b(this.c, bArr, lpb);
        }
    }

    public void p(byte[] bArr, mpb mpb) {
        if (v0g.a >= 31) {
            try {
                ue6.b(this.c, bArr, mpb);
            } catch (UnsupportedOperationException unused) {
                i8b.V("setLogSessionId failed.");
            }
        }
    }

    public void q(u6h u6h) {
        this.c.setOnEventListener(new se6(0, this, u6h));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void release() {
        /*
            r1 = this;
            int r0 = r1.a
            monitor-enter(r1)
            switch(r0) {
                case 0: goto L_0x001a;
                default: goto L_0x0006;
            }
        L_0x0006:
            int r0 = r1.o     // Catch:{ all -> 0x0014 }
            int r0 = r0 + -1
            r1.o = r0     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0016
            android.media.MediaDrm r0 = r1.c     // Catch:{ all -> 0x0014 }
            r0.release()     // Catch:{ all -> 0x0014 }
            goto L_0x0016
        L_0x0014:
            r0 = move-exception
            goto L_0x0018
        L_0x0016:
            monitor-exit(r1)
            return
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            throw r0
        L_0x001a:
            int r0 = r1.o     // Catch:{ all -> 0x0028 }
            int r0 = r0 + -1
            r1.o = r0     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x002a
            android.media.MediaDrm r0 = r1.c     // Catch:{ all -> 0x0028 }
            r0.release()     // Catch:{ all -> 0x0028 }
            goto L_0x002a
        L_0x0028:
            r0 = move-exception
            goto L_0x002c
        L_0x002a:
            monitor-exit(r1)
            return
        L_0x002c:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve6.release():void");
    }

    /* renamed from: c  reason: collision with other method in class */
    public pb5 m1535c() {
        MediaDrm.ProvisionRequest provisionRequest = this.c.getProvisionRequest();
        return new pb5(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /* renamed from: d  reason: collision with other method in class */
    public g44 m1536d(byte[] bArr) {
        b();
        int i = v0g.a;
        UUID uuid = this.b;
        if (i < 27 && zw0.c.equals(uuid)) {
            uuid = zw0.b;
        }
        return new re6(uuid, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0231, code lost:
        if (java.util.Objects.equals(r0, "aidl-1") == false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0195, code lost:
        if ("AFTT".equals(r7) == false) goto L_0x019e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01bf  */
    /* renamed from: k  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.nb5 m1537k(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.String r2 = "<LA_URL>https://x</LA_URL>"
            r3 = 23
            java.util.UUID r4 = r0.b
            r5 = 0
            if (r1 == 0) goto L_0x01c4
            java.util.UUID r6 = defpackage.zw0.d
            boolean r6 = r6.equals(r4)
            r7 = 1
            r8 = -1
            r9 = 0
            if (r6 != 0) goto L_0x0020
            java.lang.Object r1 = r1.get(r9)
            wv4 r1 = (defpackage.wv4) r1
            goto L_0x00bf
        L_0x0020:
            int r6 = defpackage.v0g.a
            r10 = 28
            if (r6 < r10) goto L_0x008d
            int r6 = r18.size()
            if (r6 <= r7) goto L_0x008d
            java.lang.Object r6 = r1.get(r9)
            wv4 r6 = (defpackage.wv4) r6
            r10 = r9
            r11 = r10
        L_0x0034:
            int r12 = r18.size()
            if (r10 >= r12) goto L_0x0064
            java.lang.Object r12 = r1.get(r10)
            wv4 r12 = (defpackage.wv4) r12
            byte[] r13 = r12.v
            r13.getClass()
            java.lang.String r14 = r6.o
            java.lang.String r15 = r12.o
            boolean r14 = defpackage.v0g.a(r15, r14)
            if (r14 == 0) goto L_0x008d
            java.lang.String r12 = r12.c
            java.lang.String r14 = r6.c
            boolean r12 = defpackage.v0g.a(r12, r14)
            if (r12 == 0) goto L_0x008d
            z9c r12 = defpackage.m5a.N(r13)
            if (r12 == 0) goto L_0x008d
            int r12 = r13.length
            int r11 = r11 + r12
            int r10 = r10 + 1
            goto L_0x0034
        L_0x0064:
            byte[] r10 = new byte[r11]
            r11 = r9
            r12 = r11
        L_0x0068:
            int r13 = r18.size()
            if (r11 >= r13) goto L_0x0081
            java.lang.Object r13 = r1.get(r11)
            wv4 r13 = (defpackage.wv4) r13
            byte[] r13 = r13.v
            r13.getClass()
            int r14 = r13.length
            java.lang.System.arraycopy(r13, r9, r10, r12, r14)
            int r12 = r12 + r14
            int r11 = r11 + 1
            goto L_0x0068
        L_0x0081:
            wv4 r1 = new wv4
            java.lang.String r11 = r6.c
            java.lang.String r12 = r6.o
            java.util.UUID r6 = r6.b
            r1.<init>(r6, r11, r12, r10)
            goto L_0x00bf
        L_0x008d:
            r6 = r9
        L_0x008e:
            int r10 = r18.size()
            if (r6 >= r10) goto L_0x00b9
            java.lang.Object r10 = r1.get(r6)
            wv4 r10 = (defpackage.wv4) r10
            byte[] r11 = r10.v
            r11.getClass()
            z9c r11 = defpackage.m5a.N(r11)
            if (r11 != 0) goto L_0x00a7
            r11 = r8
            goto L_0x00a9
        L_0x00a7:
            int r11 = r11.b
        L_0x00a9:
            int r12 = defpackage.v0g.a
            if (r12 >= r3) goto L_0x00b1
            if (r11 != 0) goto L_0x00b1
        L_0x00af:
            r1 = r10
            goto L_0x00bf
        L_0x00b1:
            if (r12 < r3) goto L_0x00b6
            if (r11 != r7) goto L_0x00b6
            goto L_0x00af
        L_0x00b6:
            int r6 = r6 + 1
            goto L_0x008e
        L_0x00b9:
            java.lang.Object r1 = r1.get(r9)
            wv4 r1 = (defpackage.wv4) r1
        L_0x00bf:
            byte[] r6 = r1.v
            r6.getClass()
            java.util.UUID r10 = defpackage.zw0.e
            boolean r11 = r10.equals(r4)
            if (r11 == 0) goto L_0x0159
            byte[] r11 = defpackage.m5a.O(r4, r6)
            if (r11 != 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r6 = r11
        L_0x00d4:
            l8b r11 = new l8b
            r11.<init>((byte[]) r6)
            int r12 = r11.i()
            short r13 = r11.k()
            short r14 = r11.k()
            if (r13 != r7) goto L_0x0150
            if (r14 == r7) goto L_0x00ea
            goto L_0x0150
        L_0x00ea:
            short r7 = r11.k()
            java.nio.charset.Charset r15 = defpackage.x22.e
            java.lang.String r7 = r11.s(r7, r15)
            java.lang.String r11 = "<LA_URL>"
            boolean r11 = r7.contains(r11)
            if (r11 == 0) goto L_0x00fd
            goto L_0x0155
        L_0x00fd:
            java.lang.String r6 = "</DATA>"
            int r6 = r7.indexOf(r6)
            if (r6 != r8) goto L_0x010a
            java.lang.String r8 = "Could not find the </DATA> tag. Skipping LA_URL workaround."
            defpackage.i8b.V(r8)
        L_0x010a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r7.substring(r9, r6)
            r8.append(r9)
            r8.append(r2)
            java.lang.String r6 = r7.substring(r6)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            int r12 = r12 + 52
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r12)
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            r7.order(r8)
            r7.putInt(r12)
            short r8 = (short) r13
            r7.putShort(r8)
            short r8 = (short) r14
            r7.putShort(r8)
            int r8 = r6.length()
            int r8 = r8 * 2
            short r8 = (short) r8
            r7.putShort(r8)
            byte[] r6 = r6.getBytes(r15)
            r7.put(r6)
            byte[] r6 = r7.array()
            goto L_0x0155
        L_0x0150:
            java.lang.String r7 = "Unexpected record count or type. Skipping LA_URL workaround."
            defpackage.i8b.F(r7)
        L_0x0155:
            byte[] r6 = defpackage.m5a.h(r10, r5, r6)
        L_0x0159:
            int r5 = defpackage.v0g.a
            if (r5 >= r3) goto L_0x0165
            java.util.UUID r7 = defpackage.zw0.d
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0197
        L_0x0165:
            boolean r7 = r10.equals(r4)
            if (r7 == 0) goto L_0x019e
            java.lang.String r7 = "Amazon"
            java.lang.String r8 = defpackage.v0g.c
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x019e
            java.lang.String r7 = defpackage.v0g.d
            java.lang.String r8 = "AFTB"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0197
            java.lang.String r8 = "AFTS"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0197
            java.lang.String r8 = "AFTM"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0197
            java.lang.String r8 = "AFTT"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x019e
        L_0x0197:
            byte[] r7 = defpackage.m5a.O(r4, r6)
            if (r7 == 0) goto L_0x019e
            r6 = r7
        L_0x019e:
            r7 = 26
            java.lang.String r8 = r1.o
            if (r5 >= r7) goto L_0x01bf
            java.util.UUID r5 = defpackage.zw0.c
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x01bf
            java.lang.String r5 = "video/mp4"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x01bc
            java.lang.String r5 = "audio/mp4"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x01bf
        L_0x01bc:
            java.lang.String r5 = "cenc"
            goto L_0x01c0
        L_0x01bf:
            r5 = r8
        L_0x01c0:
            r10 = r5
            r9 = r6
            r5 = r1
            goto L_0x01c6
        L_0x01c4:
            r9 = r5
            r10 = r9
        L_0x01c6:
            android.media.MediaDrm r7 = r0.c
            r8 = r17
            r11 = r19
            r12 = r20
            android.media.MediaDrm$KeyRequest r1 = r7.getKeyRequest(r8, r9, r10, r11, r12)
            byte[] r6 = r1.getData()
            java.util.UUID r7 = defpackage.zw0.c
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x01ff
            int r4 = defpackage.v0g.a
            r7 = 27
            if (r4 < r7) goto L_0x01e5
            goto L_0x01ff
        L_0x01e5:
            java.lang.String r4 = defpackage.v0g.q(r6)
            r6 = 43
            r7 = 45
            java.lang.String r4 = r4.replace(r6, r7)
            r6 = 47
            r7 = 95
            java.lang.String r4 = r4.replace(r6, r7)
            java.nio.charset.Charset r6 = defpackage.x22.c
            byte[] r6 = r4.getBytes(r6)
        L_0x01ff:
            java.lang.String r4 = r1.getDefaultUrl()
            boolean r2 = r2.equals(r4)
            java.lang.String r7 = ""
            if (r2 == 0) goto L_0x020d
        L_0x020b:
            r4 = r7
            goto L_0x0234
        L_0x020d:
            int r2 = defpackage.v0g.a
            r8 = 33
            if (r2 < r8) goto L_0x0234
            java.lang.String r2 = "https://default.url"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0234
            android.media.MediaDrm r0 = r0.c
            java.lang.String r2 = "version"
            java.lang.String r0 = r0.getPropertyString(r2)
            java.lang.String r2 = "1.2"
            boolean r2 = java.util.Objects.equals(r0, r2)
            if (r2 != 0) goto L_0x020b
            java.lang.String r2 = "aidl-1"
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 == 0) goto L_0x0234
            goto L_0x020b
        L_0x0234:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0245
            if (r5 == 0) goto L_0x0245
            java.lang.String r0 = r5.c
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0245
            r4 = r0
        L_0x0245:
            int r0 = defpackage.v0g.a
            if (r0 < r3) goto L_0x024c
            r1.getRequestType()
        L_0x024c:
            nb5 r0 = new nb5
            r0.<init>(r6, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve6.m1537k(byte[], java.util.List, int, java.util.HashMap):nb5");
    }
}
