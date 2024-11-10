package com.test.ocr;

import com.test.api.Ocr;

import java.util.ServiceLoader;

public class Application {
    public static void main(String[] args) {
        ServiceLoader<Ocr> providers = ServiceLoader.load(Ocr.class);
        for (Ocr provider : providers) {
            System.out.println(provider.ocr());
        }
    }
}
