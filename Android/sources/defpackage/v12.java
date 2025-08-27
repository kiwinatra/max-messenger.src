package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.members.list.MembersListWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: v12  reason: default package */
public final /* synthetic */ class v12 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ v12(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    public final Object invoke(Object obj) {
        Object obj2;
        boolean z = false;
        Function1 function1 = this.b;
        switch (this.a) {
            case 0:
                function1.invoke((CharSequence) obj);
                return Unit.INSTANCE;
            case 1:
                function1.invoke((String) obj);
                return Unit.INSTANCE;
            case 2:
                Integer num = (Integer) obj;
                num.intValue();
                KProperty[] kPropertyArr = MembersListWidget.B0;
                if (((z29) function1.invoke(num)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                Integer num2 = (Integer) obj;
                num2.intValue();
                KProperty[] kPropertyArr2 = MembersListWidget.B0;
                z29 z29 = (z29) function1.invoke(num2);
                if (z29 != null) {
                    z = z29.Y;
                }
                return Boolean.valueOf(z);
            case 4:
                KProperty[] kPropertyArr3 = ProfileChangeLinkScreen.Y;
                function1.invoke((View) obj);
                return Unit.INSTANCE;
            case 5:
                KProperty[] kPropertyArr4 = ProfileChangeLinkScreen.Y;
                function1.invoke((View) obj);
                return Unit.INSTANCE;
            default:
                View view = (View) obj;
                try {
                    Result.Companion companion = Result.Companion;
                    obj2 = Result.m23constructorimpl(function1.invoke(view));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m29isFailureimpl(obj2)) {
                    return null;
                }
                return obj2;
        }
    }

    public /* synthetic */ v12(RecyclerView recyclerView, jkb jkb) {
        this.a = 6;
        this.b = jkb;
    }
}
