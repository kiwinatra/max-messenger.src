package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.media3.transformer.ExportException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: m7h  reason: default package */
public final class m7h implements e43 {
    public static m7h w;
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public Object o;
    public Object v;

    public /* synthetic */ m7h() {
        this.a = 4;
    }

    public static ExportException d(ea6 ea6, String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        String ea62 = ea6.toString();
        String str2 = ea6.n;
        str2.getClass();
        return ExportException.c(illegalArgumentException, 3003, new ci3(ea62, (String) null, vq9.k(str2), true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.m7h e(defpackage.pf9 r12) {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            int r3 = defpackage.ryg.e0(r12)
            r4 = 0
            if (r3 != 0) goto L_0x000b
            return r4
        L_0x000b:
            r9 = r1
            r6 = r4
            r7 = r6
            r8 = r7
            r4 = r9
        L_0x0010:
            if (r4 >= r3) goto L_0x00ab
            java.lang.String r5 = r12.A0()
            r5.getClass()
            r10 = -1
            int r11 = r5.hashCode()
            switch(r11) {
                case -683415465: goto L_0x0038;
                case -265713450: goto L_0x002d;
                case 3598564: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0042
        L_0x0022:
            java.lang.String r11 = "urls"
            boolean r5 = r5.equals(r11)
            if (r5 != 0) goto L_0x002b
            goto L_0x0042
        L_0x002b:
            r10 = r0
            goto L_0x0042
        L_0x002d:
            java.lang.String r11 = "username"
            boolean r5 = r5.equals(r11)
            if (r5 != 0) goto L_0x0036
            goto L_0x0042
        L_0x0036:
            r10 = r2
            goto L_0x0042
        L_0x0038:
            java.lang.String r11 = "credential"
            boolean r5 = r5.equals(r11)
            if (r5 != 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r10 = r1
        L_0x0042:
            switch(r10) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x009d;
                case 2: goto L_0x004a;
                default: goto L_0x0045;
            }
        L_0x0045:
            r12.A()
            goto L_0x00a8
        L_0x004a:
            int r5 = defpackage.ryg.X(r12)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            r9 = r1
        L_0x0054:
            if (r9 >= r5) goto L_0x005f
            java.lang.String r10 = defpackage.ryg.g0(r12)
            r6.add(r10)
            int r9 = r9 + r2
            goto L_0x0054
        L_0x005f:
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L_0x009b
            java.util.Iterator r5 = r6.iterator()
        L_0x0069:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x009b
            java.lang.Object r9 = r5.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "stun:"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x0098
            java.lang.String r10 = "stuns:"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x0086
            goto L_0x0098
        L_0x0086:
            java.lang.String r10 = "turn:"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x0096
            java.lang.String r10 = "turns:"
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L_0x0069
        L_0x0096:
            r9 = r0
            goto L_0x00a8
        L_0x0098:
            r5 = 3
            r9 = r5
            goto L_0x00a8
        L_0x009b:
            r9 = r2
            goto L_0x00a8
        L_0x009d:
            java.lang.String r5 = defpackage.ryg.g0(r12)
            r7 = r5
            goto L_0x00a8
        L_0x00a3:
            java.lang.String r5 = defpackage.ryg.g0(r12)
            r8 = r5
        L_0x00a8:
            int r4 = r4 + r2
            goto L_0x0010
        L_0x00ab:
            m7h r12 = new m7h
            r10 = 2
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m7h.e(pf9):m7h");
    }

    public static synchronized m7h g(Context context) {
        m7h m7h;
        synchronized (m7h.class) {
            try {
                if (w == null) {
                    w = new m7h(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new j5a("MessengerIpcClient", 0))));
                }
                m7h = w;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return m7h;
    }

    public lob a() {
        return new lob((String) this.b, (CharSequence) this.o, this.c, (Bundle) this.v);
    }

    public String b(int i, long j, long j2, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            String[] strArr = (String[]) this.b;
            int i3 = this.c;
            if (i2 < i3) {
                sb.append(strArr[i2]);
                int i4 = ((int[]) this.o)[i2];
                if (i4 == 1) {
                    sb.append(str);
                } else {
                    String[] strArr2 = (String[]) this.v;
                    if (i4 == 2) {
                        sb.append(String.format(Locale.US, strArr2[i2], new Object[]{Long.valueOf(j)}));
                    } else if (i4 == 3) {
                        sb.append(String.format(Locale.US, strArr2[i2], new Object[]{Integer.valueOf(i)}));
                    } else if (i4 == 4) {
                        sb.append(String.format(Locale.US, strArr2[i2], new Object[]{Long.valueOf(j2)}));
                    }
                }
                i2++;
            } else {
                sb.append(strArr[i3]);
                return sb.toString();
            }
        }
    }

    public md4 c(MediaFormat mediaFormat, ea6 ea6, Surface surface, boolean z) {
        ea6 ea62 = ea6;
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        ea62.n.getClass();
        try {
            ArrayList h = fo8.h(ea62, fo8.g((rx0) this.v, ea62, false, false));
            if (!h.isEmpty()) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < h.size(); i++) {
                        on8 on8 = (on8) h.get(i);
                        if (!on8.g) {
                            arrayList.add(on8);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        h = arrayList;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Context context = (Context) this.b;
                for (on8 on82 : h.subList(0, 1)) {
                    mediaFormat.setString("mime", on82.c);
                    try {
                        md4 md4 = new md4(context, ea6, mediaFormat, on82.a, true, surface);
                        md4.b();
                        ((ts1) this.o).getClass();
                        return md4;
                    } catch (ExportException e) {
                        arrayList2.add(e);
                    }
                }
                throw ((ExportException) arrayList2.get(0));
            }
            throw d(ea62, "No decoders for format");
        } catch (MediaCodecUtil$DecoderQueryException e2) {
            i8b.p("Error querying decoders", e2);
            throw d(ea62, "Querying codecs failed");
        }
    }

    public void f(Bundle bundle) {
        this.v = bundle;
    }

    public synchronized s7h h(w6h w6h) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(w6h.toString());
            }
            if (!((m6h) this.v).d(w6h)) {
                m6h m6h = new m6h(this);
                this.v = m6h;
                m6h.d(w6h);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return w6h.b.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r4.equals("SM-X900") == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (defpackage.v0g.d.startsWith("SM-F936") != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.md4 k(defpackage.ea6 r8, android.view.Surface r9, boolean r10) {
        /*
            r7 = this;
            m53 r0 = r8.A
            boolean r0 = defpackage.m53.g(r0)
            r1 = 29
            r2 = 31
            if (r0 == 0) goto L_0x0075
            if (r10 == 0) goto L_0x0069
            int r0 = defpackage.v0g.a
            if (r0 < r2) goto L_0x0062
            m53 r3 = r8.A
            r3.getClass()
            java.lang.String r4 = defpackage.v0g.c
            java.lang.String r5 = "Google"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x002b
            java.lang.String r4 = android.os.Build.ID
            java.lang.String r5 = "TP1A"
            boolean r4 = r4.startsWith(r5)
            if (r4 != 0) goto L_0x0062
        L_0x002b:
            int r3 = r3.c
            r4 = 7
            java.lang.String r5 = "SM-F936"
            if (r3 != r4) goto L_0x0052
            java.lang.String r4 = defpackage.v0g.d
            boolean r6 = r4.startsWith(r5)
            if (r6 != 0) goto L_0x0062
            java.lang.String r6 = "SM-F916"
            boolean r6 = r4.startsWith(r6)
            if (r6 != 0) goto L_0x0062
            java.lang.String r6 = "SM-F721"
            boolean r6 = r4.startsWith(r6)
            if (r6 != 0) goto L_0x0062
            java.lang.String r6 = "SM-X900"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0062
        L_0x0052:
            r4 = 34
            if (r0 >= r4) goto L_0x0069
            r0 = 6
            if (r3 != r0) goto L_0x0069
            java.lang.String r0 = defpackage.v0g.d
            boolean r0 = r0.startsWith(r5)
            if (r0 != 0) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            java.lang.String r7 = "Tone-mapping HDR is not supported on this device."
            androidx.media3.transformer.ExportException r7 = d(r8, r7)
            throw r7
        L_0x0069:
            int r0 = defpackage.v0g.a
            if (r0 < r1) goto L_0x006e
            goto L_0x0075
        L_0x006e:
            java.lang.String r7 = "Decoding HDR is not supported on this device."
            androidx.media3.transformer.ExportException r7 = d(r8, r7)
            throw r7
        L_0x0075:
            int r0 = defpackage.v0g.a
            if (r0 >= r2) goto L_0x00ab
            int r3 = r8.t
            r4 = 7680(0x1e00, float:1.0762E-41)
            if (r3 < r4) goto L_0x00ab
            int r3 = r8.u
            r4 = 4320(0x10e0, float:6.054E-42)
            if (r3 < r4) goto L_0x00ab
            java.lang.String r3 = r8.n
            if (r3 == 0) goto L_0x00ab
            java.lang.String r4 = "video/hevc"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ab
            java.lang.String r3 = defpackage.v0g.d
            java.lang.String r4 = "SM-F711U1"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x00a4
            java.lang.String r4 = "SM-F926U1"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00a4
            goto L_0x00ab
        L_0x00a4:
            java.lang.String r7 = "Decoding 8k is not supported on this device."
            androidx.media3.transformer.ExportException r7 = d(r8, r7)
            throw r7
        L_0x00ab:
            r3 = 30
            if (r0 >= r3) goto L_0x00c7
            java.lang.String r3 = defpackage.v0g.b
            java.lang.String r4 = "joyeuse"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00c7
            ba6 r8 = r8.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.u = r3
            ea6 r3 = new ea6
            r3.<init>(r8)
            r8 = r3
        L_0x00c7:
            android.media.MediaFormat r3 = defpackage.hsg.i(r8)
            r4 = 0
            if (r0 < r1) goto L_0x00df
            java.lang.Object r5 = r7.b
            android.content.Context r5 = (android.content.Context) r5
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            int r5 = r5.targetSdkVersion
            if (r5 < r1) goto L_0x00df
            java.lang.String r1 = "allow-frame-drop"
            r3.setInteger(r1, r4)
        L_0x00df:
            if (r0 < r2) goto L_0x00e9
            if (r10 == 0) goto L_0x00e9
            java.lang.String r10 = "color-transfer-request"
            r1 = 3
            r3.setInteger(r10, r1)
        L_0x00e9:
            android.util.Pair r10 = defpackage.fo8.d(r8)
            if (r10 == 0) goto L_0x0109
            java.lang.Object r1 = r10.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "profile"
            defpackage.hsg.x(r3, r2, r1)
            java.lang.Object r10 = r10.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.String r1 = "level"
            defpackage.hsg.x(r3, r1, r10)
        L_0x0109:
            r10 = 35
            if (r0 < r10) goto L_0x0119
            int r10 = r7.c
            int r10 = -r10
            int r10 = java.lang.Math.max(r4, r10)
            java.lang.String r0 = "importance"
            r3.setInteger(r0, r10)
        L_0x0119:
            int r10 = r8.t
            int r0 = r8.u
            int r10 = r10 * r0
            r0 = 2073600(0x1fa400, float:2.905732E-39)
            if (r10 < r0) goto L_0x0136
            java.lang.String r10 = defpackage.v0g.d
            java.lang.String r0 = "vivo 1906"
            boolean r0 = defpackage.o54.l(r10, r0)
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = "redmi 8"
            boolean r10 = defpackage.o54.l(r10, r0)
            if (r10 == 0) goto L_0x0136
        L_0x0135:
            r4 = 1
        L_0x0136:
            md4 r7 = r7.c(r3, r8, r9, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m7h.k(ea6, android.view.Surface, boolean):md4");
    }

    public md4 p(ea6 ea6) {
        return c(hsg.i(ea6), ea6, (Surface) null, false);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("{urls=");
                sb.append((List) this.b);
                sb.append(", username='");
                sb.append((String) this.o);
                sb.append("', credential='");
                sb.append((String) this.v);
                sb.append("', type=");
                int i = this.c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "STUN" : "TURN" : "UNKNOWN");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m7h(Object obj, Serializable serializable, Serializable serializable2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.o = serializable;
        this.v = serializable2;
        this.c = i;
    }

    public m7h(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = 0;
        this.v = new m6h(this);
        this.c = 1;
        this.o = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public m7h(Context context) {
        this.a = 1;
        Context applicationContext = context.getApplicationContext();
        Object obj = new Object();
        rx0 rx0 = rx0.x;
        this.b = applicationContext;
        this.o = obj;
        this.c = -2000;
        this.v = rx0;
    }

    public m7h(String str, CharSequence charSequence, int i) {
        this.a = 3;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
        } else if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        } else if (i != 0) {
            this.b = str;
            this.o = charSequence;
            this.c = i;
        } else {
            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
        }
    }
}
