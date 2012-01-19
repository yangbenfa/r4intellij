/*
 * Copyright 2011 Holger Brandl
 *
 * This code is licensed under BSD. For details see
 * http://www.opensource.org/licenses/bsd-license.php
 */

package com.r4intellij.rinstallcache;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;


/**
 * DOCUMENT ME!
 *
 * @author Holger Brandl
 */
public class Function implements Serializable {

    private final String funName;
    private final String funDesc;
    private String funSignature;


    public Function(@NotNull String funName, @NotNull String funDesc) {
        this.funName = funName;
        this.funDesc = funDesc;
    }

    public String getFunName() {
        return funName;
    }

    public String getFunDesc() {
        return funDesc;
    }

    public void setFunSignature(String funSignature) {
        this.funSignature = funSignature;
    }

    public String getFunSignature() {
        return funSignature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Function function = (Function) o;

        return funName.equals(function.funName);
    }

    @Override
    public int hashCode() {
        return funName.hashCode();
    }

    @Override
    public String toString() {
        return funName;
    }
}