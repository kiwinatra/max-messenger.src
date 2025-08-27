package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: p69  reason: default package */
public final /* synthetic */ class p69 implements zu7 {
    public final /* synthetic */ r69 a;
    public final /* synthetic */ iu7 b;
    public final /* synthetic */ j79 c;

    public /* synthetic */ p69(r69 r69, iu7 iu7, j79 j79) {
        this.a = r69;
        this.b = iu7;
        this.c = j79;
    }

    public final void d(jv7 jv7, hu7 hu7) {
        r69 r69 = this.a;
        r69.getClass();
        hu7.Companion.getClass();
        int[] iArr = eu7.$EnumSwitchMapping$0;
        iu7 iu7 = this.b;
        int i = iArr[iu7.ordinal()];
        hu7 hu72 = i != 1 ? i != 2 ? i != 3 ? null : hu7.ON_RESUME : hu7.ON_START : hu7.ON_CREATE;
        Runnable runnable = r69.a;
        CopyOnWriteArrayList copyOnWriteArrayList = r69.b;
        j79 j79 = this.c;
        if (hu7 == hu72) {
            copyOnWriteArrayList.add(j79);
            runnable.run();
        } else if (hu7 == hu7.ON_DESTROY) {
            r69.b(j79);
        } else if (hu7 == fu7.a(iu7)) {
            copyOnWriteArrayList.remove(j79);
            runnable.run();
        }
    }
}
