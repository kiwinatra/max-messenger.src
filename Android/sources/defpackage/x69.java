package defpackage;

import android.view.MenuItem;
import ru.ok.messages.search.KeyboardHandlerSearchView;

/* renamed from: x69  reason: default package */
public final class x69 implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x69(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        switch (this.a) {
            case 0:
                return ((MenuItem.OnActionExpandListener) this.b).onMenuItemActionCollapse(((y69) this.c).M(menuItem));
            default:
                jkd jkd = (jkd) this.c;
                jkd.y = false;
                ikd b2 = jkd.b();
                if (b2 == null) {
                    return true;
                }
                b2.V0();
                return true;
        }
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        switch (this.a) {
            case 0:
                return ((MenuItem.OnActionExpandListener) this.b).onMenuItemActionExpand(((y69) this.c).M(menuItem));
            default:
                jkd jkd = (jkd) this.c;
                jkd.y = true;
                jkd.k((KeyboardHandlerSearchView) this.b);
                ikd b2 = jkd.b();
                if (b2 != null) {
                    b2.P0();
                }
                return true;
        }
    }
}
