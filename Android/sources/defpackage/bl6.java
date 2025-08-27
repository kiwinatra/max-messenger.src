package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.b;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ok.messages.gallery.GalleryFragment;

/* renamed from: bl6  reason: default package */
public final /* synthetic */ class bl6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ GalleryFragment b;

    public /* synthetic */ bl6(GalleryFragment galleryFragment, int i) {
        this.a = i;
        this.b = galleryFragment;
    }

    public final Object invoke() {
        Bundle extras;
        pl6 pl6;
        switch (this.a) {
            case 0:
                GalleryFragment galleryFragment = this.b;
                b E2 = galleryFragment.E2();
                Intent intent = E2.getIntent();
                if (intent != null && (extras = intent.getExtras()) != null && !extras.containsKey("gallery_mode")) {
                    try {
                        pl6 = (pl6) galleryFragment.F2().getParcelable("gallery_mode");
                    } catch (Throwable unused) {
                        pl6 = pl6.v0;
                        pl6.getClass();
                        galleryFragment.L2(o54.f(TuplesKt.to("gallery_mode", pl6)));
                    }
                    Intent intent2 = E2.getIntent();
                    if (intent2 != null) {
                        intent2.putExtra("gallery_mode", pl6);
                    }
                } else if (galleryFragment.x != null) {
                    return new nn6(E2.getApplication(), E2, galleryFragment.F2());
                }
                return new nn6(E2.getApplication(), E2, E2.getIntent().getExtras());
            case 1:
                GalleryFragment galleryFragment2 = this.b;
                return new nn6(galleryFragment2.E2().getApplication(), galleryFragment2, galleryFragment2.x);
            case 2:
                return new jk6(this.b.k3());
            default:
                GalleryFragment galleryFragment3 = this.b;
                if (galleryFragment3.k3().m.b) {
                    n54.N(galleryFragment3, n54.l(), 162);
                } else {
                    n54.N(galleryFragment3, n54.n(), 157);
                }
                return Unit.INSTANCE;
        }
    }
}
