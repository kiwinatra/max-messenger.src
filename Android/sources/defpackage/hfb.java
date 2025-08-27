package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Lazy;
import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;
import ru.ok.tamtam.photoeditor.view.colorselector.ColorSelectorView;

/* renamed from: hfb  reason: default package */
public final class hfb implements View.OnClickListener, s53 {
    public static final int[] v0 = {-1, -16777216, -1226410, -160462, -144548, -9387952, -13068304, -9863937, -6092870, -3078039, -1210994, -11565, -140617, -15486, -2977978, -6724551, -12377308, -14923223, -14277082, -13224394, -11184811, -9211021, -6710887, -5066062, -3684409, -2368549, -1052689};
    public final AppCompatTextView X;
    public ffb Y;
    public Toast Z;
    public final HashSet a = new HashSet();
    public final View b;
    public final hq c;
    public final ImageButton o;
    public final ImageButton v;
    public final ImageButton w;
    public final TextView x;
    public final ImageButton y;
    public final ns0 z;

    public hfb(View view, hq hqVar) {
        this.b = view;
        this.c = hqVar;
        ImageButton imageButton = (ImageButton) view.findViewById(lic.act_photo_editor__btn_sticker);
        this.o = imageButton;
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) view.findViewById(lic.act_photo_editor__btn_undo);
        this.v = imageButton2;
        imageButton2.setOnClickListener(this);
        ImageButton imageButton3 = (ImageButton) view.findViewById(lic.act_photo_editor__btn_done);
        this.w = imageButton3;
        imageButton3.setOnClickListener(this);
        ImageButton imageButton4 = (ImageButton) view.findViewById(lic.act_photo_editor__btn_close);
        imageButton4.setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(lic.act_photo_editor__btn_clear);
        this.x = textView;
        textView.setOnClickListener(this);
        ImageButton imageButton5 = (ImageButton) view.findViewById(lic.act_photo_editor__btn_line_width);
        this.y = imageButton5;
        imageButton5.setOnClickListener(this);
        view.findViewById(lic.act_photo_editor__fl_line_width).setOnClickListener(this);
        ColorSelectorView colorSelectorView = (ColorSelectorView) view.findViewById(lic.act_photo_editor__view_color_selector);
        colorSelectorView.setColors(v0);
        colorSelectorView.setListener(this);
        ns0 ns0 = (ns0) view.findViewById(lic.act_photo_editor__view_brush_width);
        this.z = ns0;
        ((BrushWidthViewImpl) ns0).B0.add(this);
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        view.setBackgroundColor(k0.n);
        View findViewById = view.findViewById(lic.act_photo_editor__rl_buttons);
        int i = k0.I;
        findViewById.setBackgroundColor(i);
        view.findViewById(lic.act_photo_editor__rl_controls).setBackgroundColor(i);
        view.findViewById(lic.act_photo_editor__editor).setBackgroundColor(i);
        int i2 = k0.x;
        imageButton4.setColorFilter(i2);
        imageButton4.setBackground(k0.d());
        imageButton3.setColorFilter(k0.l);
        imageButton3.setBackground(k0.d());
        imageButton2.setColorFilter(i2);
        imageButton2.setBackground(k0.d());
        textView.setTextColor(i8b.j(k0.G, k0.N));
        textView.setBackground(k0.e());
        Context context2 = view.getContext();
        ro4 b2 = ro4.b();
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        this.X = appCompatTextView;
        appCompatTextView.setBackgroundColor(Color.parseColor("#404040"));
        this.X.setTextColor(-1);
        AppCompatTextView appCompatTextView2 = this.X;
        int i3 = b2.m;
        appCompatTextView2.setPadding(i3, i3, i3, i3);
        Resources resources = context2.getResources();
        int i4 = nad.C0;
        ThreadLocal threadLocal = h4d.a;
        Drawable a2 = c4d.a(resources, i4, (Resources.Theme) null);
        a2.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        this.X.setCompoundDrawablesRelativeWithIntrinsicBounds(a2, (Drawable) null, (Drawable) null, (Drawable) null);
        this.X.setCompoundDrawablePadding(b2.h);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = (float) b2.j;
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, (RectF) null, (float[]) null));
        shapeDrawable.setColorFilter(Color.parseColor("#404040"), PorterDuff.Mode.SRC);
        this.X.setBackground(shapeDrawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if ((r3.v && r3.o) != (r7 && r6)) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ffb r11) {
        /*
            r10 = this;
            boolean r0 = r11.b
            r1 = 1
            r0 = r0 ^ r1
            android.widget.ImageButton r2 = r10.v
            defpackage.iq.I(r2, r0)
            boolean r0 = r11.c
            r2 = 0
            if (r0 == 0) goto L_0x0010
            r0 = r2
            goto L_0x0011
        L_0x0010:
            r0 = 4
        L_0x0011:
            android.widget.TextView r3 = r10.x
            r3.setVisibility(r0)
            android.widget.ImageButton r0 = r10.w
            boolean r3 = r11.w
            r0.setEnabled(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0025
        L_0x0022:
            r3 = 1050253722(0x3e99999a, float:0.3)
        L_0x0025:
            r0.setAlpha(r3)
            ffb r3 = r10.Y
            r4 = 0
            android.widget.ImageButton r5 = r10.o
            boolean r6 = r11.v
            boolean r7 = r11.o
            if (r3 == 0) goto L_0x0047
            boolean r8 = r3.v
            if (r8 == 0) goto L_0x003d
            boolean r8 = r3.o
            if (r8 == 0) goto L_0x003d
            r8 = r1
            goto L_0x003e
        L_0x003d:
            r8 = r2
        L_0x003e:
            if (r7 == 0) goto L_0x0044
            if (r6 == 0) goto L_0x0044
            r9 = r1
            goto L_0x0045
        L_0x0044:
            r9 = r2
        L_0x0045:
            if (r8 == r9) goto L_0x00a5
        L_0x0047:
            if (r7 == 0) goto L_0x004c
            if (r6 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            if (r3 == 0) goto L_0x0080
            android.widget.Toast r3 = r10.Z
            if (r3 == 0) goto L_0x0058
            r3.cancel()
            r10.Z = r4
        L_0x0058:
            androidx.appcompat.widget.AppCompatTextView r3 = r10.X
            if (r1 == 0) goto L_0x005f
            int r6 = defpackage.qad.o7
            goto L_0x0061
        L_0x005f:
            int r6 = defpackage.qad.n7
        L_0x0061:
            r3.setText(r6)
            android.widget.Toast r3 = new android.widget.Toast
            android.content.Context r6 = r5.getContext()
            r3.<init>(r6)
            r10.Z = r3
            r6 = 17
            r3.setGravity(r6, r2, r2)
            android.widget.Toast r3 = r10.Z
            androidx.appcompat.widget.AppCompatTextView r6 = r10.X
            r3.setView(r6)
            android.widget.Toast r3 = r10.Z
            r3.show()
        L_0x0080:
            if (r1 == 0) goto L_0x0094
            int r1 = defpackage.nad.e0
            r5.setImageResource(r1)
            boolean r1 = r11.x
            if (r1 == 0) goto L_0x008e
            int r1 = defpackage.nad.v1
            goto L_0x0090
        L_0x008e:
            int r1 = defpackage.nad.b1
        L_0x0090:
            r0.setImageResource(r1)
            goto L_0x00a5
        L_0x0094:
            r5.setBackgroundColor(r2)
            r1 = -1
            r5.setColorFilter(r1)
            int r1 = defpackage.nad.d0
            r5.setImageResource(r1)
            int r1 = defpackage.nad.G
            r0.setImageResource(r1)
        L_0x00a5:
            ffb r0 = r10.Y
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r0.o
            if (r0 == r7) goto L_0x00bb
        L_0x00ad:
            if (r7 == 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r2 = 8
        L_0x00b2:
            r5.setVisibility(r2)
            if (r7 == 0) goto L_0x00b8
            r4 = r10
        L_0x00b8:
            r5.setOnClickListener(r4)
        L_0x00bb:
            r10.Y = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfb.a(ffb):void");
    }

    public final void b(tk3 tk3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            tk3.accept((cfb) it.next());
        }
    }

    public final void c(int i) {
        int[] iArr = nf0.a;
        float[] fArr = new float[3];
        ThreadLocal threadLocal = w53.a;
        w53.a(Color.red(i), Color.green(i), Color.blue(i), fArr);
        int i2 = fArr[2] < 0.9f ? -1 : -16777216;
        ImageButton imageButton = this.y;
        imageButton.setColorFilter(i2);
        imageButton.setBackground(i8b.K(Integer.valueOf(i), (Integer) null, (Integer) null));
        this.z.setPreviewColor(i);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cfb) it.next()).b.f = i;
        }
        this.c.j(i, "app.editor.color");
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == lic.act_photo_editor__btn_undo) {
            b(new l3a(21));
        } else if (id == lic.act_photo_editor__btn_close) {
            b(new l3a(22));
        } else if (id == lic.act_photo_editor__btn_done) {
            b(new l3a(23));
        } else if (id == lic.act_photo_editor__btn_clear) {
            b(new l3a(24));
        } else if (id == lic.act_photo_editor__btn_line_width) {
            BrushWidthViewImpl brushWidthViewImpl = (BrushWidthViewImpl) this.z;
            brushWidthViewImpl.setVisibility(brushWidthViewImpl.getVisibility() == 0 ? 8 : 0);
        } else if (id == lic.act_photo_editor__btn_sticker) {
            b(new l3a(25));
        }
    }
}
