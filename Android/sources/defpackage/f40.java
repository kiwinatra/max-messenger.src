package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaRecorder;
import android.os.PowerManager;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.util.HandledException;

/* renamed from: f40  reason: default package */
public final class f40 implements MediaRecorder.OnInfoListener, jsd, gy9 {
    public static final /* synthetic */ int B0 = 0;
    public volatile long A0 = -1;
    public final Lazy X;
    public final Lazy Y;
    public final Lazy Z;
    public final Context a;
    public final sv0 b;
    public final xy9 c;
    public final Lazy o;
    public final Lazy v;
    public MediaRecorder v0;
    public final Lazy w;
    public final Lazy w0 = LazyKt.lazy(new a40(this, 0));
    public final Lazy x;
    public final Lazy x0 = LazyKt.lazy(new a40(this, 1));
    public final Lazy y;
    public final Lazy y0 = LazyKt.lazy(new a40(this, 2));
    public final Lazy z;
    public volatile long z0 = -1;

    public f40(Context context, sv0 sv0, Lazy lazy, Lazy lazy2, xy9 xy9, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8) {
        this.a = context;
        this.b = sv0;
        this.c = xy9;
        this.o = lazy;
        this.v = lazy2;
        this.w = lazy3;
        this.x = lazy4;
        this.y = lazy5;
        this.z = lazy6;
        this.X = lazy8;
        this.Y = lazy7;
        this.Z = LazyKt.lazy(new ur(1, lazy8));
        synchronized (xy9.q) {
            xy9.q.add(this);
        }
        sv0.d(this);
    }

    public static void v(PowerManager.WakeLock wakeLock, int i) {
        if (wakeLock.isHeld()) {
            z68.c("f40", "Releasing " + wakeLock, new Object[0]);
            wakeLock.release(i);
        }
    }

