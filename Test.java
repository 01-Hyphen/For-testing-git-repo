import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello");
    }
    public static Long generateAccountNumber() {
        String uuid = UUID.randomUUID().toString().replaceAll("[^0-9]", "");
        String accountNumberStr = uuid.substring(0, 10);
        return Long.parseLong(accountNumberStr);
    }
}