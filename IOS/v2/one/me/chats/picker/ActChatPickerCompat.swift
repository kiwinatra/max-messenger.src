package one.me.chats.picker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/chats/picker/ActChatPickerCompat;", "Lhn;", "<init>", "()V", "te8", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nActChatPickerCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActChatPickerCompat.kt\none/me/chats/picker/ActChatPickerCompat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StringExt.kt\nru/ok/tamtam/shared/StringExtKt\n*L\n1#1,210:1\n1863#2,2:211\n4#3:213\n*S KotlinDebug\n*F\n+ 1 ActChatPickerCompat.kt\none/me/chats/picker/ActChatPickerCompat\n*L\n97#1:211,2\n133#1:213\n*E\n"})
public final class ActChatPickerCompat extends hn {
    public static final int y = View.generateViewId();
    public final Lazy x = cs2.a.getAccessor().h(gaf.class);

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        hz4.a(this);
        getWindow().clearFlags(1024);
        v5 v5Var = new v5(this);
        oz1 a = kv0.a(v5Var.getContext());
        int i = y;
        a.setId(i);
        wz3 wz3 = new wz3(-1, -1);
        wz3.b(new AppBarLayout.ScrollingViewBehavior());
        Unit unit = Unit.INSTANCE;
        v5Var.addView(a, wz3);
        v5Var.onThemeChanged(fu4.k.e(this).f());
        setContentView((View) v5Var);
        super.onCreate(bundle);
        e9d e = cvg.e(this, (ViewGroup) findViewById(i), bundle);
        e.Q(true);
        e.e = 3;
        if (!e.n()) {
            Intent intent = getIntent();
            if (intent == null || (bundle2 = intent.getExtras()) == null) {
                bundle2 = new Bundle();
            }
            e.R(iq.n(new PickerChatController(bundle2), (ey3) null, (ey3) null));
        }
        e.a(new w5(0, this));
    }
}
