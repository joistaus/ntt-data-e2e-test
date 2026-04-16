package com.nttdata.e2e.testdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nttdata.e2e.screenplay.model.BuyerInfo;
import com.nttdata.e2e.screenplay.model.User;

import java.io.IOException;
import java.io.InputStream;

public class TestDataLoader {

    private static final String TEST_DATA_FILE = "testdata/testdata.json";
    private static TestData cached = null;

    public static TestData load() {
        if (cached == null) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                InputStream is = TestDataLoader.class.getClassLoader()
                        .getResourceAsStream(TEST_DATA_FILE);
                if (is == null) {
                    throw new RuntimeException("Test data file not found: " + TEST_DATA_FILE);
                }
                cached = mapper.readValue(is, TestData.class);
            } catch (IOException e) {
                throw new RuntimeException("Failed to load test data from: " + TEST_DATA_FILE, e);
            }
        }
        return cached;
    }

    public static class TestData {

        private User user;
        private BuyerInfo buyerInfo;

        public TestData() {}

        public User getUser() { return user; }
        public void setUser(User user) { this.user = user; }

        public BuyerInfo getBuyerInfo() { return buyerInfo; }
        public void setBuyerInfo(BuyerInfo buyerInfo) { this.buyerInfo = buyerInfo; }
    }
}
