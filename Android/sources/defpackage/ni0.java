package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.uuid.Uuid;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ni0  reason: default package */
public final class ni0 implements p4, pyc, do0, w5g, ncg {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ ni0(int i, Serializable serializable, int i2) {
        this.a = i2;
        this.b = i;
        this.c = serializable;
    }

    public static lx9 S() {
        q5a q5a = q5a.a;
        q5a.getClass();
        return new lx9(q5a);
    }

    public synchronized y33 A(int i) {
        return this.b == i ? y33.o((y33) this.c) : null;
    }

    public gb3 B() {
        jkb jkb = new jkb(15, (Object) this);
        RecyclerView recyclerView = (RecyclerView) this.c;
        return jha.n(recyclerView == null ? CollectionsKt.emptyList() : SequencesKt.toList(SequencesKt.mapNotNull(new mag(0, recyclerView), new v12(recyclerView, jkb))));
    }

    public int C() {
        int i = this.b;
        if (i != 0) {
            return ((int[]) this.c)[i - 1];
        }
        throw new NoSuchElementException();
    }

    public int D() {
        int i = this.b;
        if (i != 0) {
            int i2 = i - 1;
            this.b = i2;
            return ((int[]) this.c)[i2];
        }
        throw new NoSuchElementException();
    }

    public void E(int i) {
        int i2 = this.b;
        if (i2 != 0) {
            ((int[]) this.c)[i2 - 1] = i;
            return;
        }
        throw new NoSuchElementException();
    }

    public void F(long j) {
    }

