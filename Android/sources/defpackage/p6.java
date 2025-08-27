package defpackage;

import android.content.Intent;
import android.os.Bundle;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: p6  reason: default package */
public abstract class p6 extends m5 {
    public static void T(FrgBase frgBase, int i, int i2) {
        Intent intent = new Intent(frgBase.M1(), p6.class);
        intent.putExtra("ru.ok.tamtam.extra.TYPE", i);
        frgBase.S2(intent, i2, (Bundle) null);
    }
}
