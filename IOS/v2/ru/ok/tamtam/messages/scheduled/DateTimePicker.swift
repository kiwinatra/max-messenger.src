package ru.ok.tamtam.messages.scheduled;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ok/tamtam/messages/scheduled/DateTimePicker;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lwcf;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lk84;", "listener", "", "setListener$scheduled_send_picker_dialog_release", "(Lk84;)V", "setListener", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDateTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimePicker.kt\nru/ok/tamtam/messages/scheduled/DateTimePicker\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n*L\n1#1,148:1\n92#2:149\n60#2:150\n105#2:151\n92#2:152\n60#2:153\n105#2:154\n49#3,2:155\n45#3:157\n*S KotlinDebug\n*F\n+ 1 DateTimePicker.kt\nru/ok/tamtam/messages/scheduled/DateTimePicker\n*L\n32#1:149\n32#1:150\n32#1:151\n44#1:152\n44#1:153\n44#1:154\n93#1:155,2\n93#1:157\n*E\n"})
public final class DateTimePicker extends ConstraintLayout implements wcf {
    public final RecyclerView E0;
    public final RecyclerView F0;
    public final RecyclerView G0;
    public final View H0 = findViewById(oic.top_line);
    public final View I0 = findViewById(oic.bottom_line);
    public final TextView J0 = ((TextView) findViewById(oic.time_divider));
    public k84 K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public final int O0;

    @JvmOverloads
    public DateTimePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        scf scf;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(aec.date_picker_today_margin_top);
        this.O0 = dimensionPixelSize;
        View.inflate(context, jjc.date_time_picker, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(oic.days_recycler_view);
        this.E0 = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(oic.hours_recycler_view);
        this.F0 = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) findViewById(oic.minutes_recycler_view);
        this.G0 = recyclerView3;
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(aec.date_picker_item_height);
        jj0 jj0 = new jj0((j4b) w63.G);
        jj0.C(true);
        recyclerView.setAdapter(jj0);
        recyclerView.setHasFixedSize(true);
        recyclerView.j(new w51(dimensionPixelSize, 2));
        recyclerView.setLayoutManager(new SliderLayoutManager(context, new ba(26, this, jj0)));
        recyclerView.setEdgeEffectFactory(new s6b(dimensionPixelSize2));
        gjf gjf = new gjf();
        recyclerView2.setAdapter(gjf);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setItemAnimator((yyc) null);
        recyclerView2.j(new w51(dimensionPixelSize, 2));
        recyclerView2.setLayoutManager(new SliderLayoutManager(context, new h84(this, gjf, 0)));
        recyclerView2.setEdgeEffectFactory(new s6b(dimensionPixelSize2));
        gjf gjf2 = new gjf();
        recyclerView3.setAdapter(gjf2);
        recyclerView3.setItemAnimator((yyc) null);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.j(new w51(dimensionPixelSize, 2));
        recyclerView3.setLayoutManager(new SliderLayoutManager(context, new h84(this, gjf2, 1)));
        recyclerView3.setEdgeEffectFactory(new s6b(dimensionPixelSize2));
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context2);
        }
        L0(scf);
    }

    /* access modifiers changed from: private */
    public static final void setDays$lambda$7$lambda$6(DateTimePicker dateTimePicker) {
        dateTimePicker.L0 = false;
    }

    /* access modifiers changed from: private */
    public static final void setHours$lambda$9$lambda$8(DateTimePicker dateTimePicker) {
        dateTimePicker.M0 = false;
    }

    /* access modifiers changed from: private */
    public static final void setMinutes$lambda$11$lambda$10(DateTimePicker dateTimePicker) {
        dateTimePicker.N0 = false;
    }

    public final void L0(scf scf) {
        setBackgroundColor(scf.n);
        View view = this.H0;
        int i = scf.l;
        view.setBackgroundColor(i);
        this.I0.setBackgroundColor(i);
        this.J0.setTextColor(scf.G);
    }

    public final void setListener$scheduled_send_picker_dialog_release(k84 k84) {
        this.K0 = k84;
    }
}
