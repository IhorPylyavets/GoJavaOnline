package com.goit.gojavaonline.module_7.patterns.builder;

public class Account {

    private String userId;
    private String token;

    public Account() {
    }

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public static Builder newBuilder() {
        return new Account().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Builder setUserId(String userId) {
            Account.this.userId = userId;
            return this;
        }

        public Builder setToken(String token) {
            Account.this.token = token;
            return this;
        }

        public Account build() {
            return Account.this;
        }
    }
}
