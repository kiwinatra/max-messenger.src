package defpackage;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.EglBase;

/* renamed from: nj  reason: default package */
public final class nj {
    public final ui a;
    public final HandlerThread b;
    public final Handler c;
    public final HandlerThread d;
    public final HashMap e = new HashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final LinkedHashSet g;
    public final nd1 h;
    public volatile boolean i;

    public nj(hr6 hr6, gga gga, ui uiVar, EglBase eglBase, ic3 ic3) {
        this.a = uiVar;
        HandlerThread handlerThread = new HandlerThread("AniRDControl");
        this.b = handlerThread;
        HandlerThread handlerThread2 = new HandlerThread("AniRDOutput");
        this.d = handlerThread2;
        new HashMap();
        this.g = new LinkedHashSet();
        new Point();
        this.h = new nd1((voc) hr6.a, eglBase.getEglBaseContext(), EglBase.CONFIG_PLAIN, "CallOpenGLAnimoji");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
        handlerThread2.start();
        new Handler(handlerThread2.getLooper());
    }
}
