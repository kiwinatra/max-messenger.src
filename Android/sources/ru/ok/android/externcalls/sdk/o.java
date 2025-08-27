package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.api.ConversationParams;

public final /* synthetic */ class o implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ o(ConversationImpl conversationImpl, Runnable runnable, int i) {
        this.a = i;
        this.b = conversationImpl;
        this.c = runnable;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.lambda$refreshParams$13(this.c, (ConversationParams) obj);
                return;
            default:
                this.b.lambda$resolveExternalsByInternalsIds$39(this.c, (Throwable) obj);
                return;
        }
    }
}
