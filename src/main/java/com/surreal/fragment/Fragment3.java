package com.surreal.fragment;

import org.springframework.stereotype.Component;

@Component
public class Fragment3 {
    
    private final String narrative = "Fragment 3 of the distributed narrative";
    
    public String getNarrative() {
        return narrative;
    }
}