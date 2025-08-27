package defpackage;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import ru.ok.messages.search.KeyboardHandlerSearchView;

/* renamed from: i4a  reason: default package */
public final /* synthetic */ class i4a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4a b;

    public /* synthetic */ i4a(j4a j4a, int i) {
        this.a = i;
        this.b = j4a;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                j4a j4a = this.b;
                ((Toolbar) j4a.y0.c).setVisibility(4);
                j4a.a0();
                return;
            default:
                j4a j4a2 = this.b;
                jkd jkd = j4a2.z0;
                String searchHint = j4a2.x0.getSearchHint();
                KeyboardHandlerSearchView e = jkd.e();
                if (e != null && !searchHint.isEmpty()) {
                    e.setQueryHint(searchHint);
                }
                MenuItem c = j4a2.z0.c();
                if (c != null) {
                    c.expandActionView();
                    return;
                }
                return;
        }
    }
}
