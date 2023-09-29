//package com.example.college.intergrationTests;
//
//import net.bytebuddy.utility.dispatcher.JavaDispatcher;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//public class integrationTests {
//
//    @JavaDispatcher.Container
//    public static PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>("postgres:latest")
//            .withDatabaseName("mytestdb")
//            .withUsername("testuser")
//            .withPassword("testpassword");
//
//    @BeforeAll
//    public static void startContainers() {
//        postgreSQLContainer.start();
//    }
//
//    @AfterAll
//    public static void stopContainers() {
//        postgreSQLContainer.stop();
//    }
//
//    @Test
//    public void testSomething() {
//        // Your test logic here
//    }
//
//}
