package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.android.externcalls.sdk.ConversationFactory;

/* renamed from: gz3  reason: default package */
public final /* synthetic */ class gz3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationFactory b;

    public /* synthetic */ gz3(ConversationFactory conversationFactory, int i) {
        this.a = i;
        this.b = conversationFactory;
    }

    public final Object invoke() {
        int i = this.a;
        ConversationFactory conversationFactory = this.b;
        switch (i) {
            case 0:
                return conversationFactory.lambda$new$0();
            default:
                return conversationFactory.lambda$new$1();
        }
    }
}
