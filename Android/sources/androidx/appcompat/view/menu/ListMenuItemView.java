package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements k79, AbsListView.SelectionBoundsAdjuster {
    public final boolean A0;
    public LayoutInflater B0;
    public boolean C0;
    public u69 a;
    public ImageView b;
    public RadioButton c;
    public TextView o;
    public CheckBox v;
    public final Drawable v0;
    public TextView w;
    public final int w0;
    public ImageView x;
    public final Context x0;
    public ImageView y;
    public boolean y0;
    public LinearLayout z;
    public final Drawable z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = hdc.listMenuViewStyle;
        g6d w2 = g6d.w(getContext(), attributeSet, koc.MenuView, i, 0);
        this.v0 = w2.q(koc.MenuView_android_itemBackground);
        int i2 = koc.MenuView_android_itemTextAppearance;
        TypedArray typedArray = (TypedArray) w2.c;
        this.w0 = typedArray.getResourceId(i2, -1);
        this.y0 = typedArray.getBoolean(koc.MenuView_preserveIconSpacing, false);
        this.x0 = context;
        this.z0 = w2.q(koc.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, hdc.dropDownListViewStyle, 0);
        this.A0 = obtainStyledAttributes.hasValue(0);
        w2.x();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.B0 == null) {
            this.B0 = LayoutInflater.from(getContext());
        }
        return this.B0;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.y;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.y.getLayoutParams();
            rect.top = this.y.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r0 == false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.u69 r11) {
        /*
            r10 = this;
            r10.a = r11
            boolean r0 = r11.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r0 = r2
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.v
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            m69 r0 = r11.w0
            boolean r0 = r0.o()
            r3 = 1
            if (r0 == 0) goto L_0x0037
            m69 r0 = r11.w0
            boolean r0 = r0.n()
            if (r0 == 0) goto L_0x0031
            char r0 = r11.X
            goto L_0x0033
        L_0x0031:
            char r0 = r11.y
        L_0x0033:
            if (r0 == 0) goto L_0x0037
            r0 = r3
            goto L_0x0038
        L_0x0037:
            r0 = r2
        L_0x0038:
            m69 r4 = r11.w0
            r4.n()
            if (r0 == 0) goto L_0x005e
            u69 r0 = r10.a
            m69 r4 = r0.w0
            boolean r4 = r4.o()
            if (r4 == 0) goto L_0x005a
            m69 r4 = r0.w0
            boolean r4 = r4.n()
            if (r4 == 0) goto L_0x0054
            char r0 = r0.X
            goto L_0x0056
        L_0x0054:
            char r0 = r0.y
        L_0x0056:
            if (r0 == 0) goto L_0x005a
            r0 = r3
            goto L_0x005b
        L_0x005a:
            r0 = r2
        L_0x005b:
            if (r0 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r2 = r1
        L_0x005f:
            if (r2 != 0) goto L_0x0113
            android.widget.TextView r0 = r10.w
            u69 r4 = r10.a
            m69 r5 = r4.w0
            boolean r5 = r5.n()
            if (r5 == 0) goto L_0x0070
            char r5 = r4.X
            goto L_0x0072
        L_0x0070:
            char r5 = r4.y
        L_0x0072:
            if (r5 != 0) goto L_0x0078
            java.lang.String r1 = ""
            goto L_0x0110
        L_0x0078:
            m69 r6 = r4.w0
            android.content.Context r7 = r6.a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r6.a
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            boolean r9 = r9.hasPermanentMenuKey()
            if (r9 == 0) goto L_0x009a
            int r9 = defpackage.zmc.abc_prepend_shortcut_label
            java.lang.String r9 = r7.getString(r9)
            r8.append(r9)
        L_0x009a:
            boolean r6 = r6.n()
            if (r6 == 0) goto L_0x00a3
            int r4 = r4.Y
            goto L_0x00a5
        L_0x00a3:
            int r4 = r4.z
        L_0x00a5:
            int r6 = defpackage.zmc.abc_menu_meta_shortcut_label
            java.lang.String r6 = r7.getString(r6)
            r9 = 65536(0x10000, float:9.18355E-41)
            defpackage.u69.a(r8, r4, r9, r6)
            int r6 = defpackage.zmc.abc_menu_ctrl_shortcut_label
            java.lang.String r6 = r7.getString(r6)
            r9 = 4096(0x1000, float:5.74E-42)
            defpackage.u69.a(r8, r4, r9, r6)
            int r6 = defpackage.zmc.abc_menu_alt_shortcut_label
            java.lang.String r6 = r7.getString(r6)
            r9 = 2
            defpackage.u69.a(r8, r4, r9, r6)
            int r6 = defpackage.zmc.abc_menu_shift_shortcut_label
            java.lang.String r6 = r7.getString(r6)
            defpackage.u69.a(r8, r4, r3, r6)
            int r3 = defpackage.zmc.abc_menu_sym_shortcut_label
            java.lang.String r3 = r7.getString(r3)
            r6 = 4
            defpackage.u69.a(r8, r4, r6, r3)
            int r3 = defpackage.zmc.abc_menu_function_shortcut_label
            java.lang.String r3 = r7.getString(r3)
            defpackage.u69.a(r8, r4, r1, r3)
            if (r5 == r1) goto L_0x0103
            r1 = 10
            if (r5 == r1) goto L_0x00f9
            r1 = 32
            if (r5 == r1) goto L_0x00ef
            r8.append(r5)
            goto L_0x010c
        L_0x00ef:
            int r1 = defpackage.zmc.abc_menu_space_shortcut_label
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x010c
        L_0x00f9:
            int r1 = defpackage.zmc.abc_menu_enter_shortcut_label
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x010c
        L_0x0103:
            int r1 = defpackage.zmc.abc_menu_delete_shortcut_label
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
        L_0x010c:
            java.lang.String r1 = r8.toString()
        L_0x0110:
            r0.setText(r1)
        L_0x0113:
            android.widget.TextView r0 = r10.w
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L_0x0120
            android.widget.TextView r0 = r10.w
            r0.setVisibility(r2)
        L_0x0120:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.z0
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.d(u69):void");
    }

    public u69 getItemData() {
        return this.a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.v0);
        TextView textView = (TextView) findViewById(egc.title);
        this.o = textView;
        int i = this.w0;
        if (i != -1) {
            textView.setTextAppearance(this.x0, i);
        }
        this.w = (TextView) findViewById(egc.shortcut);
        ImageView imageView = (ImageView) findViewById(egc.submenuarrow);
        this.x = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.z0);
        }
        this.y = (ImageView) findViewById(egc.group_divider);
        this.z = (LinearLayout) findViewById(egc.content);
    }

    public final void onMeasure(int i, int i2) {
        if (this.b != null && this.y0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z2) {
        View view;
        CompoundButton compoundButton;
        if (z2 || this.c != null || this.v != null) {
            if ((this.a.G0 & 4) != 0) {
                if (this.c == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(vjc.abc_list_menu_item_radio, this, false);
                    this.c = radioButton;
                    LinearLayout linearLayout = this.z;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.c;
                view = this.v;
            } else {
                if (this.v == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(vjc.abc_list_menu_item_checkbox, this, false);
                    this.v = checkBox;
                    LinearLayout linearLayout2 = this.z;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.v;
                view = this.c;
            }
            if (z2) {
                compoundButton.setChecked(this.a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.v;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.a.G0 & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(vjc.abc_list_menu_item_radio, this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.z;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.v == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(vjc.abc_list_menu_item_checkbox, this, false);
                this.v = checkBox;
                LinearLayout linearLayout2 = this.z;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.v;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.C0 = z2;
        this.y0 = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setVisibility((this.A0 || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.a.w0.getClass();
        boolean z2 = this.C0;
        if (z2 || this.y0) {
            ImageView imageView = this.b;
            if (imageView != null || drawable != null || this.y0) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(vjc.abc_list_menu_item_icon, this, false);
                    this.b = imageView2;
                    LinearLayout linearLayout = this.z;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.y0) {
                    ImageView imageView3 = this.b;
                    if (!z2) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.b.getVisibility() != 0) {
                        this.b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.o.setText(charSequence);
            if (this.o.getVisibility() != 0) {
                this.o.setVisibility(0);
            }
        } else if (this.o.getVisibility() != 8) {
            this.o.setVisibility(8);
        }
    }
}
