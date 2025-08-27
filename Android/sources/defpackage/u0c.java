package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import one.me.profileedit.ProfileEditScreen;

/* renamed from: u0c  reason: default package */
public final /* synthetic */ class u0c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t56 b;

    public /* synthetic */ u0c(t56 t56, int i) {
        this.a = i;
        this.b = t56;
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                ((ProfileEditScreen) ((w0c) this.b.w)).d0().b.m(1, str);
                return Unit.INSTANCE;
            case 1:
                ((ProfileEditScreen) ((w0c) this.b.w)).d0().b.m(2, str);
                return Unit.INSTANCE;
            default:
                ((ProfileEditScreen) ((w0c) this.b.w)).d0().b.m(4, str);
                return Unit.INSTANCE;
        }
    }
}
