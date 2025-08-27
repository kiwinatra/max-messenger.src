package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: m69  reason: default package */
public class m69 implements Menu {
    public static final int[] H0 = {1, 4, 5, 3, 2, 0};
    public boolean A0 = false;
    public boolean B0 = false;
    public final ArrayList C0 = new ArrayList();
    public final CopyOnWriteArrayList D0 = new CopyOnWriteArrayList();
    public u69 E0;
    public boolean F0 = false;
    public boolean G0;
    public final ArrayList X;
    public boolean Y;
    public int Z = 0;
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean o;
    public k69 v;
    public CharSequence v0;
    public final ArrayList w;
    public Drawable w0;
    public final ArrayList x;
    public View x0;
    public boolean y;
    public boolean y0 = false;
    public final ArrayList z;
    public boolean z0 = false;

    public m69(Context context) {
        boolean z2 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = true;
        this.z = new ArrayList();
        this.X = new ArrayList();
        this.Y = true;
        if (resources.getConfiguration().keyboard != 1 && iag.b(ViewConfiguration.get(context))) {
            z2 = true;
        }
        this.o = z2;
    }

    public final u69 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = (-65536 & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (H0[i5] << 16) | (65535 & i3);
        u69 u69 = new u69(this, i, i2, i3, i6, charSequence, this.Z);
        ArrayList arrayList = this.w;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            } else if (((u69) arrayList.get(size)).o <= i6) {
                i4 = size + 1;
                break;
            } else {
                size--;
            }
        }
        arrayList.add(i4, u69);
        p(true);
        return u69;
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            u69 r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.x = r3
            if (r15 == 0) goto L_0x0058
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x0058
            r15[r14] = r4
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m69.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(i79 i79, Context context) {
        this.D0.add(new WeakReference(i79));
        i79.j(context, this);
        this.Y = true;
    }

    public final void c(boolean z2) {
        if (!this.B0) {
            this.B0 = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.D0;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                i79 i79 = (i79) weakReference.get();
                if (i79 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    i79.m(this, z2);
                }
            }
            this.B0 = false;
        }
    }

    public final void clear() {
        u69 u69 = this.E0;
        if (u69 != null) {
            d(u69);
        }
        this.w.clear();
        p(true);
    }

    public final void clearHeader() {
        this.w0 = null;
        this.v0 = null;
        this.x0 = null;
        p(false);
    }

    public final void close() {
        c(true);
    }

    public boolean d(u69 u69) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.D0;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.E0 == u69) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                i79 i79 = (i79) weakReference.get();
                if (i79 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = i79.e(u69);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.E0 = null;
            }
        }
        return z2;
    }

    public boolean e(m69 m69, MenuItem menuItem) {
        k69 k69 = this.v;
        return k69 != null && k69.h(m69, menuItem);
    }

    public boolean f(u69 u69) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.D0;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            i79 i79 = (i79) weakReference.get();
            if (i79 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = i79.g(u69);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.E0 = u69;
        }
        return z2;
    }

    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            u69 u69 = (u69) arrayList.get(i2);
            if (u69.a == i) {
                return u69;
            }
            if (u69.hasSubMenu() && (findItem = u69.x0.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final u69 g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.C0;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (u69) arrayList.get(0);
        }
        boolean n = n();
        for (int i2 = 0; i2 < size; i2++) {
            u69 u69 = (u69) arrayList.get(i2);
            char c2 = n ? u69.X : u69.y;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n && c2 == 8 && i == 67))) {
                return u69;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i) {
        return (MenuItem) this.w.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean n = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                u69 u69 = (u69) arrayList.get(i2);
                if (u69.hasSubMenu()) {
                    u69.x0.h(list, i, keyEvent);
                }
                char c2 = n ? u69.X : u69.y;
                if ((modifiers & 69647) == ((n ? u69.Y : u69.z) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (n && c2 == 8 && i == 67)) && u69.isEnabled()) {
                        list.add(u69);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.G0) {
            return true;
        }
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((u69) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l = l();
        if (this.Y) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.D0;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                i79 i79 = (i79) weakReference.get();
                if (i79 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= i79.d();
                }
            }
            ArrayList arrayList = this.z;
            ArrayList arrayList2 = this.X;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    u69 u69 = (u69) l.get(i);
                    if (u69.f()) {
                        arrayList.add(u69);
                    } else {
                        arrayList2.add(u69);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.Y = false;
        }
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public m69 k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.y;
        ArrayList arrayList = this.x;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            u69 u69 = (u69) arrayList2.get(i);
            if (u69.isVisible()) {
                arrayList.add(u69);
            }
        }
        this.y = false;
        this.Y = true;
        return arrayList;
    }

    public boolean m() {
        return this.F0;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.o;
    }

    public final void p(boolean z2) {
        if (!this.y0) {
            if (z2) {
                this.y = true;
                this.Y = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.D0;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    i79 i79 = (i79) weakReference.get();
                    if (i79 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        i79.h();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.z0 = true;
        if (z2) {
            this.A0 = true;
        }
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), (i79) null, i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        u69 g = g(i, keyEvent);
        boolean q = g != null ? q(g, (i79) null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return q;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.MenuItem r7, defpackage.i79 r8, int r9) {
        /*
            r6 = this;
            u69 r7 = (defpackage.u69) r7
            r0 = 0
            if (r7 == 0) goto L_0x00c4
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00c4
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.y0
            r2 = 1
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r1 = r2
            goto L_0x0039
        L_0x001a:
            m69 r1 = r7.w0
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L_0x0023
            goto L_0x0018
        L_0x0023:
            android.content.Intent r3 = r7.x
            if (r3 == 0) goto L_0x002d
            android.content.Context r1 = r1.a     // Catch:{ ActivityNotFoundException -> 0x002d }
            r1.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x002d }
            goto L_0x0018
        L_0x002d:
            c8 r1 = r7.J0
            if (r1 == 0) goto L_0x0038
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0038
            goto L_0x0018
        L_0x0038:
            r1 = r0
        L_0x0039:
            c8 r3 = r7.J0
            if (r3 == 0) goto L_0x0045
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x0045
            r4 = r2
            goto L_0x0046
        L_0x0045:
            r4 = r0
        L_0x0046:
            boolean r5 = r7.e()
            if (r5 == 0) goto L_0x0058
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00c3
            r6.c(r2)
            goto L_0x00c3
        L_0x0058:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0069
            if (r4 == 0) goto L_0x0061
            goto L_0x0069
        L_0x0061:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00c3
            r6.c(r2)
            goto L_0x00c3
        L_0x0069:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0070
            r6.c(r0)
        L_0x0070:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0084
            lye r9 = new lye
            android.content.Context r5 = r6.a
            r9.<init>(r5, r6, r7)
            r7.x0 = r9
            java.lang.CharSequence r5 = r7.v
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0084:
            lye r7 = r7.x0
            if (r4 == 0) goto L_0x008b
            r3.f(r7)
        L_0x008b:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.D0
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x0094
            goto L_0x00bd
        L_0x0094:
            if (r8 == 0) goto L_0x009a
            boolean r0 = r8.c(r7)
        L_0x009a:
            java.util.Iterator r8 = r9.iterator()
        L_0x009e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x00bd
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            i79 r4 = (defpackage.i79) r4
            if (r4 != 0) goto L_0x00b6
            r9.remove(r3)
            goto L_0x009e
        L_0x00b6:
            if (r0 != 0) goto L_0x009e
            boolean r0 = r4.c(r7)
            goto L_0x009e
        L_0x00bd:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00c3
            r6.c(r2)
        L_0x00c3:
            return r1
        L_0x00c4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m69.q(android.view.MenuItem, i79, int):boolean");
    }

    public final void r(i79 i79) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.D0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            i79 i792 = (i79) weakReference.get();
            if (i792 == null || i792 == i79) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void removeGroup(int i) {
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((u69) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((u69) arrayList.get(i3)).b != i) {
                    p(true);
                } else {
                    if (i3 >= 0) {
                        ArrayList arrayList2 = this.w;
                        if (i3 < arrayList2.size()) {
                            arrayList2.remove(i3);
                        }
                    }
                    i2 = i4;
                }
            }
            p(true);
        }
    }

    public final void removeItem(int i) {
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((u69) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.w;
            if (i2 < arrayList2.size()) {
                arrayList2.remove(i2);
                p(true);
            }
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.w.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((lye) item.getSubMenu()).s(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            u69 u69 = (u69) arrayList.get(i2);
            if (u69.b == i) {
                u69.G0 = (u69.G0 & -5) | (z3 ? 4 : 0);
                u69.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.F0 = z2;
    }

    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            u69 u69 = (u69) arrayList.get(i2);
            if (u69.b == i) {
                u69.setEnabled(z2);
            }
        }
    }

    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            u69 u69 = (u69) arrayList.get(i2);
            if (u69.b == i) {
                int i3 = u69.G0;
                int i4 = (i3 & -9) | (z2 ? 0 : 8);
                u69.G0 = i4;
                if (i3 != i4) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.c = z2;
        p(false);
    }

    public final int size() {
        return this.w.size();
    }

    public final void t(Bundle bundle) {
        int size = this.w.size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((lye) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.x0 = view;
            this.v0 = null;
            this.w0 = null;
        } else {
            if (i > 0) {
                this.v0 = this.b.getText(i);
            } else if (charSequence != null) {
                this.v0 = charSequence;
            }
            if (i2 > 0) {
                this.w0 = ew3.b(this.a, i2);
            } else if (drawable != null) {
                this.w0 = drawable;
            }
            this.x0 = null;
        }
        p(false);
    }

    public final void v() {
        this.y0 = false;
        if (this.z0) {
            this.z0 = false;
            p(this.A0);
        }
    }

    public final void w() {
        if (!this.y0) {
            this.y0 = true;
            this.z0 = false;
            this.A0 = false;
        }
    }

    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.b.getString(i));
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        u69 a2 = a(i, i2, i3, charSequence);
        lye lye = new lye(this.a, this, a2);
        a2.x0 = lye;
        lye.setHeaderTitle(a2.v);
        return lye;
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.b.getString(i4));
    }
}
