package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import ru.ok.tamtam.util.HandledException;

/* renamed from: n7g  reason: default package */
public final class n7g implements sob, ud, AudioManager.OnAudioFocusChangeListener, p40 {
    public final m95 a;
    public final lb5 b;
    public final String c = n7g.class.getName();
    public final Lazy o;
    public final tc5 v;
    public final q40 w;
    public u6h x;
    public g4g y;

    public n7g(Context context, m95 m95, lb5 lb5, Lazy lazy) {
        this.a = m95;
        this.b = lb5;
        this.o = lazy;
        this.w = new q40(context, this);
        tg4.a("bufferForPlaybackMs", 500, 0, "0");
        tg4.a("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        tg4.a("minBufferMs", 50000, 500, "bufferForPlaybackMs");
        tg4.a("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        tg4.a("maxBufferMs", 50000, 50000, "minBufferMs");
        tg4 tg4 = new tg4(new cb4(1), 500, 5000);
        sj4 sj4 = new sj4(context, new pf6(7));
        ej4 f = sj4.f();
        f.getClass();
        cj4 cj4 = new cj4(f);
        String iSO3Language = ((qjd) ((x23) lazy.getValue())).u().getISO3Language();
        if (iSO3Language == null) {
            cj4.h(new String[0]);
        } else {
            cj4.h(new String[]{iSO3Language});
        }
        vb5 vb5 = new vb5(context);
        n79.n(!vb5.v);
        vb5.e = new ch4(3, sj4);
        n79.n(!vb5.v);
        vb5.f = new ch4(7, tg4);
        tc5 a2 = vb5.a();
        this.v = a2;
        a2.Z.c(this);
        wb4 wb4 = a2.A0;
        wb4.getClass();
        wb4.w.c(this);
    }

    public final long F0() {
        if (this.y != null) {
            return this.v.h();
        }
        return 0;
    }

    public final void G(td tdVar, int i) {
        z68.c(this.c, wj6.h(i, "Player. Video frames dropped: "), new Object[0]);
    }

    public final long G0() {
        g4g g4g = this.y;
        if (g4g == null) {
            return 0;
        }
        if (g4g.g() > 0) {
            return g4g.g();
        }
        tc5 tc5 = this.v;
        if (tc5.e() > 0) {
            return tc5.e();
        }
        return 0;
    }

    public final void H0(g4g g4g) {
        Object obj;
        kw4 kw4;
        pe4 g;
        n09 n09;
        u6h u6h;
        g4g g4g2 = g4g;
        g4g g4g3 = this.y;
        pw4 pw4 = null;
        if (g4g3 == null || !Intrinsics.areEqual((Object) g4g3, (Object) g4g2) || this.v.getPlaybackState() == 1) {
            String str = this.c;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, str, "Player. Prepare new video content: " + g4g2, (Throwable) null);
            }
            u6h u6h2 = this.x;
            if (u6h2 != null) {
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) u6h2.b;
                if (ChatMediaViewerScreen.j0(chatMediaViewerScreen) && (n09 = chatMediaViewerScreen.x0) != null) {
                    n09.l(m09.o);
                }
            }
            boolean areEqual = Intrinsics.areEqual((Object) this.y, (Object) g4g2);
            this.y = g4g2;
            this.v.O(true);
            String str2 = this.c;
            a67 a672 = z68.b;
            if (a672 != null && a672.c()) {
                a672.d(w78.o, str2, "Player. Prepare mediaSource by content:" + g4g2, (Throwable) null);
            }
            Uri h = g4g.h();
            lb5 lb5 = this.b;
            g74 g74 = g4g.c() ^ true ? (g74) lb5.b.getValue() : (g74) lb5.a.getValue();
            if (g4g2 instanceof s64) {
                obj = new DashMediaSource$Factory(g74).d(ir8.c(h));
            } else if (g4g2 instanceof l27) {
                obj = new HlsMediaSource$Factory(g74).d(ir8.c(h));
            } else if (g4g2 instanceof xu9) {
                List list = ((xu9) g4g2).a;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    y3a y3a = new y3a(19, (Object) new jf4());
                    Object obj2 = new Object();
                    nfd nfd = new nfd(10);
                    ir8 c2 = ir8.c(((vu9) list.get(i)).e);
                    c2.b.getClass();
                    c2.b.getClass();
                    tq8 tq8 = c2.b.c;
                    if (tq8 == null) {
                        kw4 = pw4.a;
                    } else {
                        synchronized (obj2) {
                            try {
                                g = !tq8.equals((Object) null) ? jk3.g(tq8) : null;
                                g.getClass();
                            } catch (Throwable th) {
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                        kw4 = g;
                    }
                    arrayList.add(new i8c(c2, g74, y3a, kw4, nfd, 1048576));
                }
                yj0[] yj0Arr = (yj0[]) arrayList.toArray(new yj0[0]);
                obj = new y79((yj0[]) Arrays.copyOf(yj0Arr, yj0Arr.length));
            } else {
                y3a y3a2 = new y3a(19, (Object) new jf4());
                Object obj3 = new Object();
                nfd nfd2 = new nfd(10);
                ir8 c3 = ir8.c(h);
                c3.b.getClass();
                c3.b.getClass();
                tq8 tq82 = c3.b.c;
                if (tq82 == null) {
                    pw4 = pw4.a;
                } else {
                    synchronized (obj3) {
                        try {
                            if (!tq82.equals((Object) null)) {
                                pw4 = jk3.g(tq82);
                            }
                            pw4.getClass();
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                            }
                        }
                    }
                }
                obj = new i8c(c3, g74, y3a2, pw4, nfd2, 1048576);
            }
            long h2 = areEqual ? this.v.h() : Math.max(g4g.d(), 0);
            if (g4g.c() || h2 == 0) {
                tc5 tc5 = this.v;
                tc5.K1();
                List singletonList = Collections.singletonList(obj);
                tc5.K1();
                tc5.K1();
                tc5.C1(singletonList, -1, -9223372036854775807L, true);
            } else {
                tc5 tc52 = this.v;
                tc52.K1();
                List singletonList2 = Collections.singletonList(obj);
                tc52.K1();
                tc52.C1(singletonList2, 0, h2, false);
            }
            this.v.prepare();
            u6h u6h3 = this.x;
            if (u6h3 != null) {
                u6h3.o();
            }
            this.w.v(3);
            return;
        }
        String str3 = this.c;
        a67 a673 = z68.b;
        if (a673 != null && a673.c()) {
            a673.d(w78.o, str3, "Player. Restart same content: " + this.y, (Throwable) null);
        }
        if (this.v.getPlaybackState() == 4) {
            z68.c(this.c, "Player. Video ended. Seek to start", new Object[0]);
            J0();
        }
        if (this.v.getPlaybackState() == 3 && (u6h = this.x) != null) {
            u6h.l(true);
        }
        this.v.O(true);
        u6h u6h4 = this.x;
        if (u6h4 != null) {
            u6h4.o();
        }
        this.w.v(3);
    }

    public final void I0(long j) {
        String i = wj6.i(j, "Player. Seek to: ");
        String str = this.c;
        z68.c(str, i, new Object[0]);
        if (this.y != null) {
            tc5 tc5 = this.v;
            if (tc5.e() == 0 || j <= tc5.e()) {
                tc5.d1(5, j);
                return;
            }
            z68.c(str, "Player. Can't seek to: " + j + ", position greater than duration. Seek to end.", new Object[0]);
            tc5.d1(5, tc5.e());
        }
    }

    public final void J0() {
        z68.c(this.c, "Player. Seek to start: 0", new Object[0]);
        this.v.d1(5, 0);
    }

    public final void K(td tdVar, z94 z94) {
        z68.c(this.c, "Player. Video renderer is disabled", new Object[0]);
    }

    public final void K0(boolean z) {
        this.v.setRepeatMode(z ? 2 : 0);
    }

    public final void L0(Surface surface) {
        String str = this.c;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "Player. Set surface " + surface, (Throwable) null);
        }
        if (surface == null) {
            tc5 tc5 = this.v;
            tc5.K1();
            tc5.D1((Object) null);
            tc5.y1(0, 0);
            return;
        }
        this.v.j(surface);
    }

    public final void M0() {
        n09 n09;
        z68.c(this.c, "Player. Stop", new Object[0]);
        this.v.stop();
        u6h u6h = this.x;
        if (u6h != null) {
            ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) u6h.b;
            View view = chatMediaViewerScreen.getView();
            if (view != null) {
                view.setKeepScreenOn(false);
            }
            if (ChatMediaViewerScreen.j0(chatMediaViewerScreen) && (n09 = chatMediaViewerScreen.x0) != null) {
                n09.l(m09.b);
            }
        }
    }

    public final void R(td tdVar, es8 es8, IOException iOException, boolean z) {
        g4g g4g = this.y;
        z68.f(this.c, "Player. Load error, wasCanceled " + z + ", videoContent: " + g4g, iOException);
    }

    public final boolean a() {
        tc5 tc5 = this.v;
        int playbackState = tc5.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && tc5.q() && tc5.j0() == 0;
    }

    public final float b() {
        tc5 tc5 = this.v;
        tc5.K1();
        return tc5.e1;
    }

    public final void e0(td tdVar, Object obj, long j) {
        String str = this.c;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "Player. First frame rendered: output=" + obj + " renderTimeMs=" + j, (Throwable) null);
        }
    }

    public final void f0(jkf jkf, int i) {
        z68.c(this.c, "Player. onTimelineChanged %d", Integer.valueOf(i));
    }

    public final void g(float f) {
        tc5 tc5 = this.v;
        tc5.K1();
        float f2 = tc5.e1;
        String str = this.c;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "Player. New volume: " + f + ", prev: " + f2, (Throwable) null);
        }
        this.v.g(f);
        if (f2 <= c44.DEFAULT_ASPECT_RATIO && f > c44.DEFAULT_ASPECT_RATIO) {
            this.w.v(3);
        } else if (f2 != f && f <= c44.DEFAULT_ASPECT_RATIO) {
            this.w.u();
        }
    }

    public final void h(int i) {
        n09 n09;
        n09 n092;
        String str = this.c;
        if (i == 1) {
            z68.c(str, "Player. State changed: ExoPlayer.STATE_IDLE", new Object[0]);
        } else if (i != 2) {
            tc5 tc5 = this.v;
            if (i == 3) {
                z68.c(str, "Player. State changed: ExoPlayer.STATE_READY", new Object[0]);
                u6h u6h = this.x;
                if (u6h != null) {
                    u6h.l(tc5.q());
                }
            } else if (i == 4) {
                z68.c(str, "Player. State changed: ExoPlayer.STATE_ENDED", new Object[0]);
                tc5.K1();
                if (tc5.O0 == 1) {
                    z68.c(str, "Player. State ended, but video is looping. Restart", new Object[0]);
                    play();
                    return;
                }
                u6h u6h2 = this.x;
                if (u6h2 != null) {
                    ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) u6h2.b;
                    View view = chatMediaViewerScreen.getView();
                    if (view != null) {
                        view.setKeepScreenOn(false);
                    }
                    if (ChatMediaViewerScreen.j0(chatMediaViewerScreen) && (n092 = chatMediaViewerScreen.x0) != null) {
                        n092.l(m09.b);
                    }
                }
            }
        } else {
            z68.c(str, "Player. State changed: ExoPlayer.STATE_BUFFERING", new Object[0]);
            u6h u6h3 = this.x;
            if (u6h3 != null) {
                ChatMediaViewerScreen chatMediaViewerScreen2 = (ChatMediaViewerScreen) u6h3.b;
                if (ChatMediaViewerScreen.j0(chatMediaViewerScreen2) && (n09 = chatMediaViewerScreen2.x0) != null) {
                    n09.l(m09.o);
                }
            }
        }
    }

    public final void onAudioFocusChange(int i) {
        String str = this.c;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, wj6.h(i, "Player. On audio focus change: "), (Throwable) null);
        }
        this.w.t(i);
    }

    public final void pause() {
        n09 n09;
        z68.c(this.c, "Player. Pause", new Object[0]);
        this.v.O(false);
        u6h u6h = this.x;
        if (u6h != null) {
            ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) u6h.b;
            View view = chatMediaViewerScreen.getView();
            if (view != null) {
                view.setKeepScreenOn(false);
            }
            if (ChatMediaViewerScreen.j0(chatMediaViewerScreen) && (n09 = chatMediaViewerScreen.x0) != null) {
                n09.l(m09.b);
            }
        }
    }

    public final void play() {
        z68.c(this.c, "Player. Play", new Object[0]);
        tc5 tc5 = this.v;
        if (tc5.getPlaybackState() == 4) {
            J0();
        }
        tc5.O(true);
        u6h u6h = this.x;
        if (u6h != null) {
            u6h.o();
        }
        this.w.v(3);
    }

    public final void w0(PlaybackException playbackException) {
        z68.f(this.c, "Player. Error", playbackException);
        ((uta) this.a).c(new HandledException(playbackException), false);
        u6h u6h = this.x;
        if (u6h != null) {
            ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) u6h.b;
            if (ChatMediaViewerScreen.j0(chatMediaViewerScreen)) {
                chatMediaViewerScreen.s0(true);
                n09 n09 = chatMediaViewerScreen.x0;
                if (n09 != null) {
                    n09.l(m09.v);
                }
            }
        }
    }
}
