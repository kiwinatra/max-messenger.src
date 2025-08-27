package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import kotlin.Lazy;
import one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton;

/* renamed from: e4a  reason: default package */
public final class e4a extends q2 implements tz2, bif {
    public static final int w0 = ujc.layout_send_location;
    public Chip X;
    public Chip Y;
    public w58 Z;
    public final boolean o;
    public Group v;
    public final gm4 v0 = new gm4((Object) new y3a(1, (Object) this));
    public TextView w;
    public ImageButton x;
    public ChipGroup y;
    public OneMeTitleSubtitleButton z;

    public e4a(Context context, boolean z2) {
        super(context);
        this.o = z2;
    }

    public final void M() {
        this.v = (Group) ((View) this.c).findViewById(lic.layout_send_location__live_group);
        this.w = (TextView) ((View) this.c).findViewById(lic.layout_send_location__tv_pick_duration);
        this.x = (ImageButton) ((View) this.c).findViewById(lic.layout_send_location__cancel_button);
        this.y = (ChipGroup) ((View) this.c).findViewById(lic.layout_send_location__cp_duration);
        OneMeTitleSubtitleButton oneMeTitleSubtitleButton = (OneMeTitleSubtitleButton) ((View) this.c).findViewById(lic.layout_send_location__send_button);
        this.z = oneMeTitleSubtitleButton;
        int i = qad.I8;
        Context context = (Context) this.b;
        String string = context.getString(i);
        int i2 = qad.R8;
        oneMeTitleSubtitleButton.j(string, context.getString(i2));
        ((Chip) ((View) this.c).findViewById(lic.layout_send_location__duration_20m)).setText(j4b.v(zjc.tt_dates_minutes, (int) v58.c.a, context));
        ((Chip) ((View) this.c).findViewById(lic.layout_send_location__duration_1h)).setText(j4b.v(zjc.tt_dates_hours, (int) v58.o.a, context));
        ((Chip) ((View) this.c).findViewById(lic.layout_send_location__duration_3h)).setText(j4b.v(zjc.tt_dates_hours, (int) v58.v.a, context));
        Chip chip = (Chip) ((View) this.c).findViewById(lic.layout_send_location__duration_24h);
        this.Y = chip;
        chip.setText(j4b.v(zjc.tt_dates_hours, (int) v58.w.a, context));
        this.X = (Chip) ((View) this.c).findViewById(lic.layout_send_location__duration_no_limit);
        ct.G(this.z, 300, new c4a(this, 0));
        ct.G(this.x, 300, new c4a(this, 1));
        this.y.setOnCheckedChangeListener(this);
        c();
        ((View) this.c).setOnTouchListener(new d4a(0));
        if (!this.o) {
            i2 = qad.v8;
        }
        this.z.setTitle(context.getString(i2));
    }

    public final void Z(w58 w58) {
        this.Z = w58;
        int y2 = tr1.y(w58.d);
        if (y2 == 1) {
            this.v.setVisibility(8);
            this.z.setTitle(((Context) this.b).getString(this.o ? qad.R8 : qad.v8));
        } else if (y2 == 2) {
            this.v.setVisibility(0);
            this.z.setTitle((CharSequence) this.v0.get());
            int ordinal = w58.e.ordinal();
            if (ordinal == 0) {
                ChipGroup chipGroup = this.y;
                int i = lic.layout_send_location__duration_20m;
                g5b g5b = chipGroup.y;
                yg8 yg8 = (yg8) ((HashMap) g5b.c).get(Integer.valueOf(i));
                if (yg8 != null && g5b.f(yg8)) {
                    g5b.o();
                }
            } else if (ordinal == 1) {
                ChipGroup chipGroup2 = this.y;
                int i2 = lic.layout_send_location__duration_1h;
                g5b g5b2 = chipGroup2.y;
                yg8 yg82 = (yg8) ((HashMap) g5b2.c).get(Integer.valueOf(i2));
                if (yg82 != null && g5b2.f(yg82)) {
                    g5b2.o();
                }
            } else if (ordinal == 2) {
                ChipGroup chipGroup3 = this.y;
                int i3 = lic.layout_send_location__duration_3h;
                g5b g5b3 = chipGroup3.y;
                yg8 yg83 = (yg8) ((HashMap) g5b3.c).get(Integer.valueOf(i3));
                if (yg83 != null && g5b3.f(yg83)) {
                    g5b3.o();
                }
            } else if (ordinal == 3) {
                ChipGroup chipGroup4 = this.y;
                int i4 = lic.layout_send_location__duration_24h;
                g5b g5b4 = chipGroup4.y;
                yg8 yg84 = (yg8) ((HashMap) g5b4.c).get(Integer.valueOf(i4));
                if (yg84 != null && g5b4.f(yg84)) {
                    g5b4.o();
                }
            } else if (ordinal == 4) {
                ChipGroup chipGroup5 = this.y;
                int i5 = lic.layout_send_location__duration_no_limit;
                g5b g5b5 = chipGroup5.y;
                yg8 yg85 = (yg8) ((HashMap) g5b5.c).get(Integer.valueOf(i5));
                if (yg85 != null && g5b5.f(yg85)) {
                    g5b5.o();
                }
            }
            a0();
        }
        if (w58.i) {
            this.Y.setVisibility(8);
            this.X.setVisibility(0);
            return;
        }
        this.Y.setVisibility(0);
        this.X.setVisibility(8);
    }

    public final void a0() {
        int checkedChipId = this.y.getCheckedChipId();
        int i = lic.layout_send_location__duration_20m;
        Context context = (Context) this.b;
        this.z.setSubtitle(context.getString(qad.I8, new Object[]{checkedChipId == i ? j4b.v(zjc.tt_dates_minutes, (int) v58.c.a, context) : checkedChipId == lic.layout_send_location__duration_1h ? j4b.v(zjc.tt_dates_hours, (int) v58.o.a, context) : checkedChipId == lic.layout_send_location__duration_3h ? j4b.v(zjc.tt_dates_hours, (int) v58.v.a, context) : checkedChipId == lic.layout_send_location__duration_24h ? j4b.v(zjc.tt_dates_hours, (int) v58.w.a, context) : checkedChipId == lic.layout_send_location__duration_no_limit ? context.getString(qad.O3) : ""}));
    }

    public final void c() {
        View view = (View) this.c;
        if (view != null) {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf k0 = j4b.k0(context);
            this.w.setTextColor(k0.K);
            ChipGroup chipGroup = this.y;
            int childCount = chipGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = chipGroup.getChildAt(i);
                if (childAt instanceof Chip) {
                    Chip chip = (Chip) childAt;
                    chip.setTextColor(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{k0.n, k0.G}));
                    chip.setChipBackgroundColor(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{k0.l, k0.I}));
                }
            }
            this.x.setColorFilter(k0.K, PorterDuff.Mode.SRC_IN);
            this.x.setBackground(k0.d());
        }
    }
}