    public void G(int i) {
        int[] iArr = (int[]) this.c;
        int length = iArr.length;
        if (this.b >= length) {
            int[] iArr2 = new int[(length * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.c = iArr2;
            iArr = iArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    public long H(gf4 gf4) {
        g1g g1g = (g1g) this.c;
        int i = 0;
        gf4.q(g1g.a, 0, 1, false);
        byte b2 = g1g.a[0] & UByte.MAX_VALUE;
        if (b2 == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = Uuid.SIZE_BITS;
        int i3 = 0;
        while ((b2 & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b2 & (~i2);
        gf4.q(g1g.a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (g1g.a[i] & UByte.MAX_VALUE) + (i4 << 8);
        }
        this.b = i3 + 1 + this.b;
        return (long) i4;
    }

    public void I() {
    }

    public long J(hf4 hf4) {
        l8b l8b = (l8b) this.c;
        int i = 0;
        hf4.q(l8b.a, 0, 1, false);
        byte b2 = l8b.a[0] & UByte.MAX_VALUE;
        if (b2 == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = Uuid.SIZE_BITS;
        int i3 = 0;
        while ((b2 & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b2 & (~i2);
        hf4.q(l8b.a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (l8b.a[i] & UByte.MAX_VALUE) + (i4 << 8);
        }
        this.b = i3 + 1 + this.b;
        return (long) i4;
    }

    public synchronized boolean K(String str) {
        for (String equals : (String[]) this.c) {
            if (str.equals(equals)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        N(sb);
        String[] strArr = (String[]) this.c;
        int i = this.b;
        strArr[i % strArr.length] = str;
        this.b = i + 1;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void L() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            qrf r0 = (defpackage.qrf) r0
            int r5 = r5.b
            zj4 r0 = r0.y0
            r0.getClass()
            monitor-enter(r0)
            android.util.SparseArray r1 = r0.g     // Catch:{ all -> 0x0045 }
            boolean r1 = defpackage.v0g.l(r1, r5)     // Catch:{ all -> 0x0045 }
            defpackage.n79.n(r1)     // Catch:{ all -> 0x0045 }
            int r1 = r0.o     // Catch:{ all -> 0x0045 }
            r2 = 1
            r3 = -1
            r4 = 0
            if (r1 == r3) goto L_0x001e
            r1 = r2
            goto L_0x001f
        L_0x001e:
            r1 = r4
        L_0x001f:
            defpackage.n79.n(r1)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = r0.g     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            yj4 r1 = (defpackage.yj4) r1     // Catch:{ all -> 0x0045 }
            r1.b = r2     // Catch:{ all -> 0x0045 }
            r1 = r4
        L_0x002d:
            android.util.SparseArray r3 = r0.g     // Catch:{ all -> 0x0045 }
            int r3 = r3.size()     // Catch:{ all -> 0x0045 }
            if (r1 >= r3) goto L_0x0047
            android.util.SparseArray r3 = r0.g     // Catch:{ all -> 0x0045 }
            java.lang.Object r3 = r3.valueAt(r1)     // Catch:{ all -> 0x0045 }
            yj4 r3 = (defpackage.yj4) r3     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.b     // Catch:{ all -> 0x0045 }
            if (r3 != 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0045:
            r5 = move-exception
            goto L_0x008d
        L_0x0047:
            r4 = r2
        L_0x0048:
            r0.h = r4     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = r0.g     // Catch:{ all -> 0x0045 }
            int r3 = r0.o     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x0045 }
            yj4 r1 = (defpackage.yj4) r1     // Catch:{ all -> 0x0045 }
            java.util.ArrayDeque r1 = r1.a     // Catch:{ all -> 0x0045 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x006c
            int r1 = r0.o     // Catch:{ all -> 0x0045 }
            if (r5 != r1) goto L_0x0063
            r0.c()     // Catch:{ all -> 0x0045 }
        L_0x0063:
            if (r4 == 0) goto L_0x006c
            rt6 r5 = r0.a     // Catch:{ all -> 0x0045 }
            r5.r()     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)
            goto L_0x008c
        L_0x006c:
            int r1 = r0.o     // Catch:{ all -> 0x0045 }
            if (r5 == r1) goto L_0x008b
            android.util.SparseArray r1 = r0.g     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            yj4 r5 = (defpackage.yj4) r5     // Catch:{ all -> 0x0045 }
            java.util.ArrayDeque r5 = r5.a     // Catch:{ all -> 0x0045 }
            int r5 = r5.size()     // Catch:{ all -> 0x0045 }
            if (r5 != r2) goto L_0x008b
            gy0 r5 = r0.f     // Catch:{ all -> 0x0045 }
            uj4 r1 = new uj4     // Catch:{ all -> 0x0045 }
            r2 = 2
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0045 }
            r5.v(r1)     // Catch:{ all -> 0x0045 }
        L_0x008b:
            monitor-exit(r0)
        L_0x008c:
            return
        L_0x008d:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni0.L():void");
    }

    public void M() {
        m22 m22 = m22.c;
        char[] cArr = (char[]) this.c;
        synchronized (m22) {
            try {
                int i = m22.a;
                if (cArr.length + i < us.a) {
                    m22.a = i + cArr.length;
                    ((ArrayDeque) m22.b).addLast(cArr);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void N(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.b);
            sb.append(" base apk paths.");
            if (this.b > 0) {
                sb.append(" Most recent ones:");
            }
            int i = 0;
            while (true) {
                String[] strArr = (String[]) this.c;
                if (i < strArr.length) {
                    int i2 = (this.b - i) - 1;
                    if (i2 >= 0) {
                        String str = strArr[i2 % strArr.length];
                        sb.append("\n");
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public ila O(int i) {
        pj3 pj3 = (pj3) this.c;
        int i2 = this.b;
        pj3.e(i2, 6, i, 7);
        return new ila(pj3, 6, i2, 4);
    }

    public ila P(int i) {
        pj3 pj3 = (pj3) this.c;
        int i2 = this.b;
        pj3.e(i2, 6, i, 6);
        return new ila(pj3, 6, i2, 4);
    }

    public ila Q(int i) {
        pj3 pj3 = (pj3) this.c;
        int i2 = this.b;
        pj3.e(i2, 3, i, 4);
        return new ila(pj3, 3, i2, 4);
    }

    public ila R(int i) {
        pj3 pj3 = (pj3) this.c;
        int i2 = this.b;
        pj3.e(i2, 3, i, 3);
        return new ila(pj3, 3, i2, 4);
    }

    public void T() {
        ((pj3) this.c).j(this.b).d.W = 2;
    }

    public void U(String str) {
        int length = str.length();
        if (length != 0) {
            w(this.b, length);
            str.getChars(0, str.length(), (char[]) this.c, this.b);
            this.b += length;
        }
    }

    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        qrf qrf = (qrf) this.c;
        qrf.getClass();
        qrf.w.execute(new sx8(10, qrf, videoFrameProcessingException));
    }

    public ila b(int i) {
        pj3 pj3 = (pj3) this.c;
        int i2 = this.b;
        pj3.e(i2, 4, i, 4);
        return new ila(pj3, 4, i2, 4);
    }

    public b6a c(int i) {
        b6a b6a = (b6a) ((SparseArray) this.c).get(i);
        if (b6a != null) {
            return b6a;
        }
        throw new IllegalArgumentException(wj6.h(i, "Cannot find the wrapper for global view type "));
    }

    public synchronized void clear() {
        h();
    }

    public ila d(int i) {
        pj3 pj3 = (pj3) this.c;
        int i2 = this.b;
        pj3.e(i2, 4, i, 3);
        return new ila(pj3, 4, i2, 4);
    }

    public boolean e(View view) {
        ((BottomSheetBehavior) this.c).K(this.b);
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [x1, nx9] */
    public nx9 f() {
        Map q = ((ld9) this.c).q();
        mx9 mx9 = new mx9(this.b);
        ? x1Var = new x1(q);
        x1Var.w = mx9;
        return x1Var;
    }

    public void g(int i, int i2) {
    }

    public synchronized void h() {
        y33.U((y33) this.c);
        this.c = null;
        this.b = -1;
    }

    public mcg i(b6a b6a) {
        return new eud(this, b6a);
    }

    public boolean j(UnsatisfiedLinkError unsatisfiedLinkError, nfe[] nfeArr) {
        int i;
        pyc[] pycArr;
        do {
            i = this.b;
            pycArr = (pyc[]) this.c;
            if (i >= pycArr.length) {
                return false;
            }
            this.b = i + 1;
        } while (!pycArr[i].j(unsatisfiedLinkError, nfeArr));
        return true;
    }

    public void k() {
        ((pj3) this.c).j(this.b).d.l0 = true;
    }

    public void l(InputStream inputStream, OutputStream outputStream) {
        qp6 qp6 = (qp6) this.c;
        int i = this.b;
        byte[] bArr = (byte[]) qp6.get(i);
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                qp6.b(bArr);
            }
        }
    }

    public int m() {
        f61 f61 = (f61) this.c;
        int i = f61.J0.a;
        int i2 = this.b;
        if (i != 0) {
            return i2;
        }
        if (f61.G0.j() == 0 || f61.G0.j() == 1) {
            return 1;
        }
        if (f61.G0.j() == 2) {
            return 2;
        }
        return i2;
    }

    public qca n(ex8 ex8, e63 e63) {
        yvd yvd = e63.a;
        int i = 0;
        n79.g(yvd != null && yvd.a == 0);
        yvd.getClass();
        Service service = (Service) this.c;
        IconCompat c2 = IconCompat.c(e63.d, service);
        Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
        intent.setData(ex8.a.b);
        intent.setComponent(new ComponentName(service, service.getClass()));
        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", yvd.b);
        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", yvd.c);
        int i2 = this.b + 1;
        this.b = i2;
        if (v0g.a >= 23) {
            i = 67108864;
        }
        return new qca(c2, e63.f, PendingIntent.getService(service, i2, intent, 134217728 | i));
    }

    public synchronized boolean o(int i) {
        return i == this.b && y33.m0((y33) this.c);
    }

    public qca p(ex8 ex8, IconCompat iconCompat, CharSequence charSequence, int i) {
        return new qca(iconCompat, charSequence, r(ex8, (long) i));
    }

    public synchronized y33 q() {
        return y33.o((y33) this.c);
    }

    public PendingIntent r(ex8 ex8, long j) {
        int i = 0;
        int i2 = (j == 8 || j == 9) ? 87 : (j == 6 || j == 7) ? 88 : j == 3 ? 86 : j == 12 ? 90 : j == 11 ? 89 : j == 1 ? 85 : 0;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(ex8.a.b);
        Service service = (Service) this.c;
        intent.setComponent(new ComponentName(service, service.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i2));
        int i3 = v0g.a;
        if (i3 >= 26 && j == 1 && !ex8.c().q()) {
            return PendingIntent.getForegroundService(service, i2, intent, 67108864);
        }
        if (i3 >= 23) {
            i = 67108864;
        }
        return PendingIntent.getService(service, i2, intent, i);
    }

    public synchronized void s(int i, y33 y33) {
        try {
            if (((y33) this.c) != null) {
                Object e0 = y33.e0();
                y33 y332 = (y33) this.c;
                if (Intrinsics.areEqual(e0, (Object) y332 != null ? (Bitmap) y332.e0() : null)) {
                    return;
                }
            }
            y33.U((y33) this.c);
            this.c = y33.o(y33);
            this.b = i;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public ila t(int i) {
        pj3 pj3 = (pj3) this.c;
        int i2 = this.b;
        pj3.e(i2, 7, i, 7);
        return new ila(pj3, 7, i2, 4);
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public void u(int i, y33 y33) {
    }

    public ila v(int i) {
        pj3 pj3 = (pj3) this.c;
        int i2 = this.b;
        pj3.e(i2, 7, i, 6);
        return new ila(pj3, 7, i2, 4);
    }

    public void w(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            this.c = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i3, i * 2));
        }
    }

    public void x(float f) {
        ((pj3) this.c).j(this.b).d.w = f;
    }

    public synchronized y33 y() {
        y33 o;
        try {
            o = y33.o((y33) this.c);
            h();
        } catch (Throwable th) {
            h();
            throw th;
        }
        return o;
    }

    public void z(int i) {
        ((pj3) this.c).j(this.b).d.V = i;
    }

    public /* synthetic */ ni0(int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = 0;
    }

    public /* synthetic */ ni0(int i, boolean z) {
        this.a = i;
    }

    public ni0(ld9 ld9) {
        this.a = 12;
        this.c = ld9;
        this.b = 2;
    }

    public /* synthetic */ ni0(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public ni0(int i, byte[] bArr) {
        this.a = 17;
        if (bArr == null) {
            throw new IllegalArgumentException("Illegal 'value' value: null");
        } else if (i != 0) {
            this.c = bArr;
            this.b = i;
        } else {
            throw new IllegalArgumentException("Illegal 'format' value: null");
        }
    }

    public ni0(bi3 bi3, int i) {
        this.a = 24;
        vzg.m(bi3);
        this.c = bi3;
        this.b = i;
    }

    public ni0(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.c = new Object();
                this.b = 0;
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                this.b = 50;
                return;
            case 19:
                this.c = new int[8];
                return;
            case 20:
                this.c = new g1g(8);
                return;
            case 21:
                this.c = new l8b(8);
                return;
            case 22:
                this.b = 30;
                this.c = new ConcurrentHashMap();
                return;
            default:
                this.c = new String[5];
                this.b = 0;
                return;
        }
    }

    public ni0(qp6 qp6) {
        this.a = 15;
        cvg.l(true);
        this.b = 16384;
        this.c = qp6;
    }

    public ni0(Notification notification) {
        this.a = 11;
        this.b = MultiFileUploader.MSG_TRY_UPLOAD_NEXT;
        notification.getClass();
        this.c = notification;
    }
}
