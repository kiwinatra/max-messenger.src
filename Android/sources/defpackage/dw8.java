package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: dw8  reason: default package */
public final class dw8 extends go {
    public static final /* synthetic */ int c1 = 0;
    public final hy A0 = new hy(10, (Object) this);
    public RecyclerView B0;
    public bw8 C0;
    public cw8 D0;
    public HashMap E0;
    public rw8 F0;
    public HashMap G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public ImageButton K0;
    public Button L0;
    public ImageView M0;
    public View N0;
    public ImageView O0;
    public TextView P0;
    public TextView Q0;
    public String R0;
    public MediaControllerCompat S0;
    public final xv8 T0;
    public MediaDescriptionCompat U0;
    public wv8 V0;
    public Bitmap W0;
    public final ArrayList X = new ArrayList();
    public Uri X0;
    public final ArrayList Y = new ArrayList();
    public boolean Y0;
    public final ArrayList Z = new ArrayList();
    public Bitmap Z0;
    public int a1;
    public final boolean b1;
    public final ArrayList v0 = new ArrayList();
    public final sw8 w;
    public final Context w0;
    public final av8 x;
    public boolean x0;
    public kw8 y = kw8.c;
    public boolean y0;
    public rw8 z;
    public long z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dw8(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.view.ContextThemeWrapper r3 = defpackage.zw8.a(r3, r0)
            int r1 = defpackage.zw8.b(r3)
            r2.<init>(r3, r1)
            kw8 r3 = defpackage.kw8.c
            r2.y = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.X = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.Y = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.Z = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.v0 = r3
            hy r3 = new hy
            r1 = 10
            r3.<init>((int) r1, (java.lang.Object) r2)
            r2.A0 = r3
            android.content.Context r3 = r2.getContext()
            r2.w0 = r3
            sw8 r3 = defpackage.sw8.d(r3)
            r2.w = r3
            ow8 r3 = defpackage.sw8.d
            if (r3 != 0) goto L_0x0046
            goto L_0x004e
        L_0x0046:
            ow8 r3 = defpackage.sw8.c()
            r3.getClass()
            r0 = 1
        L_0x004e:
            r2.b1 = r0
            av8 r3 = new av8
            r0 = 4
            r3.<init>(r2, r0)
            r2.x = r3
            defpackage.sw8.b()
            ow8 r3 = defpackage.sw8.c()
            rw8 r3 = r3.f()
            r2.z = r3
            xv8 r3 = new xv8
            r3.<init>(r2)
            r2.T0 = r3
            r2.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dw8.<init>(android.content.Context):void");
    }

