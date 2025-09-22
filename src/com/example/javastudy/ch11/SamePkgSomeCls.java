package com.example.javastudy.ch11;

public class SamePkgSomeCls {
    public void useParent() {
        Parent p = new Parent();
        p.publicVariable = 10;
        p.protectedVariable = 10;
        p.packageVariable = 20;
        // The field Parent.privVar is not visible
        // p.privateVariable = 10;
    }
}
