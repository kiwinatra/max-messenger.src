package defpackage;

import android.app.Application;
import android.content.Intent;
import androidx.fragment.app.b;
import kotlin.jvm.functions.Function0;
import ru.ok.messages.gallery.AlbumsSelectionFragment;

/* renamed from: jc  reason: default package */
public final /* synthetic */ class jc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlbumsSelectionFragment b;

    public /* synthetic */ jc(AlbumsSelectionFragment albumsSelectionFragment, int i) {
        this.a = i;
        this.b = albumsSelectionFragment;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                b E2 = this.b.E2();
                Application application = E2.getApplication();
                Intent intent = E2.getIntent();
                return new nn6(application, E2, intent != null ? intent.getExtras() : null);
            case 1:
                return this.b.H2();
            case 2:
                AlbumsSelectionFragment albumsSelectionFragment = this.b;
                return new nn6(albumsSelectionFragment.E2().getApplication(), albumsSelectionFragment.H2(), albumsSelectionFragment.H2().x);
            default:
                return new yk6(new l(7, this.b));
        }
    }
}