    public final void g(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            rw8 rw8 = (rw8) list.get(size);
            if (rw8.d() || !rw8.g || !rw8.h(this.y) || this.z == rw8) {
                list.remove(size);
            }
        }
    }

    public final void h() {
        MediaDescriptionCompat mediaDescriptionCompat = this.U0;
        Uri uri = null;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.U0;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.getIconUri();
        }
        wv8 wv8 = this.V0;
        Bitmap bitmap = wv8 == null ? this.W0 : wv8.a;
        Uri uri2 = wv8 == null ? this.X0 : wv8.b;
        if (bitmap != iconBitmap || (bitmap == null && !Objects.equals(uri2, uri))) {
            wv8 wv82 = this.V0;
            if (wv82 != null) {
                wv82.cancel(true);
            }
            wv8 wv83 = new wv8(this);
            this.V0 = wv83;
            wv83.execute(new Void[0]);
        }
    }

    public final void i() {
        MediaControllerCompat mediaControllerCompat = this.S0;
        xv8 xv8 = this.T0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(xv8);
            this.S0 = null;
        }
    }

    public final void j(kw8 kw8) {
        if (kw8 == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.y.equals(kw8)) {
            this.y = kw8;
            if (this.y0) {
                sw8 sw8 = this.w;
                av8 av8 = this.x;
                sw8.f(av8);
                sw8.a(kw8, av8, 1);
                m();
            }
        }
    }

    public final void k() {
        Context context = this.w0;
        int i = -1;
        int t = !context.getResources().getBoolean(idc.is_tablet) ? -1 : b0h.t(context);
        if (context.getResources().getBoolean(idc.is_tablet)) {
            i = -2;
        }
        getWindow().setLayout(t, i);
        this.W0 = null;
        this.X0 = null;
        h();
        l();
        n();
    }

    public final void l() {
        Bitmap bitmap;
        if ((this.F0 != null || this.H0) ? true : !this.x0) {
            this.J0 = true;
            return;
        }
        this.J0 = false;
        if (!this.z.g() || this.z.d()) {
            dismiss();
        }
        CharSequence charSequence = null;
        if (!this.Y0 || (((bitmap = this.Z0) != null && bitmap.isRecycled()) || this.Z0 == null)) {
            Bitmap bitmap2 = this.Z0;
            if (bitmap2 != null && bitmap2.isRecycled()) {
                Objects.toString(this.Z0);
            }
            this.O0.setVisibility(8);
            this.N0.setVisibility(8);
            this.M0.setImageBitmap((Bitmap) null);
        } else {
            this.O0.setVisibility(0);
            this.O0.setImageBitmap(this.Z0);
            this.O0.setBackgroundColor(this.a1);
            this.N0.setVisibility(0);
            Bitmap bitmap3 = this.Z0;
            RenderScript create = RenderScript.create(this.w0);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap3);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createTyped);
            Bitmap copy = bitmap3.copy(bitmap3.getConfig(), true);
            createTyped.copyTo(copy);
            createFromBitmap.destroy();
            createTyped.destroy();
            create2.destroy();
            create.destroy();
            this.M0.setImageBitmap(copy);
        }
        this.Y0 = false;
        this.Z0 = null;
        this.a1 = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.U0;
        CharSequence title = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getTitle();
        boolean z2 = !TextUtils.isEmpty(title);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.U0;
        if (mediaDescriptionCompat2 != null) {
            charSequence = mediaDescriptionCompat2.getSubtitle();
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(charSequence);
        if (z2) {
            this.P0.setText(title);
        } else {
            this.P0.setText(this.R0);
        }
        if (isEmpty) {
            this.Q0.setText(charSequence);
            this.Q0.setVisibility(0);
            return;
        }
        this.Q0.setVisibility(8);
    }

    public final void m() {
        ArrayList arrayList = this.X;
        arrayList.clear();
        ArrayList arrayList2 = this.Y;
        arrayList2.clear();
        ArrayList arrayList3 = this.Z;
        arrayList3.clear();
        arrayList.addAll(Collections.unmodifiableList(this.z.u));
        qw8 qw8 = this.z.a;
        qw8.getClass();
        sw8.b();
        for (rw8 rw8 : Collections.unmodifiableList(qw8.b)) {
            grg b = this.z.b(rw8);
            if (b != null) {
                if (b.z()) {
                    arrayList2.add(rw8);
                }
                fw8 fw8 = (fw8) b.b;
                if (fw8 != null && fw8.e) {
                    arrayList3.add(rw8);
                }
            }
        }
        g(arrayList2);
        g(arrayList3);
        cx4 cx4 = cx4.v;
        Collections.sort(arrayList, cx4);
        Collections.sort(arrayList2, cx4);
        Collections.sort(arrayList3, cx4);
        this.C0.H();
    }

    public final void n() {
        if (!this.y0) {
            return;
        }
        if (SystemClock.uptimeMillis() - this.z0 >= 300) {
            if ((this.F0 != null || this.H0) ? true : !this.x0) {
                this.I0 = true;
                return;
            }
            this.I0 = false;
            if (!this.z.g() || this.z.d()) {
                dismiss();
            }
            this.z0 = SystemClock.uptimeMillis();
            this.C0.G();
            return;
        }
        hy hyVar = this.A0;
        hyVar.removeMessages(1);
        hyVar.sendEmptyMessageAtTime(1, this.z0 + 300);
    }

    public final void o() {
        if (this.I0) {
            n();
        }
        if (this.J0) {
            l();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y0 = true;
        this.w.a(this.y, this.x, 1);
        m();
        boolean z2 = sw8.c;
        i();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(njc.mr_cast_dialog);
        Context context = this.w0;
        int i = zw8.a;
        getWindow().getDecorView().setBackgroundColor(fw3.a(context, zw8.i(context) ? qdc.mr_dynamic_dialog_background_light : qdc.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(ufc.mr_cast_close_button);
        this.K0 = imageButton;
        imageButton.setColorFilter(-1);
        this.K0.setOnClickListener(new vv8(this, 0));
        Button button = (Button) findViewById(ufc.mr_cast_stop_button);
        this.L0 = button;
        button.setTextColor(-1);
        this.L0.setOnClickListener(new vv8(this, 1));
        this.C0 = new bw8(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(ufc.mr_cast_list);
        this.B0 = recyclerView;
        recyclerView.setAdapter(this.C0);
        this.B0.setLayoutManager(new LinearLayoutManager());
        this.D0 = new cw8(0, this);
        this.E0 = new HashMap();
        this.G0 = new HashMap();
        this.M0 = (ImageView) findViewById(ufc.mr_cast_meta_background);
        this.N0 = findViewById(ufc.mr_cast_meta_black_scrim);
        this.O0 = (ImageView) findViewById(ufc.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(ufc.mr_cast_meta_title);
        this.P0 = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(ufc.mr_cast_meta_subtitle);
        this.Q0 = textView2;
        textView2.setTextColor(-1);
        this.R0 = context.getResources().getString(wlc.mr_cast_dialog_title_view_placeholder);
        this.x0 = true;
        k();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y0 = false;
        this.w.f(this.x);
        this.A0.removeCallbacksAndMessages((Object) null);
        i();
    }
}
