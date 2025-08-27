package com.my.tracker.personalize;

import java.util.ArrayList;
import java.util.List;

public final class PersonalizeOffer {
    public final int id;
    public final List<PersonalizeItem> items;

    public PersonalizeOffer(int i, ArrayList arrayList) {
        this.id = i;
        this.items = arrayList;
    }
}
