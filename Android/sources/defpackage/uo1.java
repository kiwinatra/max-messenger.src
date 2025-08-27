package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ok.android.externcalls.sdk.AudioLevelListener;

/* renamed from: uo1  reason: default package */
public final /* synthetic */ class uo1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap1 b;

    public /* synthetic */ uo1(ap1 ap1, int i) {
        this.a = i;
        this.b = ap1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return f6e.a(((o01) this.b.b).b());
            case 1:
                return (tz9) this.b.n.getValue();
            case 2:
                ((sz9) this.b.p.getValue()).d(Boolean.TRUE);
                return Unit.INSTANCE;
            case 3:
                return (sz9) this.b.p.getValue();
            case 4:
                return new AudioLevelListener(500, new Handler(Looper.getMainLooper()), new b(27, (Object) this.b));
            default:
                return new yo1(this.b);
        }
    }
}
