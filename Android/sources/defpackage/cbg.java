package defpackage;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.InvocationTargetException;

/* renamed from: cbg  reason: default package */
public final class cbg extends ebg {
    public static cbg c;
    public static final o9a d = new o9a(21);
    public final Application b;

    public cbg(Application application) {
        this.b = application;
    }

    public static yag d(Class cls, Application application) {
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return hi7.j(cls);
        }
        try {
            return (yag) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    public final yag a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public final yag b(Class cls, zy9 zy9) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) zy9.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return hi7.j(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }
}
