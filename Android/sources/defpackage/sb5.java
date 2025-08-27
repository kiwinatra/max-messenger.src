package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Looper;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.tamtam.util.HandledException;

/* renamed from: sb5  reason: default package */
public final class sb5 implements rob, AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int w0 = 0;
    public int X;
    public int Y;
    public int Z;
    public final zae a;
    public final ic3 b;
    public final m95 c;
    public final kb5 o;
    public final dm4 v;
    public boolean v0;
    public m48 w;
    public f4g x;
    public float y = c44.DEFAULT_ASPECT_RATIO;
    public xj0 z;

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, bk3] */
    /* JADX WARNING: type inference failed for: r0v12, types: [ic3, java.lang.Object] */
    public sb5(Context context, m95 m95, kb5 kb5, ys7 ys7, a33 a33) {
        this.c = m95;
        this.o = kb5;
        sg4.a("bufferForPlaybackMs", 500, 0, "0");
        sg4.a("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        sg4.a("minBufferMs", 50000, 500, "bufferForPlaybackMs");
        sg4.a("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        sg4.a("maxBufferMs", 50000, 50000, "minBufferMs");
        sg4 sg4 = new sg4(new cb4(0), 500);
        rj4 rj4 = new rj4(context, new Object());
        fj4 b2 = rj4.b();
        String iSO3Language = a33.u().getISO3Language();
        if (iSO3Language == null) {
            b2.c(new String[0]);
        } else {
            b2.c(new String[]{iSO3Language});
        }
        ebf ebf = new ebf(context);
        ub5 ub5 = new ub5(context, ebf);
        y64.j(!ub5.p);
        ub5.e = new ch4(4, rj4);
        y64.j(!ub5.p);
        ub5.f = new ch4(1, sg4);
        y64.j(!ub5.p);
        ub5.p = true;
        zae zae = new zae(ub5);
        this.a = zae;
        zae.n1();
        sc5 sc5 = zae.b;
        sc5.getClass();
        d23 d23 = sc5.Z;
        d23.getClass();
        ((CopyOnWriteArraySet) d23.o).add(new l08(this));
        zae.n1();
        vb4 vb4 = sc5.z0;
        vb4.getClass();
        d23 d232 = vb4.w;
        d232.getClass();
        ((CopyOnWriteArraySet) d232.o).add(new l08(this));
        ? obj = new Object();
        obj.o = Collections.emptyList();
        obj.b = zae;
        obj.a = rj4;
        obj.v = a33;
        obj.w = ys7;
        obj.x = ebf;
        this.b = obj;
        this.v = new dm4(16, (Object) new bq(context));
        context.registerReceiver(new ao(8, this), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    public static void u() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("This thread is NOT main!");
        }
    }

    public final void A() {
        u();
        f4g f4g = this.x;
        zae zae = this.a;
        if (f4g != null && f4g.i() > 0) {
            f4g f4g2 = this.x;
            if (!((ol0) f4g2).c) {
                z68.c("sb5", "seekToStart seekTo: %d", Long.valueOf(f4g2.i()));
                zae.n(zae.d0(), this.x.i());
                return;
            }
        }
        z68.c("sb5", "seekToStart seekTo: 0", new Object[0]);
        zae.n(zae.d0(), 0);
    }

    public final void C() {
        z68.c("sb5", "Stop", new Object[0]);
        u();
        zae zae = this.a;
        zae.n1();
        sc5 sc5 = zae.b;
        sc5.G1();
        sc5.G1();
        sc5.F0.d(1, sc5.q());
        sc5.B1((ExoPlaybackException) null);
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        m48 m48 = this.w;
        if (m48 != null) {
            iu8 iu8 = m48.e;
            if (iu8 != null) {
                iu8.P();
            }
            m48.p();
        }
    }

    public final void I(tpf tpf, cqf cqf) {
        iu8 iu8;
        u();
        if (!this.v0) {
            this.v0 = this.b.s();
        }
        m48 m48 = this.w;
        if (m48 != null && (iu8 = m48.e) != null) {
            iu8.i();
        }
    }

    public final boolean a() {
        zae zae = this.a;
        zae.n1();
        sc5 sc5 = zae.b;
        sc5.G1();
        int i = sc5.i1.e;
        if (i != 2 && i != 3) {
            return false;
        }
        zae.n1();
        if (!sc5.q()) {
            return false;
        }
        zae.n1();
        sc5.G1();
        return sc5.i1.m == 0;
    }

    public final void g(float f) {
        u();
        zae zae = this.a;
        float b2 = zae.b();
        zae.n1();
        sc5 sc5 = zae.b;
        sc5.G1();
        float i = t0g.i(f, c44.DEFAULT_ASPECT_RATIO, 1.0f);
        if (sc5.b1 != i) {
            sc5.b1 = i;
            sc5.y1(1, 2, Float.valueOf(sc5.F0.e * i));
            sc5.Z.r(22, new zb5(i, 0));
        }
        m48 m48 = this.w;
        if (m48 != null) {
            iu8 iu8 = m48.e;
            if (iu8 != null) {
                iu8.g();
            }
            if (m48.b.a()) {
                if (m48.l()) {
                    m48.a();
                } else {
                    m48.p();
                }
            }
        }
        if (b2 <= c44.DEFAULT_ASPECT_RATIO && f > c44.DEFAULT_ASPECT_RATIO) {
            w();
        }
    }

    public final void h(int i) {
        iu8 iu8;
        iu8 iu82;
        u();
        if (i == 1) {
            z68.c("sb5", "onPlayerStateChanged ExoPlayer.STATE_IDLE", new Object[0]);
        } else if (i == 2) {
            z68.c("sb5", "onPlayerStateChanged ExoPlayer.STATE_BUFFERING", new Object[0]);
            m48 m48 = this.w;
            if (m48 != null && (iu8 = m48.e) != null) {
                iu8.M();
            }
        } else if (i == 3) {
            z68.c("sb5", "onPlayerStateChanged ExoPlayer.STATE_READY", new Object[0]);
            m48 m482 = this.w;
            if (m482 != null && (iu82 = m482.e) != null) {
                iu82.F();
            }
        } else if (i == 4) {
            z68.c("sb5", "onPlayerStateChanged ExoPlayer.STATE_ENDED", new Object[0]);
            if (this.a.getRepeatMode() == 1) {
                z68.c("sb5", "State ended, but video is looping. Restart", new Object[0]);
                play();
                return;
            }
            m48 m483 = this.w;
            if (m483 != null) {
                iu8 iu83 = m483.e;
                if (iu83 != null) {
                    iu83.s();
                }
                m483.p();
            }
        }
    }

    public final void onAudioFocusChange(int i) {
        z68.c("sb5", "On audio focus change, %d", Integer.valueOf(i));
        zae zae = this.a;
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    z68.a("sb5", "onAudioFocusChange: AUDIOFOCUS_LOSS");
                    if (a() && zae.b() > c44.DEFAULT_ASPECT_RATIO) {
                        z68.a("sb5", "onAudioFocusChange: AUDIOFOCUS_LOSS. Stop");
                        pause();
                    }
                } else if (i == 1) {
                    if (!a()) {
                        z68.a("sb5", "onAudioFocusChange: AUDIOFOCUS_GAIN. Resuming player");
                        play();
                    }
                    float b2 = zae.b();
                    if (b2 > c44.DEFAULT_ASPECT_RATIO && ((double) b2) < 1.0d) {
                        z68.a("sb5", "onAudioFocusChange: AUDIOFOCUS_GAIN. Volume up");
                        g(1.0f);
                    }
                }
            } else if (a() && zae.b() > c44.DEFAULT_ASPECT_RATIO) {
                z68.a("sb5", "onAudioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT. Pausing current player");
                pause();
            }
        } else if (a() && zae.b() > c44.DEFAULT_ASPECT_RATIO) {
            z68.a("sb5", "onAudioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK. Setting volume to 0.2");
            g(0.2f);
        }
    }

    public final void pause() {
        z68.c("sb5", "Pause", new Object[0]);
        u();
        this.a.O(false);
        m48 m48 = this.w;
        if (m48 != null) {
            iu8 iu8 = m48.e;
            if (iu8 != null) {
                iu8.q();
            }
            m48.p();
        }
    }

    public final void play() {
        z68.c("sb5", "Play", new Object[0]);
        u();
        zae zae = this.a;
        zae.n1();
        sc5 sc5 = zae.b;
        sc5.G1();
        if (sc5.i1.e == 4) {
            A();
        }
        zae.O(true);
        m48 m48 = this.w;
        if (m48 != null) {
            m48.m();
        }
        w();
    }

    public final void r(PlaybackException playbackException) {
        u();
        z68.f("sb5", "onPlayerError", playbackException);
        if (playbackException != null) {
            ((uta) this.c).c(new HandledException(playbackException), false);
        }
        m48 m48 = this.w;
        if (m48 != null) {
            iu8 iu8 = m48.e;
            if (iu8 != null) {
                iu8.O(playbackException);
            }
            m48.p();
        }
    }

    public final long v() {
        f4g f4g = this.x;
        if (f4g == null) {
            return 0;
        }
        int i = (f4g.g() > 0 ? 1 : (f4g.g() == 0 ? 0 : -1));
        zae zae = this.a;
        if (i > 0) {
            zae.n1();
            return Math.min(zae.b.e(), this.x.g() - this.x.i());
        }
        zae.n1();
        return zae.b.e();
    }

    public final void w() {
        if (this.a.b() > c44.DEFAULT_ASPECT_RATIO && a()) {
            ((AudioManager) this.v.get()).requestAudioFocus(new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build()).build());
        }
    }

    public final void y(int i) {
        z68.c("sb5", "onTimelineChanged %d", Integer.valueOf(i));
    }
}
