package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import org.webrtc.DumpCallback;
import org.webrtc.PeerConnectionFactory;

/* renamed from: uy0  reason: default package */
public final /* synthetic */ class uy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ uy0(tp8 tp8, AtomicInteger atomicInteger, List list, ArrayList arrayList, int i) {
        this.a = 2;
        this.c = tp8;
        this.o = atomicInteger;
        this.v = list;
        this.w = arrayList;
        this.b = i;
    }

    public final void run() {
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                hz0 hz0 = (hz0) this.c;
                String str = (String) this.o;
                int i = this.b;
                Set set = (Set) this.v;
                DumpCallback dumpCallback = (DumpCallback) this.w;
                hz0.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = hz0.i1.d;
                    if (peerConnectionFactory != null) {
                        peerConnectionFactory.submitDumpRequest(str, (int) TimeUnit.SECONDS.toMillis((long) i), set, dumpCallback);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    hz0.T0.logException("OKRTCCall", "Error starting local audio dump", th);
                    return;
                }
            case 1:
                int i2 = this.b + 1;
                sz0 sz0 = (sz0) ((Function0) this.v);
                j6 j6Var = (j6) ((Function0) this.w);
                g71 g71 = (g71) this.c;
                g71.getClass();
                ViewPager2 viewPager2 = (ViewPager2) this.o;
                if (!viewPager2.isInLayout()) {
                    sz0.invoke();
                    return;
                } else if (i2 == 5) {
                    j6Var.invoke();
                    return;
                } else {
                    viewPager2.post(new uy0(g71, viewPager2, i2, sz0, j6Var, 1));
                    return;
                }
            case 2:
                tp8 tp8 = (tp8) this.c;
                tp8.getClass();
                int incrementAndGet = ((AtomicInteger) this.o).incrementAndGet();
                List list = (List) this.v;
                if (incrementAndGet == list.size()) {
                    int i3 = 0;
                    while (true) {
                        List list2 = (List) this.w;
                        if (i3 < list2.size()) {
                            zz7 zz7 = (zz7) list2.get(i3);
                            if (zz7 != null) {
                                try {
                                    bitmap = (Bitmap) o5a.p(zz7);
                                } catch (CancellationException | ExecutionException e) {
                                    i8b.l(e, "Failed to get bitmap");
                                }
                                tp8.g.e(ft7.g((ir8) list.get(i3), bitmap), this.b + i3);
                                i3++;
                            }
                            bitmap = null;
                            tp8.g.e(ft7.g((ir8) list.get(i3), bitmap), this.b + i3);
                            i3++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                hy8 hy8 = (hy8) this.w;
                iy8 iy8 = (iy8) this.c;
                if (!iy8.w.i()) {
                    boolean isActive = iy8.X.a.a.isActive();
                    yvd yvd = (yvd) this.o;
                    int i4 = this.b;
                    ly8 ly8 = (ly8) this.v;
                    if (!isActive) {
                        StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb.append(yvd == null ? Integer.valueOf(i4) : yvd.b);
                        sb.append(", pid=");
                        sb.append(ly8.a.b);
                        i8b.V(sb.toString());
                        return;
                    }
                    cx8 Y = iy8.Y(ly8);
                    m7f m7f = iy8.v;
                    if (yvd != null) {
                        if (!m7f.s(Y, yvd)) {
                            return;
                        }
                    } else if (!m7f.r(Y, i4)) {
                        return;
                    }
                    try {
                        hy8.b(Y);
                        return;
                    } catch (RemoteException e2) {
                        i8b.W("Exception in " + Y, e2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public /* synthetic */ uy0(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
        this.v = obj3;
        this.w = obj4;
    }
}