    public final boolean A(int i, int i2, Integer num, String str) {
        if (this.c.z) {
            B();
        }
        ((AudioManager) this.w0.getValue()).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 1);
        if (this.v0 != null) {
            C();
        }
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.v0 = mediaRecorder;
        try {
            mediaRecorder.setAudioSource(1);
            mediaRecorder.setOutputFormat(6);
            mediaRecorder.setAudioEncoder(i);
            mediaRecorder.setOnInfoListener(this);
            cud cud = ((ltb) this.w.getValue()).b;
            cud.getClass();
            mediaRecorder.setMaxDuration(((int) cud.r(PmsKey.f61maxaudiolength, (long) 3600)) * 1000);
            mediaRecorder.setAudioSamplingRate(i2);
            if (num != null) {
                mediaRecorder.setAudioEncodingBitRate(num.intValue());
            }
            mediaRecorder.setAudioChannels(1);
            mediaRecorder.setOutputFile(str);
            mediaRecorder.prepare();
            mediaRecorder.start();
            z68.c("f40", "startRecordAudio: started with encoder: " + i, new Object[0]);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            z68.f("f40", message + " encoder: " + i, (Throwable) null);
            C();
            return false;
        }
    }

    public final void B() {
        z68.c("f40", "stop", new Object[0]);
        z68.c("f40", "unsubscribe sensors controller", new Object[0]);
        ksd ksd = (ksd) this.o.getValue();
        Set set = ksd.d;
        if (set.remove(this) && set.size() == 0 && ksd.b != null) {
            ksd.a.unregisterListener(ksd);
        }
        this.c.w();
        t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C() {
        /*
            r3 = this;
            android.media.MediaRecorder r0 = r3.v0
            if (r0 == 0) goto L_0x0029
            if (r0 == 0) goto L_0x0024
            r0.stop()     // Catch:{ Exception -> 0x000c }
            goto L_0x0024
        L_0x000a:
            r0 = move-exception
            goto L_0x001c
        L_0x000c:
            r0 = move-exception
            java.lang.String r1 = "f40"
            java.lang.String r2 = "Can't stopRecordAudio"
            defpackage.z68.f(r1, r2, r0)     // Catch:{ all -> 0x000a }
            android.media.MediaRecorder r0 = r3.v0
            if (r0 == 0) goto L_0x0029
        L_0x0018:
            r0.release()
            goto L_0x0029
        L_0x001c:
            android.media.MediaRecorder r3 = r3.v0
            if (r3 == 0) goto L_0x0023
            r3.release()
        L_0x0023:
            throw r0
        L_0x0024:
            android.media.MediaRecorder r0 = r3.v0
            if (r0 == 0) goto L_0x0029
            goto L_0x0018
        L_0x0029:
            r0 = 0
            r3.v0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f40.C():void");
    }

    public final void a(long j, jr8 jr8) {
        y(j, jr8, false);
    }

    public final boolean b(long j) {
        xy9 xy9 = this.c;
        return xy9.p(j) && xy9.A;
    }

    public final void c(long j, jr8 jr8) {
        z68.f("f40", "onError " + j + " type " + jr8, (Throwable) null);
        z68.c("f40", "unsubscribe sensors controller", new Object[0]);
        ksd ksd = (ksd) this.o.getValue();
        Set set = ksd.d;
        if (set.remove(this) && set.size() == 0 && ksd.b != null) {
            ksd.a.unregisterListener(ksd);
        }
        y(j, jr8, false);
        t();
        if (jr8 == jr8.c) {
            w(j, 0);
        }
    }

    public final void d(long j, jr8 jr8, long j2, jr8 jr82) {
        StringBuilder sb = new StringBuilder("onAudioChanged prev=");
        sb.append(j);
        sb.append(" prevType=");
        sb.append(jr8);
        tr1.v(sb, ", curr=", j2, " currType=");
        sb.append(jr82);
        z68.c("f40", sb.toString(), new Object[0]);
        boolean z2 = this.c.C;
        if (j != -1 && jr8 == jr8.c && !z2) {
            w(j, 0);
        }
        y(j, jr8, false);
    }

    public final void e() {
        z68.c("f40", "onDeviceAwayFromEar", new Object[0]);
        if (q()) {
            Lazy lazy = this.x0;
            boolean z2 = false;
            if (lazy.isInitialized()) {
                v((PowerManager.WakeLock) lazy.getValue(), 0);
            }
            xy9 xy9 = this.c;
            if (xy9.z) {
                if (xy9.m() == jr8.c) {
                    z2 = true;
                }
                if (z2) {
                    xy9.q();
                }
            }
        }
    }

    public final void f(long j, jr8 jr8) {
        z68.c("f40", "onBuffering " + j + " type " + jr8, new Object[0]);
        pf6 pf6 = jr8.a;
        z68.c("f40", "unsubscribe sensors controller", new Object[0]);
        ksd ksd = (ksd) this.o.getValue();
        Set set = ksd.d;
        if (set.remove(this) && set.size() == 0 && ksd.b != null) {
            ksd.a.unregisterListener(ksd);
        }
        jr8 jr82 = jr8.c;
        Lazy lazy = this.y0;
        if (jr8 == jr82) {
            if (!r()) {
                ((PowerManager.WakeLock) lazy.getValue()).acquire();
            }
        } else if (r()) {
            v((PowerManager.WakeLock) lazy.getValue(), 0);
        }
        y(j, jr8, false);
    }

    public final void g(long j, jr8 jr8, long j2) {
        z68.c("f40", "onStop " + j + " type " + jr8, new Object[0]);
        z68.c("f40", "unsubscribe sensors controller", new Object[0]);
        ksd ksd = (ksd) this.o.getValue();
        Set set = ksd.d;
        if (set.remove(this) && set.size() == 0 && ksd.b != null) {
            ksd.a.unregisterListener(ksd);
        }
        y(j, jr8, false);
        t();
        if (jr8 == jr8.c) {
            w(j, j2);
        }
    }

    public final void h() {
        z68.c("f40", "onDeviceNextToEar", new Object[0]);
        xy9 xy9 = this.c;
        if (xy9.z) {
            if (!q()) {
                ((PowerManager.WakeLock) this.x0.getValue()).acquire();
            }
            if (xy9.z) {
                xy9.m();
                pf6 pf6 = jr8.a;
            }
        }
    }

    public final void i(long j, jr8 jr8) {
        z68.c("f40", "onPause " + j + " type " + jr8, new Object[0]);
        y(j, jr8, false);
    }

    public final void k(long j, jr8 jr8) {
        z68.c("f40", "onSkipToPrevious " + j + " type " + jr8, new Object[0]);
        y(j, jr8, false);
    }

    public final void l(long j, jr8 jr8) {
        z68.c("f40", "onPlay " + j + " type " + jr8, new Object[0]);
        pf6 pf6 = jr8.a;
        z68.c("f40", "unsubscribe sensors controller", new Object[0]);
        ksd ksd = (ksd) this.o.getValue();
        Set set = ksd.d;
        if (set.remove(this) && set.size() == 0 && ksd.b != null) {
            ksd.a.unregisterListener(ksd);
        }
        jr8 jr82 = jr8.c;
        Lazy lazy = this.y0;
        if (jr8 == jr82) {
            if (!r()) {
                ((PowerManager.WakeLock) lazy.getValue()).acquire();
            }
        } else if (r()) {
            v((PowerManager.WakeLock) lazy.getValue(), 0);
        }
        y(j, jr8, true);
    }

    public final void m(long j, jr8 jr8) {
        z68.c("f40", "onPause " + j + " type " + jr8, new Object[0]);
        y(j, jr8, false);
        if (jr8 == jr8.c) {
            if (r()) {
                v((PowerManager.WakeLock) this.y0.getValue(), 0);
            }
            w(j, this.c.o());
        }
    }

    public final void n(long j, jr8 jr8) {
        z68.c("f40", "onSkipToNext " + j + " type " + jr8, new Object[0]);
        y(j, jr8, false);
    }

    public final boolean o(long j) {
        xy9 xy9 = this.c;
        return xy9.p(j) && xy9.y;
    }

    @oye
    public final void onEvent(kv9 kv9) {
        List list = kv9.v;
        xy9 xy9 = this.c;
        if (list.contains(Long.valueOf(xy9.l())) && xy9.E == null) {
            B();
        }
    }

    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 800 || i == 801) {
            this.b.c(new ij0());
            C();
        }
    }

    public final boolean p(long j) {
        xy9 xy9 = this.c;
        return xy9.p(j) && xy9.z;
    }

    public final boolean q() {
        Boolean bool;
        Lazy lazy = this.x0;
        if (!lazy.isInitialized()) {
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            bool = Result.m23constructorimpl(Boolean.valueOf(((PowerManager.WakeLock) lazy.getValue()).isHeld()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            bool = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r1 = Result.m26exceptionOrNullimpl(bool);
        if (r1 != null) {
            ((uta) ((m95) this.x.getValue())).c(new HandledException(r1), true);
        }
        Boolean bool2 = Boolean.FALSE;
        if (Result.m29isFailureimpl(bool)) {
            bool = bool2;
        }
        return ((Boolean) bool).booleanValue();
    }

    public final boolean r() {
        Boolean bool;
        Lazy lazy = this.y0;
        if (!lazy.isInitialized()) {
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            bool = Result.m23constructorimpl(Boolean.valueOf(((PowerManager.WakeLock) lazy.getValue()).isHeld()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            bool = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r1 = Result.m26exceptionOrNullimpl(bool);
        if (r1 != null) {
            ((uta) ((m95) this.x.getValue())).c(new HandledException(r1), true);
        }
        Boolean bool2 = Boolean.FALSE;
        if (Result.m29isFailureimpl(bool)) {
            bool = bool2;
        }
        return ((Boolean) bool).booleanValue();
    }

    public final void s() {
        z68.c("f40", "pause", new Object[0]);
        xy9 xy9 = this.c;
        if (xy9.z) {
            xy9.q();
        }
        Lazy lazy = this.y0;
        if (lazy.isInitialized()) {
            v((PowerManager.WakeLock) lazy.getValue(), 0);
        }
    }

    public final void t() {
        Lazy lazy = this.x0;
        Lazy lazy2 = this.y0;
        try {
            if (lazy2.isInitialized()) {
                v((PowerManager.WakeLock) lazy2.getValue(), 0);
            }
            if (lazy.isInitialized()) {
                v((PowerManager.WakeLock) lazy.getValue(), 1);
            }
        } catch (Throwable th) {
            ((uta) ((m95) this.x.getValue())).c(new HandledException(th), true);
        }
    }

    public final void u() {
        this.c.r();
    }

    public final void w(long j, long j2) {
        if (j != -1 && j2 >= 0) {
            ev0.v((d14) this.Z.getValue(), (CoroutineContext) null, (f14) null, new c40(this, j2, j, (Continuation) null), 3);
        }
    }

    public final void x(long j) {
        this.c.v(j);
    }

    public final void y(long j, jr8 jr8, boolean z2) {
        z68.c("f40", "sendEvent " + j + ", " + jr8 + ", " + z2, new Object[0]);
        if (j != -1) {
            if (j != this.z0 || this.A0 == -1) {
                z68.c("f40", "track changed, should update chatId", new Object[0]);
                if (j != this.z0 || this.A0 == -1) {
                    ev0.v((d14) this.Z.getValue(), (CoroutineContext) null, (f14) null, new e40(this, j, jr8, (Continuation) null), 3);
                    return;
                }
                z(j, jr8, this.A0);
                return;
            }
            z(j, jr8, this.A0);
        }
    }

    public final void z(long j, jr8 jr8, long j2) {
        z68.c("f40", "send event internal trackId=" + j + " trackType=" + jr8 + " chatId=" + j2, new Object[0]);
        this.b.c(new e60(jr8.ordinal(), j, j2));
    }
}
