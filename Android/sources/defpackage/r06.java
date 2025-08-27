package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersFragment;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersViewModel;

/* renamed from: r06  reason: default package */
public final /* synthetic */ class r06 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderFiltersFragment b;

    public /* synthetic */ r06(FolderFiltersFragment folderFiltersFragment, int i) {
        this.a = i;
        this.b = folderFiltersFragment;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                xla xla = (xla) obj;
                ((z16) this.b.B1).n1();
                return Unit.INSTANCE;
            case 1:
                FolderFiltersViewModel h3 = this.b.h3();
                h3.getClass();
                ev0.v(b0h.C(h3), ((osa) h3.g).b(), (f14) null, new d16(h3, (qo5) obj, (Continuation) null), 2);
                return Unit.INSTANCE;
            case 2:
                FolderFiltersViewModel h32 = this.b.h3();
                h32.getClass();
                ev0.v(b0h.C(h32), ((osa) h32.g).b(), (f14) null, new e16(h32, (qo5) obj, (Continuation) null), 2);
                return Unit.INSTANCE;
            default:
                FolderFiltersViewModel h33 = this.b.h3();
                h33.getClass();
                ev0.v(b0h.C(h33), ((osa) h33.g).b(), (f14) null, new f16(h33, (qo5) obj, (Continuation) null), 2);
                return Unit.INSTANCE;
        }
    }
}
