package com.rjdeleon.daggertutorial.di.custom;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Scope
@Retention(RetentionPolicy.CLASS)
public @interface RandomUserApplicationScope {
}