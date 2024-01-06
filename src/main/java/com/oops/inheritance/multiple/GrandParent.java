package com.oops.inheritance.multiple;

interface GrandParent {
    String gpName = "Grand Parent";
}

interface Parent1 extends GrandParent {
    String p1Name = "Parent 1";
}

interface Parent2  extends GrandParent {
    String p2Name = "Parent 2";
}

class Child implements Parent1,Parent2 {
    public String child = "Child";
}