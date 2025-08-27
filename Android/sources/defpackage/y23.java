package defpackage;

import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.collections.MapsKt;

/* renamed from: y23  reason: default package */
public final /* synthetic */ class y23 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ y23(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    public final void accept(Object obj, Object obj2) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                if (str.startsWith("app.pin") && (obj2 instanceof String)) {
                    this.b.put(str, (String) obj2);
                    return;
                }
                return;
            default:
                fr3 fr3 = (fr3) obj2;
                fr3.getClass();
                Map createMapBuilder = MapsKt.createMapBuilder();
                createMapBuilder.put("firstName", fr3.a);
                String str2 = fr3.b;
                if (!(str2 == null || str2.length() == 0)) {
                    createMapBuilder.put("lastName", str2);
                }
                this.b.put(str, MapsKt.build(createMapBuilder));
                return;
        }
    }
}
