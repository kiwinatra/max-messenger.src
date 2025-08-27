package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.List;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: b6  reason: default package */
public abstract class b6 extends m5 implements yg6 {
    public static final /* synthetic */ int z0 = 0;

    public static Intent T(b bVar, ArrayList arrayList, List list, int i, int i2, long j) {
        Intent intent = new Intent(bVar, b6.class);
        if (arrayList != null) {
            intent.putExtra("ru.ok.tamtam.extra.CONTACT_LIST", cjf.i(arrayList));
        }
        if (list != null) {
            intent.putExtra("ru.ok.tamtam.extra.DISABLED_CONTACT_LIST", cjf.i(list));
        }
        intent.putExtra("ru.ok.tamtam.extra.PICKER_TYPE", tr1.x(i));
        intent.putExtra("ru.ok.tamtam.extra.PICKER_ACTION", tr1.w(i2));
        intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j);
        return intent;
    }

    public static void U(FrgBase frgBase, int i, ArrayList arrayList, List list, int i2, int i3, long j) {
        frgBase.S2(T(frgBase.M1(), arrayList, list, i2, i3, j), i, (Bundle) null);
    }
}
