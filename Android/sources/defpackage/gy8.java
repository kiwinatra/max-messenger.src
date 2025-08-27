package defpackage;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* renamed from: gy8  reason: default package */
public final class gy8 implements mj6, bx8, ez6, yze {
    public Object a;
    public Object b;
    public Object c;
    public long o;
    public Object v;

    public static final List m(gy8 gy8, jj2 jj2, String str) {
        gy8.getClass();
        return SequencesKt.toList(SequencesKt.filter(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(jj2.c), new jkb(26, (Object) gy8)), new ued(8, gy8, str)), new duc(17)));
    }

    public static void n(ArrayList arrayList, List list) {
        String str = (String) SequencesKt.firstOrNull(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(list), new jkb()), new duc(16)));
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() > 0) {
                arrayList.add(str);
            }
        }
    }

    public void A() {
        iy8 iy8 = (iy8) this.v;
        iy8.Z(iy8.w.s);
    }

    public void B(int i) {
        px8 px8 = ((iy8) this.v).X;
        int n = ft7.n(i);
        kx8 kx8 = px8.a;
        if (kx8.j != n) {
            kx8.j = n;
            synchronized (kx8.d) {
                for (int beginBroadcast = kx8.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((e67) kx8.f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(n);
                    } catch (RemoteException unused) {
                    }
                }
                kx8.f.finishBroadcast();
            }
        }
    }

    public void C(boolean z) {
        px8 px8 = ((iy8) this.v).X;
        dc7 dc7 = ft7.a;
        kx8 kx8 = px8.a;
        if (kx8.k != z) {
            kx8.k = z ? 1 : 0;
            synchronized (kx8.d) {
                for (int beginBroadcast = kx8.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((e67) kx8.f.getBroadcastItem(beginBroadcast)).onShuffleModeChanged(z);
                    } catch (RemoteException unused) {
                    }
                }
                kx8.f.finishBroadcast();
            }
        }
    }

    public void D(jkf jkf) {
        F(jkf);
        E();
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [gy8, mj6, java.lang.Object] */
    public void E() {
        Bitmap bitmap;
        xq8 xq8;
        iy8 iy8 = (iy8) this.v;
        ypb ypb = iy8.w.s;
        ir8 P0 = ypb.P0();
        us8 R0 = ypb.R0();
        long j = -9223372036854775807L;
        if ((!ypb.J0(16) || !ypb.T0()) && ypb.J0(16)) {
            j = ypb.e();
        }
        String str = P0 != null ? P0.a : "";
        Uri uri = (P0 == null || (xq8 = P0.b) == null) ? null : xq8.a;
        if (!Objects.equals((us8) this.a, R0) || !Objects.equals((String) this.b, str) || !Objects.equals((Uri) this.c, uri) || this.o != j) {
            this.b = str;
            this.c = uri;
            this.a = R0;
            this.o = j;
            yx8 yx8 = iy8.w;
            zz7 j2 = yx8.m.j(R0);
            if (j2 != null) {
                iy8.x0 = null;
                if (j2.isDone()) {
                    try {
                        bitmap = (Bitmap) o5a.p(j2);
                    } catch (CancellationException | ExecutionException e) {
                        i8b.V("Failed to load bitmap: " + e.getMessage());
                    }
                    iy8.P(iy8.X, ft7.l(R0, str, uri, j, bitmap));
                }
                ? obj = new Object();
                obj.v = this;
                obj.a = R0;
                obj.b = str;
                obj.c = uri;
                obj.o = j;
                iy8.x0 = obj;
                Handler handler = yx8.l;
                Objects.requireNonNull(handler);
                j2.d(new uj6(0, j2, obj), new oc4(handler, 0));
            }
            bitmap = null;
            iy8.P(iy8.X, ft7.l(R0, str, uri, j, bitmap));
        }
    }

    public void F(jkf jkf) {
        iy8 iy8 = (iy8) this.v;
        ypb ypb = iy8.w.s;
        if (!(ypb.v.a(17) && ypb.o().a(17)) || jkf.q()) {
            iy8.R(iy8.X, (ArrayList) null);
            return;
        }
        dc7 dc7 = ft7.a;
        ArrayList arrayList = new ArrayList();
        hkf hkf = new hkf();
        for (int i = 0; i < jkf.p(); i++) {
            arrayList.add(jkf.n(i, hkf, 0).c);
        }
        ArrayList arrayList2 = new ArrayList();
        po1 po1 = new po1(this, new AtomicInteger(0), arrayList, arrayList2, jkf, 5);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr = ((ir8) arrayList.get(i2)).d.k;
            if (bArr == null) {
                arrayList2.add((Object) null);
                po1.run();
            } else {
                yx8 yx8 = iy8.w;
                zz7 n = yx8.m.n(bArr);
                arrayList2.add(n);
                Handler handler = yx8.l;
                Objects.requireNonNull(handler);
                n.d(po1, new oc4(handler, 0));
            }
        }
    }

    public void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        gy8 gy8 = (gy8) this.v;
        iy8 iy8 = (iy8) gy8.v;
        if (this == iy8.x0) {
            long j = this.o;
            iy8.P(iy8.X, ft7.l((us8) this.a, (String) this.b, (Uri) this.c, j, bitmap));
            yx8 yx8 = ((iy8) gy8.v).w;
            v0g.W(yx8.o, new qx8(yx8, 1));
        }
    }

    public List c() {
        return (List) ((jna) ((rl) this.a)).U(new yt(this.o, "MEMBER", 0, 100, (String) null), (lfd) this.c).i(new ch2(24, this)).f();
    }

    public List f(String str) {
        wbe i = ((jna) ((rl) this.a)).U(new yt(this.o, "MEMBER", 0, 100, str == null ? null : (str.length() <= 1 || str.charAt(0) != '@') ? str : str.substring(1)), (lfd) this.c).i(new p7d(23, (Object) this, (Object) str));
        List emptyList = CollectionsKt.emptyList();
        Objects.requireNonNull(emptyList, "item is null");
        return (List) new hce(i, (zi6) null, emptyList).f();
    }

    public void g(Throwable th) {
        if (this == ((iy8) ((gy8) this.v).v).x0) {
            i8b.V("Failed to load bitmap: " + th.getMessage());
        }
    }

    public void h(int i, pob pob) {
        iy8 iy8 = (iy8) this.v;
        ypb ypb = iy8.w.s;
        iy8.Q(iy8, ypb);
        iy8.Z(ypb);
    }

    public void j(int i, qwd qwd, boolean z, boolean z2, int i2) {
        iy8 iy8 = (iy8) this.v;
        iy8.Z(iy8.w.s);
    }

    public dz6 k() {
        int ordinal = ((bl4) this.a).ordinal();
        if (ordinal == 0) {
            return (yqa) ((Lazy) this.c).getValue();
        }
        if (ordinal == 1) {
            return (wqa) ((Lazy) this.v).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public List l(LinkedHashSet linkedHashSet) {
        if (Looper.getMainLooper().isCurrentThread()) {
            z68.o("SuggestContactsNetworkRepository", "Load contacts was called from the main thread.", new IllegalStateException("Load contacts was called from the main thread."));
        }
        return (List) ev0.C(EmptyCoroutineContext.INSTANCE, new xze(this, linkedHashSet, (Continuation) null));
    }

    public void o(i30 i30) {
        iy8 iy8 = (iy8) this.v;
        if (iy8.w.s.D().a == 0) {
            int w = ft7.w(i30);
            kx8 kx8 = iy8.X.a;
            kx8.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(w);
            kx8.a.setPlaybackToLocal(builder.build());
        }
    }

    public void onDisconnected() {
    }

    public void p() {
        to0 to0;
        int i;
        iy8 iy8 = (iy8) this.v;
        ypb ypb = iy8.w.s;
        if (ypb.D().a == 0) {
            to0 = null;
        } else {
            pob o2 = ypb.o();
            if (o2.a.a(26, 34)) {
                i = o2.a.a(25, 33) ? 2 : 1;
            } else {
                i = 0;
            }
            Handler handler = new Handler(ypb.a.O0());
            int i2 = ypb.J0(23) ? ypb.i() : 0;
            in4 D = ypb.D();
            to0 = new to0(ypb, i, D.c, i2, D.d, handler);
        }
        iy8.v0 = to0;
        px8 px8 = iy8.X;
        if (to0 == null) {
            int w = ft7.w(ypb.J0(21) ? ypb.B() : i30.g);
            kx8 kx8 = px8.a;
            kx8.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(w);
            kx8.a.setPlaybackToLocal(builder.build());
            return;
        }
        kx8 kx82 = px8.a;
        kx82.getClass();
        kx82.a.setPlaybackToRemote(to0.a());
    }

    public void q(int i, boolean z) {
        to0 to0 = ((iy8) this.v).v0;
        if (to0 != null) {
            if (z) {
                i = 0;
            }
            to0.o = i;
            aeg.a(to0.a(), i);
        }
    }

    public void r() {
        iy8 iy8 = (iy8) this.v;
        iy8.Z(iy8.w.s);
    }

    public void s(ir8 ir8) {
        E();
        iy8 iy8 = (iy8) this.v;
        if (ir8 == null) {
            iy8.X.a.a.setRatingType(0);
        } else {
            px8 px8 = iy8.X;
            px8.a.a.setRatingType(ft7.x(ir8.d.i));
        }
        iy8.Z(iy8.w.s);
    }

    public void t() {
        iy8 iy8 = (iy8) this.v;
        iy8.Z(iy8.w.s);
    }

    public void u() {
        iy8 iy8 = (iy8) this.v;
        iy8.Z(iy8.w.s);
    }

    public void v() {
        iy8 iy8 = (iy8) this.v;
        iy8.Z(iy8.w.s);
    }

    public void w() {
        iy8 iy8 = (iy8) this.v;
        iy8.Z(iy8.w.s);
    }

    public void x(int i, ypb ypb) {
        D(ypb.Q0());
        z(ypb.J0(18) ? ypb.Y() : us8.J);
        ypb.R0();
        E();
        C(ypb.q0());
        B(ypb.getRepeatMode());
        ypb.D();
        p();
        iy8.Q((iy8) this.v, ypb);
        s(ypb.P0());
    }

    public void y() {
        iy8 iy8 = (iy8) this.v;
        iy8.Z(iy8.w.s);
    }

    public void z(us8 us8) {
        iy8 iy8 = (iy8) this.v;
        CharSequence queueTitle = ((uo8) iy8.X.b.b).a.getQueueTitle();
        CharSequence charSequence = us8.a;
        if (!TextUtils.equals(queueTitle, charSequence)) {
            ypb ypb = iy8.w.s;
            if (!ypb.v.a(17) || !ypb.o().a(17)) {
                charSequence = null;
            }
            iy8.X.a.a.setQueueTitle(charSequence);
        }
    }
}
