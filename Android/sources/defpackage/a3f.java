package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: a3f  reason: default package */
public final class a3f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] o = {MenuItem.class};
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ a3f() {
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.a) {
            case 0:
                Method method = (Method) this.c;
                try {
                    Class<?> returnType = method.getReturnType();
                    Class<?> cls = Boolean.TYPE;
                    Object obj = this.b;
                    if (returnType == cls) {
                        return ((Boolean) method.invoke(obj, new Object[]{menuItem})).booleanValue();
                    }
                    method.invoke(obj, new Object[]{menuItem});
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((y69) this.c).M(menuItem));
        }
    }

    public a3f(y69 y69, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = y69;
        this.b = onMenuItemClickListener;
    }
}
