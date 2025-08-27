package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import one.me.messages.list.loader.MessageModel;

/* renamed from: fe8  reason: default package */
public final class fe8 {
    public a32 a;
    public int b;
    public ha9 c;
    public MessageModel d;
    public gsb e;
    public List f = CollectionsKt.emptyList();

    public final ge8 a(Function1 function1) {
        function1.invoke(this);
        a32 a32 = this.a;
        if (a32 != null) {
            int i = this.b;
            gsb gsb = this.e;
            if (gsb != null) {
                ge8 ge8 = new ge8(a32, gsb, i);
                ha9 ha9 = this.c;
                if (ha9 != null) {
                    ge8.d.setValue(ge8, ge8.h[0], ha9);
                }
                MessageModel messageModel = this.d;
                if (messageModel != null) {
                    ge8.e.setValue(ge8, ge8.h[1], messageModel);
                }
                List list = this.f;
                ge8.g.setValue(ge8, ge8.h[3], list);
                return ge8;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
