package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: q40  reason: default package */
public final class q40 implements frd {
    public Object a;
    public Object b;
    public Object c;
    public Object o;
    public Object v;
    public Object w;

    public q40(Context context, p40 p40) {
        this.a = context;
        this.b = p40;
        this.c = q40.class.getName();
        this.o = new q3d(new o40(this, 0));
        this.v = LazyKt.lazy(new o40(this, 1));
    }

    public static void e(nd4 nd4, DataOutputStream dataOutputStream) {
        Set<Map.Entry> entrySet = nd4.b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static boolean i(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList k(int i, Context context) {
        int c2 = zhf.c(hdc.colorControlHighlight, context);
        int b2 = zhf.b(hdc.colorButtonNormal, context);
        int[] iArr = zhf.b;
        int[] iArr2 = zhf.d;
        int f = w53.f(c2, i);
        return new ColorStateList(new int[][]{iArr, iArr2, zhf.c, zhf.f}, new int[]{b2, f, w53.f(c2, i), i});
    }

    public static nz8 l(vob vob, tb7 tb7, nz8 nz8, ekf ekf) {
        jkf l0 = vob.l0();
        int x = vob.x();
        Object m = l0.q() ? null : l0.m(x);
        int b2 = (vob.k() || l0.q()) ? -1 : l0.f(x, ekf).b(v0g.S(vob.h()) - ekf.g());
        for (int i = 0; i < tb7.size(); i++) {
            nz8 nz82 = (nz8) tb7.get(i);
            if (r(nz82, m, vob.k(), vob.c0(), vob.I(), b2)) {
                return nz82;
            }
        }
        if (tb7.isEmpty() && nz8 != null) {
            if (r(nz8, m, vob.k(), vob.c0(), vob.I(), b2)) {
                return nz8;
            }
        }
        return null;
    }

    public static LayerDrawable o(a4d a4d, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable f = a4d.f(context, tfc.abc_star_black_48dp);
        Drawable f2 = a4d.f(context, tfc.abc_star_half_black_48dp);
        if ((f instanceof BitmapDrawable) && f.getIntrinsicWidth() == dimensionPixelSize && f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable2 = (BitmapDrawable) f;
            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f.draw(canvas);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        if ((f2 instanceof BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static boolean r(nz8 nz8, Object obj, boolean z, int i, int i2, int i3) {
        if (!nz8.a.equals(obj)) {
            return false;
        }
        int i4 = nz8.b;
        return (z && i4 == i && nz8.c == i2) || (!z && i4 == -1 && nz8.e == i3);
    }

    public static void w(Drawable drawable, int i) {
        drawable.mutate().setColorFilter(ho.c(i, ho.b));
    }

    public static aje y(q40 q40, Function2 function2) {
        String str = "job" + "-" + ((AtomicInteger) q40.w).getAndIncrement();
        aje v2 = ev0.v((d14) q40.a, (CoroutineContext) null, f14.b, function2, 1);
        hn7 hn7 = new hn7(str, v2);
        ((ConcurrentHashMap) q40.v).put(str, v2);
        ((n6e) q40.o).d(hn7);
        ((Function2) q40.b).invoke((String) q40.c, "Adding for queue job=" + str);
        return v2;
    }

    public void a(dqd dqd) {
        ((n6e) this.b).d(dqd);
    }

    public void b(fqd fqd) {
        boolean z = fqd instanceof dqd;
        Function0 function0 = (Function0) this.a;
        if (!z) {
            function0.invoke();
            return;
        }
        Object value = ((etc) this.w).a.getValue();
        pnb pnb = value instanceof pnb ? (pnb) value : null;
        if (pnb == null || ((dqd) fqd).c != pnb.b) {
            ((jna) ((rl) ((Lazy) this.v).getValue())).P((String) null, (String) null, (String) null, (a20) null, (String) null, (String) null, ((dqd) fqd).c, he0.PRESET_AVATAR);
            function0.invoke();
            return;
        }
        function0.invoke();
    }

    public etc c() {
        return (etc) this.w;
    }

    public void d(q7a q7a) {
        pnb pnb = new pnb(q7a.c, q7a.b, q7a.a);
        xme xme = (xme) this.o;
        xme.getClass();
        xme.m((Object) null, pnb);
    }

    public dtc f() {
        return (dtc) this.c;
    }

    public jhf g() {
        return new jhf(nlc.oneme_login_neuro_avatars_profile_title, nlc.oneme_login_neuro_avatars_profile_description, nlc.oneme_login_neuro_avatars_save_button);
    }

    public void h(cs csVar, nz8 nz8, jkf jkf) {
        if (nz8 != null) {
            if (jkf.b(nz8.a) != -1) {
                csVar.F(nz8, jkf);
                return;
            }
            jkf jkf2 = (jkf) ((wb7) this.c).get(nz8);
            if (jkf2 != null) {
                csVar.F(nz8, jkf2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object j(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.in7
            if (r0 == 0) goto L_0x0013
            r0 = r6
            in7 r0 = (defpackage.in7) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            in7 r0 = new in7
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.util.Iterator r5 = r0.b
            java.util.concurrent.ConcurrentHashMap r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0079
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.v
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            int r2 = r6.size()
            java.lang.String r4 = "Cancelling all jobs in queue="
            java.lang.String r2 = defpackage.wj6.h(r2, r4)
            java.lang.Object r4 = r5.b
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r5 = r5.c
            java.lang.String r5 = (java.lang.String) r5
            r4.invoke(r5, r2)
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0059:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            pm7 r2 = (defpackage.pm7) r2
            r4 = 0
            r2.b(r4)
            goto L_0x0059
        L_0x0070:
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r2 = r6
        L_0x0079:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0098
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            pm7 r6 = (defpackage.pm7) r6
            r0.a = r2
            r0.b = r5
            r0.v = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L_0x0079
            return r1
        L_0x0098:
            r2.clear()
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q40.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public ey0 m(String str) {
        return (ey0) ((HashMap) this.a).get(str);
    }

    public ey0 n(String str) {
        HashMap hashMap = (HashMap) this.a;
        ey0 ey0 = (ey0) hashMap.get(str);
        if (ey0 != null) {
            return ey0;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        ey0 ey02 = new ey0(keyAt, str, nd4.c);
        hashMap.put(str, ey02);
        sparseArray.put(keyAt, str);
        ((SparseBooleanArray) this.o).put(keyAt, true);
        ((gy0) this.v).q(ey02);
        return ey02;
    }

    public ColorStateList p(int i, Context context) {
        if (i == tfc.abc_edit_text_material) {
            return q8.j(wdc.abc_tint_edittext, context);
        }
        if (i == tfc.abc_switch_track_mtrl_alpha) {
            return q8.j(wdc.abc_tint_switch_track, context);
        }
        if (i == tfc.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d = zhf.d(hdc.colorSwitchThumbNormal, context);
            if (d == null || !d.isStateful()) {
                iArr[0] = zhf.b;
                iArr2[0] = zhf.b(hdc.colorSwitchThumbNormal, context);
                iArr[1] = zhf.e;
                iArr2[1] = zhf.c(hdc.colorControlActivated, context);
                iArr[2] = zhf.f;
                iArr2[2] = zhf.c(hdc.colorSwitchThumbNormal, context);
            } else {
                int[] iArr3 = zhf.b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = zhf.e;
                iArr2[1] = zhf.c(hdc.colorControlActivated, context);
                iArr[2] = zhf.f;
                iArr2[2] = d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == tfc.abc_btn_default_mtrl_shape) {
            return k(zhf.c(hdc.colorButtonNormal, context), context);
        } else {
            if (i == tfc.abc_btn_borderless_material) {
                return k(0, context);
            }
            if (i == tfc.abc_btn_colored_material) {
                return k(zhf.c(hdc.colorAccent, context), context);
            }
            if (i == tfc.abc_spinner_mtrl_am_alpha || i == tfc.abc_spinner_textfield_background_material) {
                return q8.j(wdc.abc_tint_spinner, context);
            }
            if (i(i, (int[]) this.b)) {
                return zhf.d(hdc.colorControlNormal, context);
            }
            if (i(i, (int[]) this.v)) {
                return q8.j(wdc.abc_tint_default, context);
            }
            if (i(i, (int[]) this.w)) {
                return q8.j(wdc.abc_tint_btn_checkable, context);
            }
            if (i == tfc.abc_seekbar_thumb_material) {
                return q8.j(wdc.abc_tint_seek_thumb, context);
            }
            return null;
        }
    }

    public void q(long j) {
        gy0 gy0;
        gy0 gy02 = (gy0) this.v;
        gy02.j(j);
        gy0 gy03 = (gy0) this.w;
        if (gy03 != null) {
            gy03.j(j);
        }
        boolean e = gy02.e();
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap hashMap = (HashMap) this.a;
        if (e || (gy0 = (gy0) this.w) == null || !gy0.e()) {
            gy02.l(hashMap, sparseArray);
        } else {
            ((gy0) this.w).l(hashMap, sparseArray);
            gy02.b(hashMap);
        }
        gy0 gy04 = (gy0) this.w;
        if (gy04 != null) {
            gy04.n();
            this.w = null;
        }
    }

    public void s(String str) {
        HashMap hashMap = (HashMap) this.a;
        ey0 ey0 = (ey0) hashMap.get(str);
        if (ey0 != null && ey0.c.isEmpty() && ey0.d.isEmpty()) {
            hashMap.remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.o;
            int i = ey0.a;
            boolean z = sparseBooleanArray.get(i);
            ((gy0) this.v).p(ey0, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
                return;
            }
            sparseArray.put(i, (Object) null);
            ((SparseBooleanArray) this.c).put(i, true);
        }
    }

    public void t(int i) {
        String str = (String) this.c;
        z68.c(str, "On audio focus change, %d", Integer.valueOf(i));
        p40 p40 = (p40) this.b;
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    z68.c(str, "onAudioFocusChange: AUDIOFOCUS_LOSS", new Object[0]);
                    if (p40.a() && p40.b() > c44.DEFAULT_ASPECT_RATIO) {
                        z68.c(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS. Stop", new Object[0]);
                        p40.pause();
                    }
                } else if (i == 1) {
                    if (!p40.a()) {
                        z68.c(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_GAIN. Resuming player", new Object[0]);
                        p40.play();
                    }
                    float b2 = p40.b();
                    if (b2 > c44.DEFAULT_ASPECT_RATIO && b2 < 1.0f) {
                        z68.c(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_GAIN. Volume up", new Object[0]);
                        p40.g(1.0f);
                    }
                }
            } else if (p40.a() && p40.b() > c44.DEFAULT_ASPECT_RATIO) {
                z68.c(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS_TRANSIENT. Pausing current player", new Object[0]);
                p40.pause();
            }
        } else if (p40.a() && p40.b() > c44.DEFAULT_ASPECT_RATIO) {
            z68.c(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK. Setting volume to 0.2", new Object[0]);
            p40.g(0.2f);
        }
    }

    public void u() {
        AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.w;
        if (audioFocusRequest != null) {
            this.w = null;
            z68.c((String) this.c, "Release audio focus", new Object[0]);
            q3d q3d = (q3d) this.o;
            if (q3d.isInitialized()) {
                ((Context) this.a).unregisterReceiver((BroadcastReceiver) q3d.getValue());
                q3d.a();
            }
            ((AudioManager) ((Lazy) this.v).getValue()).abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public void v(int i) {
        p40 p40 = (p40) this.b;
        if (p40.b() > c44.DEFAULT_ASPECT_RATIO && p40.a()) {
            q3d q3d = (q3d) this.o;
            boolean isInitialized = q3d.isInitialized();
            Context context = (Context) this.a;
            if (isInitialized) {
                context.unregisterReceiver((BroadcastReceiver) q3d.getValue());
                q3d.a();
            }
            context.registerReceiver((BroadcastReceiver) q3d.getValue(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            AudioFocusRequest build = new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(p40).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(i).build()).build();
            this.w = build;
            z68.c((String) this.c, "Request audio focus", new Object[0]);
            ((AudioManager) ((Lazy) this.v).getValue()).requestAudioFocus(build);
        }
    }

    public void x() {
        ((gy0) this.v).i((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.o).clear();
    }

    public void z(jkf jkf) {
        cs a2 = wb7.a();
        if (((tb7) this.b).isEmpty()) {
            h(a2, (nz8) this.v, jkf);
            if (!cjf.n((nz8) this.w, (nz8) this.v)) {
                h(a2, (nz8) this.w, jkf);
            }
            if (!cjf.n((nz8) this.o, (nz8) this.v) && !cjf.n((nz8) this.o, (nz8) this.w)) {
                h(a2, (nz8) this.o, jkf);
            }
        } else {
            for (int i = 0; i < ((tb7) this.b).size(); i++) {
                h(a2, (nz8) ((tb7) this.b).get(i), jkf);
            }
            if (!((tb7) this.b).contains((nz8) this.o)) {
                h(a2, (nz8) this.o, jkf);
            }
        }
        this.c = a2.h();
    }

    public q40() {
        this.a = new int[]{tfc.abc_textfield_search_default_mtrl_alpha, tfc.abc_textfield_default_mtrl_alpha, tfc.abc_ab_share_pack_mtrl_alpha};
        this.b = new int[]{tfc.abc_ic_commit_search_api_mtrl_alpha, tfc.abc_seekbar_tick_mark_material, tfc.abc_ic_menu_share_mtrl_alpha, tfc.abc_ic_menu_copy_mtrl_am_alpha, tfc.abc_ic_menu_cut_mtrl_alpha, tfc.abc_ic_menu_selectall_mtrl_alpha, tfc.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{tfc.abc_textfield_activated_mtrl_alpha, tfc.abc_textfield_search_activated_mtrl_alpha, tfc.abc_cab_background_top_mtrl_alpha, tfc.abc_text_cursor_material, tfc.abc_text_select_handle_left_mtrl, tfc.abc_text_select_handle_middle_mtrl, tfc.abc_text_select_handle_right_mtrl};
        this.o = new int[]{tfc.abc_popup_background_mtrl_mult, tfc.abc_cab_background_internal_bg, tfc.abc_menu_hardkey_panel_mtrl_mult};
        this.v = new int[]{tfc.abc_tab_indicator_material, tfc.abc_textfield_search_material};
        this.w = new int[]{tfc.abc_btn_check_material, tfc.abc_btn_radio_material, tfc.abc_btn_check_material_anim, tfc.abc_btn_radio_material_anim};
    }
}
