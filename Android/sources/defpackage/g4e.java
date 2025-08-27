package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* renamed from: g4e  reason: default package */
public final class g4e extends GLSurfaceView {
    public final f4e a;

    /* JADX WARNING: type inference failed for: r3v2, types: [f4e, java.lang.Object, android.opengl.GLSurfaceView$Renderer] */
    public g4e(Context context) {
        super(context, (AttributeSet) null);
        setEGLContextClientVersion(2);
        ? obj = new Object();
        obj.w = System.currentTimeMillis();
        this.a = obj;
        setRenderer(obj);
    }

    public final f4e getRenderer() {
        return this.a;
    }
}
