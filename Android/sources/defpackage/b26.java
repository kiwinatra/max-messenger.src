package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.settings.folders.page.FolderPageFragment;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: b26  reason: default package */
public final /* synthetic */ class b26 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderPageFragment b;

    public /* synthetic */ b26(FolderPageFragment folderPageFragment, int i) {
        this.a = i;
        this.b = folderPageFragment;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.i3().m();
                return Unit.INSTANCE;
            case 1:
                FolderPageViewModel i3 = this.b.i3();
                z26 z26 = i3.p;
                if (z26 instanceof z26) {
                    i3.n();
                    xme xme = i3.m;
                    o85 o85 = new o85(new d36(new zy5(z26.a)));
                    xme.getClass();
                    xme.m((Object) null, o85);
                }
                return Unit.INSTANCE;
            case 2:
                FolderPageViewModel i32 = this.b.i3();
                z26 z262 = i32.p;
                if (z262 instanceof z26) {
                    i32.m.setValue(i32.r);
                    ev0.v(b0h.C(i32), (CoroutineContext) null, (f14) null, new m36(z262, (Continuation) null, i32), 3);
                }
                return Unit.INSTANCE;
            case 3:
                FolderPageFragment folderPageFragment = this.b;
                return new dy5(new f7a(folderPageFragment.G2(), folderPageFragment.r1, folderPageFragment.m1), new d26(folderPageFragment, 1));
            default:
                FolderPageViewModel i33 = this.b.i3();
                z26 z263 = i33.p;
                if (z263 instanceof z26) {
                    i33.n();
                    if (!Intrinsics.areEqual((Object) i33.k().a, (Object) "all.chat.folder")) {
                        ev0.v(b0h.C(i33), ((osa) i33.j).a(), (f14) null, new i36(z263, (Continuation) null, i33), 2);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
