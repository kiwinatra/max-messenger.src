package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;

/* renamed from: w4  reason: default package */
public final class w4 {
    public static final /* synthetic */ int d = 0;
    public final u4 a;
    public final Lazy b;
    public final Lazy c;

    public w4(Context context, Lazy lazy, u4 u4Var) {
        this.a = u4Var;
        this.b = lazy;
        this.c = LazyKt.lazy(new v4(context, 0));
    }

    public final Account a() {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl((Account) ArraysKt.getOrNull((T[]) ((AccountManager) this.c.getValue()).getAccountsByType(this.a.a), 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj)) {
            obj = null;
        }
        return (Account) obj;
    }

    public final void b() {
        z68.c("w4", "removeAccount start", new Object[0]);
        Account a2 = a();
        if (a2 != null) {
            try {
                ((AccountManager) this.c.getValue()).removeAccountExplicitly(a2);
            } catch (Throwable th) {
                z68.f("w4", "removeAccountExplicitly failed!", th);
            }
        }
        z68.c("w4", "removeAccount finished!", new Object[0]);
    }
}
