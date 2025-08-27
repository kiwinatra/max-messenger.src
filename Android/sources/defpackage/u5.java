package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: u5  reason: default package */
public abstract class u5 extends m5 {
    public static final /* synthetic */ int z0 = 0;

    public static void T(FrgBase frgBase, Bundle bundle, int i, Serializable serializable) {
        Intent intent = new Intent(frgBase.M1(), u5.class);
        if (bundle != null) {
            intent.putExtra("ru.ok.tamtam.extra.TRANSIT_BUNDLE", bundle);
        }
        intent.putExtra("act:chat_picker:serial", serializable);
        frgBase.S2(intent, i, (Bundle) null);
    }
}
