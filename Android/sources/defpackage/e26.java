package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.settings.folders.page.FolderPageFragment;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: e26  reason: default package */
public final /* synthetic */ class e26 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderPageFragment b;

    public /* synthetic */ e26(FolderPageFragment folderPageFragment, int i) {
        this.a = i;
        this.b = folderPageFragment;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.i3().l();
                return;
            case 1:
                this.b.i3().l();
                return;
            case 2:
                FolderPageFragment folderPageFragment = this.b;
                v16 v16 = new v16(folderPageFragment.E2(), EnumSet.allOf(u16.class));
                v16.h = new b26(folderPageFragment, 1);
                v16.i = new b26(folderPageFragment, 2);
                v16.d = false;
                g26 g26 = folderPageFragment.D1;
                g26.getClass();
                v16.showAsDropDown((AppCompatImageButton) g26.z.getValue(g26, g26.X[4]), 0, 0, 8388661);
                return;
            default:
                FolderPageViewModel i3 = this.b.i3();
                z26 z26 = i3.p;
                if ((z26 instanceof z26) && !Intrinsics.areEqual((Object) z26.a, (Object) "all.chat.folder")) {
                    i3.n();
                    xme xme = i3.m;
                    o85 o85 = new o85(new d36(new yy5(z26.a)));
                    xme.getClass();
                    xme.m((Object) null, o85);
                    return;
                }
                return;
        }
    }
}
