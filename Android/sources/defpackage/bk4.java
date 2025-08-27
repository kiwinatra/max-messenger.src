package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.d;
import one.me.rlottie.e;
import one.me.rlottie.g;
import org.apache.http.util.LangUtils;
import org.webrtc.EglRenderer;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* renamed from: bk4  reason: default package */
public final /* synthetic */ class bk4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bk4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        r55 r55;
        Executor executor;
        long j;
        boolean z;
        long j2;
        boolean z2;
        long j3;
        switch (this.a) {
            case 0:
                gk4 gk4 = (gk4) this.b;
                gk4.getClass();
                int i = ((cs) this.c).b;
                gk4.f.I();
                return;
            case 1:
                gk4 gk42 = (gk4) this.b;
                gk42.getClass();
                gk42.f.a(VideoFrameProcessingException.a((InterruptedException) this.c));
                return;
            case 2:
                Callable callable = (Callable) this.b;
                u6h u6h = (u6h) this.c;
                try {
                    ((rl4) u6h.b).i(callable.call());
                    return;
                } catch (Exception e) {
                    ((rl4) u6h.b).j(e);
                    return;
                }
            case 3:
                yp4 yp4 = (yp4) this.b;
                if (yp4.d.offer((Runnable) this.c)) {
                    yp4.a();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            case 4:
                e eVar = (e) this.b;
                eVar.g--;
                SparseIntArray sparseIntArray = eVar.b;
                d dVar = (d) this.c;
                int i2 = sparseIntArray.get(dVar.o) - 1;
                int i3 = dVar.o;
                if (i2 == 0) {
                    sparseIntArray.delete(i3);
                    eVar.c.remove(dVar);
                    eVar.a.add(dVar);
                    return;
                }
                sparseIntArray.put(i3, i2);
                return;
            case 5:
                g gVar = (g) this.b;
                gVar.g--;
                SparseIntArray sparseIntArray2 = gVar.b;
                d dVar2 = (d) this.c;
                int i4 = sparseIntArray2.get(dVar2.o) - 1;
                int i5 = dVar2.o;
                if (i4 == 0) {
                    sparseIntArray2.delete(i5);
                    gVar.c.remove(dVar2);
                    gVar.a.add(dVar2);
                    return;
                }
                sparseIntArray2.put(i5, i4);
                return;
            case 6:
                jt4.a((jt4) this.c, ((it4) this.b).b.l);
                return;
            case 7:
                px4 px4 = (px4) this.b;
                px4.v++;
                z3f z3f = (z3f) this.c;
                boolean z3 = z3f.f;
                nx4 nx4 = px4.a;
                ck6.d((AtomicBoolean) nx4.c, true);
                ck6.c((Thread) nx4.e);
                SurfaceTexture surfaceTexture = new SurfaceTexture(z3 ? nx4.o : nx4.p);
                Size size = z3f.b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                Surface surface = new Surface(surfaceTexture);
                z3f.b(surface, px4.c, new ox4(px4, surfaceTexture, surface, 0));
                if (z3f.f) {
                    px4.z = surfaceTexture;
                    return;
                }
                px4.X = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(px4, px4.o);
                return;
            case 8:
                px4 px42 = (px4) this.b;
                ew6 ew6 = px42.c;
                s3f s3f = (s3f) this.c;
                Surface b2 = s3f.b(ew6, new pv1(2, (Object) px42, (Object) s3f));
                px42.a.o(b2);
                px42.y.put(s3f, b2);
                return;
            case 9:
                ((EglRenderer) this.b).lambda$releaseEglSurface$3((Runnable) this.c);
                return;
            case 10:
                ((EglRenderer) this.b).lambda$release$0((CountDownLatch) this.c);
                return;
            case 11:
                ((g65) this.b).m.remove((eg7) this.c);
                return;
            case 12:
                e65 e65 = (e65) this.c;
                Objects.requireNonNull(e65);
                ((Executor) this.b).execute(new ne4(18, e65));
                return;
            case 13:
                ((g65) this.b).l.remove((do1) this.c);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ((iha) ((Map.Entry) this.b).getKey()).a((du0) this.c);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((iha) this.b).a((du0) this.c);
                return;
            case 16:
                LinkedHashMap linkedHashMap = ((c65) this.b).a;
                iha iha = (iha) this.c;
                iha.getClass();
                linkedHashMap.remove(iha);
                return;
            case LangUtils.HASH_SEED /*17*/:
                g65 g65 = ((e65) this.b).k;
                switch (tr1.y(g65.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.c;
                        g65.b(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(g63.s(g65.D)));
                }
            case 18:
                e65 e652 = (e65) this.b;
                MediaFormat mediaFormat = (MediaFormat) this.c;
                if (e652.j) {
                    String str = e652.k.a;
                    return;
                }
                switch (tr1.y(e652.k.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (e652.k.b) {
                            g65 g652 = e652.k;
                            r55 = g652.r;
                            executor = g652.s;
                        }
                        try {
                            executor.execute(new bk4(19, r55, mediaFormat));
                            return;
                        } catch (RejectedExecutionException unused) {
                            String str2 = e652.k.a;
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(g63.s(e652.k.D)));
                }
            case 19:
                ((r55) this.b).s(new rt3(24, (Object) (MediaFormat) this.c));
                return;
            case 20:
                ((r55) this.b).o((h55) this.c);
                return;
            case 21:
                ((o55) this.b).a((Surface) this.c);
                return;
            case 22:
                tc5 tc5 = (tc5) this.b;
                ad5 ad5 = (ad5) this.c;
                int i6 = tc5.Q0 - ad5.b;
                tc5.Q0 = i6;
                boolean z4 = true;
                if (ad5.e) {
                    tc5.R0 = ad5.c;
                    tc5.S0 = true;
                }
                if (i6 == 0) {
                    jkf jkf = ((eob) ad5.f).a;
                    if (!tc5.o1.a.q() && jkf.q()) {
                        tc5.p1 = -1;
                        tc5.q1 = 0;
                    }
                    if (!jkf.q()) {
                        List asList = Arrays.asList(((cqb) jkf).k);
                        n79.n(asList.size() == tc5.x0.size());
                        for (int i7 = 0; i7 < asList.size(); i7++) {
                            ((rc5) tc5.x0.get(i7)).c = (jkf) asList.get(i7);
                        }
                    }
                    if (tc5.S0) {
                        if (((eob) ad5.f).b.equals(tc5.o1.b) && ((eob) ad5.f).d == tc5.o1.s) {
                            z4 = false;
                        }
                        if (z4) {
                            if (jkf.q() || ((eob) ad5.f).b.b()) {
                                j = ((eob) ad5.f).d;
                            } else {
                                eob eob = (eob) ad5.f;
                                nz8 nz8 = eob.b;
                                long j4 = eob.d;
                                Object obj = nz8.a;
                                ekf ekf = tc5.w0;
                                jkf.h(obj, ekf);
                                j = j4 + ekf.e;
                            }
                            z = z4;
                            tc5.S0 = false;
                            tc5.H1((eob) ad5.f, 1, z, tc5.R0, j, -1, false);
                            return;
                        }
                        z = z4;
                    } else {
                        z = false;
                    }
                    j = -9223372036854775807L;
                    tc5.S0 = false;
                    tc5.H1((eob) ad5.f, 1, z, tc5.R0, j, -1, false);
                    return;
                }
                return;
            case 23:
                sc5 sc5 = (sc5) this.b;
                zc5 zc5 = (zc5) this.c;
                int i8 = sc5.L0 - zc5.c;
                sc5.L0 = i8;
                boolean z5 = true;
                if (zc5.d) {
                    sc5.M0 = zc5.e;
                    sc5.N0 = true;
                }
                if (zc5.f) {
                    sc5.O0 = zc5.g;
                }
                if (i8 == 0) {
                    ikf ikf = zc5.b.a;
                    if (!sc5.i1.a.q() && ikf.q()) {
                        sc5.j1 = -1;
                        sc5.k1 = 0;
                    }
                    if (!ikf.q()) {
                        List asList2 = Arrays.asList(((bqb) ikf).y);
                        y64.j(asList2.size() == sc5.x0.size());
                        for (int i9 = 0; i9 < asList2.size(); i9++) {
                            ((qc5) sc5.x0.get(i9)).b = (ikf) asList2.get(i9);
                        }
                    }
                    if (sc5.N0) {
                        if (zc5.b.b.equals(sc5.i1.b) && zc5.b.d == sc5.i1.s) {
                            z5 = false;
                        }
                        if (z5) {
                            if (ikf.q() || zc5.b.b.a()) {
                                j3 = zc5.b.d;
                            } else {
                                dob dob = zc5.b;
                                mz8 mz8 = dob.b;
                                long j5 = dob.d;
                                Object obj2 = mz8.a;
                                dkf dkf = sc5.w0;
                                ikf.h(obj2, dkf);
                                j3 = j5 + dkf.v;
                            }
                            j2 = j3;
                        } else {
                            j2 = -9223372036854775807L;
                        }
                        z2 = z5;
                    } else {
                        j2 = -9223372036854775807L;
                        z2 = false;
                    }
                    sc5.N0 = false;
                    sc5.E1(zc5.b, 1, sc5.O0, false, z2, sc5.M0, j2, -1);
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                tpb tpb = (tpb) this.c;
                ((ed5) this.b).getClass();
                try {
                    synchronized (tpb) {
                    }
                    tpb.a.a(tpb.d, tpb.e);
                    tpb.b(true);
                    return;
                } catch (ExoPlaybackException e2) {
                    iq.a("Unexpected error delivering message on external thread.", e2);
                    throw new RuntimeException(e2);
                } catch (Throwable th) {
                    tpb.b(true);
                    throw th;
                }
            case 25:
                upb upb = (upb) this.c;
                ((fd5) this.b).getClass();
                try {
                    synchronized (upb) {
                    }
                    upb.a.a(upb.d, upb.e);
                    upb.b(true);
                    return;
                } catch (androidx.media3.exoplayer.ExoPlaybackException e3) {
                    i8b.p("Unexpected error delivering message on external thread.", e3);
                    throw new RuntimeException(e3);
                } catch (Throwable th2) {
                    upb.b(true);
                    throw th2;
                }
            case 26:
                kf5 kf5 = (kf5) this.b;
                kf5.getClass();
                ((gy0) kf5.a).v(new jf5(kf5, (CountDownLatch) this.c, 1));
                return;
            case 27:
                ni3 ni3 = (ni3) this.b;
                ni3.getClass();
                ((m56) ni3.b).m(-1, new lc5(ni3, (hrf) this.c));
                return;
            case 28:
                FeedbackListenerManagerImpl.onFeedback$lambda$2((FeedbackListenerManagerImpl) this.b, (ArrayList) ((List) this.c));
                return;
            default:
                vo5 vo5 = (vo5) this.b;
                vo5.getClass();
                vo5.k.a(VideoFrameProcessingException.a((InterruptedException) this.c));
                return;
        }
    }
}
