package defpackage;

import java.util.List;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import one.me.messages.list.loader.MessageModel;

/* renamed from: ge8  reason: default package */
public final class ge8 implements he8, ie8 {
    public static final /* synthetic */ KProperty[] h;
    public final a32 a;
    public final gsb b;
    public final int c;
    public final ReadWriteProperty d;
    public final ReadWriteProperty e;
    public final ReadWriteProperty f;
    public final ReadWriteProperty g;

    static {
        Class<ge8> cls = ge8.class;
        h = new KProperty[]{rae.s(cls, "messageDb", "getMessageDb()Lru/ok/tamtam/messages/MessageDb;", 0), rae.s(cls, "messageModel", "getMessageModel()Lone/me/messages/list/loader/MessageModel;", 0), rae.s(cls, "senderContact", "getSenderContact()Lru/ok/tamtam/contacts/Contact;", 0), rae.s(cls, "messageModels", "getMessageModels()Ljava/util/List;", 0)};
    }

    public ge8(a32 a32, gsb gsb, int i) {
        this.a = a32;
        this.b = gsb;
        this.c = i;
        Delegates delegates = Delegates.INSTANCE;
        this.d = delegates.notNull();
        this.e = delegates.notNull();
        this.f = delegates.notNull();
        this.g = delegates.notNull();
    }

    public final ha9 a() {
        return (ha9) this.d.getValue(this, h[0]);
    }

    public final MessageModel b() {
        return (MessageModel) this.e.getValue(this, h[1]);
    }

    public final List c() {
        return (List) this.g.getValue(this, h[3]);
    }

    public final vk3 d() {
        return (vk3) this.f.getValue(this, h[2]);
    }
}
