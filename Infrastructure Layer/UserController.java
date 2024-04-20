// UserController class
public class UserController {
    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public User getUser(String userId) {
        return userService.getUserById(userId);
    }
    // Other user related endpoints
}
