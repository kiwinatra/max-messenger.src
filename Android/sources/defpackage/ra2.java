package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: ra2  reason: default package */
public final /* synthetic */ class ra2 implements sk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ra2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final void accept(Object obj) {
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                sa2 sa2 = (sa2) obj2;
                sa2.getClass();
                z68.c("sa2", "ValidateMessagesTimeUseCase found some items for delete, size = %d", Integer.valueOf(collection.size()));
                sa2.h.c(new ca2((Object) sa2, this.b, (Object) collection, 1));
                return;
            default:
                for (v5b g : (List) obj) {
                    ((z6d) obj2).g(g, this.b);
                }
                return;
        }
    }
}
