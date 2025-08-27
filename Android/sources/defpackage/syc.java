package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.WorkRequest;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import kotlin.ranges.RangesKt;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: syc  reason: default package */
public final class syc implements fn7, Provider, q28, uoe, mn8, z7, p4, qk3, kxg, mx3 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ syc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void E(t28 t28, long j, long j2, boolean z) {
    }

    public void H(t28 t28, long j, long j2) {
        boolean z;
        y35 y35 = (y35) this.b;
        if (y35 != null) {
            synchronized (fqc.d) {
                z = fqc.e;
            }
            if (!z) {
                ((o64) y35.b).x(new IOException(new ConcurrentModificationException()));
                return;
            }
            y35.q();
        }
    }

    public p01 Z(t28 t28, long j, long j2, IOException iOException, int i) {
        y35 y35 = (y35) this.b;
        if (y35 != null) {
            ((o64) y35.b).x(iOException);
        }
        return l15.v;
    }

    public void a(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    public void accept(Object obj) {
        z68.c(ipg.o, "initialized!", new Object[0]);
        ((ipg) this.b).j = true;
        ((ipg) this.b).i((apg) obj);
        apg h = ((ipg) this.b).h();
        akd akd = (akd) ((ipg) this.b).d;
        akd.getClass();
        i8b.S(h, Integer.valueOf(RangesKt.coerceAtLeast((int) akd.r(PmsKey.f124wmbacklogworkerbackoffdelaysec, (long) 10), 1)), (hqg) null);
    }

    public void b(gpe gpe) {
        ((jse) this.b).w.a(gpe);
    }

    public void c(j55 j55, int i) {
        jd4 p0;
        j55 j552;
        xb7 xb7 = null;
        t3d t3d = (t3d) this.b;
        if (j55 != null) {
            ta7 ta7 = t3d.d;
            j55.m0();
            sa7 createImageTranscoder = ta7.createImageTranscoder(j55.c, t3d.c);
            createImageTranscoder.getClass();
            zi0 zi0 = t3d.b;
            yvb yvb = t3d.e;
            ik0 ik0 = (ik0) yvb;
            ik0.c.j(yvb, "ResizeAndRotateProducer");
            qa7 qa7 = ik0.a;
            p7d p7d = t3d.h.b;
            p7d.getClass();
            f69 f69 = new f69((d69) p7d.b);
            try {
                f8d f8d = qa7.j;
                v3d v3d = qa7.i;
                j55.m0();
                jq5 b2 = createImageTranscoder.b(j55, f69, f8d, v3d, j55.X);
                int i2 = b2.b;
                if (i2 != 2) {
                    xb7 = t3d.m(j55, qa7.i, b2, createImageTranscoder.a());
                    p0 = y33.p0(f69.n());
                    j552 = new j55(p0);
                    j552.c = eg4.a;
                    j552.U();
                    ((ik0) yvb).c.a(yvb, "ResizeAndRotateProducer", xb7);
                    if (i2 != 1) {
                        i |= 16;
                    }
                    zi0.g(i, j552);
                    j55.b(j552);
                    y33.U(p0);
                    f69.close();
                    return;
                }
                throw new RuntimeException("Error while transcoding the image");
            } catch (Exception e) {
                ((ik0) yvb).c.d(yvb, "ResizeAndRotateProducer", e, xb7);
                if (zi0.a(i)) {
                    zi0.e(e);
                }
            } catch (Throwable th) {
                f69.close();
                throw th;
            }
        } else {
            t3d.b.g(i, (Object) null);
        }
    }

    public void d() {
    }

    public boolean e(View view) {
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) ((srd) this.b).o;
        if (viewPager2.D0) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    public void f(gpe gpe) {
        sr8 sr8 = (sr8) ((jse) this.b).w.a.b.getValue();
        long j = gpe.a;
        sr8.getClass();
        or8 or8 = new or8(j);
        s85 s85 = sr8.v;
        xag.h(s85, or8);
        xag.h(s85, nr8.a);
    }

    public void flush() {
    }

    public void g(t9 t9Var) {
        int i = t9Var.a;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (i == 1) {
            recyclerView.z0.d0(t9Var.b, t9Var.d);
        } else if (i == 2) {
            recyclerView.z0.g0(t9Var.b, t9Var.d);
        } else if (i == 4) {
            recyclerView.z0.i0(recyclerView, t9Var.b, t9Var.d);
        } else if (i == 8) {
            recyclerView.z0.f0(t9Var.b, t9Var.d);
        }
    }

    public Object get() {
        lzf lzf = (lzf) ((Provider) this.b).get();
        HashMap hashMap = new HashMap();
        tub tub = tub.a;
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            Long l = 86400000L;
            hashMap.put(tub, new cc0(Long.valueOf(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).longValue(), l.longValue(), emptySet));
            tub tub2 = tub.c;
            Set emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                Long l2 = 1000L;
                Long l3 = 86400000L;
                hashMap.put(tub2, new cc0(l2.longValue(), l3.longValue(), emptySet2));
                tub tub3 = tub.b;
                if (Collections.emptySet() != null) {
                    Long l4 = 86400000L;
                    Long l5 = 86400000L;
                    Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new ofd[]{ofd.b})));
                    if (unmodifiableSet != null) {
                        hashMap.put(tub3, new cc0(l4.longValue(), l5.longValue(), unmodifiableSet));
                        if (lzf == null) {
                            throw new NullPointerException("missing required property: clock");
                        } else if (hashMap.keySet().size() >= tub.values().length) {
                            new HashMap();
                            return new bc0(lzf, hashMap);
                        } else {
                            throw new IllegalStateException("Not all priorities have been configured");
                        }
                    } else {
                        throw new NullPointerException("Null flags");
                    }
                } else {
                    throw new NullPointerException("Null flags");
                }
            } else {
                throw new NullPointerException("Null flags");
            }
        } else {
            throw new NullPointerException("Null flags");
        }
    }

    public void h(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int I = recyclerView.w.I();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < I; i6++) {
            View H = recyclerView.w.H(i6);
            pzc V = RecyclerView.V(H);
            if (V != null && !V.K() && (i4 = V.c) >= i && i4 < i5) {
                V.n(2);
                if (obj == null) {
                    V.n(1024);
                } else if ((1024 & V.X) == 0) {
                    if (V.Y == null) {
                        ArrayList arrayList = new ArrayList();
                        V.Y = arrayList;
                        V.Z = Collections.unmodifiableList(arrayList);
                    }
                    V.Y.add(obj);
                }
                ((bzc) H.getLayoutParams()).c = true;
            }
        }
        hzc hzc = recyclerView.c;
        for (int size = hzc.c.size() - 1; size >= 0; size--) {
            pzc pzc = (pzc) hzc.c.get(size);
            if (pzc != null && (i3 = pzc.c) >= i && i3 < i5) {
                pzc.n(2);
                hzc.f(size);
            }
        }
        recyclerView.u1 = true;
    }

    public void i(int i, h44 h44, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) h44.i, j, i2);
    }

    public void j(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int I = recyclerView.w.I();
        for (int i3 = 0; i3 < I; i3++) {
            pzc V = RecyclerView.V(recyclerView.w.H(i3));
            if (V != null && !V.K() && V.c >= i) {
                if (RecyclerView.K1) {
                    V.toString();
                }
                V.H(i2, false);
                recyclerView.q1.g = true;
            }
        }
        hzc hzc = recyclerView.c;
        int size = hzc.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            pzc pzc = (pzc) hzc.c.get(i4);
            if (pzc != null && pzc.c >= i) {
                if (RecyclerView.K1) {
                    pzc.toString();
                }
                pzc.H(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.t1 = true;
    }

    public void k(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int I = recyclerView.w.I();
        int i10 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i11 = 0; i11 < I; i11++) {
            pzc V = RecyclerView.V(recyclerView.w.H(i11));
            if (V != null && (i9 = V.c) >= i5 && i9 <= i4) {
                if (RecyclerView.K1) {
                    V.toString();
                }
                if (V.c == i) {
                    V.H(i2 - i, false);
                } else {
                    V.H(i3, false);
                }
                recyclerView.q1.g = true;
            }
        }
        hzc hzc = recyclerView.c;
        hzc.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = hzc.c.size();
        for (int i12 = 0; i12 < size; i12++) {
            pzc pzc = (pzc) hzc.c.get(i12);
            if (pzc != null && (i8 = pzc.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    pzc.H(i2 - i, false);
                } else {
                    pzc.H(i10, false);
                }
                if (RecyclerView.K1) {
                    pzc.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.t1 = true;
    }

    public Object n(Task task) {
        m8g m8g = (m8g) this.b;
        if (!task.h() && !((s7h) task).d) {
            Exception e = task.e();
            if (e instanceof ApiException) {
                int i = ((ApiException) e).a.a;
                if (i == 43001 || i == 43002 || i == 43003 || i == 17) {
                    o5h o5h = (o5h) m8g.b;
                    o5h.getClass();
                    qdf qdf = new qdf();
                    ((ExecutorService) o5h.c).execute(new tvg(2, (Object) o5h, (Object) qdf));
                    task = qdf.a;
                } else if (i == 43000) {
                    task = hsg.n(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                } else if (i == 15) {
                    return hsg.n(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    public void shutdown() {
    }

    public void start() {
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return a81.j(((long[]) this.b).length, "Subject{organizationIds=", "}");
            default:
                return super.toString();
        }
    }

    public Object y() {
        Context context = ((m5h) ((kxg) this.b)).a.a;
        if (context != null) {
            a81.l("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("AppUpdateListenerRegistry");
            new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
            Object obj = new Object();
            new HashSet();
            context.getApplicationContext();
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public syc(int i) {
        this.a = i;
        switch (i) {
            case 9:
                return;
            case 10:
                this.b = bk3.o;
                return;
            default:
                this.b = gsg.i;
                return;
        }
    }
}
