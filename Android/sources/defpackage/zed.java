package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.utils.widgets.LongRoundedTitleSubtitleButton;

/* renamed from: zed  reason: default package */
public final class zed extends qf5 {
    public static final /* synthetic */ KProperty[] z;
    public final w28 c = c(oic.toolbar);
    public final w28 o = c(oic.date_time_picker);
    public final w28 v = c(oic.date_picker_divider);
    public final w28 w = c(oic.send_with_notification_checkbox);
    public final w28 x = c(oic.send_button);
    public final w28 y = c(oic.set_correct_time);

    static {
        Class<zed> cls = zed.class;
        z = new KProperty[]{wj6.p(cls, "toolbar", "getToolbar()Lcom/google/android/material/appbar/MaterialToolbar;", 0), wj6.p(cls, "dateTimePicker", "getDateTimePicker()Lru/ok/tamtam/messages/scheduled/DateTimePicker;", 0), wj6.p(cls, "datePickerDivider", "getDatePickerDivider()Landroid/view/View;", 0), wj6.p(cls, "notificationCheckbox", "getNotificationCheckbox()Landroidx/appcompat/widget/AppCompatCheckBox;", 0), wj6.p(cls, "sendButton", "getSendButton()Lru/ok/utils/widgets/LongRoundedTitleSubtitleButton;", 0), wj6.p(cls, "setCorrectTimeTextView", "getSetCorrectTimeTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0)};
    }

    public final void L0(scf scf) {
        KProperty[] kPropertyArr = z;
        ((View) this.v.getValue(this, kPropertyArr[2])).setBackgroundColor(scf.L);
        MaterialToolbar materialToolbar = (MaterialToolbar) this.c.getValue(this, kPropertyArr[0]);
        int i = scf.x;
        materialToolbar.setTitleTextColor(i);
        materialToolbar.setNavigationIconTint(i);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.w.getValue(this, kPropertyArr[3]);
        int i2 = scf.l;
        appCompatCheckBox.setHighlightColor(i2);
        appCompatCheckBox.setButtonTintList(ColorStateList.valueOf(i2));
        appCompatCheckBox.setTextColor(i);
        iq.f(scf, e(), MathKt.roundToInt(((float) 42) * vo4.c().getDisplayMetrics().density), 0, 0, 60);
        ((AppCompatTextView) this.y.getValue(this, kPropertyArr[5])).setTextColor(scf.z);
    }

    public final DateTimePicker d() {
        return (DateTimePicker) this.o.getValue(this, z[1]);
    }

    public final LongRoundedTitleSubtitleButton e() {
        return (LongRoundedTitleSubtitleButton) this.x.getValue(this, z[4]);
    }
}
