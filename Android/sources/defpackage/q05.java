package defpackage;

import org.webrtc.EglRenderer;

/* renamed from: q05  reason: default package */
public final /* synthetic */ class q05 implements Runnable {
    public final /* synthetic */ EglRenderer a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float o;
    public final /* synthetic */ float v;

    public /* synthetic */ q05(EglRenderer eglRenderer, float f, float f2, float f3, float f4) {
        this.a = eglRenderer;
        this.b = f;
        this.c = f2;
        this.o = f3;
        this.v = f4;
    }

    public final void run() {
        this.a.lambda$clearImage$4(this.b, this.c, this.o, this.v);
    }
}
