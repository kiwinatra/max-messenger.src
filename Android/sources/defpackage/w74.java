package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;

/* renamed from: w74  reason: default package */
public final class w74 extends fw7 {
    public final View d(a aVar) {
        if (aVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) aVar;
            if (linearLayoutManager.S0() == 0 || linearLayoutManager.W0() == linearLayoutManager.G() - 1) {
                return null;
            }
        }
        return super.d(aVar);
    }
}
