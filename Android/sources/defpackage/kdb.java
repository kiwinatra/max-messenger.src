package defpackage;

import android.app.Person;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: kdb  reason: default package */
public abstract class kdb {
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, ldb] */
    public static ldb a(Person person) {
        IconCompat iconCompat;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            iconCompat = v67.a(icon);
        } else {
            iconCompat = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean isBot = person.isBot();
        boolean isImportant = person.isImportant();
        ? obj = new Object();
        obj.a = name;
        obj.b = iconCompat;
        obj.c = uri;
        obj.d = key;
        obj.e = isBot;
        obj.f = isImportant;
        return obj;
    }

    public static Person b(ldb ldb) {
        Person.Builder name = new Person.Builder().setName(ldb.a);
        Icon icon = null;
        IconCompat iconCompat = ldb.b;
        if (iconCompat != null) {
            iconCompat.getClass();
            icon = v67.d(iconCompat, (Context) null);
        }
        return name.setIcon(icon).setUri(ldb.c).setKey(ldb.d).setBot(ldb.e).setImportant(ldb.f).build();
    }
}
