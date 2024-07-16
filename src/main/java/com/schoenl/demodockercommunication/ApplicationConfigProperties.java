package com.schoenl.demodockercommunication;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("xyz")
public record ApplicationConfigProperties(String a, String b, String c, String d) {
}
