package com.example.javastudy.ch11.sub;

import com.example.javastudy.ch11.Parent;

public class OtherPkgChildCls extends Parent {
    public void useMember() {
        this.publicVariable = 10;
        this.protectedVariable = 10;
        // this.packageVariable = 10;
        // The field Parent.privVar is not visible
        // this.privateVariable = 10;
    }
}
