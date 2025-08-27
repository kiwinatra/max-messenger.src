package defpackage;

import android.opengl.EGLSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.webrtc.RendererCommon;

/* renamed from: eug  reason: default package */
public final class eug extends Lambda implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ nd1 b;
    public final /* synthetic */ md1 c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eug(md1 md1, Object obj, nd1 nd1) {
        super(1);
        this.c = md1;
        this.o = obj;
        this.b = nd1;
    }

    public final Object invoke(Object obj) {
        voc voc;
        switch (this.a) {
            case 0:
                ld1 ld1 = (ld1) obj;
                md1 md1 = this.c;
                in1 in1 = (in1) md1;
                in1.getClass();
                in1.k = (RendererCommon.GlDrawer) this.o;
                long nanoTime = System.nanoTime();
                jn1 jn1 = in1.l;
                jn1.g = nanoTime;
                jn1.f = 0;
                jn1.h = 0;
                jn1.i = 0;
                jn1.c.set(0);
                jn1.d.set(0);
                nd1 nd1 = in1.g;
                if (nd1 == null || (voc = nd1.a) == null) {
                    throw new RuntimeException("Render is missing inside onInitialize() callback");
                }
                int incrementAndGet = in1.m.incrementAndGet();
                voc.log(in1.j, "Instance " + in1.b + " initialized. Total count is " + incrementAndGet);
                this.b.i.add(md1);
                return Unit.INSTANCE;
            default:
                Function0 function0 = (Function0) this.o;
                ld1 ld12 = (ld1) obj;
                try {
                    nd1 nd12 = this.b;
                    md1 md12 = this.c;
                    nd12.getClass();
                    EGLSurface eGLSurface = md12.a;
                    md12.a = null;
                    ld12.e(eGLSurface);
                    return Unit.INSTANCE;
                } finally {
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eug(nd1 nd1, md1 md1, Function0 function0) {
        super(1);
        this.b = nd1;
        this.c = md1;
        this.o = function0;
    }
}
