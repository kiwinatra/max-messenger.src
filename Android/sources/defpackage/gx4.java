package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gx4  reason: default package */
public final class gx4 {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public volatile vzg e;
    public final Object f;

    public gx4(File file) {
        this.a = file;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            this.b = parentFile;
            this.c = FilesKt.resolve(parentFile, file.getName() + ".tmp");
            this.d = FilesKt.resolve(parentFile, file.getName() + ".taken");
            this.e = ex4.g;
            this.f = new Object();
            return;
        }
        throw new IllegalStateException(("File " + file + " not in directory").toString());
    }

    public final void a(Collection collection) {
        List list;
        if (!collection.isEmpty()) {
            synchronized (this.f) {
                vzg vzg = this.e;
                if (!(vzg instanceof fx4) || collection != ((List) ((fx4) vzg).g.get())) {
                    vzg vzg2 = this.e;
                    if (vzg2 instanceof ex4) {
                        list = b();
                    } else if (vzg2 instanceof dx4) {
                        list = ((dx4) vzg2).g;
                    } else if (vzg2 instanceof fx4) {
                        list = CollectionsKt.emptyList();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    List j = v02.j(list, collection);
                    c(j);
                    this.e = new dx4(j);
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                this.b.mkdirs();
                this.d.renameTo(this.a);
                this.e = new dx4((List) collection);
            }
        }
    }

    public final List b() {
        File file = this.a;
        if (!file.exists()) {
            return CollectionsKt.emptyList();
        }
        try {
            JSONArray jSONArray = new JSONArray(FilesKt__FileReadWriteKt.readText$default(file, (Charset) null, 1, (Object) null));
            List createListBuilder = CollectionsKt.createListBuilder();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                createListBuilder.add(new ix4(jSONObject.getString("event"), jSONObject.getString("reason"), jSONObject.getInt(NewHtcHomeBadger.COUNT)));
            }
            return CollectionsKt.build(createListBuilder);
        } catch (JSONException unused) {
            Objects.toString(file);
            try {
                f6e.m(file);
            } catch (IOException unused2) {
                Objects.toString(file);
            }
            return CollectionsKt.emptyList();
        } catch (IOException unused3) {
            Objects.toString(file);
            return CollectionsKt.emptyList();
        }
    }

    public final void c(List list) {
        File file = this.c;
        File file2 = this.a;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ix4 ix4 = (ix4) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", (Object) ix4.a);
            jSONObject.put("reason", (Object) ix4.b);
            jSONObject.put(NewHtcHomeBadger.COUNT, ix4.c);
            jSONArray.put((Object) jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        try {
            f6e.y(this.b);
            FilesKt__FileReadWriteKt.writeText$default(file, jSONArray2, (Charset) null, 2, (Object) null);
            f6e.B(file, file2);
        } catch (IOException unused) {
            Objects.toString(file2);
            try {
                f6e.m(file2);
            } catch (IOException unused2) {
                Objects.toString(file2);
            }
        }
    }

    public final Collection d() {
        List list;
        vzg vzg = this.e;
        if ((vzg instanceof dx4) && ((dx4) vzg).g.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        if (vzg instanceof fx4) {
            return CollectionsKt.emptyList();
        }
        synchronized (this.f) {
            try {
                vzg vzg2 = this.e;
                if (vzg2 instanceof ex4) {
                    list = b();
                } else if (vzg2 instanceof dx4) {
                    list = ((dx4) vzg2).g;
                } else if (vzg2 instanceof fx4) {
                    Collection emptyList = CollectionsKt.emptyList();
                    return emptyList;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (!list.isEmpty()) {
                    this.a.renameTo(this.d);
                    this.e = new fx4(list);
                } else {
                    this.e = new dx4(CollectionsKt.emptyList());
                }
                Collection collection = list;
                return collection;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
