package defpackage;

import java.util.function.BiConsumer;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import one.me.android.OneMeApplication;

/* renamed from: z23  reason: default package */
public final /* synthetic */ class z23 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z23(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void accept(Object obj, Object obj2) {
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                ((a33) obj3).l((String) obj, (String) obj2);
                return;
            case 1:
                Long l = (Long) obj;
                vk3 vk3 = (vk3) obj2;
                km3 km3 = (km3) obj3;
                if (vk3 != null) {
                    g6d g6d = ((a74) ((s74) km3.f.get())).d;
                    l.getClass();
                    g6d.p().c(vk3.a.c, ((qi6) ((Lazy) g6d.o).getValue()).a);
                    return;
                }
                km3.getClass();
                return;
            default:
                int i = OneMeApplication.X;
                ((Function2) obj3).invoke(obj, obj2);
                return;
        }
    }
}
