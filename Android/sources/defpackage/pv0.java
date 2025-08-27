package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pv0  reason: default package */
public final class pv0 implements xf5, qk3 {
    public static final yl4 x = new yl4(16, false);
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object o;
    public Object v;
    public Object w;

    public /* synthetic */ pv0(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.v = obj3;
        this.w = obj4;
        this.b = z;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        kuf[] kufArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd || (kufArr = (kuf[]) editable.getSpans(selectionStart, selectionEnd, kuf.class)) == null || kufArr.length <= 0)) {
            int length = kufArr.length;
            int i = 0;
            while (i < length) {
                kuf kuf = kufArr[i];
                int spanStart = editable.getSpanStart(kuf);
                int spanEnd = editable.getSpanEnd(kuf);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public zpf B(int i, int i2) {
        kq8 kq8 = new kq8();
        if (i2 == 1) {
            ((ArrayList) this.o).add(kq8);
        } else if (i2 != 2) {
            ((ArrayList) this.v).add(kq8);
        } else {
            ((ArrayList) this.c).add(kq8);
        }
        return kq8;
    }

    public void M(snd snd) {
        this.w = snd;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 5:
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence.length() != 0 && !Intrinsics.areEqual((Object) charSequence, (Object) (CharSequence) this.c)) {
                    ((ef9) this.o).b((a32) this.v, (a89) this.w, charSequence, this.b);
                    return;
                }
                return;
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                if (charSequence2.length() != 0 && !Intrinsics.areEqual((Object) charSequence2, (Object) (CharSequence) this.c)) {
                    ((vj9) this.o).b((a32) this.v, (a89) this.w, charSequence2, this.b);
                    return;
                }
                return;
        }
    }

    public void b() {
        ((voc) this.v).log("Condition", "Condition # " + ((String) this.c) + " - 🔥 " + ((AtomicLong) this.w).incrementAndGet());
        synchronized (this) {
            try {
                if (!this.b) {
                    this.b = true;
                    Iterator it = ((ArrayList) this.o).iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((voc) this.v).log("Condition", "Condition # " + ((String) this.c) + " - executing from queue " + ((String) pair.first) + " " + ((AtomicLong) this.w).incrementAndGet());
                        ((Runnable) pair.second).run();
                    }
                    ((ArrayList) this.o).clear();
                } else {
                    throw new IllegalStateException("Is already fired");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(CharSequence charSequence, int i, int i2, juf juf) {
        if ((juf.c & 3) == 0) {
            p15 p15 = (p15) this.v;
            yp9 c2 = juf.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.a);
            }
            mf4 mf4 = (mf4) p15;
            mf4.getClass();
            ThreadLocal threadLocal = mf4.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = mf4.a;
            String sb2 = sb.toString();
            int i3 = t7b.a;
            boolean a3 = s7b.a(textPaint, sb2);
            int i4 = juf.c & 4;
            juf.c = a3 ? i4 | 2 : i4 | 1;
        }
        return (juf.c & 3) == 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(org.json.JSONObject r27) {
        /*
            r26 = this;
            r1 = r26
            r5 = 16
            boolean r0 = r1.b
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.Object r0 = r1.o
            r6 = r0
            tgg r6 = (defpackage.tgg) r6
            r6.getClass()
            r0 = r27
            mqf r0 = r6.n(r0)     // Catch:{ JSONException -> 0x0018 }
            goto L_0x0026
        L_0x0018:
            r0 = move-exception
            r8 = r0
            java.lang.Object r0 = r6.a
            voc r0 = (defpackage.voc) r0
            java.lang.String r6 = "RoomPartsUpdateParser"
            java.lang.String r9 = "Room participants update parse error"
            r0.logException(r6, r9, r8)
            r0 = 0
        L_0x0026:
            if (r0 != 0) goto L_0x0029
            return
        L_0x0029:
            java.lang.Object r1 = r1.w
            yj1 r1 = (defpackage.yj1) r1
            r1.getClass()
            ef1 r6 = r1.b
            ye1 r8 = r6.a
            ue1 r8 = r8.a
            java.lang.Object r9 = r0.v
            java.util.List r9 = (java.util.List) r9
            boolean r8 = kotlin.collections.CollectionsKt.contains(r9, r8)
            java.lang.Object r10 = r0.c
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.o
            zwd r11 = (defpackage.zwd) r11
            r6.m(r11, r10)
            jc1 r10 = r1.e
            java.lang.Object r12 = r0.w
            w8b r12 = (defpackage.w8b) r12
            if (r12 == 0) goto L_0x0070
            java.util.List r13 = r12.a
            r6.g(r11, r13)
            java.util.List r12 = r12.b
            java.util.Iterator r12 = r12.iterator()
        L_0x005c:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0070
            java.lang.Object r13 = r12.next()
            we1 r13 = (defpackage.we1) r13
            a9b r14 = r10.n
            ue1 r15 = r13.b
            r14.onStateChanged(r15, r13)
            goto L_0x005c
        L_0x0070:
            boolean r12 = r11 instanceof defpackage.ywd
            ata r13 = r1.c
            int r0 = r0.b
            if (r12 != 0) goto L_0x007f
            r25 = r0
            r26 = r9
            r27 = r12
            goto L_0x00d0
        L_0x007f:
            r15 = r11
            ywd r15 = (defpackage.ywd) r15
            v9a r14 = new v9a
            r14.<init>((int) r5)
            v9a r7 = new v9a
            r7.<init>((int) r5)
            v9a r2 = new v9a
            r2.<init>((int) r5)
            v9a r3 = new v9a
            r3.<init>((int) r5)
            v9a r4 = new v9a
            r4.<init>((int) r5)
            r26 = r9
            v9a r9 = new v9a
            r9.<init>((int) r5)
            r27 = r12
            v9a r12 = new v9a
            r12.<init>((int) r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r25 = r0
            xga r0 = new xga
            r16 = r14
            r14 = 1
            r0.<init>(r14, r5)
            y30 r5 = new y30
            r24 = 1
            r14 = r5
            r17 = r7
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r0
            r22 = r9
            r23 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r13.k(r5)
        L_0x00d0:
            java.lang.String r0 = "get-rooms"
            java.lang.String r2 = "command"
            java.lang.String r3 = "Signaling is not ready or released"
            ox0 r4 = r1.g
            if (r8 == 0) goto L_0x0146
            zwd r5 = r6.k
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00e3
            goto L_0x0146
        L_0x00e3:
            zwd r5 = r6.k
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r11)
            if (r5 == 0) goto L_0x00ec
            goto L_0x0104
        L_0x00ec:
            r6.n(r11)
            exd r5 = r10.f
            tj1 r7 = new tj1
            if (r27 == 0) goto L_0x00fd
            r8 = r11
            ywd r8 = (defpackage.ywd) r8
            twd r8 = r13.v(r8)
            goto L_0x00fe
        L_0x00fd:
            r8 = 0
        L_0x00fe:
            r7.<init>(r11, r8)
            r5.onCurrentParticipantActiveRoomChanged(r7)
        L_0x0104:
            ye1 r5 = r6.a
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x0146
            hq7 r5 = new hq7
            r7 = 24
            r5.<init>((int) r7, (java.lang.Object) r1)
            hq7 r7 = new hq7
            r8 = 25
            r7.<init>((int) r8, (java.lang.Object) r1)
            java.lang.Object r8 = r4.b
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            java.lang.Object r8 = r8.invoke()
            o9e r8 = (defpackage.o9e) r8
            if (r8 != 0) goto L_0x012f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            r7.invoke(r0)
            goto L_0x01a0
        L_0x012f:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r3.put((java.lang.String) r2, (java.lang.Object) r0)
            zy0 r0 = new zy0
            r2 = 1
            r0.<init>(r4, r7, r5, r2)
            ir6 r5 = new ir6
            r5.<init>(r4, r7, r2)
            r8.j(r3, r0, r5)
            goto L_0x01a0
        L_0x0146:
            if (r27 == 0) goto L_0x01a0
            r5 = r11
            ywd r5 = (defpackage.ywd) r5
            twd r5 = r13.v(r5)
            if (r5 == 0) goto L_0x01a0
            ue1 r5 = r5.f
            if (r5 == 0) goto L_0x01a0
            zwd r7 = r6.k
            java.util.Map r7 = r6.d(r7)
            java.util.Set r7 = r7.keySet()
            boolean r5 = r7.contains(r5)
            r7 = 1
            r5 = r5 ^ r7
            if (r5 == 0) goto L_0x01a0
            hq7 r5 = new hq7
            r7 = 24
            r5.<init>((int) r7, (java.lang.Object) r1)
            hq7 r7 = new hq7
            r8 = 25
            r7.<init>((int) r8, (java.lang.Object) r1)
            java.lang.Object r8 = r4.b
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            java.lang.Object r8 = r8.invoke()
            o9e r8 = (defpackage.o9e) r8
            if (r8 != 0) goto L_0x018a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            r7.invoke(r0)
            goto L_0x01a0
        L_0x018a:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r3.put((java.lang.String) r2, (java.lang.Object) r0)
            zy0 r0 = new zy0
            r2 = 1
            r0.<init>(r4, r7, r5, r2)
            ir6 r5 = new ir6
            r5.<init>(r4, r7, r2)
            r8.j(r3, r0, r5)
        L_0x01a0:
            zwd r0 = r6.k
            java.util.Map r0 = r6.d(r0)
            java.util.Set r0 = r0.keySet()
            int r0 = r0.size()
            r2 = 1
            int r0 = r0 + r2
            zwd r3 = r6.k
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x01dc
            r3 = r25
            if (r3 == r0) goto L_0x01de
            boolean r0 = r26.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x01de
            x8b[] r0 = defpackage.x8b.a
            rt6 r0 = new rt6
            r0.<init>((defpackage.zwd) r11)
            o14 r4 = new o14
            r4.<init>(r2, r1, r11)
            hq7 r2 = new hq7
            r5 = 23
            r2.<init>((int) r5, (java.lang.Object) r1)
            xe8 r1 = r1.f
            r1.A(r0, r4, r2)
            goto L_0x01de
        L_0x01dc:
            r3 = r25
        L_0x01de:
            if (r27 == 0) goto L_0x022d
            r15 = r11
            ywd r15 = (defpackage.ywd) r15
            v9a r0 = new v9a
            r1 = 16
            r0.<init>((int) r1)
            v9a r2 = new v9a
            r2.<init>((int) r1)
            v9a r4 = new v9a
            r4.<init>((int) r1)
            v9a r5 = new v9a
            r5.<init>((int) r1)
            v9a r6 = new v9a
            r6.<init>((int) r1)
            v9a r7 = new v9a
            r7.<init>((int) r1)
            v9a r8 = new v9a
            r8.<init>((int) r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            xga r3 = new xga
            r9 = 1
            r3.<init>(r9, r1)
            y30 r1 = new y30
            r24 = 1
            r14 = r1
            r16 = r0
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r3
            r22 = r7
            r23 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r13.k(r1)
        L_0x022d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv0.d(org.json.JSONObject):void");
    }

    public void e(JSONObject jSONObject) {
        cxd cxd;
        if (this.b) {
            d23 d23 = (d23) this.c;
            d23.getClass();
            try {
                cxd = d23.a(jSONObject);
            } catch (JSONException e) {
                ((voc) d23.a).logException("SessionRoomParser", "Can't parse room update notification", e);
                cxd = null;
            }
            if (cxd != null) {
                ((yj1) this.w).d(cxd);
            }
        }
    }

    public void f(JSONObject jSONObject) {
        w71 w71;
        if (this.b) {
            d23 d23 = (d23) this.c;
            d23.getClass();
            try {
                w71 = d23.f(jSONObject);
            } catch (JSONException e) {
                ((voc) d23.a).logException("SessionRoomParser", "Can't parse rooms update notification", e);
                w71 = null;
            }
            if (w71 != null) {
                yj1 yj1 = (yj1) this.w;
                yj1.getClass();
                for (cxd d : w71.a) {
                    yj1.d(d);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00c0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21, defpackage.a35 r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r22
            b35 r5 = new b35
            java.lang.Object r6 = r0.o
            gq9 r6 = (defpackage.gq9) r6
            fq9 r6 = r6.c
            boolean r7 = r0.b
            java.lang.Object r8 = r0.w
            int[] r8 = (int[]) r8
            r5.<init>(r6, r7, r8)
            int r6 = java.lang.Character.codePointAt(r17, r18)
            r7 = 1
            r8 = 0
            r9 = r6
            r11 = r7
            r10 = r8
            r6 = r18
        L_0x0026:
            r8 = r6
        L_0x0027:
            r12 = 2
            if (r6 >= r2) goto L_0x00d2
            if (r10 >= r3) goto L_0x00d2
            if (r11 == 0) goto L_0x00d2
            fq9 r13 = r5.c
            android.util.SparseArray r13 = r13.a
            if (r13 != 0) goto L_0x0036
            r13 = 0
            goto L_0x003c
        L_0x0036:
            java.lang.Object r13 = r13.get(r9)
            fq9 r13 = (defpackage.fq9) r13
        L_0x003c:
            int r14 = r5.a
            r15 = 3
            if (r14 == r12) goto L_0x0050
            if (r13 != 0) goto L_0x0048
            r5.a()
        L_0x0046:
            r13 = r7
            goto L_0x0090
        L_0x0048:
            r5.a = r12
            r5.c = r13
            r5.f = r7
        L_0x004e:
            r13 = r12
            goto L_0x0090
        L_0x0050:
            if (r13 == 0) goto L_0x005a
            r5.c = r13
            int r13 = r5.f
            int r13 = r13 + r7
            r5.f = r13
            goto L_0x004e
        L_0x005a:
            r13 = 65038(0xfe0e, float:9.1138E-41)
            if (r9 != r13) goto L_0x0063
            r5.a()
            goto L_0x0046
        L_0x0063:
            r13 = 65039(0xfe0f, float:9.1139E-41)
            if (r9 != r13) goto L_0x0069
            goto L_0x004e
        L_0x0069:
            fq9 r13 = r5.c
            juf r14 = r13.b
            if (r14 == 0) goto L_0x008c
            int r14 = r5.f
            if (r14 != r7) goto L_0x0086
            boolean r13 = r5.b()
            if (r13 == 0) goto L_0x0082
            fq9 r13 = r5.c
            r5.d = r13
            r5.a()
        L_0x0080:
            r13 = r15
            goto L_0x0090
        L_0x0082:
            r5.a()
            goto L_0x0046
        L_0x0086:
            r5.d = r13
            r5.a()
            goto L_0x0080
        L_0x008c:
            r5.a()
            goto L_0x0046
        L_0x0090:
            r5.e = r9
            if (r13 == r7) goto L_0x00c0
            if (r13 == r12) goto L_0x00b1
            if (r13 == r15) goto L_0x0099
            goto L_0x0027
        L_0x0099:
            if (r21 != 0) goto L_0x00a5
            fq9 r12 = r5.d
            juf r12 = r12.b
            boolean r12 = r0.c(r1, r8, r6, r12)
            if (r12 != 0) goto L_0x0026
        L_0x00a5:
            fq9 r11 = r5.d
            juf r11 = r11.b
            boolean r11 = r4.r(r1, r8, r6, r11)
            int r10 = r10 + 1
            goto L_0x0026
        L_0x00b1:
            int r12 = java.lang.Character.charCount(r9)
            int r12 = r12 + r6
            if (r12 >= r2) goto L_0x00bd
            int r6 = java.lang.Character.codePointAt(r1, r12)
            r9 = r6
        L_0x00bd:
            r6 = r12
            goto L_0x0027
        L_0x00c0:
            int r6 = java.lang.Character.codePointAt(r1, r8)
            int r6 = java.lang.Character.charCount(r6)
            int r6 = r6 + r8
            if (r6 >= r2) goto L_0x0026
            int r8 = java.lang.Character.codePointAt(r1, r6)
            r9 = r8
            goto L_0x0026
        L_0x00d2:
            int r2 = r5.a
            if (r2 != r12) goto L_0x00fd
            fq9 r2 = r5.c
            juf r2 = r2.b
            if (r2 == 0) goto L_0x00fd
            int r2 = r5.f
            if (r2 > r7) goto L_0x00e6
            boolean r2 = r5.b()
            if (r2 == 0) goto L_0x00fd
        L_0x00e6:
            if (r10 >= r3) goto L_0x00fd
            if (r11 == 0) goto L_0x00fd
            if (r21 != 0) goto L_0x00f6
            fq9 r2 = r5.c
            juf r2 = r2.b
            boolean r0 = r0.c(r1, r8, r6, r2)
            if (r0 != 0) goto L_0x00fd
        L_0x00f6:
            fq9 r0 = r5.c
            juf r0 = r0.b
            r4.r(r1, r8, r6, r0)
        L_0x00fd:
            java.lang.Object r0 = r22.l()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv0.g(java.lang.CharSequence, int, int, int, boolean, a35):java.lang.Object");
    }

    public boolean h(Bitmap bitmap, int i) {
        try {
            ((lf6) this.v).v(bitmap, i);
            return true;
        } catch (IllegalStateException e) {
            if (!bg5.a.a(6)) {
                return false;
            }
            Log.getStackTraceString(e);
            return false;
        }
    }

    public void v() {
        this.b = true;
    }

    public pv0(String str, voc voc) {
        this.a = 2;
        this.b = false;
        this.o = new ArrayList();
        this.w = new AtomicLong();
        this.c = str;
        this.v = voc;
    }

    public pv0(do0 do0, ef efVar, boolean z) {
        this.a = 1;
        this.c = do0;
        this.o = efVar;
        this.b = z;
        u6h u6h = new u6h(2, this);
        this.w = u6h;
        this.v = new lf6(efVar, z, u6h);
    }

    public pv0(gq9 gq9, o9a o9a, p15 p15, boolean z, int[] iArr, Set set) {
        this.a = 3;
        this.c = o9a;
        this.o = gq9;
        this.v = p15;
        this.b = z;
        this.w = iArr;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr2 = (int[]) it.next();
                String str = new String(iArr2, 0, iArr2.length);
                g(str, 0, str.length(), 1, true, new er4(str));
            }
        }
    }

    public pv0(jq8 jq8) {
        jq8 jq82 = jq8;
        this.a = 4;
        this.c = new ArrayList();
        this.o = new ArrayList();
        this.v = new ArrayList();
        jq82.U(this);
        yl4 yl4 = new yl4(16, false);
        while (true) {
            iq8 iq8 = jq82.b;
            hf4 hf4 = iq8.b;
            if (hf4 != null) {
                int g = jq82.a.g(hf4, yl4);
                boolean z = this.b;
                if (z && ((snd) this.w) != null) {
                    return;
                }
                if (g == 1) {
                    long j = yl4.b;
                    Uri uri = iq8.a.getUri();
                    if (uri != null) {
                        iq8.close();
                        iq8.G(new q74(uri, 0, 1, (byte[]) null, Collections.emptyMap(), j, -1, (String) null, 0, (Object) null));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (g == -1 && z) {
                    return;
                } else {
                    if (g == -1) {
                        throw new RuntimeException("Invalid media specified=" + jq82.c);
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }
}
