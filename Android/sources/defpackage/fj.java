package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt;
import kotlin.io.ConstantsKt;
import kotlin.text.StringsKt;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;

/* renamed from: fj  reason: default package */
public final class fj implements fn8, nj6, ya3, kha, yn1, gce, kxg {
    public static final rx0 o = new rx0(19);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ fj(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 5:
                Void voidR = (Void) obj;
                xr1 xr1 = (xr1) this.c;
                if (xr1.y0.b == 2 && xr1.Q0 == 9) {
                    ((xr1) this.c).E(10);
                    return;
                }
                return;
            case 22:
                ((gce) this.c).a(obj);
                return;
            default:
                Void voidR2 = (Void) obj;
                bs0.r((String) null, ((do1) this.b).b((Object) null));
                return;
        }
    }

    public void b() {
        ya3 ya3 = (ya3) this.b;
        try {
            ((qk3) ((na3) this.c).c).accept((Object) null);
            ya3.b();
        } catch (Throwable th) {
            hd8.Z(th);
            ya3.onError(th);
        }
    }

    public void c(mq4 mq4) {
        switch (this.a) {
            case 7:
                ((ya3) this.b).c(mq4);
                return;
            default:
                qq4.c((AtomicReference) this.b, mq4);
                return;
        }
    }

    public void d(Executor executor, iha iha) {
        synchronized (((HashMap) this.c)) {
            w08 w08 = (w08) ((HashMap) this.c).get(iha);
            if (w08 != null) {
                w08.a.set(false);
            }
            w08 w082 = new w08(executor, iha);
            ((HashMap) this.c).put(iha, w082);
            ryg.G().execute(new x55((Object) this, (Object) w08, (Object) w082, 12));
        }
    }

    public zz7 e() {
        return m5a.F(new lc5(24, (Object) this));
    }

    public void g(Throwable th) {
        fwd fwd;
        switch (this.a) {
            case 5:
                if (th instanceof DeferrableSurface$SurfaceClosedException) {
                    lk4 lk4 = ((DeferrableSurface$SurfaceClosedException) th).a;
                    Iterator it = ((xr1) this.c).a.F().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            fwd = (fwd) it.next();
                            if (fwd.b().contains(lk4)) {
                            }
                        } else {
                            fwd = null;
                        }
                    }
                    if (fwd != null) {
                        xr1 xr1 = (xr1) this.c;
                        xr1.getClass();
                        ew6 G = ryg.G();
                        dwd dwd = fwd.f;
                        if (dwd != null) {
                            new Throwable();
                            xr1.toString();
                            G.execute(new ir1(4, dwd, fwd));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (th instanceof CancellationException) {
                    ((xr1) this.c).toString();
                    return;
                } else {
                    if (((xr1) this.c).Q0 == 9) {
                        ((xr1) this.c).D(9, new ga0(th, 4), true);
                    }
                    Objects.toString((xr1) this.c);
                    xr1 xr12 = (xr1) this.c;
                    if (xr12.Z == ((jx1) this.b)) {
                        xr12.C();
                        return;
                    }
                    return;
                }
            default:
                if (th instanceof x3f) {
                    bs0.r((String) null, ((zz7) this.c).cancel(false));
                    return;
                } else {
                    bs0.r((String) null, ((do1) this.b).b((Object) null));
                    return;
                }
        }
    }

    public void h(jtc jtc, k4d k4d) {
        int intValue;
        k4d k4d2 = k4d;
        ce ceVar = k4d2.v0;
        int i = 1;
        try {
            ((ttc) this.b).a(k4d2, ceVar);
            jtc jtc2 = (jtc) ceVar.c;
            if (!jtc2.y) {
                jtc2.y = true;
                jtc2.c.j();
                mtc f = ((s95) ceVar.w).f();
                Socket socket = f.c;
                gtc gtc = f.g;
                ftc ftc = f.h;
                int i2 = 0;
                socket.setSoTimeout(0);
                f.k();
                ltc ltc = new ltc(ceVar, gtc, ftc);
                lx6 lx6 = k4d2.w;
                int size = lx6.size();
                int i3 = 0;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                Integer num = null;
                Integer num2 = null;
                while (i3 < size) {
                    if (StringsKt__StringsJVMKt.equals(lx6.d(i3), "Sec-WebSocket-Extensions", true)) {
                        String f2 = lx6.f(i3);
                        int i4 = i2;
                        while (i4 < f2.length()) {
                            int g = u0g.g(f2, ',', i4, i2, 4);
                            int e = u0g.e(';', i4, g, f2);
                            String x = u0g.x(i4, e, f2);
                            int i5 = e + i;
                            if (StringsKt__StringsJVMKt.equals(x, "permessage-deflate", true)) {
                                if (z) {
                                    z4 = true;
                                }
                                while (i5 < g) {
                                    int e2 = u0g.e(';', i5, g, f2);
                                    int e3 = u0g.e('=', i5, e2, f2);
                                    String x2 = u0g.x(i5, e3, f2);
                                    String t = e3 < e2 ? StringsKt__StringsKt.removeSurrounding(u0g.x(e3 + 1, e2, f2), (CharSequence) "\"") : null;
                                    int i6 = e2 + 1;
                                    if (StringsKt__StringsJVMKt.equals(x2, "client_max_window_bits", true)) {
                                        if (num != null) {
                                            z4 = true;
                                        }
                                        num = t != null ? StringsKt.toIntOrNull(t) : null;
                                        if (num != null) {
                                            i5 = i6;
                                        }
                                    } else {
                                        if (StringsKt__StringsJVMKt.equals(x2, "client_no_context_takeover", true)) {
                                            if (z2) {
                                                z4 = true;
                                            }
                                            if (t != null) {
                                                z4 = true;
                                            }
                                            z2 = true;
                                        } else if (StringsKt__StringsJVMKt.equals(x2, "server_max_window_bits", true)) {
                                            if (num2 != null) {
                                                z4 = true;
                                            }
                                            num2 = t != null ? StringsKt.toIntOrNull(t) : null;
                                            if (num2 != null) {
                                            }
                                        } else if (StringsKt__StringsJVMKt.equals(x2, "server_no_context_takeover", true)) {
                                            if (z3) {
                                                z4 = true;
                                            }
                                            if (t != null) {
                                                z4 = true;
                                            }
                                            z3 = true;
                                        }
                                        i5 = i6;
                                    }
                                    z4 = true;
                                    i5 = i6;
                                }
                                i4 = i5;
                                z = true;
                            } else {
                                i4 = i5;
                                z4 = true;
                            }
                            i = 1;
                            i2 = 0;
                        }
                    }
                    i3++;
                    i = 1;
                    i2 = 0;
                }
                ((ttc) this.b).v = new klg(z, num, z2, num2, z3, z4);
                if (z4 || num != null || (num2 != null && (8 > (intValue = num2.intValue()) || 15 < intValue))) {
                    synchronized (((ttc) this.b)) {
                        ((ttc) this.b).j.clear();
                        ((ttc) this.b).b(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    ((ttc) this.b).d(u0g.g + " WebSocket " + ((y2d) this.c).b.g(), ltc);
                    ((ttc) this.b).s.j();
                    ((ttc) this.b).e();
                } catch (Exception e4) {
                    ((ttc) this.b).c(e4);
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IOException e5) {
            if (ceVar != null) {
                ceVar.f(true, true, (IOException) null);
            }
            ((ttc) this.b).c(e5);
            u0g.c(k4d);
        }
    }

    public void i(iha iha) {
        synchronized (((HashMap) this.c)) {
            try {
                w08 w08 = (w08) ((HashMap) this.c).remove(iha);
                if (w08 != null) {
                    w08.a.set(false);
                    ryg.G().execute(new uo5(19, (Object) this, (Object) w08));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public du9 j(pf9 pf9) {
        float f;
        int t0 = pf9.t0();
        ln1 ln1 = null;
        Long l = null;
        float f2 = 1.0f;
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < t0; i++) {
            if (i == 0) {
                int w0 = pf9.w0();
                ln1 ln12 = (ln1) ((ConcurrentHashMap) ((wie) this.b).b).get(Integer.valueOf(w0));
                if (ln12 != null) {
                    ln1 = ln12;
                } else {
                    throw new RuntimeException(wj6.h(w0, "Can't find compact id for "));
                }
            } else if (i == 1) {
                byte readByte = pf9.readByte();
                if (readByte == -54) {
                    f = pf9.k0(4).getFloat(pf9.Y);
                } else if (readByte == -53) {
                    f = (float) pf9.k0(8).getDouble(pf9.Y);
                } else {
                    throw pf9.s0("Float", readByte);
                }
                f2 = f;
            } else if (i == 2) {
                z = pf9.v0();
            } else if (i != 3) {
                if (i != 4) {
                    pf9.A();
                } else {
                    z2 = pf9.v0();
                }
            } else if (pf9.n().a() == 3) {
                l = Long.valueOf(pf9.x0());
            }
        }
        if (ln1 != null) {
            return new du9(ln1, f2, z, l, z2);
        }
        throw new RuntimeException("Watch together parse error");
    }

    public void k(Object obj, String str) {
        ((ArrayList) this.b).add(g63.i(str, "=", String.valueOf(obj)));
    }

    public void l(long j, g1g g1g) {
        if (g1g.c() >= 9) {
            int h = g1g.h();
            int h2 = g1g.h();
            int v = g1g.v();
            if (h == 434 && h2 == 1195456820 && v == 3) {
                b0h.n(j, g1g, (ypf[]) this.c);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.fy f(defpackage.dn8 r10) {
        /*
            r9 = this;
            nn8 r0 = r10.a
            java.lang.String r0 = r0.a
            r1 = 0
            java.lang.String r2 = "createCodec:"
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0016 }
            int r4 = r3.length()     // Catch:{ Exception -> 0x0016 }
            if (r4 == 0) goto L_0x0019
            java.lang.String r2 = r2.concat(r3)     // Catch:{ Exception -> 0x0016 }
            goto L_0x001f
        L_0x0016:
            r9 = move-exception
            r0 = r1
            goto L_0x0056
        L_0x0019:
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0016 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0016 }
            r2 = r3
        L_0x001f:
            defpackage.m5a.f(r2)     // Catch:{ Exception -> 0x0016 }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0016 }
            fy r2 = new fy     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r3 = r9.b     // Catch:{ Exception -> 0x0055 }
            s2f r3 = (defpackage.s2f) r3     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0055 }
            r5 = r3
            android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r9 = r9.c     // Catch:{ Exception -> 0x0055 }
            s2f r9 = (defpackage.s2f) r9     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r9 = r9.get()     // Catch:{ Exception -> 0x0055 }
            r6 = r9
            android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch:{ Exception -> 0x0055 }
            r7 = 0
            r8 = 1
            r3 = r2
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0055 }
            defpackage.m5a.s()     // Catch:{ Exception -> 0x0052 }
            android.media.MediaFormat r9 = r10.b     // Catch:{ Exception -> 0x0052 }
            android.view.Surface r1 = r10.d     // Catch:{ Exception -> 0x0052 }
            android.media.MediaCrypto r10 = r10.e     // Catch:{ Exception -> 0x0052 }
            defpackage.fy.b(r2, r9, r1, r10)     // Catch:{ Exception -> 0x0052 }
            return r2
        L_0x0052:
            r9 = move-exception
            r1 = r2
            goto L_0x0056
        L_0x0055:
            r9 = move-exception
        L_0x0056:
            if (r1 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x0061
            r0.release()
            goto L_0x0061
        L_0x005e:
            r1.release()
        L_0x0061:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj.f(dn8):fy");
    }

    public void n(wf5 wf5, qtf qtf) {
        int i = 0;
        while (true) {
            ypf[] ypfArr = (ypf[]) this.c;
            if (i < ypfArr.length) {
                qtf.a();
                qtf.b();
                ypf B = wf5.B(qtf.e, 3);
                ca6 ca6 = (ca6) ((List) this.b).get(i);
                String str = ca6.Z;
                boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
                String valueOf = String.valueOf(str);
                y64.f(valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "), z);
                aa6 aa6 = new aa6();
                qtf.b();
                aa6.a = qtf.f;
                aa6.k = str;
                aa6.d = ca6.o;
                aa6.c = ca6.c;
                aa6.C = ca6.M0;
                aa6.m = ca6.w0;
                B.d(new ca6(aa6));
                ypfArr[i] = B;
                i++;
            } else {
                return;
            }
        }
    }

    public void o(jtc jtc, IOException iOException) {
        ((ttc) this.b).c(iOException);
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 7:
                try {
                    ((qk3) ((na3) this.c).c).accept(th);
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    th = new CompositeException(th, th2);
                }
                ((ya3) this.b).onError(th);
                return;
            default:
                ((gce) this.c).onError(th);
                return;
        }
    }

    public byte[] p(c95 c95) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        try {
            dataOutputStream.writeBytes(c95.a);
            dataOutputStream.writeByte(0);
            String str = c95.b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c95.c);
            dataOutputStream.writeLong(c95.o);
            dataOutputStream.write(c95.v);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ni0 q() {
        u9a u9a = new u9a(21);
        Context context = (Context) this.b;
        ni0 ni0 = (ni0) this.c;
        return new ni0(3, (Object) new pyc[]{u9a, new cs(context, ni0), new Object(), new Object(), new u9a(21), new wsb(context, ni0)});
    }

    public b r() {
        hn hnVar = (hn) ((WeakReference) this.c).get();
        a aVar = (a) ((WeakReference) this.b).get();
        return (hnVar != null || aVar == null) ? hnVar : aVar.M1();
    }

    public synchronized Map s() {
        try {
            if (((Map) this.c) == null) {
                this.c = Collections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (Map) this.c;
    }

    public xeg t(pf9 pf9) {
        int t0 = pf9.t0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < t0; i++) {
            try {
                arrayList.add(j(pf9));
            } catch (Throwable th) {
                ((voc) this.c).log("WatchTogetherUpdateParser", "Can't parse video state update " + th);
            }
        }
        return new xeg(new eu9(arrayList));
    }

    public String toString() {
        switch (this.a) {
            case 16:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case 18:
                String str = "[ ";
                if (((sfe) this.b) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        StringBuilder o2 = tr1.o(str);
                        o2.append(((sfe) this.b).y[i2]);
                        o2.append(" ");
                        str = o2.toString();
                    }
                }
                StringBuilder m = g63.m(str, "] ");
                m.append((sfe) this.b);
                return m.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.c;
        cardView.o.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        fj.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public zpf v(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                i8b.o("Unmatched track of type: " + i);
                return new ip4();
            } else if (i == iArr[i2]) {
                return ((jcd[]) this.c)[i2];
            } else {
                i2++;
            }
        }
    }

    public Object y() {
        Context context = ((m5h) ((kxg) this.b)).a.a;
        if (context != null) {
            return new a7h(context, (f7h) ((kxg) this.c).y());
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ fj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ fj(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public fj(m7h m7h, o15 o15, int i) {
        this.a = 28;
        this.c = m7h;
        this.b = o15;
    }

    public fj(int i, byte b2) {
        this.a = i;
        switch (i) {
            case 10:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(ConstantsKt.MINIMUM_BLOCK_SIZE);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                return;
            case 12:
                this.b = new HashMap();
                return;
            case 13:
                this.b = new u08();
                this.c = new HashMap();
                return;
            case 20:
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                this.b = new ConcurrentHashMap();
                this.c = new ReferenceQueue();
                return;
            default:
                this.b = new AtomicReference(Float.valueOf(c44.DEFAULT_ASPECT_RATIO));
                this.c = new AtomicBoolean(false);
                return;
        }
    }

    public fj(hr6 hr6, t6e t6e, ui uiVar, ic3 ic3) {
        this.a = 0;
        this.b = uiVar;
        this.c = o;
    }

    public /* synthetic */ fj(Object obj) {
        this.a = 16;
        vzg.m(obj);
        this.c = obj;
        this.b = new ArrayList();
    }

    public fj(a aVar) {
        this.a = 8;
        this.b = new WeakReference(aVar);
        this.c = new WeakReference((Object) null);
    }

    public fj(Context context, int i) {
        this.a = i;
        switch (i) {
            case LangUtils.HASH_SEED /*17*/:
                this.b = context;
                this.c = LazyKt.lazy(new c28(29, this));
                return;
            default:
                this.b = context;
                ni0 ni0 = new ni0(0);
                this.c = ni0;
                ni0.K(context.getApplicationInfo().sourceDir);
                return;
        }
    }

    public fj(hn hnVar) {
        this.a = 8;
        this.c = new WeakReference(hnVar);
        this.b = new WeakReference((Object) null);
    }

    public fj(tsd tsd) {
        this.a = 26;
        this.b = tsd;
        this.c = new AtomicInteger(0);
    }

    public fj(List list) {
        this.a = 25;
        this.b = list;
        this.c = new ypf[list.size()];
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [srd, java.lang.Object] */
    public fj(mw9 mw9, grg grg, cq9 cq9) {
        this.a = 15;
        tc3 tc3 = new tc3();
        ? obj = new Object();
        obj.a = grg;
        obj.b = cq9;
        obj.c = tc3;
        obj.o = new ConcurrentHashMap();
        this.b = mw9;
        this.c = obj;
    }

    public fj(int i) {
        this.a = 2;
        ey eyVar = new ey(i, 0);
        ey eyVar2 = new ey(i, 2);
        this.b = eyVar;
        this.c = eyVar2;
    }

    public fj(Bundle bundle) {
        this.a = 14;
        this.b = "androidx.media3.session.MediaLibraryService";
        this.c = bundle;
    }
}
