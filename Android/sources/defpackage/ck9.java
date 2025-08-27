package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import one.me.messages.list.loader.MessageModel;

/* renamed from: ck9  reason: default package */
public interface ck9 {
    List b();

    MessageModel d(long j) {
        Object obj;
        Iterator it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((MessageModel) obj).a == j) {
                break;
            }
        }
        return (MessageModel) obj;
    }

    int g(long j) {
        return CollectionsKt__CollectionsKt.binarySearch$default(b(), 0, 0, (Function1) new hg2(j, 5), 3, (Object) null);
    }
}
