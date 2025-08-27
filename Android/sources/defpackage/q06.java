package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersFragment;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersViewModel;

/* renamed from: q06  reason: default package */
public final /* synthetic */ class q06 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderFiltersFragment b;

    public /* synthetic */ q06(FolderFiltersFragment folderFiltersFragment, int i) {
        this.a = i;
        this.b = folderFiltersFragment;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((z16) this.b.B1).n1();
                return;
            default:
                FolderFiltersViewModel h3 = this.b.h3();
                h3.getClass();
                ev0.v(b0h.C(h3), ((osa) h3.g).b(), (f14) null, new c16(h3, (Continuation) null), 2);
                return;
        }
    }
}
