package defpackage;

import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: it3  reason: default package */
public final /* synthetic */ class it3 implements ya4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ it3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                return new jt3((lt3) this.b);
            default:
                return new ChatTitleIconScreen((long[]) this.b, zke.CHAT);
        }
    }
}
