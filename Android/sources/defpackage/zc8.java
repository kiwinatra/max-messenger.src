package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.apache.http.util.LangUtils;

/* renamed from: zc8  reason: default package */
public final /* synthetic */ class zc8 implements zi6, sm0, qk3, co8, do8, i08, vp8, iv0, yi6 {
    public final /* synthetic */ int a;

    public /* synthetic */ zc8(int i) {
        this.a = i;
    }

    public int a(Object obj) {
        switch (this.a) {
            case 11:
                String str = ((nn8) obj).a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (t0g.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            case 12:
                String str2 = ((on8) obj).a;
                if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                    return 1;
                }
                return (v0g.a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            case 13:
                return ((nn8) obj).a.startsWith("OMX.google") ? 1 : 0;
            default:
                return ((on8) obj).a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    public void accept(Object obj) {
        z68.f("fd8", "Got error on chat invalidation", (Throwable) obj);
    }

    public Object apply(Object obj, Object obj2) {
        cd8 cd8 = (cd8) obj;
        ed8 ed8 = (ed8) obj2;
        dd8 dd8 = ed8.a;
        List list = ed8.b;
        synchronized (cd8) {
            cd8.a.add(dd8);
            ArrayList arrayList = new ArrayList(cd8.b);
            arrayList.addAll(tld.c(arrayList, list));
            arrayList.sort(new oj4(12));
            cd8.b = arrayList;
        }
        return cd8;
    }

    public Object b() {
        switch (this.a) {
            case 7:
                return new sf8();
            case 8:
                return new fv1();
            case 9:
                return new kqb();
            default:
                return new a13();
        }
    }

    public void c(np8 np8) {
        switch (this.a) {
            case 16:
                wj6.t(np8);
                throw null;
            case LangUtils.HASH_SEED:
                if (np8.isConnected()) {
                    qo8 qo8 = np8.a;
                    qo8.getClass();
                    n79.n(Looper.myLooper() == qo8.v.getLooper());
                    qo8.o.getClass();
                    return;
                }
                return;
            case 18:
                np8.h.m(26, new lw4(13));
                return;
            case 19:
                qo8 qo82 = np8.a;
                Objects.requireNonNull(qo82);
                qo82.H0(new y86(24, (Object) qo82));
                return;
            case 20:
                wj6.t(np8);
                throw null;
            case 21:
                if (np8.isConnected()) {
                    qo8 qo83 = np8.a;
                    qo83.getClass();
                    n79.n(Looper.myLooper() == qo83.v.getLooper());
                    qo83.o.getClass();
                    return;
                }
                return;
            default:
                if (np8.isConnected()) {
                    qo8 qo84 = np8.a;
                    qo84.getClass();
                    n79.n(Looper.myLooper() == qo84.v.getLooper());
                    qo84.o.getClass();
                    return;
                }
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v122, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r0v24, types: [rs8, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.jv0 h(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r0 = r0.a
            switch(r0) {
                case 23: goto L_0x031d;
                case 24: goto L_0x02be;
                case 25: goto L_0x027b;
                default: goto L_0x0009;
            }
        L_0x0009:
            rs8 r0 = new rs8
            r0.<init>()
            r2 = 0
            r3 = 36
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.a = r2
            r2 = 1
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.b = r2
            r2 = 2
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.c = r2
            r2 = 3
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.d = r2
            r2 = 4
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.e = r2
            r2 = 5
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.f = r2
            r2 = 6
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.g = r2
            r2 = 7
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Parcelable r2 = r1.getParcelable(r2)
            android.net.Uri r2 = (android.net.Uri) r2
            r0.h = r2
            r2 = 10
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            byte[] r2 = r1.getByteArray(r2)
            r4 = 29
            java.lang.String r5 = java.lang.Integer.toString(r4, r3)
            boolean r5 = r1.containsKey(r5)
            r6 = 0
            if (r5 == 0) goto L_0x008e
            java.lang.String r4 = java.lang.Integer.toString(r4, r3)
            int r4 = r1.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x008f
        L_0x008e:
            r4 = r6
        L_0x008f:
            if (r2 != 0) goto L_0x0092
            goto L_0x0099
        L_0x0092:
            java.lang.Object r2 = r2.clone()
            r6 = r2
            byte[] r6 = (byte[]) r6
        L_0x0099:
            r0.k = r6
            r0.l = r4
            r2 = 11
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Parcelable r2 = r1.getParcelable(r2)
            android.net.Uri r2 = (android.net.Uri) r2
            r0.m = r2
            r2 = 22
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.x = r2
            r2 = 23
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.y = r2
            r2 = 24
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.z = r2
            r2 = 27
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.C = r2
            r2 = 28
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.D = r2
            r2 = 30
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.E = r2
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Bundle r2 = r1.getBundle(r2)
            r0.F = r2
            r2 = 8
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            qbb r5 = defpackage.qpc.a
            if (r4 == 0) goto L_0x011f
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Bundle r2 = r1.getBundle(r2)
            if (r2 == 0) goto L_0x011f
            jv0 r2 = r5.h(r2)
            qpc r2 = (defpackage.qpc) r2
            r0.i = r2
        L_0x011f:
            r2 = 9
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x013d
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Bundle r2 = r1.getBundle(r2)
            if (r2 == 0) goto L_0x013d
            jv0 r2 = r5.h(r2)
            qpc r2 = (defpackage.qpc) r2
            r0.j = r2
        L_0x013d:
            r2 = 12
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0157
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.n = r2
        L_0x0157:
            r2 = 13
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0171
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.o = r2
        L_0x0171:
            r2 = 14
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x018b
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.p = r2
        L_0x018b:
            r2 = 15
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x01a5
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            boolean r2 = r1.getBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.q = r2
        L_0x01a5:
            r2 = 16
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x01bf
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.r = r2
        L_0x01bf:
            r2 = 17
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x01d9
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.s = r2
        L_0x01d9:
            r2 = 18
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x01f3
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.t = r2
        L_0x01f3:
            r2 = 19
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x020d
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.u = r2
        L_0x020d:
            r2 = 20
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0227
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.v = r2
        L_0x0227:
            r2 = 21
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0241
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.w = r2
        L_0x0241:
            r2 = 25
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x025b
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.A = r2
        L_0x025b:
            r2 = 26
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0275
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r1 = r1.getInt(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.B = r1
        L_0x0275:
            ts8 r1 = new ts8
            r1.<init>(r0)
            return r1
        L_0x027b:
            vq8 r0 = new vq8
            r2 = 0
            r3 = 36
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = r1.getLong(r2, r4)
            r2 = 1
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            long r8 = r1.getLong(r2, r4)
            r2 = 2
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            long r10 = r1.getLong(r2, r4)
            r2 = 3
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r12 = r1.getFloat(r2, r4)
            r2 = 4
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            float r1 = r1.getFloat(r2, r4)
            r2 = r0
            r3 = r6
            r5 = r8
            r7 = r10
            r9 = r12
            r10 = r1
            r2.<init>(r3, r5, r7, r9, r10)
            return r0
        L_0x02be:
            oq8 r0 = new oq8
            r0.<init>()
            r2 = 0
            r3 = 36
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            r5 = 0
            long r7 = r1.getLong(r4, r5)
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r9 = 1
            if (r4 < 0) goto L_0x02d7
            r4 = r9
            goto L_0x02d8
        L_0x02d7:
            r4 = r2
        L_0x02d8:
            defpackage.y64.g(r4)
            r0.a = r7
            java.lang.String r4 = java.lang.Integer.toString(r9, r3)
            r7 = -9223372036854775808
            long r10 = r1.getLong(r4, r7)
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x02f1
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x02f0
            goto L_0x02f1
        L_0x02f0:
            r9 = r2
        L_0x02f1:
            defpackage.y64.g(r9)
            r0.b = r10
            r4 = 2
            java.lang.String r4 = java.lang.Integer.toString(r4, r3)
            boolean r4 = r1.getBoolean(r4, r2)
            r0.c = r4
            r4 = 3
            java.lang.String r4 = java.lang.Integer.toString(r4, r3)
            boolean r4 = r1.getBoolean(r4, r2)
            r0.d = r4
            r4 = 4
            java.lang.String r3 = java.lang.Integer.toString(r4, r3)
            boolean r1 = r1.getBoolean(r3, r2)
            r0.e = r1
            rq8 r1 = new rq8
            r1.<init>(r0)
            return r1
        L_0x031d:
            r0 = 0
            r2 = 36
            java.lang.String r3 = java.lang.Integer.toString(r0, r2)
            java.lang.String r4 = ""
            java.lang.String r6 = r1.getString(r3, r4)
            r6.getClass()
            r3 = 1
            java.lang.String r4 = java.lang.Integer.toString(r3, r2)
            android.os.Bundle r4 = r1.getBundle(r4)
            r5 = 3
            r7 = 2
            if (r4 != 0) goto L_0x033e
            vq8 r0 = defpackage.vq8.w
            r9 = r0
            goto L_0x037c
        L_0x033e:
            vq8 r17 = new vq8
            java.lang.String r0 = java.lang.Integer.toString(r0, r2)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r10 = r4.getLong(r0, r8)
            java.lang.String r0 = java.lang.Integer.toString(r3, r2)
            long r12 = r4.getLong(r0, r8)
            java.lang.String r0 = java.lang.Integer.toString(r7, r2)
            long r14 = r4.getLong(r0, r8)
            java.lang.String r0 = java.lang.Integer.toString(r5, r2)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r0 = r4.getFloat(r0, r3)
            r8 = 4
            java.lang.String r8 = java.lang.Integer.toString(r8, r2)
            float r16 = r4.getFloat(r8, r3)
            r8 = r17
            r9 = r10
            r11 = r12
            r13 = r14
            r15 = r0
            r8.<init>(r9, r11, r13, r15, r16)
            r9 = r17
        L_0x037c:
            java.lang.String r0 = java.lang.Integer.toString(r7, r2)
            android.os.Bundle r0 = r1.getBundle(r0)
            if (r0 != 0) goto L_0x038a
            ts8 r0 = defpackage.ts8.Q0
        L_0x0388:
            r10 = r0
            goto L_0x0393
        L_0x038a:
            zc8 r3 = defpackage.ts8.R0
            jv0 r0 = r3.h(r0)
            ts8 r0 = (defpackage.ts8) r0
            goto L_0x0388
        L_0x0393:
            java.lang.String r0 = java.lang.Integer.toString(r5, r2)
            android.os.Bundle r0 = r1.getBundle(r0)
            if (r0 != 0) goto L_0x03a1
            rq8 r0 = defpackage.rq8.x
        L_0x039f:
            r7 = r0
            goto L_0x03aa
        L_0x03a1:
            zc8 r1 = defpackage.pq8.w
            jv0 r0 = r1.h(r0)
            rq8 r0 = (defpackage.rq8) r0
            goto L_0x039f
        L_0x03aa:
            gr8 r0 = new gr8
            r8 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc8.h(android.os.Bundle):jv0");
    }

    public void invoke(Object obj) {
        ((sob) obj).h(1);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, dr8] */
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                z68.f("fd8", "searchChatsAndMessage: search server messages exception", (Throwable) obj);
                return Collections.emptyList();
            case 1:
                return new ed8(dd8.c, (List) obj);
            case 2:
                z68.f("fd8", "searchChatsAndMessage: search local chats exception", (Throwable) obj);
                return Collections.emptyList();
            case 3:
                return new ed8(dd8.a, (List) obj);
            case 4:
                List<bac> list = (List) obj;
                dd8 dd8 = dd8.b;
                ArrayList arrayList = new ArrayList(list.size());
                for (bac bac : list) {
                    try {
                        arrayList.add(new ald(5, (String) null, bac.b, (a32) null, (vk3) null, (b89) null, 0, bac));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                return new ed8(dd8, arrayList);
            case 26:
                fxe fxe = (fxe) obj;
                fxe.getClass();
                Bundle bundle = new Bundle();
                int i = fxe.a;
                if (i != 0) {
                    bundle.putInt(fxe.o, i);
                }
                int i2 = fxe.b;
                if (i2 != 0) {
                    bundle.putInt(fxe.v, i2);
                }
                int i3 = fxe.c;
                if (i3 != 0) {
                    bundle.putInt(fxe.w, i3);
                }
                return bundle;
            case 27:
                er8 er8 = (er8) obj;
                er8.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(er8.h, er8.a);
                String str = er8.b;
                if (str != null) {
                    bundle2.putString(er8.i, str);
                }
                String str2 = er8.c;
                if (str2 != null) {
                    bundle2.putString(er8.j, str2);
                }
                int i4 = er8.d;
                if (i4 != 0) {
                    bundle2.putInt(er8.k, i4);
                }
                int i5 = er8.e;
                if (i5 != 0) {
                    bundle2.putInt(er8.l, i5);
                }
                String str3 = er8.f;
                if (str3 != null) {
                    bundle2.putString(er8.m, str3);
                }
                String str4 = er8.g;
                if (str4 != null) {
                    bundle2.putString(er8.n, str4);
                }
                return bundle2;
            default:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(er8.h);
                uri.getClass();
                String string = bundle3.getString(er8.i);
                String string2 = bundle3.getString(er8.j);
                int i6 = bundle3.getInt(er8.k, 0);
                int i7 = bundle3.getInt(er8.l, 0);
                String string3 = bundle3.getString(er8.m);
                String string4 = bundle3.getString(er8.n);
                ? obj2 = new Object();
                obj2.a = uri;
                obj2.b = vq9.l(string);
                obj2.c = string2;
                obj2.d = i6;
                obj2.e = i7;
                obj2.f = string3;
                obj2.g = string4;
                return new er8(obj2);
        }
    }
}
