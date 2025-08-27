package ru.ok.android.externcalls.sdk.factory;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.Conversation;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class BaseCallParams$Builder$setOnPrepared$2$1 extends FunctionReferenceImpl implements Function1<Conversation, Unit> {
    public BaseCallParams$Builder$setOnPrepared$2$1(Object obj) {
        super(1, obj, rk3.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Conversation) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Conversation conversation) {
        ((rk3) this.receiver).accept(conversation);
    }
}
