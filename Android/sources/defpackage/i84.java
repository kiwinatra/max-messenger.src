package defpackage;

import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.SliderLayoutManager;

/* renamed from: i84  reason: default package */
public final /* synthetic */ class i84 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DateTimePicker b;
    public final /* synthetic */ int c;

    public /* synthetic */ i84(DateTimePicker dateTimePicker, int i, int i2) {
        this.a = i2;
        this.b = dateTimePicker;
        this.c = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                DateTimePicker dateTimePicker = this.b;
                ((SliderLayoutManager) dateTimePicker.E0.getLayoutManager()).m1(this.c, dateTimePicker.O0);
                dateTimePicker.E0.post(new j84(dateTimePicker, 0));
                return;
            case 1:
                DateTimePicker dateTimePicker2 = this.b;
                ((SliderLayoutManager) dateTimePicker2.G0.getLayoutManager()).m1(this.c, dateTimePicker2.O0);
                dateTimePicker2.G0.post(new j84(dateTimePicker2, 2));
                return;
            default:
                DateTimePicker dateTimePicker3 = this.b;
                ((SliderLayoutManager) dateTimePicker3.F0.getLayoutManager()).m1(this.c, dateTimePicker3.O0);
                dateTimePicker3.F0.post(new j84(dateTimePicker3, 1));
                return;
        }
    }
}
