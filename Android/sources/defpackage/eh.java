package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: eh  reason: default package */
public enum eh {
    INTERPOLATOR("interpolator"),
    DURATION("duration"),
    VALUE_FROM("valueFrom"),
    VALUE_TO("valueTo"),
    VALUE_TYPE("valueType"),
    PROPERTY_NAME("propertyName"),
    PROPERTY_X_NAME("propertyXName"),
    PROPERTY_Y_NAME("propertyYName"),
    PATH_DATA("pathData"),
    START_OFFSET("startOffset"),
    REPEAT_COUNT("repeatCount"),
    REPEAT_MODE("repeatMode");
    
    public final String a;

    static {
        eh[] ehVarArr;
        x0 = EnumEntriesKt.enumEntries((E[]) ehVarArr);
    }

    /* access modifiers changed from: public */
    eh(String str) {
        this.a = str;
    }
}
