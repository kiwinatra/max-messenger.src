package defpackage;

import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;

/* renamed from: p05  reason: default package */
public final /* synthetic */ class p05 implements Runnable {
    public final /* synthetic */ EglRenderer a;
    public final /* synthetic */ RendererCommon.GlDrawer b;
    public final /* synthetic */ EglRenderer.FrameListener c;
    public final /* synthetic */ float o;
    public final /* synthetic */ boolean v;

    public /* synthetic */ p05(EglRenderer eglRenderer, RendererCommon.GlDrawer glDrawer, EglRenderer.FrameListener frameListener, float f, boolean z) {
        this.a = eglRenderer;
        this.b = glDrawer;
        this.c = frameListener;
        this.o = f;
        this.v = z;
    }

    public final void run() {
        this.a.lambda$addFrameListener$1(this.b, this.c, this.o, this.v);
    }
}
