package defpackage;

import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;

/* renamed from: gp7  reason: default package */
public final class gp7 extends cmf {
    public static final int X;
    public static final dtd Y = sh4.a;
    public static final int y;
    public static final int z;
    public final transient w22 a;
    public final transient rw0 b;
    public final int c = y;
    public final int o = z;
    public final int v = X;
    public final dtd w = Y;
    public final char x = Typography.quote;

    static {
        int[] A = tr1.A(4);
        int length = A.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = A[i];
            if (i3 != 0) {
                i2 |= wj6.b(i3);
                i++;
            } else {
                throw null;
            }
        }
        y = i2;
        int i4 = 0;
        for (np7 np7 : np7.values()) {
            if (np7.a) {
                i4 |= np7.b;
            }
        }
        z = i4;
        int i5 = 0;
        for (hp7 hp7 : hp7.values()) {
            if (hp7.a) {
                i5 |= hp7.b;
            }
        }
        X = i5;
    }

    public gp7() {
        long currentTimeMillis = System.currentTimeMillis();
        this.a = new w22((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.b = new rw0((((int) currentTimeMillis2) + ((int) (currentTimeMillis2 >>> 32))) | 1);
    }

    public o67 a(Object obj, boolean z2) {
        return new o67(i(), obj, z2);
    }

    public ip7 b(Writer writer, o67 o67) {
        drg drg = new drg(o67, this.v, writer, this.x);
        dtd dtd = this.w;
        if (dtd != Y) {
            drg.x = dtd;
        }
        return drg;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: quf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: quf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: quf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.pp7 c(java.io.InputStream r26, defpackage.o67 r27) {
        /*
            r25 = this;
            r0 = r25
            r3 = r26
            r8 = r27
            java.io.Serializable r1 = r8.e
            byte[] r1 = (byte[]) r1
            if (r1 != 0) goto L_0x023b
            java.lang.Object r1 = r8.d
            eu0 r1 = (defpackage.eu0) r1
            r1.getClass()
            int[] r2 = defpackage.eu0.c
            r4 = 0
            r2 = r2[r4]
            if (r2 <= 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r2 = r4
        L_0x001c:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.a
            r5 = 0
            java.lang.Object r1 = r1.getAndSet(r4, r5)
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x002d
            int r6 = r1.length
            if (r6 >= r2) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r6 = r1
            goto L_0x0030
        L_0x002d:
            byte[] r1 = new byte[r2]
            goto L_0x002b
        L_0x0030:
            r8.e = r6
            int r1 = r4 - r4
            r2 = r4
        L_0x0035:
            r9 = 4
            r10 = 1
            if (r1 >= r9) goto L_0x004a
            if (r3 != 0) goto L_0x003d
            r11 = -1
            goto L_0x0043
        L_0x003d:
            int r11 = r6.length
            int r11 = r11 - r2
            int r11 = r3.read(r6, r2, r11)
        L_0x0043:
            if (r11 >= r10) goto L_0x0047
            r1 = r4
            goto L_0x004b
        L_0x0047:
            int r2 = r2 + r11
            int r1 = r1 + r11
            goto L_0x0035
        L_0x004a:
            r1 = r10
        L_0x004b:
            r11 = 65280(0xff00, float:9.1477E-41)
            r12 = 16
            r13 = 3
            r14 = 8
            r15 = 2
            java.lang.String r7 = "Internal error"
            if (r1 == 0) goto L_0x00f1
            byte r1 = r6[r4]
            int r1 = r1 << 24
            r16 = 0
            int r16 = r16 + 1
            byte r4 = r6[r16]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r12
            r1 = r1 | r4
            r4 = 0
            int r4 = r4 + r15
            byte r12 = r6[r4]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << r14
            r1 = r1 | r12
            r12 = 0
            int r12 = r12 + r13
            byte r13 = r6[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r1 = r1 | r13
            r13 = -16842752(0xfffffffffeff0000, float:-1.6947657E38)
            java.lang.String r16 = "3412"
            if (r1 == r13) goto L_0x00ed
            r13 = -131072(0xfffffffffffe0000, float:NaN)
            if (r1 == r13) goto L_0x00e2
            r13 = 65279(0xfeff, float:9.1475E-41)
            if (r1 == r13) goto L_0x00de
            java.lang.String r17 = "2143"
            r14 = 65534(0xfffe, float:9.1833E-41)
            if (r1 == r14) goto L_0x00da
            int r10 = r1 >>> 16
            if (r10 != r13) goto L_0x0093
            r1 = r4
            r5 = r15
        L_0x0091:
            r4 = 1
            goto L_0x00e6
        L_0x0093:
            if (r10 != r14) goto L_0x0099
            r1 = r4
            r5 = r15
        L_0x0097:
            r4 = 0
            goto L_0x00e6
        L_0x0099:
            int r4 = r1 >>> 8
            r13 = 15711167(0xefbbbf, float:2.2016034E-38)
            if (r4 != r13) goto L_0x00a4
            r1 = r12
            r4 = 1
            r5 = 1
            goto L_0x00e6
        L_0x00a4:
            int r4 = r1 >> 8
            if (r4 != 0) goto L_0x00aa
            r1 = 1
            goto L_0x00b1
        L_0x00aa:
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r1
            if (r4 != 0) goto L_0x00b6
            r1 = 0
        L_0x00b1:
            r5 = r9
        L_0x00b2:
            r4 = 0
            r10 = 1
            goto L_0x012a
        L_0x00b6:
            r4 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x00d6
            r4 = -65281(0xffffffffffff00ff, float:NaN)
            r1 = r1 & r4
            if (r1 == 0) goto L_0x00d2
            r1 = r10 & r11
            if (r1 != 0) goto L_0x00c8
            r1 = 1
            goto L_0x00cd
        L_0x00c8:
            r1 = r10 & 255(0xff, float:3.57E-43)
            if (r1 != 0) goto L_0x00cf
            r1 = 0
        L_0x00cd:
            r5 = r15
            goto L_0x00b2
        L_0x00cf:
            r1 = 0
            goto L_0x0149
        L_0x00d2:
            defpackage.n79.Q(r17)
            throw r5
        L_0x00d6:
            defpackage.n79.Q(r16)
            throw r5
        L_0x00da:
            defpackage.n79.Q(r17)
            throw r5
        L_0x00de:
            r1 = 0
            int r1 = r1 + r9
            r5 = r9
            goto L_0x0091
        L_0x00e2:
            r1 = 0
            int r1 = r1 + r9
            r5 = r9
            goto L_0x0097
        L_0x00e6:
            r10 = 1
            r24 = r4
            r4 = r1
            r1 = r24
            goto L_0x012a
        L_0x00ed:
            defpackage.n79.Q(r16)
            throw r5
        L_0x00f1:
            int r1 = r2 + 0
        L_0x00f3:
            if (r1 >= r15) goto L_0x0109
            if (r3 != 0) goto L_0x00fa
            r4 = -1
        L_0x00f8:
            r5 = 1
            goto L_0x0101
        L_0x00fa:
            int r4 = r6.length
            int r4 = r4 - r2
            int r4 = r3.read(r6, r2, r4)
            goto L_0x00f8
        L_0x0101:
            if (r4 >= r5) goto L_0x0106
            r18 = 0
            goto L_0x010c
        L_0x0106:
            int r2 = r2 + r4
            int r1 = r1 + r4
            goto L_0x00f3
        L_0x0109:
            r5 = 1
            r18 = r5
        L_0x010c:
            if (r18 == 0) goto L_0x00cf
            r1 = 0
            byte r4 = r6[r1]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r10 = 8
            int r4 = r4 << r10
            r10 = 0
            int r10 = r10 + r5
            byte r5 = r6[r10]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            r5 = r4 & r11
            if (r5 != 0) goto L_0x0123
            r4 = 1
            goto L_0x0128
        L_0x0123:
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 != 0) goto L_0x0149
            r4 = r1
        L_0x0128:
            r5 = r15
            goto L_0x00e6
        L_0x012a:
            if (r5 == r10) goto L_0x0145
            if (r5 == r15) goto L_0x013e
            if (r5 != r9) goto L_0x0138
            if (r1 == 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r9 = 5
        L_0x0134:
            r10 = r2
            r5 = r9
        L_0x0136:
            r9 = r4
            goto L_0x014c
        L_0x0138:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r7)
            throw r0
        L_0x013e:
            if (r1 == 0) goto L_0x0142
            r5 = r15
            goto L_0x0143
        L_0x0142:
            r5 = 3
        L_0x0143:
            r10 = r2
            goto L_0x0136
        L_0x0145:
            r10 = r2
            r9 = r4
        L_0x0147:
            r5 = 1
            goto L_0x014c
        L_0x0149:
            r9 = r1
            r10 = r2
            goto L_0x0147
        L_0x014c:
            r8.c = r5
            int r11 = r0.o
            int r12 = r0.c
            r1 = 1
            if (r5 != r1) goto L_0x0193
            boolean r2 = defpackage.wj6.a(r15, r12)
            if (r2 == 0) goto L_0x0193
            rw0 r0 = r0.b
            r0.getClass()
            rw0 r4 = new rw0
            boolean r20 = defpackage.wj6.a(r1, r12)
            r1 = 3
            boolean r22 = defpackage.wj6.a(r1, r12)
            java.util.concurrent.atomic.AtomicReference r1 = r0.b
            java.lang.Object r1 = r1.get()
            r23 = r1
            qw0 r23 = (defpackage.qw0) r23
            int r1 = r0.c
            r18 = r4
            r19 = r0
            r21 = r1
            r18.<init>(r19, r20, r21, r22, r23)
            ruf r12 = new ruf
            r13 = 1
            r0 = r12
            r1 = r27
            r2 = r11
            r3 = r26
            r5 = r6
            r6 = r9
            r7 = r10
            r8 = r9
            r9 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x023a
        L_0x0193:
            ctc r13 = new ctc
            int r14 = r8.c
            r1 = 1
            if (r14 == r1) goto L_0x01af
            r1 = 2
            r2 = 16
            if (r14 == r1) goto L_0x01aa
            r1 = 3
            if (r14 == r1) goto L_0x01aa
            r1 = 4
            r2 = 32
            if (r14 == r1) goto L_0x01aa
            r1 = 5
            if (r14 != r1) goto L_0x01ad
        L_0x01aa:
            r1 = 8
            goto L_0x01b2
        L_0x01ad:
            r0 = 0
            throw r0
        L_0x01af:
            r2 = 8
            goto L_0x01aa
        L_0x01b2:
            if (r2 == r1) goto L_0x01e7
            r1 = 16
            if (r2 == r1) goto L_0x01e7
            r1 = 32
            if (r2 != r1) goto L_0x01e1
            quf r14 = new quf
            int r1 = r8.c
            r2 = 0
            r4 = 1
            if (r1 == r4) goto L_0x01d0
            r5 = 2
            if (r1 == r5) goto L_0x01d4
            r5 = 3
            if (r1 == r5) goto L_0x01d0
            r5 = 4
            if (r1 == r5) goto L_0x01d4
            r4 = 5
            if (r1 != r4) goto L_0x01d2
        L_0x01d0:
            r7 = r2
            goto L_0x01d5
        L_0x01d2:
            r0 = 0
            throw r0
        L_0x01d4:
            r7 = r4
        L_0x01d5:
            r1 = r14
            r2 = r27
            r3 = r26
            r4 = r6
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0225
        L_0x01e1:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r7)
            throw r0
        L_0x01e7:
            if (r3 != 0) goto L_0x01ef
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6, r9, r10)
            goto L_0x0200
        L_0x01ef:
            if (r9 >= r10) goto L_0x01ff
            o79 r7 = new o79
            r1 = r7
            r2 = r27
            r3 = r26
            r4 = r6
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0200
        L_0x01ff:
            r1 = r3
        L_0x0200:
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r3 = 1
            if (r14 == r3) goto L_0x021f
            r3 = 2
            if (r14 == r3) goto L_0x021c
            r3 = 3
            if (r14 == r3) goto L_0x0219
            r3 = 4
            if (r14 == r3) goto L_0x0216
            r3 = 5
            if (r14 != r3) goto L_0x0214
            java.lang.String r3 = "UTF-32LE"
            goto L_0x0221
        L_0x0214:
            r0 = 0
            throw r0
        L_0x0216:
            java.lang.String r3 = "UTF-32BE"
            goto L_0x0221
        L_0x0219:
            java.lang.String r3 = "UTF-16LE"
            goto L_0x0221
        L_0x021c:
            java.lang.String r3 = "UTF-16BE"
            goto L_0x0221
        L_0x021f:
            java.lang.String r3 = "UTF-8"
        L_0x0221:
            r2.<init>(r1, r3)
            r14 = r2
        L_0x0225:
            w22 r1 = new w22
            w22 r0 = r0.a
            java.util.concurrent.atomic.AtomicReference r2 = r0.b
            java.lang.Object r2 = r2.get()
            v22 r2 = (defpackage.v22) r2
            int r3 = r0.c
            r1.<init>(r0, r12, r3, r2)
            r13.<init>(r8, r11, r14, r1)
            r12 = r13
        L_0x023a:
            return r12
        L_0x023b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Trying to call same allocXxx() method second time"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp7.c(java.io.InputStream, o67):pp7");
    }

    public pp7 d(Reader reader, o67 o67) {
        int i = this.c;
        w22 w22 = this.a;
        return new ctc(o67, this.o, reader, new w22(w22, i, w22.c, (v22) w22.b.get()));
    }

    public pp7 e(char[] cArr, int i, int i2, o67 o67, boolean z2) {
        int i3 = this.c;
        w22 w22 = this.a;
        int i4 = w22.c;
        return new ctc(o67, this.o, new w22(w22, i3, i4, (v22) w22.b.get()), cArr, i, i + i2, z2);
    }

    public final InputStream f(InputStream inputStream, o67 o67) {
        return inputStream;
    }

    public final Reader g(Reader reader, o67 o67) {
        return reader;
    }

    public final Writer h(Writer writer, o67 o67) {
        return writer;
    }

    public eu0 i() {
        SoftReference softReference;
        if (!wj6.a(4, this.c)) {
            return new eu0();
        }
        ThreadLocal threadLocal = fu0.b;
        SoftReference softReference2 = (SoftReference) threadLocal.get();
        eu0 eu0 = softReference2 == null ? null : (eu0) softReference2.get();
        if (eu0 == null) {
            eu0 = new eu0();
            fj fjVar = fu0.a;
            if (fjVar != null) {
                ReferenceQueue referenceQueue = (ReferenceQueue) fjVar.c;
                softReference = new SoftReference(eu0, referenceQueue);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) fjVar.b;
                concurrentHashMap.put(softReference, Boolean.TRUE);
                while (true) {
                    SoftReference softReference3 = (SoftReference) referenceQueue.poll();
                    if (softReference3 == null) {
                        break;
                    }
                    concurrentHashMap.remove(softReference3);
                }
            } else {
                softReference = new SoftReference(eu0);
            }
            threadLocal.set(softReference);
        }
        return eu0;
    }

    public boolean j() {
        return true;
    }

    public ip7 k(Writer writer) {
        o67 a2 = a(writer, false);
        return b(h(writer, a2), a2);
    }

    public pp7 l(InputStream inputStream) {
        o67 a2 = a(inputStream, false);
        return c(f(inputStream, a2), a2);
    }

    public pp7 m(Reader reader) {
        o67 a2 = a(reader, false);
        return d(g(reader, a2), a2);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [char[], java.lang.Cloneable] */
    public pp7 n(String str) {
        int length = str.length();
        if (length > 32768 || !j()) {
            return m(new StringReader(str));
        }
        o67 a2 = a(str, true);
        if (((char[]) a2.f) == null) {
            ? a3 = ((eu0) a2.d).a(0, length);
            a2.f = a3;
            str.getChars(0, length, a3, 0);
            return e(a3, 0, length, a2, true);
        }
        throw new IllegalStateException("Trying to call same allocXxx() method second time");
    }
}
