package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import one.me.rlottie.RLottieFactory;

/* renamed from: j9  reason: default package */
public final /* synthetic */ class j9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j9(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                pzc pzc = (pzc) obj;
                return ((RecyclerView) this.c).getRecycledViewPool().getRecycledView(this.b);
            case 1:
                zi ziVar = (zi) obj;
                int i2 = this.b;
                return RLottieFactory.create(new RLottieFactory.Config(new RLottieFactory.Way.Url((String) this.c, true, i2, i2, true), false, true, true, false, 18, (DefaultConstructorMarker) null));
            case 2:
                Integer num = (Integer) obj;
                m35 m35 = (m35) this.c;
                return ev0.v((d14) m35.f.getValue(), (CoroutineContext) null, (f14) null, new k35(this.b, m35, (Continuation) null), 3);
            default:
                ((Integer) obj).getClass();
                i45 i45 = (i45) this.c;
                int i3 = 0;
                for (Object next : ((f45) i45.X.a.getValue()).b) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    lz7 lz7 = (lz7) next;
                    if ((lz7 instanceof vx1) && ((vx1) lz7).a == (i = this.b)) {
                        g45 g45 = new g45(i, i3, 0, 4);
                        xme xme = i45.w;
                        xme.getClass();
                        xme.m((Object) null, g45);
                    }
                    i3 = i4;
                }
                return Unit.INSTANCE;
        }
    }
}
