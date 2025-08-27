package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel;

/* renamed from: c46  reason: default package */
public final /* synthetic */ class c46 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderSettingsFragment b;

    public /* synthetic */ c46(FolderSettingsFragment folderSettingsFragment, int i) {
        this.a = i;
        this.b = folderSettingsFragment;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.i3().k();
                return;
            default:
                FolderSettingsViewModel i3 = this.b.i3();
                i3.getClass();
                ev0.v(b0h.C(i3), (CoroutineContext) null, (f14) null, new c56(i3, (Continuation) null), 3);
                return;
        }
    }
}
