package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.a;
import java.util.ArrayList;

public class PickPhotoDialog extends DialogFragment {
    public final Dialog V2(Bundle bundle) {
        boolean z = F2().getBoolean("ru.ok.tamtam.RESULT");
        ArrayList arrayList = new ArrayList(z ? 3 : 2);
        arrayList.add(S1(qad.P3));
        arrayList.add(S1(qad.V3));
        if (z) {
            arrayList.add(S1(qad.a2));
        }
        cg8 cg8 = new cg8(G2());
        cg8.r(qad.p7);
        cg8.h((CharSequence[]) arrayList.toArray(new CharSequence[0]), new d10(18, (Object) this));
        return cg8.create();
    }

    public final void Z2(int i) {
        Intent intent = new Intent();
        intent.putExtra("ru.ok.tamtam.RESULT", i);
        a U1 = U1(true);
        if (U1 != null) {
            U1.f2(V1(), -1, intent);
        }
    }
}
