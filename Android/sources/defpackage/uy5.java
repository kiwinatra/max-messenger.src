package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;
import ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment;
import ru.ok.messages.settings.folders.edit.presentation.FolderEditViewModel;

/* renamed from: uy5  reason: default package */
public final /* synthetic */ class uy5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderEditFragment b;

    public /* synthetic */ uy5(FolderEditFragment folderEditFragment, int i) {
        this.a = i;
        this.b = folderEditFragment;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.k3(false);
                return;
            case 1:
                FolderEditFragment folderEditFragment = this.b;
                FolderEditViewModel j3 = folderEditFragment.j3();
                xme xme = j3.h;
                zz5 a2 = zz5.a(j3.j(), false, (e15) null, false, 125);
                xme.getClass();
                xme.m((Object) null, a2);
                folderEditFragment.j3().l(folderEditFragment.G1.f().getText());
                return;
            case 2:
                FolderEditViewModel j32 = this.b.j3();
                xme xme2 = j32.h;
                zz5 a3 = zz5.a(j32.j(), true, (e15) null, false, 126);
                xme2.getClass();
                xme2.m((Object) null, a3);
                return;
            default:
                FolderEditFragment folderEditFragment2 = this.b;
                FolderEditViewModel j33 = folderEditFragment2.j3();
                String obj = StringsKt.trim((CharSequence) folderEditFragment2.G1.f().getText().toString()).toString();
                j33.getClass();
                ev0.v(b0h.C(j33), (CoroutineContext) null, (f14) null, new i06(j33, obj, (Continuation) null), 3);
                return;
        }
    }
}
