package defpackage;

import android.text.SpannableString;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ly6  reason: default package */
public final class ly6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ my6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ly6(String str, CharSequence charSequence, my6 my6, Continuation continuation) {
        super(2, continuation);
        this.a = str;
        this.b = charSequence;
        this.c = my6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ly6(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ly6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = this.a;
        int length = str.length();
        CharSequence charSequence = this.b;
        if (length == 0) {
            return charSequence;
        }
        ArrayList arrayListOf = CollectionsKt.arrayListOf(str);
        if (!(!((qra) ym.e()).B().d(charSequence.toString(), arrayListOf).isEmpty())) {
            return charSequence;
        }
        int i = this.c.a.c().l;
        String obj2 = charSequence.toString();
        tld B = ((qra) ym.e()).B();
        int i2 = fhf.a;
        List d = B.d(obj2.replaceAll("[\\n\\r]", " ").replaceAll("\\s{2,}", " "), arrayListOf);
        if (cvg.A(charSequence)) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(charSequence);
        i8b.E(charSequence, d, i, 0, new y3a(27, (Object) spannableString));
        return spannableString;
    }
}
