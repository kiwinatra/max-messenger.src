package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: ng3  reason: default package */
public final class ng3 {
    public final Bundle a;

    public ng3(ngf ngf, Bundle bundle, jgd jgd) {
        Bundle bundle2 = new Bundle();
        this.a = bundle2;
        bundle2.putParcelable("title", ngf);
        bundle2.putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        if (jgd != null) {
            bundle2.putString("stat_screen", jgd.name());
        }
    }

    public final void a(pg3... pg3Arr) {
        Bundle bundle = this.a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        CollectionsKt__MutableCollectionsKt.addAll(parcelableArrayList, (T[]) pg3Arr);
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void b(int i, igf igf) {
        Bundle bundle = this.a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        parcelableArrayList.add(new pg3(i, igf, og3.a));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void c(int i, igf igf) {
        Bundle bundle = this.a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        parcelableArrayList.add(new pg3(i, igf, og3.b));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void d(int i, igf igf) {
        Bundle bundle = this.a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        parcelableArrayList.add(new pg3(i, igf, og3.c));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final ConfirmationBottomSheet e() {
        return new ConfirmationBottomSheet(this.a);
    }

    public final void f(ngf ngf) {
        Bundle bundle = this.a;
        if (ngf == null) {
            bundle.remove("description");
        } else {
            bundle.putParcelable("description", ngf);
        }
    }
}
