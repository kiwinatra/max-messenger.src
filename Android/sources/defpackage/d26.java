package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import ru.ok.messages.settings.folders.page.FolderPageFragment;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: d26  reason: default package */
public final /* synthetic */ class d26 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderPageFragment b;

    public /* synthetic */ d26(FolderPageFragment folderPageFragment, int i) {
        this.a = i;
        this.b = folderPageFragment;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                xla xla = (xla) obj;
                this.b.i3().l();
                return Unit.INSTANCE;
            case 1:
                FolderPageFragment folderPageFragment = this.b;
                by5 by5 = (by5) obj;
                if (by5 instanceof by5) {
                    if (by5.a.c != null) {
                        FolderPageViewModel i3 = folderPageFragment.i3();
                        a32 a32 = by5.a.c;
                        z26 z26 = i3.p;
                        if (z26 instanceof z26) {
                            ev0.v(b0h.C(i3), (CoroutineContext) null, (f14) null, new l36(i3, z26, a32, (Continuation) null), 3);
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new NoWhenBranchMatchedException();
            default:
                s26 s26 = (s26) obj;
                a32 a322 = s26.c;
                FolderPageFragment folderPageFragment2 = this.b;
                if (a322 != null) {
                    FolderPageViewModel i32 = folderPageFragment2.i3();
                    long j = s26.c.a;
                    xme xme = i32.m;
                    o85 o85 = new o85(new b36(j));
                    xme.getClass();
                    xme.m((Object) null, o85);
                } else {
                    folderPageFragment2.i3().m();
                }
                return Unit.INSTANCE;
        }
    }
}
