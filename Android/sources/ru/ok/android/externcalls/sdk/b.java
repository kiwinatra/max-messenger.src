package ru.ok.android.externcalls.sdk;

public final /* synthetic */ class b implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ rk3 c;

    public /* synthetic */ b(Object obj, rk3 rk3, int i) {
        this.a = i;
        this.b = obj;
        this.c = rk3;
    }

    public void a(hz0 hz0) {
        ((ConversationImpl) this.b).lambda$performConnect$22(this.c, hz0);
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((ConversationImpl) this.b).lambda$runStartConversation$18(this.c, (Throwable) obj);
                return;
            default:
                ConversationImpl.lambda$removeJoinLink$37((Runnable) this.b, this.c, (Boolean) obj);
                return;
        }
    }
}
