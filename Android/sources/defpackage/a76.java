package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import ru.ok.messages.settings.folders.picker.FoldersPickerFragment;
import ru.ok.messages.settings.folders.picker.FoldersPickerViewModel;

/* renamed from: a76  reason: default package */
public final /* synthetic */ class a76 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FoldersPickerFragment b;

    public /* synthetic */ a76(FoldersPickerFragment foldersPickerFragment, int i) {
        this.a = i;
        this.b = foldersPickerFragment;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((z16) this.b.C1).n1();
                return;
            case 1:
                this.b.i3().m();
                return;
            case 2:
                xme xme = this.b.i3().n;
                o85 o85 = new o85(x76.a);
                xme.getClass();
                xme.m((Object) null, o85);
                return;
            default:
                FoldersPickerViewModel i3 = this.b.i3();
                i3.getClass();
                ev0.v(b0h.C(i3), (CoroutineContext) null, (f14) null, new c86(i3, (Continuation) null), 3);
                return;
        }
    }
}
