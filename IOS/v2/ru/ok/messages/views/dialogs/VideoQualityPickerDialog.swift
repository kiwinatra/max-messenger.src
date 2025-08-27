package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/dialogs/VideoQualityPickerDialog;", "Lru/ok/messages/views/dialogs/FrgDlgBase;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVideoQualityPickerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoQualityPickerDialog.kt\nru/ok/messages/views/dialogs/VideoQualityPickerDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,148:1\n360#2,7:149\n1557#2:158\n1628#2,3:159\n54#3:156\n45#3:157\n37#4,2:162\n*S KotlinDebug\n*F\n+ 1 VideoQualityPickerDialog.kt\nru/ok/messages/views/dialogs/VideoQualityPickerDialog\n*L\n31#1:149,7\n38#1:158\n38#1:159,3\n35#1:156\n35#1:157\n71#1:162,2\n*E\n"})
public final class VideoQualityPickerDialog extends FrgDlgBase {
    public static final VideoQualityPickerDialog b3(ArrayList arrayList, qac qac, boolean z) {
        VideoQualityPickerDialog videoQualityPickerDialog = new VideoQualityPickerDialog();
        CollectionsKt.sortWith(arrayList, rac.g);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new uac((rac) it.next()));
        }
        videoQualityPickerDialog.L2(o54.f(TuplesKt.to("ru.ok.tamtam.extra.QUALITIES", arrayList2), TuplesKt.to("ru.ok.tamtam.extra.CURRENT_QUALITY", qac), TuplesKt.to("ru.ok.tamtam.extra.SHOW_SIZE", Boolean.valueOf(z))));
        return videoQualityPickerDialog;
    }

    public final Dialog V2(Bundle bundle) {
        int i;
        boolean z = true;
        ArrayList<uac> parcelableArrayList = F2().getParcelableArrayList("ru.ok.tamtam.extra.QUALITIES");
        boolean z2 = F2().getBoolean("ru.ok.tamtam.extra.SHOW_SIZE");
        qac qac = (qac) F2().getSerializable("ru.ok.tamtam.extra.CURRENT_QUALITY");
        if (qac != null) {
            Iterator it = parcelableArrayList.iterator();
            i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((uac) it.next()).a.a == qac) {
                    break;
                } else {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        Context G2 = G2();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(G2);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parcelableArrayList, 10));
        for (uac uac : parcelableArrayList) {
            rac rac = uac.a;
            boolean z3 = rac.f;
            SpannableStringBuilder append = new SpannableStringBuilder().append(rac.a.a);
            if (z2) {
                String x = ghf.x(rac.e, z, (Context) null);
                append.append(' ').append(z3 ? a81.m("– ", x) : a81.m("~ ", x), new ForegroundColorSpan(k0.N), 34);
            }
            if (z3) {
                append.append(' ').append(a81.m("– ", S1(qad.r6)), new ForegroundColorSpan(k0.N), 17);
            }
            arrayList.add(append);
            z = true;
        }
        cg8 q = new cg8(G2()).q(S1(qad.va));
        q.p((CharSequence[]) arrayList.toArray(new SpannableStringBuilder[0]), i, new w13(this, parcelableArrayList, 10));
        q.m(S1(qad.m0), new d10(19, (Object) this));
        return q.g();
    }

    public final void c3(y7g y7g) {
        z68.c("ru.ok.messages.views.dialogs.VideoQualityPickerDialog", "set fragment result " + y7g, new Object[0]);
        Q1().f0("VideoQualityPickerDialog:result:request", o54.f(TuplesKt.to("VideoQualityPickerDialog:result:key", y7g)));
        T2(false, false);
    }
}
