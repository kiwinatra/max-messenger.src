package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import one.me.messages.list.loader.MessageModel;

/* renamed from: asa  reason: default package */
public final /* synthetic */ class asa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ esa b;
    public final /* synthetic */ he8 c;

    public /* synthetic */ asa(esa esa, ge8 ge8, int i) {
        this.a = i;
        this.b = esa;
        this.c = ge8;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ge8 ge8 = (ge8) this.c;
                List c2 = ge8.c();
                int i = ge8.c;
                return Boolean.valueOf(this.b.c(ge8, (MessageModel) c2.get(i), (MessageModel) ge8.c().get(i - 1)));
            default:
                ge8 ge82 = (ge8) this.c;
                List c3 = ge82.c();
                int i2 = ge82.c;
                return Boolean.valueOf(this.b.c(ge82, (MessageModel) c3.get(i2), (MessageModel) ge82.c().get(i2 + 1)));
        }
    }
}
