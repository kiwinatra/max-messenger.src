package ru.ok.android.externcalls.sdk;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;

    public /* synthetic */ a(ConversationImpl conversationImpl, int i) {
        this.a = i;
        this.b = conversationImpl;
    }

    public final Object invoke() {
        int i = this.a;
        ConversationImpl conversationImpl = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(conversationImpl.isMeCreatorOrAdmin());
            case 1:
                return conversationImpl.lambda$createMediaMuteManager$4();
            case 2:
                return conversationImpl.lambda$createAsrOnlineManager$5();
            case 3:
                return conversationImpl.lambda$createAsrOnlineManager$6();
            case 4:
                return conversationImpl.lambda$new$0();
            case 5:
                return conversationImpl.lambda$new$1();
            case 6:
                return conversationImpl.lambda$new$2();
            default:
                return Boolean.valueOf(conversationImpl.isDestroyed());
        }
    }
}
