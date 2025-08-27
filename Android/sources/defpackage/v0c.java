package defpackage;

import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.uuid.Uuid;
import one.me.profileedit.ProfileEditScreen;

/* renamed from: v0c  reason: default package */
public final /* synthetic */ class v0c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t56 b;

    public /* synthetic */ v0c(t56 t56, int i) {
        this.a = i;
        this.b = t56;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((ProfileEditScreen) ((w0c) this.b.w)).d0().b.a(64);
                return Unit.INSTANCE;
            case 1:
                ((ProfileEditScreen) ((w0c) this.b.w)).d0().b.a(Uuid.SIZE_BITS);
                return Unit.INSTANCE;
            case 2:
                ((ProfileEditScreen) ((w0c) this.b.w)).d0().b.a(256);
                return Unit.INSTANCE;
            default:
                ((ProfileEditScreen) ((w0c) this.b.w)).d0().b.a(ConstantsKt.MINIMUM_BLOCK_SIZE);
                return Unit.INSTANCE;
        }
    }
}
