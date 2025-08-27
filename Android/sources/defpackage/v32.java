package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function2;

/* renamed from: v32  reason: default package */
public final /* synthetic */ class v32 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ lz7 c;
    public final /* synthetic */ Object o;

    public /* synthetic */ v32(Function2 function2, lz7 lz7, Object obj, int i) {
        this.a = i;
        this.b = function2;
        this.c = lz7;
        this.o = obj;
    }

    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke((c29) this.c, ((w32) this.o).a);
                return true;
            case 1:
                this.b.invoke((i29) this.c, ((w32) this.o).a);
                return true;
            case 2:
                this.b.invoke((l29) this.c, ((w32) this.o).a);
                return true;
            case 3:
                this.b.invoke((pp2) this.c, (i42) this.o);
                return true;
            case 4:
                this.b.invoke(Long.valueOf(((xk2) this.c).a), ((zr2) this.o).a);
                return true;
            case 5:
                this.b.invoke((bs3) this.c, (ol3) this.o);
                return true;
            case 6:
                this.b.invoke(Long.valueOf(((rg5) this.c).a), ((pg5) this.o).a);
                return true;
            case 7:
                this.b.invoke(Long.valueOf(((rg5) this.c).a), ((tg5) this.o).a);
                return true;
            default:
                this.b.invoke((ns6) this.c, (i42) this.o);
                return true;
        }
    }
}
