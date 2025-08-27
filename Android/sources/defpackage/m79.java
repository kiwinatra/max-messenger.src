package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: m79  reason: default package */
public class m79 extends fbf implements Menu {
    public final m69 v;

    public m79(Context context, m69 m69) {
        super(context);
        if (m69 != null) {
            this.v = m69;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return M(this.v.add(charSequence));
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.v.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = M(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.v.addSubMenu(charSequence);
    }

    public final void clear() {
        qae qae = (qae) this.c;
        if (qae != null) {
            qae.clear();
        }
        this.v.clear();
    }

    public final void close() {
        this.v.close();
    }

    public final MenuItem findItem(int i) {
        return M(this.v.findItem(i));
    }

    public final MenuItem getItem(int i) {
        return M(this.v.getItem(i));
    }

    public final boolean hasVisibleItems() {
        return this.v.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.v.isShortcutKey(i, keyEvent);
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return this.v.performIdentifierAction(i, i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.v.performShortcut(i, keyEvent, i2);
    }

    public final void removeGroup(int i) {
        if (((qae) this.c) != null) {
            int i2 = 0;
            while (true) {
                qae qae = (qae) this.c;
                if (i2 >= qae.c) {
                    break;
                }
                if (((d3f) qae.f(i2)).getGroupId() == i) {
                    ((qae) this.c).g(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.v.removeGroup(i);
    }

    public final void removeItem(int i) {
        if (((qae) this.c) != null) {
            int i2 = 0;
            while (true) {
                qae qae = (qae) this.c;
                if (i2 >= qae.c) {
                    break;
                } else if (((d3f) qae.f(i2)).getItemId() == i) {
                    ((qae) this.c).g(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.v.removeItem(i);
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.v.setGroupCheckable(i, z, z2);
    }

    public final void setGroupEnabled(int i, boolean z) {
        this.v.setGroupEnabled(i, z);
    }

    public final void setGroupVisible(int i, boolean z) {
        this.v.setGroupVisible(i, z);
    }

    public final void setQwertyMode(boolean z) {
        this.v.setQwertyMode(z);
    }

    public final int size() {
        return this.v.size();
    }

    public final MenuItem add(int i) {
        return M(this.v.add(i));
    }

    public final SubMenu addSubMenu(int i) {
        return this.v.addSubMenu(i);
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return M(this.v.add(i, i2, i3, charSequence));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.v.addSubMenu(i, i2, i3, charSequence);
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return M(this.v.add(i, i2, i3, i4));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.v.addSubMenu(i, i2, i3, i4);
    }
}
