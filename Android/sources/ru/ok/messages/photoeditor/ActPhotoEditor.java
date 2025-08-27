package ru.ok.messages.photoeditor;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.ConstantsKt;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.photoeditor.view.EditorSurfaceViewContainer;

public class ActPhotoEditor extends m5 implements bfb, zg3 {
    public static final /* synthetic */ int E0 = 0;
    public q09 A0;
    public boolean B0;
    public d6a C0;
    public final Lazy D0 = LazyKt.lazy(new j6(1, this));
    public cfb z0;

    public final String E() {
        return "EDIT_IMAGE";
    }

    public final void G1(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("photo_editor:cancel_dialog")) {
            cfb cfb = this.z0;
            j05 j05 = cfb.b;
            n05 n05 = j05.a;
            List<g05> layers = n05.getLayers();
            for (int size = layers.size() - 1; size >= 0; size--) {
                g05 g05 = layers.get(size);
                if (!(g05 instanceof if0)) {
                    n05.a.remove(g05);
                    n05.invalidate();
                }
            }
            j05.b();
            ffb ffb = cfb.e;
            ffb.getClass();
            ffb ffb2 = new ffb(false, false, false, ffb.o, ffb.v, true, ffb.x);
            cfb.e = ffb2;
            cfb.a.a(ffb2);
            return;
        }
        setResult(0);
        finish();
    }

    public final scf K0() {
        if (this.A0 == null) {
            this.A0 = q09.f0;
        }
        return this.A0;
    }

    public final void T() {
        if (!this.z0.b.h) {
            setResult(0);
            finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("photo_editor:cancel_dialog", true);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", qad.l7);
        bundle2.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", qad.k7);
        bundle2.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", qad.m0);
        bundle2.putBundle("ru.ok.tamtam.extra.DATA", bundle);
        ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.L2(bundle2);
        confirmationDialog.Y2(v(), "ru.ok.messages.views.dialogs.ConfirmationDialog");
    }

    public final void U(cl4 cl4) {
        int i;
        h05 a = this.z0.b.a();
        if (a.a.isEmpty()) {
            a = null;
        }
        boolean z = true;
        boolean z2 = a != null && a.o;
        cfb cfb = this.z0;
        if (!this.B0 || z2) {
            z = false;
        }
        j05 j05 = cfb.b;
        Rect bounds = j05.a.getBounds();
        int i2 = 2000;
        if (bounds.width() > bounds.height()) {
            i = (int) ((((float) bounds.height()) / ((float) bounds.width())) * ((float) 2000));
        } else {
            i2 = (int) ((((float) bounds.width()) / ((float) bounds.height())) * ((float) 2000));
            i = 2000;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        n05 n05 = j05.a;
        Rect resultBounds = n05.getResultBounds();
        Canvas canvas = new Canvas(createBitmap);
        for (g05 next : n05.getLayers()) {
            if (next instanceof if0) {
                if (z) {
                    if0 if0 = (if0) next;
                    if0.getClass();
                    int width = canvas.getWidth();
                    int height = canvas.getHeight();
                    Drawable drawable = if0.a;
                    drawable.setBounds(0, 0, width, height);
                    drawable.draw(canvas);
                }
                canvas.scale(((float) i2) / ((float) resultBounds.width()), ((float) i) / ((float) resultBounds.height()));
                canvas.translate((float) (-resultBounds.left), (float) (-resultBounds.top));
            } else {
                next.draw(canvas);
            }
        }
        if (z2) {
            cud cud = ((qra) ((id3) this.x.b)).y().b;
            cud.getClass();
            createBitmap = o5a.Z((int) cud.r(PmsKey.f80minstickersize, (long) 432), (int) cud.r(PmsKey.f72maxstickersize, (long) ConstantsKt.MINIMUM_BLOCK_SIZE), createBitmap);
        }
        Intent intent = new Intent();
        File r = ((qra) ((id3) this.x.b)).p().r(UUID.randomUUID().toString() + ".png");
        try {
            o5a.c0(r.getPath(), createBitmap, 100, Bitmap.CompressFormat.PNG);
            intent.putExtra("photo_editor:result_uri", Uri.fromFile(r));
            intent.putExtra("photo_editor:editor_state", a);
            intent.putExtra("photo_editor:delayed_attrs", cl4);
            setResult(-1, intent);
            finish();
        } catch (Exception unused) {
            int i3 = qad.t1;
            Handler handler = hi7.j;
            hi7.b0(0, this, getString(i3));
            setResult(0);
            finish();
        }
    }

    public final void onBackPressed() {
        if (!this.z0.b.h) {
            super.onBackPressed();
        } else {
            T();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [g7a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v20, types: [g7a, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        g7a g7a;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        L(this.A0.M);
        setContentView(ujc.act_photo_editor);
        this.B0 = getIntent().getBooleanExtra("photo_editor:is_drawing", false);
        scf c = ((qra) ((id3) this.x.b)).I().c();
        n05 editorSurfaceView = ((EditorSurfaceViewContainer) findViewById(lic.act_photo_editor__editor)).getEditorSurfaceView();
        if (!this.B0) {
            editorSurfaceView.setBackgroundColor(this.A0.n);
        } else if (c.c) {
            editorSurfaceView.setBackgroundColor(c.n);
        } else {
            editorSurfaceView.setBackgroundColor(-1);
        }
        hfb hfb = new hfb(findViewById(lic.act_photo_editor__root), ((qra) ((id3) this.x.b)).y().c);
        Uri uri = (Uri) getIntent().getParcelableExtra("photo_editor:background_uri");
        if (uri != null) {
            ? obj = new Object();
            obj.b = uri;
            obj.c = null;
            obj.a = 0;
            g7a = obj;
        } else {
            g7a = new g7a(3);
        }
        int i = c.c ? nad.h : nad.i;
        Resources resources = getResources();
        ThreadLocal threadLocal = h4d.a;
        Drawable a = c4d.a(resources, i, (Resources.Theme) null);
        if (a != null) {
            ? obj2 = new Object();
            obj2.c = a;
            obj2.b = null;
            obj2.a = 0;
            zc4 zc4 = new zc4((Context) this, getResources(), ((qra) ((id3) this.x.b)).H(), g7a, (g7a) obj2);
            h05 h05 = getIntent().hasExtra("photo_editor:editor_state") ? (h05) getIntent().getParcelableExtra("photo_editor:editor_state") : null;
            boolean booleanExtra = getIntent().getBooleanExtra("photo_editor:start_from_draw_sticker", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("photo_editor:draw_sticker_enabled", false);
            j05 j05 = new j05(editorSurfaceView);
            Lazy lazy = this.D0;
            cfb cfb = r0;
            Lazy lazy2 = lazy;
            cfb cfb2 = new cfb(hfb, j05, this, zc4, h05, booleanExtra2, booleanExtra, ((Boolean) lazy.getValue()).booleanValue());
            this.z0 = cfb;
            int i2 = hfb.v0[6];
            hq hqVar = hfb.c;
            hfb.c(hqVar.g.getInt("app.editor.color", i2));
            hfb.b.getContext();
            int i3 = hqVar.g.getInt("app.editor.width", ro4.a(8.0f));
            if (i3 > 0) {
                float f = (float) i3;
                hfb.z.setBrushWidth(f);
                Iterator it = hfb.a.iterator();
                while (it.hasNext()) {
                    ((cfb) it.next()).b.g = f;
                }
                hqVar.j((int) f, "app.editor.width");
            }
            if (bundle2 != null) {
                cfb cfb3 = this.z0;
                cfb3.getClass();
                if (bundle2.containsKey("ru.ok.tamtam.extra.EDITOR_STATE")) {
                    cfb3.d.a(cfb3.b, (h05) bundle2.getParcelable("ru.ok.tamtam.extra.EDITOR_STATE"), true);
                }
                if (bundle2.containsKey("ru.ok.tamtam.extra.EDITOR_VIEW_STATE")) {
                    ffb ffb = (ffb) bundle2.getParcelable("ru.ok.tamtam.extra.EDITOR_VIEW_STATE");
                    cfb3.e = ffb;
                    cfb3.a.a(ffb);
                }
            }
            if (!((Boolean) lazy2.getValue()).booleanValue()) {
                ed6 v = v();
                ued ued = new ued(0, (Object) null, new h6(1, this));
                ad6 ad6 = (ad6) v.m.remove("ScheduledSendPickerDialogFragment:ru.ok.messages.photoeditor.ActPhotoEditor:result");
                if (ad6 != null) {
                    ad6.a.b(ad6.c);
                }
                v.g0("ScheduledSendPickerDialogFragment:ru.ok.messages.photoeditor.ActPhotoEditor:result", this, new uq(8, ued));
                return;
            }
            return;
        }
        throw new IllegalStateException("backgroundDrawable cannot be null");
    }

    public final void onDestroy() {
        super.onDestroy();
        jbd.c((ao1) this.z0.d.v);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        cfb cfb = this.z0;
        bundle.putParcelable("ru.ok.tamtam.extra.EDITOR_STATE", cfb.b.a());
        bundle.putParcelable("ru.ok.tamtam.extra.EDITOR_VIEW_STATE", cfb.e);
    }
}
