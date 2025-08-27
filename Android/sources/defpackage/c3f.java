package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import kotlin.io.ConstantsKt;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: c3f  reason: default package */
public final class c3f extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public c3f(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        b3f b3f = new b3f(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z2 && name2.equals(str)) {
                            XmlResourceParser xmlResourceParser3 = xmlResourceParser;
                            z2 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            i = 2;
                        } else if (name2.equals("group")) {
                            b3f.b = 0;
                            b3f.c = 0;
                            b3f.d = 0;
                            b3f.e = 0;
                            b3f.f = true;
                            b3f.g = true;
                        } else if (name2.equals("item")) {
                            if (!b3f.h) {
                                c8 c8Var = b3f.z;
                                if (c8Var == null || !c8Var.a()) {
                                    b3f.h = true;
                                    b3f.b(b3f.a.add(b3f.b, b3f.i, b3f.j, b3f.k));
                                } else {
                                    b3f.h = true;
                                    b3f.b(b3f.a.addSubMenu(b3f.b, b3f.i, b3f.j, b3f.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                            z = true;
                            eventType = xmlResourceParser.next();
                            i = 2;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    c3f c3f = b3f.E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c3f.c.obtainStyledAttributes(attributeSet2, koc.MenuGroup);
                        b3f.b = obtainStyledAttributes.getResourceId(koc.MenuGroup_android_id, 0);
                        b3f.c = obtainStyledAttributes.getInt(koc.MenuGroup_android_menuCategory, 0);
                        b3f.d = obtainStyledAttributes.getInt(koc.MenuGroup_android_orderInCategory, 0);
                        b3f.e = obtainStyledAttributes.getInt(koc.MenuGroup_android_checkableBehavior, 0);
                        b3f.f = obtainStyledAttributes.getBoolean(koc.MenuGroup_android_visible, true);
                        b3f.g = obtainStyledAttributes.getBoolean(koc.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = c3f.c;
                        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, koc.MenuItem);
                        b3f.i = obtainStyledAttributes2.getResourceId(koc.MenuItem_android_id, 0);
                        b3f.j = (obtainStyledAttributes2.getInt(koc.MenuItem_android_orderInCategory, b3f.d) & 65535) | (obtainStyledAttributes2.getInt(koc.MenuItem_android_menuCategory, b3f.c) & -65536);
                        b3f.k = obtainStyledAttributes2.getText(koc.MenuItem_android_title);
                        b3f.l = obtainStyledAttributes2.getText(koc.MenuItem_android_titleCondensed);
                        b3f.m = obtainStyledAttributes2.getResourceId(koc.MenuItem_android_icon, 0);
                        String string = obtainStyledAttributes2.getString(koc.MenuItem_android_alphabeticShortcut);
                        b3f.n = string == null ? 0 : string.charAt(0);
                        b3f.o = obtainStyledAttributes2.getInt(koc.MenuItem_alphabeticModifiers, ConstantsKt.DEFAULT_BLOCK_SIZE);
                        String string2 = obtainStyledAttributes2.getString(koc.MenuItem_android_numericShortcut);
                        b3f.p = string2 == null ? 0 : string2.charAt(0);
                        b3f.q = obtainStyledAttributes2.getInt(koc.MenuItem_numericModifiers, ConstantsKt.DEFAULT_BLOCK_SIZE);
                        if (obtainStyledAttributes2.hasValue(koc.MenuItem_android_checkable)) {
                            b3f.r = obtainStyledAttributes2.getBoolean(koc.MenuItem_android_checkable, false) ? 1 : 0;
                        } else {
                            b3f.r = b3f.e;
                        }
                        b3f.s = obtainStyledAttributes2.getBoolean(koc.MenuItem_android_checked, false);
                        b3f.t = obtainStyledAttributes2.getBoolean(koc.MenuItem_android_visible, b3f.f);
                        b3f.u = obtainStyledAttributes2.getBoolean(koc.MenuItem_android_enabled, b3f.g);
                        b3f.v = obtainStyledAttributes2.getInt(koc.MenuItem_showAsAction, -1);
                        b3f.y = obtainStyledAttributes2.getString(koc.MenuItem_android_onClick);
                        b3f.w = obtainStyledAttributes2.getResourceId(koc.MenuItem_actionLayout, 0);
                        b3f.x = obtainStyledAttributes2.getString(koc.MenuItem_actionViewClass);
                        String string3 = obtainStyledAttributes2.getString(koc.MenuItem_actionProviderClass);
                        if (string3 != null && b3f.w == 0 && b3f.x == null) {
                            b3f.z = (c8) b3f.a(string3, f, c3f.b);
                        } else {
                            b3f.z = null;
                        }
                        b3f.A = obtainStyledAttributes2.getText(koc.MenuItem_contentDescription);
                        b3f.B = obtainStyledAttributes2.getText(koc.MenuItem_tooltipText);
                        if (obtainStyledAttributes2.hasValue(koc.MenuItem_iconTintMode)) {
                            b3f.D = yu4.c(obtainStyledAttributes2.getInt(koc.MenuItem_iconTintMode, -1), b3f.D);
                        } else {
                            b3f.D = null;
                        }
                        if (obtainStyledAttributes2.hasValue(koc.MenuItem_iconTint)) {
                            int i2 = koc.MenuItem_iconTint;
                            if (!obtainStyledAttributes2.hasValue(i2) || (resourceId = obtainStyledAttributes2.getResourceId(i2, 0)) == 0 || (colorStateList = q8.j(resourceId, context)) == null) {
                                colorStateList = obtainStyledAttributes2.getColorStateList(i2);
                            }
                            b3f.C = colorStateList;
                        } else {
                            b3f.C = null;
                        }
                        obtainStyledAttributes2.recycle();
                        b3f.h = false;
                    } else {
                        if (name3.equals("menu")) {
                            b3f.h = true;
                            SubMenu addSubMenu = b3f.a.addSubMenu(b3f.b, b3f.i, b3f.j, b3f.k);
                            b3f.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet2, addSubMenu);
                        } else {
                            XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlResourceParser.next();
                        i = 2;
                    }
                }
                XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                eventType = xmlResourceParser.next();
                i = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof m69)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            XmlResourceParser layout = this.c.getResources().getLayout(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
            if (menu instanceof m69) {
                m69 m69 = (m69) menu;
                if (!m69.y0) {
                    m69.w();
                    z = true;
                }
            }
            b(layout, asAttributeSet, menu);
            if (z) {
                ((m69) menu).v();
            }
            layout.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (0 != 0) {
                ((m69) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
