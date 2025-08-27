package ru.ok.tamtam.contacts;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/contacts/MissedContactsException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class MissedContactsException extends IllegalStateException {
    public final Collection a;

    public MissedContactsException(Throwable th, ArrayList arrayList) {
        super(a81.m("missed contacts ", CollectionsKt___CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)), th);
    }
}
