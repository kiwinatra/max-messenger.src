package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* renamed from: k9  reason: default package */
public abstract class k9 {
    public static void a(View view, k2b k2b) {
        Object[] spans;
        Sequence sequence;
        if (view instanceof phf) {
            ((phf) view).onThemeChanged(k2b);
            return;
        }
        Set<Number> set = null;
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            int itemDecorationCount = recyclerView.getItemDecorationCount();
            boolean z = false;
            for (int i = 0; i < itemDecorationCount; i++) {
                zyc Y = recyclerView.Y(i);
                phf phf = Y instanceof phf ? (phf) Y : null;
                if (phf != null) {
                    phf.onThemeChanged(k2b);
                    z = true;
                }
            }
            if (z) {
                recyclerView.a0();
            }
            Class<hzc> cls = hzc.class;
            try {
                Result.Companion companion = Result.Companion;
                Field declaredField = RecyclerView.class.getDeclaredField("c");
                declaredField.setAccessible(true);
                hzc hzc = (hzc) declaredField.get(recyclerView);
                Field declaredField2 = cls.getDeclaredField("a");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(hzc);
                List list = obj instanceof List ? (List) obj : null;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                Field declaredField3 = cls.getDeclaredField("c");
                declaredField3.setAccessible(true);
                Object obj2 = declaredField3.get(hzc);
                List list2 = obj2 instanceof List ? (List) obj2 : null;
                if (list2 == null) {
                    list2 = CollectionsKt.emptyList();
                }
                tyc adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    IntRange until = RangesKt.until(0, adapter.j());
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = until.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(Integer.valueOf(adapter.l(((IntIterator) it).nextInt())));
                    }
                    set = linkedHashSet;
                }
                if (set == null) {
                    set = SetsKt.emptySet();
                }
                ArrayList arrayList = new ArrayList();
                for (Number intValue : set) {
                    int intValue2 = intValue.intValue();
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, SequencesKt.generateSequence(recyclerView.getRecycledViewPool().getRecycledView(intValue2), new j9(recyclerView, intValue2, 0)));
                }
                sequence = Result.m23constructorimpl(SequencesKt.map(SequencesKt___SequencesKt.plus(SequencesKt.flattenSequenceOfIterable(SequencesKt.sequenceOf(list, list2)), arrayList), new h9(1)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                sequence = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
            Sequence emptySequence = SequencesKt.emptySequence();
            if (Result.m29isFailureimpl(sequence)) {
                sequence = emptySequence;
            }
            h9 h9Var = new h9(0);
            i9 i9Var = new i9(k2b, 0);
            veg veg = veg.a;
            SequencesKt.count(SequencesKt.onEach(SequencesKt___SequencesKt.flatMap((Sequence) sequence, new ued(h9Var, i9Var)), new i9(k2b, 1)));
        } else if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null && (spans = spanned.getSpans(0, textView.getText().length(), Object.class)) != null) {
                for (Object obj3 : spans) {
                    phf phf2 = obj3 instanceof phf ? (phf) obj3 : null;
                    if (phf2 != null) {
                        phf2.onThemeChanged(k2b);
                    }
                }
            }
        }
    }
}
