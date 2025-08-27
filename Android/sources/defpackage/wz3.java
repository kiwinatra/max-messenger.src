package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wz3  reason: default package */
public final class wz3 extends ViewGroup.MarginLayoutParams {
    public tz3 a;
    public boolean b = false;
    public int c = 0;
    public final int d = 0;
    public final int e = -1;
    public final int f = -1;
    public int g = 0;
    public int h = 0;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final Rect q = new Rect();

    public wz3(int i2, int i3) {
        super(i2, i3);
    }

    public final boolean a(int i2) {
        if (i2 == 0) {
            return this.n;
        }
        if (i2 != 1) {
            return false;
        }
        return this.o;
    }

    public final void b(tz3 tz3) {
        tz3 tz32 = this.a;
        if (tz32 != tz3) {
            if (tz32 != null) {
                tz32.j();
            }
            this.a = tz3;
            this.b = true;
            if (tz3 != null) {
                tz3.g(this);
            }
        }
    }

    public wz3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        tz3 tz3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoc.CoordinatorLayout_Layout);
        this.c = obtainStyledAttributes.getInteger(eoc.CoordinatorLayout_Layout_android_layout_gravity, 0);
        this.f = obtainStyledAttributes.getResourceId(eoc.CoordinatorLayout_Layout_layout_anchor, -1);
        this.d = obtainStyledAttributes.getInteger(eoc.CoordinatorLayout_Layout_layout_anchorGravity, 0);
        this.e = obtainStyledAttributes.getInteger(eoc.CoordinatorLayout_Layout_layout_keyline, -1);
        this.g = obtainStyledAttributes.getInt(eoc.CoordinatorLayout_Layout_layout_insetEdge, 0);
        this.h = obtainStyledAttributes.getInt(eoc.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(eoc.CoordinatorLayout_Layout_layout_behavior);
        this.b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(eoc.CoordinatorLayout_Layout_layout_behavior);
            String str = CoordinatorLayout.E0;
            if (TextUtils.isEmpty(string)) {
                tz3 = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.E0;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.G0;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.F0);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    tz3 = (tz3) constructor.newInstance(new Object[]{context, attributeSet});
                } catch (Exception e2) {
                    throw new RuntimeException(a81.m("Could not inflate Behavior subclass ", string), e2);
                }
            }
            this.a = tz3;
        }
        obtainStyledAttributes.recycle();
        tz3 tz32 = this.a;
        if (tz32 != null) {
            tz32.g(this);
        }
    }

    public wz3(wz3 wz3) {
        super(wz3);
    }

    public wz3(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public wz3(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
