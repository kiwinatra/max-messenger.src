package ru.ok.messages.views;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.a;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.views.widgets.AvatarCropView;

public class ActAvatarCrop extends m5 implements td0 {
    public static final /* synthetic */ int I0 = 0;
    public ImageView A0;
    public ImageView B0;
    public ImageView C0;
    public OneMeButton D0;
    public ImageView E0;
    public Point F0;
    public final Matrix G0 = new Matrix();
    public boolean H0 = false;
    public AvatarCropView z0;

    public static void T(a aVar, Uri uri, String str, boolean z, boolean z2, boolean z3) {
        if (aVar.M1() != null) {
            Intent intent = new Intent(aVar.M1(), ActAvatarCrop.class);
            intent.putExtra("ru.ok.tamtam.extra.URI", uri);
            intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", str);
            intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", z);
            if (z2) {
                intent.addFlags(65536);
                intent.putExtra("ru.ok.tamtam.extra.NO_ANIM ", true);
            }
            intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", z3);
            aVar.S2(intent, 666, (Bundle) null);
        }
    }

    public final String E() {
        return "AVATAR_CROP";
    }

    public final void J() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        js9 js9 = fu4.k;
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(1280);
            window.clearFlags(67108864);
            window.setStatusBarColor(getColor(udc.transparent));
            window.setNavigationBarColor(js9.e(this).f().c().a.i);
        }
        setContentView(ujc.act_avatar_crop);
        Uri uri = (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI");
        findViewById(lic.bottom_background).setBackgroundColor(js9.e(this).f().c().a.i);
        js9.e(this).f().getIcon().getClass();
        ColorStateList valueOf = ColorStateList.valueOf(-1);
        ImageView imageView = (ImageView) findViewById(lic.rotate);
        this.A0 = imageView;
        imageView.setImageTintList(valueOf);
        this.A0.setOnClickListener(new g5(this, 0));
        ImageView imageView2 = (ImageView) findViewById(lic.flip_horizontally);
        this.B0 = imageView2;
        imageView2.setImageTintList(valueOf);
        this.B0.setOnClickListener(new g5(this, 1));
        ImageView imageView3 = (ImageView) findViewById(lic.close);
        this.C0 = imageView3;
        imageView3.setImageTintList(valueOf);
        this.C0.setOnClickListener(new g5(this, 2));
        OneMeButton oneMeButton = (OneMeButton) findViewById(lic.reset);
        this.D0 = oneMeButton;
        oneMeButton.setText(qmc.f5oneme_avatar_rop_reset);
        this.D0.setSize(aqa.a);
        this.D0.setMode(zpa.o);
        this.D0.setAppearance(xpa.v);
        this.D0.setOnClickListener(new g5(this, 3));
        ImageView imageView4 = (ImageView) findViewById(lic.done);
        this.E0 = imageView4;
        imageView4.setImageTintList(valueOf);
        this.E0.setOnClickListener(new g5(this, 4));
        this.z0 = (AvatarCropView) findViewById(lic.crop);
        if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false)) {
            this.z0.setMode(1);
            hn4.j(this, l5b.c);
        } else {
            this.z0.setMode(0);
        }
        this.z0.setZoomEnabled(true);
        AvatarCropView avatarCropView = this.z0;
        tp6 tp6 = new tp6(getResources());
        tp6.l = ydd.p;
        tp6.b = 0;
        avatarCropView.setHierarchy(tp6.a());
        knb a = ld9.p.get();
        a.c(uri);
        a.h = new j5(0, this);
        this.z0.setController(a.a());
        this.z0.setTransformChangeListener(this);
    }

    public final void onResume() {
        super.onResume();
        z5a w = ((qra) ((id3) this.x.b)).w();
        jgd jgd = jgd.AVATAR_PICKER_CROP;
        h8b h8b = h8b.e;
        w.f(jgd, h8b.e);
    }
}
