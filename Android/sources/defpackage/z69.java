package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.markers.KMutableIterator;

/* renamed from: z69  reason: default package */
public final class z69 implements Iterator, KMutableIterator {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z69(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b < ((Menu) this.c).size();
            default:
                return this.b < ((ViewGroup) this.c).getChildCount();
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                int i = this.b;
                this.b = i + 1;
                MenuItem item = ((Menu) this.c).getItem(i);
                if (item != null) {
                    return item;
                }
                throw new IndexOutOfBoundsException();
            default:
                int i2 = this.b;
                this.b = i2 + 1;
                View childAt = ((ViewGroup) this.c).getChildAt(i2);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    public final void remove() {
        Unit unit;
        switch (this.a) {
            case 0:
                int i = this.b - 1;
                this.b = i;
                Menu menu = (Menu) this.c;
                MenuItem item = menu.getItem(i);
                if (item != null) {
                    menu.removeItem(item.getItemId());
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    throw new IndexOutOfBoundsException();
                }
                return;
            default:
                int i2 = this.b - 1;
                this.b = i2;
                ((ViewGroup) this.c).removeViewAt(i2);
                return;
        }
    }
}
