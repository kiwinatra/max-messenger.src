package defpackage;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import ru.ok.messages.gallery.AlbumsSelectionFragment;

/* renamed from: kc  reason: default package */
public final /* synthetic */ class kc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlbumsSelectionFragment b;

    public /* synthetic */ kc(AlbumsSelectionFragment albumsSelectionFragment, int i) {
        this.a = i;
        this.b = albumsSelectionFragment;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.i3().q();
                return;
            default:
                AlbumsSelectionFragment albumsSelectionFragment = this.b;
                lc lcVar = albumsSelectionFragment.B1;
                lcVar.getClass();
                if (((Toolbar) lcVar.o.getValue(lcVar, lc.y[1])).isClickable() && albumsSelectionFragment.B1.e().w == null) {
                    albumsSelectionFragment.i3().p();
                    return;
                }
                return;
        }
    }
}
