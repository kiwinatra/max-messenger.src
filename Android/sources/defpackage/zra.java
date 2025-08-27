package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import one.me.messages.list.loader.MessageModel;

/* renamed from: zra  reason: default package */
public final /* synthetic */ class zra implements Function1 {
    public final /* synthetic */ a32 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ MessageModel c;
    public final /* synthetic */ List o;
    public final /* synthetic */ gsb v;

    public /* synthetic */ zra(a32 a32, int i, MessageModel messageModel, List list, gsb gsb) {
        this.a = a32;
        this.b = i;
        this.c = messageModel;
        this.o = list;
        this.v = gsb;
    }

    public final Object invoke(Object obj) {
        fe8 fe8 = (fe8) obj;
        fe8.a = this.a;
        fe8.b = this.b;
        fe8.d = this.c;
        fe8.f = this.o;
        fe8.e = this.v;
        return Unit.INSTANCE;
    }
}
