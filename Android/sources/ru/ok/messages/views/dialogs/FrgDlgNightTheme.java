package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/messages/views/dialogs/FrgDlgNightTheme;", "Lru/ok/messages/views/dialogs/FrgDlgChecked;", "Lrh6;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFrgDlgNightTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrgDlgNightTheme.kt\nru/ok/messages/views/dialogs/FrgDlgNightTheme\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,50:1\n774#2:51\n865#2,2:52\n1557#2:54\n1628#2,3:55\n37#3,2:58\n*S KotlinDebug\n*F\n+ 1 FrgDlgNightTheme.kt\nru/ok/messages/views/dialogs/FrgDlgNightTheme\n*L\n24#1:51\n24#1:52,2\n26#1:54\n26#1:55,3\n32#1:58,2\n*E\n"})
public final class FrgDlgNightTheme extends FrgDlgChecked<rh6> {
    public final Dialog V2(Bundle bundle) {
        List mutableListOf = CollectionsKt.mutableListOf(l9a.f0, hu6.f0);
        ArrayList d = ((qra) ((id3) this.E1.b)).I().d();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((scf) next).c) {
                arrayList.add(next);
            }
        }
        mutableListOf.addAll(arrayList);
        Iterable<scf> iterable = mutableListOf;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (scf s : iterable) {
            arrayList2.add(fqc.s(s, G2()));
        }
        cg8 q = new cg8(G2()).q(S1(qad.j9));
        q.h((CharSequence[]) arrayList2.toArray(new String[0]), new w13(this, mutableListOf, 5));
        return q.create();
    }

    public final Class c3() {
        return rh6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgNightTheme";
    }
}
