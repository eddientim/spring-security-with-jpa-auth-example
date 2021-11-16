package springsecurity.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class HomePageControllerTest {

    @Autowired
    HomePageController homePageController;

    @Test
    public void shouldReturnHomepageResponse() {

        String homepage = homePageController.homepage();

        assertEquals(homepage, "<h1>Homepage</h1>");
    }

    @Test
    public void shouldReturnUserResponse() {
        String adminUser = homePageController.adminUser();

        assertEquals(adminUser, "<h1>Welcome Admin User</h1>");
    }

    @Test
    public void shouldReturnAdminResponse() {
        String user = homePageController.userLogin();

        assertEquals(user, "<h1>Hello User</h1>");
    }
}
