package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import ru.ok.messages.settings.folders.tutor.FolderTutorLayout;

/* renamed from: l56  reason: default package */
public final /* synthetic */ class l56 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ l56(m56 m56, int i) {
        this.a = i;
        this.b = m56;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                m56 m56 = this.b;
                return m56.e(MathKt.roundToInt(((float) 200) * ((FolderTutorLayout) m56.c).getContext().getResources().getDisplayMetrics().density), ((FolderTutorLayout) m56.c).getResources().getString(qad.k3));
            case 1:
                m56 m562 = this.b;
                return m562.e(MathKt.roundToInt(((float) 200) * ((FolderTutorLayout) m562.c).getContext().getResources().getDisplayMetrics().density), ((FolderTutorLayout) m562.c).getResources().getString(qad.G2));
            case 2:
                m56 m563 = this.b;
                return m563.e(MathKt.roundToInt(((float) 200) * ((FolderTutorLayout) m563.c).getContext().getResources().getDisplayMetrics().density), ((FolderTutorLayout) m563.c).getResources().getString(qad.J2));
            default:
                this.b.g(true);
                return Unit.INSTANCE;
        }
    }
}
