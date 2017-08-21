/**
 *
 */
package com.mybatis3.domain;


import lombok.Data;

/**
 * @author Siva
 */

@Data
public class PhoneNumber {
    private String countryCode;
    private String stateCode;
    private String number;

    public PhoneNumber() {

    }

    public PhoneNumber(String countryCode, String stateCode, String number) {
        super();
        this.countryCode = countryCode;
        this.stateCode = stateCode;
        this.number = number;
    }

    public PhoneNumber(String string) {
        if (string != null) {
            String[] parts = string.split("-");
            if (parts.length > 0) this.countryCode = parts[0];
            if (parts.length > 1) this.stateCode = parts[1];
            if (parts.length > 2) this.number = parts[2];

        }
    }

}
