package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.ConversationImpl;

public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ConversationImpl) obj).lambda$performConnect$20();
                return;
            case 1:
                ((ConversationImpl) obj).reportIfApplicable();
                return;
            case 2:
                ((ConversationImpl) obj).lambda$performConnect$21();
                return;
            case 3:
                ((ConversationImpl) obj).onSignalingRefresh();
                return;
            case 4:
                ((ConversationImpl) obj).resolveUnknownExternals();
                return;
            default:
                ((ConversationImpl.AnonymousClass1) obj).lambda$onSample$0();
                return;
        }
    }
}
