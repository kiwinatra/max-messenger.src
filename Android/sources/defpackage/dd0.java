package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import kotlin.jvm.functions.Function0;

/* renamed from: dd0  reason: default package */
public final /* synthetic */ class dd0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2b b;

    public /* synthetic */ dd0(k2b k2b, int i) {
        this.a = i;
        this.b = k2b;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(this.b.c().j);
                return paint;
            default:
                Paint paint2 = new Paint();
                this.b.getText().getClass();
                paint2.setColor(-1);
                paint2.setAntiAlias(true);
                paint2.setDither(true);
                paint2.setSubpixelText(true);
                paint2.setLinearText(true);
                paint2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 600, false));
                return paint2;
        }
    }
}
