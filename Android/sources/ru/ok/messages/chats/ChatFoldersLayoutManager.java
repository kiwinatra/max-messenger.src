package ru.ok.messages.chats;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/messages/chats/ChatFoldersLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class ChatFoldersLayoutManager extends LinearLayoutManager {
    public static final String E = Reflection.getOrCreateKotlinClass(ChatFoldersLayoutManager.class).getSimpleName();

    public final void H0(RecyclerView recyclerView, int i) {
        if (recyclerView != null && !recyclerView.isLayoutSuppressed()) {
            I0(new p27(recyclerView, i));
        }
    }

    public final boolean e() {
        return false;
    }

    public final void j0(hzc hzc, lzc lzc) {
        try {
            super.j0(hzc, lzc);
        } catch (Exception e) {
            z68.f(E, "onLayoutChildren: ", e);
        }
    }
}
