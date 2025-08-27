package defpackage;

import android.view.View;
import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: sw6  reason: default package */
public interface sw6 {
    int a();

    void e(View view) {
        Boolean bool;
        try {
            Result.Companion companion = Result.Companion;
            bool = Result.m23constructorimpl(Boolean.valueOf(b0h.K(view, this)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            bool = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool2 = Boolean.FALSE;
        if (Result.m29isFailureimpl(bool)) {
            bool = bool2;
        }
        ((Boolean) bool).getClass();
    }
}
