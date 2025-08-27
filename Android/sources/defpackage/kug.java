package defpackage;

import android.opengl.EGLSurface;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: kug  reason: default package */
public final class kug extends Lambda implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ md1 b;
    public final /* synthetic */ nd1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kug(md1 md1, nd1 nd1) {
        super(1);
        this.b = md1;
        this.c = nd1;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ld1 ld1 = (ld1) obj;
                ArrayList arrayList = this.c.i;
                md1 md1 = this.b;
                if (arrayList.remove(md1)) {
                    EGLSurface eGLSurface = md1.a;
                    md1.a = null;
                    ld1.e(eGLSurface);
                    md1.a();
                }
                return Unit.INSTANCE;
            default:
                this.b.b(this.c, (ld1) obj);
                return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kug(nd1 nd1, md1 md1) {
        super(1);
        this.c = nd1;
        this.b = md1;
    }
}
