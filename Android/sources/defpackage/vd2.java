package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;

/* renamed from: vd2  reason: default package */
public final class vd2 implements j4f {
    public final /* synthetic */ wd2 a;

    public vd2(wd2 wd2) {
        this.a = wd2;
    }

    public final Unit a() {
        this.a.m(false);
        return Unit.INSTANCE;
    }

    public final Object b(float f, long j, long j2, Continuation continuation) {
        Object value;
        xme xme = this.a.Z;
        do {
            value = xme.getValue();
            ((Number) value).floatValue();
        } while (!xme.b(value, Boxing.boxFloat(f)));
        return Unit.INSTANCE;
    }

    public final Unit e(boolean z, boolean z2) {
        this.a.m(z2);
        return Unit.INSTANCE;
    }

    public final Object f(File file, Continuation continuation) {
        wd2 wd2 = this.a;
        ld2 ld2 = (ld2) wd2.x0.getAndUpdate(new md2(1));
        if (file == null || ld2 == null) {
            return Unit.INSTANCE;
        }
        qva qva = (qva) ((ou8) wd2.z.getValue());
        ev0.v((d14) qva.i.getValue(), (CoroutineContext) null, (f14) null, new pva(qva, file, (Continuation) null), 3);
        n6e n6e = wd2.X;
        Uri fromFile = Uri.fromFile(file);
        String uri = fromFile.toString();
        int i = o5a.f;
        if (!uri.startsWith("content://")) {
            fromFile = ((po5) ((ln5) wd2.y.getValue())).f(wd2.b, n79.V(fromFile));
        }
        n6e.d(new xr4(fromFile, ld2.d));
        return Unit.INSTANCE;
    }

    public final String getDownloadContext() {
        ld2 ld2 = (ld2) this.a.x0.get();
        if (ld2 == null) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ld2.a);
        sb.append(ld2.b);
        return sb.toString();
    }
}
