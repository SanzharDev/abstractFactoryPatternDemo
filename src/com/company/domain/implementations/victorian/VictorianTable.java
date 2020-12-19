package com.company.domain.implementations.victorian;

import com.company.domain.interfaces.Table;

public class VictorianTable implements Table {

    private boolean hasLegs = true;

    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }

    @Override
    public boolean hasLegs() {
        return hasLegs;
    }
}
