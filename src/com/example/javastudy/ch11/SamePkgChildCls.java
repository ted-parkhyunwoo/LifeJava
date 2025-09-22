package com.example.javastudy.ch11;

public class SamePkgChildCls extends Parent {
    public void useMember() {
        this.publicVariable = 10;
        this.protectedVariable = 10;
        this.packageVariable = 10;
        // The field Parent.privVar is not visible
        // this.privateVariable = 10;
    }
}
