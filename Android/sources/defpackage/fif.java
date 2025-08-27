package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.GroupingKt;
import kotlin.collections.SetsKt;

/* renamed from: fif  reason: default package */
public abstract class fif {
    public static final Map a(Map map) {
        Set set;
        try {
            Result.Companion companion = Result.Companion;
            set = Result.m23constructorimpl(map.keySet());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            set = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Set emptySet = SetsKt.emptySet();
        if (Result.m29isFailureimpl(set)) {
            set = emptySet;
        }
        return GroupingKt.eachCount(new xga(8, (Iterable) set));
    }
}
